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

public class fpx {
   final Consumer<fqc> b;
   final fqa c;
   final BiConsumer<ale, fqo> d;
   final List<dlu> e = ImmutableList.of(dlw.eL, dlw.eR, dlw.iw);
   final Map<dlu, fpx.b> f = ImmutableMap.builder().put(dlw.b, fpx::a).put(dlw.tp, fpx::c).put(dlw.fa, fpx::b).build();
   final Map<dlu, fqu> g = ImmutableMap.builder()
      .put(dlw.bc, fqu.C.get(dlw.bc))
      .put(dlw.jN, fqu.C.get(dlw.jN))
      .put(dlw.kr, fqu.a(fqs.a(dlw.bc, "_top")))
      .put(dlw.kt, fqu.a(fqs.a(dlw.jN, "_top")))
      .put(dlw.be, fqu.d.get(dlw.bc).a($$0x -> $$0x.a(fqt.i, fqs.J(dlw.be))))
      .put(dlw.jP, fqu.d.get(dlw.jN).a($$0x -> $$0x.a(fqt.i, fqs.J(dlw.jP))))
      .put(dlw.hA, fqu.d.get(dlw.hA))
      .put(dlw.ks, fqu.a(fqs.a(dlw.hA, "_bottom")))
      .put(dlw.pV, fqu.D.get(dlw.pV))
      .put(dlw.tp, fqu.D.get(dlw.tp))
      .put(dlw.hB, fqu.d.get(dlw.hB).a($$0x -> $$0x.a(fqt.i, fqs.J(dlw.hB))))
      .put(dlw.bd, fqu.d.get(dlw.bd).a($$0x -> {
         $$0x.a(fqt.d, fqs.a(dlw.bc, "_top"));
         $$0x.a(fqt.i, fqs.J(dlw.bd));
      }))
      .put(dlw.jO, fqu.d.get(dlw.jO).a($$0x -> {
         $$0x.a(fqt.d, fqs.a(dlw.jN, "_top"));
         $$0x.a(fqt.i, fqs.J(dlw.jO));
      }))
      .put(dlw.rq, fqu.D.get(dlw.rq))
      .put(dlw.rl, fqu.D.get(dlw.rl))
      .build();
   static final Map<mj.b, BiConsumer<fpx.a, dlu>> h = ImmutableMap.builder()
      .put(mj.b.a, fpx.a::a)
      .put(mj.b.e, fpx.a::l)
      .put(mj.b.b, fpx.a::k)
      .put(mj.b.c, fpx.a::k)
      .put(mj.b.f, fpx.a::c)
      .put(mj.b.g, fpx.a::d)
      .put(mj.b.h, fpx.a::e)
      .put(mj.b.i, fpx.a::f)
      .put(mj.b.k, fpx.a::h)
      .put(mj.b.l, fpx.a::i)
      .put(mj.b.m, fpx.a::j)
      .put(mj.b.n, fpx.a::g)
      .put(mj.b.p, fpx.a::m)
      .put(mj.b.q, fpx.a::b)
      .build();
   public static final List<Pair<ja, Function<ale, fqi>>> a = List.of(
      Pair.of(ja.c, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0)),
      Pair.of(ja.f, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b).a(fqj.d, true)),
      Pair.of(ja.d, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c).a(fqj.d, true)),
      Pair.of(ja.e, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d).a(fqj.d, true)),
      Pair.of(ja.b, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.d).a(fqj.d, true)),
      Pair.of(ja.a, (Function<ale, fqi>)$$0 -> fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.b).a(fqj.d, true))
   );
   private static final Map<fpx.c, ale> i = new HashMap<>();

   private static fqc a(dlu $$0, ale $$1, fqs $$2, BiConsumer<ale, fqo> $$3) {
      ale $$4 = fqr.e.a($$0, $$2, $$3);
      return a($$0, $$1, $$4);
   }

   private static fqc b(dlu $$0, ale $$1, fqs $$2, BiConsumer<ale, fqo> $$3) {
      ale $$4 = fqr.f.a($$0, $$2, $$3);
      return c($$0, $$4);
   }

   private static fqc c(dlu $$0, ale $$1, fqs $$2, BiConsumer<ale, fqo> $$3) {
      ale $$4 = fqr.l.a($$0, $$2, $$3);
      return a($$0, $$1, $$4).a(f());
   }

   public fpx(Consumer<fqc> $$0, fqa $$1, BiConsumer<ale, fqo> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private void a(cyo $$0, ale $$1) {
      this.c.a($$0, fqn.a($$1));
   }

   void a(dlu $$0, ale $$1) {
      this.c.a($$0.h(), fqn.a($$1));
   }

   private void a(dlu $$0, ale $$1, fpq $$2) {
      this.c.a($$0.h(), fqn.a($$1, $$2));
   }

   private ale a(cyo $$0) {
      return fqr.bI.a(fqp.a($$0), fqs.b($$0), this.d);
   }

   ale a(cyo $$0, dlu $$1) {
      return fqr.bI.a(fqp.a($$0), fqs.I($$1), this.d);
   }

   private ale a(cyo $$0, dlu $$1, String $$2) {
      return fqr.bI.a(fqp.a($$0), fqs.k(fqs.a($$1, $$2)), this.d);
   }

   ale b(cyo $$0, dlu $$1, String $$2) {
      ale $$3 = fqs.J($$1);
      ale $$4 = fqs.a($$1, $$2);
      return fqr.bM.a(fqp.a($$0), fqs.c($$3, $$4), this.d);
   }

   void b(cyo $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dlu $$0) {
      cyo $$1 = $$0.h();
      if ($$1 != cyw.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dlu $$0, String $$1) {
      cyo $$2 = $$0.h();
      if ($$2 != cyw.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dlu $$0, String $$1) {
      cyo $$2 = $$0.h();
      if ($$2 != cyw.a) {
         ale $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fqg b() {
      return fqg.a(eae.T).a(ja.f, fqi.a().a(fqj.b, fqj.a.b)).a(ja.d, fqi.a().a(fqj.b, fqj.a.c)).a(ja.e, fqi.a().a(fqj.b, fqj.a.d)).a(ja.c, fqi.a());
   }

   private static fqg c() {
      return fqg.a(eae.T).a(ja.d, fqi.a()).a(ja.e, fqi.a().a(fqj.b, fqj.a.b)).a(ja.c, fqi.a().a(fqj.b, fqj.a.c)).a(ja.f, fqi.a().a(fqj.b, fqj.a.d));
   }

   private static fqg d() {
      return fqg.a(eae.T).a(ja.f, fqi.a()).a(ja.d, fqi.a().a(fqj.b, fqj.a.b)).a(ja.e, fqi.a().a(fqj.b, fqj.a.c)).a(ja.c, fqi.a().a(fqj.b, fqj.a.d));
   }

   private static fqg e() {
      return fqg.a(eae.R)
         .a(ja.a, fqi.a().a(fqj.a, fqj.a.b))
         .a(ja.b, fqi.a().a(fqj.a, fqj.a.d))
         .a(ja.c, fqi.a())
         .a(ja.d, fqi.a().a(fqj.b, fqj.a.c))
         .a(ja.e, fqi.a().a(fqj.b, fqj.a.d))
         .a(ja.f, fqi.a().a(fqj.b, fqj.a.b));
   }

   private static fqf b(dlu $$0, ale $$1) {
      return fqf.a($$0, a($$1));
   }

   private static fqi[] a(ale $$0) {
      return new fqi[]{
         fqi.a().a(fqj.c, $$0), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d)
      };
   }

   private static fqf a(dlu $$0, ale $$1, ale $$2) {
      return fqf.a($$0, fqi.a().a(fqj.c, $$1), fqi.a().a(fqj.c, $$2), fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c));
   }

   private static fqg a(eaf $$0, ale $$1, ale $$2) {
      return fqg.a($$0).a(true, fqi.a().a(fqj.c, $$1)).a(false, fqi.a().a(fqj.c, $$2));
   }

   private void d(dlu $$0) {
      ale $$1 = fqu.a.create($$0, this.d);
      ale $$2 = fqu.c.create($$0, this.d);
      this.b.accept(a($$0, $$1, $$2));
   }

   private void e(dlu $$0) {
      ale $$1 = fqu.a.create($$0, this.d);
      this.b.accept(b($$0, $$1));
   }

   private void f(dlu $$0) {
      this.b.accept(fqf.a($$0).a(fqg.a(eae.by).a($$1 -> {
         String $$2 = "_" + $$1;
         ale $$3 = fqs.a($$0, $$2);
         return fqi.a().a(fqj.c, fqr.c.a($$0, $$2, new fqs().a(fqt.a, $$3), this.d));
      })));
      this.a($$0, fqp.a($$0, "_0"));
   }

   static fqc b(dlu $$0, ale $$1, ale $$2) {
      return fqf.a($$0)
         .a(fqg.a(eae.A).a(false, fqi.a().a(fqj.c, $$1)).a(true, fqi.a().a(fqj.c, $$2)))
         .a(
            fqg.a(eae.X, eae.T)
               .a(dzz.a, ja.f, fqi.a().a(fqj.b, fqj.a.b))
               .a(dzz.a, ja.e, fqi.a().a(fqj.b, fqj.a.d))
               .a(dzz.a, ja.d, fqi.a().a(fqj.b, fqj.a.c))
               .a(dzz.a, ja.c, fqi.a())
               .a(dzz.b, ja.f, fqi.a().a(fqj.b, fqj.a.b).a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(dzz.b, ja.e, fqi.a().a(fqj.b, fqj.a.d).a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(dzz.b, ja.d, fqi.a().a(fqj.b, fqj.a.c).a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(dzz.b, ja.c, fqi.a().a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(dzz.c, ja.f, fqi.a().a(fqj.b, fqj.a.d).a(fqj.a, fqj.a.c))
               .a(dzz.c, ja.e, fqi.a().a(fqj.b, fqj.a.b).a(fqj.a, fqj.a.c))
               .a(dzz.c, ja.d, fqi.a().a(fqj.a, fqj.a.c))
               .a(dzz.c, ja.c, fqi.a().a(fqj.b, fqj.a.c).a(fqj.a, fqj.a.c))
         );
   }

   private static fqg.d<ja, eak, eaj, Boolean> a(fqg.d<ja, eak, eaj, Boolean> $$0, eak $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return $$0.a(ja.f, $$1, eaj.a, false, fqi.a().a(fqj.c, $$2))
         .a(ja.d, $$1, eaj.a, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b))
         .a(ja.e, $$1, eaj.a, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c))
         .a(ja.c, $$1, eaj.a, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d))
         .a(ja.f, $$1, eaj.b, false, fqi.a().a(fqj.c, $$4))
         .a(ja.d, $$1, eaj.b, false, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b))
         .a(ja.e, $$1, eaj.b, false, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.c))
         .a(ja.c, $$1, eaj.b, false, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.d))
         .a(ja.f, $$1, eaj.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
         .a(ja.d, $$1, eaj.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
         .a(ja.e, $$1, eaj.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
         .a(ja.c, $$1, eaj.a, true, fqi.a().a(fqj.c, $$3))
         .a(ja.f, $$1, eaj.b, true, fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.d))
         .a(ja.d, $$1, eaj.b, true, fqi.a().a(fqj.c, $$5))
         .a(ja.e, $$1, eaj.b, true, fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.b))
         .a(ja.c, $$1, eaj.b, true, fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.c));
   }

   private static fqc a(dlu $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5, ale $$6, ale $$7, ale $$8) {
      return fqf.a($$0).a(a(a(fqg.a(eae.T, eae.ah, eae.bh, eae.y), eak.b, $$1, $$2, $$3, $$4), eak.a, $$5, $$6, $$7, $$8));
   }

   static fqc a(dlu $$0, ale $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      return fqe.a($$0)
         .a(fqi.a().a(fqj.c, $$1))
         .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$2).a(fqj.d, false))
         .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$3).a(fqj.d, false))
         .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$4).a(fqj.d, false))
         .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$5).a(fqj.d, false));
   }

   static fqc c(dlu $$0, ale $$1, ale $$2) {
      return fqe.a($$0)
         .a(fqi.a().a(fqj.c, $$1))
         .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$2).a(fqj.d, true))
         .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b).a(fqj.d, true))
         .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c).a(fqj.d, true))
         .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d).a(fqj.d, true));
   }

   static fqc a(dlu $$0, ale $$1, ale $$2, ale $$3) {
      return fqe.a($$0)
         .a(fqd.a().a(eae.L, true), fqi.a().a(fqj.c, $$1))
         .a(fqd.a().a(eae.aa, ebb.b), fqi.a().a(fqj.c, $$2).a(fqj.d, true))
         .a(fqd.a().a(eae.Z, ebb.b), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b).a(fqj.d, true))
         .a(fqd.a().a(eae.ab, ebb.b), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c).a(fqj.d, true))
         .a(fqd.a().a(eae.ac, ebb.b), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d).a(fqj.d, true))
         .a(fqd.a().a(eae.aa, ebb.c), fqi.a().a(fqj.c, $$3).a(fqj.d, true))
         .a(fqd.a().a(eae.Z, ebb.c), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b).a(fqj.d, true))
         .a(fqd.a().a(eae.ab, ebb.c), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c).a(fqj.d, true))
         .a(fqd.a().a(eae.ac, ebb.c), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d).a(fqj.d, true));
   }

   static fqc a(dlu $$0, ale $$1, ale $$2, ale $$3, ale $$4, boolean $$5) {
      return fqf.a($$0, fqi.a().a(fqj.d, $$5))
         .a(c())
         .a(
            fqg.a(eae.t, eae.y)
               .a(false, false, fqi.a().a(fqj.c, $$2))
               .a(true, false, fqi.a().a(fqj.c, $$4))
               .a(false, true, fqi.a().a(fqj.c, $$1))
               .a(true, true, fqi.a().a(fqj.c, $$3))
         );
   }

   static fqc b(dlu $$0, ale $$1, ale $$2, ale $$3) {
      return fqf.a($$0)
         .a(
            fqg.a(eae.T, eae.ai, eae.bl)
               .a(ja.f, ean.b, eax.a, fqi.a().a(fqj.c, $$2))
               .a(ja.e, ean.b, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.b, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.b, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.f, ean.b, eax.e, fqi.a().a(fqj.c, $$3))
               .a(ja.e, ean.b, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.b, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.b, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.f, ean.b, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.e, ean.b, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.d, ean.b, eax.d, fqi.a().a(fqj.c, $$3))
               .a(ja.c, ean.b, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.f, ean.b, eax.c, fqi.a().a(fqj.c, $$1))
               .a(ja.e, ean.b, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.b, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.b, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.f, ean.b, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.e, ean.b, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.d, ean.b, eax.b, fqi.a().a(fqj.c, $$1))
               .a(ja.c, ean.b, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.f, ean.a, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.c).a(fqj.d, true))
               .a(ja.e, ean.a, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.a, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.a, eax.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.f, ean.a, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.e, ean.a, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.d, ean.a, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.c, ean.a, eax.e, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.d, true))
               .a(ja.f, ean.a, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.d, true))
               .a(ja.e, ean.a, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.a, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.a, eax.d, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.f, ean.a, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.e, ean.a, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(ja.d, ean.a, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.c, ean.a, eax.c, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.d, true))
               .a(ja.f, ean.a, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.d, true))
               .a(ja.e, ean.a, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(ja.d, ean.a, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(ja.c, ean.a, eax.b, fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d).a(fqj.d, true))
         );
   }

   private static fqc c(dlu $$0, ale $$1, ale $$2, ale $$3) {
      return fqf.a($$0)
         .a(
            fqg.a(eae.T, eae.ai, eae.y)
               .a(ja.c, ean.b, false, fqi.a().a(fqj.c, $$2))
               .a(ja.d, ean.b, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c))
               .a(ja.f, ean.b, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b))
               .a(ja.e, ean.b, false, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d))
               .a(ja.c, ean.a, false, fqi.a().a(fqj.c, $$1))
               .a(ja.d, ean.a, false, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c))
               .a(ja.f, ean.a, false, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b))
               .a(ja.e, ean.a, false, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d))
               .a(ja.c, ean.b, true, fqi.a().a(fqj.c, $$3))
               .a(ja.d, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
               .a(ja.f, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
               .a(ja.e, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
               .a(ja.c, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c))
               .a(ja.d, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.a))
               .a(ja.f, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d))
               .a(ja.e, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b))
         );
   }

   private static fqc d(dlu $$0, ale $$1, ale $$2, ale $$3) {
      return fqf.a($$0)
         .a(
            fqg.a(eae.T, eae.ai, eae.y)
               .a(ja.c, ean.b, false, fqi.a().a(fqj.c, $$2))
               .a(ja.d, ean.b, false, fqi.a().a(fqj.c, $$2))
               .a(ja.f, ean.b, false, fqi.a().a(fqj.c, $$2))
               .a(ja.e, ean.b, false, fqi.a().a(fqj.c, $$2))
               .a(ja.c, ean.a, false, fqi.a().a(fqj.c, $$1))
               .a(ja.d, ean.a, false, fqi.a().a(fqj.c, $$1))
               .a(ja.f, ean.a, false, fqi.a().a(fqj.c, $$1))
               .a(ja.e, ean.a, false, fqi.a().a(fqj.c, $$1))
               .a(ja.c, ean.b, true, fqi.a().a(fqj.c, $$3))
               .a(ja.d, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
               .a(ja.f, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
               .a(ja.e, ean.b, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
               .a(ja.c, ean.a, true, fqi.a().a(fqj.c, $$3))
               .a(ja.d, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
               .a(ja.f, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
               .a(ja.e, ean.a, true, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
         );
   }

   static fqf c(dlu $$0, ale $$1) {
      return fqf.a($$0, fqi.a().a(fqj.c, $$1));
   }

   private static fqg f() {
      return fqg.a(eae.K).a(ja.a.b, fqi.a()).a(ja.a.c, fqi.a().a(fqj.a, fqj.a.b)).a(ja.a.a, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b));
   }

   static fqc a(dlu $$0, fqs $$1, BiConsumer<ale, fqo> $$2) {
      ale $$3 = fqr.g.a($$0, $$1, $$2);
      ale $$4 = fqr.h.a($$0, $$1, $$2);
      ale $$5 = fqr.i.a($$0, $$1, $$2);
      ale $$6 = fqr.j.a($$0, $$1, $$2);
      return fqf.a($$0, fqi.a().a(fqj.c, $$6))
         .a(fqg.a(eae.K).a(ja.a.a, fqi.a().a(fqj.c, $$3)).a(ja.a.b, fqi.a().a(fqj.c, $$4)).a(ja.a.c, fqi.a().a(fqj.c, $$5)));
   }

   static fqc d(dlu $$0, ale $$1) {
      return fqf.a($$0, fqi.a().a(fqj.c, $$1)).a(f());
   }

   private void e(dlu $$0, ale $$1) {
      this.b.accept(d($$0, $$1));
   }

   public void a(dlu $$0, fqu.a $$1) {
      ale $$2 = $$1.create($$0, this.d);
      this.b.accept(d($$0, $$2));
   }

   private void c(dlu $$0, fqu.a $$1) {
      ale $$2 = $$1.create($$0, this.d);
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, $$2)).a(b()));
   }

   static fqc d(dlu $$0, ale $$1, ale $$2) {
      return fqf.a($$0)
         .a(
            fqg.a(eae.K)
               .a(ja.a.b, fqi.a().a(fqj.c, $$1))
               .a(ja.a.c, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b))
               .a(ja.a.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
         );
   }

   private void a(dlu $$0, fqu.a $$1, fqu.a $$2) {
      ale $$3 = $$1.create($$0, this.d);
      ale $$4 = $$2.create($$0, this.d);
      this.b.accept(d($$0, $$3, $$4));
   }

   private void g(dlu $$0) {
      ale $$1 = fqu.A.create($$0, this.d);
      ale $$2 = fqu.B.create($$0, this.d);
      ale $$3 = this.a(fqu.A, $$0, "_awake");
      ale $$4 = this.a(fqu.B, $$0, "_awake");
      ale $$5 = this.a(fqu.A, $$0, "_dormant");
      ale $$6 = this.a(fqu.B, $$0, "_dormant");
      this.b
         .accept(
            fqf.a($$0)
               .a(
                  fqg.a(eae.K, dnp.c)
                     .a(ja.a.b, eai.a, fqi.a().a(fqj.c, $$1))
                     .a(ja.a.c, eai.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b))
                     .a(ja.a.a, eai.a, fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
                     .a(ja.a.b, eai.b, fqi.a().a(fqj.c, $$5))
                     .a(ja.a.c, eai.b, fqi.a().a(fqj.c, $$6).a(fqj.a, fqj.a.b))
                     .a(ja.a.a, eai.b, fqi.a().a(fqj.c, $$6).a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
                     .a(ja.a.b, eai.c, fqi.a().a(fqj.c, $$3))
                     .a(ja.a.c, eai.c, fqi.a().a(fqj.c, $$4).a(fqj.a, fqj.a.b))
                     .a(ja.a.a, eai.c, fqi.a().a(fqj.c, $$4).a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
               )
         );
   }

   private ale a(fqu.a $$0, dlu $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fqt.i, fqs.a($$1, $$2)).a(fqt.d, fqs.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.d);
   }

   private ale a(dlu $$0, String $$1, fqq $$2, Function<ale, fqs> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fqs.a($$0, $$1)), this.d);
   }

   static fqc e(dlu $$0, ale $$1, ale $$2) {
      return fqf.a($$0).a(a(eae.A, $$2, $$1));
   }

   static fqc e(dlu $$0, ale $$1, ale $$2, ale $$3) {
      return fqf.a($$0).a(fqg.a(eae.bk).a(eaw.b, fqi.a().a(fqj.c, $$1)).a(eaw.a, fqi.a().a(fqj.c, $$2)).a(eaw.c, fqi.a().a(fqj.c, $$3)));
   }

   public void a(dlu $$0) {
      this.b($$0, fqu.a);
   }

   public void b(dlu $$0, fqu.a $$1) {
      this.b.accept(c($$0, $$1.create($$0, this.d)));
   }

   public void a(dlu $$0, fqu.a $$1, int $$2) {
      ale $$3 = $$1.create($$0, this.d);
      this.b.accept(c($$0, $$3));
      this.a($$0, $$3, fqn.a($$2));
   }

   private void g() {
      this.K(dlw.ft);
      ale $$0 = this.a(cyw.gm, dlw.ft);
      this.a(dlw.ft, $$0, fqn.a(-12012264));
   }

   private void h(dlu $$0) {
      ale $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fpp());
   }

   private fpx.a i(dlu $$0) {
      fqu $$1 = this.g.getOrDefault($$0, fqu.a.get($$0));
      return new fpx.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dlu $$0, dlu $$1, dlu $$2) {
      ale $$3 = this.g($$1, $$0);
      this.b.accept(c($$1, $$3));
      this.b.accept(c($$2, $$3));
      this.b($$1.h());
   }

   void j(dlu $$0) {
      fqs $$1 = fqs.w($$0);
      ale $$2 = fqr.v.a($$0, $$1, this.d);
      ale $$3 = fqr.w.a($$0, $$1, this.d);
      ale $$4 = fqr.x.a($$0, $$1, this.d);
      ale $$5 = fqr.y.a($$0, $$1, this.d);
      ale $$6 = fqr.z.a($$0, $$1, this.d);
      ale $$7 = fqr.A.a($$0, $$1, this.d);
      ale $$8 = fqr.B.a($$0, $$1, this.d);
      ale $$9 = fqr.C.a($$0, $$1, this.d);
      this.b($$0.h());
      this.b.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dlu $$0, dlu $$1) {
      ale $$2 = fqr.v.a($$0);
      ale $$3 = fqr.w.a($$0);
      ale $$4 = fqr.x.a($$0);
      ale $$5 = fqr.y.a($$0);
      ale $$6 = fqr.z.a($$0);
      ale $$7 = fqr.A.a($$0);
      ale $$8 = fqr.B.a($$0);
      ale $$9 = fqr.C.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dlu $$0) {
      fqs $$1 = fqs.b($$0);
      ale $$2 = fqr.ak.a($$0, $$1, this.d);
      ale $$3 = fqr.al.a($$0, $$1, this.d);
      ale $$4 = fqr.am.a($$0, $$1, this.d);
      this.b.accept(c($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   void l(dlu $$0) {
      fqs $$1 = fqs.b($$0);
      ale $$2 = fqr.ah.a($$0, $$1, this.d);
      ale $$3 = fqr.ai.a($$0, $$1, this.d);
      ale $$4 = fqr.aj.a($$0, $$1, this.d);
      this.b.accept(d($$0, $$2, $$3, $$4));
      this.a($$0, $$3);
   }

   private void c(dlu $$0, dlu $$1) {
      ale $$2 = fqr.ah.a($$0);
      ale $$3 = fqr.ai.a($$0);
      ale $$4 = fqr.aj.a($$0);
      this.c.a($$0.h(), $$1.h());
      this.b.accept(d($$1, $$2, $$3, $$4));
   }

   private void h() {
      ale $$0 = fqp.a(dlw.tj);
      ale $$1 = fqp.a(dlw.tj, "_partial_tilt");
      ale $$2 = fqp.a(dlw.tj, "_full_tilt");
      this.b
         .accept(
            fqf.a(dlw.tj)
               .a(b())
               .a(fqg.a(eae.bo).a(eba.a, fqi.a().a(fqj.c, $$0)).a(eba.b, fqi.a().a(fqj.c, $$0)).a(eba.c, fqi.a().a(fqj.c, $$1)).a(eba.d, fqi.a().a(fqj.c, $$2)))
         );
   }

   private fpx.e m(dlu $$0) {
      return new fpx.e(fqs.q($$0));
   }

   private void n(dlu $$0) {
      this.d($$0, $$0);
   }

   private void d(dlu $$0, dlu $$1) {
      this.b.accept(c($$0, fqp.a($$1)));
   }

   private void a(dlu $$0, fpx.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dlu $$0, fpx.d $$1, fqs $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dlu $$0, fpx.d $$1) {
      fqs $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dlu $$0, fpx.d $$1, fqs $$2) {
      ale $$3 = $$1.a().a($$0, $$2, this.d);
      this.b.accept(c($$0, $$3));
   }

   private void a(dlu $$0, fpx.d $$1, ear<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         fqg $$4 = fqg.a($$2).a($$3x -> {
            String $$4x = "_stage" + $$3[$$3x];
            fqs $$5 = fqs.c(fqs.a($$0, $$4x));
            ale $$6 = $$1.a().a($$0, $$4x, $$5, this.d);
            return fqi.a().a(fqj.c, $$6);
         });
         this.b($$0.h());
         this.b.accept(fqf.a($$0).a($$4));
      }
   }

   private void a(dlu $$0, dlu $$1, fpx.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dlu $$0, dlu $$1, fpx.d $$2) {
      this.b($$0, $$2);
      fqs $$3 = $$2.b($$0);
      ale $$4 = $$2.b().a($$1, $$3, this.d);
      this.b.accept(c($$1, $$4));
   }

   private void e(dlu $$0, dlu $$1) {
      fqu $$2 = fqu.u.get($$0);
      ale $$3 = $$2.a($$0, this.d);
      this.b.accept(c($$0, $$3));
      ale $$4 = fqr.aJ.a($$1, $$2.b(), this.d);
      this.b.accept(fqf.a($$1, fqi.a().a(fqj.c, $$4)).a(b()));
      this.c($$0);
   }

   private void f(dlu $$0, dlu $$1) {
      this.b($$0.h());
      fqs $$2 = fqs.k($$0);
      fqs $$3 = fqs.a($$0, $$1);
      ale $$4 = fqr.bb.a($$1, $$3, this.d);
      this.b
         .accept(
            fqf.a($$1, fqi.a().a(fqj.c, $$4))
               .a(fqg.a(eae.T).a(ja.e, fqi.a()).a(ja.d, fqi.a().a(fqj.b, fqj.a.d)).a(ja.c, fqi.a().a(fqj.b, fqj.a.b)).a(ja.f, fqi.a().a(fqj.b, fqj.a.c)))
         );
      this.b.accept(fqf.a($$0).a(fqg.a(eae.ay).a($$2x -> fqi.a().a(fqj.c, fqr.ba[$$2x].a($$0, $$2, this.d)))));
   }

   private void i() {
      dlu $$0 = dlw.le;
      this.b($$0.h());
      ale $$1 = fqp.a($$0, "_top");
      ale $$2 = fqp.a($$0, "_bottom");
      this.f($$0, $$1, $$2);
   }

   private void j() {
      dlu $$0 = dlw.ld;
      this.b($$0.h());
      fqg $$1 = fqg.a(drn.e, eae.ah).a(($$1x, $$2) -> {
         return switch ($$2) {
            case a -> fqi.a().a(fqj.c, fqp.a($$0, "_top_stage_" + $$1x));
            case b -> fqi.a().a(fqj.c, fqp.a($$0, "_bottom_stage_" + $$1x));
         };
      });
      this.b.accept(fqf.a($$0).a($$1));
   }

   private void a(dlu $$0, dlu $$1, dlu $$2, dlu $$3, dlu $$4, dlu $$5, dlu $$6, dlu $$7) {
      this.a($$0, fpx.d.b);
      this.a($$1, fpx.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dlu $$0, fpx.d $$1) {
      ale $$2 = this.a($$0, "_top", $$1.a(), fqs::c);
      ale $$3 = this.a($$0, "_bottom", $$1.a(), fqs::c);
      this.f($$0, $$2, $$3);
   }

   private void d(dlu $$0, fpx.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dlu $$0) {
      ale $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fpp());
      this.c($$0, fpx.d.a);
   }

   private void k() {
      this.a(dlw.jb, "_front");
      ale $$0 = fqp.a(dlw.jb, "_top");
      ale $$1 = this.a(dlw.jb, "_bottom", fpx.d.b.a(), fqs::c);
      this.f(dlw.jb, $$0, $$1);
   }

   private void l() {
      ale $$0 = this.a(dlw.bE, "_top", fqr.bv, fqs::a);
      ale $$1 = this.a(dlw.bE, "_bottom", fqr.bv, fqs::a);
      this.f(dlw.bE, $$0, $$1);
   }

   private void m() {
      ale $$0 = fqp.a(dlw.tl, "_top");
      ale $$1 = fqp.a(dlw.tl, "_bottom");
      this.b.accept(fqf.a(dlw.tl).a(b()).a(fqg.a(eae.ah).a(eak.b, fqi.a().a(fqj.c, $$1)).a(eak.a, fqi.a().a(fqj.c, $$0))));
   }

   private void f(dlu $$0, ale $$1, ale $$2) {
      this.b.accept(fqf.a($$0).a(fqg.a(eae.ah).a(eak.b, fqi.a().a(fqj.c, $$2)).a(eak.a, fqi.a().a(fqj.c, $$1))));
   }

   private void p(dlu $$0) {
      fqs $$1 = fqs.h($$0);
      fqs $$2 = fqs.e(fqs.a($$0, "_corner"));
      ale $$3 = fqr.au.a($$0, $$1, this.d);
      ale $$4 = fqr.av.a($$0, $$2, this.d);
      ale $$5 = fqr.aw.a($$0, $$1, this.d);
      ale $$6 = fqr.ax.a($$0, $$1, this.d);
      this.c($$0);
      this.b
         .accept(
            fqf.a($$0)
               .a(
                  fqg.a(eae.aj)
                     .a(eas.a, fqi.a().a(fqj.c, $$3))
                     .a(eas.b, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
                     .a(eas.c, fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.b))
                     .a(eas.d, fqi.a().a(fqj.c, $$6).a(fqj.b, fqj.a.b))
                     .a(eas.e, fqi.a().a(fqj.c, $$5))
                     .a(eas.f, fqi.a().a(fqj.c, $$6))
                     .a(eas.g, fqi.a().a(fqj.c, $$4))
                     .a(eas.h, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b))
                     .a(eas.i, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.c))
                     .a(eas.j, fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.d))
               )
         );
   }

   private void q(dlu $$0) {
      ale $$1 = this.a($$0, "", fqr.au, fqs::e);
      ale $$2 = this.a($$0, "", fqr.aw, fqs::e);
      ale $$3 = this.a($$0, "", fqr.ax, fqs::e);
      ale $$4 = this.a($$0, "_on", fqr.au, fqs::e);
      ale $$5 = this.a($$0, "_on", fqr.aw, fqs::e);
      ale $$6 = this.a($$0, "_on", fqr.ax, fqs::e);
      fqg $$7 = fqg.a(eae.A, eae.ak).a(($$6x, $$7x) -> {
         switch ($$7x) {
            case a:
               return fqi.a().a(fqj.c, $$6x ? $$4 : $$1);
            case b:
               return fqi.a().a(fqj.c, $$6x ? $$4 : $$1).a(fqj.b, fqj.a.b);
            case c:
               return fqi.a().a(fqj.c, $$6x ? $$5 : $$2).a(fqj.b, fqj.a.b);
            case d:
               return fqi.a().a(fqj.c, $$6x ? $$6 : $$3).a(fqj.b, fqj.a.b);
            case e:
               return fqi.a().a(fqj.c, $$6x ? $$5 : $$2);
            case f:
               return fqi.a().a(fqj.c, $$6x ? $$6 : $$3);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.c($$0);
      this.b.accept(fqf.a($$0).a($$7));
   }

   private void a(dlu $$0, cyo $$1) {
      ale $$2 = fqr.aa.a($$0, fqs.a($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private void f(dlu $$0, ale $$1) {
      ale $$2 = fqr.aa.a($$0, fqs.h($$1), this.d);
      this.b.accept(c($$0, $$2));
   }

   private ale g(dlu $$0, dlu $$1) {
      return fqr.aa.a($$0, fqs.x($$1), this.d);
   }

   public void a(dlu $$0, dlu $$1) {
      this.b.accept(c($$0, this.g($$0, $$1)));
   }

   private void r(dlu $$0) {
      this.a($$0, $$0);
   }

   private void h(dlu $$0, dlu $$1) {
      this.a($$0);
      ale $$2 = fqu.j.get($$0).a($$1, this.d);
      this.b.accept(c($$1, $$2));
   }

   private void s(dlu $$0) {
      ale $$1 = fqu.p.create($$0, this.d);
      ale $$2 = fqu.q.create($$0, this.d);
      ale $$3 = fqu.r.create($$0, this.d);
      ale $$4 = fqu.s.create($$0, this.d);
      this.c($$0);
      this.a($$0, eae.V, $$1, $$2, $$3, $$4);
   }

   private void t(dlu $$0) {
      ale $$1 = fqu.l.create($$0, this.d);
      ale $$2 = fqu.m.create($$0, this.d);
      ale $$3 = fqu.n.create($$0, this.d);
      ale $$4 = fqu.o.create($$0, this.d);
      this.b($$0.h());
      this.a($$0, eae.U, $$1, $$2, $$3, $$4);
   }

   private void a(dlu $$0, eao $$1, ale $$2, ale $$3, ale $$4, ale $$5) {
      this.b
         .accept(
            fqe.a($$0)
               .a(fqd.a().a($$1, 1, 2, 3, 4).a(eae.T, ja.c), fqi.a().a(fqj.c, $$2))
               .a(fqd.a().a($$1, 1, 2, 3, 4).a(eae.T, ja.f), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b))
               .a(fqd.a().a($$1, 1, 2, 3, 4).a(eae.T, ja.d), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c))
               .a(fqd.a().a($$1, 1, 2, 3, 4).a(eae.T, ja.e), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d))
               .a(fqd.a().a($$1, 2, 3, 4).a(eae.T, ja.c), fqi.a().a(fqj.c, $$3))
               .a(fqd.a().a($$1, 2, 3, 4).a(eae.T, ja.f), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
               .a(fqd.a().a($$1, 2, 3, 4).a(eae.T, ja.d), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
               .a(fqd.a().a($$1, 2, 3, 4).a(eae.T, ja.e), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
               .a(fqd.a().a($$1, 3, 4).a(eae.T, ja.c), fqi.a().a(fqj.c, $$4))
               .a(fqd.a().a($$1, 3, 4).a(eae.T, ja.f), fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b))
               .a(fqd.a().a($$1, 3, 4).a(eae.T, ja.d), fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.c))
               .a(fqd.a().a($$1, 3, 4).a(eae.T, ja.e), fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.d))
               .a(fqd.a().a($$1, 4).a(eae.T, ja.c), fqi.a().a(fqj.c, $$5))
               .a(fqd.a().a($$1, 4).a(eae.T, ja.f), fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.b))
               .a(fqd.a().a($$1, 4).a(eae.T, ja.d), fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.c))
               .a(fqd.a().a($$1, 4).a(eae.T, ja.e), fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.d))
         );
   }

   private void a(fqu.a $$0, dlu... $$1) {
      for (dlu $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.d);
         this.b.accept(b($$2, $$3));
      }
   }

   private void b(fqu.a $$0, dlu... $$1) {
      for (dlu $$2 : $$1) {
         ale $$3 = $$0.create($$2, this.d);
         this.b.accept(fqf.a($$2, fqi.a().a(fqj.c, $$3)).a(c()));
      }
   }

   private void i(dlu $$0, dlu $$1) {
      this.a($$0);
      fqs $$2 = fqs.b($$0, $$1);
      ale $$3 = fqr.aP.a($$1, $$2, this.d);
      ale $$4 = fqr.aQ.a($$1, $$2, this.d);
      ale $$5 = fqr.aR.a($$1, $$2, this.d);
      ale $$6 = fqr.aN.a($$1, $$2, this.d);
      ale $$7 = fqr.aO.a($$1, $$2, this.d);
      cyo $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.b
         .accept(
            fqe.a($$1)
               .a(fqi.a().a(fqj.c, $$3))
               .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$4))
               .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$5))
               .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.N, false), fqi.a().a(fqj.c, $$6))
               .a(fqd.a().a(eae.O, false), fqi.a().a(fqj.c, $$7))
               .a(fqd.a().a(eae.P, false), fqi.a().a(fqj.c, $$7).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.Q, false), fqi.a().a(fqj.c, $$6).a(fqj.b, fqj.a.d))
         );
   }

   private void u(dlu $$0) {
      fqs $$1 = fqs.C($$0);
      ale $$2 = fqr.aS.a($$0, $$1, this.d);
      ale $$3 = this.a($$0, "_conditional", fqr.aS, $$1x -> $$1.c(fqt.i, $$1x));
      this.b.accept(fqf.a($$0).a(a(eae.f, $$3, $$2)).a(e()));
   }

   private void v(dlu $$0) {
      ale $$1 = fqu.v.create($$0, this.d);
      this.b.accept(c($$0, $$1).a(c()));
   }

   private List<fqi> a(int $$0) {
      String $$1 = "_age" + $$0;
      return IntStream.range(1, 5).mapToObj($$1x -> fqi.a().a(fqj.c, fqp.a(dlw.nB, $$1x + $$1))).collect(Collectors.toList());
   }

   private void n() {
      this.b
         .accept(
            fqe.a(dlw.nB)
               .a(fqd.a().a(eae.at, 0), this.a(0))
               .a(fqd.a().a(eae.at, 1), this.a(1))
               .a(fqd.a().a(eae.bn, eaa.b), fqi.a().a(fqj.c, fqp.a(dlw.nB, "_small_leaves")))
               .a(fqd.a().a(eae.bn, eaa.c), fqi.a().a(fqj.c, fqp.a(dlw.nB, "_large_leaves")))
         );
   }

   private fqg o() {
      return fqg.a(eae.R)
         .a(ja.a, fqi.a().a(fqj.a, fqj.a.c))
         .a(ja.b, fqi.a())
         .a(ja.c, fqi.a().a(fqj.a, fqj.a.b))
         .a(ja.d, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.c))
         .a(ja.e, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.d))
         .a(ja.f, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b));
   }

   private void p() {
      ale $$0 = fqs.a(dlw.ow, "_top_open");
      this.b
         .accept(
            fqf.a(dlw.ow)
               .a(this.o())
               .a(
                  fqg.a(eae.y)
                     .a(false, fqi.a().a(fqj.c, fqu.f.create(dlw.ow, this.d)))
                     .a(true, fqi.a().a(fqj.c, fqu.f.get(dlw.ow).a($$1 -> $$1.a(fqt.f, $$0)).a(dlw.ow, "_open", this.d)))
               )
         );
   }

   private static <T extends Comparable<T>> fqg a(ear<T> $$0, T $$1, ale $$2, ale $$3) {
      fqi $$4 = fqi.a().a(fqj.c, $$2);
      fqi $$5 = fqi.a().a(fqj.c, $$3);
      return fqg.a($$0).a($$3x -> {
         boolean $$4x = $$3x.compareTo($$1) >= 0;
         return $$4x ? $$4 : $$5;
      });
   }

   private void a(dlu $$0, Function<dlu, fqs> $$1) {
      fqs $$2 = $$1.apply($$0).b(fqt.i, fqt.c);
      fqs $$3 = $$2.c(fqt.g, fqs.a($$0, "_front_honey"));
      ale $$4 = fqr.q.a($$0, "_empty", $$2, this.d);
      ale $$5 = fqr.q.a($$0, "_honey", $$3, this.d);
      this.c.a($$0.h(), fqn.a(dlo.c, fqn.a($$4), Map.of(5, fqn.a($$5))));
      this.b.accept(fqf.a($$0).a(b()).a(a(dlo.c, 5, $$5, $$4)));
   }

   private void a(dlu $$0, ear<Integer> $$1, int... $$2) {
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ale> $$3 = new Int2ObjectOpenHashMap();
         fqg $$4 = fqg.a($$1).a($$3x -> {
            int $$4x = $$2[$$3x];
            ale $$5 = (ale)$$3.computeIfAbsent($$4x, $$2xx -> this.a($$0, "_stage" + $$4x, fqr.bc, fqs::g));
            return fqi.a().a(fqj.c, $$5);
         });
         this.b($$0.h());
         this.b.accept(fqf.a($$0).a($$4));
      }
   }

   private void q() {
      ale $$0 = fqp.a(dlw.oF, "_floor");
      ale $$1 = fqp.a(dlw.oF, "_ceiling");
      ale $$2 = fqp.a(dlw.oF, "_wall");
      ale $$3 = fqp.a(dlw.oF, "_between_walls");
      this.b(cyw.xw);
      this.b
         .accept(
            fqf.a(dlw.oF)
               .a(
                  fqg.a(eae.T, eae.Y)
                     .a(ja.c, eac.a, fqi.a().a(fqj.c, $$0))
                     .a(ja.d, eac.a, fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c))
                     .a(ja.f, eac.a, fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b))
                     .a(ja.e, eac.a, fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d))
                     .a(ja.c, eac.b, fqi.a().a(fqj.c, $$1))
                     .a(ja.d, eac.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c))
                     .a(ja.f, eac.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b))
                     .a(ja.e, eac.b, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d))
                     .a(ja.c, eac.c, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d))
                     .a(ja.d, eac.c, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b))
                     .a(ja.f, eac.c, fqi.a().a(fqj.c, $$2))
                     .a(ja.e, eac.c, fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c))
                     .a(ja.d, eac.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
                     .a(ja.c, eac.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
                     .a(ja.f, eac.d, fqi.a().a(fqj.c, $$3))
                     .a(ja.e, eac.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
               )
         );
   }

   private void r() {
      this.b
         .accept(
            fqf.a(dlw.oB, fqi.a().a(fqj.c, fqp.a(dlw.oB)))
               .a(
                  fqg.a(eae.X, eae.T)
                     .a(dzz.a, ja.c, fqi.a())
                     .a(dzz.a, ja.f, fqi.a().a(fqj.b, fqj.a.b))
                     .a(dzz.a, ja.d, fqi.a().a(fqj.b, fqj.a.c))
                     .a(dzz.a, ja.e, fqi.a().a(fqj.b, fqj.a.d))
                     .a(dzz.b, ja.c, fqi.a().a(fqj.a, fqj.a.b))
                     .a(dzz.b, ja.f, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
                     .a(dzz.b, ja.d, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.c))
                     .a(dzz.b, ja.e, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.d))
                     .a(dzz.c, ja.d, fqi.a().a(fqj.a, fqj.a.c))
                     .a(dzz.c, ja.e, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b))
                     .a(dzz.c, ja.c, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c))
                     .a(dzz.c, ja.f, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d))
               )
         );
   }

   private void d(dlu $$0, fqu.a $$1) {
      ale $$2 = $$1.create($$0, this.d);
      ale $$3 = fqs.a($$0, "_front_on");
      ale $$4 = $$1.get($$0).a($$1x -> $$1x.a(fqt.g, $$3)).a($$0, "_on", this.d);
      this.b.accept(fqf.a($$0).a(a(eae.u, $$4, $$2)).a(b()));
   }

   private void a(dlu... $$0) {
      ale $$1 = fqp.a("campfire_off");

      for (dlu $$2 : $$0) {
         ale $$3 = fqr.bj.a($$2, fqs.H($$2), this.d);
         this.b($$2.h());
         this.b.accept(fqf.a($$2).a(a(eae.u, $$3, $$1)).a(c()));
      }
   }

   private void w(dlu $$0) {
      ale $$1 = fqr.bE.a($$0, fqs.o($$0), this.d);
      this.b.accept(c($$0, $$1));
   }

   private void x(dlu $$0) {
      ale $$1;
      if ($$0 == dlw.tP) {
         $$1 = fqr.bG.a($$0, fqs.p($$0), this.d);
      } else {
         $$1 = fqr.bF.a($$0, fqs.p($$0), this.d);
      }

      this.b.accept(c($$0, $$1));
   }

   private void s() {
      fqs $$0 = fqs.a(fqs.J(dlw.cs), fqs.J(dlw.n));
      ale $$1 = fqr.j.a(dlw.cs, $$0, this.d);
      this.b.accept(c(dlw.cs, $$1));
   }

   private void t() {
      this.b(cyw.mg);
      this.b
         .accept(
            fqe.a(dlw.cE)
               .a(
                  fqd.b(
                     fqd.a().a(eae.ae, eat.c).a(eae.ad, eat.c).a(eae.af, eat.c).a(eae.ag, eat.c),
                     fqd.a().a(eae.ae, eat.b, eat.a).a(eae.ad, eat.b, eat.a),
                     fqd.a().a(eae.ad, eat.b, eat.a).a(eae.af, eat.b, eat.a),
                     fqd.a().a(eae.af, eat.b, eat.a).a(eae.ag, eat.b, eat.a),
                     fqd.a().a(eae.ag, eat.b, eat.a).a(eae.ae, eat.b, eat.a)
                  ),
                  fqi.a().a(fqj.c, fqp.a("redstone_dust_dot"))
               )
               .a(fqd.a().a(eae.ae, eat.b, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_side0")))
               .a(fqd.a().a(eae.af, eat.b, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_side_alt0")))
               .a(fqd.a().a(eae.ad, eat.b, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_side_alt1")).a(fqj.b, fqj.a.d))
               .a(fqd.a().a(eae.ag, eat.b, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_side1")).a(fqj.b, fqj.a.d))
               .a(fqd.a().a(eae.ae, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_up")))
               .a(fqd.a().a(eae.ad, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_up")).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.af, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_up")).a(fqj.b, fqj.a.c))
               .a(fqd.a().a(eae.ag, eat.a), fqi.a().a(fqj.c, fqp.a("redstone_dust_up")).a(fqj.b, fqj.a.d))
         );
   }

   private void u() {
      this.b(cyw.mk);
      this.b
         .accept(
            fqf.a(dlw.hv)
               .a(c())
               .a(
                  fqg.a(eae.bg, eae.A)
                     .a(eah.a, false, fqi.a().a(fqj.c, fqp.a(dlw.hv)))
                     .a(eah.a, true, fqi.a().a(fqj.c, fqp.a(dlw.hv, "_on")))
                     .a(eah.b, false, fqi.a().a(fqj.c, fqp.a(dlw.hv, "_subtract")))
                     .a(eah.b, true, fqi.a().a(fqj.c, fqp.a(dlw.hv, "_on_subtract")))
               )
         );
   }

   private void v() {
      fqs $$0 = fqs.a(dlw.kq);
      fqs $$1 = fqs.a(fqs.a(dlw.kd, "_side"), $$0.a(fqt.f));
      ale $$2 = fqr.ab.a(dlw.kd, $$1, this.d);
      ale $$3 = fqr.ac.a(dlw.kd, $$1, this.d);
      ale $$4 = fqr.j.b(dlw.kd, "_double", $$1, this.d);
      this.b.accept(e(dlw.kd, $$2, $$3, $$4));
      this.b.accept(c(dlw.kq, fqr.c.a(dlw.kq, $$0, this.d)));
   }

   private void w() {
      this.b(cyw.tr);
      this.b
         .accept(
            fqe.a(dlw.fN)
               .a(fqi.a().a(fqj.c, fqs.J(dlw.fN)))
               .a(fqd.a().a(eae.n, true), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_bottle0")))
               .a(fqd.a().a(eae.o, true), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_bottle1")))
               .a(fqd.a().a(eae.p, true), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_bottle2")))
               .a(fqd.a().a(eae.n, false), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_empty0")))
               .a(fqd.a().a(eae.o, false), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_empty1")))
               .a(fqd.a().a(eae.p, false), fqi.a().a(fqj.c, fqs.a(dlw.fN, "_empty2")))
         );
   }

   private void y(dlu $$0) {
      ale $$1 = fqr.bA.a($$0, fqs.b($$0), this.d);
      ale $$2 = fqp.a("mushroom_block_inside");
      this.b
         .accept(
            fqe.a($$0)
               .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$1))
               .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(fqd.a().a(eae.L, true), fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.d).a(fqj.d, true))
               .a(fqd.a().a(eae.M, true), fqi.a().a(fqj.c, $$1).a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(fqd.a().a(eae.N, false), fqi.a().a(fqj.c, $$2))
               .a(fqd.a().a(eae.O, false), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b).a(fqj.d, false))
               .a(fqd.a().a(eae.P, false), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c).a(fqj.d, false))
               .a(fqd.a().a(eae.Q, false), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d).a(fqj.d, false))
               .a(fqd.a().a(eae.L, false), fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.d).a(fqj.d, false))
               .a(fqd.a().a(eae.M, false), fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b).a(fqj.d, false))
         );
      this.a($$0, fqu.a.createWithSuffix($$0, "_inventory", this.d));
   }

   private void x() {
      this.b(cyw.sC);
      this.b
         .accept(
            fqf.a(dlw.et)
               .a(
                  fqg.a(eae.aB)
                     .a(0, fqi.a().a(fqj.c, fqp.a(dlw.et)))
                     .a(1, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice1")))
                     .a(2, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice2")))
                     .a(3, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice3")))
                     .a(4, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice4")))
                     .a(5, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice5")))
                     .a(6, fqi.a().a(fqj.c, fqp.a(dlw.et, "_slice6")))
               )
         );
   }

   private void y() {
      fqs $$0 = new fqs()
         .a(fqt.c, fqs.a(dlw.oz, "_side3"))
         .a(fqt.o, fqs.J(dlw.t))
         .a(fqt.n, fqs.a(dlw.oz, "_top"))
         .a(fqt.j, fqs.a(dlw.oz, "_side3"))
         .a(fqt.l, fqs.a(dlw.oz, "_side3"))
         .a(fqt.k, fqs.a(dlw.oz, "_side1"))
         .a(fqt.m, fqs.a(dlw.oz, "_side2"));
      this.b.accept(c(dlw.oz, fqr.a.a(dlw.oz, $$0, this.d)));
   }

   private void z() {
      fqs $$0 = new fqs()
         .a(fqt.c, fqs.a(dlw.oD, "_front"))
         .a(fqt.o, fqs.a(dlw.oD, "_bottom"))
         .a(fqt.n, fqs.a(dlw.oD, "_top"))
         .a(fqt.j, fqs.a(dlw.oD, "_front"))
         .a(fqt.k, fqs.a(dlw.oD, "_front"))
         .a(fqt.l, fqs.a(dlw.oD, "_side"))
         .a(fqt.m, fqs.a(dlw.oD, "_side"));
      this.b.accept(c(dlw.oD, fqr.a.a(dlw.oD, $$0, this.d)));
   }

   private void a(dlu $$0, dlu $$1, BiFunction<dlu, dlu, fqs> $$2) {
      fqs $$3 = $$2.apply($$0, $$1);
      this.b.accept(c($$0, fqr.a.a($$0, $$3, this.d)));
   }

   public void b(dlu $$0) {
      fqs $$1 = new fqs()
         .a(fqt.c, fqs.a($$0, "_particle"))
         .a(fqt.o, fqs.a($$0, "_down"))
         .a(fqt.n, fqs.a($$0, "_up"))
         .a(fqt.j, fqs.a($$0, "_north"))
         .a(fqt.k, fqs.a($$0, "_south"))
         .a(fqt.l, fqs.a($$0, "_east"))
         .a(fqt.m, fqs.a($$0, "_west"));
      this.b.accept(c($$0, fqr.a.a($$0, $$1, this.d)));
   }

   private void A() {
      fqs $$0 = fqs.n(dlw.fn);
      this.b.accept(c(dlw.fn, fqp.a(dlw.fn)));
      this.a(dlw.er, $$0);
      this.a(dlw.es, $$0);
   }

   private void a(dlu $$0, fqs $$1) {
      ale $$2 = fqr.p.a($$0, $$1.c(fqt.g, fqs.J($$0)), this.d);
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, $$2)).a(b()));
   }

   private void B() {
      this.b(cyw.ts);
      this.n(dlw.fO);
      this.b.accept(c(dlw.fQ, fqr.bD.a(dlw.fQ, fqs.j(fqs.a(dlw.K, "_still")), this.d)));
      this.b
         .accept(
            fqf.a(dlw.fP)
               .a(
                  fqg.a(dqg.f)
                     .a(1, fqi.a().a(fqj.c, fqr.bB.a(dlw.fP, "_level1", fqs.j(fqs.a(dlw.J, "_still")), this.d)))
                     .a(2, fqi.a().a(fqj.c, fqr.bC.a(dlw.fP, "_level2", fqs.j(fqs.a(dlw.J, "_still")), this.d)))
                     .a(3, fqi.a().a(fqj.c, fqr.bD.a(dlw.fP, "_full", fqs.j(fqs.a(dlw.J, "_still")), this.d)))
               )
         );
      this.b
         .accept(
            fqf.a(dlw.fR)
               .a(
                  fqg.a(dqg.f)
                     .a(1, fqi.a().a(fqj.c, fqr.bB.a(dlw.fR, "_level1", fqs.j(fqs.J(dlw.rt)), this.d)))
                     .a(2, fqi.a().a(fqj.c, fqr.bC.a(dlw.fR, "_level2", fqs.j(fqs.J(dlw.rt)), this.d)))
                     .a(3, fqi.a().a(fqj.c, fqr.bD.a(dlw.fR, "_full", fqs.j(fqs.J(dlw.rt)), this.d)))
               )
         );
   }

   private void C() {
      fqs $$0 = fqs.b(dlw.kX);
      ale $$1 = fqr.aL.a(dlw.kX, $$0, this.d);
      ale $$2 = this.a(dlw.kX, "_dead", fqr.aL, $$1x -> $$0.c(fqt.b, $$1x));
      this.b.accept(fqf.a(dlw.kX).a(a(eae.ax, 5, $$2, $$1)));
   }

   private void D() {
      ale $$0 = fqp.a(dlw.tW);
      ale $$1 = fqp.a(dlw.tW, "_triggered");
      ale $$2 = fqp.a(dlw.tW, "_crafting");
      ale $$3 = fqp.a(dlw.tW, "_crafting_triggered");
      this.b
         .accept(
            fqf.a(dlw.tW)
               .a(fqg.a(eae.W).a($$0x -> this.a($$0x, fqi.a())))
               .a(
                  fqg.a(eae.G, dnn.b)
                     .a(false, false, fqi.a().a(fqj.c, $$0))
                     .a(true, true, fqi.a().a(fqj.c, $$3))
                     .a(true, false, fqi.a().a(fqj.c, $$1))
                     .a(false, true, fqi.a().a(fqj.c, $$2))
               )
         );
   }

   private void z(dlu $$0) {
      fqs $$1 = new fqs().a(fqt.f, fqs.a(dlw.cL, "_top")).a(fqt.i, fqs.a(dlw.cL, "_side")).a(fqt.g, fqs.a($$0, "_front"));
      fqs $$2 = new fqs().a(fqt.i, fqs.a(dlw.cL, "_top")).a(fqt.g, fqs.a($$0, "_front_vertical"));
      ale $$3 = fqr.p.a($$0, $$1, this.d);
      ale $$4 = fqr.r.a($$0, $$2, this.d);
      this.b
         .accept(
            fqf.a($$0)
               .a(
                  fqg.a(eae.R)
                     .a(ja.a, fqi.a().a(fqj.c, $$4).a(fqj.a, fqj.a.c))
                     .a(ja.b, fqi.a().a(fqj.c, $$4))
                     .a(ja.c, fqi.a().a(fqj.c, $$3))
                     .a(ja.f, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
                     .a(ja.d, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c))
                     .a(ja.e, fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d))
               )
         );
   }

   private void E() {
      ale $$0 = fqp.a(dlw.fT);
      ale $$1 = fqp.a(dlw.fT, "_filled");
      this.b.accept(fqf.a(dlw.fT).a(fqg.a(eae.k).a(false, fqi.a().a(fqj.c, $$0)).a(true, fqi.a().a(fqj.c, $$1))).a(c()));
   }

   private void F() {
      ale $$0 = fqp.a(dlw.kW, "_side");
      ale $$1 = fqp.a(dlw.kW, "_noside");
      ale $$2 = fqp.a(dlw.kW, "_noside1");
      ale $$3 = fqp.a(dlw.kW, "_noside2");
      ale $$4 = fqp.a(dlw.kW, "_noside3");
      this.b
         .accept(
            fqe.a(dlw.kW)
               .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$0))
               .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b).a(fqj.d, true))
               .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c).a(fqj.d, true))
               .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d).a(fqj.d, true))
               .a(fqd.a().a(eae.L, true), fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.d).a(fqj.d, true))
               .a(fqd.a().a(eae.M, true), fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.b).a(fqj.d, true))
               .a(fqd.a().a(eae.N, false), fqi.a().a(fqj.c, $$1).a(fqj.e, 2), fqi.a().a(fqj.c, $$2), fqi.a().a(fqj.c, $$3), fqi.a().a(fqj.c, $$4))
               .a(
                  fqd.a().a(eae.O, false),
                  fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$1).a(fqj.e, 2).a(fqj.b, fqj.a.b).a(fqj.d, true)
               )
               .a(
                  fqd.a().a(eae.P, false),
                  fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.c).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.c).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$1).a(fqj.e, 2).a(fqj.b, fqj.a.c).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.c).a(fqj.d, true)
               )
               .a(
                  fqd.a().a(eae.Q, false),
                  fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$1).a(fqj.e, 2).a(fqj.b, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.d).a(fqj.d, true)
               )
               .a(
                  fqd.a().a(eae.L, false),
                  fqi.a().a(fqj.c, $$1).a(fqj.e, 2).a(fqj.a, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$4).a(fqj.a, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.d).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.d).a(fqj.d, true)
               )
               .a(
                  fqd.a().a(eae.M, false),
                  fqi.a().a(fqj.c, $$4).a(fqj.a, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$3).a(fqj.a, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$2).a(fqj.a, fqj.a.b).a(fqj.d, true),
                  fqi.a().a(fqj.c, $$1).a(fqj.e, 2).a(fqj.a, fqj.a.b).a(fqj.d, true)
               )
         );
   }

   private void G() {
      this.b
         .accept(
            fqe.a(dlw.pG)
               .a(fqi.a().a(fqj.c, fqs.J(dlw.pG)))
               .a(fqd.a().a(eae.aO, 1), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents1")))
               .a(fqd.a().a(eae.aO, 2), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents2")))
               .a(fqd.a().a(eae.aO, 3), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents3")))
               .a(fqd.a().a(eae.aO, 4), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents4")))
               .a(fqd.a().a(eae.aO, 5), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents5")))
               .a(fqd.a().a(eae.aO, 6), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents6")))
               .a(fqd.a().a(eae.aO, 7), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents7")))
               .a(fqd.a().a(eae.aO, 8), fqi.a().a(fqj.c, fqs.a(dlw.pG, "_contents_ready")))
         );
   }

   private void A(dlu $$0) {
      ale $$1 = fqr.c.a($$0, fqs.a($$0), this.d);
      ale $$2 = this.a($$0, "_powered", fqr.c, fqs::b);
      ale $$3 = this.a($$0, "_lit", fqr.c, fqs::b);
      ale $$4 = this.a($$0, "_lit_powered", fqr.c, fqs::b);
      this.b.accept(this.a($$0, $$1, $$3, $$2, $$4));
   }

   private fqc a(dlu $$0, ale $$1, ale $$2, ale $$3, ale $$4) {
      return fqf.a($$0).a(fqg.a(eae.u, eae.A).a(($$4x, $$5) -> $$4x ? fqi.a().a(fqj.c, $$5 ? $$4 : $$2) : fqi.a().a(fqj.c, $$5 ? $$3 : $$1)));
   }

   private void j(dlu $$0, dlu $$1) {
      ale $$2 = fqp.a($$0);
      ale $$3 = fqp.a($$0, "_powered");
      ale $$4 = fqp.a($$0, "_lit");
      ale $$5 = fqp.a($$0, "_lit_powered");
      this.c.a($$0.h(), $$1.h());
      this.b.accept(this.a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dlu $$0) {
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, fqr.ao.a($$0, fqs.c($$0), this.d))).a(this.o()));
   }

   private void H() {
      this.B(dlw.rc);
      this.B(dlw.rb);
      this.B(dlw.ra);
      this.B(dlw.qZ);
   }

   private void I() {
      fqg.b<ja, eal> $$0 = fqg.a(eae.bp, eae.bq);

      for (eal $$1 : eal.values()) {
         $$0.a(ja.b, $$1, this.a(ja.b, $$1));
      }

      for (eal $$2 : eal.values()) {
         $$0.a(ja.a, $$2, this.a(ja.a, $$2));
      }

      this.b.accept(fqf.a(dlw.sX).a($$0));
   }

   private fqi a(ja $$0, eal $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fqs $$3 = fqs.c(fqs.a(dlw.sX, $$2));
      return fqi.a().a(fqj.c, fqr.an.a(dlw.sX, $$2, $$3, this.d));
   }

   private void C(dlu $$0) {
      fqs $$1 = new fqs().a(fqt.e, fqs.J(dlw.ei)).a(fqt.f, fqs.J($$0)).a(fqt.i, fqs.a($$0, "_side"));
      this.b.accept(c($$0, fqr.n.a($$0, $$1, this.d)));
   }

   private void J() {
      ale $$0 = fqs.a(dlw.hw, "_side");
      fqs $$1 = new fqs().a(fqt.f, fqs.a(dlw.hw, "_top")).a(fqt.i, $$0);
      fqs $$2 = new fqs().a(fqt.f, fqs.a(dlw.hw, "_inverted_top")).a(fqt.i, $$0);
      this.b
         .accept(
            fqf.a(dlw.hw)
               .a(
                  fqg.a(eae.s)
                     .a(false, fqi.a().a(fqj.c, fqr.aM.a(dlw.hw, $$1, this.d)))
                     .a(true, fqi.a().a(fqj.c, fqr.aM.a(fqp.a(dlw.hw, "_inverted"), $$2, this.d)))
               )
         );
   }

   private void D(dlu $$0) {
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, fqp.a($$0))).a(this.o()));
   }

   private void K() {
      dlu $$0 = dlw.sW;
      ale $$1 = fqp.a($$0, "_on");
      ale $$2 = fqp.a($$0);
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, fqp.a($$0))).a(this.o()).a(a(eae.A, $$1, $$2)));
   }

   private void L() {
      fqs $$0 = new fqs().a(fqt.C, fqs.J(dlw.j)).a(fqt.f, fqs.J(dlw.cK));
      fqs $$1 = new fqs().a(fqt.C, fqs.J(dlw.j)).a(fqt.f, fqs.a(dlw.cK, "_moist"));
      ale $$2 = fqr.bd.a(dlw.cK, $$0, this.d);
      ale $$3 = fqr.bd.a(fqs.a(dlw.cK, "_moist"), $$1, this.d);
      this.b.accept(fqf.a(dlw.cK).a(a(eae.aT, 7, $$3, $$2)));
   }

   private List<ale> E(dlu $$0) {
      ale $$1 = fqr.be.a(fqp.a($$0, "_floor0"), fqs.y($$0), this.d);
      ale $$2 = fqr.be.a(fqp.a($$0, "_floor1"), fqs.z($$0), this.d);
      return ImmutableList.of($$1, $$2);
   }

   private List<ale> F(dlu $$0) {
      ale $$1 = fqr.bf.a(fqp.a($$0, "_side0"), fqs.y($$0), this.d);
      ale $$2 = fqr.bf.a(fqp.a($$0, "_side1"), fqs.z($$0), this.d);
      ale $$3 = fqr.bg.a(fqp.a($$0, "_side_alt0"), fqs.y($$0), this.d);
      ale $$4 = fqr.bg.a(fqp.a($$0, "_side_alt1"), fqs.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private List<ale> G(dlu $$0) {
      ale $$1 = fqr.bh.a(fqp.a($$0, "_up0"), fqs.y($$0), this.d);
      ale $$2 = fqr.bh.a(fqp.a($$0, "_up1"), fqs.z($$0), this.d);
      ale $$3 = fqr.bi.a(fqp.a($$0, "_up_alt0"), fqs.y($$0), this.d);
      ale $$4 = fqr.bi.a(fqp.a($$0, "_up_alt1"), fqs.z($$0), this.d);
      return ImmutableList.of($$1, $$2, $$3, $$4);
   }

   private static List<fqi> a(List<ale> $$0, UnaryOperator<fqi> $$1) {
      return $$0.stream().map($$0x -> fqi.a().a(fqj.c, $$0x)).map($$1).collect(Collectors.toList());
   }

   private void M() {
      fqd $$0 = fqd.a().a(eae.N, false).a(eae.O, false).a(eae.P, false).a(eae.Q, false).a(eae.L, false);
      List<ale> $$1 = this.E(dlw.cy);
      List<ale> $$2 = this.F(dlw.cy);
      List<ale> $$3 = this.G(dlw.cy);
      this.b
         .accept(
            fqe.a(dlw.cy)
               .a($$0, a($$1, $$0x -> $$0x))
               .a(fqd.b(fqd.a().a(eae.N, true), $$0), a($$2, $$0x -> $$0x))
               .a(fqd.b(fqd.a().a(eae.O, true), $$0), a($$2, $$0x -> $$0x.a(fqj.b, fqj.a.b)))
               .a(fqd.b(fqd.a().a(eae.P, true), $$0), a($$2, $$0x -> $$0x.a(fqj.b, fqj.a.c)))
               .a(fqd.b(fqd.a().a(eae.Q, true), $$0), a($$2, $$0x -> $$0x.a(fqj.b, fqj.a.d)))
               .a(fqd.a().a(eae.L, true), a($$3, $$0x -> $$0x))
         );
   }

   private void N() {
      List<ale> $$0 = this.E(dlw.cz);
      List<ale> $$1 = this.F(dlw.cz);
      this.b
         .accept(
            fqe.a(dlw.cz)
               .a(a($$0, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x))
               .a(a($$1, $$0x -> $$0x.a(fqj.b, fqj.a.b)))
               .a(a($$1, $$0x -> $$0x.a(fqj.b, fqj.a.c)))
               .a(a($$1, $$0x -> $$0x.a(fqj.b, fqj.a.d)))
         );
   }

   private void H(dlu $$0) {
      ale $$1 = fqu.x.create($$0, this.d);
      ale $$2 = fqu.y.create($$0, this.d);
      this.b($$0.h());
      this.b.accept(fqf.a($$0).a(a(eae.m, $$2, $$1)));
   }

   private void O() {
      fqs $$0 = fqs.a(fqs.a(dlw.ah, "_side"), fqs.a(dlw.ah, "_top"));
      ale $$1 = fqr.j.a(dlw.ah, $$0, this.d);
      this.b.accept(d(dlw.ah, $$1));
   }

   private void P() {
      this.b(cyw.af);
      dlu $$0 = dlw.H;
      fqg.b<Boolean, Integer> $$1 = fqg.a(dqt.d, dqt.b);
      ale $$2 = fqp.a($$0);

      for (int $$3 = 0; $$3 <= 4; $$3++) {
         ale $$4 = fqp.a($$0, "_hanging_" + $$3);
         $$1.a(true, $$3, fqi.a().a(fqj.c, $$4));
         $$1.a(false, $$3, fqi.a().a(fqj.c, $$2));
      }

      this.b.accept(fqf.a(dlw.H).a($$1));
   }

   private void Q() {
      this.b
         .accept(
            fqf.a(dlw.lk)
               .a(
                  fqg.a(eae.av)
                     .a(0, fqi.a().a(fqj.c, this.a(dlw.lk, "_0", fqr.c, fqs::b)))
                     .a(1, fqi.a().a(fqj.c, this.a(dlw.lk, "_1", fqr.c, fqs::b)))
                     .a(2, fqi.a().a(fqj.c, this.a(dlw.lk, "_2", fqr.c, fqs::b)))
                     .a(3, fqi.a().a(fqj.c, this.a(dlw.lk, "_3", fqr.c, fqs::b)))
               )
         );
   }

   private void R() {
      ale $$0 = fqs.J(dlw.j);
      fqs $$1 = new fqs().a(fqt.e, $$0).b(fqt.e, fqt.c).a(fqt.f, fqs.a(dlw.i, "_top")).a(fqt.i, fqs.a(dlw.i, "_snow"));
      fqi $$2 = fqi.a().a(fqj.c, fqr.n.a(dlw.i, "_snow", $$1, this.d));
      this.a(dlw.i, fqp.a(dlw.i), $$2);
      this.a(dlw.i, fqp.a(dlw.i), new fpp());
      ale $$3 = fqu.f.get(dlw.fA).a($$1x -> $$1x.a(fqt.e, $$0)).a(dlw.fA, this.d);
      this.a(dlw.fA, $$3, $$2);
      ale $$4 = fqu.f.get(dlw.l).a($$1x -> $$1x.a(fqt.e, $$0)).a(dlw.l, this.d);
      this.a(dlw.l, $$4, $$2);
   }

   private void a(dlu $$0, ale $$1, fqi $$2) {
      List<fqi> $$3 = Arrays.asList(a($$1));
      this.b.accept(fqf.a($$0).a(fqg.a(eae.E).a(true, $$2).a(false, $$3)));
   }

   private void S() {
      this.b(cyw.si);
      this.b
         .accept(
            fqf.a(dlw.fX)
               .a(
                  fqg.a(eae.au)
                     .a(0, fqi.a().a(fqj.c, fqp.a(dlw.fX, "_stage0")))
                     .a(1, fqi.a().a(fqj.c, fqp.a(dlw.fX, "_stage1")))
                     .a(2, fqi.a().a(fqj.c, fqp.a(dlw.fX, "_stage2")))
               )
               .a(c())
         );
   }

   private void T() {
      this.b.accept(b(dlw.lg, fqp.a(dlw.lg)));
   }

   private void k(dlu $$0, dlu $$1) {
      fqs $$2 = fqs.b($$1);
      ale $$3 = fqr.Y.a($$0, $$2, this.d);
      ale $$4 = fqr.Z.a($$0, $$2, this.d);
      this.b.accept(fqf.a($$0).a(a(eae.aW, 1, $$4, $$3)));
   }

   private void U() {
      ale $$0 = fqp.a(dlw.hz);
      ale $$1 = fqp.a(dlw.hz, "_side");
      this.b(cyw.mq);
      this.b
         .accept(
            fqf.a(dlw.hz)
               .a(
                  fqg.a(eae.S)
                     .a(ja.a, fqi.a().a(fqj.c, $$0))
                     .a(ja.c, fqi.a().a(fqj.c, $$1))
                     .a(ja.f, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.b))
                     .a(ja.d, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.c))
                     .a(ja.e, fqi.a().a(fqj.c, $$1).a(fqj.b, fqj.a.d))
               )
         );
   }

   private void l(dlu $$0, dlu $$1) {
      ale $$2 = fqp.a($$0);
      this.b.accept(fqf.a($$1, fqi.a().a(fqj.c, $$2)));
      this.c.a($$0.h(), $$1.h());
   }

   private void V() {
      ale $$0 = fqp.a(dlw.fk, "_post_ends");
      ale $$1 = fqp.a(dlw.fk, "_post");
      ale $$2 = fqp.a(dlw.fk, "_cap");
      ale $$3 = fqp.a(dlw.fk, "_cap_alt");
      ale $$4 = fqp.a(dlw.fk, "_side");
      ale $$5 = fqp.a(dlw.fk, "_side_alt");
      this.b
         .accept(
            fqe.a(dlw.fk)
               .a(fqi.a().a(fqj.c, $$0))
               .a(fqd.a().a(eae.N, false).a(eae.O, false).a(eae.P, false).a(eae.Q, false), fqi.a().a(fqj.c, $$1))
               .a(fqd.a().a(eae.N, true).a(eae.O, false).a(eae.P, false).a(eae.Q, false), fqi.a().a(fqj.c, $$2))
               .a(fqd.a().a(eae.N, false).a(eae.O, true).a(eae.P, false).a(eae.Q, false), fqi.a().a(fqj.c, $$2).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.N, false).a(eae.O, false).a(eae.P, true).a(eae.Q, false), fqi.a().a(fqj.c, $$3))
               .a(fqd.a().a(eae.N, false).a(eae.O, false).a(eae.P, false).a(eae.Q, true), fqi.a().a(fqj.c, $$3).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.N, true), fqi.a().a(fqj.c, $$4))
               .a(fqd.a().a(eae.O, true), fqi.a().a(fqj.c, $$4).a(fqj.b, fqj.a.b))
               .a(fqd.a().a(eae.P, true), fqi.a().a(fqj.c, $$5))
               .a(fqd.a().a(eae.Q, true), fqi.a().a(fqj.c, $$5).a(fqj.b, fqj.a.b))
         );
      this.c(dlw.fk);
   }

   private void I(dlu $$0) {
      this.b.accept(fqf.a($$0, fqi.a().a(fqj.c, fqp.a($$0))).a(b()));
   }

   private void W() {
      ale $$0 = fqp.a(dlw.dI);
      ale $$1 = fqp.a(dlw.dI, "_on");
      this.c(dlw.dI);
      this.b
         .accept(
            fqf.a(dlw.dI)
               .a(a(eae.A, $$0, $$1))
               .a(
                  fqg.a(eae.X, eae.T)
                     .a(dzz.c, ja.c, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.c))
                     .a(dzz.c, ja.f, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.d))
                     .a(dzz.c, ja.d, fqi.a().a(fqj.a, fqj.a.c))
                     .a(dzz.c, ja.e, fqi.a().a(fqj.a, fqj.a.c).a(fqj.b, fqj.a.b))
                     .a(dzz.a, ja.c, fqi.a())
                     .a(dzz.a, ja.f, fqi.a().a(fqj.b, fqj.a.b))
                     .a(dzz.a, ja.d, fqi.a().a(fqj.b, fqj.a.c))
                     .a(dzz.a, ja.e, fqi.a().a(fqj.b, fqj.a.d))
                     .a(dzz.b, ja.c, fqi.a().a(fqj.a, fqj.a.b))
                     .a(dzz.b, ja.f, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b))
                     .a(dzz.b, ja.d, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.c))
                     .a(dzz.b, ja.e, fqi.a().a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.d))
               )
         );
   }

   private void X() {
      ale $$0 = this.a(cyw.gz, dlw.fB);
      this.a(dlw.fB, $$0, fqn.a(-9321636));
      this.b.accept(b(dlw.fB, fqp.a(dlw.fB)));
   }

   private void Y() {
      this.c(dlw.tT);
      this.b.accept(c(dlw.tT, fqp.a(dlw.tT)));
   }

   private void Z() {
      this.b.accept(fqf.a(dlw.eq).a(fqg.a(eae.J).a(ja.a.a, fqi.a().a(fqj.c, fqp.a(dlw.eq, "_ns"))).a(ja.a.c, fqi.a().a(fqj.c, fqp.a(dlw.eq, "_ew")))));
   }

   private void aa() {
      ale $$0 = fqu.a.create(dlw.ei, this.d);
      this.b
         .accept(
            fqf.a(
               dlw.ei,
               fqi.a().a(fqj.c, $$0),
               fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.b),
               fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.c),
               fqi.a().a(fqj.c, $$0).a(fqj.a, fqj.a.d),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b).a(fqj.a, fqj.a.b),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b).a(fqj.a, fqj.a.c),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.b).a(fqj.a, fqj.a.d),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c).a(fqj.a, fqj.a.b),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c).a(fqj.a, fqj.a.c),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.c).a(fqj.a, fqj.a.d),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d).a(fqj.a, fqj.a.b),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d).a(fqj.a, fqj.a.c),
               fqi.a().a(fqj.c, $$0).a(fqj.b, fqj.a.d).a(fqj.a, fqj.a.d)
            )
         );
   }

   private void ab() {
      ale $$0 = fqp.a(dlw.lq);
      ale $$1 = fqp.a(dlw.lq, "_on");
      this.b.accept(fqf.a(dlw.lq).a(a(eae.A, $$1, $$0)).a(e()));
   }

   private void ac() {
      fqs $$0 = new fqs().a(fqt.e, fqs.a(dlw.bF, "_bottom")).a(fqt.i, fqs.a(dlw.bF, "_side"));
      ale $$1 = fqs.a(dlw.bF, "_top_sticky");
      ale $$2 = fqs.a(dlw.bF, "_top");
      fqs $$3 = $$0.c(fqt.F, $$1);
      fqs $$4 = $$0.c(fqt.F, $$2);
      ale $$5 = fqp.a(dlw.bF, "_base");
      this.a(dlw.bF, $$5, $$4);
      this.a(dlw.by, $$5, $$3);
      ale $$6 = fqr.n.a(dlw.bF, "_inventory", $$0.c(fqt.f, $$2), this.d);
      ale $$7 = fqr.n.a(dlw.by, "_inventory", $$0.c(fqt.f, $$1), this.d);
      this.a(dlw.bF, $$6);
      this.a(dlw.by, $$7);
   }

   private void a(dlu $$0, ale $$1, fqs $$2) {
      ale $$3 = fqr.bs.a($$0, $$2, this.d);
      this.b.accept(fqf.a($$0).a(a(eae.j, $$1, $$3)).a(e()));
   }

   private void ad() {
      fqs $$0 = new fqs().a(fqt.G, fqs.a(dlw.bF, "_top")).a(fqt.i, fqs.a(dlw.bF, "_side"));
      fqs $$1 = $$0.c(fqt.F, fqs.a(dlw.bF, "_top_sticky"));
      fqs $$2 = $$0.c(fqt.F, fqs.a(dlw.bF, "_top"));
      this.b
         .accept(
            fqf.a(dlw.bG)
               .a(
                  fqg.a(eae.B, eae.bj)
                     .a(false, eaq.a, fqi.a().a(fqj.c, fqr.bt.a(dlw.bF, "_head", $$2, this.d)))
                     .a(false, eaq.b, fqi.a().a(fqj.c, fqr.bt.a(dlw.bF, "_head_sticky", $$1, this.d)))
                     .a(true, eaq.a, fqi.a().a(fqj.c, fqr.bu.a(dlw.bF, "_head_short", $$2, this.d)))
                     .a(true, eaq.b, fqi.a().a(fqj.c, fqr.bu.a(dlw.bF, "_head_short_sticky", $$1, this.d)))
               )
               .a(e())
         );
   }

   private void ae() {
      dlu $$0 = dlw.tX;
      fqs $$1 = fqs.a($$0, "_side_inactive", "_top_inactive");
      fqs $$2 = fqs.a($$0, "_side_active", "_top_active");
      fqs $$3 = fqs.a($$0, "_side_active", "_top_ejecting_reward");
      fqs $$4 = fqs.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fqs $$5 = fqs.a($$0, "_side_active_ominous", "_top_active_ominous");
      fqs $$6 = fqs.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ale $$7 = fqr.o.a($$0, $$1, this.d);
      ale $$8 = fqr.o.a($$0, "_active", $$2, this.d);
      ale $$9 = fqr.o.a($$0, "_ejecting_reward", $$3, this.d);
      ale $$10 = fqr.o.a($$0, "_inactive_ominous", $$4, this.d);
      ale $$11 = fqr.o.a($$0, "_active_ominous", $$5, this.d);
      ale $$12 = fqr.o.a($$0, "_ejecting_reward_ominous", $$6, this.d);
      this.a($$0, $$7);
      this.b.accept(fqf.a($$0).a(fqg.a(eae.bB, eae.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> fqi.a().a(fqj.c, $$7x ? $$10 : $$7);
            case b, c, d -> fqi.a().a(fqj.c, $$7x ? $$11 : $$8);
            case e -> fqi.a().a(fqj.c, $$7x ? $$12 : $$9);
         };
      })));
   }

   private void af() {
      dlu $$0 = dlw.tY;
      fqs $$1 = fqs.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fqs $$2 = fqs.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fqs $$3 = fqs.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fqs $$4 = fqs.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ale $$5 = fqr.cb.a($$0, $$1, this.d);
      ale $$6 = fqr.cb.a($$0, "_active", $$2, this.d);
      ale $$7 = fqr.cb.a($$0, "_unlocking", $$3, this.d);
      ale $$8 = fqr.cb.a($$0, "_ejecting_reward", $$4, this.d);
      fqs $$9 = fqs.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fqs $$10 = fqs.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fqs $$11 = fqs.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fqs $$12 = fqs.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ale $$13 = fqr.cb.a($$0, "_ominous", $$9, this.d);
      ale $$14 = fqr.cb.a($$0, "_active_ominous", $$10, this.d);
      ale $$15 = fqr.cb.a($$0, "_unlocking_ominous", $$11, this.d);
      ale $$16 = fqr.cb.a($$0, "_ejecting_reward_ominous", $$12, this.d);
      this.a($$0, $$5);
      this.b.accept(fqf.a($$0).a(b()).a(fqg.a(duz.b, duz.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> fqi.a().a(fqj.c, $$9x ? $$13 : $$5);
            case b -> fqi.a().a(fqj.c, $$9x ? $$14 : $$6);
            case c -> fqi.a().a(fqj.c, $$9x ? $$15 : $$7);
            case d -> fqi.a().a(fqj.c, $$9x ? $$16 : $$8);
         };
      })));
   }

   private void ag() {
      ale $$0 = fqp.a(dlw.ru, "_inactive");
      ale $$1 = fqp.a(dlw.ru, "_active");
      this.a(dlw.ru, $$0);
      this.b.accept(fqf.a(dlw.ru).a(fqg.a(eae.br).a($$2 -> fqi.a().a(fqj.c, $$2 != eav.b && $$2 != eav.c ? $$0 : $$1))));
   }

   private void ah() {
      ale $$0 = fqp.a(dlw.rv, "_inactive");
      ale $$1 = fqp.a(dlw.rv, "_active");
      this.a(dlw.rv, $$0);
      this.b.accept(fqf.a(dlw.rv).a(fqg.a(eae.br).a($$2 -> fqi.a().a(fqj.c, $$2 != eav.b && $$2 != eav.c ? $$0 : $$1))).a(b()));
   }

   private void ai() {
      ale $$0 = fqr.ca.a(dlw.rz, fqs.a(false), this.d);
      ale $$1 = fqr.ca.a(dlw.rz, "_can_summon", fqs.a(true), this.d);
      this.a(dlw.rz, $$0);
      this.b.accept(fqf.a(dlw.rz).a(a(eae.e, $$1, $$0)));
   }

   private void aj() {
      ale $$0 = fqp.a(dlw.ou, "_stable");
      ale $$1 = fqp.a(dlw.ou, "_unstable");
      this.a(dlw.ou, $$0);
      this.b.accept(fqf.a(dlw.ou).a(a(eae.d, $$1, $$0)));
   }

   private void ak() {
      ale $$0 = this.a(dlw.sZ, "", fqr.ao, fqs::c);
      ale $$1 = this.a(dlw.sZ, "_lit", fqr.ao, fqs::c);
      this.b.accept(fqf.a(dlw.sZ).a(a(eae.b, $$1, $$0)));
      ale $$2 = this.a(dlw.ta, "", fqr.ao, fqs::c);
      ale $$3 = this.a(dlw.ta, "_lit", fqr.ao, fqs::c);
      this.b.accept(fqf.a(dlw.ta).a(a(eae.b, $$3, $$2)));
   }

   private void al() {
      ale $$0 = fqu.a.create(dlw.fW, this.d);
      ale $$1 = this.a(dlw.fW, "_on", fqr.c, fqs::b);
      this.b.accept(fqf.a(dlw.fW).a(a(eae.u, $$1, $$0)));
   }

   private void m(dlu $$0, dlu $$1) {
      fqs $$2 = fqs.B($$0);
      this.b.accept(c($$0, fqr.bm.a($$0, $$2, this.d)));
      this.b.accept(fqf.a($$1, fqi.a().a(fqj.c, fqr.bo.a($$1, $$2, this.d))).a(d()));
      this.c($$0);
   }

   private void am() {
      fqs $$0 = fqs.B(dlw.dX);
      fqs $$1 = fqs.i(fqs.a(dlw.dX, "_off"));
      ale $$2 = fqr.bq.a(dlw.dX, $$0, this.d);
      ale $$3 = fqr.bn.a(dlw.dX, "_off", $$1, this.d);
      this.b.accept(fqf.a(dlw.dX).a(a(eae.u, $$2, $$3)));
      ale $$4 = fqr.br.a(dlw.dY, $$0, this.d);
      ale $$5 = fqr.bp.a(dlw.dY, "_off", $$1, this.d);
      this.b.accept(fqf.a(dlw.dY).a(a(eae.u, $$4, $$5)).a(d()));
      this.c(dlw.dX);
   }

   private void an() {
      this.b(cyw.mj);
      this.b.accept(fqf.a(dlw.eu).a(fqg.a(eae.aD, eae.v, eae.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return fqi.a().a(fqj.c, fqs.a(dlw.eu, $$3.toString()));
      })).a(c()));
   }

   private void ao() {
      this.b(cyw.da);
      this.b
         .accept(
            fqf.a(dlw.nx)
               .a(
                  fqg.a(eae.aV, eae.I)
                     .a(1, false, Arrays.asList(a(fqp.a("dead_sea_pickle"))))
                     .a(2, false, Arrays.asList(a(fqp.a("two_dead_sea_pickles"))))
                     .a(3, false, Arrays.asList(a(fqp.a("three_dead_sea_pickles"))))
                     .a(4, false, Arrays.asList(a(fqp.a("four_dead_sea_pickles"))))
                     .a(1, true, Arrays.asList(a(fqp.a("sea_pickle"))))
                     .a(2, true, Arrays.asList(a(fqp.a("two_sea_pickles"))))
                     .a(3, true, Arrays.asList(a(fqp.a("three_sea_pickles"))))
                     .a(4, true, Arrays.asList(a(fqp.a("four_sea_pickles"))))
               )
         );
   }

   private void ap() {
      fqs $$0 = fqs.a(dlw.ea);
      ale $$1 = fqr.c.a(dlw.ec, $$0, this.d);
      this.b.accept(fqf.a(dlw.ea).a(fqg.a(eae.aI).a($$1x -> fqi.a().a(fqj.c, $$1x < 8 ? fqp.a(dlw.ea, "_height" + $$1x * 2) : $$1))));
      this.a(dlw.ea, fqp.a(dlw.ea, "_height2"));
      this.b.accept(c(dlw.ec, $$1));
   }

   private void aq() {
      this.b.accept(fqf.a(dlw.oE, fqi.a().a(fqj.c, fqp.a(dlw.oE))).a(b()));
   }

   private void ar() {
      ale $$0 = fqu.a.create(dlw.pC, this.d);
      this.a(dlw.pC, $$0);
      this.b.accept(fqf.a(dlw.pC).a(fqg.a(eae.bm).a($$0x -> fqi.a().a(fqj.c, this.a(dlw.pC, "_" + $$0x.c(), fqr.c, fqs::b)))));
   }

   private void as() {
      Map<eaz, ale> $$0 = new HashMap<>();

      for (eaz $$1 : eaz.values()) {
         $$0.put($$1, this.a(dlw.pE, "_" + $$1.c(), fqr.c, fqs::b));
      }

      this.b.accept(fqf.a(dlw.pE).a(fqg.a(eae.bF).a($$1x -> fqi.a().a(fqj.c, $$0.get($$1x)))));
      this.c.a(cyw.oV, fqn.a(dui.b, fqn.a($$0.get(eaz.a)), Map.of(eaz.c, fqn.a($$0.get(eaz.c)), eaz.b, fqn.a($$0.get(eaz.b)), eaz.d, fqn.a($$0.get(eaz.d)))));
   }

   private void at() {
      this.b(cyw.xz);
      this.b.accept(fqf.a(dlw.oK).a(fqg.a(eae.av).a($$0 -> fqi.a().a(fqj.c, this.a(dlw.oK, "_stage" + $$0, fqr.ao, fqs::c)))));
   }

   private void au() {
      this.b(cyw.qb);
      this.b
         .accept(
            fqf.a(dlw.gd)
               .a(
                  fqg.a(eae.a, eae.O, eae.N, eae.P, eae.Q)
                     .a(false, false, false, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ns")))
                     .a(false, true, false, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_n")).a(fqj.b, fqj.a.b))
                     .a(false, false, true, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_n")))
                     .a(false, false, false, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_n")).a(fqj.b, fqj.a.c))
                     .a(false, false, false, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_n")).a(fqj.b, fqj.a.d))
                     .a(false, true, true, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ne")))
                     .a(false, true, false, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ne")).a(fqj.b, fqj.a.b))
                     .a(false, false, false, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ne")).a(fqj.b, fqj.a.c))
                     .a(false, false, true, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ne")).a(fqj.b, fqj.a.d))
                     .a(false, false, true, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ns")))
                     .a(false, true, false, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_ns")).a(fqj.b, fqj.a.b))
                     .a(false, true, true, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_nse")))
                     .a(false, true, false, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_nse")).a(fqj.b, fqj.a.b))
                     .a(false, false, true, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_nse")).a(fqj.b, fqj.a.c))
                     .a(false, true, true, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_nse")).a(fqj.b, fqj.a.d))
                     .a(false, true, true, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_nsew")))
                     .a(true, false, false, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ns")))
                     .a(true, false, true, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_n")))
                     .a(true, false, false, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_n")).a(fqj.b, fqj.a.c))
                     .a(true, true, false, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_n")).a(fqj.b, fqj.a.b))
                     .a(true, false, false, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_n")).a(fqj.b, fqj.a.d))
                     .a(true, true, true, false, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ne")))
                     .a(true, true, false, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ne")).a(fqj.b, fqj.a.b))
                     .a(true, false, false, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ne")).a(fqj.b, fqj.a.c))
                     .a(true, false, true, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ne")).a(fqj.b, fqj.a.d))
                     .a(true, false, true, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ns")))
                     .a(true, true, false, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_ns")).a(fqj.b, fqj.a.b))
                     .a(true, true, true, true, false, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_nse")))
                     .a(true, true, false, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_nse")).a(fqj.b, fqj.a.b))
                     .a(true, false, true, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_nse")).a(fqj.b, fqj.a.c))
                     .a(true, true, true, false, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_nse")).a(fqj.b, fqj.a.d))
                     .a(true, true, true, true, true, fqi.a().a(fqj.c, fqp.a(dlw.gd, "_attached_nsew")))
               )
         );
   }

   private void av() {
      this.c(dlw.gc);
      this.b
         .accept(fqf.a(dlw.gc).a(fqg.a(eae.a, eae.A).a(($$0, $$1) -> fqi.a().a(fqj.c, fqs.a(dlw.gc, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(b()));
   }

   private ale a(int $$0, String $$1, fqs $$2) {
      switch ($$0) {
         case 1:
            return fqr.bw.a(fqp.a($$1 + "turtle_egg"), $$2, this.d);
         case 2:
            return fqr.bx.a(fqp.a("two_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 3:
            return fqr.by.a(fqp.a("three_" + $$1 + "turtle_eggs"), $$2, this.d);
         case 4:
            return fqr.bz.a(fqp.a("four_" + $$1 + "turtle_eggs"), $$2, this.d);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private ale a(Integer $$0, Integer $$1) {
      switch ($$1) {
         case 0:
            return this.a($$0.intValue(), "", fqs.b(fqs.J(dlw.mH)));
         case 1:
            return this.a($$0.intValue(), "slightly_cracked_", fqs.b(fqs.a(dlw.mH, "_slightly_cracked")));
         case 2:
            return this.a($$0.intValue(), "very_cracked_", fqs.b(fqs.a(dlw.mH, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void aw() {
      this.b(cyw.kO);
      this.b.accept(fqf.a(dlw.mH).a(fqg.a(eae.aG, eae.aH).b(($$0, $$1) -> Arrays.asList(a(this.a($$0, $$1))))));
   }

   private void ax() {
      this.b(cyw.kP);
      Function<Integer, ale> $$0 = $$0x -> {
         String $$1 = switch ($$0x) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fqs $$2 = fqs.a($$1);
         return fqr.bH.a(dlw.mI, $$1, $$2, this.d);
      };
      this.b.accept(fqf.a(dlw.mI).a(fqg.a(dti.c).a($$1 -> fqi.a().a(fqj.c, $$0.apply($$1)))));
   }

   private void J(dlu $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dlu $$0, cyo $$1) {
      this.b($$1);
      this.K($$0);
   }

   private void K(dlu $$0) {
      ale $$1 = fqp.a($$0);
      fqe $$2 = fqe.a($$0);
      fqd.c $$3 = af.a(fqd.a(), $$1x -> a.stream().<ja>map(Pair::getFirst).map(dqy::b).forEach($$2x -> {
            if ($$0.m().b($$2x)) {
               $$1x.a($$2x, false);
            }
         }));

      for (Pair<ja, Function<ale, fqi>> $$4 : a) {
         eaf $$5 = dqy.b((ja)$$4.getFirst());
         Function<ale, fqi> $$6 = (Function<ale, fqi>)$$4.getSecond();
         if ($$0.m().b($$5)) {
            $$2.a(fqd.a().a($$5, true), $$6.apply($$1));
            $$2.a($$3, $$6.apply($$1));
         }
      }

      this.b.accept($$2);
   }

   private void L(dlu $$0) {
      ale $$1 = fqu.j.create($$0, this.d);
      ale $$2 = fqu.k.get($$0).a($$1x -> $$1x.a(fqt.i, fqs.a($$0, "_side_tall"))).a($$0, "_side_tall", this.d);
      ale $$3 = fqu.k.get($$0).a($$1x -> $$1x.a(fqt.i, fqs.a($$0, "_side_small"))).a($$0, "_side_small", this.d);
      fqe $$4 = fqe.a($$0);
      fqd.c $$5 = fqd.a().a(dqw.b, false);
      $$4.a(fqd.a().a(dqw.b, true), fqi.a().a(fqj.c, $$1));
      $$4.a($$5, fqi.a().a(fqj.c, $$1));
      a.stream().<ja>map(Pair::getFirst).forEach($$2x -> {
         eam<ebb> $$3x = dqw.a($$2x);
         if ($$3x != null && $$0.m().b($$3x)) {
            $$5.a($$3x, ebb.a);
         }
      });

      for (Pair<ja, Function<ale, fqi>> $$6 : a) {
         ja $$7 = (ja)$$6.getFirst();
         eam<ebb> $$8 = dqw.a($$7);
         if ($$8 != null) {
            Function<ale, fqi> $$9 = (Function<ale, fqi>)$$6.getSecond();
            $$4.a(fqd.a().a($$8, ebb.c), $$9.apply($$2));
            $$4.a(fqd.a().a($$8, ebb.b), $$9.apply($$3));
            $$4.a($$5, $$9.apply($$2));
         }
      }

      this.b.accept($$4);
   }

   private void M(dlu $$0) {
      fqg $$1 = fqg.a(dpn.b).a($$1x -> {
         String $$2 = $$1x ? "_tip" : "";
         fqs $$3 = fqs.c(fqs.a($$0, $$2));
         ale $$4 = fpx.d.b.a().a($$0, $$2, $$3, this.d);
         return fqi.a().a(fqj.c, $$4);
      });
      this.c($$0);
      this.b.accept(fqf.a($$0).a($$1));
   }

   private void ay() {
      ale $$0 = fqs.a(dlw.ry, "_bottom");
      fqs $$1 = new fqs().a(fqt.e, $$0).a(fqt.f, fqs.a(dlw.ry, "_top")).a(fqt.i, fqs.a(dlw.ry, "_side"));
      fqs $$2 = new fqs().a(fqt.e, $$0).a(fqt.f, fqs.a(dlw.ry, "_top_bloom")).a(fqt.i, fqs.a(dlw.ry, "_side_bloom"));
      ale $$3 = fqr.n.a(dlw.ry, "", $$1, this.d);
      ale $$4 = fqr.n.a(dlw.ry, "_bloom", $$2, this.d);
      this.b.accept(fqf.a(dlw.ry).a(fqg.a(eae.c).a($$2x -> fqi.a().a(fqj.c, $$2x ? $$4 : $$3))));
      this.a(dlw.ry, $$3);
   }

   private void az() {
      dlu $$0 = dlw.ct;
      ale $$1 = fqp.a($$0);
      fqe $$2 = fqe.a($$0);
      List.of(Pair.of(ja.c, fqj.a.a), Pair.of(ja.f, fqj.a.b), Pair.of(ja.d, fqj.a.c), Pair.of(ja.e, fqj.a.d)).forEach($$2x -> {
         ja $$3 = (ja)$$2x.getFirst();
         fqj.a $$4 = (fqj.a)$$2x.getSecond();
         fqd.c $$5 = fqd.a().a(eae.T, $$3);
         $$2.a($$5, fqi.a().a(fqj.c, $$1).a(fqj.b, $$4).a(fqj.d, true));
         this.a($$2, $$5, $$4);
      });
      this.b.accept($$2);
      this.a($$0, fqp.a($$0, "_inventory"));
      i.clear();
   }

   private void a(fqe $$0, fqd.c $$1, fqj.a $$2) {
      List.of(
            Pair.of(eae.bs, fqr.aT),
            Pair.of(eae.bt, fqr.aU),
            Pair.of(eae.bu, fqr.aV),
            Pair.of(eae.bv, fqr.aW),
            Pair.of(eae.bw, fqr.aX),
            Pair.of(eae.bx, fqr.aY)
         )
         .forEach($$3 -> {
            eaf $$4 = (eaf)$$3.getFirst();
            fqq $$5 = (fqq)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fqe $$0, fqd.c $$1, fqj.a $$2, eaf $$3, fqq $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fqs $$7 = new fqs().a(fqt.b, fqs.a(dlw.ct, $$6));
      fpx.c $$8 = new fpx.c($$4, $$6);
      ale $$9 = i.computeIfAbsent($$8, $$3x -> $$4.a(dlw.ct, $$6, $$7, this.d));
      $$0.a(fqd.a($$1, fqd.a().a($$3, $$5)), fqi.a().a(fqj.c, $$9).a(fqj.b, $$2));
   }

   private void aA() {
      this.b.accept(c(dlw.ll, fqr.c.a(dlw.ll, fqs.b(fqp.a("magma")), this.d)));
   }

   private void a(dlu $$0, @Nullable cxq $$1) {
      this.r($$0);
      cyo $$2 = $$0.h();
      ale $$3 = fqr.bO.a($$2, fqs.x($$0), this.d);
      hep.b $$4 = $$1 != null ? fqn.a($$3, new hhb.a($$1)) : fqn.a($$3, new hhb.a());
      this.c.a($$2, $$4);
   }

   private void c(dlu $$0, dlu $$1, fpx.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void aB() {
      ale $$0 = fqp.a(dlw.b);
      ale $$1 = fqp.a(dlw.b, "_mirrored");
      this.b.accept(a(dlw.fb, $$0, $$1));
      this.a(dlw.fb, $$0);
   }

   private void aC() {
      ale $$0 = fqp.a(dlw.tp);
      ale $$1 = fqp.a(dlw.tp, "_mirrored");
      this.b.accept(a(dlw.tJ, $$0, $$1).a(f()));
      this.a(dlw.tJ, $$0);
   }

   private void n(dlu $$0, dlu $$1) {
      this.a($$0, fpx.d.b);
      fqs $$2 = fqs.d(fqs.a($$0, "_pot"));
      ale $$3 = fpx.d.b.b().a($$1, $$2, this.d);
      this.b.accept(c($$1, $$3));
   }

   private void aD() {
      ale $$0 = fqs.a(dlw.pP, "_bottom");
      ale $$1 = fqs.a(dlw.pP, "_top_off");
      ale $$2 = fqs.a(dlw.pP, "_top");
      ale[] $$3 = new ale[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fqs $$5 = new fqs().a(fqt.e, $$0).a(fqt.f, $$4 == 0 ? $$1 : $$2).a(fqt.i, fqs.a(dlw.pP, "_side" + $$4));
         $$3[$$4] = fqr.n.a(dlw.pP, "_" + $$4, $$5, this.d);
      }

      this.b.accept(fqf.a(dlw.pP).a(fqg.a(eae.bc).a($$1x -> fqi.a().a(fqj.c, $$3[$$1x]))));
      this.a(dlw.pP, $$3[0]);
   }

   private fqi a(jc $$0, fqi $$1) {
      switch ($$0) {
         case b:
            return $$1.a(fqj.a, fqj.a.b);
         case c:
            return $$1.a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.c);
         case d:
            return $$1.a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.d);
         case a:
            return $$1.a(fqj.a, fqj.a.b).a(fqj.b, fqj.a.b);
         case f:
            return $$1.a(fqj.a, fqj.a.d).a(fqj.b, fqj.a.c);
         case g:
            return $$1.a(fqj.a, fqj.a.d);
         case h:
            return $$1.a(fqj.a, fqj.a.d).a(fqj.b, fqj.a.b);
         case e:
            return $$1.a(fqj.a, fqj.a.d).a(fqj.b, fqj.a.d);
         case k:
            return $$1;
         case l:
            return $$1.a(fqj.b, fqj.a.c);
         case i:
            return $$1.a(fqj.b, fqj.a.d);
         case j:
            return $$1.a(fqj.b, fqj.a.b);
         default:
            throw new UnsupportedOperationException("Rotation " + $$0 + " can't be expressed with existing x and y values");
      }
   }

   private void aE() {
      ale $$0 = fqs.a(dlw.pD, "_top");
      ale $$1 = fqs.a(dlw.pD, "_bottom");
      ale $$2 = fqs.a(dlw.pD, "_side");
      ale $$3 = fqs.a(dlw.pD, "_lock");
      fqs $$4 = new fqs().a(fqt.o, $$2).a(fqt.m, $$2).a(fqt.l, $$2).a(fqt.c, $$0).a(fqt.j, $$0).a(fqt.k, $$1).a(fqt.n, $$3);
      ale $$5 = fqr.b.a(dlw.pD, $$4, this.d);
      this.b.accept(fqf.a(dlw.pD, fqi.a().a(fqj.c, $$5)).a(fqg.a(eae.W).a($$0x -> this.a($$0x, fqi.a()))));
   }

   private void aF() {
      dlu $$0 = dlw.n;
      ale $$1 = fqp.a($$0);
      fqu $$2 = fqu.a.get($$0);
      dlu $$3 = dlw.kg;
      ale $$4 = fqr.ab.a($$3, $$2.b(), this.d);
      ale $$5 = fqr.ac.a($$3, $$2.b(), this.d);
      this.b.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dlu $$0, dlu $$1, dtc.a $$2, ale $$3) {
      ale $$4 = fqp.a("skull");
      this.b.accept(c($$0, $$4));
      this.b.accept(c($$1, $$4));
      this.c.a($$0.h(), fqn.a($$3, new hhc.a($$2)));
   }

   private void aG() {
      ale $$0 = fqp.b("template_skull");
      this.a(dlw.hj, dlw.hk, dtc.b.g, $$0);
      this.a(dlw.hh, dlw.hi, dtc.b.e, $$0);
      this.a(dlw.hf, dlw.hg, dtc.b.f, $$0);
      this.a(dlw.hb, dlw.hc, dtc.b.c, $$0);
      this.a(dlw.hd, dlw.he, dtc.b.d, $$0);
      this.a(dlw.hn, dlw.ho, dtc.b.h, $$0);
      this.a(dlw.hl, dlw.hm, dtc.b.i, fqp.a(cyw.vt));
   }

   private void a(dlu $$0, dlu $$1, cxq $$2) {
      ale $$3 = fqp.a("banner");
      ale $$4 = fqp.b("template_banner");
      this.b.accept(c($$0, $$3));
      this.b.accept(c($$1, $$3));
      cyo $$5 = $$0.h();
      this.c.a($$5, fqn.a($$4, new hgt.a($$2)));
   }

   private void aH() {
      this.a(dlw.jh, dlw.jx, cxq.a);
      this.a(dlw.ji, dlw.jy, cxq.b);
      this.a(dlw.jj, dlw.jz, cxq.c);
      this.a(dlw.jk, dlw.jA, cxq.d);
      this.a(dlw.jl, dlw.jB, cxq.e);
      this.a(dlw.jm, dlw.jC, cxq.f);
      this.a(dlw.jn, dlw.jD, cxq.g);
      this.a(dlw.jo, dlw.jE, cxq.h);
      this.a(dlw.jp, dlw.jF, cxq.i);
      this.a(dlw.jq, dlw.jG, cxq.j);
      this.a(dlw.jr, dlw.jH, cxq.k);
      this.a(dlw.js, dlw.jI, cxq.l);
      this.a(dlw.jt, dlw.jJ, cxq.m);
      this.a(dlw.ju, dlw.jK, cxq.n);
      this.a(dlw.jv, dlw.jL, cxq.o);
      this.a(dlw.jw, dlw.jM, cxq.p);
   }

   private void a(dlu $$0, dlu $$1, ale $$2, boolean $$3) {
      this.a($$0, $$1);
      cyo $$4 = $$0.h();
      ale $$5 = fqr.bQ.a($$4, fqs.x($$1), this.d);
      hep.b $$6 = fqn.a($$5, new hgv.a($$2));
      if ($$3) {
         hep.b $$7 = fqn.a($$5, new hgv.a(hgv.a));
         this.c.a($$4, fqn.b($$7, $$6));
      } else {
         this.c.a($$4, $$6);
      }
   }

   private void aI() {
      this.a(dlw.cD, dlw.n, hgv.b, true);
      this.a(dlw.hs, dlw.n, hgv.c, true);
      this.a(dlw.gb, dlw.cv, hgv.d, false);
   }

   private void b(dlu $$0, dlu $$1, cxq $$2) {
      ale $$3 = fqp.a("bed");
      this.b.accept(c($$0, $$3));
      cyo $$4 = $$0.h();
      ale $$5 = fqr.bP.a(fqp.a($$4), fqs.x($$1), this.d);
      this.c.a($$4, fqn.a($$5, new hgu.a($$2)));
   }

   private void aJ() {
      this.b(dlw.bg, dlw.bH, cxq.a);
      this.b(dlw.bh, dlw.bI, cxq.b);
      this.b(dlw.bi, dlw.bJ, cxq.c);
      this.b(dlw.bj, dlw.bK, cxq.d);
      this.b(dlw.bk, dlw.bL, cxq.e);
      this.b(dlw.bl, dlw.bM, cxq.f);
      this.b(dlw.bm, dlw.bN, cxq.g);
      this.b(dlw.bn, dlw.bO, cxq.h);
      this.b(dlw.bo, dlw.bP, cxq.i);
      this.b(dlw.bp, dlw.bQ, cxq.j);
      this.b(dlw.bq, dlw.bR, cxq.k);
      this.b(dlw.br, dlw.bS, cxq.l);
      this.b(dlw.bs, dlw.bT, cxq.m);
      this.b(dlw.bt, dlw.bU, cxq.n);
      this.b(dlw.bu, dlw.bV, cxq.o);
      this.b(dlw.bv, dlw.bW, cxq.p);
   }

   private void a(dlu $$0, hhd.a $$1) {
      cyo $$2 = $$0.h();
      ale $$3 = fqp.a($$2);
      this.c.a($$2, fqn.a($$3, $$1));
   }

   public void a() {
      mi.a().filter(mj::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dlw.rJ).a(mi.x).a(dlw.rJ, dlw.sh).a(dlw.rN, dlw.rR).a(mi.z);
      this.i(dlw.rI).a(mi.B).a(dlw.rI, dlw.sg).a(dlw.rM, dlw.rQ).a(mi.D);
      this.i(dlw.rH).a(mi.F).a(dlw.rH, dlw.sf).a(dlw.rL, dlw.rP).a(mi.H);
      this.i(dlw.rG).a(mi.J).a(dlw.rG, dlw.se).a(dlw.rK, dlw.rO).a(mi.L);
      this.A(dlw.sO);
      this.A(dlw.sP);
      this.A(dlw.sQ);
      this.A(dlw.sR);
      this.j(dlw.sO, dlw.sS);
      this.j(dlw.sP, dlw.sT);
      this.j(dlw.sQ, dlw.sU);
      this.j(dlw.sR, dlw.sV);
      this.n(dlw.a);
      this.d(dlw.nE, dlw.a);
      this.d(dlw.nD, dlw.a);
      this.n(dlw.gj);
      this.n(dlw.ed);
      this.d(dlw.nF, dlw.J);
      this.n(dlw.fV);
      this.n(dlw.mG);
      this.n(dlw.fM);
      this.n(dlw.gm);
      this.b(cyw.vh);
      this.n(dlw.pK);
      this.n(dlw.J);
      this.n(dlw.K);
      this.n(dlw.it);
      this.b(cyw.gj);
      this.o(dlw.qq, dlw.qH);
      this.o(dlw.qr, dlw.qI);
      this.o(dlw.qs, dlw.qJ);
      this.o(dlw.qt, dlw.qK);
      this.o(dlw.qu, dlw.qL);
      this.o(dlw.qv, dlw.qM);
      this.o(dlw.qw, dlw.qN);
      this.o(dlw.qx, dlw.qO);
      this.o(dlw.qy, dlw.qP);
      this.o(dlw.qz, dlw.qQ);
      this.o(dlw.qA, dlw.qR);
      this.o(dlw.qB, dlw.qS);
      this.o(dlw.qC, dlw.qT);
      this.o(dlw.qD, dlw.qU);
      this.o(dlw.qE, dlw.qV);
      this.o(dlw.qF, dlw.qW);
      this.o(dlw.qp, dlw.qG);
      this.n(dlw.nC);
      this.n(dlw.gO);
      this.n(dlw.rt);
      this.n(dlw.tb);
      this.w(dlw.tc);
      this.w(dlw.td);
      this.x(dlw.tO);
      this.x(dlw.tP);
      this.ak();
      this.h(dlw.ti, dlw.te);
      this.L(dlw.ub);
      this.M(dlw.uc);
      this.a(dlw.ua);
      this.t(dlw.tf);
      this.t(dlw.tg);
      this.s(dlw.th);
      this.a(dlw.iu, cyw.ia);
      this.b(cyw.ia);
      this.aK();
      this.a(dlw.lp, cyw.jA);
      this.b(cyw.jA);
      this.f(dlw.bX, fqs.a(dlw.bF, "_side"));
      this.a(dlw.U);
      this.a(dlw.V);
      this.a(dlw.iZ);
      this.a(dlw.cF);
      this.a(dlw.cG);
      this.a(dlw.cH);
      this.a(dlw.fZ);
      this.a(dlw.ga);
      this.a(dlw.ge);
      this.a(dlw.Q);
      this.a(dlw.W);
      this.a(dlw.R);
      this.a(dlw.co);
      this.a(dlw.S);
      this.a(dlw.T);
      this.a(dlw.cp);
      this.b(dlw.pN, fqu.d);
      this.a(dlw.pM);
      this.a(dlw.aY);
      this.a(dlw.aZ);
      this.a(dlw.ba);
      this.a(dlw.fC);
      this.a(dlw.hy);
      this.a(dlw.dV);
      this.a(dlw.dW);
      this.a(dlw.hx);
      this.a(dlw.qg);
      this.a(dlw.ny);
      this.a(dlw.ee);
      this.a(dlw.k);
      this.a(dlw.pO);
      this.a(dlw.fU);
      this.a(dlw.ep);
      this.a(dlw.O);
      this.a(dlw.pL);
      this.a(dlw.eb);
      this.b(dlw.eg, fqu.g);
      this.b(dlw.pU, fqu.d);
      this.b(dlw.fo, fqu.d);
      this.n(dlw.ag);
      this.n(dlw.gw);
      this.a(dlw.lm);
      this.a(dlw.bf);
      this.a(dlw.ja);
      this.a(dlw.cv);
      this.a(dlw.qo);
      this.a(dlw.iG);
      this.a(dlw.pa);
      this.a(dlw.ej);
      this.a(dlw.ek);
      this.b(dlw.cA, fqu.b);
      this.g(dlw.cB);
      this.a(dlw.aV);
      this.b(dlw.bD, fqu.z);
      this.b(cyw.cZ);
      this.b(dlw.cr, fqu.f);
      this.b(dlw.pH, fqu.d);
      this.a(dlw.oR);
      this.a(dlw.aW);
      this.a(dlw.qX);
      this.a(dlw.qY);
      this.a(dlw.rr);
      this.a(dlw.sY);
      this.a(dlw.tL);
      this.a(dlw.tM);
      this.a(dlw.tN);
      this.d(dlw.rw);
      this.n(dlw.tZ);
      this.aF();
      this.a(dlw.rE);
      this.a(dlw.rF);
      this.a(dlw.rA);
      this.a(dlw.rB);
      this.a(dlw.rC);
      this.a(dlw.rD);
      this.l(dlw.rA, dlw.sa);
      this.l(dlw.rB, dlw.sc);
      this.l(dlw.rC, dlw.sb);
      this.l(dlw.rD, dlw.sd);
      this.j(dlw.sq);
      this.j(dlw.sr);
      this.j(dlw.st);
      this.j(dlw.ss);
      this.b(dlw.sq, dlw.su);
      this.b(dlw.sr, dlw.sv);
      this.b(dlw.st, dlw.sx);
      this.b(dlw.ss, dlw.sw);
      this.l(dlw.sy);
      this.l(dlw.sz);
      this.l(dlw.sB);
      this.l(dlw.sA);
      this.c(dlw.sy, dlw.sC);
      this.c(dlw.sz, dlw.sD);
      this.c(dlw.sB, dlw.sF);
      this.c(dlw.sA, dlw.sE);
      this.a(dlw.sG);
      this.a(dlw.sH);
      this.a(dlw.sI);
      this.a(dlw.sJ);
      this.l(dlw.sG, dlw.sK);
      this.l(dlw.sH, dlw.sL);
      this.l(dlw.sI, dlw.sM);
      this.l(dlw.sJ, dlw.sN);
      this.k(dlw.ht, dlw.co);
      this.k(dlw.hu, dlw.cp);
      this.H();
      this.s();
      this.az();
      this.w();
      this.x();
      this.a(dlw.oI, dlw.oJ);
      this.y();
      this.B();
      this.C();
      this.F();
      this.G();
      this.J();
      this.E();
      this.D(dlw.kV);
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
      this.a(dlw.pF);
      this.au();
      this.av();
      this.aw();
      this.ax();
      this.g();
      this.J(dlw.fu);
      this.J(dlw.rx);
      this.b(dlw.fv, cyw.go);
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
      this.I(dlw.cX);
      this.c(dlw.cX);
      this.I(dlw.oC);
      this.h();
      this.I(dlw.tk);
      this.m(dlw.cw, dlw.cx);
      this.m(dlw.en, dlw.eo);
      this.a(dlw.cI, dlw.n, fqs::c);
      this.a(dlw.oA, dlw.p, fqs::d);
      this.C(dlw.oY);
      this.C(dlw.oP);
      this.z(dlw.bb);
      this.z(dlw.hF);
      this.D();
      this.H(dlw.oG);
      this.H(dlw.oH);
      this.e(dlw.fl, fqp.a(dlw.fl));
      this.a(dlw.el, fqu.d);
      this.a(dlw.em, fqu.d);
      this.a(dlw.tK);
      this.a(dlw.lo, fqu.d);
      this.e(dlw.j);
      this.e(dlw.tn);
      this.e(dlw.L);
      this.f(dlw.M);
      this.f(dlw.P);
      this.e(dlw.N);
      this.d(dlw.I);
      this.b(dlw.tU, fqu.f);
      this.a(dlw.iH, fqu.d, fqu.e);
      this.a(dlw.kZ, fqu.A, fqu.B);
      this.a(dlw.hC, fqu.A, fqu.B);
      this.a(dlw.tQ, fqu.d, fqu.e);
      this.a(dlw.tR, fqu.d, fqu.e);
      this.a(dlw.tS, fqu.d, fqu.e);
      this.c(dlw.ov, fqu.i);
      this.A();
      this.a(dlw.pI, fqs::D);
      this.a(dlw.pJ, fqs::F);
      this.a(dlw.lf, eae.av, 0, 1, 2, 3);
      this.a(dlw.gP, eae.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dlw.fL, eae.av, 0, 1, 1, 2);
      this.a(dlw.gQ, eae.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dlw.cJ, eae.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dlw.lc, fpx.d.b, eae.at, 0, 1);
      this.j();
      this.i();
      this.aH();
      this.aJ();
      this.aG();
      this.aI();
      this.a(dlw.lr, null);
      this.a(dlw.ls, cxq.a);
      this.a(dlw.lt, cxq.b);
      this.a(dlw.lu, cxq.c);
      this.a(dlw.lv, cxq.d);
      this.a(dlw.lw, cxq.e);
      this.a(dlw.lx, cxq.f);
      this.a(dlw.ly, cxq.g);
      this.a(dlw.lz, cxq.h);
      this.a(dlw.lA, cxq.i);
      this.a(dlw.lB, cxq.j);
      this.a(dlw.lC, cxq.k);
      this.a(dlw.lD, cxq.l);
      this.a(dlw.lE, cxq.m);
      this.a(dlw.lF, cxq.n);
      this.a(dlw.lG, cxq.o);
      this.a(dlw.lH, cxq.p);
      this.r(dlw.nz);
      this.a(dlw.nz, new hgw.a());
      this.a(dlw.tV, dlw.iY);
      this.a(dlw.tV, new hgx.a());
      this.a(dlw.fS, dlw.cv);
      this.a(dlw.lh, dlw.cv);
      this.a(dlw.aT);
      this.a(dlw.aU);
      this.a(dlw.lY);
      this.a(dlw.lZ);
      this.a(dlw.ma);
      this.a(dlw.mb);
      this.a(dlw.mc);
      this.a(dlw.md);
      this.a(dlw.me);
      this.a(dlw.mf);
      this.a(dlw.mg);
      this.a(dlw.mh);
      this.a(dlw.mi);
      this.a(dlw.mj);
      this.a(dlw.mk);
      this.a(dlw.ml);
      this.a(dlw.mm);
      this.a(dlw.mn);
      this.a(fqu.a, dlw.mo, dlw.mp, dlw.mq, dlw.mr, dlw.ms, dlw.mt, dlw.mu, dlw.mv, dlw.mw, dlw.mx, dlw.my, dlw.mz, dlw.mA, dlw.mB, dlw.mC, dlw.mD);
      this.a(dlw.iY);
      this.a(dlw.hG);
      this.a(dlw.hH);
      this.a(dlw.hI);
      this.a(dlw.hJ);
      this.a(dlw.hK);
      this.a(dlw.hL);
      this.a(dlw.hM);
      this.a(dlw.hN);
      this.a(dlw.hO);
      this.a(dlw.hP);
      this.a(dlw.hQ);
      this.a(dlw.hR);
      this.a(dlw.hS);
      this.a(dlw.hT);
      this.a(dlw.hU);
      this.a(dlw.hV);
      this.a(dlw.rs);
      this.i(dlw.aX, dlw.fm);
      this.i(dlw.ev, dlw.hW);
      this.i(dlw.ew, dlw.hX);
      this.i(dlw.ex, dlw.hY);
      this.i(dlw.ey, dlw.hZ);
      this.i(dlw.ez, dlw.ia);
      this.i(dlw.eA, dlw.ib);
      this.i(dlw.eB, dlw.ic);
      this.i(dlw.eC, dlw.id);
      this.i(dlw.eD, dlw.ie);
      this.i(dlw.eE, dlw.if);
      this.i(dlw.eF, dlw.ig);
      this.i(dlw.eG, dlw.ih);
      this.i(dlw.eH, dlw.ii);
      this.i(dlw.eI, dlw.ij);
      this.i(dlw.eJ, dlw.ik);
      this.i(dlw.eK, dlw.il);
      this.b(fqu.t, dlw.lI, dlw.lJ, dlw.lK, dlw.lL, dlw.lM, dlw.lN, dlw.lO, dlw.lP, dlw.lQ, dlw.lR, dlw.lS, dlw.lT, dlw.lU, dlw.lV, dlw.lW, dlw.lX);
      this.h(dlw.bH, dlw.iI);
      this.h(dlw.bI, dlw.iJ);
      this.h(dlw.bJ, dlw.iK);
      this.h(dlw.bK, dlw.iL);
      this.h(dlw.bL, dlw.iM);
      this.h(dlw.bM, dlw.iN);
      this.h(dlw.bN, dlw.iO);
      this.h(dlw.bO, dlw.iP);
      this.h(dlw.bP, dlw.iQ);
      this.h(dlw.bQ, dlw.iR);
      this.h(dlw.bR, dlw.iS);
      this.h(dlw.bS, dlw.iT);
      this.h(dlw.bT, dlw.iU);
      this.h(dlw.bU, dlw.iV);
      this.h(dlw.bV, dlw.iW);
      this.h(dlw.bW, dlw.iX);
      this.a(dlw.to);
      this.a(dlw.eZ);
      this.b(dlw.bB, dlw.gx, fpx.d.a);
      this.h(dlw.bB);
      this.a(dlw.bY, dlw.gy, fpx.d.b);
      this.a(dlw.ca, dlw.gz, fpx.d.b);
      this.a(dlw.ud, dlw.uf, fpx.d.c);
      this.a(dlw.ue, dlw.ug, fpx.d.b);
      this.a(dlw.cb, dlw.gA, fpx.d.b);
      this.a(dlw.cc, dlw.gB, fpx.d.b);
      this.a(dlw.cd, dlw.gC, fpx.d.b);
      this.a(dlw.ce, dlw.gD, fpx.d.b);
      this.a(dlw.cf, dlw.gE, fpx.d.b);
      this.a(dlw.cg, dlw.gF, fpx.d.b);
      this.a(dlw.ch, dlw.gG, fpx.d.b);
      this.a(dlw.ci, dlw.gH, fpx.d.b);
      this.a(dlw.cj, dlw.gI, fpx.d.b);
      this.a(dlw.cl, dlw.gJ, fpx.d.b);
      this.a(dlw.ck, dlw.gK, fpx.d.b);
      this.a(dlw.cn, dlw.gL, fpx.d.b);
      this.a(dlw.cm, dlw.gM, fpx.d.b);
      this.a(dlw.bC, dlw.gN, fpx.d.b);
      this.a(dlw.bZ, dlw.gn, fpx.d.b);
      this.I();
      this.y(dlw.fh);
      this.y(dlw.fi);
      this.y(dlw.fj);
      this.b(dlw.bA, fpx.d.a);
      this.h(dlw.bA);
      this.b(dlw.ef, fpx.d.a);
      this.b(cyw.dS);
      this.c(dlw.mE, dlw.mF, fpx.d.b);
      this.b(cyw.dT);
      this.b(dlw.tm, fpx.d.b);
      this.c(dlw.pb, dlw.pc, fpx.d.b);
      this.c(dlw.pd, dlw.pe, fpx.d.b);
      this.a(dlw.pb, "_plant");
      this.a(dlw.pd, "_plant");
      this.a(dlw.nA, fpx.d.a, fqs.c(fqs.a(dlw.nB, "_stage0")));
      this.n();
      this.a(dlw.bz, fpx.d.b);
      this.d(dlw.jc, fpx.d.b);
      this.d(dlw.jd, fpx.d.b);
      this.d(dlw.je, fpx.d.b);
      this.o(dlw.jf);
      this.o(dlw.jg);
      this.k();
      this.l();
      this.m();
      this.a(dlw.mY, dlw.mT, dlw.mO, dlw.mJ, dlw.ni, dlw.nd, dlw.ns, dlw.nn);
      this.a(dlw.mZ, dlw.mU, dlw.mP, dlw.mK, dlw.nj, dlw.ne, dlw.nt, dlw.no);
      this.a(dlw.na, dlw.mV, dlw.mQ, dlw.mL, dlw.nk, dlw.nf, dlw.nu, dlw.np);
      this.a(dlw.nb, dlw.mW, dlw.mR, dlw.mM, dlw.nl, dlw.ng, dlw.nv, dlw.nq);
      this.a(dlw.nc, dlw.mX, dlw.mS, dlw.mN, dlw.nm, dlw.nh, dlw.nw, dlw.nr);
      this.f(dlw.fs, dlw.fq);
      this.f(dlw.fr, dlw.fp);
      this.m(dlw.af).c(dlw.af).a(dlw.aA);
      this.m(dlw.ar).c(dlw.ar).a(dlw.aJ);
      this.a(dlw.ar, dlw.du, dlw.dE);
      this.a(dlw.aS, fqu.w, -7158200);
      this.m(dlw.ab).c(dlw.ab).a(dlw.ax);
      this.m(dlw.am).c(dlw.am).a(dlw.aF);
      this.a(dlw.am, dlw.dn, dlw.dz);
      this.a(dlw.D, dlw.gs, fpx.d.b);
      this.a(dlw.aO, fqu.w, -12012264);
      this.m(dlw.ac).d(dlw.ac).a(dlw.ay);
      this.m(dlw.an).d(dlw.an).a(dlw.aG);
      this.a(dlw.an, dlw.do, dlw.dA);
      this.a(dlw.E, dlw.gt, fpx.d.b);
      this.b(dlw.aP, fqu.w);
      this.m(dlw.Z).c(dlw.Z).a(dlw.av);
      this.m(dlw.ak).c(dlw.ak).a(dlw.aD);
      this.a(dlw.ak, dlw.dm, dlw.dy);
      this.a(dlw.B, dlw.gq, fpx.d.b);
      this.a(dlw.aM, fqu.w, -8345771);
      this.m(dlw.X).c(dlw.X).a(dlw.at);
      this.m(dlw.aq).c(dlw.aq).a(dlw.aB);
      this.a(dlw.aq, dlw.dk, dlw.dw);
      this.a(dlw.z, dlw.go, fpx.d.b);
      this.a(dlw.aK, fqu.w, -12012264);
      this.m(dlw.Y).c(dlw.Y).a(dlw.au);
      this.m(dlw.aj).c(dlw.aj).a(dlw.aC);
      this.a(dlw.aj, dlw.dl, dlw.dx);
      this.a(dlw.A, dlw.gp, fpx.d.b);
      this.a(dlw.aL, fqu.w, -10380959);
      this.m(dlw.ad).c(dlw.ad).a(dlw.az);
      this.m(dlw.ao).c(dlw.ao).a(dlw.aH);
      this.a(dlw.ao, dlw.dq, dlw.dC);
      this.a(dlw.F, dlw.gu, fpx.d.b);
      this.a(dlw.aQ, fqu.w, -12012264);
      this.m(dlw.ae).c(dlw.ae).a(dlw.u);
      this.m(dlw.ap).c(dlw.ap).a(dlw.aI);
      this.a(dlw.ap, dlw.dr, dlw.dD);
      this.a(dlw.G, dlw.gv, fpx.d.b);
      this.b(dlw.aR, fqu.w);
      this.m(dlw.aa).c(dlw.aa).a(dlw.aw);
      this.m(dlw.al).c(dlw.al).a(dlw.aE);
      this.a(dlw.al, dlw.dp, dlw.dB);
      this.a(dlw.C, dlw.gr, fpx.d.b);
      this.a(dlw.aN, fqu.w, -12012264);
      this.m(dlw.oU).b(dlw.oU).a(dlw.oW);
      this.m(dlw.oV).b(dlw.oV).a(dlw.oX);
      this.a(dlw.oV, dlw.ds, dlw.dF);
      this.a(dlw.oZ, dlw.pQ, fpx.d.b);
      this.n(dlw.pf, dlw.pS);
      this.m(dlw.oL).b(dlw.oL).a(dlw.oN);
      this.m(dlw.oM).b(dlw.oM).a(dlw.oO);
      this.a(dlw.oM, dlw.dt, dlw.dG);
      this.a(dlw.oQ, dlw.pR, fpx.d.b);
      this.n(dlw.oS, dlw.pT);
      this.m(dlw.ai).d(dlw.ai);
      this.m(dlw.as).d(dlw.as);
      this.a(dlw.x, dlw.dv, dlw.dH);
      this.b(dlw.oT, fpx.d.b);
      this.b(cyw.dP);
      this.j(dlw.dK);
      this.l(dlw.iw);
      this.v();
      this.p(dlw.cY);
      this.q(dlw.bw);
      this.q(dlw.bx);
      this.q(dlw.hE);
      this.u();
      this.u(dlw.gi);
      this.u(dlw.li);
      this.u(dlw.lj);
      this.v(dlw.hp);
      this.v(dlw.hq);
      this.v(dlw.hr);
      this.p();
      this.q();
      this.d(dlw.cL, fqu.h);
      this.d(dlw.oy, fqu.h);
      this.d(dlw.ox, fqu.i);
      this.t();
      this.aD();
      this.ay();
      this.l(dlw.eY, dlw.fg);
      this.l(dlw.m, dlw.fc);
      this.l(dlw.eX, dlw.ff);
      this.l(dlw.eW, dlw.fe);
      this.aB();
      this.l(dlw.eV, dlw.fd);
      this.aC();
   }

   private void aK() {
      hep.b $$0 = fqn.a(this.a(cyw.ib));
      Map<Integer, hep.b> $$1 = new HashMap<>(16);
      fqg.a<Integer> $$2 = fqg.a(eae.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         ale $$5 = fqs.a(cyw.ib, $$4);
         $$2.a($$3, fqi.a().a(fqj.c, fqr.aa.a(dlw.iv, $$4, fqs.h($$5), this.d)));
         hep.b $$6 = fqn.a(fqr.bI.a(fqp.a(cyw.ib, $$4), fqs.k($$5), this.d));
         $$1.put($$3, $$6);
      }

      this.c.a(cyw.ib, fqn.a(dqm.c, $$0, $$1));
      this.b.accept(fqf.a(dlw.iv).a($$2));
   }

   private void o(dlu $$0, dlu $$1) {
      this.b($$0.h());
      fqs $$2 = fqs.b(fqs.J($$0));
      fqs $$3 = fqs.b(fqs.a($$0, "_lit"));
      ale $$4 = fqr.bV.a($$0, "_one_candle", $$2, this.d);
      ale $$5 = fqr.bW.a($$0, "_two_candles", $$2, this.d);
      ale $$6 = fqr.bX.a($$0, "_three_candles", $$2, this.d);
      ale $$7 = fqr.bY.a($$0, "_four_candles", $$2, this.d);
      ale $$8 = fqr.bV.a($$0, "_one_candle_lit", $$3, this.d);
      ale $$9 = fqr.bW.a($$0, "_two_candles_lit", $$3, this.d);
      ale $$10 = fqr.bX.a($$0, "_three_candles_lit", $$3, this.d);
      ale $$11 = fqr.bY.a($$0, "_four_candles_lit", $$3, this.d);
      this.b
         .accept(
            fqf.a($$0)
               .a(
                  fqg.a(eae.aC, eae.u)
                     .a(1, false, fqi.a().a(fqj.c, $$4))
                     .a(2, false, fqi.a().a(fqj.c, $$5))
                     .a(3, false, fqi.a().a(fqj.c, $$6))
                     .a(4, false, fqi.a().a(fqj.c, $$7))
                     .a(1, true, fqi.a().a(fqj.c, $$8))
                     .a(2, true, fqi.a().a(fqj.c, $$9))
                     .a(3, true, fqi.a().a(fqj.c, $$10))
                     .a(4, true, fqi.a().a(fqj.c, $$11))
               )
         );
      ale $$12 = fqr.bZ.a($$1, fqs.a($$0, false), this.d);
      ale $$13 = fqr.bZ.a($$1, "_lit", fqs.a($$0, true), this.d);
      this.b.accept(fqf.a($$1).a(a(eae.u, $$13, $$12)));
   }

   class a {
      private final fqs b;
      private final Map<fqq, ale> c = Maps.newHashMap();
      @Nullable
      private mj d;
      @Nullable
      private ale e;
      private final Set<dlu> f = new HashSet<>();

      public a(final fqs $$0) {
         this.b = $$0;
      }

      public fpx.a a(dlu $$0, fqq $$1) {
         this.e = $$1.a($$0, this.b, fpx.this.d);
         if (fpx.this.f.containsKey($$0)) {
            fpx.this.b.accept(fpx.this.f.get($$0).create($$0, this.e, this.b, fpx.this.d));
         } else {
            fpx.this.b.accept(fpx.c($$0, this.e));
         }

         return this;
      }

      public fpx.a a(dlu $$0, dlu $$1) {
         ale $$2 = fqp.a($$0);
         fpx.this.b.accept(fpx.c($$1, $$2));
         fpx.this.c.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fpx.a a(dlu $$0) {
         ale $$1 = fqr.s.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.t.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.b($$0, $$1, $$2));
         ale $$3 = fqr.u.a($$0, this.b, fpx.this.d);
         fpx.this.a($$0, $$3);
         return this;
      }

      public fpx.a b(dlu $$0) {
         ale $$1 = fqr.M.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.N.a($$0, this.b, fpx.this.d);
         ale $$3 = fqr.O.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.a($$0, $$1, $$2, $$3));
         ale $$4 = fqr.P.a($$0, this.b, fpx.this.d);
         fpx.this.a($$0, $$4);
         return this;
      }

      public fpx.a c(dlu $$0) {
         fqs $$1 = fqs.s($$0);
         ale $$2 = fqr.D.a($$0, $$1, fpx.this.d);
         ale $$3 = fqr.E.a($$0, $$1, fpx.this.d);
         ale $$4 = fqr.F.a($$0, $$1, fpx.this.d);
         ale $$5 = fqr.G.a($$0, $$1, fpx.this.d);
         ale $$6 = fqr.H.a($$0, $$1, fpx.this.d);
         fpx.this.b.accept(fpx.a($$0, $$2, $$3, $$4, $$5, $$6));
         ale $$7 = fqr.I.a($$0, $$1, fpx.this.d);
         fpx.this.a($$0, $$7);
         return this;
      }

      public fpx.a d(dlu $$0) {
         ale $$1 = fqr.J.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.K.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.c($$0, $$1, $$2));
         ale $$3 = fqr.L.a($$0, this.b, fpx.this.d);
         fpx.this.a($$0, $$3);
         return this;
      }

      public fpx.a e(dlu $$0) {
         fqs $$1 = fqs.s($$0);
         ale $$2 = fqr.R.a($$0, $$1, fpx.this.d);
         ale $$3 = fqr.Q.a($$0, $$1, fpx.this.d);
         ale $$4 = fqr.T.a($$0, $$1, fpx.this.d);
         ale $$5 = fqr.S.a($$0, $$1, fpx.this.d);
         fpx.this.b.accept(fpx.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fpx.a f(dlu $$0) {
         ale $$1 = fqr.V.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.U.a($$0, this.b, fpx.this.d);
         ale $$3 = fqr.X.a($$0, this.b, fpx.this.d);
         ale $$4 = fqr.W.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fpx.a g(dlu $$0) {
         ale $$1 = fqr.Y.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.Z.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.e($$0, $$1, $$2));
         return this;
      }

      public fpx.a h(dlu $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dlu $$1 = this.d.b().get(mj.b.r);
            ale $$2 = fqr.aa.a($$0, this.b, fpx.this.d);
            fpx.this.b.accept(fpx.c($$0, $$2));
            fpx.this.b.accept(fpx.c($$1, $$2));
            fpx.this.b($$0.h());
            return this;
         }
      }

      public fpx.a i(dlu $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ale $$1 = this.a(fqr.ab, $$0);
            ale $$2 = this.a(fqr.ac, $$0);
            fpx.this.b.accept(fpx.e($$0, $$1, $$2, this.e));
            fpx.this.a($$0, $$1);
            return this;
         }
      }

      public fpx.a j(dlu $$0) {
         ale $$1 = this.a(fqr.af, $$0);
         ale $$2 = this.a(fqr.ae, $$0);
         ale $$3 = this.a(fqr.ag, $$0);
         fpx.this.b.accept(fpx.b($$0, $$1, $$2, $$3));
         fpx.this.a($$0, $$2);
         return this;
      }

      private fpx.a k(dlu $$0) {
         fqu $$1 = fpx.this.g.getOrDefault($$0, fqu.a.get($$0));
         ale $$2 = $$1.a($$0, fpx.this.d);
         fpx.this.b.accept(fpx.c($$0, $$2));
         return this;
      }

      private fpx.a l(dlu $$0) {
         fpx.this.j($$0);
         return this;
      }

      private void m(dlu $$0) {
         if (fpx.this.e.contains($$0)) {
            fpx.this.l($$0);
         } else {
            fpx.this.k($$0);
         }
      }

      private ale a(fqq $$0, dlu $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fpx.this.d));
      }

      public fpx.a a(mj $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fpx.a, dlu> $$2 = fpx.h.get($$0x);
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
      fqc create(dlu var1, ale var2, fqs var3, BiConsumer<ale, fqo> var4);
   }

   static record c(fqq a, String b) {
   }

   static enum d {
      a(fqr.ap, fqr.as, false),
      b(fqr.ao, fqr.ar, false),
      c(fqr.aq, fqr.at, true);

      private final fqq d;
      private final fqq e;
      private final boolean f;

      private d(final fqq $$0, final fqq $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fqq a() {
         return this.d;
      }

      public fqq b() {
         return this.e;
      }

      public ale a(fpx $$0, dlu $$1) {
         cyo $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fqs a(dlu $$0) {
         return this.f ? fqs.e($$0) : fqs.c($$0);
      }

      public fqs b(dlu $$0) {
         return this.f ? fqs.g($$0) : fqs.f($$0);
      }
   }

   class e {
      private final fqs b;

      public e(final fqs $$0) {
         this.b = $$0;
      }

      public fpx.e a(dlu $$0) {
         fqs $$1 = this.b.c(fqt.d, this.b.a(fqt.i));
         ale $$2 = fqr.j.a($$0, $$1, fpx.this.d);
         fpx.this.b.accept(fpx.d($$0, $$2));
         return this;
      }

      public fpx.e b(dlu $$0) {
         ale $$1 = fqr.j.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.d($$0, $$1));
         return this;
      }

      public fpx.e c(dlu $$0) {
         ale $$1 = fqr.j.a($$0, this.b, fpx.this.d);
         ale $$2 = fqr.k.a($$0, this.b, fpx.this.d);
         fpx.this.b.accept(fpx.d($$0, $$1, $$2));
         return this;
      }

      public fpx.e d(dlu $$0) {
         fpx.this.b.accept(fpx.a($$0, this.b, fpx.this.d));
         return this;
      }
   }
}
