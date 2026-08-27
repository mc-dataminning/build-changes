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

public class dib {
   private static final Codec<dht<dfe>> h = dht.a(csq.o, dfe.b, dht.d.d, csr.a.n());
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

   public static dhv a(akn $$0, bua $$1, cox $$2, qu $$3) {
      cox $$4 = new cox($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dhy $$5 = $$3.b("UpgradeData", 10) ? new dhy($$3.p("UpgradeData"), $$0) : dhy.a;
      boolean $$6 = $$3.q("isLightOn");
      ra $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ak();
      dhm[] $$9 = new dhm[$$8];
      boolean $$10 = $$0.x_().g();
      dhe $$11 = $$0.k();
      dzw $$12 = $$11.p();
      ht<cqo> $$13 = $$0.B_().d(je.ap);
      Codec<dhu<hg<cqo>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         qu $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dht<dfe> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dht<dfe>)h.parse(rf.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dht<>(csq.o, csr.a.n(), dht.d.d);
            }

            dhu<hg<cqo>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dhu<hg<cqo>>)$$14.parse(rf.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dht<>($$13.t(), $$13.f(cqv.b), dht.d.e);
            }

            dhm $$24 = new dhm($$20, $$22);
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
               $$12.a(cpz.b, hz.a($$2, $$18), new dhg($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cpz.a, hz.a($$2, $$18), new dhg($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dhf.a $$29 = a($$3);
      dlq $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dlq)dlq.e.parse(new Dynamic(rf.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dha $$34;
      if ($$29 == dhf.a.b) {
         eip<csq> $$32 = eip.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aeu.a($$0x)), $$2);
         eip<eag> $$33 = eip.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aeu.a($$0x)), $$2);
         $$34 = new dhl($$0.C(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eis<csq> $$35 = eis.a($$3.c("block_ticks", 10), $$0x -> jd.f.b(aeu.a($$0x)), $$2);
         eis<eag> $$36 = eis.a($$3.c("fluid_ticks", 10), $$0x -> jd.d.b(aeu.a($$0x)), $$2);
         dhv $$37 = new dhv($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            dkb.a.parse(new Dynamic(rf.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dhf $$39 = dhf.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dhf.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      qu $$40 = $$3.p("Heightmaps");
      EnumSet<dkn.a> $$41 = EnumSet.noneOf(dkn.a.class);

      for (dkn.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      dkn.a($$34, $$41);
      qu $$44 = $$3.p("structures");
      $$34.a(a(dvt.a($$0), $$44, $$0.A()));
      $$34.b(a($$0.B_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      ra $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         ra $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dhf.a.b) {
         return new dhk((dhl)$$34, false);
      } else {
         dhv $$49 = (dhv)$$34;
         ra $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         ra $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            qu $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         qu $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dkj.a $$57 = dkj.a.valueOf($$56);
            $$49.a($$57, new dgz($$55.o($$56), $$34.C_()));
         }

         return $$49;
      }
   }

   private static void a(cox $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dhu<hg<cqo>>> a(ht<cqo> $$0) {
      return dht.b($$0.t(), $$0.r(), dht.d.e, $$0.f(cqv.b));
   }

   public static qu a(akn $$0, dha $$1) {
      cox $$2 = $$1.f();
      qu $$3 = rg.g(new qu());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.al());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.V());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", jd.o.b($$1.j()).toString());
      dlq $$4 = $$1.t();
      if ($$4 != null) {
         dlq.e.encodeStart(rf.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      dkb $$5 = $$1.x();
      if ($$5 != null) {
         dkb.a.encodeStart(rf.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dhy $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dhm[] $$7 = $$1.d();
      ra $$8 = new ra();
      dzw $$9 = $$0.k().a();
      ht<cqo> $$10 = $$0.B_().d(je.ap);
      Codec<dhu<hg<cqo>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dhg $$16 = $$9.a(cpz.b).a(hz.a($$2, $$13));
         dhg $$17 = $$9.a(cpz.a).a(hz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            qu $$18 = new qu();
            if ($$15) {
               dhm $$19 = $$7[$$14];
               $$18.a("block_states", (rn)h.encodeStart(rf.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (rn)$$11.encodeStart(rf.a, $$19.i()).getOrThrow(false, i::error));
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

      ra $$20 = new ra();

      for (gw $$21 : $$1.c()) {
         qu $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dhf.a.a) {
         dhv $$23 = (dhv)$$1;
         ra $$24 = new ra();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         qu $$25 = new qu();

         for (dkj.a $$26 : dkj.a.values()) {
            dgz $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      qu $$28 = new qu();

      for (Entry<dkn.a, dkn> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new rb($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dvt.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(akn $$0, qu $$1, dha.a $$2) {
      long $$3 = $$0.u_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> jd.f.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> jd.d.b($$0x).toString()));
   }

   public static dhf.a a(@Nullable qu $$0) {
      return $$0 != null ? dhf.a($$0.l("Status")).g() : dhf.a.a;
   }

   @Nullable
   private static dhl.c a(akn $$0, qu $$1) {
      ra $$2 = a($$1, "entities");
      ra $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bip.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qu $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  gw $$7 = dcq.c($$5);
                  dcq $$8 = dcq.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static ra a(qu $$0, String $$1) {
      ra $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static qu a(dvt $$0, cox $$1, Map<dvd, dvl> $$2, Map<dvd, LongSet> $$3) {
      qu $$4 = new qu();
      qu $$5 = new qu();
      ht<dvd> $$6 = $$0.b().d(je.az);

      for (Entry<dvd, dvl> $$7 : $$2.entrySet()) {
         aeu $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      qu $$9 = new qu();

      for (Entry<dvd, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            aeu $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new rb($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dvd, dvl> a(dvt $$0, qu $$1, long $$2) {
      Map<dvd, dvl> $$3 = Maps.newHashMap();
      ht<dvd> $$4 = $$0.b().d(je.az);
      qu $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         aeu $$7 = aeu.a($$6);
         dvd $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dvl $$9 = dvl.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dvd, LongSet> a(hu $$0, cox $$1, qu $$2) {
      Map<dvd, LongSet> $$3 = Maps.newHashMap();
      ht<dvd> $$4 = $$0.d(je.az);
      qu $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         aeu $$7 = aeu.a($$6);
         dvd $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cox $$3x = new cox($$2x);
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

   public static ra a(ShortList[] $$0) {
      ra $$1 = new ra();

      for (ShortList $$2 : $$0) {
         ra $$3 = new ra();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(ri.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
