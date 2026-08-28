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

public record eeg(
   js<dkk> h,
   dio i,
   int j,
   long k,
   long l,
   edm m,
   @Nullable ehq.d n,
   @Nullable egb o,
   edi p,
   @Nullable long[] q,
   Map<egn.a, long[]> r,
   ecl.a s,
   ShortList[] t,
   boolean u,
   List<eeg.b> v,
   List<tz> w,
   List<tz> x,
   tz y
) {
   private static final Codec<edd<eao>> z = edd.a(dmm.k, eao.a, edd.d.d, dmo.a.m());
   private static final Codec<List<fgo<dmm>>> A = fgo.a(mg.e.q()).listOf();
   private static final Codec<List<fgo<ewu>>> B = fgo.a(mg.c.q()).listOf();
   private static final Logger C = LogUtils.getLogger();
   private static final String D = "UpgradeData";
   private static final String E = "block_ticks";
   private static final String F = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static eeg a(djj $$0, jt $$1, tz $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dio $$3 = new dio($$2.f("xPos"), $$2.f("zPos"));
         long $$4 = $$2.g("LastUpdate");
         long $$5 = $$2.g("InhabitedTime");
         edm $$6 = $$2.<edm>a("Status", edm.o).orElse(edm.c);
         edi $$7 = $$2.b("UpgradeData", 10) ? new edi($$2.n("UpgradeData"), $$0) : edi.a;
         boolean $$8 = $$2.o("isLightOn");
         ehq.d $$9 = $$2.<ehq.d>a("blending_data", ehq.d.a).orElse(null);
         egb $$10 = $$2.<egb>a("below_zero_retrogen", egb.a).orElse(null);
         long[] $$11;
         if ($$2.b("carving_mask", 12)) {
            $$11 = $$2.m("carving_mask");
         } else {
            $$11 = null;
         }

         tz $$13 = $$2.n("Heightmaps");
         Map<egn.a, long[]> $$14 = new EnumMap<>(egn.a.class);

         for (egn.a $$15 : $$6.e()) {
            String $$16 = $$15.a();
            if ($$13.b($$16, 12)) {
               $$14.put($$15, $$13.m($$16));
            }
         }

         List<fgo<dmm>> $$17 = fgo.a($$2.<List<fgo<dmm>>>a("block_ticks", A).orElse(List.of()), $$3);
         List<fgo<ewu>> $$18 = fgo.a($$2.<List<fgo<ewu>>>a("fluid_ticks", B).orElse(List.of()), $$3);
         ecl.a $$19 = new ecl.a($$17, $$18);
         uf $$20 = $$2.d("PostProcessing", 9);
         ShortList[] $$21 = new ShortList[$$20.size()];

         for (int $$22 = 0; $$22 < $$20.size(); $$22++) {
            uf $$23 = $$20.b($$22);
            ShortList $$24 = new ShortArrayList($$23.size());

            for (int $$25 = 0; $$25 < $$23.size(); $$25++) {
               $$24.add($$23.d($$25));
            }

            $$21[$$22] = $$24;
         }

         List<tz> $$26 = Lists.transform($$2.d("entities", 10), $$0x -> (tz)$$0x);
         List<tz> $$27 = Lists.transform($$2.d("block_entities", 10), $$0x -> (tz)$$0x);
         tz $$28 = $$2.n("structures");
         uf $$29 = $$2.d("sections", 10);
         List<eeg.b> $$30 = new ArrayList<>($$29.size());
         js<dkk> $$31 = $$1.f(mh.aG);
         Codec<ede<jf<dkk>>> $$32 = a($$31);

         for (int $$33 = 0; $$33 < $$29.size(); $$33++) {
            tz $$34 = $$29.a($$33);
            int $$35 = $$34.d("Y");
            ecw $$40;
            if ($$35 >= $$0.aq() && $$35 <= $$0.ar()) {
               edd<eao> $$36;
               if ($$34.b("block_states", 10)) {
                  $$36 = (edd<eao>)z.parse(un.a, $$34.n("block_states")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(eeg.a::new);
               } else {
                  $$36 = new edd<>(dmm.k, dmo.a.m(), edd.d.d);
               }

               ede<jf<dkk>> $$38;
               if ($$34.b("biomes", 10)) {
                  $$38 = (ede<jf<dkk>>)$$32.parse(un.a, $$34.n("biomes")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(eeg.a::new);
               } else {
                  $$38 = new edd<>($$31.t(), $$31.b(dkr.b), edd.d.e);
               }

               $$40 = new ecw($$36, $$38);
            } else {
               $$40 = null;
            }

            ecq $$42 = $$34.b("BlockLight", 7) ? new ecq($$34.k("BlockLight")) : null;
            ecq $$43 = $$34.b("SkyLight", 7) ? new ecq($$34.k("SkyLight")) : null;
            $$30.add(new eeg.b($$35, $$40, $$42, $$43));
         }

         return new eeg($$31, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$14, $$19, $$21, $$8, $$30, $$26, $$27, $$28);
      }
   }

   public edf a(arq $$0, cil $$1, eee $$2, dio $$3) {
      if (!Objects.equals($$3, this.i)) {
         C.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      ecw[] $$5 = new ecw[$$4];
      boolean $$6 = $$0.B_().g();
      ecp $$7 = $$0.m();
      ewk $$8 = $$7.q();
      js<dkk> $$9 = $$0.F_().f(mh.aG);
      boolean $$10 = false;

      for (eeg.b $$11 : this.v) {
         jy $$12 = jy.a($$3, $$11.a);
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
               $$8.a(djq.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(djq.a, $$12, $$11.d);
            }
         }
      }

      edq $$15 = this.m.d();
      ecl $$18;
      if ($$15 == edq.b) {
         fgk<dmm> $$16 = new fgk<>(this.s.a());
         fgk<ewu> $$17 = new fgk<>(this.s.b());
         $$18 = new ecv($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ehq.a(this.n));
      } else {
         fgn<dmm> $$19 = fgn.a(this.s.a());
         fgn<ewu> $$20 = fgn.a(this.s.b());
         edf $$21 = new edf($$3, this.p, $$5, $$19, $$20, $$0, $$9, ehq.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(edm.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<egn.a> $$23 = EnumSet.noneOf(egn.a.class);

      for (egn.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      egn.a($$18, $$23);
      $$18.a(a(ery.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == edq.b) {
         return new ecu((ecv)$$18, false);
      } else {
         edf $$27 = (edf)$$18;

         for (tz $$28 : this.w) {
            $$27.b($$28);
         }

         for (tz $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new eck(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dio $$0, int $$1, String $$2) {
      C.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<ede<jf<dkk>>> a(js<dkk> $$0) {
      return edd.b($$0.t(), $$0.r(), edd.d.e, $$0.b(dkr.b));
   }

   public static eeg a(arq $$0, ecl $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dio $$2 = $$1.f();
         List<eeg.b> $$3 = new ArrayList<>();
         ecw[] $$4 = $$1.d();
         ewk $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            ecq $$9 = $$5.a(djq.b).a(jy.a($$2, $$6));
            ecq $$10 = $$5.a(djq.a).a(jy.a($$2, $$6));
            ecq $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            ecq $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               ecw $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eeg.b($$6, $$13, $$11, $$12));
            }
         }

         List<tz> $$14 = new ArrayList<>($$1.c().size());

         for (iv $$15 : $$1.c()) {
            tz $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tz> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == edq.a) {
            edf $$19 = (edf)$$1;
            $$17.addAll($$19.I());
            eck $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<egn.a, long[]> $$21 = new EnumMap<>(egn.a.class);

         for (Entry<egn.a, egn> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         ecl.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tz $$26 = a(ery.a($$0), $$2, $$1.g(), $$1.h());
         return new eeg(
            $$0.F_().f(mh.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            y.a($$1.v(), ehq::a),
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
      $$0.a("Status", mg.l.b(this.m).toString());
      $$0.b("blending_data", ehq.d.a, this.n);
      $$0.b("below_zero_retrogen", egb.a, this.o);
      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uf $$1 = new uf();
      Codec<ede<jf<dkk>>> $$2 = a(this.h);

      for (eeg.b $$3 : this.v) {
         tz $$4 = new tz();
         ecw $$5 = $$3.b;
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
      if (this.m.d() == edq.a) {
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

   private static void a(tz $$0, ecl.a $$1) {
      $$0.a("block_ticks", A, $$1.a());
      $$0.a("fluid_ticks", B, $$1.b());
   }

   public static edm a(@Nullable tz $$0) {
      return $$0 != null ? $$0.<edm>a("Status", edm.o).orElse(edm.c) : edm.c;
   }

   @Nullable
   private static ecv.c a(arq $$0, List<tz> $$1, List<tz> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwr.a($$1, $$0, bwq.r));
         }

         for (tz $$4 : $$2) {
            boolean $$5 = $$4.o("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               iv $$6 = dxm.b($$4);
               dxm $$7 = dxm.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tz a(ery $$0, dio $$1, Map<eri, erq> $$2, Map<eri, LongSet> $$3) {
      tz $$4 = new tz();
      tz $$5 = new tz();
      js<eri> $$6 = $$0.b().f(mh.be);

      for (Entry<eri, erq> $$7 : $$2.entrySet()) {
         alg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tz $$9 = new tz();

      for (Entry<eri, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ug($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<eri, erq> a(ery $$0, tz $$1, long $$2) {
      Map<eri, erq> $$3 = Maps.newHashMap();
      js<eri> $$4 = $$0.b().f(mh.be);
      tz $$5 = $$1.n("starts");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         eri $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.error("Unknown structure start: {}", $$7);
         } else {
            erq $$9 = erq.a($$0, $$5.n($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<eri, LongSet> a(jt $$0, dio $$1, tz $$2) {
      Map<eri, LongSet> $$3 = Maps.newHashMap();
      js<eri> $$4 = $$0.f(mh.be);
      tz $$5 = $$2.n("References");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         eri $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.m($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dio $$3x = new dio($$2x);
                  if ($$3x.a($$1) > 8) {
                     C.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
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

   public js<dkk> b() {
      return this.h;
   }

   public dio c() {
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

   public edm g() {
      return this.m;
   }

   @Nullable
   public ehq.d h() {
      return this.n;
   }

   @Nullable
   public egb i() {
      return this.o;
   }

   public edi j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<egn.a, long[]> l() {
      return this.r;
   }

   public ecl.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eeg.b> p() {
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

   public static record b(int a, @Nullable ecw b, @Nullable ecq c, @Nullable ecq d) {
   }
}
