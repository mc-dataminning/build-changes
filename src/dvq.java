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

public class dvq {
   private static final Codec<duz<dsl>> h = duz.a(dfi.q, dsl.b, duz.d.d, dfk.a.o());
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

   public static dvb a(aqm $$0, ceg $$1, dbn $$2, tx $$3) {
      dbn $$4 = new dbn($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dve $$5 = $$3.b("UpgradeData", 10) ? new dve($$3.p("UpgradeData"), $$0) : dve.a;
      boolean $$6 = $$3.q("isLightOn");
      ud $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      dus[] $$9 = new dus[$$8];
      boolean $$10 = $$0.D_().g();
      dul $$11 = $$0.l();
      eny $$12 = $$11.p();
      jw<ddg> $$13 = $$0.H_().d(lr.aE);
      Codec<dva<jj<ddg>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         tx $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            duz<dsl> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (duz<dsl>)h.parse(ul.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvq.a::new);
            } else {
               $$20 = new duz<>(dfi.q, dfk.a.o(), duz.d.d);
            }

            dva<jj<ddg>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dva<jj<ddg>>)$$14.parse(ul.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvq.a::new);
            } else {
               $$22 = new duz<>($$13.u(), $$13.g(ddn.b), duz.d.e);
            }

            dus $$24 = new dus($$20, $$22);
            $$9[$$19] = $$24;
            kc $$25 = kc.a($$2, $$18);
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
               $$12.a(dcp.b, kc.a($$2, $$18), new dum($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dcp.a, kc.a($$2, $$18), new dum($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dvm $$29 = a($$3);
      dzj $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dzj)dzj.e.parse(new Dynamic(ul.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      duh $$34;
      if ($$29 == dvm.b) {
         ext<dfi> $$32 = ext.a($$3.c("block_ticks", 10), $$0x -> lq.e.b(akk.a($$0x)), $$2);
         ext<eoi> $$33 = ext.a($$3.c("fluid_ticks", 10), $$0x -> lq.c.b(akk.a($$0x)), $$2);
         $$34 = new dur($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         exw<dfi> $$35 = exw.a($$3.c("block_ticks", 10), $$0x -> lq.e.b(akk.a($$0x)), $$2);
         exw<eoi> $$36 = exw.a($$3.c("fluid_ticks", 10), $$0x -> lq.c.b(akk.a($$0x)), $$2);
         dvb $$37 = new dvb($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dxu.a.parse(new Dynamic(ul.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dvi $$39 = dvi.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.a(dvi.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      tx $$40 = $$3.p("Heightmaps");
      EnumSet<dyg.a> $$41 = EnumSet.noneOf(dyg.a.class);

      for (dyg.a $$42 : $$34.j().e()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dyg.a($$34, $$41);
      tx $$44 = $$3.p("structures");
      $$34.a(a(ejn.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ud $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ud $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dvm.b) {
         return new duq((dur)$$34, false);
      } else {
         dvb $$49 = (dvb)$$34;
         ud $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ud $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            tx $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         tx $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dyc.a $$57 = dyc.a.valueOf($$56);
            $$49.a($$57, new dug($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dbn $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dva<jj<ddg>>> a(jw<ddg> $$0) {
      return duz.b($$0.u(), $$0.s(), duz.d.e, $$0.g(ddn.b));
   }

   public static tx a(aqm $$0, duh $$1) {
      dbn $$2 = $$1.f();
      tx $$3 = um.e(new tx());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lq.l.b($$1.j()).toString());
      dzj $$4 = $$1.t();
      if ($$4 != null) {
         dzj.e.encodeStart(ul.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dxu $$5 = $$1.x();
      if ($$5 != null) {
         dxu.a.encodeStart(ul.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dve $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dus[] $$7 = $$1.d();
      ud $$8 = new ud();
      eny $$9 = $$0.l().a();
      jw<ddg> $$10 = $$0.H_().d(lr.aE);
      Codec<dva<jj<ddg>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dum $$16 = $$9.a(dcp.b).a(kc.a($$2, $$13));
         dum $$17 = $$9.a(dcp.a).a(kc.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            tx $$18 = new tx();
            if ($$15) {
               dus $$19 = $$7[$$14];
               $$18.a("block_states", (uu)h.encodeStart(ul.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (uu)$$11.encodeStart(ul.a, $$19.i()).getOrThrow());
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

      ud $$20 = new ud();

      for (ja $$21 : $$1.c()) {
         tx $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().d() == dvm.a) {
         dvb $$23 = (dvb)$$1;
         ud $$24 = new ud();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         tx $$25 = new tx();

         for (dyc.a $$26 : dyc.a.values()) {
            dug $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      tx $$28 = new tx();

      for (Entry<dyg.a, dyg> $$29 : $$1.e()) {
         if ($$1.j().e().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new ue($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ejn.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aqm $$0, tx $$1, duh.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lq.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lq.c.b($$0x).toString()));
   }

   public static dvm a(@Nullable tx $$0) {
      return $$0 != null ? dvi.a($$0.l("Status")).d() : dvm.a;
   }

   @Nullable
   private static dur.c a(aqm $$0, tx $$1) {
      ud $$2 = a($$1, "entities");
      ud $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsn.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               tx $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ja $$7 = dpq.b($$5);
                  dpq $$8 = dpq.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ud a(tx $$0, String $$1) {
      ud $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static tx a(ejn $$0, dbn $$1, Map<eix, ejf> $$2, Map<eix, LongSet> $$3) {
      tx $$4 = new tx();
      tx $$5 = new tx();
      jw<eix> $$6 = $$0.b().d(lr.aQ);

      for (Entry<eix, ejf> $$7 : $$2.entrySet()) {
         akk $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tx $$9 = new tx();

      for (Entry<eix, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akk $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ue($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eix, ejf> a(ejn $$0, tx $$1, long $$2) {
      Map<eix, ejf> $$3 = Maps.newHashMap();
      jw<eix> $$4 = $$0.b().d(lr.aQ);
      tx $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akk $$7 = akk.a($$6);
         eix $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            ejf $$9 = ejf.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eix, LongSet> a(jx $$0, dbn $$1, tx $$2) {
      Map<eix, LongSet> $$3 = Maps.newHashMap();
      jw<eix> $$4 = $$0.d(lr.aQ);
      tx $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akk $$7 = akk.a($$6);
         eix $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dbn $$3x = new dbn($$2x);
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

   public static ud a(ShortList[] $$0) {
      ud $$1 = new ud();

      for (ShortList $$2 : $$0) {
         ud $$3 = new ud();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(up.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends ui {
      public a(String $$0) {
         super($$0);
      }
   }
}
