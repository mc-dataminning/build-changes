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

public class dvd {
   private static final Codec<dup<dsb>> h = dup.a(dey.q, dsb.b, dup.d.d, dfa.a.o());
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

   public static dur a(are $$0, ces $$1, dbe $$2, ur $$3) {
      dbe $$4 = new dbe($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      duu $$5 = $$3.b("UpgradeData", 10) ? new duu($$3.p("UpgradeData"), $$0) : duu.a;
      boolean $$6 = $$3.q("isLightOn");
      ux $$7 = $$3.c("sections", 10);
      int $$8 = $$0.an();
      dui[] $$9 = new dui[$$8];
      boolean $$10 = $$0.D_().g();
      dub $$11 = $$0.l();
      enj $$12 = $$11.p();
      jv<dcw> $$13 = $$0.H_().d(lq.az);
      Codec<duq<ji<dcw>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ur $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dup<dsb> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dup<dsb>)h.parse(vf.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvd.a::new);
            } else {
               $$20 = new dup<>(dey.q, dfa.a.o(), dup.d.d);
            }

            duq<ji<dcw>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (duq<ji<dcw>>)$$14.parse(vf.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(dvd.a::new);
            } else {
               $$22 = new dup<>($$13.t(), $$13.g(ddd.b), dup.d.e);
            }

            dui $$24 = new dui($$20, $$22);
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
               $$12.a(dcg.b, kb.a($$2, $$18), new duc($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(dcg.a, kb.a($$2, $$18), new duc($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      duy $$29 = a($$3);
      dyw $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dyw)dyw.e.parse(new Dynamic(vf.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dtx $$34;
      if ($$29 == duy.b) {
         exc<dey> $$32 = exc.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(ale.a($$0x)), $$2);
         exc<ent> $$33 = exc.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(ale.a($$0x)), $$2);
         $$34 = new duh($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         exf<dey> $$35 = exf.a($$3.c("block_ticks", 10), $$0x -> lp.e.b(ale.a($$0x)), $$2);
         exf<ent> $$36 = exf.a($$3.c("fluid_ticks", 10), $$0x -> lp.c.b(ale.a($$0x)), $$2);
         dur $$37 = new dur($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dxh.a.parse(new Dynamic(vf.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         duw $$39 = duw.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(duw.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ur $$40 = $$3.p("Heightmaps");
      EnumSet<dxt.a> $$41 = EnumSet.noneOf(dxt.a.class);

      for (dxt.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dxt.a($$34, $$41);
      ur $$44 = $$3.p("structures");
      $$34.a(a(eiz.a($$0), $$44, $$0.C()));
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

      if ($$29 == duy.b) {
         return new dug((duh)$$34, false);
      } else {
         dur $$49 = (dur)$$34;
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
            dxp.a $$57 = dxp.a.valueOf($$56);
            $$49.a($$57, new dtw($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(dbe $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<duq<ji<dcw>>> a(jv<dcw> $$0) {
      return dup.b($$0.t(), $$0.r(), dup.d.e, $$0.g(ddd.b));
   }

   public static ur a(are $$0, dtx $$1) {
      dbe $$2 = $$1.f();
      ur $$3 = vg.e(new ur());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lp.n.b($$1.j()).toString());
      dyw $$4 = $$1.t();
      if ($$4 != null) {
         dyw.e.encodeStart(vf.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dxh $$5 = $$1.x();
      if ($$5 != null) {
         dxh.a.encodeStart(vf.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      duu $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dui[] $$7 = $$1.d();
      ux $$8 = new ux();
      enj $$9 = $$0.l().a();
      jv<dcw> $$10 = $$0.H_().d(lq.az);
      Codec<duq<ji<dcw>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         duc $$16 = $$9.a(dcg.b).a(kb.a($$2, $$13));
         duc $$17 = $$9.a(dcg.a).a(kb.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ur $$18 = new ur();
            if ($$15) {
               dui $$19 = $$7[$$14];
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
      if ($$1.j().g() == duy.a) {
         dur $$23 = (dur)$$1;
         ux $$24 = new ux();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ur $$25 = new ur();

         for (dxp.a $$26 : dxp.a.values()) {
            dtw $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ur $$28 = new ur();

      for (Entry<dxt.a, dxt> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new uy($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eiz.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(are $$0, ur $$1, dtx.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lp.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lp.c.b($$0x).toString()));
   }

   public static duy a(@Nullable ur $$0) {
      return $$0 != null ? duw.a($$0.l("Status")).g() : duy.a;
   }

   @Nullable
   private static duh.c a(are $$0, ur $$1) {
      ux $$2 = a($$1, "entities");
      ux $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsz.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ur $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  iz $$7 = dpg.b($$5);
                  dpg $$8 = dpg.a($$7, $$3x.a_($$7), $$5, $$0.H_());
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

   private static ur a(eiz $$0, dbe $$1, Map<eij, eir> $$2, Map<eij, LongSet> $$3) {
      ur $$4 = new ur();
      ur $$5 = new ur();
      jv<eij> $$6 = $$0.b().d(lq.aJ);

      for (Entry<eij, eir> $$7 : $$2.entrySet()) {
         ale $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ur $$9 = new ur();

      for (Entry<eij, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ale $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new uy($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eij, eir> a(eiz $$0, ur $$1, long $$2) {
      Map<eij, eir> $$3 = Maps.newHashMap();
      jv<eij> $$4 = $$0.b().d(lq.aJ);
      ur $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.a($$6);
         eij $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            eir $$9 = eir.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eij, LongSet> a(jw $$0, dbe $$1, ur $$2) {
      Map<eij, LongSet> $$3 = Maps.newHashMap();
      jv<eij> $$4 = $$0.d(lq.aJ);
      ur $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ale $$7 = ale.a($$6);
         eij $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dbe $$3x = new dbe($$2x);
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
