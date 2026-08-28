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
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record eew(
   js<dla> h,
   djc i,
   int j,
   long k,
   long l,
   eec m,
   @Nullable eig.d n,
   @Nullable egr o,
   edy p,
   @Nullable long[] q,
   Map<ehd.a, long[]> r,
   edb.a s,
   ShortList[] t,
   boolean u,
   List<eew.b> v,
   List<tz> w,
   List<tz> x,
   tz y
) {
   private static final Codec<edt<ebe>> z = edt.a(dnc.k, ebe.a, edt.d.d, dne.a.m());
   private static final Codec<List<fhh<dnc>>> A = fhh.a(mg.e.q()).listOf();
   private static final Codec<List<fhh<exn>>> B = fhh.a(mg.c.q()).listOf();
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
   public static eew a(djz $$0, jt $$1, tz $$2) {
      if ($$2.i("Status").isEmpty()) {
         return null;
      } else {
         djc $$3 = new djc($$2.b("xPos", 0), $$2.b("zPos", 0));
         long $$4 = $$2.b("LastUpdate", 0L);
         long $$5 = $$2.b("InhabitedTime", 0L);
         eec $$6 = $$2.<eec>a("Status", eec.o).orElse(eec.c);
         edy $$7 = $$2.m("UpgradeData").map($$1x -> new edy($$1x, $$0)).orElse(edy.a);
         boolean $$8 = $$2.b("isLightOn", false);
         eig.d $$9 = $$2.<eig.d>a("blending_data", eig.d.a).orElse(null);
         egr $$10 = $$2.<egr>a("below_zero_retrogen", egr.a).orElse(null);
         long[] $$11 = $$2.l("carving_mask").orElse(null);
         Map<ehd.a, long[]> $$12 = new EnumMap<>(ehd.a.class);
         $$2.m("Heightmaps").ifPresent($$2x -> {
            for (ehd.a $$3x : $$6.e()) {
               $$2x.l($$3x.a()).ifPresent($$2xx -> $$12.put($$3x, $$2xx));
            }
         });
         List<fhh<dnc>> $$13 = fhh.a($$2.<List<fhh<dnc>>>a("block_ticks", A).orElse(List.of()), $$3);
         List<fhh<exn>> $$14 = fhh.a($$2.<List<fhh<exn>>>a("fluid_ticks", B).orElse(List.of()), $$3);
         edb.a $$15 = new edb.a($$13, $$14);
         uf $$16 = $$2.p("PostProcessing");
         ShortList[] $$17 = new ShortList[$$16.size()];

         for (int $$18 = 0; $$18 < $$16.size(); $$18++) {
            uf $$19 = $$16.f($$18);
            ShortList $$20 = new ShortArrayList($$19.size());

            for (int $$21 = 0; $$21 < $$19.size(); $$21++) {
               $$20.add($$19.a($$21, (short)0));
            }

            $$17[$$18] = $$20;
         }

         List<tz> $$22 = $$2.o("entities").stream().flatMap(uf::j).toList();
         List<tz> $$23 = $$2.o("block_entities").stream().flatMap(uf::j).toList();
         tz $$24 = $$2.n("structures");
         uf $$25 = $$2.p("sections");
         List<eew.b> $$26 = new ArrayList<>($$25.size());
         js<dla> $$27 = $$1.f(mh.aG);
         Codec<edu<jf<dla>>> $$28 = a($$27);

         for (int $$29 = 0; $$29 < $$25.size(); $$29++) {
            Optional<tz> $$30 = $$25.a($$29);
            if (!$$30.isEmpty()) {
               tz $$31 = $$30.get();
               int $$32 = $$31.b("Y", (byte)0);
               edm $$35;
               if ($$32 >= $$0.aq() && $$32 <= $$0.ar()) {
                  edt<ebe> $$33 = $$31.m("block_states")
                     .map($$2x -> (edt<ebe>)z.parse(un.a, $$2x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(eew.a::new))
                     .orElseGet(() -> new edt<>(dnc.k, dne.a.m(), edt.d.d));
                  edu<jf<dla>> $$34 = $$31.m("biomes")
                     .map($$3x -> (edu<jf<dla>>)$$28.parse(un.a, $$3x).promotePartial($$2xx -> a($$3, $$32, $$2xx)).getOrThrow(eew.a::new))
                     .orElseGet(() -> new edt<>($$27.t(), $$27.b(dlh.b), edt.d.e));
                  $$35 = new edm($$33, $$34);
               } else {
                  $$35 = null;
               }

               edg $$37 = $$31.j("BlockLight").map(edg::new).orElse(null);
               edg $$38 = $$31.j("SkyLight").map(edg::new).orElse(null);
               $$26.add(new eew.b($$32, $$35, $$37, $$38));
            }
         }

         return new eew($$27, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$12, $$15, $$17, $$8, $$26, $$22, $$23, $$24);
      }
   }

   public edv a(ars $$0, ciw $$1, eeu $$2, djc $$3) {
      if (!Objects.equals($$3, this.i)) {
         C.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      edm[] $$5 = new edm[$$4];
      boolean $$6 = $$0.F_().g();
      edf $$7 = $$0.m();
      exd $$8 = $$7.q();
      js<dla> $$9 = $$0.J_().f(mh.aG);
      boolean $$10 = false;

      for (eew.b $$11 : this.v) {
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
               $$8.a(dkg.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(dkg.a, $$12, $$11.d);
            }
         }
      }

      eeg $$15 = this.m.d();
      edb $$18;
      if ($$15 == eeg.b) {
         fhd<dnc> $$16 = new fhd<>(this.s.a());
         fhd<exn> $$17 = new fhd<>(this.s.b());
         $$18 = new edl($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), eig.a(this.n));
      } else {
         fhg<dnc> $$19 = fhg.a(this.s.a());
         fhg<exn> $$20 = fhg.a(this.s.b());
         edv $$21 = new edv($$3, this.p, $$5, $$19, $$20, $$0, $$9, eig.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(eec.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<ehd.a> $$23 = EnumSet.noneOf(ehd.a.class);

      for (ehd.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      ehd.a($$18, $$23);
      $$18.a(a(esr.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.J_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == eeg.b) {
         return new edk((edl)$$18, false);
      } else {
         edv $$27 = (edv)$$18;

         for (tz $$28 : this.w) {
            $$27.b($$28);
         }

         for (tz $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new eda(this.q, $$18.K_()));
         }

         return $$27;
      }
   }

   private static void a(djc $$0, int $$1, String $$2) {
      C.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<edu<jf<dla>>> a(js<dla> $$0) {
      return edt.b($$0.t(), $$0.r(), edt.d.e, $$0.b(dlh.b));
   }

   public static eew a(ars $$0, edb $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         djc $$2 = $$1.f();
         List<eew.b> $$3 = new ArrayList<>();
         edm[] $$4 = $$1.d();
         exd $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            edg $$9 = $$5.a(dkg.b).a(jy.a($$2, $$6));
            edg $$10 = $$5.a(dkg.a).a(jy.a($$2, $$6));
            edg $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            edg $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               edm $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eew.b($$6, $$13, $$11, $$12));
            }
         }

         List<tz> $$14 = new ArrayList<>($$1.c().size());

         for (iv $$15 : $$1.c()) {
            tz $$16 = $$1.a($$15, $$0.J_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tz> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == eeg.a) {
            edv $$19 = (edv)$$1;
            $$17.addAll($$19.I());
            eda $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<ehd.a, long[]> $$21 = new EnumMap<>(ehd.a.class);

         for (Entry<ehd.a, ehd> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         edb.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tz $$26 = a(esr.a($$0), $$2, $$1.g(), $$1.h());
         return new eew(
            $$0.J_().f(mh.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            y.a($$1.v(), eig::a),
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
      $$0.b("blending_data", eig.d.a, this.n);
      $$0.b("below_zero_retrogen", egr.a, this.o);
      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uf $$1 = new uf();
      Codec<edu<jf<dla>>> $$2 = a(this.h);

      for (eew.b $$3 : this.v) {
         tz $$4 = new tz();
         edm $$5 = $$3.b;
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

         if (!$$4.j()) {
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
      if (this.m.d() == eeg.a) {
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

   private static void a(tz $$0, edb.a $$1) {
      $$0.a("block_ticks", A, $$1.a());
      $$0.a("fluid_ticks", B, $$1.b());
   }

   public static eec a(@Nullable tz $$0) {
      return $$0 != null ? $$0.<eec>a("Status", eec.o).orElse(eec.c) : eec.c;
   }

   @Nullable
   private static edl.c a(ars $$0, List<tz> $$1, List<tz> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bxc.a($$1, $$0, bxb.r));
         }

         for (tz $$4 : $$2) {
            boolean $$5 = $$4.b("keepPacked", false);
            if ($$5) {
               $$3.a($$4);
            } else {
               iv $$6 = dyc.b($$4);
               dyc $$7 = dyc.a($$6, $$3.a_($$6), $$4, $$0.J_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tz a(esr $$0, djc $$1, Map<esb, esj> $$2, Map<esb, LongSet> $$3) {
      tz $$4 = new tz();
      tz $$5 = new tz();
      js<esb> $$6 = $$0.b().f(mh.be);

      for (Entry<esb, esj> $$7 : $$2.entrySet()) {
         ali $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tz $$9 = new tz();

      for (Entry<esb, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            ali $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), $$10.getValue().toLongArray());
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<esb, esj> a(esr $$0, tz $$1, long $$2) {
      Map<esb, esj> $$3 = Maps.newHashMap();
      js<esb> $$4 = $$0.b().f(mh.be);
      tz $$5 = $$1.n("starts");

      for (String $$6 : $$5.e()) {
         ali $$7 = ali.c($$6);
         esb $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.error("Unknown structure start: {}", $$7);
         } else {
            esj $$9 = esj.a($$0, $$5.n($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<esb, LongSet> a(jt $$0, djc $$1, tz $$2) {
      Map<esb, LongSet> $$3 = Maps.newHashMap();
      js<esb> $$4 = $$0.f(mh.be);
      tz $$5 = $$2.n("References");
      $$5.a((BiConsumer<String, uy>)(($$3x, $$4x) -> {
         ali $$5x = ali.c($$3x);
         esb $$6 = $$4.a($$5x);
         if ($$6 == null) {
            C.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$5x, $$1);
         } else {
            Optional<long[]> $$7 = $$4x.r_();
            if (!$$7.isEmpty()) {
               $$3.put($$6, new LongOpenHashSet(Arrays.stream($$7.get()).filter($$2xx -> {
                  djc $$3xx = new djc($$2xx);
                  if ($$3xx.a($$1) > 8) {
                     C.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$5x, $$3xx, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }));
      return $$3;
   }

   private static uf a(ShortList[] $$0) {
      uf $$1 = new uf();

      for (ShortList $$2 : $$0) {
         uf $$3 = new uf();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(us.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public js<dla> b() {
      return this.h;
   }

   public djc c() {
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

   public eec g() {
      return this.m;
   }

   @Nullable
   public eig.d h() {
      return this.n;
   }

   @Nullable
   public egr i() {
      return this.o;
   }

   public edy j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<ehd.a, long[]> l() {
      return this.r;
   }

   public edb.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eew.b> p() {
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

   public static record b(int a, @Nullable edm b, @Nullable edg c, @Nullable edg d) {
   }
}
