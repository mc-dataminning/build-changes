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

public class dwi {
   private static final Codec<dvq<dtc>> h = dvq.a(dfy.q, dtc.b, dvq.d.d, dga.a.o());
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

   public static dvs a(aqu $$0, ces $$1, dws $$2, dcd $$3, ub $$4) {
      dcd $$5 = new dcd($$4.h("xPos"), $$4.h("zPos"));
      if (!Objects.equals($$3, $$5)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, $$5});
         $$0.o().a($$5, $$3, $$2);
      }

      dvv $$6 = $$4.b("UpgradeData", 10) ? new dvv($$4.p("UpgradeData"), $$0) : dvv.a;
      boolean $$7 = $$4.q("isLightOn");
      uh $$8 = $$4.c("sections", 10);
      int $$9 = $$0.an();
      dvj[] $$10 = new dvj[$$9];
      boolean $$11 = $$0.D_().g();
      dvc $$12 = $$0.l();
      eor $$13 = $$12.p();
      jz<ddw> $$14 = $$0.H_().d(lu.aF);
      Codec<dvr<jm<ddw>>> $$15 = a($$14);
      boolean $$16 = false;

      for (int $$17 = 0; $$17 < $$8.size(); $$17++) {
         ub $$18 = $$8.a($$17);
         int $$19 = $$18.f("Y");
         int $$20 = $$0.f($$19);
         if ($$20 >= 0 && $$20 < $$10.length) {
            dvq<dtc> $$21;
            if ($$18.b("block_states", 10)) {
               $$21 = (dvq<dtc>)h.parse(up.a, $$18.p("block_states")).promotePartial($$2x -> a($$3, $$19, $$2x)).getOrThrow(dwi.a::new);
            } else {
               $$21 = new dvq<>(dfy.q, dga.a.o(), dvq.d.d);
            }

            dvr<jm<ddw>> $$23;
            if ($$18.b("biomes", 10)) {
               $$23 = (dvr<jm<ddw>>)$$15.parse(up.a, $$18.p("biomes")).promotePartial($$2x -> a($$3, $$19, $$2x)).getOrThrow(dwi.a::new);
            } else {
               $$23 = new dvq<>($$14.u(), $$14.g(ded.b), dvq.d.e);
            }

            dvj $$25 = new dvj($$21, $$23);
            $$10[$$20] = $$25;
            kf $$26 = kf.a($$3, $$19);
            $$1.a($$26, $$25);
         }

         boolean $$27 = $$18.b("BlockLight", 7);
         boolean $$28 = $$11 && $$18.b("SkyLight", 7);
         if ($$27 || $$28) {
            if (!$$16) {
               $$13.b($$3, true);
               $$16 = true;
            }

            if ($$27) {
               $$13.a(ddf.b, kf.a($$3, $$19), new dvd($$18.m("BlockLight")));
            }

            if ($$28) {
               $$13.a(ddf.a, kf.a($$3, $$19), new dvd($$18.m("SkyLight")));
            }
         }
      }

      long $$29 = $$4.i("InhabitedTime");
      dwd $$30 = a($$4);
      eab $$31;
      if ($$4.b("blending_data", 10)) {
         $$31 = (eab)eab.e.parse(new Dynamic(up.a, $$4.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$31 = null;
      }

      duy $$35;
      if ($$30 == dwd.b) {
         eym<dfy> $$33 = eym.a($$4.c("block_ticks", 10), $$0x -> lt.e.b(akr.c($$0x)), $$3);
         eym<epb> $$34 = eym.a($$4.c("fluid_ticks", 10), $$0x -> lt.c.b(akr.c($$0x)), $$3);
         $$35 = new dvi($$0.E(), $$3, $$6, $$33, $$34, $$29, $$10, a($$0, $$4), $$31);
      } else {
         eyp<dfy> $$36 = eyp.a($$4.c("block_ticks", 10), $$0x -> lt.e.b(akr.c($$0x)), $$3);
         eyp<epb> $$37 = eyp.a($$4.c("fluid_ticks", 10), $$0x -> lt.c.b(akr.c($$0x)), $$3);
         dvs $$38 = new dvs($$3, $$6, $$10, $$36, $$37, $$0, $$14, $$31);
         $$35 = $$38;
         $$38.b($$29);
         if ($$4.b("below_zero_retrogen", 10)) {
            dym.a.parse(new Dynamic(up.a, $$4.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$38::a);
         }

         dvz $$40 = dvz.a($$4.l("Status"));
         $$38.a($$40);
         if ($$40.a(dvz.k)) {
            $$38.a($$13);
         }
      }

      $$35.b($$7);
      ub $$41 = $$4.p("Heightmaps");
      EnumSet<dyy.a> $$42 = EnumSet.noneOf(dyy.a.class);

      for (dyy.a $$43 : $$35.j().e()) {
         String $$44 = $$43.a();
         if ($$41.b($$44, 12)) {
            $$35.a($$43, $$41.o($$44));
         } else {
            $$42.add($$43);
         }
      }

      dyy.a($$35, $$42);
      ub $$45 = $$4.p("structures");
      $$35.a(a(ekf.a($$0), $$45, $$0.C()));
      $$35.b(a($$0.H_(), $$3, $$45));
      if ($$4.q("shouldSave")) {
         $$35.a(true);
      }

      uh $$46 = $$4.c("PostProcessing", 9);

      for (int $$47 = 0; $$47 < $$46.size(); $$47++) {
         uh $$48 = $$46.b($$47);

         for (int $$49 = 0; $$49 < $$48.size(); $$49++) {
            $$35.a($$48.d($$49), $$47);
         }
      }

      if ($$30 == dwd.b) {
         return new dvh((dvi)$$35, false);
      } else {
         dvs $$50 = (dvs)$$35;
         uh $$51 = $$4.c("entities", 10);

         for (int $$52 = 0; $$52 < $$51.size(); $$52++) {
            $$50.b($$51.a($$52));
         }

         uh $$53 = $$4.c("block_entities", 10);

         for (int $$54 = 0; $$54 < $$53.size(); $$54++) {
            ub $$55 = $$53.a($$54);
            $$35.a($$55);
         }

         ub $$56 = $$4.p("CarvingMasks");

         for (String $$57 : $$56.e()) {
            dyu.a $$58 = dyu.a.valueOf($$57);
            $$50.a($$58, new dux($$56.o($$57), $$35.I_()));
         }

         return $$50;
      }
   }

   private static void a(dcd $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.e, $$1, $$0.f, $$2});
   }

   private static Codec<dvr<jm<ddw>>> a(jz<ddw> $$0) {
      return dvq.b($$0.u(), $$0.s(), dvq.d.e, $$0.g(ded.b));
   }

   public static ub a(aqu $$0, duy $$1) {
      dcd $$2 = $$1.f();
      ub $$3 = uq.e(new ub());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.ao());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.Z());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", lt.l.b($$1.j()).toString());
      eab $$4 = $$1.t();
      if ($$4 != null) {
         eab.e.encodeStart(up.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dym $$5 = $$1.x();
      if ($$5 != null) {
         dym.a.encodeStart(up.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dvv $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dvj[] $$7 = $$1.d();
      uh $$8 = new uh();
      eor $$9 = $$0.l().a();
      jz<ddw> $$10 = $$0.H_().d(lu.aF);
      Codec<dvr<jm<ddw>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dvd $$16 = $$9.a(ddf.b).a(kf.a($$2, $$13));
         dvd $$17 = $$9.a(ddf.a).a(kf.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            ub $$18 = new ub();
            if ($$15) {
               dvj $$19 = $$7[$$14];
               $$18.a("block_states", (uy)h.encodeStart(up.a, $$19.h()).getOrThrow());
               $$18.a("biomes", (uy)$$11.encodeStart(up.a, $$19.i()).getOrThrow());
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

      uh $$20 = new uh();

      for (jd $$21 : $$1.c()) {
         ub $$22 = $$1.a($$21, $$0.H_());
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().d() == dwd.a) {
         dvs $$23 = (dvs)$$1;
         uh $$24 = new uh();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         ub $$25 = new ub();

         for (dyu.a $$26 : dyu.a.values()) {
            dux $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      ub $$28 = new ub();

      for (Entry<dyy.a, dyy> $$29 : $$1.e()) {
         if ($$1.j().e().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new ui($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(ekf.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aqu $$0, ub $$1, duy.a $$2) {
      long $$3 = $$0.A_().c();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> lt.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> lt.c.b($$0x).toString()));
   }

   public static dwd a(@Nullable ub $$0) {
      return $$0 != null ? dvz.a($$0.l("Status")).d() : dwd.a;
   }

   @Nullable
   private static dvi.c a(aqu $$0, ub $$1) {
      uh $$2 = a($$1, "entities");
      uh $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bsx.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ub $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  jd $$7 = dqh.b($$5);
                  dqh $$8 = dqh.a($$7, $$3x.a_($$7), $$5, $$0.H_());
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static uh a(ub $$0, String $$1) {
      uh $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static ub a(ekf $$0, dcd $$1, Map<ejp, ejx> $$2, Map<ejp, LongSet> $$3) {
      ub $$4 = new ub();
      ub $$5 = new ub();
      jz<ejp> $$6 = $$0.b().d(lu.aR);

      for (Entry<ejp, ejx> $$7 : $$2.entrySet()) {
         akr $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      ub $$9 = new ub();

      for (Entry<ejp, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            akr $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ui($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<ejp, ejx> a(ekf $$0, ub $$1, long $$2) {
      Map<ejp, ejx> $$3 = Maps.newHashMap();
      jz<ejp> $$4 = $$0.b().d(lu.aR);
      ub $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         akr $$7 = akr.c($$6);
         ejp $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            ejx $$9 = ejx.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<ejp, LongSet> a(ka $$0, dcd $$1, ub $$2) {
      Map<ejp, LongSet> $$3 = Maps.newHashMap();
      jz<ejp> $$4 = $$0.d(lu.aR);
      ub $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         akr $$7 = akr.c($$6);
         ejp $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dcd $$3x = new dcd($$2x);
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

   public static uh a(ShortList[] $$0) {
      uh $$1 = new uh();

      for (ShortList $$2 : $$0) {
         uh $$3 = new uh();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(ut.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public static class a extends um {
      public a(String $$0) {
         super($$0);
      }
   }
}
