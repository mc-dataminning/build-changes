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

public class dme {
   private static final Codec<dlw<djh>> h = dlw.a(cwq.q, djh.b, dlw.d.d, cws.a.o());
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

   public static dly a(and $$0, bxm $$1, csw $$2, sn $$3) {
      csw $$4 = new csw($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      dmb $$5 = $$3.b("UpgradeData", 10) ? new dmb($$3.p("UpgradeData"), $$0) : dmb.a;
      boolean $$6 = $$3.q("isLightOn");
      st $$7 = $$3.c("sections", 10);
      int $$8 = $$0.am();
      dlp[] $$9 = new dlp[$$8];
      boolean $$10 = $$0.E_().g();
      dlh $$11 = $$0.l();
      eeg $$12 = $$11.p();
      it<cuo> $$13 = $$0.I_().d(ke.at);
      Codec<dlx<ih<cuo>>> $$14 = a($$13);
      boolean $$15 = false;

      for (int $$16 = 0; $$16 < $$7.size(); $$16++) {
         sn $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            dlw<djh> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (dlw<djh>)h.parse(tb.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new dlw<>(cwq.q, cws.a.o(), dlw.d.d);
            }

            dlx<ih<cuo>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (dlx<ih<cuo>>)$$14.parse(tb.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new dlw<>($$13.t(), $$13.f(cuv.b), dlw.d.e);
            }

            dlp $$24 = new dlp($$20, $$22);
            $$9[$$19] = $$24;
            iz $$25 = iz.a($$2, $$18);
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
               $$12.a(cty.b, iz.a($$2, $$18), new dlj($$17.m("BlockLight")));
            }

            if ($$27) {
               $$12.a(cty.a, iz.a($$2, $$18), new dlj($$17.m("SkyLight")));
            }
         }
      }

      long $$28 = $$3.i("InhabitedTime");
      dli.a $$29 = a($$3);
      dpt $$30;
      if ($$3.b("blending_data", 10)) {
         $$30 = (dpt)dpt.e.parse(new Dynamic(tb.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$30 = null;
      }

      dld $$34;
      if ($$29 == dli.a.b) {
         enf<cwq> $$32 = enf.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahg.a($$0x)), $$2);
         enf<eeq> $$33 = enf.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahg.a($$0x)), $$2);
         $$34 = new dlo($$0.E(), $$2, $$5, $$32, $$33, $$28, $$9, a($$0, $$3), $$30);
      } else {
         eni<cwq> $$35 = eni.a($$3.c("block_ticks", 10), $$0x -> kd.e.b(ahg.a($$0x)), $$2);
         eni<eeq> $$36 = eni.a($$3.c("fluid_ticks", 10), $$0x -> kd.c.b(ahg.a($$0x)), $$2);
         dly $$37 = new dly($$2, $$5, $$9, $$35, $$36, $$0, $$13, $$30);
         $$34 = $$37;
         $$37.b($$28);
         if ($$3.b("below_zero_retrogen", 10)) {
            doe.a.parse(new Dynamic(tb.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$37::a);
         }

         dli $$39 = dli.a($$3.l("Status"));
         $$37.a($$39);
         if ($$39.b(dli.k)) {
            $$37.a($$12);
         }
      }

      $$34.b($$6);
      sn $$40 = $$3.p("Heightmaps");
      EnumSet<doq.a> $$41 = EnumSet.noneOf(doq.a.class);

      for (doq.a $$42 : $$34.j().h()) {
         String $$43 = $$42.a();
         if ($$40.b($$43, 12)) {
            $$34.a($$42, $$40.o($$43));
         } else {
            $$41.add($$42);
         }
      }

      doq.a($$34, $$41);
      sn $$44 = $$3.p("structures");
      $$34.a(a(dzw.a($$0), $$44, $$0.C()));
      $$34.b(a($$0.I_(), $$2, $$44));
      if ($$3.q("shouldSave")) {
         $$34.a(true);
      }

      st $$45 = $$3.c("PostProcessing", 9);

      for (int $$46 = 0; $$46 < $$45.size(); $$46++) {
         st $$47 = $$45.b($$46);

         for (int $$48 = 0; $$48 < $$47.size(); $$48++) {
            $$34.a($$47.d($$48), $$46);
         }
      }

      if ($$29 == dli.a.b) {
         return new dln((dlo)$$34, false);
      } else {
         dly $$49 = (dly)$$34;
         st $$50 = $$3.c("entities", 10);

         for (int $$51 = 0; $$51 < $$50.size(); $$51++) {
            $$49.b($$50.a($$51));
         }

         st $$52 = $$3.c("block_entities", 10);

         for (int $$53 = 0; $$53 < $$52.size(); $$53++) {
            sn $$54 = $$52.a($$53);
            $$34.a($$54);
         }

         sn $$55 = $$3.p("CarvingMasks");

         for (String $$56 : $$55.e()) {
            dom.a $$57 = dom.a.valueOf($$56);
            $$49.a($$57, new dlc($$55.o($$56), $$34.J_()));
         }

         return $$49;
      }
   }

   private static void a(csw $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<dlx<ih<cuo>>> a(it<cuo> $$0) {
      return dlw.b($$0.t(), $$0.r(), dlw.d.e, $$0.f(cuv.b));
   }

   public static sn a(and $$0, dld $$1) {
      csw $$2 = $$1.f();
      sn $$3 = tc.g(new sn());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.an());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.X());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", kd.n.b($$1.j()).toString());
      dpt $$4 = $$1.t();
      if ($$4 != null) {
         dpt.e.encodeStart(tb.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      doe $$5 = $$1.x();
      if ($$5 != null) {
         doe.a.encodeStart(tb.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      dmb $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", $$6.b());
      }

      dlp[] $$7 = $$1.d();
      st $$8 = new st();
      eeg $$9 = $$0.l().a();
      it<cuo> $$10 = $$0.I_().d(ke.at);
      Codec<dlx<ih<cuo>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for (int $$13 = $$9.d(); $$13 < $$9.e(); $$13++) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         dlj $$16 = $$9.a(cty.b).a(iz.a($$2, $$13));
         dlj $$17 = $$9.a(cty.a).a(iz.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            sn $$18 = new sn();
            if ($$15) {
               dlp $$19 = $$7[$$14];
               $$18.a("block_states", (tk)h.encodeStart(tb.a, $$19.h()).getOrThrow(false, i::error));
               $$18.a("biomes", (tk)$$11.encodeStart(tb.a, $$19.i()).getOrThrow(false, i::error));
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

      st $$20 = new st();

      for (hx $$21 : $$1.c()) {
         sn $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", $$20);
      if ($$1.j().g() == dli.a.a) {
         dly $$23 = (dly)$$1;
         st $$24 = new st();
         $$24.addAll($$23.E());
         $$3.a("entities", $$24);
         sn $$25 = new sn();

         for (dom.a $$26 : dom.a.values()) {
            dlc $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", $$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", a($$1.n()));
      sn $$28 = new sn();

      for (Entry<doq.a, doq> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a($$29.getKey().a(), new su($$29.getValue().a()));
         }
      }

      $$3.a("Heightmaps", $$28);
      $$3.a("structures", a(dzw.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(and $$0, sn $$1, dld.a $$2) {
      long $$3 = $$0.B_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> kd.e.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> kd.c.b($$0x).toString()));
   }

   public static dli.a a(@Nullable sn $$0) {
      return $$0 != null ? dli.a($$0.l("Status")).g() : dli.a.a;
   }

   @Nullable
   private static dlo.c a(and $$0, sn $$1) {
      st $$2 = a($$1, "entities");
      st $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(blz.a($$2, $$0));
         }

         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sn $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  hx $$7 = dgv.c($$5);
                  dgv $$8 = dgv.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }
      };
   }

   @Nullable
   private static st a(sn $$0, String $$1) {
      st $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static sn a(dzw $$0, csw $$1, Map<dzg, dzo> $$2, Map<dzg, LongSet> $$3) {
      sn $$4 = new sn();
      sn $$5 = new sn();
      it<dzg> $$6 = $$0.b().d(ke.aD);

      for (Entry<dzg, dzo> $$7 : $$2.entrySet()) {
         ahg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      sn $$9 = new sn();

      for (Entry<dzg, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ahg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new su($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<dzg, dzo> a(dzw $$0, sn $$1, long $$2) {
      Map<dzg, dzo> $$3 = Maps.newHashMap();
      it<dzg> $$4 = $$0.b().d(ke.aD);
      sn $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         ahg $$7 = ahg.a($$6);
         dzg $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dzo $$9 = dzo.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dzg, LongSet> a(iu $$0, csw $$1, sn $$2) {
      Map<dzg, LongSet> $$3 = Maps.newHashMap();
      it<dzg> $$4 = $$0.d(ke.aD);
      sn $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         ahg $$7 = ahg.a($$6);
         dzg $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  csw $$3x = new csw($$2x);
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

   public static st a(ShortList[] $$0) {
      st $$1 = new st();

      for (ShortList $$2 : $$0) {
         st $$3 = new st();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while (var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(tf.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
