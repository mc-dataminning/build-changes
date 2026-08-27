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

public class dpw {
   private static final Codec<dpo<dmz>> h = dpo.a(daa.q, dmz.b, dpo.d.d, dac.a.o());
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

   public static dpq a(apf $$0, car $$1, cwg $$2, ta $$3) {
      cwg $$4 = new cwg($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dpt $$5 = $$3.b("UpgradeData", 10) ? new dpt($$3.p("UpgradeData"), $$0) : dpt.a;
      boolean $$6 = $$3.q("isLightOn");
      tg $$7 = $$3.c("sections", 10);
      int $$8 = $$0.al();
      dph[] $$9 = new dph[$$8];
      boolean $$10 = $$0.D_().g();
      doz $$11 = $$0.l();
      eic $$12 = $$11.p();
      iy<cxy> $$13 = $$0.H_().d(kj.au);
      Codec<dpp<il<cxy>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         ta $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dpo<dmz> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dpo<dmz>)h.parse(to.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dpo<>(daa.q, dac.a.o(), dpo.d.d);
            }

            dpp<il<cxy>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dpp<il<cxy>>)$$14.parse(to.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dpo<>($$13.t(), $$13.g(cyf.b), dpo.d.e);
            }

            dph $$24 = new dph($$20, $$22);
            $$9[$$19] = $$24;
            je $$25 = je.a($$2, $$18);
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
               $$12.a(cxi.b, je.a($$2, $$18), new dpb($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cxi.a, je.a($$2, $$18), new dpb($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dpa.a $$29 = a($$3);
      dtp $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dtp)dtp.e.parse(new Dynamic(to.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dov $$34;
      if ($$29 == dpa.a.b) {
         erd<daa> $$32 = erd.a($$3.c("block_ticks", 10), $$0x -> ki.e.b(ajh.a($$0x)), $$2);
         erd<eim> $$33 = erd.a($$3.c("fluid_ticks", 10), $$0x -> ki.c.b(ajh.a($$0x)), $$2);
         $$34 = new dpg($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         erg<daa> $$35 = erg.a($$3.c("block_ticks", 10), $$0x -> ki.e.b(ajh.a($$0x)), $$2);
         erg<eim> $$36 = erg.a($$3.c("fluid_ticks", 10), $$0x -> ki.c.b(ajh.a($$0x)), $$2);
         dpq $$37 = new dpq($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dsa.a.parse(new Dynamic(to.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dpa $$39 = dpa.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dpa.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      ta $$40 = $$3.p("Heightmaps");
      EnumSet<dsm.a> $$41 = EnumSet.noneOf(dsm.a.class);

      for (dsm.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dsm.a($$34, $$41);
      ta $$44 = $$3.p("structures");
      $$34.a(a(eds.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.H_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      tg $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         tg $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dpa.a.b) {
         return new dpf((dpg)$$34, false);
      } else {
         dpq $$49 = (dpq)$$34;
         tg $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         tg $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            ta $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         ta $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dsi.a $$57 = dsi.a.valueOf($$56);
            $$49.a($$57, new dou($$55.o($$56), $$34.I_()));
         }

         return $$49;
      }
   }

   private static void a(cwg $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dpp<il<cxy>>> a(iy<cxy> $$0) {
      return dpo.b($$0.t(), $$0.r(), dpo.d.e, $$0.g(cyf.b));
   }

   public static ta a(apf $$0, dov $$1) {
      cwg $$2 = $$1.f();
      ta $$3 = tp.f(new ta());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.am());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.X());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", ki.n.b($$1.j()).toString());
      dtp $$4 = $$1.t();
      if ($$4 != null) {
         dtp.e.encodeStart(to.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dsa $$5 = $$1.x();
      if ($$5 != null) {
         dsa.a.encodeStart(to.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dpt $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dph[] $$7 = $$1.d();
      tg $$8 = new tg();
      eic $$9 = $$0.l().a();
      iy<cxy> $$10 = $$0.H_().d(kj.au);
      Codec<dpp<il<cxy>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dpb $$16 = $$9.a(cxi.b).a(je.a($$2, $$13));
         dpb $$17 = $$9.a(cxi.a).a(je.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ta $$18 = new ta();
            if ($$15) {
               dph $$19 = $$7[$$14];
               $$18.a("block_states", (tx)h.encodeStart(to.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (tx)$$11.encodeStart(to.a, $$19.i()).getOrThrow(false, i::error));
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

      tg $$20 = new tg();

      for (ib $$21 : $$1.c()) {
         ta $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dpa.a.a) {
         dpq $$23 = (dpq)$$1;
         tg $$24 = new tg();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ta $$25 = new ta();

         for (dsi.a $$26 : dsi.a.values()) {
            dou $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ta $$28 = new ta();

      for (Entry<dsm.a, dsm> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new th($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(eds.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(apf $$0, ta $$1, dov.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> ki.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> ki.c.b($$0x).toString()));
   }

   public static dpa.a a(@Nullable ta $$0) {
      return $$0 != null ? dpa.a($$0.l("Status")).g() : dpa.a.a;
   }

   @Nullable
   private static dpg.c a(apf $$0, ta $$1) {
      tg $$2 = a($$1, "entities");
      tg $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bpc.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ta $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  ib $$7 = dkg.a($$5);
                  dkg $$8 = dkg.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static tg a(ta $$0, String $$1) {
      tg $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ta a(eds $$0, cwg $$1, Map<edc, edk> $$2, Map<edc, LongSet> $$3) {
      ta $$4 = new ta();
      ta $$5 = new ta();
      iy<edc> $$6 = $$0.b().d(kj.aE);

      for (Entry<edc, edk> $$7 : $$2.entrySet()) {
         ajh $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ta $$9 = new ta();

      for (Entry<edc, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ajh $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new th($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<edc, edk> a(eds $$0, ta $$1, long $$2) {
      Map<edc, edk> $$3 = Maps.newHashMap();
      iy<edc> $$4 = $$0.b().d(kj.aE);
      ta $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ajh $$7 = ajh.a($$6);
         edc $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            edk $$9 = edk.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<edc, LongSet> a(iz $$0, cwg $$1, ta $$2) {
      Map<edc, LongSet> $$3 = Maps.newHashMap();
      iy<edc> $$4 = $$0.d(kj.aE);
      ta $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ajh $$7 = ajh.a($$6);
         edc $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cwg $$3x = new cwg($$2x);
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

   public static tg a(ShortList[] $$0) {
      tg $$1 = new tg();

      for (ShortList $$2 : $$0) {
         tg $$3 = new tg();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(ts.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
