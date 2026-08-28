import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record edr(
   jr<djy> h,
   dic i,
   int j,
   long k,
   long l,
   ecx m,
   @Nullable ehb.d n,
   @Nullable efm o,
   ect p,
   @Nullable long[] q,
   Map<efy.a, long[]> r,
   ebw.a s,
   ShortList[] t,
   boolean u,
   List<edr.b> v,
   List<tz> w,
   List<tz> x,
   tz y
) {
   private static final Codec<eco<dzz>> z = eco.a(dma.k, dzz.a, eco.d.d, dmc.a.m());
   private static final Logger A = LogUtils.getLogger();
   private static final String B = "UpgradeData";
   private static final String C = "block_ticks";
   private static final String D = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static edr a(dix $$0, js $$1, tz $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dic $$3 = new dic($$2.h("xPos"), $$2.h("zPos"));
         long $$4 = $$2.i("LastUpdate");
         long $$5 = $$2.i("InhabitedTime");
         ecx $$6 = ecx.a($$2.l("Status"));
         ect $$7 = $$2.b("UpgradeData", 10) ? new ect($$2.p("UpgradeData"), $$0) : ect.a;
         boolean $$8 = $$2.q("isLightOn");
         ehb.d $$9 = $$2.<ehb.d>a("blending_data", ehb.d.a).orElse(null);
         efm $$10 = $$2.<efm>a("below_zero_retrogen", efm.a).orElse(null);
         long[] $$11;
         if ($$2.b("carving_mask", 12)) {
            $$11 = $$2.o("carving_mask");
         } else {
            $$11 = null;
         }

         tz $$13 = $$2.p("Heightmaps");
         Map<efy.a, long[]> $$14 = new EnumMap<>(efy.a.class);

         for (efy.a $$15 : $$6.e()) {
            String $$16 = $$15.a();
            if ($$13.b($$16, 12)) {
               $$14.put($$15, $$13.o($$16));
            }
         }

         List<ffz<dma>> $$17 = ffz.a($$2.c("block_ticks", 10), $$0x -> mf.e.b(alg.c($$0x)), $$3);
         List<ffz<ewf>> $$18 = ffz.a($$2.c("fluid_ticks", 10), $$0x -> mf.c.b(alg.c($$0x)), $$3);
         ebw.a $$19 = new ebw.a($$17, $$18);
         uf $$20 = $$2.c("PostProcessing", 9);
         ShortList[] $$21 = new ShortList[$$20.size()];

         for (int $$22 = 0; $$22 < $$20.size(); $$22++) {
            uf $$23 = $$20.b($$22);
            ShortList $$24 = new ShortArrayList($$23.size());

            for (int $$25 = 0; $$25 < $$23.size(); $$25++) {
               $$24.add($$23.d($$25));
            }

            $$21[$$22] = $$24;
         }

         List<tz> $$26 = Lists.transform($$2.c("entities", 10), $$0x -> (tz)$$0x);
         List<tz> $$27 = Lists.transform($$2.c("block_entities", 10), $$0x -> (tz)$$0x);
         tz $$28 = $$2.p("structures");
         uf $$29 = $$2.c("sections", 10);
         List<edr.b> $$30 = new ArrayList<>($$29.size());
         jr<djy> $$31 = $$1.f(mg.aG);
         Codec<ecp<je<djy>>> $$32 = a($$31);

         for (int $$33 = 0; $$33 < $$29.size(); $$33++) {
            tz $$34 = $$29.a($$33);
            int $$35 = $$34.f("Y");
            ech $$40;
            if ($$35 >= $$0.aq() && $$35 <= $$0.ar()) {
               eco<dzz> $$36;
               if ($$34.b("block_states", 10)) {
                  $$36 = (eco<dzz>)z.parse(un.a, $$34.p("block_states")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(edr.a::new);
               } else {
                  $$36 = new eco<>(dma.k, dmc.a.m(), eco.d.d);
               }

               ecp<je<djy>> $$38;
               if ($$34.b("biomes", 10)) {
                  $$38 = (ecp<je<djy>>)$$32.parse(un.a, $$34.p("biomes")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(edr.a::new);
               } else {
                  $$38 = new eco<>($$31.t(), $$31.b(dkf.b), eco.d.e);
               }

               $$40 = new ech($$36, $$38);
            } else {
               $$40 = null;
            }

            ecb $$42 = $$34.b("BlockLight", 7) ? new ecb($$34.m("BlockLight")) : null;
            ecb $$43 = $$34.b("SkyLight", 7) ? new ecb($$34.m("SkyLight")) : null;
            $$30.add(new edr.b($$35, $$40, $$42, $$43));
         }

         return new edr($$31, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$14, $$19, $$21, $$8, $$30, $$26, $$27, $$28);
      }
   }

   public ecq a(arq $$0, cie $$1, edp $$2, dic $$3) {
      if (!Objects.equals($$3, this.i)) {
         A.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      ech[] $$5 = new ech[$$4];
      boolean $$6 = $$0.B_().g();
      eca $$7 = $$0.m();
      evv $$8 = $$7.q();
      jr<djy> $$9 = $$0.F_().f(mg.aG);
      boolean $$10 = false;

      for (edr.b $$11 : this.v) {
         jx $$12 = jx.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.g($$11.a)] = $$11.b;
            $$1.a($$12, $$11.b);
         }

         boolean $$13 = $$11.c != null;
         boolean $$14 = $$6 && $$11.d != null;
         if ($$13 || $$14) {
            if (!$$10) {
               $$8.b($$3, true);
               $$10 = true;
            }

            if ($$13) {
               $$8.a(dje.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dje.a, $$12, $$11.d);
            }
         }
      }

      edb $$15 = this.m.d();
      ebw $$18;
      if ($$15 == edb.b) {
         ffv<dma> $$16 = new ffv<>(this.s.a());
         ffv<ewf> $$17 = new ffv<>(this.s.b());
         $$18 = new ecg($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ehb.a(this.n));
      } else {
         ffy<dma> $$19 = ffy.a(this.s.a());
         ffy<ewf> $$20 = ffy.a(this.s.b());
         ecq $$21 = new ecq($$3, this.p, $$5, $$19, $$20, $$0, $$9, ehb.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(ecx.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<efy.a> $$23 = EnumSet.noneOf(efy.a.class);

      for (efy.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      efy.a($$18, $$23);
      $$18.a(a(erj.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == edb.b) {
         return new ecf((ecg)$$18, false);
      } else {
         ecq $$27 = (ecq)$$18;

         for (tz $$28 : this.w) {
            $$27.b($$28);
         }

         for (tz $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new ebv(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dic $$0, int $$1, String $$2) {
      A.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<ecp<je<djy>>> a(jr<djy> $$0) {
      return eco.b($$0.t(), $$0.r(), eco.d.e, $$0.b(dkf.b));
   }

   public static edr a(arq $$0, ebw $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dic $$2 = $$1.f();
         List<edr.b> $$3 = new ArrayList<>();
         ech[] $$4 = $$1.d();
         evv $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            ecb $$9 = $$5.a(dje.b).a(jx.a($$2, $$6));
            ecb $$10 = $$5.a(dje.a).a(jx.a($$2, $$6));
            ecb $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            ecb $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               ech $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new edr.b($$6, $$13, $$11, $$12));
            }
         }

         List<tz> $$14 = new ArrayList<>($$1.c().size());

         for (iu $$15 : $$1.c()) {
            tz $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tz> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == edb.a) {
            ecq $$19 = (ecq)$$1;
            $$17.addAll($$19.I());
            ebv $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<efy.a, long[]> $$21 = new EnumMap<>(efy.a.class);

         for (Entry<efy.a, efy> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         ebw.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tz $$26 = a(erj.a($$0), $$2, $$1.g(), $$1.h());
         return new edr(
            $$0.F_().f(mg.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            x.a($$1.v(), ehb::a),
            $$1.z(),
            $$1.t().c(),
            $$18,
            $$21,
            $$24,
            $$25,
            $$1.x(),
            $$3,
            $$17,
            $$14,
            $$26
         );
      }
   }

   public tz a() {
      tz $$0 = uo.e(new tz());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mf.l.b(this.m).toString());
      if (this.n != null) {
         $$0.a("blending_data", ehb.d.a, this.n);
      }

      if (this.o != null) {
         $$0.a("below_zero_retrogen", efm.a, this.o);
      }

      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uf $$1 = new uf();
      Codec<ecp<je<djy>>> $$2 = a(this.h);

      for (edr.b $$3 : this.v) {
         tz $$4 = new tz();
         ech $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", z, $$5.h());
            $$4.a("biomes", $$2, $$5.i());
         }

         if ($$3.c != null) {
            $$4.a("BlockLight", $$3.c.a());
         }

         if ($$3.d != null) {
            $$4.a("SkyLight", $$3.d.a());
         }

         if (!$$4.g()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      uf $$6 = new uf();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == edb.a) {
         uf $$7 = new uf();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tz $$8 = new tz();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ug($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tz $$0, ebw.a $$1) {
      uf $$2 = new uf();

      for (ffz<dma> $$3 : $$1.a()) {
         $$2.add($$3.a($$0x -> mf.e.b($$0x).toString()));
      }

      $$0.a("block_ticks", $$2);
      uf $$4 = new uf();

      for (ffz<ewf> $$5 : $$1.b()) {
         $$4.add($$5.a($$0x -> mf.c.b($$0x).toString()));
      }

      $$0.a("fluid_ticks", $$4);
   }

   public static edb a(@Nullable tz $$0) {
      return $$0 != null ? ecx.a($$0.l("Status")).d() : edb.a;
   }

   @Nullable
   private static ecg.c a(arq $$0, List<tz> $$1, List<tz> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwm.a($$1, $$0, bwl.r));
         }

         for (tz $$4 : $$2) {
            boolean $$5 = $$4.q("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               iu $$6 = dwx.b($$4);
               dwx $$7 = dwx.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tz a(erj $$0, dic $$1, Map<eqt, erb> $$2, Map<eqt, LongSet> $$3) {
      tz $$4 = new tz();
      tz $$5 = new tz();
      jr<eqt> $$6 = $$0.b().f(mg.bd);

      for (Entry<eqt, erb> $$7 : $$2.entrySet()) {
         alg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tz $$9 = new tz();

      for (Entry<eqt, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ug($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eqt, erb> a(erj $$0, tz $$1, long $$2) {
      Map<eqt, erb> $$3 = Maps.newHashMap();
      jr<eqt> $$4 = $$0.b().f(mg.bd);
      tz $$5 = $$1.p("starts");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         eqt $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.error("Unknown structure start: {}", $$7);
         } else {
            erb $$9 = erb.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eqt, LongSet> a(js $$0, dic $$1, tz $$2) {
      Map<eqt, LongSet> $$3 = Maps.newHashMap();
      jr<eqt> $$4 = $$0.f(mg.bd);
      tz $$5 = $$2.p("References");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         eqt $$8 = $$4.a($$7);
         if ($$8 == null) {
            A.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dic $$3x = new dic($$2x);
                  if ($$3x.a($$1) > 8) {
                     A.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
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

   private static uf a(ShortList[] $$0) {
      uf $$1 = new uf();

      for (ShortList $$2 : $$0) {
         uf $$3 = new uf();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ur.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public jr<djy> b() {
      return this.h;
   }

   public dic c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public long e() {
      return this.k;
   }

   public long f() {
      return this.l;
   }

   public ecx g() {
      return this.m;
   }

   @Nullable
   public ehb.d h() {
      return this.n;
   }

   @Nullable
   public efm i() {
      return this.o;
   }

   public ect j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<efy.a, long[]> l() {
      return this.r;
   }

   public ebw.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<edr.b> p() {
      return this.v;
   }

   public List<tz> q() {
      return this.w;
   }

   public List<tz> r() {
      return this.x;
   }

   public tz s() {
      return this.y;
   }

   public static class a extends uk {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable ech b, @Nullable ecb c, @Nullable ecb d) {
   }
}
