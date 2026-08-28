import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class fou {
   final Consumer<foz> b;
   final fox c;
   final BiConsumer<ald, fpl> d;
   final List<dku> e = ImmutableList.of(dkw.eL, dkw.eR, dkw.iw);
   final Map<dku, fou.b> f = ImmutableMap.builder().put(dkw.b, fou::a).put(dkw.tp, fou::c).put(dkw.fa, fou::b).build();
   final Map<dku, fpr> g = ImmutableMap.builder()
      .put(dkw.bc, fpr.C.get(dkw.bc))
      .put(dkw.jN, fpr.C.get(dkw.jN))
      .put(dkw.kr, fpr.a(fpp.a(dkw.bc, "_top")))
      .put(dkw.kt, fpr.a(fpp.a(dkw.jN, "_top")))
      .put(dkw.be, fpr.d.get(dkw.bc).a($$0x -> $$0x.a(fpq.i, fpp.J(dkw.be))))
      .put(dkw.jP, fpr.d.get(dkw.jN).a($$0x -> $$0x.a(fpq.i, fpp.J(dkw.jP))))
      .put(dkw.hA, fpr.d.get(dkw.hA))
      .put(dkw.ks, fpr.a(fpp.a(dkw.hA, "_bottom")))
      .put(dkw.pV, fpr.D.get(dkw.pV))
      .put(dkw.tp, fpr.D.get(dkw.tp))
      .put(dkw.hB, fpr.d.get(dkw.hB).a($$0x -> $$0x.a(fpq.i, fpp.J(dkw.hB))))
      .put(dkw.bd, fpr.d.get(dkw.bd).a($$0x -> {
         $$0x.a(fpq.d, fpp.a(dkw.bc, "_top"));
         $$0x.a(fpq.i, fpp.J(dkw.bd));
      }))
      .put(dkw.jO, fpr.d.get(dkw.jO).a($$0x -> {
         $$0x.a(fpq.d, fpp.a(dkw.jN, "_top"));
         $$0x.a(fpq.i, fpp.J(dkw.jO));
      }))
      .put(dkw.rq, fpr.D.get(dkw.rq))
      .put(dkw.rl, fpr.D.get(dkw.rl))
      .build();
   static final Map<mh.b, BiConsumer<fou.a, dku>> h = ImmutableMap.builder()
      .put(mh.b.a, fou.a::a)
      .put(mh.b.e, fou.a::l)
      .put(mh.b.b, fou.a::k)
      .put(mh.b.c, fou.a::k)
      .put(mh.b.f, fou.a::c)
      .put(mh.b.g, fou.a::d)
      .put(mh.b.h, fou.a::e)
      .put(mh.b.i, fou.a::f)
      .put(mh.b.k, fou.a::h)
      .put(mh.b.l, fou.a::i)
      .put(mh.b.m, fou.a::j)
      .put(mh.b.n, fou.a::g)
      .put(mh.b.p, fou.a::m)
      .put(mh.b.q, fou.a::b)
      .build();
   public static final List<Pair<jo, Function<ald, fpf>>> a = List.of(
      Pair.of(jo.c, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0)),
      Pair.of(jo.f, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b).a(fpg.d, true)),
      Pair.of(jo.d, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c).a(fpg.d, true)),
      Pair.of(jo.e, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d).a(fpg.d, true)),
      Pair.of(jo.b, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.d).a(fpg.d, true)),
      Pair.of(jo.a, (Function<ald, fpf>)$$0 -> fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.b).a(fpg.d, true))
   );
   private static final Map<fou.c, ald> i = new HashMap<>();

   private static foz a(dku $$0, ald $$1, fpp $$2, BiConsumer<ald, fpl> $$3) {
      ald $$4 = fpo.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static foz b(dku $$0, ald $$1, fpp $$2, BiConsumer<ald, fpl> $$3) {
      ald $$4 = fpo.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static foz c(dku $$0, ald $$1, fpp $$2, BiConsumer<ald, fpl> $$3) {
      ald $$4 = fpo.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fou(Consumer<foz> $$0, fox $$1, BiConsumer<ald, fpl> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cxu $$0, ald $$1) {
      this.c.a($$0, fpk.a($$1));
   }

   void a(dku $$0, ald $$1) {
      this.c.a($$0.i(), fpk.a($$1));
   }

   private void a(dku $$0, ald $$1, fon $$2) {
      this.c.a($$0.i(), fpk.a($$1, $$2));
   }

   private ald a(cxu $$0) {
      return fpo.bI.a(fpm.a($$0), fpp.b($$0), this.d);
   }

   ald a(cxu $$0, dku $$1) {
      return fpo.bI.a(fpm.a($$0), fpp.I($$1), this.d);
   }

   private ald a(cxu $$0, dku $$1, String $$2) {
      return fpo.bI.a(fpm.a($$0), fpp.k(fpp.a($$1, $$2)), this.d);
   }

   ald b(cxu $$0, dku $$1, String $$2) {
      ald $$3 = fpp.J($$1);
      ald $$4 = fpp.a($$1, $$2);
      return fpo.bM.a(fpm.a($$0), fpp.c($$3, $$4), this.d);
   }

   void b(cxu $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dku $$0) {
      cxu $$1 = $$0.i();
      if ($$1 != cyc.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dku $$0, String $$1) {
      cxu $$2 = $$0.i();
      if ($$2 != cyc.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dku $$0, String $$1) {
      cxu $$2 = $$0.i();
      if ($$2 != cyc.a) {
         ald $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fpd b() {
      return fpd.a(dzc.T).a(jo.f, fpf.a().a(fpg.b, fpg.a.b)).a(jo.d, fpf.a().a(fpg.b, fpg.a.c)).a(jo.e, fpf.a().a(fpg.b, fpg.a.d)).a(jo.c, fpf.a());
   }

   private static fpd c() {
      return fpd.a(dzc.T).a(jo.d, fpf.a()).a(jo.e, fpf.a().a(fpg.b, fpg.a.b)).a(jo.c, fpf.a().a(fpg.b, fpg.a.c)).a(jo.f, fpf.a().a(fpg.b, fpg.a.d));
   }

   private static fpd d() {
      return fpd.a(dzc.T).a(jo.f, fpf.a()).a(jo.d, fpf.a().a(fpg.b, fpg.a.b)).a(jo.e, fpf.a().a(fpg.b, fpg.a.c)).a(jo.c, fpf.a().a(fpg.b, fpg.a.d));
   }

   private static fpd e() {
      return fpd.a(dzc.R)
         .a(jo.a, fpf.a().a(fpg.a, fpg.a.b))
         .a(jo.b, fpf.a().a(fpg.a, fpg.a.d))
         .a(jo.c, fpf.a())
         .a(jo.d, fpf.a().a(fpg.b, fpg.a.c))
         .a(jo.e, fpf.a().a(fpg.b, fpg.a.d))
         .a(jo.f, fpf.a().a(fpg.b, fpg.a.b));
   }

   private static fpc b(dku $$0, ald $$1) {
      return fpc.a($$0, a($$1));
   }

   private static fpf[] a(ald $$0) {
      return new fpf[]{
         fpf.a().a(fpg.c, $$0), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d)
      };
   }

   private static fpc a(dku $$0, ald $$1, ald $$2) {
      return fpc.a($$0, fpf.a().a(fpg.c, $$1), fpf.a().a(fpg.c, $$2), fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c));
   }

   private static fpd a(dzd $$0, ald $$1, ald $$2) {
      return fpd.a($$0).a(true, fpf.a().a(fpg.c, $$1)).a(false, fpf.a().a(fpg.c, $$2));
   }

   private void d(dku $$0) {
      ald $$1 = fpr.a.create($$0, this.d);
      ald $$2 = fpr.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(dku $$0) {
      ald $$1 = fpr.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(dku $$0) {
      this.b.accept(fpc.a($$0).a(fpd.a(dzc.by).a($$1 -> {
         String $$2 = "_" + $$1;
         ald $$3 = fpp.a($$0, $$2);
         return fpf.a().a(fpg.c, fpo.c.a($$0, $$2, new fpp().a(fpq.a, $$3), this.d));
      })));
      this.a($$0, fpm.a($$0, "_0"));
   }

   static foz b(dku $$0, ald $$1, ald $$2) {
      return fpc.a($$0)
         .a(fpd.a(dzc.A).a(false, fpf.a().a(fpg.c, $$1)).a(true, fpf.a().a(fpg.c, $$2)))
         .a(
            fpd.a(dzc.X, dzc.T)
               .a(dyx.a, jo.f, fpf.a().a(fpg.b, fpg.a.b))
               .a(dyx.a, jo.e, fpf.a().a(fpg.b, fpg.a.d))
               .a(dyx.a, jo.d, fpf.a().a(fpg.b, fpg.a.c))
               .a(dyx.a, jo.c, fpf.a())
               .a(dyx.b, jo.f, fpf.a().a(fpg.b, fpg.a.b).a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(dyx.b, jo.e, fpf.a().a(fpg.b, fpg.a.d).a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(dyx.b, jo.d, fpf.a().a(fpg.b, fpg.a.c).a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(dyx.b, jo.c, fpf.a().a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(dyx.c, jo.f, fpf.a().a(fpg.b, fpg.a.d).a(fpg.a, fpg.a.c))
               .a(dyx.c, jo.e, fpf.a().a(fpg.b, fpg.a.b).a(fpg.a, fpg.a.c))
               .a(dyx.c, jo.d, fpf.a().a(fpg.a, fpg.a.c))
               .a(dyx.c, jo.c, fpf.a().a(fpg.b, fpg.a.c).a(fpg.a, fpg.a.c))
         );
   }

   private static fpd.d<jo, dzi, dzh, Boolean> a(fpd.d<jo, dzi, dzh, Boolean> $$0, dzi $$1, ald $$2, ald $$3, ald $$4, ald $$5) {
      return $$0.a(jo.f, $$1, dzh.a, false, fpf.a().a(fpg.c, $$2))
         .a(jo.d, $$1, dzh.a, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b))
         .a(jo.e, $$1, dzh.a, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c))
         .a(jo.c, $$1, dzh.a, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d))
         .a(jo.f, $$1, dzh.b, false, fpf.a().a(fpg.c, $$4))
         .a(jo.d, $$1, dzh.b, false, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b))
         .a(jo.e, $$1, dzh.b, false, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.c))
         .a(jo.c, $$1, dzh.b, false, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.d))
         .a(jo.f, $$1, dzh.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
         .a(jo.d, $$1, dzh.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
         .a(jo.e, $$1, dzh.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
         .a(jo.c, $$1, dzh.a, true, fpf.a().a(fpg.c, $$3))
         .a(jo.f, $$1, dzh.b, true, fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.d))
         .a(jo.d, $$1, dzh.b, true, fpf.a().a(fpg.c, $$5))
         .a(jo.e, $$1, dzh.b, true, fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.b))
         .a(jo.c, $$1, dzh.b, true, fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.c));
   }

   private static foz a(dku $$0, ald $$1, ald $$2, ald $$3, ald $$4, ald $$5, ald $$6, ald $$7, ald $$8) {
      return fpc.a($$0).a(a(a(fpd.a(dzc.T, dzc.ah, dzc.bh, dzc.y), dzi.b, $$1, $$2, $$3, $$4), dzi.a, $$5, $$6, $$7, $$8));
   }

   static foz a(dku $$0, ald $$1, ald $$2, ald $$3, ald $$4, ald $$5) {
      return fpb.a($$0)
         .a(fpf.a().a(fpg.c, $$1))
         .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$2).a(fpg.d, false))
         .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$3).a(fpg.d, false))
         .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$4).a(fpg.d, false))
         .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$5).a(fpg.d, false));
   }

   static foz c(dku $$0, ald $$1, ald $$2) {
      return fpb.a($$0)
         .a(fpf.a().a(fpg.c, $$1))
         .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$2).a(fpg.d, true))
         .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b).a(fpg.d, true))
         .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c).a(fpg.d, true))
         .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d).a(fpg.d, true));
   }

   static foz a(dku $$0, ald $$1, ald $$2, ald $$3) {
      return fpb.a($$0)
         .a(fpa.a().a(dzc.L, true), fpf.a().a(fpg.c, $$1))
         .a(fpa.a().a(dzc.aa, dzz.b), fpf.a().a(fpg.c, $$2).a(fpg.d, true))
         .a(fpa.a().a(dzc.Z, dzz.b), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b).a(fpg.d, true))
         .a(fpa.a().a(dzc.ab, dzz.b), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c).a(fpg.d, true))
         .a(fpa.a().a(dzc.ac, dzz.b), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d).a(fpg.d, true))
         .a(fpa.a().a(dzc.aa, dzz.c), fpf.a().a(fpg.c, $$3).a(fpg.d, true))
         .a(fpa.a().a(dzc.Z, dzz.c), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b).a(fpg.d, true))
         .a(fpa.a().a(dzc.ab, dzz.c), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c).a(fpg.d, true))
         .a(fpa.a().a(dzc.ac, dzz.c), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d).a(fpg.d, true));
   }

   static foz a(dku $$0, ald $$1, ald $$2, ald $$3, ald $$4, boolean $$5) {
      return fpc.a($$0, fpf.a().a(fpg.d, $$5))
         .a(c())
         .a(
            fpd.a(dzc.t, dzc.y)
               .a(false, false, fpf.a().a(fpg.c, $$2))
               .a(true, false, fpf.a().a(fpg.c, $$4))
               .a(false, true, fpf.a().a(fpg.c, $$1))
               .a(true, true, fpf.a().a(fpg.c, $$3))
         );
   }

   static foz b(dku $$0, ald $$1, ald $$2, ald $$3) {
      return fpc.a($$0)
         .a(
            fpd.a(dzc.T, dzc.ai, dzc.bl)
               .a(jo.f, dzl.b, dzv.a, fpf.a().a(fpg.c, $$2))
               .a(jo.e, dzl.b, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.b, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.b, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.f, dzl.b, dzv.e, fpf.a().a(fpg.c, $$3))
               .a(jo.e, dzl.b, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.b, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.b, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.f, dzl.b, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.e, dzl.b, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.d, dzl.b, dzv.d, fpf.a().a(fpg.c, $$3))
               .a(jo.c, dzl.b, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.f, dzl.b, dzv.c, fpf.a().a(fpg.c, $$1))
               .a(jo.e, dzl.b, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.b, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.b, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.f, dzl.b, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.e, dzl.b, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.d, dzl.b, dzv.b, fpf.a().a(fpg.c, $$1))
               .a(jo.c, dzl.b, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.f, dzl.a, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.c).a(fpg.d, true))
               .a(jo.e, dzl.a, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.a, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.a, dzv.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.f, dzl.a, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.e, dzl.a, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.d, dzl.a, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.c, dzl.a, dzv.e, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.d, true))
               .a(jo.f, dzl.a, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.d, true))
               .a(jo.e, dzl.a, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.a, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.a, dzv.d, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.f, dzl.a, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.e, dzl.a, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(jo.d, dzl.a, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.c, dzl.a, dzv.c, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.d, true))
               .a(jo.f, dzl.a, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.d, true))
               .a(jo.e, dzl.a, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(jo.d, dzl.a, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(jo.c, dzl.a, dzv.b, fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d).a(fpg.d, true))
         );
   }

   private static foz c(dku $$0, ald $$1, ald $$2, ald $$3) {
      return fpc.a($$0)
         .a(
            fpd.a(dzc.T, dzc.ai, dzc.y)
               .a(jo.c, dzl.b, false, fpf.a().a(fpg.c, $$2))
               .a(jo.d, dzl.b, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c))
               .a(jo.f, dzl.b, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b))
               .a(jo.e, dzl.b, false, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d))
               .a(jo.c, dzl.a, false, fpf.a().a(fpg.c, $$1))
               .a(jo.d, dzl.a, false, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c))
               .a(jo.f, dzl.a, false, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b))
               .a(jo.e, dzl.a, false, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d))
               .a(jo.c, dzl.b, true, fpf.a().a(fpg.c, $$3))
               .a(jo.d, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
               .a(jo.f, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
               .a(jo.e, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
               .a(jo.c, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c))
               .a(jo.d, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.a))
               .a(jo.f, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d))
               .a(jo.e, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b))
         );
   }

   private static foz d(dku $$0, ald $$1, ald $$2, ald $$3) {
      return fpc.a($$0)
         .a(
            fpd.a(dzc.T, dzc.ai, dzc.y)
               .a(jo.c, dzl.b, false, fpf.a().a(fpg.c, $$2))
               .a(jo.d, dzl.b, false, fpf.a().a(fpg.c, $$2))
               .a(jo.f, dzl.b, false, fpf.a().a(fpg.c, $$2))
               .a(jo.e, dzl.b, false, fpf.a().a(fpg.c, $$2))
               .a(jo.c, dzl.a, false, fpf.a().a(fpg.c, $$1))
               .a(jo.d, dzl.a, false, fpf.a().a(fpg.c, $$1))
               .a(jo.f, dzl.a, false, fpf.a().a(fpg.c, $$1))
               .a(jo.e, dzl.a, false, fpf.a().a(fpg.c, $$1))
               .a(jo.c, dzl.b, true, fpf.a().a(fpg.c, $$3))
               .a(jo.d, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
               .a(jo.f, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
               .a(jo.e, dzl.b, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
               .a(jo.c, dzl.a, true, fpf.a().a(fpg.c, $$3))
               .a(jo.d, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
               .a(jo.f, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
               .a(jo.e, dzl.a, true, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
         );
   }

   static fpc c(dku $$0, ald $$1) {
      return fpc.a($$0, fpf.a().a(fpg.c, $$1));
   }

   private static fpd f() {
      return fpd.a(dzc.K).a(jo.a.b, fpf.a()).a(jo.a.c, fpf.a().a(fpg.a, fpg.a.b)).a(jo.a.a, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b));
   }

   static foz a(dku $$0, fpp $$1, BiConsumer<ald, fpl> $$2) {
      ald $$3 = fpo.g.a($$0, $$1, $$2);
      ald $$4 = fpo.h.a($$0, $$1, $$2);
      ald $$5 = fpo.i.a($$0, $$1, $$2);
      ald $$6 = fpo.j.a($$0, $$1, $$2);
      return fpc.a($$0, fpf.a().a(fpg.c, $$6))
         .a(fpd.a(dzc.K).a(jo.a.a, fpf.a().a(fpg.c, $$3)).a(jo.a.b, fpf.a().a(fpg.c, $$4)).a(jo.a.c, fpf.a().a(fpg.c, $$5)));
   }

   static foz d(dku $$0, ald $$1) {
      return fpc.a($$0, fpf.a().a(fpg.c, $$1)).a(f());
   }

   private void e(dku $$0, ald $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dku $$0, fpr.a $$1) {
      ald $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(dku $$0, fpr.a $$1) {
      ald $$2 = $$1.create($$0, this.d);
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, $$2)).a(b()));
   }

   static foz d(dku $$0, ald $$1, ald $$2) {
      return fpc.a($$0)
         .a(
            fpd.a(dzc.K)
               .a(jo.a.b, fpf.a().a(fpg.c, $$1))
               .a(jo.a.c, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b))
               .a(jo.a.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
         );
   }

   private void a(dku $$0, fpr.a $$1, fpr.a $$2) {
      ald $$3 = $$1.create($$0, this.d);
      ald $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(dku $$0) {
      ald $$1 = fpr.A.create($$0, this.d);
      ald $$2 = fpr.B.create($$0, this.d);
      ald $$3 = this.a(fpr.A, $$0, "_awake");
      ald $$4 = this.a(fpr.B, $$0, "_awake");
      ald $$5 = this.a(fpr.A, $$0, "_dormant");
      ald $$6 = this.a(fpr.B, $$0, "_dormant");
      this.b
         .accept(
            fpc.a($$0)
               .a(
                  fpd.a(dzc.K, dmp.c)
                     .a(jo.a.b, dzg.a, fpf.a().a(fpg.c, $$1))
                     .a(jo.a.c, dzg.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b))
                     .a(jo.a.a, dzg.a, fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
                     .a(jo.a.b, dzg.b, fpf.a().a(fpg.c, $$5))
                     .a(jo.a.c, dzg.b, fpf.a().a(fpg.c, $$6).a(fpg.a, fpg.a.b))
                     .a(jo.a.a, dzg.b, fpf.a().a(fpg.c, $$6).a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
                     .a(jo.a.b, dzg.c, fpf.a().a(fpg.c, $$3))
                     .a(jo.a.c, dzg.c, fpf.a().a(fpg.c, $$4).a(fpg.a, fpg.a.b))
                     .a(jo.a.a, dzg.c, fpf.a().a(fpg.c, $$4).a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
               )
         );
   }

   private ald a(fpr.a $$0, dku $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fpq.i, fpp.a($$1, $$2)).a(fpq.d, fpp.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.d);
   }

   private ald a(dku $$0, String $$1, fpn $$2, Function<ald, fpp> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fpp.a($$0, $$1)), this.d);
   }

   static foz e(dku $$0, ald $$1, ald $$2) {
      return fpc.a($$0).a(a(dzc.A, $$2, $$1));
   }

   static foz e(dku $$0, ald $$1, ald $$2, ald $$3) {
      return fpc.a($$0).a(fpd.a(dzc.bk).a(dzu.b, fpf.a().a(fpg.c, $$1)).a(dzu.a, fpf.a().a(fpg.c, $$2)).a(dzu.c, fpf.a().a(fpg.c, $$3)));
   }

   public void a(dku $$0) {
      this.b($$0, fpr.a);
   }

   public void b(dku $$0, fpr.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(dku $$0, fpr.a $$1, int $$2) {
      ald $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fpk.a($$2));
   }

   private void g() {
      this.K(dkw.ft);
      ald $$0 = this.a(cyc.gm, dkw.ft);
      this.a(dkw.ft, $$0, fpk.a(-12012264));
   }

   private void h(dku $$0) {
      ald $$1 = this.a($$0.i(), $$0);
      this.a($$0, $$1, new fom());
   }

   private fou.a i(dku $$0) {
      fpr $$1 = this.g.getOrDefault($$0, fpr.a.get($$0));
      return new fou.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dku $$0, dku $$1, dku $$2) {
      ald $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.i());
   }

   void j(dku $$0) {
      fpp $$1 = fpp.w($$0);
      ald $$2 = fpo.v.a($$0, $$1, this.d);
      ald $$3 = fpo.w.a($$0, $$1, this.d);
      ald $$4 = fpo.x.a($$0, $$1, this.d);
      ald $$5 = fpo.y.a($$0, $$1, this.d);
      ald $$6 = fpo.z.a($$0, $$1, this.d);
      ald $$7 = fpo.A.a($$0, $$1, this.d);
      ald $$8 = fpo.B.a($$0, $$1, this.d);
      ald $$9 = fpo.C.a($$0, $$1, this.d);
      this.b($$0.i());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dku $$0, dku $$1) {
      ald $$2 = fpo.v.a($$0);
      ald $$3 = fpo.w.a($$0);
      ald $$4 = fpo.x.a($$0);
      ald $$5 = fpo.y.a($$0);
      ald $$6 = fpo.z.a($$0);
      ald $$7 = fpo.A.a($$0);
      ald $$8 = fpo.B.a($$0);
      ald $$9 = fpo.C.a($$0);
      this.c.a($$0.i(), $$1.i());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dku $$0) {
      fpp $$1 = fpp.b($$0);
      ald $$2 = fpo.ak.a($$0, $$1, this.d);
      ald $$3 = fpo.al.a($$0, $$1, this.d);
      ald $$4 = fpo.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dku $$0) {
      fpp $$1 = fpp.b($$0);
      ald $$2 = fpo.ah.a($$0, $$1, this.d);
      ald $$3 = fpo.ai.a($$0, $$1, this.d);
      ald $$4 = fpo.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(dku $$0, dku $$1) {
      ald $$2 = fpo.ah.a($$0);
      ald $$3 = fpo.ai.a($$0);
      ald $$4 = fpo.aj.a($$0);
      this.c.a($$0.i(), $$1.i());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      ald $$0 = fpm.a(dkw.tj);
      ald $$1 = fpm.a(dkw.tj, "_partial_tilt");
      ald $$2 = fpm.a(dkw.tj, "_full_tilt");
      this.b
         .accept(
            fpc.a(dkw.tj)
               .a(b())
               .a(fpd.a(dzc.bo).a(dzy.a, fpf.a().a(fpg.c, $$0)).a(dzy.b, fpf.a().a(fpg.c, $$0)).a(dzy.c, fpf.a().a(fpg.c, $$1)).a(dzy.d, fpf.a().a(fpg.c, $$2)))
         );
   }

   private fou.e m(dku $$0) {
      return new fou.e(fpp.q($$0));
   }

   private void n(dku $$0) {
      this.d($$0, $$0);
   }

   private void d(dku $$0, dku $$1) {
      this.b.accept(c($$0, fpm.a($$1)));
   }

   private void a(dku $$0, fou.d $$1) {
      this.a($$0.i(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dku $$0, fou.d $$1, fpp $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dku $$0, fou.d $$1) {
      fpp $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dku $$0, fou.d $$1, fpp $$2) {
      ald $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(dku $$0, fou.d $$1, dzp<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fpd $$4 = fpd.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fpp $$5 = fpp.c(fpp.a($$0, $$4x));
            ald $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fpf.a().a(fpg.c, $$6);
         });
         this.b($$0.i());
         this.b.accept(fpc.a($$0).a($$4));
      }
   }

   private void a(dku $$0, dku $$1, fou.d $$2) {
      this.a($$0.i(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dku $$0, dku $$1, fou.d $$2) {
      this.b($$0, $$2);
      fpp $$3 = $$2.b($$0);
      ald $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(dku $$0, dku $$1) {
      fpr $$2 = fpr.u.get($$0);
      ald $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      ald $$4 = fpo.aJ.a($$1, $$2.b(), this.d);
      this.b.accept(fpc.a($$1, fpf.a().a(fpg.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(dku $$0, dku $$1) {
      this.b($$0.i());
      fpp $$2 = fpp.k($$0);
      fpp $$3 = fpp.a($$0, $$1);
      ald $$4 = fpo.bb.a($$1, $$3, this.d);
      this.b
         .accept(
            fpc.a($$1, fpf.a().a(fpg.c, $$4))
               .a(fpd.a(dzc.T).a(jo.e, fpf.a()).a(jo.d, fpf.a().a(fpg.b, fpg.a.d)).a(jo.c, fpf.a().a(fpg.b, fpg.a.b)).a(jo.f, fpf.a().a(fpg.b, fpg.a.c)))
         );
      this.b.accept(fpc.a($$0).a(fpd.a(dzc.ay).a($$2x -> fpf.a().a(fpg.c, fpo.ba[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      dku $$0 = dkw.le;
      this.b($$0.i());
      ald $$1 = fpm.a($$0, "_top");
      ald $$2 = fpm.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      dku $$0 = dkw.ld;
      this.b($$0.i());
      fpd $$1 = fpd.a(dqn.e, dzc.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fpf.a().a(fpg.c, fpm.a($$0, "_top_stage_" + $$1x));
            case b -> fpf.a().a(fpg.c, fpm.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fpc.a($$0).a($$1));
   }

   private void a(dku $$0, dku $$1, dku $$2, dku $$3, dku $$4, dku $$5, dku $$6, dku $$7) {
      this.a($$0, fou.d.b);
      this.a($$1, fou.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dku $$0, fou.d $$1) {
      ald $$2 = this.a($$0, "_top", $$1.a(), fpp::c);
      ald $$3 = this.a($$0, "_bottom", $$1.a(), fpp::c);
      this.f($$0, $$2, $$3);
   }

   private void d(dku $$0, fou.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dku $$0) {
      ald $$1 = this.a($$0.i(), $$0, "_top");
      this.a($$0, $$1, new fom());
      this.c($$0, fou.d.a);
   }

   private void k() {
      this.a(dkw.jb, "_front");
      ald $$0 = fpm.a(dkw.jb, "_top");
      ald $$1 = this.a(dkw.jb, "_bottom", fou.d.b.a(), fpp::c);
      this.f(dkw.jb, $$0, $$1);
   }

   private void l() {
      ald $$0 = this.a(dkw.bE, "_top", fpo.bv, fpp::a);
      ald $$1 = this.a(dkw.bE, "_bottom", fpo.bv, fpp::a);
      this.f(dkw.bE, $$0, $$1);
   }

   private void m() {
      ald $$0 = fpm.a(dkw.tl, "_top");
      ald $$1 = fpm.a(dkw.tl, "_bottom");
      this.b.accept(fpc.a(dkw.tl).a(b()).a(fpd.a(dzc.ah).a(dzi.b, fpf.a().a(fpg.c, $$1)).a(dzi.a, fpf.a().a(fpg.c, $$0))));
   }

   private void f(dku $$0, ald $$1, ald $$2) {
      this.b.accept(fpc.a($$0).a(fpd.a(dzc.ah).a(dzi.b, fpf.a().a(fpg.c, $$2)).a(dzi.a, fpf.a().a(fpg.c, $$1))));
   }

   private void p(dku $$0) {
      fpp $$1 = fpp.h($$0);
      fpp $$2 = fpp.e(fpp.a($$0, "_corner"));
      ald $$3 = fpo.au.a($$0, $$1, this.d);
      ald $$4 = fpo.av.a($$0, $$2, this.d);
      ald $$5 = fpo.aw.a($$0, $$1, this.d);
      ald $$6 = fpo.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fpc.a($$0)
               .a(
                  fpd.a(dzc.aj)
                     .a(dzq.a, fpf.a().a(fpg.c, $$3))
                     .a(dzq.b, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
                     .a(dzq.c, fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.b))
                     .a(dzq.d, fpf.a().a(fpg.c, $$6).a(fpg.b, fpg.a.b))
                     .a(dzq.e, fpf.a().a(fpg.c, $$5))
                     .a(dzq.f, fpf.a().a(fpg.c, $$6))
                     .a(dzq.g, fpf.a().a(fpg.c, $$4))
                     .a(dzq.h, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b))
                     .a(dzq.i, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.c))
                     .a(dzq.j, fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.d))
               )
         );
   }

   private void q(dku $$0) {
      ald $$1 = this.a($$0, "", fpo.au, fpp::e);
      ald $$2 = this.a($$0, "", fpo.aw, fpp::e);
      ald $$3 = this.a($$0, "", fpo.ax, fpp::e);
      ald $$4 = this.a($$0, "_on", fpo.au, fpp::e);
      ald $$5 = this.a($$0, "_on", fpo.aw, fpp::e);
      ald $$6 = this.a($$0, "_on", fpo.ax, fpp::e);
      fpd $$7 = fpd.a(dzc.A, dzc.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fpf.a().a(fpg.c, $$6x ? $$4 : $$1);
            case b:
               return fpf.a().a(fpg.c, $$6x ? $$4 : $$1).a(fpg.b, fpg.a.b);
            case c:
               return fpf.a().a(fpg.c, $$6x ? $$5 : $$2).a(fpg.b, fpg.a.b);
            case d:
               return fpf.a().a(fpg.c, $$6x ? $$6 : $$3).a(fpg.b, fpg.a.b);
            case e:
               return fpf.a().a(fpg.c, $$6x ? $$5 : $$2);
            case f:
               return fpf.a().a(fpg.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fpc.a($$0).a($$7));
   }

   private void a(dku $$0, cxu $$1) {
      ald $$2 = fpo.aa.a($$0, fpp.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(dku $$0, ald $$1) {
      ald $$2 = fpo.aa.a($$0, fpp.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private ald g(dku $$0, dku $$1) {
      return fpo.aa.a($$0, fpp.x($$1), this.d);
   }

   public void a(dku $$0, dku $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(dku $$0) {
      this.a($$0, $$0);
   }

   private void h(dku $$0, dku $$1) {
      this.a($$0);
      ald $$2 = fpr.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(dku $$0) {
      ald $$1 = fpr.p.create($$0, this.d);
      ald $$2 = fpr.q.create($$0, this.d);
      ald $$3 = fpr.r.create($$0, this.d);
      ald $$4 = fpr.s.create($$0, this.d);
      this.c($$0);
      this.a($$0, dzc.V, $$1, $$2, $$3, $$4);
   }

   private void t(dku $$0) {
      ald $$1 = fpr.l.create($$0, this.d);
      ald $$2 = fpr.m.create($$0, this.d);
      ald $$3 = fpr.n.create($$0, this.d);
      ald $$4 = fpr.o.create($$0, this.d);
      this.b($$0.i());
      this.a($$0, dzc.U, $$1, $$2, $$3, $$4);
   }

   private void a(dku $$0, dzm $$1, ald $$2, ald $$3, ald $$4, ald $$5) {
      this.b
         .accept(
            fpb.a($$0)
               .a(fpa.a().a($$1, 1, 2, 3, 4).a(dzc.T, jo.c), fpf.a().a(fpg.c, $$2))
               .a(fpa.a().a($$1, 1, 2, 3, 4).a(dzc.T, jo.f), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b))
               .a(fpa.a().a($$1, 1, 2, 3, 4).a(dzc.T, jo.d), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c))
               .a(fpa.a().a($$1, 1, 2, 3, 4).a(dzc.T, jo.e), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d))
               .a(fpa.a().a($$1, 2, 3, 4).a(dzc.T, jo.c), fpf.a().a(fpg.c, $$3))
               .a(fpa.a().a($$1, 2, 3, 4).a(dzc.T, jo.f), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
               .a(fpa.a().a($$1, 2, 3, 4).a(dzc.T, jo.d), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
               .a(fpa.a().a($$1, 2, 3, 4).a(dzc.T, jo.e), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
               .a(fpa.a().a($$1, 3, 4).a(dzc.T, jo.c), fpf.a().a(fpg.c, $$4))
               .a(fpa.a().a($$1, 3, 4).a(dzc.T, jo.f), fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b))
               .a(fpa.a().a($$1, 3, 4).a(dzc.T, jo.d), fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.c))
               .a(fpa.a().a($$1, 3, 4).a(dzc.T, jo.e), fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.d))
               .a(fpa.a().a($$1, 4).a(dzc.T, jo.c), fpf.a().a(fpg.c, $$5))
               .a(fpa.a().a($$1, 4).a(dzc.T, jo.f), fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.b))
               .a(fpa.a().a($$1, 4).a(dzc.T, jo.d), fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.c))
               .a(fpa.a().a($$1, 4).a(dzc.T, jo.e), fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.d))
         );
   }

   private void a(fpr.a $$0, dku... $$1) {
      for (dku $$2 : $$1) {
         ald $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fpr.a $$0, dku... $$1) {
      for (dku $$2 : $$1) {
         ald $$3 = $$0.create($$2, this.d);
         this.b.accept(fpc.a($$2, fpf.a().a(fpg.c, $$3)).a(c()));
      }
   }

   private void i(dku $$0, dku $$1) {
      this.a($$0);
      fpp $$2 = fpp.b($$0, $$1);
      ald $$3 = fpo.aP.a($$1, $$2, this.d);
      ald $$4 = fpo.aQ.a($$1, $$2, this.d);
      ald $$5 = fpo.aR.a($$1, $$2, this.d);
      ald $$6 = fpo.aN.a($$1, $$2, this.d);
      ald $$7 = fpo.aO.a($$1, $$2, this.d);
      cxu $$8 = $$1.i();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fpb.a($$1)
               .a(fpf.a().a(fpg.c, $$3))
               .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$4))
               .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$5))
               .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.N, false), fpf.a().a(fpg.c, $$6))
               .a(fpa.a().a(dzc.O, false), fpf.a().a(fpg.c, $$7))
               .a(fpa.a().a(dzc.P, false), fpf.a().a(fpg.c, $$7).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.Q, false), fpf.a().a(fpg.c, $$6).a(fpg.b, fpg.a.d))
         );
   }

   private void u(dku $$0) {
      fpp $$1 = fpp.C($$0);
      ald $$2 = fpo.aS.a($$0, $$1, this.d);
      ald $$3 = this.a($$0, "_conditional", fpo.aS, $$1x -> $$1.c(fpq.i, $$1x));
      this.b.accept(fpc.a($$0).a(a(dzc.f, $$3, $$2)).a(e()));
   }

   private void v(dku $$0) {
      ald $$1 = fpr.v.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fpf> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fpf.a().a(fpg.c, fpm.a(dkw.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fpb.a(dkw.nB)
               .a(fpa.a().a(dzc.at, 0), this.a(0))
               .a(fpa.a().a(dzc.at, 1), this.a(1))
               .a(fpa.a().a(dzc.bn, dyy.b), fpf.a().a(fpg.c, fpm.a(dkw.nB, "_small_leaves")))
               .a(fpa.a().a(dzc.bn, dyy.c), fpf.a().a(fpg.c, fpm.a(dkw.nB, "_large_leaves")))
         );
   }

   private fpd o() {
      return fpd.a(dzc.R)
         .a(jo.a, fpf.a().a(fpg.a, fpg.a.c))
         .a(jo.b, fpf.a())
         .a(jo.c, fpf.a().a(fpg.a, fpg.a.b))
         .a(jo.d, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.c))
         .a(jo.e, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.d))
         .a(jo.f, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b));
   }

   private void p() {
      ald $$0 = fpp.a(dkw.ow, "_top_open");
      this.b
         .accept(
            fpc.a(dkw.ow)
               .a(this.o())
               .a(
                  fpd.a(dzc.y)
                     .a(false, fpf.a().a(fpg.c, fpr.f.create(dkw.ow, this.d)))
                     .a(true, fpf.a().a(fpg.c, fpr.f.get(dkw.ow).a($$1 -> $$1.a(fpq.f, $$0)).a(dkw.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fpd a(dzp<T> $$0, T $$1, ald $$2, ald $$3) {
      fpf $$4 = fpf.a().a(fpg.c, $$2);
      fpf $$5 = fpf.a().a(fpg.c, $$3);
      return fpd.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dku $$0, Function<dku, fpp> $$1) {
      fpp $$2 = $$1.apply($$0).b(fpq.i, fpq.c);
      fpp $$3 = $$2.c(fpq.g, fpp.a($$0, "_front_honey"));
      ald $$4 = fpo.q.a($$0, "_empty", $$2, this.d);
      ald $$5 = fpo.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.i(), fpk.a(dko.c, fpk.a($$4), Map.of(5, fpk.a($$5))));
      this.b.accept(fpc.a($$0).a(b()).a(a(dko.c, 5, $$5, $$4)));
   }

   private void a(dku $$0, dzp<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ald> $$3 = new Int2ObjectOpenHashMap();
         fpd $$4 = fpd.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ald $$5 = (ald)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fpo.bc, fpp::g));
            return fpf.a().a(fpg.c, $$5);
         });
         this.b($$0.i());
         this.b.accept(fpc.a($$0).a($$4));
      }
   }

   private void q() {
      ald $$0 = fpm.a(dkw.oF, "_floor");
      ald $$1 = fpm.a(dkw.oF, "_ceiling");
      ald $$2 = fpm.a(dkw.oF, "_wall");
      ald $$3 = fpm.a(dkw.oF, "_between_walls");
      this.b(cyc.xw);
      this.b
         .accept(
            fpc.a(dkw.oF)
               .a(
                  fpd.a(dzc.T, dzc.Y)
                     .a(jo.c, dza.a, fpf.a().a(fpg.c, $$0))
                     .a(jo.d, dza.a, fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c))
                     .a(jo.f, dza.a, fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b))
                     .a(jo.e, dza.a, fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d))
                     .a(jo.c, dza.b, fpf.a().a(fpg.c, $$1))
                     .a(jo.d, dza.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c))
                     .a(jo.f, dza.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b))
                     .a(jo.e, dza.b, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d))
                     .a(jo.c, dza.c, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d))
                     .a(jo.d, dza.c, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b))
                     .a(jo.f, dza.c, fpf.a().a(fpg.c, $$2))
                     .a(jo.e, dza.c, fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c))
                     .a(jo.d, dza.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
                     .a(jo.c, dza.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
                     .a(jo.f, dza.d, fpf.a().a(fpg.c, $$3))
                     .a(jo.e, dza.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fpc.a(dkw.oB, fpf.a().a(fpg.c, fpm.a(dkw.oB)))
               .a(
                  fpd.a(dzc.X, dzc.T)
                     .a(dyx.a, jo.c, fpf.a())
                     .a(dyx.a, jo.f, fpf.a().a(fpg.b, fpg.a.b))
                     .a(dyx.a, jo.d, fpf.a().a(fpg.b, fpg.a.c))
                     .a(dyx.a, jo.e, fpf.a().a(fpg.b, fpg.a.d))
                     .a(dyx.b, jo.c, fpf.a().a(fpg.a, fpg.a.b))
                     .a(dyx.b, jo.f, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
                     .a(dyx.b, jo.d, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.c))
                     .a(dyx.b, jo.e, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.d))
                     .a(dyx.c, jo.d, fpf.a().a(fpg.a, fpg.a.c))
                     .a(dyx.c, jo.e, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b))
                     .a(dyx.c, jo.c, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c))
                     .a(dyx.c, jo.f, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d))
               )
         );
   }

   private void d(dku $$0, fpr.a $$1) {
      ald $$2 = $$1.create($$0, this.d);
      ald $$3 = fpp.a($$0, "_front_on");
      ald $$4 = $$1.get($$0).a($$1x -> $$1x.a(fpq.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fpc.a($$0).a(a(dzc.u, $$4, $$2)).a(b()));
   }

   private void a(dku... $$0) {
      ald $$1 = fpm.a("campfire_off");

      for (dku $$2 : $$0) {
         ald $$3 = fpo.bj.a($$2, fpp.H($$2), this.d);
         this.b($$2.i());
         this.b.accept(fpc.a($$2).a(a(dzc.u, $$3, $$1)).a(c()));
      }
   }

   private void w(dku $$0) {
      ald $$1 = fpo.bE.a($$0, fpp.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void x(dku $$0) {
      ald $$1;
      if ($$0 == dkw.tP) {
         $$1 = fpo.bG.a($$0, fpp.p($$0), this.d);
      } else {
         $$1 = fpo.bF.a($$0, fpp.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fpp $$0 = fpp.a(fpp.J(dkw.cs), fpp.J(dkw.n));
      ald $$1 = fpo.j.a(dkw.cs, $$0, this.d);
      this.b.accept(c(dkw.cs, $$1));
   }

   private void t() {
      this.b(cyc.mg);
      this.b
         .accept(
            fpb.a(dkw.cE)
               .a(
                  fpa.b(
                     fpa.a().a(dzc.ae, dzr.c).a(dzc.ad, dzr.c).a(dzc.af, dzr.c).a(dzc.ag, dzr.c),
                     fpa.a().a(dzc.ae, dzr.b, dzr.a).a(dzc.ad, dzr.b, dzr.a),
                     fpa.a().a(dzc.ad, dzr.b, dzr.a).a(dzc.af, dzr.b, dzr.a),
                     fpa.a().a(dzc.af, dzr.b, dzr.a).a(dzc.ag, dzr.b, dzr.a),
                     fpa.a().a(dzc.ag, dzr.b, dzr.a).a(dzc.ae, dzr.b, dzr.a)
                  ),
                  fpf.a().a(fpg.c, fpm.a("redstone_dust_dot"))
               )
               .a(fpa.a().a(dzc.ae, dzr.b, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_side0")))
               .a(fpa.a().a(dzc.af, dzr.b, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_side_alt0")))
               .a(fpa.a().a(dzc.ad, dzr.b, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_side_alt1")).a(fpg.b, fpg.a.d))
               .a(fpa.a().a(dzc.ag, dzr.b, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_side1")).a(fpg.b, fpg.a.d))
               .a(fpa.a().a(dzc.ae, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_up")))
               .a(fpa.a().a(dzc.ad, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_up")).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.af, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_up")).a(fpg.b, fpg.a.c))
               .a(fpa.a().a(dzc.ag, dzr.a), fpf.a().a(fpg.c, fpm.a("redstone_dust_up")).a(fpg.b, fpg.a.d))
         );
   }

   private void u() {
      this.b(cyc.mk);
      this.b
         .accept(
            fpc.a(dkw.hv)
               .a(c())
               .a(
                  fpd.a(dzc.bg, dzc.A)
                     .a(dzf.a, false, fpf.a().a(fpg.c, fpm.a(dkw.hv)))
                     .a(dzf.a, true, fpf.a().a(fpg.c, fpm.a(dkw.hv, "_on")))
                     .a(dzf.b, false, fpf.a().a(fpg.c, fpm.a(dkw.hv, "_subtract")))
                     .a(dzf.b, true, fpf.a().a(fpg.c, fpm.a(dkw.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fpp $$0 = fpp.a(dkw.kq);
      fpp $$1 = fpp.a(fpp.a(dkw.kd, "_side"), $$0.a(fpq.f));
      ald $$2 = fpo.ab.a(dkw.kd, $$1, this.d);
      ald $$3 = fpo.ac.a(dkw.kd, $$1, this.d);
      ald $$4 = fpo.j.b(dkw.kd, "_double", $$1, this.d);
      this.b.accept(e(dkw.kd, $$2, $$3, $$4));
      this.b.accept(c(dkw.kq, fpo.c.a(dkw.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cyc.tr);
      this.b
         .accept(
            fpb.a(dkw.fN)
               .a(fpf.a().a(fpg.c, fpp.J(dkw.fN)))
               .a(fpa.a().a(dzc.n, true), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_bottle0")))
               .a(fpa.a().a(dzc.o, true), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_bottle1")))
               .a(fpa.a().a(dzc.p, true), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_bottle2")))
               .a(fpa.a().a(dzc.n, false), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_empty0")))
               .a(fpa.a().a(dzc.o, false), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_empty1")))
               .a(fpa.a().a(dzc.p, false), fpf.a().a(fpg.c, fpp.a(dkw.fN, "_empty2")))
         );
   }

   private void y(dku $$0) {
      ald $$1 = fpo.bA.a($$0, fpp.b($$0), this.d);
      ald $$2 = fpm.a("mushroom_block_inside");
      this.b
         .accept(
            fpb.a($$0)
               .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$1))
               .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(fpa.a().a(dzc.L, true), fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.d).a(fpg.d, true))
               .a(fpa.a().a(dzc.M, true), fpf.a().a(fpg.c, $$1).a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(fpa.a().a(dzc.N, false), fpf.a().a(fpg.c, $$2))
               .a(fpa.a().a(dzc.O, false), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b).a(fpg.d, false))
               .a(fpa.a().a(dzc.P, false), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c).a(fpg.d, false))
               .a(fpa.a().a(dzc.Q, false), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d).a(fpg.d, false))
               .a(fpa.a().a(dzc.L, false), fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.d).a(fpg.d, false))
               .a(fpa.a().a(dzc.M, false), fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b).a(fpg.d, false))
         );
      this.a($$0, fpr.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cyc.sC);
      this.b
         .accept(
            fpc.a(dkw.et)
               .a(
                  fpd.a(dzc.aB)
                     .a(0, fpf.a().a(fpg.c, fpm.a(dkw.et)))
                     .a(1, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice1")))
                     .a(2, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice2")))
                     .a(3, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice3")))
                     .a(4, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice4")))
                     .a(5, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice5")))
                     .a(6, fpf.a().a(fpg.c, fpm.a(dkw.et, "_slice6")))
               )
         );
   }

   private void y() {
      fpp $$0 = new fpp()
         .a(fpq.c, fpp.a(dkw.oz, "_side3"))
         .a(fpq.o, fpp.J(dkw.t))
         .a(fpq.n, fpp.a(dkw.oz, "_top"))
         .a(fpq.j, fpp.a(dkw.oz, "_side3"))
         .a(fpq.l, fpp.a(dkw.oz, "_side3"))
         .a(fpq.k, fpp.a(dkw.oz, "_side1"))
         .a(fpq.m, fpp.a(dkw.oz, "_side2"));
      this.b.accept(c(dkw.oz, fpo.a.a(dkw.oz, $$0, this.d)));
   }

   private void z() {
      fpp $$0 = new fpp()
         .a(fpq.c, fpp.a(dkw.oD, "_front"))
         .a(fpq.o, fpp.a(dkw.oD, "_bottom"))
         .a(fpq.n, fpp.a(dkw.oD, "_top"))
         .a(fpq.j, fpp.a(dkw.oD, "_front"))
         .a(fpq.k, fpp.a(dkw.oD, "_front"))
         .a(fpq.l, fpp.a(dkw.oD, "_side"))
         .a(fpq.m, fpp.a(dkw.oD, "_side"));
      this.b.accept(c(dkw.oD, fpo.a.a(dkw.oD, $$0, this.d)));
   }

   private void a(dku $$0, dku $$1, BiFunction<dku, dku, fpp> $$2) {
      fpp $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fpo.a.a($$0, $$3, this.d)));
   }

   public void b(dku $$0) {
      fpp $$1 = new fpp()
         .a(fpq.c, fpp.a($$0, "_particle"))
         .a(fpq.o, fpp.a($$0, "_down"))
         .a(fpq.n, fpp.a($$0, "_up"))
         .a(fpq.j, fpp.a($$0, "_north"))
         .a(fpq.k, fpp.a($$0, "_south"))
         .a(fpq.l, fpp.a($$0, "_east"))
         .a(fpq.m, fpp.a($$0, "_west"));
      this.b.accept(c($$0, fpo.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fpp $$0 = fpp.n(dkw.fn);
      this.b.accept(c(dkw.fn, fpm.a(dkw.fn)));
      this.a(dkw.er, $$0);
      this.a(dkw.es, $$0);
   }

   private void a(dku $$0, fpp $$1) {
      ald $$2 = fpo.p.a($$0, $$1.c(fpq.g, fpp.J($$0)), this.d);
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cyc.ts);
      this.n(dkw.fO);
      this.b.accept(c(dkw.fQ, fpo.bD.a(dkw.fQ, fpp.j(fpp.a(dkw.K, "_still")), this.d)));
      this.b
         .accept(
            fpc.a(dkw.fP)
               .a(
                  fpd.a(dpg.f)
                     .a(1, fpf.a().a(fpg.c, fpo.bB.a(dkw.fP, "_level1", fpp.j(fpp.a(dkw.J, "_still")), this.d)))
                     .a(2, fpf.a().a(fpg.c, fpo.bC.a(dkw.fP, "_level2", fpp.j(fpp.a(dkw.J, "_still")), this.d)))
                     .a(3, fpf.a().a(fpg.c, fpo.bD.a(dkw.fP, "_full", fpp.j(fpp.a(dkw.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fpc.a(dkw.fR)
               .a(
                  fpd.a(dpg.f)
                     .a(1, fpf.a().a(fpg.c, fpo.bB.a(dkw.fR, "_level1", fpp.j(fpp.J(dkw.rt)), this.d)))
                     .a(2, fpf.a().a(fpg.c, fpo.bC.a(dkw.fR, "_level2", fpp.j(fpp.J(dkw.rt)), this.d)))
                     .a(3, fpf.a().a(fpg.c, fpo.bD.a(dkw.fR, "_full", fpp.j(fpp.J(dkw.rt)), this.d)))
               )
         );
   }

   private void C() {
      fpp $$0 = fpp.b(dkw.kX);
      ald $$1 = fpo.aL.a(dkw.kX, $$0, this.d);
      ald $$2 = this.a(dkw.kX, "_dead", fpo.aL, $$1x -> $$0.c(fpq.b, $$1x));
      this.b.accept(fpc.a(dkw.kX).a(a(dzc.ax, 5, $$2, $$1)));
   }

   private void D() {
      ald $$0 = fpm.a(dkw.tW);
      ald $$1 = fpm.a(dkw.tW, "_triggered");
      ald $$2 = fpm.a(dkw.tW, "_crafting");
      ald $$3 = fpm.a(dkw.tW, "_crafting_triggered");
      this.b
         .accept(
            fpc.a(dkw.tW)
               .a(fpd.a(dzc.W).a($$0x -> this.a($$0x, fpf.a())))
               .a(
                  fpd.a(dzc.G, dmn.b)
                     .a(false, false, fpf.a().a(fpg.c, $$0))
                     .a(true, true, fpf.a().a(fpg.c, $$3))
                     .a(true, false, fpf.a().a(fpg.c, $$1))
                     .a(false, true, fpf.a().a(fpg.c, $$2))
               )
         );
   }

   private void z(dku $$0) {
      fpp $$1 = new fpp().a(fpq.f, fpp.a(dkw.cL, "_top")).a(fpq.i, fpp.a(dkw.cL, "_side")).a(fpq.g, fpp.a($$0, "_front"));
      fpp $$2 = new fpp().a(fpq.i, fpp.a(dkw.cL, "_top")).a(fpq.g, fpp.a($$0, "_front_vertical"));
      ald $$3 = fpo.p.a($$0, $$1, this.d);
      ald $$4 = fpo.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fpc.a($$0)
               .a(
                  fpd.a(dzc.R)
                     .a(jo.a, fpf.a().a(fpg.c, $$4).a(fpg.a, fpg.a.c))
                     .a(jo.b, fpf.a().a(fpg.c, $$4))
                     .a(jo.c, fpf.a().a(fpg.c, $$3))
                     .a(jo.f, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
                     .a(jo.d, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c))
                     .a(jo.e, fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d))
               )
         );
   }

   private void E() {
      ald $$0 = fpm.a(dkw.fT);
      ald $$1 = fpm.a(dkw.fT, "_filled");
      this.b.accept(fpc.a(dkw.fT).a(fpd.a(dzc.k).a(false, fpf.a().a(fpg.c, $$0)).a(true, fpf.a().a(fpg.c, $$1))).a(c()));
   }

   private void F() {
      ald $$0 = fpm.a(dkw.kW, "_side");
      ald $$1 = fpm.a(dkw.kW, "_noside");
      ald $$2 = fpm.a(dkw.kW, "_noside1");
      ald $$3 = fpm.a(dkw.kW, "_noside2");
      ald $$4 = fpm.a(dkw.kW, "_noside3");
      this.b
         .accept(
            fpb.a(dkw.kW)
               .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$0))
               .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b).a(fpg.d, true))
               .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c).a(fpg.d, true))
               .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d).a(fpg.d, true))
               .a(fpa.a().a(dzc.L, true), fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.d).a(fpg.d, true))
               .a(fpa.a().a(dzc.M, true), fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.b).a(fpg.d, true))
               .a(fpa.a().a(dzc.N, false), fpf.a().a(fpg.c, $$1).a(fpg.e, 2), fpf.a().a(fpg.c, $$2), fpf.a().a(fpg.c, $$3), fpf.a().a(fpg.c, $$4))
               .a(
                  fpa.a().a(dzc.O, false),
                  fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$1).a(fpg.e, 2).a(fpg.b, fpg.a.b).a(fpg.d, true)
               )
               .a(
                  fpa.a().a(dzc.P, false),
                  fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.c).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.c).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$1).a(fpg.e, 2).a(fpg.b, fpg.a.c).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.c).a(fpg.d, true)
               )
               .a(
                  fpa.a().a(dzc.Q, false),
                  fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$1).a(fpg.e, 2).a(fpg.b, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.d).a(fpg.d, true)
               )
               .a(
                  fpa.a().a(dzc.L, false),
                  fpf.a().a(fpg.c, $$1).a(fpg.e, 2).a(fpg.a, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$4).a(fpg.a, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.d).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.d).a(fpg.d, true)
               )
               .a(
                  fpa.a().a(dzc.M, false),
                  fpf.a().a(fpg.c, $$4).a(fpg.a, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$3).a(fpg.a, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$2).a(fpg.a, fpg.a.b).a(fpg.d, true),
                  fpf.a().a(fpg.c, $$1).a(fpg.e, 2).a(fpg.a, fpg.a.b).a(fpg.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fpb.a(dkw.pG)
               .a(fpf.a().a(fpg.c, fpp.J(dkw.pG)))
               .a(fpa.a().a(dzc.aO, 1), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents1")))
               .a(fpa.a().a(dzc.aO, 2), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents2")))
               .a(fpa.a().a(dzc.aO, 3), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents3")))
               .a(fpa.a().a(dzc.aO, 4), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents4")))
               .a(fpa.a().a(dzc.aO, 5), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents5")))
               .a(fpa.a().a(dzc.aO, 6), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents6")))
               .a(fpa.a().a(dzc.aO, 7), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents7")))
               .a(fpa.a().a(dzc.aO, 8), fpf.a().a(fpg.c, fpp.a(dkw.pG, "_contents_ready")))
         );
   }

   private void A(dku $$0) {
      ald $$1 = fpo.c.a($$0, fpp.a($$0), this.d);
      ald $$2 = this.a($$0, "_powered", fpo.c, fpp::b);
      ald $$3 = this.a($$0, "_lit", fpo.c, fpp::b);
      ald $$4 = this.a($$0, "_lit_powered", fpo.c, fpp::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private foz a(dku $$0, ald $$1, ald $$2, ald $$3, ald $$4) {
      return fpc.a($$0).a(fpd.a(dzc.u, dzc.A).a(($$4x, $$5) -> $$4x ? fpf.a().a(fpg.c, $$5 ? $$4 : $$2) : fpf.a().a(fpg.c, $$5 ? $$3 : $$1)));
   }

   private void j(dku $$0, dku $$1) {
      ald $$2 = fpm.a($$0);
      ald $$3 = fpm.a($$0, "_powered");
      ald $$4 = fpm.a($$0, "_lit");
      ald $$5 = fpm.a($$0, "_lit_powered");
      this.c.a($$0.i(), $$1.i());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dku $$0) {
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, fpo.ao.a($$0, fpp.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.B(dkw.rc);
      this.B(dkw.rb);
      this.B(dkw.ra);
      this.B(dkw.qZ);
   }

   private void I() {
      fpd.b<jo, dzj> $$0 = fpd.a(dzc.bp, dzc.bq);

      for (dzj $$1 : dzj.values()) {
         $$0.a(jo.b, $$1, this.a(jo.b, $$1));
      }

      for (dzj $$2 : dzj.values()) {
         $$0.a(jo.a, $$2, this.a(jo.a, $$2));
      }

      this.b.accept(fpc.a(dkw.sX).a($$0));
   }

   private fpf a(jo $$0, dzj $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fpp $$3 = fpp.c(fpp.a(dkw.sX, $$2));
      return fpf.a().a(fpg.c, fpo.an.a(dkw.sX, $$2, $$3, this.d));
   }

   private void C(dku $$0) {
      fpp $$1 = new fpp().a(fpq.e, fpp.J(dkw.ei)).a(fpq.f, fpp.J($$0)).a(fpq.i, fpp.a($$0, "_side"));
      this.b.accept(c($$0, fpo.n.a($$0, $$1, this.d)));
   }

   private void J() {
      ald $$0 = fpp.a(dkw.hw, "_side");
      fpp $$1 = new fpp().a(fpq.f, fpp.a(dkw.hw, "_top")).a(fpq.i, $$0);
      fpp $$2 = new fpp().a(fpq.f, fpp.a(dkw.hw, "_inverted_top")).a(fpq.i, $$0);
      this.b
         .accept(
            fpc.a(dkw.hw)
               .a(
                  fpd.a(dzc.s)
                     .a(false, fpf.a().a(fpg.c, fpo.aM.a(dkw.hw, $$1, this.d)))
                     .a(true, fpf.a().a(fpg.c, fpo.aM.a(fpm.a(dkw.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void D(dku $$0) {
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, fpm.a($$0))).a(this.o()));
   }

   private void K() {
      dku $$0 = dkw.sW;
      ald $$1 = fpm.a($$0, "_on");
      ald $$2 = fpm.a($$0);
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, fpm.a($$0))).a(this.o()).a(a(dzc.A, $$1, $$2)));
   }

   private void L() {
      fpp $$0 = new fpp().a(fpq.C, fpp.J(dkw.j)).a(fpq.f, fpp.J(dkw.cK));
      fpp $$1 = new fpp().a(fpq.C, fpp.J(dkw.j)).a(fpq.f, fpp.a(dkw.cK, "_moist"));
      ald $$2 = fpo.bd.a(dkw.cK, $$0, this.d);
      ald $$3 = fpo.bd.a(fpp.a(dkw.cK, "_moist"), $$1, this.d);
      this.b.accept(fpc.a(dkw.cK).a(a(dzc.aT, 7, $$3, $$2)));
   }

   private List<ald> E(dku $$0) {
      ald $$1 = fpo.be.a(fpm.a($$0, "_floor0"), fpp.y($$0), this.d);
      ald $$2 = fpo.be.a(fpm.a($$0, "_floor1"), fpp.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<ald> F(dku $$0) {
      ald $$1 = fpo.bf.a(fpm.a($$0, "_side0"), fpp.y($$0), this.d);
      ald $$2 = fpo.bf.a(fpm.a($$0, "_side1"), fpp.z($$0), this.d);
      ald $$3 = fpo.bg.a(fpm.a($$0, "_side_alt0"), fpp.y($$0), this.d);
      ald $$4 = fpo.bg.a(fpm.a($$0, "_side_alt1"), fpp.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ald> G(dku $$0) {
      ald $$1 = fpo.bh.a(fpm.a($$0, "_up0"), fpp.y($$0), this.d);
      ald $$2 = fpo.bh.a(fpm.a($$0, "_up1"), fpp.z($$0), this.d);
      ald $$3 = fpo.bi.a(fpm.a($$0, "_up_alt0"), fpp.y($$0), this.d);
      ald $$4 = fpo.bi.a(fpm.a($$0, "_up_alt1"), fpp.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fpf> a(List<ald> $$0, UnaryOperator<fpf> $$1) {
      return $$0.stream().map($$0x -> fpf.a().a(fpg.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fpa $$0 = fpa.a().a(dzc.N, false).a(dzc.O, false).a(dzc.P, false).a(dzc.Q, false).a(dzc.L, false);
      List<ald> $$1 = this.E(dkw.cy);
      List<ald> $$2 = this.F(dkw.cy);
      List<ald> $$3 = this.G(dkw.cy);
      this.b
         .accept(
            fpb.a(dkw.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fpa.b(fpa.a().a(dzc.N, true), $$0), a($$2, $$0x -> $$0x))
               .a(fpa.b(fpa.a().a(dzc.O, true), $$0), a($$2, $$0x -> $$0x.a(fpg.b, fpg.a.b)))
               .a(fpa.b(fpa.a().a(dzc.P, true), $$0), a($$2, $$0x -> $$0x.a(fpg.b, fpg.a.c)))
               .a(fpa.b(fpa.a().a(dzc.Q, true), $$0), a($$2, $$0x -> $$0x.a(fpg.b, fpg.a.d)))
               .a(fpa.a().a(dzc.L, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<ald> $$0 = this.E(dkw.cz);
      List<ald> $$1 = this.F(dkw.cz);
      this.b
         .accept(
            fpb.a(dkw.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fpg.b, fpg.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fpg.b, fpg.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fpg.b, fpg.a.d)))
         );
   }

   private void H(dku $$0) {
      ald $$1 = fpr.x.create($$0, this.d);
      ald $$2 = fpr.y.create($$0, this.d);
      this.b($$0.i());
      this.b.accept(fpc.a($$0).a(a(dzc.m, $$2, $$1)));
   }

   private void O() {
      fpp $$0 = fpp.a(fpp.a(dkw.ah, "_side"), fpp.a(dkw.ah, "_top"));
      ald $$1 = fpo.j.a(dkw.ah, $$0, this.d);
      this.b.accept(d(dkw.ah, $$1));
   }

   private void P() {
      this.b(cyc.af);
      dku $$0 = dkw.H;
      fpd.b<Boolean, Integer> $$1 = fpd.a(dpt.d, dpt.b);
      ald $$2 = fpm.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ald $$4 = fpm.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fpf.a().a(fpg.c, $$4));
         $$1.a(false, $$3, fpf.a().a(fpg.c, $$2));
      }

      this.b.accept(fpc.a(dkw.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fpc.a(dkw.lk)
               .a(
                  fpd.a(dzc.av)
                     .a(0, fpf.a().a(fpg.c, this.a(dkw.lk, "_0", fpo.c, fpp::b)))
                     .a(1, fpf.a().a(fpg.c, this.a(dkw.lk, "_1", fpo.c, fpp::b)))
                     .a(2, fpf.a().a(fpg.c, this.a(dkw.lk, "_2", fpo.c, fpp::b)))
                     .a(3, fpf.a().a(fpg.c, this.a(dkw.lk, "_3", fpo.c, fpp::b)))
               )
         );
   }

   private void R() {
      ald $$0 = fpp.J(dkw.j);
      fpp $$1 = new fpp().a(fpq.e, $$0).b(fpq.e, fpq.c).a(fpq.f, fpp.a(dkw.i, "_top")).a(fpq.i, fpp.a(dkw.i, "_snow"));
      fpf $$2 = fpf.a().a(fpg.c, fpo.n.a(dkw.i, "_snow", $$1, this.d));
      this.a(dkw.i, fpm.a(dkw.i), $$2);
      this.a(dkw.i, fpm.a(dkw.i), new fom());
      ald $$3 = fpr.f.get(dkw.fA).a($$1x -> $$1x.a(fpq.e, $$0)).a(dkw.fA, this.d);
      this.a(dkw.fA, $$3, $$2);
      ald $$4 = fpr.f.get(dkw.l).a($$1x -> $$1x.a(fpq.e, $$0)).a(dkw.l, this.d);
      this.a(dkw.l, $$4, $$2);
   }

   private void a(dku $$0, ald $$1, fpf $$2) {
      List<fpf> $$3 = Arrays.asList(a($$1));
      this.b.accept(fpc.a($$0).a(fpd.a(dzc.E).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cyc.si);
      this.b
         .accept(
            fpc.a(dkw.fX)
               .a(
                  fpd.a(dzc.au)
                     .a(0, fpf.a().a(fpg.c, fpm.a(dkw.fX, "_stage0")))
                     .a(1, fpf.a().a(fpg.c, fpm.a(dkw.fX, "_stage1")))
                     .a(2, fpf.a().a(fpg.c, fpm.a(dkw.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(dkw.lg, fpm.a(dkw.lg)));
   }

   private void k(dku $$0, dku $$1) {
      fpp $$2 = fpp.b($$1);
      ald $$3 = fpo.Y.a($$0, $$2, this.d);
      ald $$4 = fpo.Z.a($$0, $$2, this.d);
      this.b.accept(fpc.a($$0).a(a(dzc.aW, 1, $$4, $$3)));
   }

   private void U() {
      ald $$0 = fpm.a(dkw.hz);
      ald $$1 = fpm.a(dkw.hz, "_side");
      this.b(cyc.mq);
      this.b
         .accept(
            fpc.a(dkw.hz)
               .a(
                  fpd.a(dzc.S)
                     .a(jo.a, fpf.a().a(fpg.c, $$0))
                     .a(jo.c, fpf.a().a(fpg.c, $$1))
                     .a(jo.f, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.b))
                     .a(jo.d, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.c))
                     .a(jo.e, fpf.a().a(fpg.c, $$1).a(fpg.b, fpg.a.d))
               )
         );
   }

   private void l(dku $$0, dku $$1) {
      ald $$2 = fpm.a($$0);
      this.b.accept(fpc.a($$1, fpf.a().a(fpg.c, $$2)));
      this.c.a($$0.i(), $$1.i());
   }

   private void V() {
      ald $$0 = fpm.a(dkw.fk, "_post_ends");
      ald $$1 = fpm.a(dkw.fk, "_post");
      ald $$2 = fpm.a(dkw.fk, "_cap");
      ald $$3 = fpm.a(dkw.fk, "_cap_alt");
      ald $$4 = fpm.a(dkw.fk, "_side");
      ald $$5 = fpm.a(dkw.fk, "_side_alt");
      this.b
         .accept(
            fpb.a(dkw.fk)
               .a(fpf.a().a(fpg.c, $$0))
               .a(fpa.a().a(dzc.N, false).a(dzc.O, false).a(dzc.P, false).a(dzc.Q, false), fpf.a().a(fpg.c, $$1))
               .a(fpa.a().a(dzc.N, true).a(dzc.O, false).a(dzc.P, false).a(dzc.Q, false), fpf.a().a(fpg.c, $$2))
               .a(fpa.a().a(dzc.N, false).a(dzc.O, true).a(dzc.P, false).a(dzc.Q, false), fpf.a().a(fpg.c, $$2).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.N, false).a(dzc.O, false).a(dzc.P, true).a(dzc.Q, false), fpf.a().a(fpg.c, $$3))
               .a(fpa.a().a(dzc.N, false).a(dzc.O, false).a(dzc.P, false).a(dzc.Q, true), fpf.a().a(fpg.c, $$3).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.N, true), fpf.a().a(fpg.c, $$4))
               .a(fpa.a().a(dzc.O, true), fpf.a().a(fpg.c, $$4).a(fpg.b, fpg.a.b))
               .a(fpa.a().a(dzc.P, true), fpf.a().a(fpg.c, $$5))
               .a(fpa.a().a(dzc.Q, true), fpf.a().a(fpg.c, $$5).a(fpg.b, fpg.a.b))
         );
      this.c(dkw.fk);
   }

   private void I(dku $$0) {
      this.b.accept(fpc.a($$0, fpf.a().a(fpg.c, fpm.a($$0))).a(b()));
   }

   private void W() {
      ald $$0 = fpm.a(dkw.dI);
      ald $$1 = fpm.a(dkw.dI, "_on");
      this.c(dkw.dI);
      this.b
         .accept(
            fpc.a(dkw.dI)
               .a(a(dzc.A, $$0, $$1))
               .a(
                  fpd.a(dzc.X, dzc.T)
                     .a(dyx.c, jo.c, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.c))
                     .a(dyx.c, jo.f, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.d))
                     .a(dyx.c, jo.d, fpf.a().a(fpg.a, fpg.a.c))
                     .a(dyx.c, jo.e, fpf.a().a(fpg.a, fpg.a.c).a(fpg.b, fpg.a.b))
                     .a(dyx.a, jo.c, fpf.a())
                     .a(dyx.a, jo.f, fpf.a().a(fpg.b, fpg.a.b))
                     .a(dyx.a, jo.d, fpf.a().a(fpg.b, fpg.a.c))
                     .a(dyx.a, jo.e, fpf.a().a(fpg.b, fpg.a.d))
                     .a(dyx.b, jo.c, fpf.a().a(fpg.a, fpg.a.b))
                     .a(dyx.b, jo.f, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b))
                     .a(dyx.b, jo.d, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.c))
                     .a(dyx.b, jo.e, fpf.a().a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.d))
               )
         );
   }

   private void X() {
      ald $$0 = this.a(cyc.gz, dkw.fB);
      this.a(dkw.fB, $$0, fpk.a(-9321636));
      this.b.accept(b(dkw.fB, fpm.a(dkw.fB)));
   }

   private void Y() {
      this.c(dkw.tT);
      this.b.accept(c(dkw.tT, fpm.a(dkw.tT)));
   }

   private void Z() {
      this.b.accept(fpc.a(dkw.eq).a(fpd.a(dzc.J).a(jo.a.a, fpf.a().a(fpg.c, fpm.a(dkw.eq, "_ns"))).a(jo.a.c, fpf.a().a(fpg.c, fpm.a(dkw.eq, "_ew")))));
   }

   private void aa() {
      ald $$0 = fpr.a.create(dkw.ei, this.d);
      this.b
         .accept(
            fpc.a(
               dkw.ei,
               fpf.a().a(fpg.c, $$0),
               fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.b),
               fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.c),
               fpf.a().a(fpg.c, $$0).a(fpg.a, fpg.a.d),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b).a(fpg.a, fpg.a.b),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b).a(fpg.a, fpg.a.c),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.b).a(fpg.a, fpg.a.d),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c).a(fpg.a, fpg.a.b),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c).a(fpg.a, fpg.a.c),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.c).a(fpg.a, fpg.a.d),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d).a(fpg.a, fpg.a.b),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d).a(fpg.a, fpg.a.c),
               fpf.a().a(fpg.c, $$0).a(fpg.b, fpg.a.d).a(fpg.a, fpg.a.d)
            )
         );
   }

   private void ab() {
      ald $$0 = fpm.a(dkw.lq);
      ald $$1 = fpm.a(dkw.lq, "_on");
      this.b.accept(fpc.a(dkw.lq).a(a(dzc.A, $$1, $$0)).a(e()));
   }

   private void ac() {
      fpp $$0 = new fpp().a(fpq.e, fpp.a(dkw.bF, "_bottom")).a(fpq.i, fpp.a(dkw.bF, "_side"));
      ald $$1 = fpp.a(dkw.bF, "_top_sticky");
      ald $$2 = fpp.a(dkw.bF, "_top");
      fpp $$3 = $$0.c(fpq.F, $$1);
      fpp $$4 = $$0.c(fpq.F, $$2);
      ald $$5 = fpm.a(dkw.bF, "_base");
      this.a(dkw.bF, $$5, $$4);
      this.a(dkw.by, $$5, $$3);
      ald $$6 = fpo.n.a(dkw.bF, "_inventory", $$0.c(fpq.f, $$2), this.d);
      ald $$7 = fpo.n.a(dkw.by, "_inventory", $$0.c(fpq.f, $$1), this.d);
      this.a(dkw.bF, $$6);
      this.a(dkw.by, $$7);
   }

   private void a(dku $$0, ald $$1, fpp $$2) {
      ald $$3 = fpo.bs.a($$0, $$2, this.d);
      this.b.accept(fpc.a($$0).a(a(dzc.j, $$1, $$3)).a(e()));
   }

   private void ad() {
      fpp $$0 = new fpp().a(fpq.G, fpp.a(dkw.bF, "_top")).a(fpq.i, fpp.a(dkw.bF, "_side"));
      fpp $$1 = $$0.c(fpq.F, fpp.a(dkw.bF, "_top_sticky"));
      fpp $$2 = $$0.c(fpq.F, fpp.a(dkw.bF, "_top"));
      this.b
         .accept(
            fpc.a(dkw.bG)
               .a(
                  fpd.a(dzc.B, dzc.bj)
                     .a(false, dzo.a, fpf.a().a(fpg.c, fpo.bt.a(dkw.bF, "_head", $$2, this.d)))
                     .a(false, dzo.b, fpf.a().a(fpg.c, fpo.bt.a(dkw.bF, "_head_sticky", $$1, this.d)))
                     .a(true, dzo.a, fpf.a().a(fpg.c, fpo.bu.a(dkw.bF, "_head_short", $$2, this.d)))
                     .a(true, dzo.b, fpf.a().a(fpg.c, fpo.bu.a(dkw.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      dku $$0 = dkw.tX;
      fpp $$1 = fpp.a($$0, "_side_inactive", "_top_inactive");
      fpp $$2 = fpp.a($$0, "_side_active", "_top_active");
      fpp $$3 = fpp.a($$0, "_side_active", "_top_ejecting_reward");
      fpp $$4 = fpp.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fpp $$5 = fpp.a($$0, "_side_active_ominous", "_top_active_ominous");
      fpp $$6 = fpp.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ald $$7 = fpo.o.a($$0, $$1, this.d);
      ald $$8 = fpo.o.a($$0, "_active", $$2, this.d);
      ald $$9 = fpo.o.a($$0, "_ejecting_reward", $$3, this.d);
      ald $$10 = fpo.o.a($$0, "_inactive_ominous", $$4, this.d);
      ald $$11 = fpo.o.a($$0, "_active_ominous", $$5, this.d);
      ald $$12 = fpo.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fpc.a($$0).a(fpd.a(dzc.bB, dzc.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fpf.a().a(fpg.c, $$7x ? $$10 : $$7);
            case b, c, d -> fpf.a().a(fpg.c, $$7x ? $$11 : $$8);
            case e -> fpf.a().a(fpg.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      dku $$0 = dkw.tY;
      fpp $$1 = fpp.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fpp $$2 = fpp.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fpp $$3 = fpp.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fpp $$4 = fpp.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ald $$5 = fpo.cb.a($$0, $$1, this.d);
      ald $$6 = fpo.cb.a($$0, "_active", $$2, this.d);
      ald $$7 = fpo.cb.a($$0, "_unlocking", $$3, this.d);
      ald $$8 = fpo.cb.a($$0, "_ejecting_reward", $$4, this.d);
      fpp $$9 = fpp.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fpp $$10 = fpp.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fpp $$11 = fpp.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fpp $$12 = fpp.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ald $$13 = fpo.cb.a($$0, "_ominous", $$9, this.d);
      ald $$14 = fpo.cb.a($$0, "_active_ominous", $$10, this.d);
      ald $$15 = fpo.cb.a($$0, "_unlocking_ominous", $$11, this.d);
      ald $$16 = fpo.cb.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fpc.a($$0).a(b()).a(fpd.a(dtx.b, dtx.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fpf.a().a(fpg.c, $$9x ? $$13 : $$5);
            case b -> fpf.a().a(fpg.c, $$9x ? $$14 : $$6);
            case c -> fpf.a().a(fpg.c, $$9x ? $$15 : $$7);
            case d -> fpf.a().a(fpg.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      ald $$0 = fpm.a(dkw.ru, "_inactive");
      ald $$1 = fpm.a(dkw.ru, "_active");
      this.a(dkw.ru, $$0);
      this.b.accept(fpc.a(dkw.ru).a(fpd.a(dzc.br).a($$2 -> fpf.a().a(fpg.c, $$2 != dzt.b && $$2 != dzt.c ? $$0 : $$1))));
   }

   private void ah() {
      ald $$0 = fpm.a(dkw.rv, "_inactive");
      ald $$1 = fpm.a(dkw.rv, "_active");
      this.a(dkw.rv, $$0);
      this.b.accept(fpc.a(dkw.rv).a(fpd.a(dzc.br).a($$2 -> fpf.a().a(fpg.c, $$2 != dzt.b && $$2 != dzt.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      ald $$0 = fpo.ca.a(dkw.rz, fpp.a(false), this.d);
      ald $$1 = fpo.ca.a(dkw.rz, "_can_summon", fpp.a(true), this.d);
      this.a(dkw.rz, $$0);
      this.b.accept(fpc.a(dkw.rz).a(a(dzc.e, $$1, $$0)));
   }

   private void aj() {
      ald $$0 = fpm.a(dkw.ou, "_stable");
      ald $$1 = fpm.a(dkw.ou, "_unstable");
      this.a(dkw.ou, $$0);
      this.b.accept(fpc.a(dkw.ou).a(a(dzc.d, $$1, $$0)));
   }

   private void ak() {
      ald $$0 = this.a(dkw.sZ, "", fpo.ao, fpp::c);
      ald $$1 = this.a(dkw.sZ, "_lit", fpo.ao, fpp::c);
      this.b.accept(fpc.a(dkw.sZ).a(a(dzc.b, $$1, $$0)));
      ald $$2 = this.a(dkw.ta, "", fpo.ao, fpp::c);
      ald $$3 = this.a(dkw.ta, "_lit", fpo.ao, fpp::c);
      this.b.accept(fpc.a(dkw.ta).a(a(dzc.b, $$3, $$2)));
   }

   private void al() {
      ald $$0 = fpr.a.create(dkw.fW, this.d);
      ald $$1 = this.a(dkw.fW, "_on", fpo.c, fpp::b);
      this.b.accept(fpc.a(dkw.fW).a(a(dzc.u, $$1, $$0)));
   }

   private void m(dku $$0, dku $$1) {
      fpp $$2 = fpp.B($$0);
      this.b.accept(c($$0, fpo.bm.a($$0, $$2, this.d)));
      this.b.accept(fpc.a($$1, fpf.a().a(fpg.c, fpo.bo.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fpp $$0 = fpp.B(dkw.dX);
      fpp $$1 = fpp.i(fpp.a(dkw.dX, "_off"));
      ald $$2 = fpo.bq.a(dkw.dX, $$0, this.d);
      ald $$3 = fpo.bn.a(dkw.dX, "_off", $$1, this.d);
      this.b.accept(fpc.a(dkw.dX).a(a(dzc.u, $$2, $$3)));
      ald $$4 = fpo.br.a(dkw.dY, $$0, this.d);
      ald $$5 = fpo.bp.a(dkw.dY, "_off", $$1, this.d);
      this.b.accept(fpc.a(dkw.dY).a(a(dzc.u, $$4, $$5)).a(d()));
      this.c(dkw.dX);
   }

   private void an() {
      this.b(cyc.mj);
      this.b.accept(fpc.a(dkw.eu).a(fpd.a(dzc.aD, dzc.v, dzc.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fpf.a().a(fpg.c, fpp.a(dkw.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cyc.da);
      this.b
         .accept(
            fpc.a(dkw.nx)
               .a(
                  fpd.a(dzc.aV, dzc.I)
                     .a(1, false, Arrays.asList(a(fpm.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fpm.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fpm.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fpm.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fpm.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fpm.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fpm.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fpm.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fpp $$0 = fpp.a(dkw.ea);
      ald $$1 = fpo.c.a(dkw.ec, $$0, this.d);
      this.b.accept(fpc.a(dkw.ea).a(fpd.a(dzc.aI).a($$1x -> fpf.a().a(fpg.c, $$1x < 8 ? fpm.a(dkw.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dkw.ea, fpm.a(dkw.ea, "_height2"));
      this.b.accept(c(dkw.ec, $$1));
   }

   private void aq() {
      this.b.accept(fpc.a(dkw.oE, fpf.a().a(fpg.c, fpm.a(dkw.oE))).a(b()));
   }

   private void ar() {
      ald $$0 = fpr.a.create(dkw.pC, this.d);
      this.a(dkw.pC, $$0);
      this.b.accept(fpc.a(dkw.pC).a(fpd.a(dzc.bm).a($$0x -> fpf.a().a(fpg.c, this.a(dkw.pC, "_" + $$0x.c(), fpo.c, fpp::b)))));
   }

   private void as() {
      Map<dzx, ald> $$0 = new HashMap<>();

      for (dzx $$1 : dzx.values()) {
         $$0.put($$1, this.a(dkw.pE, "_" + $$1.c(), fpo.c, fpp::b));
      }

      this.b.accept(fpc.a(dkw.pE).a(fpd.a(dzc.bF).a($$1x -> fpf.a().a(fpg.c, $$0.get($$1x)))));
      this.c.a(cyc.oV, fpk.a(dti.b, fpk.a($$0.get(dzx.a)), Map.of(dzx.c, fpk.a($$0.get(dzx.c)), dzx.b, fpk.a($$0.get(dzx.b)), dzx.d, fpk.a($$0.get(dzx.d)))));
   }

   private void at() {
      this.b(cyc.xz);
      this.b.accept(fpc.a(dkw.oK).a(fpd.a(dzc.av).a($$0 -> fpf.a().a(fpg.c, this.a(dkw.oK, "_stage" + $$0, fpo.ao, fpp::c)))));
   }

   private void au() {
      this.b(cyc.qb);
      this.b
         .accept(
            fpc.a(dkw.gd)
               .a(
                  fpd.a(dzc.a, dzc.O, dzc.N, dzc.P, dzc.Q)
                     .a(false, false, false, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ns")))
                     .a(false, true, false, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_n")).a(fpg.b, fpg.a.b))
                     .a(false, false, true, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_n")))
                     .a(false, false, false, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_n")).a(fpg.b, fpg.a.c))
                     .a(false, false, false, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_n")).a(fpg.b, fpg.a.d))
                     .a(false, true, true, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ne")))
                     .a(false, true, false, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ne")).a(fpg.b, fpg.a.b))
                     .a(false, false, false, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ne")).a(fpg.b, fpg.a.c))
                     .a(false, false, true, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ne")).a(fpg.b, fpg.a.d))
                     .a(false, false, true, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ns")))
                     .a(false, true, false, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_ns")).a(fpg.b, fpg.a.b))
                     .a(false, true, true, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_nse")))
                     .a(false, true, false, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_nse")).a(fpg.b, fpg.a.b))
                     .a(false, false, true, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_nse")).a(fpg.b, fpg.a.c))
                     .a(false, true, true, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_nse")).a(fpg.b, fpg.a.d))
                     .a(false, true, true, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_nsew")))
                     .a(true, false, false, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_n")))
                     .a(true, false, false, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_n")).a(fpg.b, fpg.a.c))
                     .a(true, true, false, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_n")).a(fpg.b, fpg.a.b))
                     .a(true, false, false, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_n")).a(fpg.b, fpg.a.d))
                     .a(true, true, true, false, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ne")).a(fpg.b, fpg.a.b))
                     .a(true, false, false, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ne")).a(fpg.b, fpg.a.c))
                     .a(true, false, true, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ne")).a(fpg.b, fpg.a.d))
                     .a(true, false, true, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_ns")).a(fpg.b, fpg.a.b))
                     .a(true, true, true, true, false, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_nse")).a(fpg.b, fpg.a.b))
                     .a(true, false, true, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_nse")).a(fpg.b, fpg.a.c))
                     .a(true, true, true, false, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_nse")).a(fpg.b, fpg.a.d))
                     .a(true, true, true, true, true, fpf.a().a(fpg.c, fpm.a(dkw.gd, "_attached_nsew")))
               )
         );
   }

   private void av() {
      this.c(dkw.gc);
      this.b
         .accept(fpc.a(dkw.gc).a(fpd.a(dzc.a, dzc.A).a(($$0, $$1) -> fpf.a().a(fpg.c, fpp.a(dkw.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ald a(int $$0, String $$1, fpp $$2) {
      switch ($$0) {
         case 1:
            return fpo.bw.a(fpm.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fpo.bx.a(fpm.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fpo.by.a(fpm.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fpo.bz.a(fpm.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ald a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fpp.b(fpp.J(dkw.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fpp.b(fpp.a(dkw.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fpp.b(fpp.a(dkw.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void aw() {
      this.b(cyc.kO);
      this.b.accept(fpc.a(dkw.mH).a(fpd.a(dzc.aG, dzc.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void ax() {
      this.b(cyc.kP);
      Function<Integer, ald> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fpp $$2 = fpp.a($$1);
         return fpo.bH.a(dkw.mI, $$1, $$2, this.d);
      };
      this.b.accept(fpc.a(dkw.mI).a(fpd.a(dsi.c).a($$1 -> fpf.a().a(fpg.c, $$0.apply($$1)))));
   }

   private void J(dku $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dku $$0, cxu $$1) {
      this.b($$1);
      this.K($$0);
   }

   private void K(dku $$0) {
      ald $$1 = fpm.a($$0);
      fpb $$2 = fpb.a($$0);
      fpa.c $$3 = af.a(fpa.a(), $$1x -> a.stream().<jo>map(Pair::getFirst).map(dpy::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<jo, Function<ald, fpf>> $$4 : a) {
         dzd $$5 = dpy.b((jo)$$4.getFirst());
         Function<ald, fpf> $$6 = (Function<ald, fpf>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fpa.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void L(dku $$0) {
      ald $$1 = fpr.j.create($$0, this.d);
      ald $$2 = fpr.k.get($$0).a($$1x -> $$1x.a(fpq.i, fpp.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      ald $$3 = fpr.k.get($$0).a($$1x -> $$1x.a(fpq.i, fpp.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fpb $$4 = fpb.a($$0);
      fpa.c $$5 = fpa.a().a(dpw.b, false);
      $$4.a(fpa.a().a(dpw.b, true), fpf.a().a(fpg.c, $$1));
      $$4.a($$5, fpf.a().a(fpg.c, $$1));
      a.stream().<jo>map(Pair::getFirst).forEach($$2x -> {
         dzk<dzz> $$3x = dpw.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, dzz.a);
         }
      });

      for (Pair<jo, Function<ald, fpf>> $$6 : a) {
         jo $$7 = (jo)$$6.getFirst();
         dzk<dzz> $$8 = dpw.a($$7);
         if ($$8 != null) {
            Function<ald, fpf> $$9 = (Function<ald, fpf>)$$6.getSecond();
            $$4.a(fpa.a().a($$8, dzz.c), $$9.apply($$2));
            $$4.a(fpa.a().a($$8, dzz.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void M(dku $$0) {
      fpd $$1 = fpd.a(don.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fpp $$3 = fpp.c(fpp.a($$0, $$2));
         ald $$4 = fou.d.b.a().a($$0, $$2, $$3, this.d);
         return fpf.a().a(fpg.c, $$4);
      });
      this.c($$0);
      this.b.accept(fpc.a($$0).a($$1));
   }

   private void ay() {
      ald $$0 = fpp.a(dkw.ry, "_bottom");
      fpp $$1 = new fpp().a(fpq.e, $$0).a(fpq.f, fpp.a(dkw.ry, "_top")).a(fpq.i, fpp.a(dkw.ry, "_side"));
      fpp $$2 = new fpp().a(fpq.e, $$0).a(fpq.f, fpp.a(dkw.ry, "_top_bloom")).a(fpq.i, fpp.a(dkw.ry, "_side_bloom"));
      ald $$3 = fpo.n.a(dkw.ry, "", $$1, this.d);
      ald $$4 = fpo.n.a(dkw.ry, "_bloom", $$2, this.d);
      this.b.accept(fpc.a(dkw.ry).a(fpd.a(dzc.c).a($$2x -> fpf.a().a(fpg.c, $$2x ? $$4 : $$3))));
      this.a(dkw.ry, $$3);
   }

   private void az() {
      dku $$0 = dkw.ct;
      ald $$1 = fpm.a($$0);
      fpb $$2 = fpb.a($$0);
      List.of(Pair.of(jo.c, fpg.a.a), Pair.of(jo.f, fpg.a.b), Pair.of(jo.d, fpg.a.c), Pair.of(jo.e, fpg.a.d)).forEach($$2x -> {
         jo $$3 = (jo)$$2x.getFirst();
         fpg.a $$4 = (fpg.a)$$2x.getSecond();
         fpa.c $$5 = fpa.a().a(dzc.T, $$3);
         $$2.a($$5, fpf.a().a(fpg.c, $$1).a(fpg.b, $$4).a(fpg.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fpm.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fpb $$0, fpa.c $$1, fpg.a $$2) {
      List.of(
            Pair.of(dzc.bs, fpo.aT),
            Pair.of(dzc.bt, fpo.aU),
            Pair.of(dzc.bu, fpo.aV),
            Pair.of(dzc.bv, fpo.aW),
            Pair.of(dzc.bw, fpo.aX),
            Pair.of(dzc.bx, fpo.aY)
         )
         .forEach($$3 -> {
            dzd $$4 = (dzd)$$3.getFirst();
            fpn $$5 = (fpn)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fpb $$0, fpa.c $$1, fpg.a $$2, dzd $$3, fpn $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fpp $$7 = new fpp().a(fpq.b, fpp.a(dkw.ct, $$6));
      fou.c $$8 = new fou.c($$4, $$6);
      ald $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dkw.ct, $$6, $$7, this.d));
      $$0.a(fpa.a($$1, fpa.a().a($$3, $$5)), fpf.a().a(fpg.c, $$9).a(fpg.b, $$2));
   }

   private void aA() {
      this.b.accept(c(dkw.ll, fpo.c.a(dkw.ll, fpp.b(fpm.a("magma")), this.d)));
   }

   private void a(dku $$0, @Nullable cwv $$1) {
      this.r($$0);
      cxu $$2 = $$0.i();
      ald $$3 = fpo.bO.a($$2, fpp.x($$0), this.d);
      hdk.b $$4 = $$1 != null ? fpk.a($$3, new hfu.a($$1)) : fpk.a($$3, new hfu.a());
      this.c.a($$2, $$4);
   }

   private void c(dku $$0, dku $$1, fou.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aB() {
      ald $$0 = fpm.a(dkw.b);
      ald $$1 = fpm.a(dkw.b, "_mirrored");
      this.b.accept(a(dkw.fb, $$0, $$1));
      this.a(dkw.fb, $$0);
   }

   private void aC() {
      ald $$0 = fpm.a(dkw.tp);
      ald $$1 = fpm.a(dkw.tp, "_mirrored");
      this.b.accept(a(dkw.tJ, $$0, $$1).a(f()));
      this.a(dkw.tJ, $$0);
   }

   private void n(dku $$0, dku $$1) {
      this.a($$0, fou.d.b);
      fpp $$2 = fpp.d(fpp.a($$0, "_pot"));
      ald $$3 = fou.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aD() {
      ald $$0 = fpp.a(dkw.pP, "_bottom");
      ald $$1 = fpp.a(dkw.pP, "_top_off");
      ald $$2 = fpp.a(dkw.pP, "_top");
      ald[] $$3 = new ald[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fpp $$5 = new fpp().a(fpq.e, $$0).a(fpq.f, $$4 == 0 ? $$1 : $$2).a(fpq.i, fpp.a(dkw.pP, "_side" + $$4));
         $$3[$$4] = fpo.n.a(dkw.pP, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fpc.a(dkw.pP).a(fpd.a(dzc.bc).a($$1x -> fpf.a().a(fpg.c, $$3[$$1x]))));
      this.a(dkw.pP, $$3[0]);
   }

   private fpf a(jq $$0, fpf $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fpg.a, fpg.a.b);
         case c:
            return $$1.a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.c);
         case d:
            return $$1.a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.d);
         case a:
            return $$1.a(fpg.a, fpg.a.b).a(fpg.b, fpg.a.b);
         case f:
            return $$1.a(fpg.a, fpg.a.d).a(fpg.b, fpg.a.c);
         case g:
            return $$1.a(fpg.a, fpg.a.d);
         case h:
            return $$1.a(fpg.a, fpg.a.d).a(fpg.b, fpg.a.b);
         case e:
            return $$1.a(fpg.a, fpg.a.d).a(fpg.b, fpg.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fpg.b, fpg.a.c);
         case i:
            return $$1.a(fpg.b, fpg.a.d);
         case j:
            return $$1.a(fpg.b, fpg.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aE() {
      ald $$0 = fpp.a(dkw.pD, "_top");
      ald $$1 = fpp.a(dkw.pD, "_bottom");
      ald $$2 = fpp.a(dkw.pD, "_side");
      ald $$3 = fpp.a(dkw.pD, "_lock");
      fpp $$4 = new fpp().a(fpq.o, $$2).a(fpq.m, $$2).a(fpq.l, $$2).a(fpq.c, $$0).a(fpq.j, $$0).a(fpq.k, $$1).a(fpq.n, $$3);
      ald $$5 = fpo.b.a(dkw.pD, $$4, this.d);
      this.b.accept(fpc.a(dkw.pD, fpf.a().a(fpg.c, $$5)).a(fpd.a(dzc.W).a($$0x -> this.a($$0x, fpf.a()))));
   }

   private void aF() {
      dku $$0 = dkw.n;
      ald $$1 = fpm.a($$0);
      fpr $$2 = fpr.a.get($$0);
      dku $$3 = dkw.kg;
      ald $$4 = fpo.ab.a($$3, $$2.b(), this.d);
      ald $$5 = fpo.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dku $$0, dku $$1, dsc.a $$2, ald $$3) {
      ald $$4 = fpm.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.i(), fpk.a($$3, new hfv.a($$2)));
   }

   private void aG() {
      ald $$0 = fpm.b("template_skull");
      this.a(dkw.hj, dkw.hk, dsc.b.g, $$0);
      this.a(dkw.hh, dkw.hi, dsc.b.e, $$0);
      this.a(dkw.hf, dkw.hg, dsc.b.f, $$0);
      this.a(dkw.hb, dkw.hc, dsc.b.c, $$0);
      this.a(dkw.hd, dkw.he, dsc.b.d, $$0);
      this.a(dkw.hn, dkw.ho, dsc.b.h, $$0);
      this.a(dkw.hl, dkw.hm, dsc.b.i, fpm.a(cyc.vt));
   }

   private void a(dku $$0, dku $$1, cwv $$2) {
      ald $$3 = fpm.a("banner");
      ald $$4 = fpm.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cxu $$5 = $$0.i();
      this.c.a($$5, fpk.a($$4, new hfm.a($$2)));
   }

   private void aH() {
      this.a(dkw.jh, dkw.jx, cwv.a);
      this.a(dkw.ji, dkw.jy, cwv.b);
      this.a(dkw.jj, dkw.jz, cwv.c);
      this.a(dkw.jk, dkw.jA, cwv.d);
      this.a(dkw.jl, dkw.jB, cwv.e);
      this.a(dkw.jm, dkw.jC, cwv.f);
      this.a(dkw.jn, dkw.jD, cwv.g);
      this.a(dkw.jo, dkw.jE, cwv.h);
      this.a(dkw.jp, dkw.jF, cwv.i);
      this.a(dkw.jq, dkw.jG, cwv.j);
      this.a(dkw.jr, dkw.jH, cwv.k);
      this.a(dkw.js, dkw.jI, cwv.l);
      this.a(dkw.jt, dkw.jJ, cwv.m);
      this.a(dkw.ju, dkw.jK, cwv.n);
      this.a(dkw.jv, dkw.jL, cwv.o);
      this.a(dkw.jw, dkw.jM, cwv.p);
   }

   private void a(dku $$0, dku $$1, ald $$2, boolean $$3) {
      this.a($$0, $$1);
      cxu $$4 = $$0.i();
      ald $$5 = fpo.bQ.a($$4, fpp.x($$1), this.d);
      hdk.b $$6 = fpk.a($$5, new hfo.a($$2));
      if ($$3) {
         hdk.b $$7 = fpk.a($$5, new hfo.a(hfo.a));
         this.c.a($$4, fpk.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aI() {
      this.a(dkw.cD, dkw.n, hfo.b, true);
      this.a(dkw.hs, dkw.n, hfo.c, true);
      this.a(dkw.gb, dkw.cv, hfo.d, false);
   }

   private void b(dku $$0, dku $$1, cwv $$2) {
      ald $$3 = fpm.a("bed");
      this.b.accept(c($$0, $$3));
      cxu $$4 = $$0.i();
      ald $$5 = fpo.bP.a(fpm.a($$4), fpp.x($$1), this.d);
      this.c.a($$4, fpk.a($$5, new hfn.a($$2)));
   }

   private void aJ() {
      this.b(dkw.bg, dkw.bH, cwv.a);
      this.b(dkw.bh, dkw.bI, cwv.b);
      this.b(dkw.bi, dkw.bJ, cwv.c);
      this.b(dkw.bj, dkw.bK, cwv.d);
      this.b(dkw.bk, dkw.bL, cwv.e);
      this.b(dkw.bl, dkw.bM, cwv.f);
      this.b(dkw.bm, dkw.bN, cwv.g);
      this.b(dkw.bn, dkw.bO, cwv.h);
      this.b(dkw.bo, dkw.bP, cwv.i);
      this.b(dkw.bp, dkw.bQ, cwv.j);
      this.b(dkw.bq, dkw.bR, cwv.k);
      this.b(dkw.br, dkw.bS, cwv.l);
      this.b(dkw.bs, dkw.bT, cwv.m);
      this.b(dkw.bt, dkw.bU, cwv.n);
      this.b(dkw.bu, dkw.bV, cwv.o);
      this.b(dkw.bv, dkw.bW, cwv.p);
   }

   private void a(dku $$0, hfw.a $$1) {
      cxu $$2 = $$0.i();
      ald $$3 = fpm.a($$2);
      this.c.a($$2, fpk.a($$3, $$1));
   }

   public void a() {
      mg.a().filter(mh::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dkw.rJ).a(mg.x).a(dkw.rJ, dkw.sh).a(dkw.rN, dkw.rR).a(mg.z);
      this.i(dkw.rI).a(mg.B).a(dkw.rI, dkw.sg).a(dkw.rM, dkw.rQ).a(mg.D);
      this.i(dkw.rH).a(mg.F).a(dkw.rH, dkw.sf).a(dkw.rL, dkw.rP).a(mg.H);
      this.i(dkw.rG).a(mg.J).a(dkw.rG, dkw.se).a(dkw.rK, dkw.rO).a(mg.L);
      this.A(dkw.sO);
      this.A(dkw.sP);
      this.A(dkw.sQ);
      this.A(dkw.sR);
      this.j(dkw.sO, dkw.sS);
      this.j(dkw.sP, dkw.sT);
      this.j(dkw.sQ, dkw.sU);
      this.j(dkw.sR, dkw.sV);
      this.n(dkw.a);
      this.d(dkw.nE, dkw.a);
      this.d(dkw.nD, dkw.a);
      this.n(dkw.gj);
      this.n(dkw.ed);
      this.d(dkw.nF, dkw.J);
      this.n(dkw.fV);
      this.n(dkw.mG);
      this.n(dkw.fM);
      this.n(dkw.gm);
      this.b(cyc.vh);
      this.n(dkw.pK);
      this.n(dkw.J);
      this.n(dkw.K);
      this.n(dkw.it);
      this.b(cyc.gj);
      this.o(dkw.qq, dkw.qH);
      this.o(dkw.qr, dkw.qI);
      this.o(dkw.qs, dkw.qJ);
      this.o(dkw.qt, dkw.qK);
      this.o(dkw.qu, dkw.qL);
      this.o(dkw.qv, dkw.qM);
      this.o(dkw.qw, dkw.qN);
      this.o(dkw.qx, dkw.qO);
      this.o(dkw.qy, dkw.qP);
      this.o(dkw.qz, dkw.qQ);
      this.o(dkw.qA, dkw.qR);
      this.o(dkw.qB, dkw.qS);
      this.o(dkw.qC, dkw.qT);
      this.o(dkw.qD, dkw.qU);
      this.o(dkw.qE, dkw.qV);
      this.o(dkw.qF, dkw.qW);
      this.o(dkw.qp, dkw.qG);
      this.n(dkw.nC);
      this.n(dkw.gO);
      this.n(dkw.rt);
      this.n(dkw.tb);
      this.w(dkw.tc);
      this.w(dkw.td);
      this.x(dkw.tO);
      this.x(dkw.tP);
      this.ak();
      this.h(dkw.ti, dkw.te);
      this.L(dkw.ub);
      this.M(dkw.uc);
      this.a(dkw.ua);
      this.t(dkw.tf);
      this.t(dkw.tg);
      this.s(dkw.th);
      this.a(dkw.iu, cyc.ia);
      this.b(cyc.ia);
      this.aK();
      this.a(dkw.lp, cyc.jA);
      this.b(cyc.jA);
      this.f(dkw.bX, fpp.a(dkw.bF, "_side"));
      this.a(dkw.U);
      this.a(dkw.V);
      this.a(dkw.iZ);
      this.a(dkw.cF);
      this.a(dkw.cG);
      this.a(dkw.cH);
      this.a(dkw.fZ);
      this.a(dkw.ga);
      this.a(dkw.ge);
      this.a(dkw.Q);
      this.a(dkw.W);
      this.a(dkw.R);
      this.a(dkw.co);
      this.a(dkw.S);
      this.a(dkw.T);
      this.a(dkw.cp);
      this.b(dkw.pN, fpr.d);
      this.a(dkw.pM);
      this.a(dkw.aY);
      this.a(dkw.aZ);
      this.a(dkw.ba);
      this.a(dkw.fC);
      this.a(dkw.hy);
      this.a(dkw.dV);
      this.a(dkw.dW);
      this.a(dkw.hx);
      this.a(dkw.qg);
      this.a(dkw.ny);
      this.a(dkw.ee);
      this.a(dkw.k);
      this.a(dkw.pO);
      this.a(dkw.fU);
      this.a(dkw.ep);
      this.a(dkw.O);
      this.a(dkw.pL);
      this.a(dkw.eb);
      this.b(dkw.eg, fpr.g);
      this.b(dkw.pU, fpr.d);
      this.b(dkw.fo, fpr.d);
      this.n(dkw.ag);
      this.n(dkw.gw);
      this.a(dkw.lm);
      this.a(dkw.bf);
      this.a(dkw.ja);
      this.a(dkw.cv);
      this.a(dkw.qo);
      this.a(dkw.iG);
      this.a(dkw.pa);
      this.a(dkw.ej);
      this.a(dkw.ek);
      this.b(dkw.cA, fpr.b);
      this.g(dkw.cB);
      this.a(dkw.aV);
      this.b(dkw.bD, fpr.z);
      this.b(cyc.cZ);
      this.b(dkw.cr, fpr.f);
      this.b(dkw.pH, fpr.d);
      this.a(dkw.oR);
      this.a(dkw.aW);
      this.a(dkw.qX);
      this.a(dkw.qY);
      this.a(dkw.rr);
      this.a(dkw.sY);
      this.a(dkw.tL);
      this.a(dkw.tM);
      this.a(dkw.tN);
      this.d(dkw.rw);
      this.n(dkw.tZ);
      this.aF();
      this.a(dkw.rE);
      this.a(dkw.rF);
      this.a(dkw.rA);
      this.a(dkw.rB);
      this.a(dkw.rC);
      this.a(dkw.rD);
      this.l(dkw.rA, dkw.sa);
      this.l(dkw.rB, dkw.sc);
      this.l(dkw.rC, dkw.sb);
      this.l(dkw.rD, dkw.sd);
      this.j(dkw.sq);
      this.j(dkw.sr);
      this.j(dkw.st);
      this.j(dkw.ss);
      this.b(dkw.sq, dkw.su);
      this.b(dkw.sr, dkw.sv);
      this.b(dkw.st, dkw.sx);
      this.b(dkw.ss, dkw.sw);
      this.l(dkw.sy);
      this.l(dkw.sz);
      this.l(dkw.sB);
      this.l(dkw.sA);
      this.c(dkw.sy, dkw.sC);
      this.c(dkw.sz, dkw.sD);
      this.c(dkw.sB, dkw.sF);
      this.c(dkw.sA, dkw.sE);
      this.a(dkw.sG);
      this.a(dkw.sH);
      this.a(dkw.sI);
      this.a(dkw.sJ);
      this.l(dkw.sG, dkw.sK);
      this.l(dkw.sH, dkw.sL);
      this.l(dkw.sI, dkw.sM);
      this.l(dkw.sJ, dkw.sN);
      this.k(dkw.ht, dkw.co);
      this.k(dkw.hu, dkw.cp);
      this.H();
      this.s();
      this.az();
      this.w();
      this.x();
      this.a(dkw.oI, dkw.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.D(dkw.kV);
      this.K();
      this.L();
      this.M();
      this.N();
      this.Q();
      this.R();
      this.S();
      this.T();
      this.r();
      this.U();
      this.V();
      this.W();
      this.X();
      this.Z();
      this.aa();
      this.ab();
      this.ac();
      this.ad();
      this.aj();
      this.am();
      this.al();
      this.an();
      this.ao();
      this.z();
      this.ap();
      this.aq();
      this.ar();
      this.at();
      this.as();
      this.a(dkw.pF);
      this.au();
      this.av();
      this.aw();
      this.ax();
      this.g();
      this.J(dkw.fu);
      this.J(dkw.rx);
      this.b(dkw.fv, cyc.go);
      this.aA();
      this.aE();
      this.ag();
      this.ah();
      this.ai();
      this.Y();
      this.P();
      this.O();
      this.ae();
      this.af();
      this.I(dkw.cX);
      this.c(dkw.cX);
      this.I(dkw.oC);
      this.h();
      this.I(dkw.tk);
      this.m(dkw.cw, dkw.cx);
      this.m(dkw.en, dkw.eo);
      this.a(dkw.cI, dkw.n, fpp::c);
      this.a(dkw.oA, dkw.p, fpp::d);
      this.C(dkw.oY);
      this.C(dkw.oP);
      this.z(dkw.bb);
      this.z(dkw.hF);
      this.D();
      this.H(dkw.oG);
      this.H(dkw.oH);
      this.e(dkw.fl, fpm.a(dkw.fl));
      this.a(dkw.el, fpr.d);
      this.a(dkw.em, fpr.d);
      this.a(dkw.tK);
      this.a(dkw.lo, fpr.d);
      this.e(dkw.j);
      this.e(dkw.tn);
      this.e(dkw.L);
      this.f(dkw.M);
      this.f(dkw.P);
      this.e(dkw.N);
      this.d(dkw.I);
      this.b(dkw.tU, fpr.f);
      this.a(dkw.iH, fpr.d, fpr.e);
      this.a(dkw.kZ, fpr.A, fpr.B);
      this.a(dkw.hC, fpr.A, fpr.B);
      this.a(dkw.tQ, fpr.d, fpr.e);
      this.a(dkw.tR, fpr.d, fpr.e);
      this.a(dkw.tS, fpr.d, fpr.e);
      this.c(dkw.ov, fpr.i);
      this.A();
      this.a(dkw.pI, fpp::D);
      this.a(dkw.pJ, fpp::F);
      this.a(dkw.lf, dzc.av, 0, 1, 2, 3);
      this.a(dkw.gP, dzc.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkw.fL, dzc.av, 0, 1, 1, 2);
      this.a(dkw.gQ, dzc.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dkw.cJ, dzc.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dkw.lc, fou.d.b, dzc.at, 0, 1);
      this.j();
      this.i();
      this.aH();
      this.aJ();
      this.aG();
      this.aI();
      this.a(dkw.lr, null);
      this.a(dkw.ls, cwv.a);
      this.a(dkw.lt, cwv.b);
      this.a(dkw.lu, cwv.c);
      this.a(dkw.lv, cwv.d);
      this.a(dkw.lw, cwv.e);
      this.a(dkw.lx, cwv.f);
      this.a(dkw.ly, cwv.g);
      this.a(dkw.lz, cwv.h);
      this.a(dkw.lA, cwv.i);
      this.a(dkw.lB, cwv.j);
      this.a(dkw.lC, cwv.k);
      this.a(dkw.lD, cwv.l);
      this.a(dkw.lE, cwv.m);
      this.a(dkw.lF, cwv.n);
      this.a(dkw.lG, cwv.o);
      this.a(dkw.lH, cwv.p);
      this.r(dkw.nz);
      this.a(dkw.nz, new hfp.a());
      this.a(dkw.tV, dkw.iY);
      this.a(dkw.tV, new hfq.a());
      this.a(dkw.fS, dkw.cv);
      this.a(dkw.lh, dkw.cv);
      this.a(dkw.aT);
      this.a(dkw.aU);
      this.a(dkw.lY);
      this.a(dkw.lZ);
      this.a(dkw.ma);
      this.a(dkw.mb);
      this.a(dkw.mc);
      this.a(dkw.md);
      this.a(dkw.me);
      this.a(dkw.mf);
      this.a(dkw.mg);
      this.a(dkw.mh);
      this.a(dkw.mi);
      this.a(dkw.mj);
      this.a(dkw.mk);
      this.a(dkw.ml);
      this.a(dkw.mm);
      this.a(dkw.mn);
      this.a(fpr.a, dkw.mo, dkw.mp, dkw.mq, dkw.mr, dkw.ms, dkw.mt, dkw.mu, dkw.mv, dkw.mw, dkw.mx, dkw.my, dkw.mz, dkw.mA, dkw.mB, dkw.mC, dkw.mD);
      this.a(dkw.iY);
      this.a(dkw.hG);
      this.a(dkw.hH);
      this.a(dkw.hI);
      this.a(dkw.hJ);
      this.a(dkw.hK);
      this.a(dkw.hL);
      this.a(dkw.hM);
      this.a(dkw.hN);
      this.a(dkw.hO);
      this.a(dkw.hP);
      this.a(dkw.hQ);
      this.a(dkw.hR);
      this.a(dkw.hS);
      this.a(dkw.hT);
      this.a(dkw.hU);
      this.a(dkw.hV);
      this.a(dkw.rs);
      this.i(dkw.aX, dkw.fm);
      this.i(dkw.ev, dkw.hW);
      this.i(dkw.ew, dkw.hX);
      this.i(dkw.ex, dkw.hY);
      this.i(dkw.ey, dkw.hZ);
      this.i(dkw.ez, dkw.ia);
      this.i(dkw.eA, dkw.ib);
      this.i(dkw.eB, dkw.ic);
      this.i(dkw.eC, dkw.id);
      this.i(dkw.eD, dkw.ie);
      this.i(dkw.eE, dkw.if);
      this.i(dkw.eF, dkw.ig);
      this.i(dkw.eG, dkw.ih);
      this.i(dkw.eH, dkw.ii);
      this.i(dkw.eI, dkw.ij);
      this.i(dkw.eJ, dkw.ik);
      this.i(dkw.eK, dkw.il);
      this.b(fpr.t, dkw.lI, dkw.lJ, dkw.lK, dkw.lL, dkw.lM, dkw.lN, dkw.lO, dkw.lP, dkw.lQ, dkw.lR, dkw.lS, dkw.lT, dkw.lU, dkw.lV, dkw.lW, dkw.lX);
      this.h(dkw.bH, dkw.iI);
      this.h(dkw.bI, dkw.iJ);
      this.h(dkw.bJ, dkw.iK);
      this.h(dkw.bK, dkw.iL);
      this.h(dkw.bL, dkw.iM);
      this.h(dkw.bM, dkw.iN);
      this.h(dkw.bN, dkw.iO);
      this.h(dkw.bO, dkw.iP);
      this.h(dkw.bP, dkw.iQ);
      this.h(dkw.bQ, dkw.iR);
      this.h(dkw.bR, dkw.iS);
      this.h(dkw.bS, dkw.iT);
      this.h(dkw.bT, dkw.iU);
      this.h(dkw.bU, dkw.iV);
      this.h(dkw.bV, dkw.iW);
      this.h(dkw.bW, dkw.iX);
      this.a(dkw.to);
      this.a(dkw.eZ);
      this.b(dkw.bB, dkw.gx, fou.d.a);
      this.h(dkw.bB);
      this.a(dkw.bY, dkw.gy, fou.d.b);
      this.a(dkw.ca, dkw.gz, fou.d.b);
      this.a(dkw.ud, dkw.uf, fou.d.c);
      this.a(dkw.ue, dkw.ug, fou.d.b);
      this.a(dkw.cb, dkw.gA, fou.d.b);
      this.a(dkw.cc, dkw.gB, fou.d.b);
      this.a(dkw.cd, dkw.gC, fou.d.b);
      this.a(dkw.ce, dkw.gD, fou.d.b);
      this.a(dkw.cf, dkw.gE, fou.d.b);
      this.a(dkw.cg, dkw.gF, fou.d.b);
      this.a(dkw.ch, dkw.gG, fou.d.b);
      this.a(dkw.ci, dkw.gH, fou.d.b);
      this.a(dkw.cj, dkw.gI, fou.d.b);
      this.a(dkw.cl, dkw.gJ, fou.d.b);
      this.a(dkw.ck, dkw.gK, fou.d.b);
      this.a(dkw.cn, dkw.gL, fou.d.b);
      this.a(dkw.cm, dkw.gM, fou.d.b);
      this.a(dkw.bC, dkw.gN, fou.d.b);
      this.a(dkw.bZ, dkw.gn, fou.d.b);
      this.I();
      this.y(dkw.fh);
      this.y(dkw.fi);
      this.y(dkw.fj);
      this.b(dkw.bA, fou.d.a);
      this.h(dkw.bA);
      this.b(dkw.ef, fou.d.a);
      this.b(cyc.dS);
      this.c(dkw.mE, dkw.mF, fou.d.b);
      this.b(cyc.dT);
      this.b(dkw.tm, fou.d.b);
      this.c(dkw.pb, dkw.pc, fou.d.b);
      this.c(dkw.pd, dkw.pe, fou.d.b);
      this.a(dkw.pb, "_plant");
      this.a(dkw.pd, "_plant");
      this.a(dkw.nA, fou.d.a, fpp.c(fpp.a(dkw.nB, "_stage0")));
      this.n();
      this.a(dkw.bz, fou.d.b);
      this.d(dkw.jc, fou.d.b);
      this.d(dkw.jd, fou.d.b);
      this.d(dkw.je, fou.d.b);
      this.o(dkw.jf);
      this.o(dkw.jg);
      this.k();
      this.l();
      this.m();
      this.a(dkw.mY, dkw.mT, dkw.mO, dkw.mJ, dkw.ni, dkw.nd, dkw.ns, dkw.nn);
      this.a(dkw.mZ, dkw.mU, dkw.mP, dkw.mK, dkw.nj, dkw.ne, dkw.nt, dkw.no);
      this.a(dkw.na, dkw.mV, dkw.mQ, dkw.mL, dkw.nk, dkw.nf, dkw.nu, dkw.np);
      this.a(dkw.nb, dkw.mW, dkw.mR, dkw.mM, dkw.nl, dkw.ng, dkw.nv, dkw.nq);
      this.a(dkw.nc, dkw.mX, dkw.mS, dkw.mN, dkw.nm, dkw.nh, dkw.nw, dkw.nr);
      this.f(dkw.fs, dkw.fq);
      this.f(dkw.fr, dkw.fp);
      this.m(dkw.af).c(dkw.af).a(dkw.aA);
      this.m(dkw.ar).c(dkw.ar).a(dkw.aJ);
      this.a(dkw.ar, dkw.du, dkw.dE);
      this.a(dkw.aS, fpr.w, -7158200);
      this.m(dkw.ab).c(dkw.ab).a(dkw.ax);
      this.m(dkw.am).c(dkw.am).a(dkw.aF);
      this.a(dkw.am, dkw.dn, dkw.dz);
      this.a(dkw.D, dkw.gs, fou.d.b);
      this.a(dkw.aO, fpr.w, -12012264);
      this.m(dkw.ac).d(dkw.ac).a(dkw.ay);
      this.m(dkw.an).d(dkw.an).a(dkw.aG);
      this.a(dkw.an, dkw.do, dkw.dA);
      this.a(dkw.E, dkw.gt, fou.d.b);
      this.b(dkw.aP, fpr.w);
      this.m(dkw.Z).c(dkw.Z).a(dkw.av);
      this.m(dkw.ak).c(dkw.ak).a(dkw.aD);
      this.a(dkw.ak, dkw.dm, dkw.dy);
      this.a(dkw.B, dkw.gq, fou.d.b);
      this.a(dkw.aM, fpr.w, -8345771);
      this.m(dkw.X).c(dkw.X).a(dkw.at);
      this.m(dkw.aq).c(dkw.aq).a(dkw.aB);
      this.a(dkw.aq, dkw.dk, dkw.dw);
      this.a(dkw.z, dkw.go, fou.d.b);
      this.a(dkw.aK, fpr.w, -12012264);
      this.m(dkw.Y).c(dkw.Y).a(dkw.au);
      this.m(dkw.aj).c(dkw.aj).a(dkw.aC);
      this.a(dkw.aj, dkw.dl, dkw.dx);
      this.a(dkw.A, dkw.gp, fou.d.b);
      this.a(dkw.aL, fpr.w, -10380959);
      this.m(dkw.ad).c(dkw.ad).a(dkw.az);
      this.m(dkw.ao).c(dkw.ao).a(dkw.aH);
      this.a(dkw.ao, dkw.dq, dkw.dC);
      this.a(dkw.F, dkw.gu, fou.d.b);
      this.a(dkw.aQ, fpr.w, -12012264);
      this.m(dkw.ae).c(dkw.ae).a(dkw.u);
      this.m(dkw.ap).c(dkw.ap).a(dkw.aI);
      this.a(dkw.ap, dkw.dr, dkw.dD);
      this.a(dkw.G, dkw.gv, fou.d.b);
      this.b(dkw.aR, fpr.w);
      this.m(dkw.aa).c(dkw.aa).a(dkw.aw);
      this.m(dkw.al).c(dkw.al).a(dkw.aE);
      this.a(dkw.al, dkw.dp, dkw.dB);
      this.a(dkw.C, dkw.gr, fou.d.b);
      this.a(dkw.aN, fpr.w, -12012264);
      this.m(dkw.oU).b(dkw.oU).a(dkw.oW);
      this.m(dkw.oV).b(dkw.oV).a(dkw.oX);
      this.a(dkw.oV, dkw.ds, dkw.dF);
      this.a(dkw.oZ, dkw.pQ, fou.d.b);
      this.n(dkw.pf, dkw.pS);
      this.m(dkw.oL).b(dkw.oL).a(dkw.oN);
      this.m(dkw.oM).b(dkw.oM).a(dkw.oO);
      this.a(dkw.oM, dkw.dt, dkw.dG);
      this.a(dkw.oQ, dkw.pR, fou.d.b);
      this.n(dkw.oS, dkw.pT);
      this.m(dkw.ai).d(dkw.ai);
      this.m(dkw.as).d(dkw.as);
      this.a(dkw.x, dkw.dv, dkw.dH);
      this.b(dkw.oT, fou.d.b);
      this.b(cyc.dP);
      this.j(dkw.dK);
      this.l(dkw.iw);
      this.v();
      this.p(dkw.cY);
      this.q(dkw.bw);
      this.q(dkw.bx);
      this.q(dkw.hE);
      this.u();
      this.u(dkw.gi);
      this.u(dkw.li);
      this.u(dkw.lj);
      this.v(dkw.hp);
      this.v(dkw.hq);
      this.v(dkw.hr);
      this.p();
      this.q();
      this.d(dkw.cL, fpr.h);
      this.d(dkw.oy, fpr.h);
      this.d(dkw.ox, fpr.i);
      this.t();
      this.aD();
      this.ay();
      this.l(dkw.eY, dkw.fg);
      this.l(dkw.m, dkw.fc);
      this.l(dkw.eX, dkw.ff);
      this.l(dkw.eW, dkw.fe);
      this.aB();
      this.l(dkw.eV, dkw.fd);
      this.aC();
   }

   private void aK() {
      hdk.b $$0 = fpk.a(this.a(cyc.ib));
      Map<Integer, hdk.b> $$1 = new HashMap<>(16);
      fpd.a<Integer> $$2 = fpd.a(dzc.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         ald $$5 = fpp.a(cyc.ib, $$4);
         $$2.a($$3, fpf.a().a(fpg.c, fpo.aa.a(dkw.iv, $$4, fpp.h($$5), this.d)));
         hdk.b $$6 = fpk.a(fpo.bI.a(fpm.a(cyc.ib, $$4), fpp.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cyc.ib, fpk.a(dpm.c, $$0, $$1));
      this.b.accept(fpc.a(dkw.iv).a($$2));
   }

   private void o(dku $$0, dku $$1) {
      this.b($$0.i());
      fpp $$2 = fpp.b(fpp.J($$0));
      fpp $$3 = fpp.b(fpp.a($$0, "_lit"));
      ald $$4 = fpo.bV.a($$0, "_one_candle", $$2, this.d);
      ald $$5 = fpo.bW.a($$0, "_two_candles", $$2, this.d);
      ald $$6 = fpo.bX.a($$0, "_three_candles", $$2, this.d);
      ald $$7 = fpo.bY.a($$0, "_four_candles", $$2, this.d);
      ald $$8 = fpo.bV.a($$0, "_one_candle_lit", $$3, this.d);
      ald $$9 = fpo.bW.a($$0, "_two_candles_lit", $$3, this.d);
      ald $$10 = fpo.bX.a($$0, "_three_candles_lit", $$3, this.d);
      ald $$11 = fpo.bY.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fpc.a($$0)
               .a(
                  fpd.a(dzc.aC, dzc.u)
                     .a(1, false, fpf.a().a(fpg.c, $$4))
                     .a(2, false, fpf.a().a(fpg.c, $$5))
                     .a(3, false, fpf.a().a(fpg.c, $$6))
                     .a(4, false, fpf.a().a(fpg.c, $$7))
                     .a(1, true, fpf.a().a(fpg.c, $$8))
                     .a(2, true, fpf.a().a(fpg.c, $$9))
                     .a(3, true, fpf.a().a(fpg.c, $$10))
                     .a(4, true, fpf.a().a(fpg.c, $$11))
               )
         );
      ald $$12 = fpo.bZ.a($$1, fpp.a($$0, false), this.d);
      ald $$13 = fpo.bZ.a($$1, "_lit", fpp.a($$0, true), this.d);
      this.b.accept(fpc.a($$1).a(a(dzc.u, $$13, $$12)));
   }

   class a {
      private final fpp b;
      private final Map<fpn, ald> c = Maps.newHashMap();
      @Nullable
      private mh d;
      @Nullable
      private ald e;
      private final Set<dku> f = new HashSet<>();

      public a(final fpp $$0) {
         this.b = $$0;
      }

      public fou.a a(dku $$0, fpn $$1) {
         this.e = $$1.a($$0, this.b, fou.this.d);
         if (fou.this.f.containsKey($$0)) {
            fou.this.b.accept(fou.this.f.get($$0).create($$0, this.e, this.b, fou.this.d));
         } else {
            fou.this.b.accept(fou.c($$0, this.e));
         }

         return this;
      }

      public fou.a a(dku $$0, dku $$1) {
         ald $$2 = fpm.a($$0);
         fou.this.b.accept(fou.c($$1, $$2));
         fou.this.c.a($$0.i(), $$1.i());
         this.f.add($$1);
         return this;
      }

      public fou.a a(dku $$0) {
         ald $$1 = fpo.s.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.t.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.b($$0, $$1, $$2));
         ald $$3 = fpo.u.a($$0, this.b, fou.this.d);
         fou.this.a($$0, $$3);
         return this;
      }

      public fou.a b(dku $$0) {
         ald $$1 = fpo.M.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.N.a($$0, this.b, fou.this.d);
         ald $$3 = fpo.O.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.a($$0, $$1, $$2, $$3));
         ald $$4 = fpo.P.a($$0, this.b, fou.this.d);
         fou.this.a($$0, $$4);
         return this;
      }

      public fou.a c(dku $$0) {
         fpp $$1 = fpp.s($$0);
         ald $$2 = fpo.D.a($$0, $$1, fou.this.d);
         ald $$3 = fpo.E.a($$0, $$1, fou.this.d);
         ald $$4 = fpo.F.a($$0, $$1, fou.this.d);
         ald $$5 = fpo.G.a($$0, $$1, fou.this.d);
         ald $$6 = fpo.H.a($$0, $$1, fou.this.d);
         fou.this.b.accept(fou.a($$0, $$2, $$3, $$4, $$5, $$6));
         ald $$7 = fpo.I.a($$0, $$1, fou.this.d);
         fou.this.a($$0, $$7);
         return this;
      }

      public fou.a d(dku $$0) {
         ald $$1 = fpo.J.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.K.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.c($$0, $$1, $$2));
         ald $$3 = fpo.L.a($$0, this.b, fou.this.d);
         fou.this.a($$0, $$3);
         return this;
      }

      public fou.a e(dku $$0) {
         fpp $$1 = fpp.s($$0);
         ald $$2 = fpo.R.a($$0, $$1, fou.this.d);
         ald $$3 = fpo.Q.a($$0, $$1, fou.this.d);
         ald $$4 = fpo.T.a($$0, $$1, fou.this.d);
         ald $$5 = fpo.S.a($$0, $$1, fou.this.d);
         fou.this.b.accept(fou.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fou.a f(dku $$0) {
         ald $$1 = fpo.V.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.U.a($$0, this.b, fou.this.d);
         ald $$3 = fpo.X.a($$0, this.b, fou.this.d);
         ald $$4 = fpo.W.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fou.a g(dku $$0) {
         ald $$1 = fpo.Y.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.Z.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.e($$0, $$1, $$2));
         return this;
      }

      public fou.a h(dku $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dku $$1 = this.d.b().get(mh.b.r);
            ald $$2 = fpo.aa.a($$0, this.b, fou.this.d);
            fou.this.b.accept(fou.c($$0, $$2));
            fou.this.b.accept(fou.c($$1, $$2));
            fou.this.b($$0.i());
            return this;
         }
      }

      public fou.a i(dku $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ald $$1 = this.a(fpo.ab, $$0);
            ald $$2 = this.a(fpo.ac, $$0);
            fou.this.b.accept(fou.e($$0, $$1, $$2, this.e));
            fou.this.a($$0, $$1);
            return this;
         }
      }

      public fou.a j(dku $$0) {
         ald $$1 = this.a(fpo.af, $$0);
         ald $$2 = this.a(fpo.ae, $$0);
         ald $$3 = this.a(fpo.ag, $$0);
         fou.this.b.accept(fou.b($$0, $$1, $$2, $$3));
         fou.this.a($$0, $$2);
         return this;
      }

      private fou.a k(dku $$0) {
         fpr $$1 = fou.this.g.getOrDefault($$0, fpr.a.get($$0));
         ald $$2 = $$1.a($$0, fou.this.d);
         fou.this.b.accept(fou.c($$0, $$2));
         return this;
      }

      private fou.a l(dku $$0) {
         fou.this.j($$0);
         return this;
      }

      private void m(dku $$0) {
         if (fou.this.e.contains($$0)) {
            fou.this.l($$0);
         } else {
            fou.this.k($$0);
         }
      }

      private ald a(fpn $$0, dku $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fou.this.d));
      }

      public fou.a a(mh $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fou.a, dku> $$2 = fou.h.get($$0x);
               if ($$2 != null) {
                  $$2.accept(this, $$1);
               }
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface b {
      foz create(dku var1, ald var2, fpp var3, BiConsumer<ald, fpl> var4);
   }

   static record c(fpn a, String b) {
   }

   static enum d {
      a(fpo.ap, fpo.as, false),
      b(fpo.ao, fpo.ar, false),
      c(fpo.aq, fpo.at, true);

      private final fpn d;
      private final fpn e;
      private final boolean f;

      private d(final fpn $$0, final fpn $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fpn a() {
         return this.d;
      }

      public fpn b() {
         return this.e;
      }

      public ald a(fou $$0, dku $$1) {
         cxu $$2 = $$1.i();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fpp a(dku $$0) {
         return this.f ? fpp.e($$0) : fpp.c($$0);
      }

      public fpp b(dku $$0) {
         return this.f ? fpp.g($$0) : fpp.f($$0);
      }
   }

   class e {
      private final fpp b;

      public e(final fpp $$0) {
         this.b = $$0;
      }

      public fou.e a(dku $$0) {
         fpp $$1 = this.b.c(fpq.d, this.b.a(fpq.i));
         ald $$2 = fpo.j.a($$0, $$1, fou.this.d);
         fou.this.b.accept(fou.d($$0, $$2));
         return this;
      }

      public fou.e b(dku $$0) {
         ald $$1 = fpo.j.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.d($$0, $$1));
         return this;
      }

      public fou.e c(dku $$0) {
         ald $$1 = fpo.j.a($$0, this.b, fou.this.d);
         ald $$2 = fpo.k.a($$0, this.b, fou.this.d);
         fou.this.b.accept(fou.d($$0, $$1, $$2));
         return this;
      }

      public fou.e d(dku $$0) {
         fou.this.b.accept(fou.a($$0, this.b, fou.this.d));
         return this;
      }
   }
}
