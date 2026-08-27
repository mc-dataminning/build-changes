import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duf {
   private static final Codec<dtr<drd>> h = dtr.a(dea.q, drd.b, dtr.d.d, dec.a.n());
   private static final Logger i = LogUtils.getLogger();
   private static final String j = "UpgradeData";
   private static final String k = "block_ticks";
   private static final String l = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   public static dtt a(aqn $$0, cdu $$1, dag $$2, ud $$3) {
      dag $$4 = new dag($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dtw $$5 = $$3.b("UpgradeData", 10) ? new dtw($$3.p("UpgradeData"), $$0) : dtw.a;
      boolean $$6 = $$3.q("isLightOn");
      uj $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      dtk[] $$9 = new dtk[$$8];
      boolean $$10 = $$0.D_().g();
      dtd $$11 = $$0.l();
      eml $$12 = $$11.p();
      jk<dby> $$13 = $$0.H_().d(lf.az);
      Codec<dts<ix<dby>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ud $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dtr<drd> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dtr<drd>)h.parse(ur.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(duf.a::new);
            } else {
               $$20 = new dtr<>(dea.q, dec.a.n(), dtr.d.d);
            }

            dts<ix<dby>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dts<ix<dby>>)$$14.parse(ur.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(duf.a::new);
            } else {
               $$22 = new dtr<>($$13.t(), $$13.g(dcf.b), dtr.d.e);
            }

            dtk $$24 = new dtk($$20, $$22);
            $$9[$$19] = $$24;
            jq $$25 = jq.a($$2, $$18);
            $$1.a($$25, $$24);
         }

         boolean $$26 = $$17.b("BlockLight", 7);
         boolean $$27 = $$10 && $$17.b("SkyLight", 7);
         if ($$26 || $$27) {
            if (!$$15) {
               $$12.b($$2, true);
               $$15 = true;
            }

            if ($$26) {
               $$12.a(dbi.b, jq.a($$2, $$18), new dte($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dbi.a, jq.a($$2, $$18), new dte($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dua $$29 = a($$3);
      dxy $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dxy)dxy.e.parse(new Dynamic(ur.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dsz $$34;
      if ($$29 == dua.b) {
         evy<dea> $$32 = evy.a($$3.c("block_ticks", 10), $$0x -> le.e.b(akn.a($$0x)), $$2);
         evy<emv> $$33 = evy.a($$3.c("fluid_ticks", 10), $$0x -> le.c.b(akn.a($$0x)), $$2);
         $$34 = new dtj($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         ewb<dea> $$35 = ewb.a($$3.c("block_ticks", 10), $$0x -> le.e.b(akn.a($$0x)), $$2);
         ewb<emv> $$36 = ewb.a($$3.c("fluid_ticks", 10), $$0x -> le.c.b(akn.a($$0x)), $$2);
         dtt $$37 = new dtt($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dwj.a.parse(new Dynamic(ur.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dty $$39 = dty.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dty.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ud $$40 = $$3.p("Heightmaps");
      EnumSet<dwv.a> $$41 = EnumSet.noneOf(dwv.a.class);

      for (dwv.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dwv.a($$34, $$41);
      ud $$44 = $$3.p("structures");
      $$34.a(a(eib.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      uj $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         uj $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dua.b) {
         return new dti((dtj)$$34, false);
      } else {
         dtt $$49 = (dtt)$$34;
         uj $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         uj $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            ud $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         ud $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dwr.a $$57 = dwr.a.valueOf($$56);
            $$49.a($$57, new dsy($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dag $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dts<ix<dby>>> a(jk<dby> $$0) {
      return dtr.b($$0.t(), $$0.r(), dtr.d.e, $$0.g(dcf.b));
   }

   public static ud a(aqn $$0, dsz $$1) {
      dag $$2 = $$1.f();
      ud $$3 = us.e(new ud());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Y());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", le.n.b($$1.j()).toString());
      dxy $$4 = $$1.t();
      if ($$4 != null) {
         dxy.e.encodeStart(ur.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dwj $$5 = $$1.x();
      if ($$5 != null) {
         dwj.a.encodeStart(ur.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dtw $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dtk[] $$7 = $$1.d();
      uj $$8 = new uj();
      eml $$9 = $$0.l().a();
      jk<dby> $$10 = $$0.H_().d(lf.az);
      Codec<dts<ix<dby>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dte $$16 = $$9.a(dbi.b).a(jq.a($$2, $$13));
         dte $$17 = $$9.a(dbi.a).a(jq.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ud $$18 = new ud();
            if ($$15) {
               dtk $$19 = $$7[$$14];
               $$18.a("block_states", (va)h.encodeStart(ur.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (va)$$11.encodeStart(ur.a, $$19.i()).getOrThrow());
            }

            if ($$16 != null && !$$16.d()) {
               $$18.a("BlockLight", $$16.a());
            }

            if ($$17 != null && !$$17.d()) {
               $$18.a("SkyLight", $$17.a());
            }

            if (!$$18.g()) {
               $$18.a("Y", (byte)$$13);
               $$8.add($$18);
            }
         }
      }

      $$3.a("sections", $$8);
      if ($$12) {
         $$3.a("isLightOn", true);
      }

      uj $$20 = new uj();

      for (io $$21 : $$1.c()) {
         ud $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dua.a) {
         dtt $$23 = (dtt)$$1;
         uj $$24 = new uj();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ud $$25 = new ud();

         for (dwr.a $$26 : dwr.a.values()) {
            dsy $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ud $$28 = new ud();

      for (Entry<dwv.a, dwv> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uk($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eib.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aqn $$0, ud $$1, dsz.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> le.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> le.c.b($$0x).toString()));
   }

   public static dua a(@Nullable ud $$0) {
      return $$0 != null ? dty.a($$0.l("Status")).g() : dua.a;
   }

   @Nullable
   private static dtj.c a(aqn $$0, ud $$1) {
      uj $$2 = a($$1, "entities");
      uj $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsc.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ud $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  io $$7 = doi.b($$5);
                  doi $$8 = doi.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static uj a(ud $$0, String $$1) {
      uj $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ud a(eib $$0, dag $$1, Map<ehl, eht> $$2, Map<ehl, LongSet> $$3) {
      ud $$4 = new ud();
      ud $$5 = new ud();
      jk<ehl> $$6 = $$0.b().d(lf.aJ);

      for (Entry<ehl, eht> $$7 : $$2.entrySet()) {
         akn $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ud $$9 = new ud();

      for (Entry<ehl, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akn $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uk($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<ehl, eht> a(eib $$0, ud $$1, long $$2) {
      Map<ehl, eht> $$3 = Maps.newHashMap();
      jk<ehl> $$4 = $$0.b().d(lf.aJ);
      ud $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akn $$7 = akn.a($$6);
         ehl $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            eht $$9 = eht.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<ehl, LongSet> a(jl $$0, dag $$1, ud $$2) {
      Map<ehl, LongSet> $$3 = Maps.newHashMap();
      jk<ehl> $$4 = $$0.d(lf.aJ);
      ud $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akn $$7 = akn.a($$6);
         ehl $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dag $$3x = new dag($$2x);
                  if ($$3x.a($$1) > 8) {
                     i.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }

      return $$3;
   }

   public static uj a(ShortList[] $$0) {
      uj $$1 = new uj();

      for (ShortList $$2 : $$0) {
         uj $$3 = new uj();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(uv.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends RuntimeException {
      public a(String $$0) {
         super($$0);
      }
   }
}
