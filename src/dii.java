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

public class dii {
   private static final Codec<dia<dfl>> h = dia.a(csx.o, dfl.b, dia.d.d, csy.a.n());
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

   public static dic a(aks $$0, buh $$1, cpe $$2, qy $$3) {
      cpe $$4 = new cpe($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dif $$5 = $$3.b("UpgradeData", 10) ? new dif($$3.p("UpgradeData"), $$0) : dif.a;
      boolean $$6 = $$3.q("isLightOn");
      re $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dht[] $$9 = new dht[$$8];
      boolean $$10 = $$0.C_().g();
      dhl $$11 = $$0.k();
      ead $$12 = $$11.p();
      ht<cqv> $$13 = $$0.G_().d(je.ap);
      Codec<dib<hg<cqv>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         qy $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dia<dfl> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dia<dfl>)h.parse(rk.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dia<>(csx.o, csy.a.n(), dia.d.d);
            }

            dib<hg<cqv>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dib<hg<cqv>>)$$14.parse(rk.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dia<>($$13.t(), $$13.f(crc.b), dia.d.e);
            }

            dht $$24 = new dht($$20, $$22);
            $$9[$$19] = $$24;
            hz $$25 = hz.a($$2, $$18);
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
               $$12.a(cqg.b, hz.a($$2, $$18), new dhn($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cqg.a, hz.a($$2, $$18), new dhn($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dhm.a $$29 = a($$3);
      dlx $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dlx)dlx.e.parse(new Dynamic(rk.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dhh $$34;
      if ($$29 == dhm.a.b) {
         eiw<csx> $$32 = eiw.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aey.a($$0x)), $$2);
         eiw<ean> $$33 = eiw.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aey.a($$0x)), $$2);
         $$34 = new dhs($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eiz<csx> $$35 = eiz.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aey.a($$0x)), $$2);
         eiz<ean> $$36 = eiz.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aey.a($$0x)), $$2);
         dic $$37 = new dic($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dki.a.parse(new Dynamic(rk.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dhm $$39 = dhm.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dhm.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      qy $$40 = $$3.p("Heightmaps");
      EnumSet<dku.a> $$41 = EnumSet.noneOf(dku.a.class);

      for (dku.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dku.a($$34, $$41);
      qy $$44 = $$3.p("structures");
      $$34.a(a(dwa.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.G_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      re $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         re $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dhm.a.b) {
         return new dhr((dhs)$$34, false);
      } else {
         dic $$49 = (dic)$$34;
         re $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         re $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            qy $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         qy $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dkq.a $$57 = dkq.a.valueOf($$56);
            $$49.a($$57, new dhg($$55.o($$56), $$34.H_()));
         }

         return $$49;
      }
   }

   private static void a(cpe $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dib<hg<cqv>>> a(ht<cqv> $$0) {
      return dia.b($$0.t(), $$0.r(), dia.d.e, $$0.f(crc.b));
   }

   public static qy a(aks $$0, dhh $$1) {
      cpe $$2 = $$1.f();
      qy $$3 = rl.g(new qy());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jd.o.b($$1.j()).toString());
      dlx $$4 = $$1.t();
      if ($$4 != null) {
         dlx.e.encodeStart(rk.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dki $$5 = $$1.x();
      if ($$5 != null) {
         dki.a.encodeStart(rk.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dif $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dht[] $$7 = $$1.d();
      re $$8 = new re();
      ead $$9 = $$0.k().a();
      ht<cqv> $$10 = $$0.G_().d(je.ap);
      Codec<dib<hg<cqv>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dhn $$16 = $$9.a(cqg.b).a(hz.a($$2, $$13));
         dhn $$17 = $$9.a(cqg.a).a(hz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            qy $$18 = new qy();
            if ($$15) {
               dht $$19 = $$7[$$14];
               $$18.a("block_states", (rs)h.encodeStart(rk.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (rs)$$11.encodeStart(rk.a, $$19.i()).getOrThrow(false, i::error));
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

      re $$20 = new re();

      for (gw $$21 : $$1.c()) {
         qy $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dhm.a.a) {
         dic $$23 = (dic)$$1;
         re $$24 = new re();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         qy $$25 = new qy();

         for (dkq.a $$26 : dkq.a.values()) {
            dhg $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      qy $$28 = new qy();

      for (Entry<dku.a, dku> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new rf($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dwa.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(aks $$0, qy $$1, dhh.a $$2) {
      long $$3 = $$0.z_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jd.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jd.d.b($$0x).toString()));
   }

   public static dhm.a a(@Nullable qy $$0) {
      return $$0 != null ? dhm.a($$0.l("Status")).g() : dhm.a.a;
   }

   @Nullable
   private static dhs.c a(aks $$0, qy $$1) {
      re $$2 = a($$1, "entities");
      re $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(biw.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qy $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  gw $$7 = dcx.c($$5);
                  dcx $$8 = dcx.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static re a(qy $$0, String $$1) {
      re $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static qy a(dwa $$0, cpe $$1, Map<dvk, dvs> $$2, Map<dvk, LongSet> $$3) {
      qy $$4 = new qy();
      qy $$5 = new qy();
      ht<dvk> $$6 = $$0.b().d(je.az);

      for (Entry<dvk, dvs> $$7 : $$2.entrySet()) {
         aey $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      qy $$9 = new qy();

      for (Entry<dvk, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            aey $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new rf($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dvk, dvs> a(dwa $$0, qy $$1, long $$2) {
      Map<dvk, dvs> $$3 = Maps.newHashMap();
      ht<dvk> $$4 = $$0.b().d(je.az);
      qy $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         aey $$7 = aey.a($$6);
         dvk $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dvs $$9 = dvs.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dvk, LongSet> a(hu $$0, cpe $$1, qy $$2) {
      Map<dvk, LongSet> $$3 = Maps.newHashMap();
      ht<dvk> $$4 = $$0.d(je.az);
      qy $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         aey $$7 = aey.a($$6);
         dvk $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cpe $$3x = new cpe($$2x);
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

   public static re a(ShortList[] $$0) {
      re $$1 = new re();

      for (ShortList $$2 : $$0) {
         re $$3 = new re();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(rn.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
