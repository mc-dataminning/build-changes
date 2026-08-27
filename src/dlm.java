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

public class dlm {
   private static final Codec<dle<dip>> h = dle.a(cvz.q, dip.b, dle.d.d, cwb.a.o());
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

   public static dlg a(amp $$0, bww $$1, csf $$2, sj $$3) {
      csf $$4 = new csf($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dlj $$5 = $$3.b("UpgradeData", 10) ? new dlj($$3.p("UpgradeData"), $$0) : dlj.a;
      boolean $$6 = $$3.q("isLightOn");
      sp $$7 = $$3.c("sections", 10);
      int $$8 = $$0.al();
      dkx[] $$9 = new dkx[$$8];
      boolean $$10 = $$0.E_().g();
      dkp $$11 = $$0.k();
      edo $$12 = $$11.p();
      ir<ctx> $$13 = $$0.I_().d(kc.as);
      Codec<dlf<ie<ctx>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         sj $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dle<dip> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dle<dip>)h.parse(sx.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dle<>(cvz.q, cwb.a.o(), dle.d.d);
            }

            dlf<ie<ctx>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dlf<ie<ctx>>)$$14.parse(sx.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dle<>($$13.t(), $$13.f(cue.b), dle.d.e);
            }

            dkx $$24 = new dkx($$20, $$22);
            $$9[$$19] = $$24;
            ix $$25 = ix.a($$2, $$18);
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
               $$12.a(cth.b, ix.a($$2, $$18), new dkr($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cth.a, ix.a($$2, $$18), new dkr($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dkq.a $$29 = a($$3);
      dpb $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dpb)dpb.e.parse(new Dynamic(sx.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dkl $$34;
      if ($$29 == dkq.a.b) {
         emi<cvz> $$32 = emi.a($$3.c("block_ticks", 10), $$0x -> kb.e.b(agt.a($$0x)), $$2);
         emi<edy> $$33 = emi.a($$3.c("fluid_ticks", 10), $$0x -> kb.c.b(agt.a($$0x)), $$2);
         $$34 = new dkw($$0.D(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eml<cvz> $$35 = eml.a($$3.c("block_ticks", 10), $$0x -> kb.e.b(agt.a($$0x)), $$2);
         eml<edy> $$36 = eml.a($$3.c("fluid_ticks", 10), $$0x -> kb.c.b(agt.a($$0x)), $$2);
         dlg $$37 = new dlg($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dnm.a.parse(new Dynamic(sx.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dkq $$39 = dkq.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dkq.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      sj $$40 = $$3.p("Heightmaps");
      EnumSet<dny.a> $$41 = EnumSet.noneOf(dny.a.class);

      for (dny.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dny.a($$34, $$41);
      sj $$44 = $$3.p("structures");
      $$34.a(a(dze.a($$0), $$44, $$0.B()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      sp $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         sp $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dkq.a.b) {
         return new dkv((dkw)$$34, false);
      } else {
         dlg $$49 = (dlg)$$34;
         sp $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         sp $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            sj $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         sj $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dnu.a $$57 = dnu.a.valueOf($$56);
            $$49.a($$57, new dkk($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(csf $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dlf<ie<ctx>>> a(ir<ctx> $$0) {
      return dle.b($$0.t(), $$0.r(), dle.d.e, $$0.f(cue.b));
   }

   public static sj a(amp $$0, dkl $$1) {
      csf $$2 = $$1.f();
      sj $$3 = sy.g(new sj());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.am());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.W());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kb.n.b($$1.j()).toString());
      dpb $$4 = $$1.t();
      if ($$4 != null) {
         dpb.e.encodeStart(sx.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dnm $$5 = $$1.x();
      if ($$5 != null) {
         dnm.a.encodeStart(sx.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dlj $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dkx[] $$7 = $$1.d();
      sp $$8 = new sp();
      edo $$9 = $$0.k().a();
      ir<ctx> $$10 = $$0.I_().d(kc.as);
      Codec<dlf<ie<ctx>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dkr $$16 = $$9.a(cth.b).a(ix.a($$2, $$13));
         dkr $$17 = $$9.a(cth.a).a(ix.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            sj $$18 = new sj();
            if ($$15) {
               dkx $$19 = $$7[$$14];
               $$18.a("block_states", (tg)h.encodeStart(sx.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (tg)$$11.encodeStart(sx.a, $$19.i()).getOrThrow(false, i::error));
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

      sp $$20 = new sp();

      for (hv $$21 : $$1.c()) {
         sj $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dkq.a.a) {
         dlg $$23 = (dlg)$$1;
         sp $$24 = new sp();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         sj $$25 = new sj();

         for (dnu.a $$26 : dnu.a.values()) {
            dkk $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      sj $$28 = new sj();

      for (Entry<dny.a, dny> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new sq($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dze.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(amp $$0, sj $$1, dkl.a $$2) {
      long $$3 = $$0.B_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kb.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kb.c.b($$0x).toString()));
   }

   public static dkq.a a(@Nullable sj $$0) {
      return $$0 != null ? dkq.a($$0.l("Status")).g() : dkq.a.a;
   }

   @Nullable
   private static dkw.c a(amp $$0, sj $$1) {
      sp $$2 = a($$1, "entities");
      sp $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(blj.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sj $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  hv $$7 = dgd.c($$5);
                  dgd $$8 = dgd.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static sp a(sj $$0, String $$1) {
      sp $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static sj a(dze $$0, csf $$1, Map<dyo, dyw> $$2, Map<dyo, LongSet> $$3) {
      sj $$4 = new sj();
      sj $$5 = new sj();
      ir<dyo> $$6 = $$0.b().d(kc.aC);

      for (Entry<dyo, dyw> $$7 : $$2.entrySet()) {
         agt $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      sj $$9 = new sj();

      for (Entry<dyo, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            agt $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new sq($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dyo, dyw> a(dze $$0, sj $$1, long $$2) {
      Map<dyo, dyw> $$3 = Maps.newHashMap();
      ir<dyo> $$4 = $$0.b().d(kc.aC);
      sj $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         agt $$7 = agt.a($$6);
         dyo $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dyw $$9 = dyw.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dyo, LongSet> a(is $$0, csf $$1, sj $$2) {
      Map<dyo, LongSet> $$3 = Maps.newHashMap();
      ir<dyo> $$4 = $$0.d(kc.aC);
      sj $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         agt $$7 = agt.a($$6);
         dyo $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  csf $$3x = new csf($$2x);
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

   public static sp a(ShortList[] $$0) {
      sp $$1 = new sp();

      for (ShortList $$2 : $$0) {
         sp $$3 = new sp();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(tb.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
