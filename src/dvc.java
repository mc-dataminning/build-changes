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

public class dvc {
   private static final Codec<duo<dsa>> h = duo.a(dex.q, dsa.b, duo.d.d, dez.a.o());
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

   public static duq a(are $$0, cer $$1, dbd $$2, ur $$3) {
      dbd $$4 = new dbd($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dut $$5 = $$3.b("UpgradeData", 10) ? new dut($$3.p("UpgradeData"), $$0) : dut.a;
      boolean $$6 = $$3.q("isLightOn");
      ux $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      duh[] $$9 = new duh[$$8];
      boolean $$10 = $$0.D_().g();
      dua $$11 = $$0.l();
      eni $$12 = $$11.p();
      jv<dcv> $$13 = $$0.H_().d(lq.az);
      Codec<dup<ji<dcv>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ur $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            duo<dsa> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (duo<dsa>)h.parse(vf.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvc.a::new);
            } else {
               $$20 = new duo<>(dex.q, dez.a.o(), duo.d.d);
            }

            dup<ji<dcv>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dup<ji<dcv>>)$$14.parse(vf.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvc.a::new);
            } else {
               $$22 = new duo<>($$13.t(), $$13.g(ddc.b), duo.d.e);
            }

            duh $$24 = new duh($$20, $$22);
            $$9[$$19] = $$24;
            kb $$25 = kb.a($$2, $$18);
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
               $$12.a(dcf.b, kb.a($$2, $$18), new dub($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dcf.a, kb.a($$2, $$18), new dub($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dux $$29 = a($$3);
      dyv $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dyv)dyv.e.parse(new Dynamic(vf.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dtw $$34;
      if ($$29 == dux.b) {
         exb<dex> $$32 = exb.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(ale.a($$0x)), $$2);
         exb<ens> $$33 = exb.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(ale.a($$0x)), $$2);
         $$34 = new dug($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         exe<dex> $$35 = exe.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(ale.a($$0x)), $$2);
         exe<ens> $$36 = exe.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(ale.a($$0x)), $$2);
         duq $$37 = new duq($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dxg.a.parse(new Dynamic(vf.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         duv $$39 = duv.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(duv.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ur $$40 = $$3.p("Heightmaps");
      EnumSet<dxs.a> $$41 = EnumSet.noneOf(dxs.a.class);

      for (dxs.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dxs.a($$34, $$41);
      ur $$44 = $$3.p("structures");
      $$34.a(a(eiy.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ux $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ux $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dux.b) {
         return new duf((dug)$$34, false);
      } else {
         duq $$49 = (duq)$$34;
         ux $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ux $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            ur $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         ur $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dxo.a $$57 = dxo.a.valueOf($$56);
            $$49.a($$57, new dtv($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dbd $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dup<ji<dcv>>> a(jv<dcv> $$0) {
      return duo.b($$0.t(), $$0.r(), duo.d.e, $$0.g(ddc.b));
   }

   public static ur a(are $$0, dtw $$1) {
      dbd $$2 = $$1.f();
      ur $$3 = vg.e(new ur());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lp.n.b($$1.j()).toString());
      dyv $$4 = $$1.t();
      if ($$4 != null) {
         dyv.e.encodeStart(vf.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dxg $$5 = $$1.x();
      if ($$5 != null) {
         dxg.a.encodeStart(vf.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dut $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      duh[] $$7 = $$1.d();
      ux $$8 = new ux();
      eni $$9 = $$0.l().a();
      jv<dcv> $$10 = $$0.H_().d(lq.az);
      Codec<dup<ji<dcv>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dub $$16 = $$9.a(dcf.b).a(kb.a($$2, $$13));
         dub $$17 = $$9.a(dcf.a).a(kb.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ur $$18 = new ur();
            if ($$15) {
               duh $$19 = $$7[$$14];
               $$18.a("block_states", (vo)h.encodeStart(vf.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (vo)$$11.encodeStart(vf.a, $$19.i()).getOrThrow());
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

      ux $$20 = new ux();

      for (iz $$21 : $$1.c()) {
         ur $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dux.a) {
         duq $$23 = (duq)$$1;
         ux $$24 = new ux();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ur $$25 = new ur();

         for (dxo.a $$26 : dxo.a.values()) {
            dtv $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ur $$28 = new ur();

      for (Entry<dxs.a, dxs> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uy($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eiy.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(are $$0, ur $$1, dtw.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lp.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lp.c.b($$0x).toString()));
   }

   public static dux a(@Nullable ur $$0) {
      return $$0 != null ? duv.a($$0.l("Status")).g() : dux.a;
   }

   @Nullable
   private static dug.c a(are $$0, ur $$1) {
      ux $$2 = a($$1, "entities");
      ux $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsy.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ur $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  iz $$7 = dpf.b($$5);
                  dpf $$8 = dpf.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ux a(ur $$0, String $$1) {
      ux $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ur a(eiy $$0, dbd $$1, Map<eii, eiq> $$2, Map<eii, LongSet> $$3) {
      ur $$4 = new ur();
      ur $$5 = new ur();
      jv<eii> $$6 = $$0.b().d(lq.aJ);

      for (Entry<eii, eiq> $$7 : $$2.entrySet()) {
         ale $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ur $$9 = new ur();

      for (Entry<eii, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ale $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uy($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eii, eiq> a(eiy $$0, ur $$1, long $$2) {
      Map<eii, eiq> $$3 = Maps.newHashMap();
      jv<eii> $$4 = $$0.b().d(lq.aJ);
      ur $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.a($$6);
         eii $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            eiq $$9 = eiq.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eii, LongSet> a(jw $$0, dbd $$1, ur $$2) {
      Map<eii, LongSet> $$3 = Maps.newHashMap();
      jv<eii> $$4 = $$0.d(lq.aJ);
      ur $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.a($$6);
         eii $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dbd $$3x = new dbd($$2x);
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

   public static ux a(ShortList[] $$0) {
      ux $$1 = new ux();

      for (ShortList $$2 : $$0) {
         ux $$3 = new ux();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(vj.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends vc {
      public a(String $$0) {
         super($$0);
      }
   }
}
