import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
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
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class frf {
   final Consumer<frk> j;
   final fri k;
   final BiConsumer<alg, frt> l;
   static final List<dmm> m = List.of(dmo.eP, dmo.eV, dmo.iA);
   public static final gsi a = $$0 -> $$0;
   public static final gsi b = gsi.d.withValue(true);
   public static final gsi c = gsi.a.withValue(i.b);
   public static final gsi d = gsi.a.withValue(i.c);
   public static final gsi e = gsi.a.withValue(i.d);
   public static final gsi f = gsi.b.withValue(i.b);
   public static final gsi g = gsi.b.withValue(i.c);
   public static final gsi h = gsi.b.withValue(i.d);
   public static final gsi i = gsi.e.withValue(2);
   static final Map<dmm, frf.b> n = Map.of(dmo.b, frf::a, dmo.tt, frf::c, dmo.fe, frf::b);
   private static final fro<gsi> o = fro.b(ebe.R).a(jb.a, c).a(jb.b, e).a(jb.c, a).a(jb.d, g).a(jb.e, h).a(jb.f, f);
   private static final fro<gsi> p = fro.b(ebe.R).a(jb.a, d).a(jb.b, a).a(jb.c, c).a(jb.d, c.then(g)).a(jb.e, c.then(h)).a(jb.f, c.then(f));
   private static final fro<gsi> q = fro.b(ebe.T).a(jb.f, a).a(jb.d, f).a(jb.e, g).a(jb.c, h);
   private static final fro<gsi> r = fro.b(ebe.T).a(jb.d, a).a(jb.e, f).a(jb.c, g).a(jb.f, h);
   private static final fro<gsi> s = fro.b(ebe.T).a(jb.f, f).a(jb.d, g).a(jb.e, h).a(jb.c, a);
   static final Map<dmm, frz> t = ImmutableMap.builder()
      .put(dmo.bc, frz.C.get(dmo.bc))
      .put(dmo.jR, frz.C.get(dmo.jR))
      .put(dmo.kv, frz.a(frx.a(dmo.bc, "_top")))
      .put(dmo.kx, frz.a(frx.a(dmo.jR, "_top")))
      .put(dmo.be, frz.d.get(dmo.bc).a($$0 -> $$0.a(fry.i, frx.J(dmo.be))))
      .put(dmo.jT, frz.d.get(dmo.jR).a($$0 -> $$0.a(fry.i, frx.J(dmo.jT))))
      .put(dmo.hE, frz.d.get(dmo.hE))
      .put(dmo.kw, frz.a(frx.a(dmo.hE, "_bottom")))
      .put(dmo.pZ, frz.D.get(dmo.pZ))
      .put(dmo.tt, frz.D.get(dmo.tt))
      .put(dmo.hF, frz.d.get(dmo.hF).a($$0 -> $$0.a(fry.i, frx.J(dmo.hF))))
      .put(dmo.bd, frz.d.get(dmo.bd).a($$0 -> {
         $$0.a(fry.d, frx.a(dmo.bc, "_top"));
         $$0.a(fry.i, frx.J(dmo.bd));
      }))
      .put(dmo.jS, frz.d.get(dmo.jS).a($$0 -> {
         $$0.a(fry.d, frx.a(dmo.jR, "_top"));
         $$0.a(fry.i, frx.J(dmo.jS));
      }))
      .put(dmo.ru, frz.D.get(dmo.ru))
      .put(dmo.rp, frz.D.get(dmo.rp))
      .build();
   static final Map<mk.b, BiConsumer<frf.a, dmm>> u = ImmutableMap.builder()
      .put(mk.b.a, frf.a::a)
      .put(mk.b.e, frf.a::l)
      .put(mk.b.b, frf.a::k)
      .put(mk.b.c, frf.a::k)
      .put(mk.b.f, frf.a::c)
      .put(mk.b.g, frf.a::d)
      .put(mk.b.h, frf.a::e)
      .put(mk.b.i, frf.a::f)
      .put(mk.b.k, frf.a::h)
      .put(mk.b.l, frf.a::i)
      .put(mk.b.m, frf.a::j)
      .put(mk.b.n, frf.a::g)
      .put(mk.b.p, frf.a::m)
      .put(mk.b.q, frf.a::b)
      .build();
   private static final Map<jb, gsi> v = ImmutableMap.of(jb.c, a, jb.f, f.then(b), jb.d, g.then(b), jb.e, h.then(b), jb.b, e.then(b), jb.a, c.then(b));
   private static final Map<frf.c, alg> w = new HashMap<>();

   static gsh a(alg $$0) {
      return new gsh($$0);
   }

   static gsd a(gsh $$0) {
      return new gsd(List.of($$0));
   }

   private static gsd a(gsh... $$0) {
      return new gsd(List.of($$0));
   }

   static gsd b(alg $$0) {
      return a(a($$0));
   }

   private static frl b() {
      return new frl();
   }

   private static gsl a(frl... $$0) {
      return new gsk(gsk.a.b, Stream.of($$0).map(frl::a).toList());
   }

   private static frk a(dmm $$0, gsh $$1, frx $$2, BiConsumer<alg, frt> $$3) {
      gsh $$4 = a(frw.e.a($$0, $$2, $$3));
      return frn.a($$0, a($$1, $$4));
   }

   private static frk b(dmm $$0, gsh $$1, frx $$2, BiConsumer<alg, frt> $$3) {
      gsd $$4 = b(frw.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static frk c(dmm $$0, gsh $$1, frx $$2, BiConsumer<alg, frt> $$3) {
      gsh $$4 = a(frw.l.a($$0, $$2, $$3));
      return frn.a($$0, a($$1, $$4)).a(c());
   }

   public frf(Consumer<frk> $$0, fri $$1, BiConsumer<alg, frt> $$2) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   private void a(czg $$0, alg $$1) {
      this.k.a($$0, frs.a($$1));
   }

   void a(dmm $$0, alg $$1) {
      this.k.a($$0.h(), frs.a($$1));
   }

   private void a(dmm $$0, alg $$1, fqy $$2) {
      this.k.a($$0.h(), frs.a($$1, $$2));
   }

   private alg a(czg $$0) {
      return frw.bI.a(fru.a($$0), frx.b($$0), this.l);
   }

   alg a(czg $$0, dmm $$1) {
      return frw.bI.a(fru.a($$0), frx.I($$1), this.l);
   }

   private alg a(czg $$0, dmm $$1, String $$2) {
      return frw.bI.a(fru.a($$0), frx.k(frx.a($$1, $$2)), this.l);
   }

   alg b(czg $$0, dmm $$1, String $$2) {
      alg $$3 = frx.J($$1);
      alg $$4 = frx.a($$1, $$2);
      return frw.bM.a(fru.a($$0), frx.c($$3, $$4), this.l);
   }

   void b(czg $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dmm $$0) {
      czg $$1 = $$0.h();
      if ($$1 != czo.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dmm $$0, String $$1) {
      czg $$2 = $$0.h();
      if ($$2 != czo.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dmm $$0, String $$1) {
      czg $$2 = $$0.h();
      if ($$2 != czo.a) {
         alg $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static gsd b(gsh $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static gsd a(gsh $$0, gsh $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static fro<gsd> a(ebf $$0, gsd $$1, gsd $$2) {
      return fro.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dmm $$0) {
      gsh $$1 = a(frz.a.create($$0, this.l));
      gsh $$2 = a(frz.c.create($$0, this.l));
      this.j.accept(frn.a($$0, a($$1, $$2)));
   }

   private void e(dmm $$0) {
      gsh $$1 = a(frz.a.create($$0, this.l));
      this.j.accept(frn.a($$0, b($$1)));
   }

   private void f(dmm $$0) {
      this.j.accept(frn.a($$0).a(fro.a(ebe.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alg $$3 = frx.a($$0, $$2);
         alg $$4 = frw.c.a($$0, $$2, new frx().a(fry.a, $$3), this.l);
         return b($$4);
      })));
      this.a($$0, fru.a($$0, "_0"));
   }

   static frk a(dmm $$0, gsd $$1, gsd $$2) {
      return frn.a($$0)
         .a(fro.a(ebe.A).a(false, $$1).a(true, $$2))
         .a(
            fro.b(ebe.X, ebe.T)
               .a(eaz.a, jb.f, f)
               .a(eaz.a, jb.e, h)
               .a(eaz.a, jb.d, g)
               .a(eaz.a, jb.c, a)
               .a(eaz.b, jb.f, f.then(c).then(b))
               .a(eaz.b, jb.e, h.then(c).then(b))
               .a(eaz.b, jb.d, g.then(c).then(b))
               .a(eaz.b, jb.c, c.then(b))
               .a(eaz.c, jb.f, h.then(d))
               .a(eaz.c, jb.e, f.then(d))
               .a(eaz.c, jb.d, d)
               .a(eaz.c, jb.c, g.then(d))
         );
   }

   private static frk a(dmm $$0, gsd $$1, gsd $$2, gsd $$3, gsd $$4, gsd $$5, gsd $$6, gsd $$7, gsd $$8) {
      return frn.a($$0)
         .a(
            fro.a(ebe.T, ebe.ah, ebe.bh, ebe.y)
               .a(jb.f, ebk.b, ebj.a, false, $$1)
               .a(jb.d, ebk.b, ebj.a, false, $$1.a(f))
               .a(jb.e, ebk.b, ebj.a, false, $$1.a(g))
               .a(jb.c, ebk.b, ebj.a, false, $$1.a(h))
               .a(jb.f, ebk.b, ebj.b, false, $$3)
               .a(jb.d, ebk.b, ebj.b, false, $$3.a(f))
               .a(jb.e, ebk.b, ebj.b, false, $$3.a(g))
               .a(jb.c, ebk.b, ebj.b, false, $$3.a(h))
               .a(jb.f, ebk.b, ebj.a, true, $$2.a(f))
               .a(jb.d, ebk.b, ebj.a, true, $$2.a(g))
               .a(jb.e, ebk.b, ebj.a, true, $$2.a(h))
               .a(jb.c, ebk.b, ebj.a, true, $$2)
               .a(jb.f, ebk.b, ebj.b, true, $$4.a(h))
               .a(jb.d, ebk.b, ebj.b, true, $$4)
               .a(jb.e, ebk.b, ebj.b, true, $$4.a(f))
               .a(jb.c, ebk.b, ebj.b, true, $$4.a(g))
               .a(jb.f, ebk.a, ebj.a, false, $$5)
               .a(jb.d, ebk.a, ebj.a, false, $$5.a(f))
               .a(jb.e, ebk.a, ebj.a, false, $$5.a(g))
               .a(jb.c, ebk.a, ebj.a, false, $$5.a(h))
               .a(jb.f, ebk.a, ebj.b, false, $$7)
               .a(jb.d, ebk.a, ebj.b, false, $$7.a(f))
               .a(jb.e, ebk.a, ebj.b, false, $$7.a(g))
               .a(jb.c, ebk.a, ebj.b, false, $$7.a(h))
               .a(jb.f, ebk.a, ebj.a, true, $$6.a(f))
               .a(jb.d, ebk.a, ebj.a, true, $$6.a(g))
               .a(jb.e, ebk.a, ebj.a, true, $$6.a(h))
               .a(jb.c, ebk.a, ebj.a, true, $$6)
               .a(jb.f, ebk.a, ebj.b, true, $$8.a(h))
               .a(jb.d, ebk.a, ebj.b, true, $$8)
               .a(jb.e, ebk.a, ebj.b, true, $$8.a(f))
               .a(jb.c, ebk.a, ebj.b, true, $$8.a(g))
         );
   }

   static frk a(dmm $$0, gsd $$1, gsd $$2, gsd $$3, gsd $$4, gsd $$5) {
      return frm.a($$0).a($$1).a(b().a(ebe.N, true), $$2).a(b().a(ebe.O, true), $$3).a(b().a(ebe.P, true), $$4).a(b().a(ebe.Q, true), $$5);
   }

   static frk b(dmm $$0, gsd $$1, gsd $$2) {
      return frm.a($$0)
         .a($$1)
         .a(b().a(ebe.N, true), $$2.a(b))
         .a(b().a(ebe.O, true), $$2.a(f).a(b))
         .a(b().a(ebe.P, true), $$2.a(g).a(b))
         .a(b().a(ebe.Q, true), $$2.a(h).a(b));
   }

   static frk a(dmm $$0, gsd $$1, gsd $$2, gsd $$3) {
      return frm.a($$0)
         .a(b().a(ebe.L, true), $$1)
         .a(b().a(ebe.aa, ecb.b), $$2.a(b))
         .a(b().a(ebe.Z, ecb.b), $$2.a(f).a(b))
         .a(b().a(ebe.ab, ecb.b), $$2.a(g).a(b))
         .a(b().a(ebe.ac, ecb.b), $$2.a(h).a(b))
         .a(b().a(ebe.aa, ecb.c), $$3.a(b))
         .a(b().a(ebe.Z, ecb.c), $$3.a(f).a(b))
         .a(b().a(ebe.ab, ecb.c), $$3.a(g).a(b))
         .a(b().a(ebe.ac, ecb.c), $$3.a(h).a(b));
   }

   static frk a(dmm $$0, gsd $$1, gsd $$2, gsd $$3, gsd $$4, boolean $$5) {
      return frn.a($$0).a(fro.a(ebe.t, ebe.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(r);
   }

   static frk b(dmm $$0, gsd $$1, gsd $$2, gsd $$3) {
      return frn.a($$0)
         .a(
            fro.a(ebe.T, ebe.ai, ebe.bl)
               .a(jb.f, ebn.b, ebx.a, $$2)
               .a(jb.e, ebn.b, ebx.a, $$2.a(g).a(b))
               .a(jb.d, ebn.b, ebx.a, $$2.a(f).a(b))
               .a(jb.c, ebn.b, ebx.a, $$2.a(h).a(b))
               .a(jb.f, ebn.b, ebx.e, $$3)
               .a(jb.e, ebn.b, ebx.e, $$3.a(g).a(b))
               .a(jb.d, ebn.b, ebx.e, $$3.a(f).a(b))
               .a(jb.c, ebn.b, ebx.e, $$3.a(h).a(b))
               .a(jb.f, ebn.b, ebx.d, $$3.a(h).a(b))
               .a(jb.e, ebn.b, ebx.d, $$3.a(f).a(b))
               .a(jb.d, ebn.b, ebx.d, $$3)
               .a(jb.c, ebn.b, ebx.d, $$3.a(g).a(b))
               .a(jb.f, ebn.b, ebx.c, $$1)
               .a(jb.e, ebn.b, ebx.c, $$1.a(g).a(b))
               .a(jb.d, ebn.b, ebx.c, $$1.a(f).a(b))
               .a(jb.c, ebn.b, ebx.c, $$1.a(h).a(b))
               .a(jb.f, ebn.b, ebx.b, $$1.a(h).a(b))
               .a(jb.e, ebn.b, ebx.b, $$1.a(f).a(b))
               .a(jb.d, ebn.b, ebx.b, $$1)
               .a(jb.c, ebn.b, ebx.b, $$1.a(g).a(b))
               .a(jb.f, ebn.a, ebx.a, $$2.a(d).a(b))
               .a(jb.e, ebn.a, ebx.a, $$2.a(d).a(g).a(b))
               .a(jb.d, ebn.a, ebx.a, $$2.a(d).a(f).a(b))
               .a(jb.c, ebn.a, ebx.a, $$2.a(d).a(h).a(b))
               .a(jb.f, ebn.a, ebx.e, $$3.a(d).a(f).a(b))
               .a(jb.e, ebn.a, ebx.e, $$3.a(d).a(h).a(b))
               .a(jb.d, ebn.a, ebx.e, $$3.a(d).a(g).a(b))
               .a(jb.c, ebn.a, ebx.e, $$3.a(d).a(b))
               .a(jb.f, ebn.a, ebx.d, $$3.a(d).a(b))
               .a(jb.e, ebn.a, ebx.d, $$3.a(d).a(g).a(b))
               .a(jb.d, ebn.a, ebx.d, $$3.a(d).a(f).a(b))
               .a(jb.c, ebn.a, ebx.d, $$3.a(d).a(h).a(b))
               .a(jb.f, ebn.a, ebx.c, $$1.a(d).a(f).a(b))
               .a(jb.e, ebn.a, ebx.c, $$1.a(d).a(h).a(b))
               .a(jb.d, ebn.a, ebx.c, $$1.a(d).a(g).a(b))
               .a(jb.c, ebn.a, ebx.c, $$1.a(d).a(b))
               .a(jb.f, ebn.a, ebx.b, $$1.a(d).a(b))
               .a(jb.e, ebn.a, ebx.b, $$1.a(d).a(g).a(b))
               .a(jb.d, ebn.a, ebx.b, $$1.a(d).a(f).a(b))
               .a(jb.c, ebn.a, ebx.b, $$1.a(d).a(h).a(b))
         );
   }

   private static frk c(dmm $$0, gsd $$1, gsd $$2, gsd $$3) {
      return frn.a($$0)
         .a(
            fro.a(ebe.T, ebe.ai, ebe.y)
               .a(jb.c, ebn.b, false, $$2)
               .a(jb.d, ebn.b, false, $$2.a(g))
               .a(jb.f, ebn.b, false, $$2.a(f))
               .a(jb.e, ebn.b, false, $$2.a(h))
               .a(jb.c, ebn.a, false, $$1)
               .a(jb.d, ebn.a, false, $$1.a(g))
               .a(jb.f, ebn.a, false, $$1.a(f))
               .a(jb.e, ebn.a, false, $$1.a(h))
               .a(jb.c, ebn.b, true, $$3)
               .a(jb.d, ebn.b, true, $$3.a(g))
               .a(jb.f, ebn.b, true, $$3.a(f))
               .a(jb.e, ebn.b, true, $$3.a(h))
               .a(jb.c, ebn.a, true, $$3.a(d).a(g))
               .a(jb.d, ebn.a, true, $$3.a(d))
               .a(jb.f, ebn.a, true, $$3.a(d).a(h))
               .a(jb.e, ebn.a, true, $$3.a(d).a(f))
         );
   }

   private static frk d(dmm $$0, gsd $$1, gsd $$2, gsd $$3) {
      return frn.a($$0)
         .a(
            fro.a(ebe.T, ebe.ai, ebe.y)
               .a(jb.c, ebn.b, false, $$2)
               .a(jb.d, ebn.b, false, $$2)
               .a(jb.f, ebn.b, false, $$2)
               .a(jb.e, ebn.b, false, $$2)
               .a(jb.c, ebn.a, false, $$1)
               .a(jb.d, ebn.a, false, $$1)
               .a(jb.f, ebn.a, false, $$1)
               .a(jb.e, ebn.a, false, $$1)
               .a(jb.c, ebn.b, true, $$3)
               .a(jb.d, ebn.b, true, $$3.a(g))
               .a(jb.f, ebn.b, true, $$3.a(f))
               .a(jb.e, ebn.b, true, $$3.a(h))
               .a(jb.c, ebn.a, true, $$3)
               .a(jb.d, ebn.a, true, $$3.a(g))
               .a(jb.f, ebn.a, true, $$3.a(f))
               .a(jb.e, ebn.a, true, $$3.a(h))
         );
   }

   static frn a(dmm $$0, gsd $$1) {
      return frn.a($$0, $$1);
   }

   private static fro<gsi> c() {
      return fro.b(ebe.K).a(jb.a.b, a).a(jb.a.c, c).a(jb.a.a, c.then(f));
   }

   static frk a(dmm $$0, frx $$1, BiConsumer<alg, frt> $$2) {
      gsd $$3 = b(frw.g.a($$0, $$1, $$2));
      gsd $$4 = b(frw.h.a($$0, $$1, $$2));
      gsd $$5 = b(frw.i.a($$0, $$1, $$2));
      return frn.a($$0).a(fro.a(ebe.K).a(jb.a.a, $$3).a(jb.a.b, $$4).a(jb.a.c, $$5));
   }

   static frk b(dmm $$0, gsd $$1) {
      return frn.a($$0, $$1).a(c());
   }

   private void c(dmm $$0, gsd $$1) {
      this.j.accept(b($$0, $$1));
   }

   public void a(dmm $$0, frz.a $$1) {
      gsd $$2 = b($$1.create($$0, this.l));
      this.j.accept(b($$0, $$2));
   }

   private void c(dmm $$0, frz.a $$1) {
      gsd $$2 = b($$1.create($$0, this.l));
      this.j.accept(frn.a($$0, $$2).a(s));
   }

   static frk c(dmm $$0, gsd $$1, gsd $$2) {
      return frn.a($$0).a(fro.a(ebe.K).a(jb.a.b, $$1).a(jb.a.c, $$2.a(c)).a(jb.a.a, $$2.a(c).a(f)));
   }

   private void a(dmm $$0, frz.a $$1, frz.a $$2) {
      gsd $$3 = b($$1.create($$0, this.l));
      gsd $$4 = b($$2.create($$0, this.l));
      this.j.accept(c($$0, $$3, $$4));
   }

   private void g(dmm $$0) {
      gsd $$1 = b(frz.A.create($$0, this.l));
      gsd $$2 = b(frz.B.create($$0, this.l));
      gsd $$3 = b(this.a(frz.A, $$0, "_awake"));
      gsd $$4 = b(this.a(frz.B, $$0, "_awake"));
      gsd $$5 = b(this.a(frz.A, $$0, "_dormant"));
      gsd $$6 = b(this.a(frz.B, $$0, "_dormant"));
      this.j
         .accept(
            frn.a($$0)
               .a(
                  fro.a(ebe.K, doi.c)
                     .a(jb.a.b, ebi.a, $$1)
                     .a(jb.a.c, ebi.a, $$2.a(c))
                     .a(jb.a.a, ebi.a, $$2.a(c).a(f))
                     .a(jb.a.b, ebi.b, $$5)
                     .a(jb.a.c, ebi.b, $$6.a(c))
                     .a(jb.a.a, ebi.b, $$6.a(c).a(f))
                     .a(jb.a.b, ebi.c, $$3)
                     .a(jb.a.c, ebi.c, $$4.a(c))
                     .a(jb.a.a, ebi.c, $$4.a(c).a(f))
               )
         );
   }

   private alg a(frz.a $$0, dmm $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fry.i, frx.a($$1, $$2)).a(fry.d, frx.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.l);
   }

   private alg a(dmm $$0, String $$1, frv $$2, Function<alg, frx> $$3) {
      return $$2.a($$0, $$1, $$3.apply(frx.a($$0, $$1)), this.l);
   }

   static frk d(dmm $$0, gsd $$1, gsd $$2) {
      return frn.a($$0).a(a(ebe.A, $$2, $$1));
   }

   static frk e(dmm $$0, gsd $$1, gsd $$2, gsd $$3) {
      return frn.a($$0).a(fro.a(ebe.bk).a(ebw.b, $$1).a(ebw.a, $$2).a(ebw.c, $$3));
   }

   public void a(dmm $$0) {
      this.b($$0, frz.a);
   }

   public void b(dmm $$0, frz.a $$1) {
      this.j.accept(a($$0, b($$1.create($$0, this.l))));
   }

   public void a(dmm $$0, frz.a $$1, int $$2) {
      alg $$3 = $$1.create($$0, this.l);
      this.j.accept(a($$0, b($$3)));
      this.a($$0, $$3, frs.a($$2));
   }

   private void d() {
      this.K(dmo.fx);
      alg $$0 = this.a(czo.gr, dmo.fx);
      this.a(dmo.fx, $$0, frs.a(-12012264));
   }

   private void h(dmm $$0) {
      alg $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fqx());
   }

   private frf.a i(dmm $$0) {
      frz $$1 = t.getOrDefault($$0, frz.a.get($$0));
      return new frf.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dmm $$0, dmm $$1, dmm $$2) {
      gsd $$3 = this.g($$1, $$0);
      this.j.accept(a($$1, $$3));
      this.j.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dmm $$0) {
      frx $$1 = frx.w($$0);
      gsd $$2 = b(frw.v.a($$0, $$1, this.l));
      gsd $$3 = b(frw.w.a($$0, $$1, this.l));
      gsd $$4 = b(frw.x.a($$0, $$1, this.l));
      gsd $$5 = b(frw.y.a($$0, $$1, this.l));
      gsd $$6 = b(frw.z.a($$0, $$1, this.l));
      gsd $$7 = b(frw.A.a($$0, $$1, this.l));
      gsd $$8 = b(frw.B.a($$0, $$1, this.l));
      gsd $$9 = b(frw.C.a($$0, $$1, this.l));
      this.b($$0.h());
      this.j.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dmm $$0, dmm $$1) {
      gsd $$2 = b(frw.v.a($$0));
      gsd $$3 = b(frw.w.a($$0));
      gsd $$4 = b(frw.x.a($$0));
      gsd $$5 = b(frw.y.a($$0));
      gsd $$6 = b(frw.z.a($$0));
      gsd $$7 = b(frw.A.a($$0));
      gsd $$8 = b(frw.B.a($$0));
      gsd $$9 = b(frw.C.a($$0));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dmm $$0) {
      frx $$1 = frx.b($$0);
      gsd $$2 = b(frw.ak.a($$0, $$1, this.l));
      alg $$3 = frw.al.a($$0, $$1, this.l);
      gsd $$4 = b(frw.am.a($$0, $$1, this.l));
      this.j.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dmm $$0) {
      frx $$1 = frx.b($$0);
      gsd $$2 = b(frw.ah.a($$0, $$1, this.l));
      alg $$3 = frw.ai.a($$0, $$1, this.l);
      gsd $$4 = b(frw.aj.a($$0, $$1, this.l));
      this.j.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dmm $$0, dmm $$1) {
      gsd $$2 = b(frw.ah.a($$0));
      gsd $$3 = b(frw.ai.a($$0));
      gsd $$4 = b(frw.aj.a($$0));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      gsd $$0 = b(fru.a(dmo.tn));
      gsd $$1 = b(fru.a(dmo.tn, "_partial_tilt"));
      gsd $$2 = b(fru.a(dmo.tn, "_full_tilt"));
      this.j.accept(frn.a(dmo.tn).a(fro.a(ebe.bo).a(eca.a, $$0).a(eca.b, $$0).a(eca.c, $$1).a(eca.d, $$2)).a(s));
   }

   private frf.e m(dmm $$0) {
      return new frf.e(frx.q($$0));
   }

   private void n(dmm $$0) {
      this.d($$0, $$0);
   }

   private void d(dmm $$0, dmm $$1) {
      this.j.accept(a($$0, b(fru.a($$1))));
   }

   private void a(dmm $$0, frf.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dmm $$0, frf.d $$1, frx $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmm $$0, frf.d $$1) {
      frx $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmm $$0, frf.d $$1, frx $$2) {
      gsd $$3 = b($$1.a().a($$0, $$2, this.l));
      this.j.accept(a($$0, $$3));
   }

   private void a(dmm $$0, frf.d $$1, ebr<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.j.accept(frn.a($$0).a(fro.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            frx $$5 = frx.c(frx.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.l));
         })));
      }
   }

   private void a(dmm $$0, dmm $$1, frf.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dmm $$0, dmm $$1, frf.d $$2) {
      this.b($$0, $$2);
      frx $$3 = $$2.b($$0);
      gsd $$4 = b($$2.b().a($$1, $$3, this.l));
      this.j.accept(a($$1, $$4));
   }

   private void e(dmm $$0, dmm $$1) {
      frz $$2 = frz.u.get($$0);
      gsd $$3 = b($$2.a($$0, this.l));
      this.j.accept(a($$0, $$3));
      gsd $$4 = b(frw.aJ.a($$1, $$2.b(), this.l));
      this.j.accept(frn.a($$1, $$4).a(s));
      this.c($$0);
   }

   private void f(dmm $$0, dmm $$1) {
      this.b($$0.h());
      frx $$2 = frx.k($$0);
      frx $$3 = frx.a($$0, $$1);
      gsd $$4 = b(frw.bb.a($$1, $$3, this.l));
      this.j.accept(frn.a($$1, $$4).a(fro.b(ebe.T).a(jb.e, a).a(jb.d, h).a(jb.c, f).a(jb.f, g)));
      this.j.accept(frn.a($$0).a(fro.a(ebe.ay).a($$2x -> b(frw.ba[$$2x].a($$0, $$2, this.l)))));
   }

   private void f() {
      dmm $$0 = dmo.li;
      this.b($$0.h());
      gsd $$1 = b(fru.a($$0, "_top"));
      gsd $$2 = b(fru.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dmm $$0 = dmo.lh;
      this.b($$0.h());
      this.j.accept(frn.a($$0).a(fro.a(dsh.e, ebe.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(fru.a($$0, "_top_stage_" + $$1));
            case b -> b(fru.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dmm $$0, dmm $$1, dmm $$2, dmm $$3, dmm $$4, dmm $$5, dmm $$6, dmm $$7) {
      this.a($$0, frf.d.b);
      this.a($$1, frf.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dmm $$0, frf.d $$1) {
      gsd $$2 = b(this.a($$0, "_top", $$1.a(), frx::c));
      gsd $$3 = b(this.a($$0, "_bottom", $$1.a(), frx::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dmm $$0, frf.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dmm $$0) {
      alg $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fqx());
      this.c($$0, frf.d.a);
   }

   private void h() {
      this.a(dmo.jf, "_front");
      gsd $$0 = b(fru.a(dmo.jf, "_top"));
      gsd $$1 = b(this.a(dmo.jf, "_bottom", frf.d.b.a(), frx::c));
      this.e(dmo.jf, $$0, $$1);
   }

   private void i() {
      gsd $$0 = b(this.a(dmo.bH, "_top", frw.bv, frx::a));
      gsd $$1 = b(this.a(dmo.bH, "_bottom", frw.bv, frx::a));
      this.e(dmo.bH, $$0, $$1);
   }

   private void j() {
      gsd $$0 = b(fru.a(dmo.tp, "_top"));
      gsd $$1 = b(fru.a(dmo.tp, "_bottom"));
      this.j.accept(frn.a(dmo.tp).a(fro.a(ebe.ah).a(ebk.b, $$1).a(ebk.a, $$0)).a(s));
   }

   private void e(dmm $$0, gsd $$1, gsd $$2) {
      this.j.accept(frn.a($$0).a(fro.a(ebe.ah).a(ebk.b, $$2).a(ebk.a, $$1)));
   }

   private void p(dmm $$0) {
      frx $$1 = frx.h($$0);
      frx $$2 = frx.e(frx.a($$0, "_corner"));
      gsd $$3 = b(frw.au.a($$0, $$1, this.l));
      gsd $$4 = b(frw.av.a($$0, $$2, this.l));
      gsd $$5 = b(frw.aw.a($$0, $$1, this.l));
      gsd $$6 = b(frw.ax.a($$0, $$1, this.l));
      this.c($$0);
      this.j
         .accept(
            frn.a($$0)
               .a(
                  fro.a(ebe.aj)
                     .a(ebs.a, $$3)
                     .a(ebs.b, $$3.a(f))
                     .a(ebs.c, $$5.a(f))
                     .a(ebs.d, $$6.a(f))
                     .a(ebs.e, $$5)
                     .a(ebs.f, $$6)
                     .a(ebs.g, $$4)
                     .a(ebs.h, $$4.a(f))
                     .a(ebs.i, $$4.a(g))
                     .a(ebs.j, $$4.a(h))
               )
         );
   }

   private void q(dmm $$0) {
      gsd $$1 = b(this.a($$0, "", frw.au, frx::e));
      gsd $$2 = b(this.a($$0, "", frw.aw, frx::e));
      gsd $$3 = b(this.a($$0, "", frw.ax, frx::e));
      gsd $$4 = b(this.a($$0, "_on", frw.au, frx::e));
      gsd $$5 = b(this.a($$0, "_on", frw.aw, frx::e));
      gsd $$6 = b(this.a($$0, "_on", frw.ax, frx::e));
      this.c($$0);
      this.j.accept(frn.a($$0).a(fro.a(ebe.A, ebe.ak).a(($$6x, $$7) -> {
         return switch ($$7) {
            case a -> $$6x ? $$4 : $$1;
            case b -> ($$6x ? $$4 : $$1).a(f);
            case c -> ($$6x ? $$5 : $$2).a(f);
            case d -> ($$6x ? $$6 : $$3).a(f);
            case e -> $$6x ? $$5 : $$2;
            case f -> $$6x ? $$6 : $$3;
            default -> throw new UnsupportedOperationException("Fix you generator!");
         };
      })));
   }

   private void a(dmm $$0, czg $$1) {
      gsd $$2 = b(frw.aa.a($$0, frx.a($$1), this.l));
      this.j.accept(a($$0, $$2));
   }

   private void b(dmm $$0, alg $$1) {
      gsd $$2 = b(frw.aa.a($$0, frx.h($$1), this.l));
      this.j.accept(a($$0, $$2));
   }

   private gsd g(dmm $$0, dmm $$1) {
      return b(frw.aa.a($$0, frx.x($$1), this.l));
   }

   public void a(dmm $$0, dmm $$1) {
      this.j.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dmm $$0) {
      this.a($$0, $$0);
   }

   private void h(dmm $$0, dmm $$1) {
      this.a($$0);
      gsd $$2 = b(frz.j.get($$0).a($$1, this.l));
      this.j.accept(a($$1, $$2));
   }

   private void s(dmm $$0) {
      gsd $$1 = b(frz.p.create($$0, this.l));
      gsd $$2 = b(frz.q.create($$0, this.l));
      gsd $$3 = b(frz.r.create($$0, this.l));
      gsd $$4 = b(frz.s.create($$0, this.l));
      this.c($$0);
      this.a($$0, ebe.V, $$1, $$2, $$3, $$4);
   }

   private void t(dmm $$0) {
      gsd $$1 = b(frz.l.create($$0, this.l));
      gsd $$2 = b(frz.m.create($$0, this.l));
      gsd $$3 = b(frz.n.create($$0, this.l));
      gsd $$4 = b(frz.o.create($$0, this.l));
      this.b($$0.h());
      this.a($$0, ebe.U, $$1, $$2, $$3, $$4);
   }

   private void a(dmm $$0, ebo $$1, gsd $$2, gsd $$3, gsd $$4, gsd $$5) {
      this.j
         .accept(
            frm.a($$0)
               .a(b().a(ebe.T, jb.c), $$2)
               .a(b().a(ebe.T, jb.f), $$2.a(f))
               .a(b().a(ebe.T, jb.d), $$2.a(g))
               .a(b().a(ebe.T, jb.e), $$2.a(h))
               .a(b().a($$1, 2, 3, 4).a(ebe.T, jb.c), $$3)
               .a(b().a($$1, 2, 3, 4).a(ebe.T, jb.f), $$3.a(f))
               .a(b().a($$1, 2, 3, 4).a(ebe.T, jb.d), $$3.a(g))
               .a(b().a($$1, 2, 3, 4).a(ebe.T, jb.e), $$3.a(h))
               .a(b().a($$1, 3, 4).a(ebe.T, jb.c), $$4)
               .a(b().a($$1, 3, 4).a(ebe.T, jb.f), $$4.a(f))
               .a(b().a($$1, 3, 4).a(ebe.T, jb.d), $$4.a(g))
               .a(b().a($$1, 3, 4).a(ebe.T, jb.e), $$4.a(h))
               .a(b().a($$1, 4).a(ebe.T, jb.c), $$5)
               .a(b().a($$1, 4).a(ebe.T, jb.f), $$5.a(f))
               .a(b().a($$1, 4).a(ebe.T, jb.d), $$5.a(g))
               .a(b().a($$1, 4).a(ebe.T, jb.e), $$5.a(h))
         );
   }

   private void a(frz.a $$0, dmm... $$1) {
      for (dmm $$2 : $$1) {
         gsh $$3 = a($$0.create($$2, this.l));
         this.j.accept(frn.a($$2, b($$3)));
      }
   }

   private void b(frz.a $$0, dmm... $$1) {
      for (dmm $$2 : $$1) {
         gsd $$3 = b($$0.create($$2, this.l));
         this.j.accept(frn.a($$2, $$3).a(r));
      }
   }

   private void i(dmm $$0, dmm $$1) {
      this.a($$0);
      frx $$2 = frx.b($$0, $$1);
      gsd $$3 = b(frw.aP.a($$1, $$2, this.l));
      gsd $$4 = b(frw.aQ.a($$1, $$2, this.l));
      gsd $$5 = b(frw.aR.a($$1, $$2, this.l));
      gsd $$6 = b(frw.aN.a($$1, $$2, this.l));
      gsd $$7 = b(frw.aO.a($$1, $$2, this.l));
      czg $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.j
         .accept(
            frm.a($$1)
               .a($$3)
               .a(b().a(ebe.N, true), $$4)
               .a(b().a(ebe.O, true), $$4.a(f))
               .a(b().a(ebe.P, true), $$5)
               .a(b().a(ebe.Q, true), $$5.a(f))
               .a(b().a(ebe.N, false), $$6)
               .a(b().a(ebe.O, false), $$7)
               .a(b().a(ebe.P, false), $$7.a(f))
               .a(b().a(ebe.Q, false), $$6.a(h))
         );
   }

   private void u(dmm $$0) {
      frx $$1 = frx.C($$0);
      gsd $$2 = b(frw.aS.a($$0, $$1, this.l));
      gsd $$3 = b(this.a($$0, "_conditional", frw.aS, $$1x -> $$1.c(fry.i, $$1x)));
      this.j.accept(frn.a($$0).a(a(ebe.f, $$3, $$2)).a(o));
   }

   private void v(dmm $$0) {
      gsd $$1 = b(frz.v.create($$0, this.l));
      this.j.accept(a($$0, $$1).a(r));
   }

   private static gsd a(int $$0) {
      String $$1 = "_age" + $$0;
      return new gsd(IntStream.range(1, 5).mapToObj($$1x -> a(fru.a(dmo.nF, $$1x + $$1))).collect(Collectors.toList()));
   }

   private void k() {
      this.j
         .accept(
            frm.a(dmo.nF)
               .a(b().a(ebe.at, 0), a(0))
               .a(b().a(ebe.at, 1), a(1))
               .a(b().a(ebe.bn, eba.b), b(fru.a(dmo.nF, "_small_leaves")))
               .a(b().a(ebe.bn, eba.c), b(fru.a(dmo.nF, "_large_leaves")))
         );
   }

   private void l() {
      alg $$0 = frx.a(dmo.oA, "_top_open");
      gsd $$1 = b(frz.f.create(dmo.oA, this.l));
      gsd $$2 = b(frz.f.get(dmo.oA).a($$1x -> $$1x.a(fry.f, $$0)).a(dmo.oA, "_open", this.l));
      this.j.accept(frn.a(dmo.oA).a(fro.a(ebe.y).a(false, $$1).a(true, $$2)).a(p));
   }

   private static <T extends Comparable<T>> fro<gsd> a(ebr<T> $$0, T $$1, gsd $$2, gsd $$3) {
      return fro.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dmm $$0, Function<dmm, frx> $$1) {
      frx $$2 = $$1.apply($$0).b(fry.i, fry.c);
      frx $$3 = $$2.c(fry.g, frx.a($$0, "_front_honey"));
      alg $$4 = frw.q.a($$0, "_empty", $$2, this.l);
      alg $$5 = frw.q.a($$0, "_honey", $$3, this.l);
      this.k.a($$0.h(), frs.a(dmg.c, frs.a($$4), Map.of(5, frs.a($$5))));
      this.j.accept(frn.a($$0).a(a(dmg.c, 5, b($$5), b($$4))).a(s));
   }

   private void a(dmm $$0, ebr<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alg> $$3 = new Int2ObjectOpenHashMap();
         this.j.accept(frn.a($$0).a(fro.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((alg)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, frw.bc, frx::g)));
         })));
      }
   }

   private void m() {
      gsd $$0 = b(fru.a(dmo.oJ, "_floor"));
      gsd $$1 = b(fru.a(dmo.oJ, "_ceiling"));
      gsd $$2 = b(fru.a(dmo.oJ, "_wall"));
      gsd $$3 = b(fru.a(dmo.oJ, "_between_walls"));
      this.b(czo.xD);
      this.j
         .accept(
            frn.a(dmo.oJ)
               .a(
                  fro.a(ebe.T, ebe.Y)
                     .a(jb.c, ebc.a, $$0)
                     .a(jb.d, ebc.a, $$0.a(g))
                     .a(jb.f, ebc.a, $$0.a(f))
                     .a(jb.e, ebc.a, $$0.a(h))
                     .a(jb.c, ebc.b, $$1)
                     .a(jb.d, ebc.b, $$1.a(g))
                     .a(jb.f, ebc.b, $$1.a(f))
                     .a(jb.e, ebc.b, $$1.a(h))
                     .a(jb.c, ebc.c, $$2.a(h))
                     .a(jb.d, ebc.c, $$2.a(f))
                     .a(jb.f, ebc.c, $$2)
                     .a(jb.e, ebc.c, $$2.a(g))
                     .a(jb.d, ebc.d, $$3.a(f))
                     .a(jb.c, ebc.d, $$3.a(h))
                     .a(jb.f, ebc.d, $$3)
                     .a(jb.e, ebc.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.j
         .accept(
            frn.a(dmo.oF, b(fru.a(dmo.oF)))
               .a(
                  fro.b(ebe.X, ebe.T)
                     .a(eaz.a, jb.c, a)
                     .a(eaz.a, jb.f, f)
                     .a(eaz.a, jb.d, g)
                     .a(eaz.a, jb.e, h)
                     .a(eaz.b, jb.c, c)
                     .a(eaz.b, jb.f, c.then(f))
                     .a(eaz.b, jb.d, c.then(g))
                     .a(eaz.b, jb.e, c.then(h))
                     .a(eaz.c, jb.d, d)
                     .a(eaz.c, jb.e, d.then(f))
                     .a(eaz.c, jb.c, d.then(g))
                     .a(eaz.c, jb.f, d.then(h))
               )
         );
   }

   private void d(dmm $$0, frz.a $$1) {
      gsd $$2 = b($$1.create($$0, this.l));
      alg $$3 = frx.a($$0, "_front_on");
      gsd $$4 = b($$1.get($$0).a($$1x -> $$1x.a(fry.g, $$3)).a($$0, "_on", this.l));
      this.j.accept(frn.a($$0).a(a(ebe.u, $$4, $$2)).a(s));
   }

   private void a(dmm... $$0) {
      gsd $$1 = b(fru.a("campfire_off"));

      for (dmm $$2 : $$0) {
         gsd $$3 = b(frw.bj.a($$2, frx.H($$2), this.l));
         this.b($$2.h());
         this.j.accept(frn.a($$2).a(a(ebe.u, $$3, $$1)).a(r));
      }
   }

   private void w(dmm $$0) {
      gsd $$1 = b(frw.bE.a($$0, frx.o($$0), this.l));
      this.j.accept(a($$0, $$1));
   }

   private void x(dmm $$0) {
      gsd $$1;
      if ($$0 == dmo.tT) {
         $$1 = b(frw.bG.a($$0, frx.p($$0), this.l));
      } else {
         $$1 = b(frw.bF.a($$0, frx.p($$0), this.l));
      }

      this.j.accept(a($$0, $$1));
   }

   private void o() {
      frx $$0 = frx.a(frx.J(dmo.cv), frx.J(dmo.n));
      gsd $$1 = b(frw.j.a(dmo.cv, $$0, this.l));
      this.j.accept(a(dmo.cv, $$1));
   }

   private void p() {
      this.b(czo.ml);
      this.j
         .accept(
            frm.a(dmo.cH)
               .a(
                  a(
                     b().a(ebe.ae, ebt.c).a(ebe.ad, ebt.c).a(ebe.af, ebt.c).a(ebe.ag, ebt.c),
                     b().a(ebe.ae, ebt.b, ebt.a).a(ebe.ad, ebt.b, ebt.a),
                     b().a(ebe.ad, ebt.b, ebt.a).a(ebe.af, ebt.b, ebt.a),
                     b().a(ebe.af, ebt.b, ebt.a).a(ebe.ag, ebt.b, ebt.a),
                     b().a(ebe.ag, ebt.b, ebt.a).a(ebe.ae, ebt.b, ebt.a)
                  ),
                  b(fru.a("redstone_dust_dot"))
               )
               .a(b().a(ebe.ae, ebt.b, ebt.a), b(fru.a("redstone_dust_side0")))
               .a(b().a(ebe.af, ebt.b, ebt.a), b(fru.a("redstone_dust_side_alt0")))
               .a(b().a(ebe.ad, ebt.b, ebt.a), b(fru.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(ebe.ag, ebt.b, ebt.a), b(fru.a("redstone_dust_side1")).a(h))
               .a(b().a(ebe.ae, ebt.a), b(fru.a("redstone_dust_up")))
               .a(b().a(ebe.ad, ebt.a), b(fru.a("redstone_dust_up")).a(f))
               .a(b().a(ebe.af, ebt.a), b(fru.a("redstone_dust_up")).a(g))
               .a(b().a(ebe.ag, ebt.a), b(fru.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(czo.mp);
      this.j
         .accept(
            frn.a(dmo.hz)
               .a(
                  fro.a(ebe.bg, ebe.A)
                     .a(ebh.a, false, b(fru.a(dmo.hz)))
                     .a(ebh.a, true, b(fru.a(dmo.hz, "_on")))
                     .a(ebh.b, false, b(fru.a(dmo.hz, "_subtract")))
                     .a(ebh.b, true, b(fru.a(dmo.hz, "_on_subtract")))
               )
               .a(r)
         );
   }

   private void r() {
      frx $$0 = frx.a(dmo.ku);
      frx $$1 = frx.a(frx.a(dmo.kh, "_side"), $$0.a(fry.f));
      gsd $$2 = b(frw.ab.a(dmo.kh, $$1, this.l));
      gsd $$3 = b(frw.ac.a(dmo.kh, $$1, this.l));
      gsd $$4 = b(frw.j.b(dmo.kh, "_double", $$1, this.l));
      this.j.accept(e(dmo.kh, $$2, $$3, $$4));
      this.j.accept(a(dmo.ku, b(frw.c.a(dmo.ku, $$0, this.l))));
   }

   private void s() {
      this.b(czo.ty);
      this.j
         .accept(
            frm.a(dmo.fR)
               .a(b(frx.J(dmo.fR)))
               .a(b().a(ebe.n, true), b(frx.a(dmo.fR, "_bottle0")))
               .a(b().a(ebe.o, true), b(frx.a(dmo.fR, "_bottle1")))
               .a(b().a(ebe.p, true), b(frx.a(dmo.fR, "_bottle2")))
               .a(b().a(ebe.n, false), b(frx.a(dmo.fR, "_empty0")))
               .a(b().a(ebe.o, false), b(frx.a(dmo.fR, "_empty1")))
               .a(b().a(ebe.p, false), b(frx.a(dmo.fR, "_empty2")))
         );
   }

   private void y(dmm $$0) {
      gsd $$1 = b(frw.bA.a($$0, frx.b($$0), this.l));
      gsd $$2 = b(fru.a("mushroom_block_inside"));
      this.j
         .accept(
            frm.a($$0)
               .a(b().a(ebe.N, true), $$1)
               .a(b().a(ebe.O, true), $$1.a(f).a(b))
               .a(b().a(ebe.P, true), $$1.a(g).a(b))
               .a(b().a(ebe.Q, true), $$1.a(h).a(b))
               .a(b().a(ebe.L, true), $$1.a(e).a(b))
               .a(b().a(ebe.M, true), $$1.a(c).a(b))
               .a(b().a(ebe.N, false), $$2)
               .a(b().a(ebe.O, false), $$2.a(f))
               .a(b().a(ebe.P, false), $$2.a(g))
               .a(b().a(ebe.Q, false), $$2.a(h))
               .a(b().a(ebe.L, false), $$2.a(e))
               .a(b().a(ebe.M, false), $$2.a(c))
         );
      this.a($$0, frz.a.createWithSuffix($$0, "_inventory", this.l));
   }

   private void t() {
      this.b(czo.sJ);
      this.j
         .accept(
            frn.a(dmo.ex)
               .a(
                  fro.a(ebe.aB)
                     .a(0, b(fru.a(dmo.ex)))
                     .a(1, b(fru.a(dmo.ex, "_slice1")))
                     .a(2, b(fru.a(dmo.ex, "_slice2")))
                     .a(3, b(fru.a(dmo.ex, "_slice3")))
                     .a(4, b(fru.a(dmo.ex, "_slice4")))
                     .a(5, b(fru.a(dmo.ex, "_slice5")))
                     .a(6, b(fru.a(dmo.ex, "_slice6")))
               )
         );
   }

   private void u() {
      frx $$0 = new frx()
         .a(fry.c, frx.a(dmo.oD, "_side3"))
         .a(fry.o, frx.J(dmo.t))
         .a(fry.n, frx.a(dmo.oD, "_top"))
         .a(fry.j, frx.a(dmo.oD, "_side3"))
         .a(fry.l, frx.a(dmo.oD, "_side3"))
         .a(fry.k, frx.a(dmo.oD, "_side1"))
         .a(fry.m, frx.a(dmo.oD, "_side2"));
      this.j.accept(a(dmo.oD, b(frw.a.a(dmo.oD, $$0, this.l))));
   }

   private void v() {
      frx $$0 = new frx()
         .a(fry.c, frx.a(dmo.oH, "_front"))
         .a(fry.o, frx.a(dmo.oH, "_bottom"))
         .a(fry.n, frx.a(dmo.oH, "_top"))
         .a(fry.j, frx.a(dmo.oH, "_front"))
         .a(fry.k, frx.a(dmo.oH, "_front"))
         .a(fry.l, frx.a(dmo.oH, "_side"))
         .a(fry.m, frx.a(dmo.oH, "_side"));
      this.j.accept(a(dmo.oH, b(frw.a.a(dmo.oH, $$0, this.l))));
   }

   private void a(dmm $$0, dmm $$1, BiFunction<dmm, dmm, frx> $$2) {
      frx $$3 = $$2.apply($$0, $$1);
      this.j.accept(a($$0, b(frw.a.a($$0, $$3, this.l))));
   }

   public void b(dmm $$0) {
      frx $$1 = new frx()
         .a(fry.c, frx.a($$0, "_particle"))
         .a(fry.o, frx.a($$0, "_down"))
         .a(fry.n, frx.a($$0, "_up"))
         .a(fry.j, frx.a($$0, "_north"))
         .a(fry.k, frx.a($$0, "_south"))
         .a(fry.l, frx.a($$0, "_east"))
         .a(fry.m, frx.a($$0, "_west"));
      this.j.accept(a($$0, b(frw.a.a($$0, $$1, this.l))));
   }

   private void w() {
      frx $$0 = frx.n(dmo.fr);
      this.j.accept(a(dmo.fr, b(fru.a(dmo.fr))));
      this.a(dmo.ev, $$0);
      this.a(dmo.ew, $$0);
   }

   private void a(dmm $$0, frx $$1) {
      gsd $$2 = b(frw.p.a($$0, $$1.c(fry.g, frx.J($$0)), this.l));
      this.j.accept(frn.a($$0, $$2).a(s));
   }

   private void x() {
      this.b(czo.tz);
      this.n(dmo.fS);
      this.j.accept(a(dmo.fU, b(frw.bD.a(dmo.fU, frx.j(frx.a(dmo.K, "_still")), this.l))));
      this.j
         .accept(
            frn.a(dmo.fT)
               .a(
                  fro.a(dra.f)
                     .a(1, b(frw.bB.a(dmo.fT, "_level1", frx.j(frx.a(dmo.J, "_still")), this.l)))
                     .a(2, b(frw.bC.a(dmo.fT, "_level2", frx.j(frx.a(dmo.J, "_still")), this.l)))
                     .a(3, b(frw.bD.a(dmo.fT, "_full", frx.j(frx.a(dmo.J, "_still")), this.l)))
               )
         );
      this.j
         .accept(
            frn.a(dmo.fV)
               .a(
                  fro.a(dra.f)
                     .a(1, b(frw.bB.a(dmo.fV, "_level1", frx.j(frx.J(dmo.rx)), this.l)))
                     .a(2, b(frw.bC.a(dmo.fV, "_level2", frx.j(frx.J(dmo.rx)), this.l)))
                     .a(3, b(frw.bD.a(dmo.fV, "_full", frx.j(frx.J(dmo.rx)), this.l)))
               )
         );
   }

   private void y() {
      frx $$0 = frx.b(dmo.lb);
      gsd $$1 = b(frw.aL.a(dmo.lb, $$0, this.l));
      gsd $$2 = b(this.a(dmo.lb, "_dead", frw.aL, $$1x -> $$0.c(fry.b, $$1x)));
      this.j.accept(frn.a(dmo.lb).a(a(ebe.ax, 5, $$2, $$1)));
   }

   private void z() {
      gsd $$0 = b(fru.a(dmo.ua));
      gsd $$1 = b(fru.a(dmo.ua, "_triggered"));
      gsd $$2 = b(fru.a(dmo.ua, "_crafting"));
      gsd $$3 = b(fru.a(dmo.ua, "_crafting_triggered"));
      this.j
         .accept(frn.a(dmo.ua).a(fro.a(ebe.G, dog.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(fro.b(ebe.W).a(frf::a)));
   }

   private void z(dmm $$0) {
      frx $$1 = new frx().a(fry.f, frx.a(dmo.cO, "_top")).a(fry.i, frx.a(dmo.cO, "_side")).a(fry.g, frx.a($$0, "_front"));
      frx $$2 = new frx().a(fry.i, frx.a(dmo.cO, "_top")).a(fry.g, frx.a($$0, "_front_vertical"));
      gsd $$3 = b(frw.p.a($$0, $$1, this.l));
      gsd $$4 = b(frw.r.a($$0, $$2, this.l));
      this.j.accept(frn.a($$0).a(fro.a(ebe.R).a(jb.a, $$4.a(d)).a(jb.b, $$4).a(jb.c, $$3).a(jb.f, $$3.a(f)).a(jb.d, $$3.a(g)).a(jb.e, $$3.a(h))));
   }

   private void A() {
      gsd $$0 = b(fru.a(dmo.fX));
      gsd $$1 = b(fru.a(dmo.fX, "_filled"));
      this.j.accept(frn.a(dmo.fX).a(fro.a(ebe.k).a(false, $$0).a(true, $$1)).a(r));
   }

   private void B() {
      gsd $$0 = b(fru.a(dmo.la, "_side"));
      gsh $$1 = a(fru.a(dmo.la, "_noside"));
      gsh $$2 = a(fru.a(dmo.la, "_noside1"));
      gsh $$3 = a(fru.a(dmo.la, "_noside2"));
      gsh $$4 = a(fru.a(dmo.la, "_noside3"));
      this.j
         .accept(
            frm.a(dmo.la)
               .a(b().a(ebe.N, true), $$0)
               .a(b().a(ebe.O, true), $$0.a(f).a(b))
               .a(b().a(ebe.P, true), $$0.a(g).a(b))
               .a(b().a(ebe.Q, true), $$0.a(h).a(b))
               .a(b().a(ebe.L, true), $$0.a(e).a(b))
               .a(b().a(ebe.M, true), $$0.a(c).a(b))
               .a(b().a(ebe.N, false), a($$1.a(i), $$2, $$3, $$4))
               .a(b().a(ebe.O, false), a($$2.a(f).a(b), $$3.a(f).a(b), $$4.a(f).a(b), $$1.a(i).a(f).a(b)))
               .a(b().a(ebe.P, false), a($$3.a(g).a(b), $$4.a(g).a(b), $$1.a(i).a(g).a(b), $$2.a(g).a(b)))
               .a(b().a(ebe.Q, false), a($$4.a(h).a(b), $$1.a(i).a(h).a(b), $$2.a(h).a(b), $$3.a(h).a(b)))
               .a(b().a(ebe.L, false), a($$1.a(i).a(e).a(b), $$4.a(e).a(b), $$2.a(e).a(b), $$3.a(e).a(b)))
               .a(b().a(ebe.M, false), a($$4.a(c).a(b), $$3.a(c).a(b), $$2.a(c).a(b), $$1.a(i).a(c).a(b)))
         );
   }

   private void C() {
      this.j
         .accept(
            frm.a(dmo.pK)
               .a(b(frx.J(dmo.pK)))
               .a(b().a(ebe.aO, 1), b(frx.a(dmo.pK, "_contents1")))
               .a(b().a(ebe.aO, 2), b(frx.a(dmo.pK, "_contents2")))
               .a(b().a(ebe.aO, 3), b(frx.a(dmo.pK, "_contents3")))
               .a(b().a(ebe.aO, 4), b(frx.a(dmo.pK, "_contents4")))
               .a(b().a(ebe.aO, 5), b(frx.a(dmo.pK, "_contents5")))
               .a(b().a(ebe.aO, 6), b(frx.a(dmo.pK, "_contents6")))
               .a(b().a(ebe.aO, 7), b(frx.a(dmo.pK, "_contents7")))
               .a(b().a(ebe.aO, 8), b(frx.a(dmo.pK, "_contents_ready")))
         );
   }

   private void A(dmm $$0) {
      gsd $$1 = b(frw.c.a($$0, frx.a($$0), this.l));
      gsd $$2 = b(this.a($$0, "_powered", frw.c, frx::b));
      gsd $$3 = b(this.a($$0, "_lit", frw.c, frx::b));
      gsd $$4 = b(this.a($$0, "_lit_powered", frw.c, frx::b));
      this.j.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static frk a(dmm $$0, gsd $$1, gsd $$2, gsd $$3, gsd $$4) {
      return frn.a($$0).a(fro.a(ebe.u, ebe.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dmm $$0, dmm $$1) {
      gsd $$2 = b(fru.a($$0));
      gsd $$3 = b(fru.a($$0, "_powered"));
      gsd $$4 = b(fru.a($$0, "_lit"));
      gsd $$5 = b(fru.a($$0, "_lit_powered"));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dmm $$0) {
      gsd $$1 = b(frw.ao.a($$0, frx.c($$0), this.l));
      this.j.accept(frn.a($$0, $$1).a(p));
   }

   private void D() {
      this.B(dmo.rg);
      this.B(dmo.rf);
      this.B(dmo.re);
      this.B(dmo.rd);
   }

   private void E() {
      fro.b<gsd, jb, ebl> $$0 = fro.a(ebe.bp, ebe.bq);

      for (ebl $$1 : ebl.values()) {
         $$0.a(jb.b, $$1, this.a(jb.b, $$1));
      }

      for (ebl $$2 : ebl.values()) {
         $$0.a(jb.a, $$2, this.a(jb.a, $$2));
      }

      this.j.accept(frn.a(dmo.tb).a($$0));
   }

   private gsd a(jb $$0, ebl $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      frx $$3 = frx.c(frx.a(dmo.tb, $$2));
      return b(frw.an.a(dmo.tb, $$2, $$3, this.l));
   }

   private void C(dmm $$0) {
      frx $$1 = new frx().a(fry.e, frx.J(dmo.em)).a(fry.f, frx.J($$0)).a(fry.i, frx.a($$0, "_side"));
      this.j.accept(a($$0, b(frw.n.a($$0, $$1, this.l))));
   }

   private void F() {
      alg $$0 = frx.a(dmo.hA, "_side");
      frx $$1 = new frx().a(fry.f, frx.a(dmo.hA, "_top")).a(fry.i, $$0);
      frx $$2 = new frx().a(fry.f, frx.a(dmo.hA, "_inverted_top")).a(fry.i, $$0);
      this.j.accept(frn.a(dmo.hA).a(fro.a(ebe.s).a(false, b(frw.aM.a(dmo.hA, $$1, this.l))).a(true, b(frw.aM.a(fru.a(dmo.hA, "_inverted"), $$2, this.l)))));
   }

   private void D(dmm $$0) {
      this.j.accept(frn.a($$0, b(fru.a($$0))).a(p));
   }

   private void G() {
      dmm $$0 = dmo.ta;
      gsd $$1 = b(fru.a($$0, "_on"));
      gsd $$2 = b(fru.a($$0));
      this.j.accept(frn.a($$0).a(a(ebe.A, $$1, $$2)).a(p));
   }

   private void H() {
      frx $$0 = new frx().a(fry.C, frx.J(dmo.j)).a(fry.f, frx.J(dmo.cN));
      frx $$1 = new frx().a(fry.C, frx.J(dmo.j)).a(fry.f, frx.a(dmo.cN, "_moist"));
      gsd $$2 = b(frw.bd.a(dmo.cN, $$0, this.l));
      gsd $$3 = b(frw.bd.a(frx.a(dmo.cN, "_moist"), $$1, this.l));
      this.j.accept(frn.a(dmo.cN).a(a(ebe.aT, 7, $$3, $$2)));
   }

   private gsd E(dmm $$0) {
      return a(a(frw.be.a(fru.a($$0, "_floor0"), frx.y($$0), this.l)), a(frw.be.a(fru.a($$0, "_floor1"), frx.z($$0), this.l)));
   }

   private gsd F(dmm $$0) {
      return a(
         a(frw.bf.a(fru.a($$0, "_side0"), frx.y($$0), this.l)),
         a(frw.bf.a(fru.a($$0, "_side1"), frx.z($$0), this.l)),
         a(frw.bg.a(fru.a($$0, "_side_alt0"), frx.y($$0), this.l)),
         a(frw.bg.a(fru.a($$0, "_side_alt1"), frx.z($$0), this.l))
      );
   }

   private gsd G(dmm $$0) {
      return a(
         a(frw.bh.a(fru.a($$0, "_up0"), frx.y($$0), this.l)),
         a(frw.bh.a(fru.a($$0, "_up1"), frx.z($$0), this.l)),
         a(frw.bi.a(fru.a($$0, "_up_alt0"), frx.y($$0), this.l)),
         a(frw.bi.a(fru.a($$0, "_up_alt1"), frx.z($$0), this.l))
      );
   }

   private void I() {
      frl $$0 = b().a(ebe.N, false).a(ebe.O, false).a(ebe.P, false).a(ebe.Q, false).a(ebe.L, false);
      gsd $$1 = this.E(dmo.cB);
      gsd $$2 = this.F(dmo.cB);
      gsd $$3 = this.G(dmo.cB);
      this.j
         .accept(
            frm.a(dmo.cB)
               .a($$0, $$1)
               .a(a(b().a(ebe.N, true), $$0), $$2)
               .a(a(b().a(ebe.O, true), $$0), $$2.a(f))
               .a(a(b().a(ebe.P, true), $$0), $$2.a(g))
               .a(a(b().a(ebe.Q, true), $$0), $$2.a(h))
               .a(b().a(ebe.L, true), $$3)
         );
   }

   private void J() {
      gsd $$0 = this.E(dmo.cC);
      gsd $$1 = this.F(dmo.cC);
      this.j.accept(frm.a(dmo.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dmm $$0) {
      gsd $$1 = b(frz.x.create($$0, this.l));
      gsd $$2 = b(frz.y.create($$0, this.l));
      this.b($$0.h());
      this.j.accept(frn.a($$0).a(a(ebe.m, $$2, $$1)));
   }

   private void K() {
      frx $$0 = frx.a(frx.a(dmo.ah, "_side"), frx.a(dmo.ah, "_top"));
      gsd $$1 = b(frw.j.a(dmo.ah, $$0, this.l));
      this.j.accept(b(dmo.ah, $$1));
   }

   private void L() {
      this.b(czo.af);
      dmm $$0 = dmo.H;
      gsd $$1 = b(fru.a($$0));
      this.j.accept(frn.a(dmo.H).a(fro.a(drn.d, drn.b).a(($$2, $$3) -> $$2 ? b(fru.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.j
         .accept(
            frn.a(dmo.lo)
               .a(
                  fro.a(ebe.av)
                     .a(0, b(this.a(dmo.lo, "_0", frw.c, frx::b)))
                     .a(1, b(this.a(dmo.lo, "_1", frw.c, frx::b)))
                     .a(2, b(this.a(dmo.lo, "_2", frw.c, frx::b)))
                     .a(3, b(this.a(dmo.lo, "_3", frw.c, frx::b)))
               )
         );
   }

   private void N() {
      alg $$0 = frx.J(dmo.j);
      frx $$1 = new frx().a(fry.e, $$0).b(fry.e, fry.c).a(fry.f, frx.a(dmo.i, "_top")).a(fry.i, frx.a(dmo.i, "_snow"));
      gsd $$2 = b(frw.n.a(dmo.i, "_snow", $$1, this.l));
      alg $$3 = fru.a(dmo.i);
      this.f(dmo.i, b(a($$3)), $$2);
      this.a(dmo.i, $$3, new fqx());
      gsd $$4 = b(a(frz.f.get(dmo.fE).a($$1x -> $$1x.a(fry.e, $$0)).a(dmo.fE, this.l)));
      this.f(dmo.fE, $$4, $$2);
      gsd $$5 = b(a(frz.f.get(dmo.l).a($$1x -> $$1x.a(fry.e, $$0)).a(dmo.l, this.l)));
      this.f(dmo.l, $$5, $$2);
   }

   private void f(dmm $$0, gsd $$1, gsd $$2) {
      this.j.accept(frn.a($$0).a(fro.a(ebe.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(czo.sp);
      this.j.accept(frn.a(dmo.gb).a(fro.a(ebe.au).a(0, b(fru.a(dmo.gb, "_stage0"))).a(1, b(fru.a(dmo.gb, "_stage1"))).a(2, b(fru.a(dmo.gb, "_stage2")))).a(r));
   }

   private void P() {
      gsh $$0 = a(fru.a(dmo.lk));
      this.j.accept(frn.a(dmo.lk, b($$0)));
   }

   private void k(dmm $$0, dmm $$1) {
      frx $$2 = frx.b($$1);
      gsd $$3 = b(frw.Y.a($$0, $$2, this.l));
      gsd $$4 = b(frw.Z.a($$0, $$2, this.l));
      this.j.accept(frn.a($$0).a(a(ebe.aW, 1, $$4, $$3)));
   }

   private void Q() {
      gsd $$0 = b(fru.a(dmo.hD));
      gsd $$1 = b(fru.a(dmo.hD, "_side"));
      this.b(czo.mv);
      this.j.accept(frn.a(dmo.hD).a(fro.a(ebe.S).a(jb.a, $$0).a(jb.c, $$1).a(jb.f, $$1.a(f)).a(jb.d, $$1.a(g)).a(jb.e, $$1.a(h))));
   }

   private void l(dmm $$0, dmm $$1) {
      gsd $$2 = b(fru.a($$0));
      this.j.accept(frn.a($$1, $$2));
      this.k.a($$0.h(), $$1.h());
   }

   private void R() {
      gsd $$0 = b(fru.a(dmo.fo, "_post_ends"));
      gsd $$1 = b(fru.a(dmo.fo, "_post"));
      gsd $$2 = b(fru.a(dmo.fo, "_cap"));
      gsd $$3 = b(fru.a(dmo.fo, "_cap_alt"));
      gsd $$4 = b(fru.a(dmo.fo, "_side"));
      gsd $$5 = b(fru.a(dmo.fo, "_side_alt"));
      this.j
         .accept(
            frm.a(dmo.fo)
               .a($$0)
               .a(b().a(ebe.N, false).a(ebe.O, false).a(ebe.P, false).a(ebe.Q, false), $$1)
               .a(b().a(ebe.N, true).a(ebe.O, false).a(ebe.P, false).a(ebe.Q, false), $$2)
               .a(b().a(ebe.N, false).a(ebe.O, true).a(ebe.P, false).a(ebe.Q, false), $$2.a(f))
               .a(b().a(ebe.N, false).a(ebe.O, false).a(ebe.P, true).a(ebe.Q, false), $$3)
               .a(b().a(ebe.N, false).a(ebe.O, false).a(ebe.P, false).a(ebe.Q, true), $$3.a(f))
               .a(b().a(ebe.N, true), $$4)
               .a(b().a(ebe.O, true), $$4.a(f))
               .a(b().a(ebe.P, true), $$5)
               .a(b().a(ebe.Q, true), $$5.a(f))
         );
      this.c(dmo.fo);
   }

   private void I(dmm $$0) {
      this.j.accept(frn.a($$0, b(fru.a($$0))).a(s));
   }

   private void S() {
      gsd $$0 = b(fru.a(dmo.dL));
      gsd $$1 = b(fru.a(dmo.dL, "_on"));
      this.c(dmo.dL);
      this.j
         .accept(
            frn.a(dmo.dL)
               .a(a(ebe.A, $$0, $$1))
               .a(
                  fro.b(ebe.X, ebe.T)
                     .a(eaz.c, jb.c, d.then(g))
                     .a(eaz.c, jb.f, d.then(h))
                     .a(eaz.c, jb.d, d)
                     .a(eaz.c, jb.e, d.then(f))
                     .a(eaz.a, jb.c, a)
                     .a(eaz.a, jb.f, f)
                     .a(eaz.a, jb.d, g)
                     .a(eaz.a, jb.e, h)
                     .a(eaz.b, jb.c, c)
                     .a(eaz.b, jb.f, c.then(f))
                     .a(eaz.b, jb.d, c.then(g))
                     .a(eaz.b, jb.e, c.then(h))
               )
         );
   }

   private void T() {
      alg $$0 = this.a(czo.gE, dmo.fF);
      this.a(dmo.fF, $$0, frs.a(-9321636));
      gsh $$1 = a(fru.a(dmo.fF));
      this.j.accept(frn.a(dmo.fF, b($$1)));
   }

   private void U() {
      this.c(dmo.tX);
      this.j.accept(a(dmo.tX, b(fru.a(dmo.tX))));
   }

   private void V() {
      this.j.accept(frn.a(dmo.eu).a(fro.a(ebe.J).a(jb.a.a, b(fru.a(dmo.eu, "_ns"))).a(jb.a.c, b(fru.a(dmo.eu, "_ew")))));
   }

   private void W() {
      gsh $$0 = a(frz.a.create(dmo.em, this.l));
      this.j
         .accept(
            frn.a(
               dmo.em,
               a(
                  $$0,
                  $$0.a(c),
                  $$0.a(d),
                  $$0.a(e),
                  $$0.a(f),
                  $$0.a(f.then(c)),
                  $$0.a(f.then(d)),
                  $$0.a(f.then(e)),
                  $$0.a(g),
                  $$0.a(g.then(c)),
                  $$0.a(g.then(d)),
                  $$0.a(g.then(e)),
                  $$0.a(h),
                  $$0.a(h.then(c)),
                  $$0.a(h.then(d)),
                  $$0.a(h.then(e))
               )
            )
         );
   }

   private void X() {
      gsd $$0 = b(fru.a(dmo.lu));
      gsd $$1 = b(fru.a(dmo.lu, "_on"));
      this.j.accept(frn.a(dmo.lu).a(a(ebe.A, $$1, $$0)).a(o));
   }

   private void Y() {
      frx $$0 = new frx().a(fry.e, frx.a(dmo.bI, "_bottom")).a(fry.i, frx.a(dmo.bI, "_side"));
      alg $$1 = frx.a(dmo.bI, "_top_sticky");
      alg $$2 = frx.a(dmo.bI, "_top");
      frx $$3 = $$0.c(fry.F, $$1);
      frx $$4 = $$0.c(fry.F, $$2);
      gsd $$5 = b(fru.a(dmo.bI, "_base"));
      this.a(dmo.bI, $$5, $$4);
      this.a(dmo.by, $$5, $$3);
      alg $$6 = frw.n.a(dmo.bI, "_inventory", $$0.c(fry.f, $$2), this.l);
      alg $$7 = frw.n.a(dmo.by, "_inventory", $$0.c(fry.f, $$1), this.l);
      this.a(dmo.bI, $$6);
      this.a(dmo.by, $$7);
   }

   private void a(dmm $$0, gsd $$1, frx $$2) {
      gsd $$3 = b(frw.bs.a($$0, $$2, this.l));
      this.j.accept(frn.a($$0).a(a(ebe.j, $$1, $$3)).a(o));
   }

   private void Z() {
      frx $$0 = new frx().a(fry.G, frx.a(dmo.bI, "_top")).a(fry.i, frx.a(dmo.bI, "_side"));
      frx $$1 = $$0.c(fry.F, frx.a(dmo.bI, "_top_sticky"));
      frx $$2 = $$0.c(fry.F, frx.a(dmo.bI, "_top"));
      this.j
         .accept(
            frn.a(dmo.bJ)
               .a(
                  fro.a(ebe.B, ebe.bj)
                     .a(false, ebq.a, b(frw.bt.a(dmo.bI, "_head", $$2, this.l)))
                     .a(false, ebq.b, b(frw.bt.a(dmo.bI, "_head_sticky", $$1, this.l)))
                     .a(true, ebq.a, b(frw.bu.a(dmo.bI, "_head_short", $$2, this.l)))
                     .a(true, ebq.b, b(frw.bu.a(dmo.bI, "_head_short_sticky", $$1, this.l)))
               )
               .a(o)
         );
   }

   private void aa() {
      dmm $$0 = dmo.ub;
      frx $$1 = frx.a($$0, "_side_inactive", "_top_inactive");
      frx $$2 = frx.a($$0, "_side_active", "_top_active");
      frx $$3 = frx.a($$0, "_side_active", "_top_ejecting_reward");
      frx $$4 = frx.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      frx $$5 = frx.a($$0, "_side_active_ominous", "_top_active_ominous");
      frx $$6 = frx.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alg $$7 = frw.o.a($$0, $$1, this.l);
      gsd $$8 = b($$7);
      gsd $$9 = b(frw.o.a($$0, "_active", $$2, this.l));
      gsd $$10 = b(frw.o.a($$0, "_ejecting_reward", $$3, this.l));
      gsd $$11 = b(frw.o.a($$0, "_inactive_ominous", $$4, this.l));
      gsd $$12 = b(frw.o.a($$0, "_active_ominous", $$5, this.l));
      gsd $$13 = b(frw.o.a($$0, "_ejecting_reward_ominous", $$6, this.l));
      this.a($$0, $$7);
      this.j.accept(frn.a($$0).a(fro.a(ebe.bB, ebe.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dmm $$0 = dmo.uc;
      frx $$1 = frx.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      frx $$2 = frx.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      frx $$3 = frx.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      frx $$4 = frx.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alg $$5 = frw.cb.a($$0, $$1, this.l);
      gsd $$6 = b($$5);
      gsd $$7 = b(frw.cb.a($$0, "_active", $$2, this.l));
      gsd $$8 = b(frw.cb.a($$0, "_unlocking", $$3, this.l));
      gsd $$9 = b(frw.cb.a($$0, "_ejecting_reward", $$4, this.l));
      frx $$10 = frx.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      frx $$11 = frx.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      frx $$12 = frx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      frx $$13 = frx.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      gsd $$14 = b(frw.cb.a($$0, "_ominous", $$10, this.l));
      gsd $$15 = b(frw.cb.a($$0, "_active_ominous", $$11, this.l));
      gsd $$16 = b(frw.cb.a($$0, "_unlocking_ominous", $$12, this.l));
      gsd $$17 = b(frw.cb.a($$0, "_ejecting_reward_ominous", $$13, this.l));
      this.a($$0, $$5);
      this.j.accept(frn.a($$0).a(fro.a(dvx.b, dvx.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(s));
   }

   private void ac() {
      alg $$0 = fru.a(dmo.ry, "_inactive");
      gsd $$1 = b($$0);
      gsd $$2 = b(fru.a(dmo.ry, "_active"));
      this.a(dmo.ry, $$0);
      this.j.accept(frn.a(dmo.ry).a(fro.a(ebe.br).a($$2x -> $$2x != ebv.b && $$2x != ebv.c ? $$1 : $$2)));
   }

   private void ad() {
      alg $$0 = fru.a(dmo.rz, "_inactive");
      gsd $$1 = b($$0);
      gsd $$2 = b(fru.a(dmo.rz, "_active"));
      this.a(dmo.rz, $$0);
      this.j.accept(frn.a(dmo.rz).a(fro.a(ebe.br).a($$2x -> $$2x != ebv.b && $$2x != ebv.c ? $$1 : $$2)).a(s));
   }

   private void ae() {
      alg $$0 = frw.ca.a(dmo.rD, frx.a(false), this.l);
      gsd $$1 = b($$0);
      gsd $$2 = b(frw.ca.a(dmo.rD, "_can_summon", frx.a(true), this.l));
      this.a(dmo.rD, $$0);
      this.j.accept(frn.a(dmo.rD).a(a(ebe.e, $$2, $$1)));
   }

   private void af() {
      alg $$0 = fru.a(dmo.oy, "_stable");
      gsd $$1 = b($$0);
      gsd $$2 = b(fru.a(dmo.oy, "_unstable"));
      this.a(dmo.oy, $$0);
      this.j.accept(frn.a(dmo.oy).a(a(ebe.d, $$2, $$1)));
   }

   private void ag() {
      gsd $$0 = b(this.a(dmo.td, "", frw.ao, frx::c));
      gsd $$1 = b(this.a(dmo.td, "_lit", frw.ao, frx::c));
      this.j.accept(frn.a(dmo.td).a(a(ebe.b, $$1, $$0)));
      gsd $$2 = b(this.a(dmo.te, "", frw.ao, frx::c));
      gsd $$3 = b(this.a(dmo.te, "_lit", frw.ao, frx::c));
      this.j.accept(frn.a(dmo.te).a(a(ebe.b, $$3, $$2)));
   }

   private void ah() {
      gsd $$0 = b(frz.a.create(dmo.ga, this.l));
      gsd $$1 = b(this.a(dmo.ga, "_on", frw.c, frx::b));
      this.j.accept(frn.a(dmo.ga).a(a(ebe.u, $$1, $$0)));
   }

   private void m(dmm $$0, dmm $$1) {
      frx $$2 = frx.B($$0);
      this.j.accept(a($$0, b(frw.bm.a($$0, $$2, this.l))));
      this.j.accept(frn.a($$1, b(frw.bo.a($$1, $$2, this.l))).a(q));
      this.c($$0);
   }

   private void ai() {
      frx $$0 = frx.B(dmo.ea);
      frx $$1 = frx.i(frx.a(dmo.ea, "_off"));
      gsd $$2 = b(frw.bq.a(dmo.ea, $$0, this.l));
      gsd $$3 = b(frw.bn.a(dmo.ea, "_off", $$1, this.l));
      this.j.accept(frn.a(dmo.ea).a(a(ebe.u, $$2, $$3)));
      gsd $$4 = b(frw.br.a(dmo.eb, $$0, this.l));
      gsd $$5 = b(frw.bp.a(dmo.eb, "_off", $$1, this.l));
      this.j.accept(frn.a(dmo.eb).a(a(ebe.u, $$4, $$5)).a(q));
      this.c(dmo.ea);
   }

   private void aj() {
      this.b(czo.mo);
      this.j.accept(frn.a(dmo.ey).a(fro.a(ebe.aD, ebe.v, ebe.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(frx.a(dmo.ey, $$3.toString()));
      })).a(r));
   }

   private void ak() {
      this.b(czo.de);
      this.j
         .accept(
            frn.a(dmo.nB)
               .a(
                  fro.a(ebe.aV, ebe.I)
                     .a(1, false, b(a(fru.a("dead_sea_pickle"))))
                     .a(2, false, b(a(fru.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(fru.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(fru.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(fru.a("sea_pickle"))))
                     .a(2, true, b(a(fru.a("two_sea_pickles"))))
                     .a(3, true, b(a(fru.a("three_sea_pickles"))))
                     .a(4, true, b(a(fru.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      frx $$0 = frx.a(dmo.ed);
      gsd $$1 = b(frw.c.a(dmo.ef, $$0, this.l));
      this.j.accept(frn.a(dmo.ed).a(fro.a(ebe.aI).a($$1x -> $$1x < 8 ? b(fru.a(dmo.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dmo.ed, fru.a(dmo.ed, "_height2"));
      this.j.accept(a(dmo.ef, $$1));
   }

   private void am() {
      this.j.accept(frn.a(dmo.oI, b(fru.a(dmo.oI))).a(s));
   }

   private void an() {
      alg $$0 = frz.a.create(dmo.pG, this.l);
      this.a(dmo.pG, $$0);
      this.j.accept(frn.a(dmo.pG).a(fro.a(ebe.bm).a($$0x -> b(this.a(dmo.pG, "_" + $$0x.c(), frw.c, frx::b)))));
   }

   private void ao() {
      Map<ebz, alg> $$0 = new HashMap<>();

      for (ebz $$1 : ebz.values()) {
         $$0.put($$1, this.a(dmo.pI, "_" + $$1.c(), frw.c, frx::b));
      }

      this.j.accept(frn.a(dmo.pI).a(fro.a(ebe.bF).a($$1x -> b($$0.get($$1x)))));
      this.k.a(czo.pa, frs.a(dvg.b, frs.a($$0.get(ebz.a)), Map.of(ebz.c, frs.a($$0.get(ebz.c)), ebz.b, frs.a($$0.get(ebz.b)), ebz.d, frs.a($$0.get(ebz.d)))));
   }

   private void ap() {
      this.b(czo.xG);
      this.j.accept(frn.a(dmo.oO).a(fro.a(ebe.av).a($$0 -> b(this.a(dmo.oO, "_stage" + $$0, frw.ao, frx::c)))));
   }

   private void aq() {
      this.b(czo.qg);
      this.j
         .accept(
            frn.a(dmo.gh)
               .a(
                  fro.a(ebe.a, ebe.O, ebe.N, ebe.P, ebe.Q)
                     .a(false, false, false, false, false, b(fru.a(dmo.gh, "_ns")))
                     .a(false, true, false, false, false, b(fru.a(dmo.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(fru.a(dmo.gh, "_n")))
                     .a(false, false, false, true, false, b(fru.a(dmo.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(fru.a(dmo.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(fru.a(dmo.gh, "_ne")))
                     .a(false, true, false, true, false, b(fru.a(dmo.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(fru.a(dmo.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(fru.a(dmo.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(fru.a(dmo.gh, "_ns")))
                     .a(false, true, false, false, true, b(fru.a(dmo.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(fru.a(dmo.gh, "_nse")))
                     .a(false, true, false, true, true, b(fru.a(dmo.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(fru.a(dmo.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(fru.a(dmo.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(fru.a(dmo.gh, "_nsew")))
                     .a(true, false, false, false, false, b(fru.a(dmo.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(fru.a(dmo.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(fru.a(dmo.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(fru.a(dmo.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(fru.a(dmo.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(fru.a(dmo.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(fru.a(dmo.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(fru.a(dmo.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(fru.a(dmo.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(fru.a(dmo.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(fru.a(dmo.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(fru.a(dmo.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(fru.a(dmo.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(fru.a(dmo.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(fru.a(dmo.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(fru.a(dmo.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dmo.gg);
      this.j.accept(frn.a(dmo.gg).a(fro.a(ebe.a, ebe.A).a(($$0, $$1) -> b(fru.a(dmo.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(s));
   }

   private gsh a(int $$0, String $$1, frx $$2) {
      return switch ($$0) {
         case 1 -> a(frw.bw.a(fru.a($$1 + "turtle_egg"), $$2, this.l));
         case 2 -> a(frw.bx.a(fru.a("two_" + $$1 + "turtle_eggs"), $$2, this.l));
         case 3 -> a(frw.by.a(fru.a("three_" + $$1 + "turtle_eggs"), $$2, this.l));
         case 4 -> a(frw.bz.a(fru.a("four_" + $$1 + "turtle_eggs"), $$2, this.l));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gsh a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", frx.b(frx.J(dmo.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", frx.b(frx.a(dmo.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", frx.b(frx.a(dmo.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(czo.kT);
      this.j.accept(frn.a(dmo.mL).a(fro.a(ebe.aG, ebe.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      this.b(czo.kU);
      this.j.accept(frn.a(dmo.mM).a(fro.a(due.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         frx $$2 = frx.a($$1);
         return b(frw.bH.a(dmo.mM, $$1, $$2, this.l));
      })));
   }

   private void J(dmm $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dmm $$0, czg $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends ebr<?>> Map<T, gsi> a(eaq<?, ?> $$0, Function<jb, T> $$1) {
      Builder<T, gsi> $$2 = ImmutableMap.builderWithExpectedSize(v.size());
      v.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dmm $$0) {
      Map<ebr<Boolean>, gsi> $$1 = a($$0.m(), drs::b);
      frl $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      gsd $$3 = b(fru.a($$0));
      frm $$4 = frm.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.j.accept($$4);
   }

   private void L(dmm $$0) {
      Map<ebr<ecb>, gsi> $$1 = a($$0.m(), drq::a);
      frl $$2 = b().a(drq.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, ecb.a));
      gsd $$3 = b(frz.j.create($$0, this.l));
      gsd $$4 = b(frz.k.get($$0).a($$1x -> $$1x.a(fry.i, frx.a($$0, "_side_tall"))).a($$0, "_side_tall", this.l));
      gsd $$5 = b(frz.k.get($$0).a($$1x -> $$1x.a(fry.i, frx.a($$0, "_side_small"))).a($$0, "_side_small", this.l));
      frm $$6 = frm.a($$0);
      $$6.a(b().a(drq.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, ecb.c), $$4.a($$5x));
         $$6.a(b().a($$4x, ecb.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.j.accept($$6);
   }

   private void M(dmm $$0) {
      this.c($$0);
      this.j.accept(frn.a($$0).a(fro.a(dqh.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         frx $$3 = frx.c(frx.a($$0, $$2));
         return b(frf.d.b.a().a($$0, $$2, $$3, this.l));
      })));
   }

   private void au() {
      alg $$0 = frx.a(dmo.rC, "_bottom");
      frx $$1 = new frx().a(fry.e, $$0).a(fry.f, frx.a(dmo.rC, "_top")).a(fry.i, frx.a(dmo.rC, "_side"));
      frx $$2 = new frx().a(fry.e, $$0).a(fry.f, frx.a(dmo.rC, "_top_bloom")).a(fry.i, frx.a(dmo.rC, "_side_bloom"));
      alg $$3 = frw.n.a(dmo.rC, $$1, this.l);
      gsd $$4 = b($$3);
      gsd $$5 = b(frw.n.a(dmo.rC, "_bloom", $$2, this.l));
      this.j.accept(frn.a(dmo.rC).a(fro.a(ebe.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dmo.rC, $$3);
   }

   private void av() {
      dmm $$0 = dmo.cw;
      gsd $$1 = b(fru.a($$0));
      frm $$2 = frm.a($$0);
      List.of(Pair.of(jb.c, a), Pair.of(jb.f, f), Pair.of(jb.d, g), Pair.of(jb.e, h)).forEach($$2x -> {
         jb $$3 = (jb)$$2x.getFirst();
         gsi $$4 = (gsi)$$2x.getSecond();
         gsl $$5 = b().a(ebe.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.j.accept($$2);
      this.a($$0, fru.a($$0, "_inventory"));
      w.clear();
   }

   private void a(frm $$0, gsl $$1, gsi $$2) {
      List.of(
            Pair.of(ebe.bs, frw.aT),
            Pair.of(ebe.bt, frw.aU),
            Pair.of(ebe.bu, frw.aV),
            Pair.of(ebe.bv, frw.aW),
            Pair.of(ebe.bw, frw.aX),
            Pair.of(ebe.bx, frw.aY)
         )
         .forEach($$3 -> {
            ebf $$4 = (ebf)$$3.getFirst();
            frv $$5 = (frv)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(frm $$0, gsl $$1, gsi $$2, ebf $$3, frv $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      frx $$7 = new frx().a(fry.b, frx.a(dmo.cw, $$6));
      frf.c $$8 = new frf.c($$4, $$6);
      gsd $$9 = b(w.computeIfAbsent($$8, $$3x -> $$4.a(dmo.cw, $$6, $$7, this.l)));
      $$0.a(new gsk(gsk.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void aw() {
      gsd $$0 = b(frw.c.a(dmo.lp, frx.b(fru.a("magma")), this.l));
      this.j.accept(a(dmo.lp, $$0));
   }

   private void a(dmm $$0, @Nullable cyi $$1) {
      this.r($$0);
      czg $$2 = $$0.h();
      alg $$3 = frw.bO.a($$2, frx.x($$0), this.l);
      hfz.b $$4 = $$1 != null ? frs.a($$3, new him.a($$1)) : frs.a($$3, new him.a());
      this.k.a($$2, $$4);
   }

   private void c(dmm $$0, dmm $$1, frf.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ax() {
      alg $$0 = fru.a(dmo.b);
      gsh $$1 = a($$0);
      gsh $$2 = a(fru.a(dmo.b, "_mirrored"));
      this.j.accept(frn.a(dmo.ff, a($$1, $$2)));
      this.a(dmo.ff, $$0);
   }

   private void ay() {
      alg $$0 = fru.a(dmo.tt);
      gsh $$1 = a($$0);
      gsh $$2 = a(fru.a(dmo.tt, "_mirrored"));
      this.j.accept(frn.a(dmo.tN, a($$1, $$2)).a(c()));
      this.a(dmo.tN, $$0);
   }

   private void n(dmm $$0, dmm $$1) {
      this.a($$0, frf.d.b);
      frx $$2 = frx.d(frx.a($$0, "_pot"));
      gsd $$3 = b(frf.d.b.b().a($$1, $$2, this.l));
      this.j.accept(a($$1, $$3));
   }

   private void az() {
      alg $$0 = frx.a(dmo.pT, "_bottom");
      alg $$1 = frx.a(dmo.pT, "_top_off");
      alg $$2 = frx.a(dmo.pT, "_top");
      alg[] $$3 = new alg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         frx $$5 = new frx().a(fry.e, $$0).a(fry.f, $$4 == 0 ? $$1 : $$2).a(fry.i, frx.a(dmo.pT, "_side" + $$4));
         $$3[$$4] = frw.n.a(dmo.pT, "_" + $$4, $$5, this.l);
      }

      this.j.accept(frn.a(dmo.pT).a(fro.a(ebe.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dmo.pT, $$3[0]);
   }

   private static gsi a(jd $$0) {
      return switch ($$0) {
         case b -> c;
         case c -> c.then(g);
         case d -> c.then(h);
         case a -> c.then(f);
         case f -> e.then(g);
         case g -> e;
         case h -> e.then(f);
         case e -> e.then(h);
         case k -> a;
         case l -> g;
         case i -> h;
         case j -> f;
      };
   }

   private void aA() {
      alg $$0 = frx.a(dmo.pH, "_top");
      alg $$1 = frx.a(dmo.pH, "_bottom");
      alg $$2 = frx.a(dmo.pH, "_side");
      alg $$3 = frx.a(dmo.pH, "_lock");
      frx $$4 = new frx().a(fry.o, $$2).a(fry.m, $$2).a(fry.l, $$2).a(fry.c, $$0).a(fry.j, $$0).a(fry.k, $$1).a(fry.n, $$3);
      this.j.accept(frn.a(dmo.pH, b(frw.b.a(dmo.pH, $$4, this.l))).a(fro.b(ebe.W).a(frf::a)));
   }

   private void aB() {
      dmm $$0 = dmo.n;
      gsd $$1 = b(fru.a($$0));
      frx $$2 = frx.a($$0);
      dmm $$3 = dmo.kk;
      gsd $$4 = b(frw.ab.a($$3, $$2, this.l));
      gsd $$5 = b(frw.ac.a($$3, $$2, this.l));
      this.j.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dmm $$0, dmm $$1, dty.a $$2, alg $$3) {
      gsd $$4 = b(fru.a("skull"));
      this.j.accept(a($$0, $$4));
      this.j.accept(a($$1, $$4));
      this.k.a($$0.h(), frs.a($$3, new hin.a($$2)));
   }

   private void aC() {
      alg $$0 = fru.b("template_skull");
      this.a(dmo.hn, dmo.ho, dty.b.g, $$0);
      this.a(dmo.hl, dmo.hm, dty.b.e, $$0);
      this.a(dmo.hj, dmo.hk, dty.b.f, $$0);
      this.a(dmo.hf, dmo.hg, dty.b.c, $$0);
      this.a(dmo.hh, dmo.hi, dty.b.d, $$0);
      this.a(dmo.hr, dmo.hs, dty.b.h, $$0);
      this.a(dmo.hp, dmo.hq, dty.b.i, fru.a(czo.vA));
   }

   private void a(dmm $$0, dmm $$1, cyi $$2) {
      gsd $$3 = b(fru.a("banner"));
      alg $$4 = fru.b("template_banner");
      this.j.accept(a($$0, $$3));
      this.j.accept(a($$1, $$3));
      czg $$5 = $$0.h();
      this.k.a($$5, frs.a($$4, new hie.a($$2)));
   }

   private void aD() {
      this.a(dmo.jl, dmo.jB, cyi.a);
      this.a(dmo.jm, dmo.jC, cyi.b);
      this.a(dmo.jn, dmo.jD, cyi.c);
      this.a(dmo.jo, dmo.jE, cyi.d);
      this.a(dmo.jp, dmo.jF, cyi.e);
      this.a(dmo.jq, dmo.jG, cyi.f);
      this.a(dmo.jr, dmo.jH, cyi.g);
      this.a(dmo.js, dmo.jI, cyi.h);
      this.a(dmo.jt, dmo.jJ, cyi.i);
      this.a(dmo.ju, dmo.jK, cyi.j);
      this.a(dmo.jv, dmo.jL, cyi.k);
      this.a(dmo.jw, dmo.jM, cyi.l);
      this.a(dmo.jx, dmo.jN, cyi.m);
      this.a(dmo.jy, dmo.jO, cyi.n);
      this.a(dmo.jz, dmo.jP, cyi.o);
      this.a(dmo.jA, dmo.jQ, cyi.p);
   }

   private void a(dmm $$0, dmm $$1, alg $$2, boolean $$3) {
      this.a($$0, $$1);
      czg $$4 = $$0.h();
      alg $$5 = frw.bQ.a($$4, frx.x($$1), this.l);
      hfz.b $$6 = frs.a($$5, new hig.a($$2));
      if ($$3) {
         hfz.b $$7 = frs.a($$5, new hig.a(hig.a));
         this.k.a($$4, frs.b($$7, $$6));
      } else {
         this.k.a($$4, $$6);
      }
   }

   private void aE() {
      this.a(dmo.cG, dmo.n, hig.b, true);
      this.a(dmo.hw, dmo.n, hig.c, true);
      this.a(dmo.gf, dmo.cy, hig.d, false);
   }

   private void b(dmm $$0, dmm $$1, cyi $$2) {
      gsd $$3 = b(fru.a("bed"));
      this.j.accept(a($$0, $$3));
      czg $$4 = $$0.h();
      alg $$5 = frw.bP.a(fru.a($$4), frx.x($$1), this.l);
      this.k.a($$4, frs.a($$5, new hif.a($$2)));
   }

   private void aF() {
      this.b(dmo.bg, dmo.bK, cyi.a);
      this.b(dmo.bh, dmo.bL, cyi.b);
      this.b(dmo.bi, dmo.bM, cyi.c);
      this.b(dmo.bj, dmo.bN, cyi.d);
      this.b(dmo.bk, dmo.bO, cyi.e);
      this.b(dmo.bl, dmo.bP, cyi.f);
      this.b(dmo.bm, dmo.bQ, cyi.g);
      this.b(dmo.bn, dmo.bR, cyi.h);
      this.b(dmo.bo, dmo.bS, cyi.i);
      this.b(dmo.bp, dmo.bT, cyi.j);
      this.b(dmo.bq, dmo.bU, cyi.k);
      this.b(dmo.br, dmo.bV, cyi.l);
      this.b(dmo.bs, dmo.bW, cyi.m);
      this.b(dmo.bt, dmo.bX, cyi.n);
      this.b(dmo.bu, dmo.bY, cyi.o);
      this.b(dmo.bv, dmo.bZ, cyi.p);
   }

   private void a(dmm $$0, hio.a $$1) {
      czg $$2 = $$0.h();
      alg $$3 = fru.a($$2);
      this.k.a($$2, frs.a($$3, $$1));
   }

   public void a() {
      mj.a().filter(mk::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dmo.rN).a(mj.x).a(dmo.rN, dmo.sl).a(dmo.rR, dmo.rV).a(mj.z);
      this.i(dmo.rM).a(mj.B).a(dmo.rM, dmo.sk).a(dmo.rQ, dmo.rU).a(mj.D);
      this.i(dmo.rL).a(mj.F).a(dmo.rL, dmo.sj).a(dmo.rP, dmo.rT).a(mj.H);
      this.i(dmo.rK).a(mj.J).a(dmo.rK, dmo.si).a(dmo.rO, dmo.rS).a(mj.L);
      this.A(dmo.sS);
      this.A(dmo.sT);
      this.A(dmo.sU);
      this.A(dmo.sV);
      this.j(dmo.sS, dmo.sW);
      this.j(dmo.sT, dmo.sX);
      this.j(dmo.sU, dmo.sY);
      this.j(dmo.sV, dmo.sZ);
      this.n(dmo.a);
      this.d(dmo.nI, dmo.a);
      this.d(dmo.nH, dmo.a);
      this.n(dmo.gn);
      this.n(dmo.eg);
      this.d(dmo.nJ, dmo.J);
      this.n(dmo.fZ);
      this.n(dmo.mK);
      this.n(dmo.fQ);
      this.n(dmo.gq);
      this.b(czo.vo);
      this.n(dmo.pO);
      this.n(dmo.J);
      this.n(dmo.K);
      this.n(dmo.ix);
      this.b(czo.go);
      this.o(dmo.qu, dmo.qL);
      this.o(dmo.qv, dmo.qM);
      this.o(dmo.qw, dmo.qN);
      this.o(dmo.qx, dmo.qO);
      this.o(dmo.qy, dmo.qP);
      this.o(dmo.qz, dmo.qQ);
      this.o(dmo.qA, dmo.qR);
      this.o(dmo.qB, dmo.qS);
      this.o(dmo.qC, dmo.qT);
      this.o(dmo.qD, dmo.qU);
      this.o(dmo.qE, dmo.qV);
      this.o(dmo.qF, dmo.qW);
      this.o(dmo.qG, dmo.qX);
      this.o(dmo.qH, dmo.qY);
      this.o(dmo.qI, dmo.qZ);
      this.o(dmo.qJ, dmo.ra);
      this.o(dmo.qt, dmo.qK);
      this.n(dmo.nG);
      this.n(dmo.gS);
      this.n(dmo.rx);
      this.n(dmo.tf);
      this.w(dmo.tg);
      this.w(dmo.th);
      this.x(dmo.tS);
      this.x(dmo.tT);
      this.ag();
      this.h(dmo.tm, dmo.ti);
      this.L(dmo.uf);
      this.M(dmo.ug);
      this.a(dmo.ue);
      this.t(dmo.tj);
      this.t(dmo.tk);
      this.s(dmo.tl);
      this.b(dmo.ul, frf.d.c);
      this.b(czo.da);
      this.a(dmo.iy, czo.if);
      this.b(czo.if);
      this.aG();
      this.a(dmo.lt, czo.jF);
      this.b(czo.jF);
      this.b(dmo.ca, frx.a(dmo.bI, "_side"));
      this.a(dmo.U);
      this.a(dmo.V);
      this.a(dmo.jd);
      this.a(dmo.cI);
      this.a(dmo.cJ);
      this.a(dmo.cK);
      this.a(dmo.gd);
      this.a(dmo.ge);
      this.a(dmo.gi);
      this.a(dmo.Q);
      this.a(dmo.W);
      this.a(dmo.R);
      this.a(dmo.cr);
      this.a(dmo.S);
      this.a(dmo.T);
      this.a(dmo.cs);
      this.b(dmo.pR, frz.d);
      this.a(dmo.pQ);
      this.a(dmo.aY);
      this.a(dmo.aZ);
      this.a(dmo.ba);
      this.a(dmo.fG);
      this.a(dmo.hC);
      this.a(dmo.dY);
      this.a(dmo.dZ);
      this.a(dmo.hB);
      this.a(dmo.qk);
      this.a(dmo.nC);
      this.a(dmo.ei);
      this.a(dmo.k);
      this.a(dmo.pS);
      this.a(dmo.fY);
      this.a(dmo.et);
      this.a(dmo.O);
      this.a(dmo.pP);
      this.a(dmo.ee);
      this.b(dmo.ek, frz.g);
      this.b(dmo.pY, frz.d);
      this.b(dmo.fs, frz.d);
      this.n(dmo.ag);
      this.n(dmo.gA);
      this.a(dmo.lq);
      this.a(dmo.bf);
      this.a(dmo.je);
      this.a(dmo.cy);
      this.a(dmo.qs);
      this.a(dmo.iK);
      this.a(dmo.pe);
      this.a(dmo.en);
      this.a(dmo.eo);
      this.b(dmo.cD, frz.b);
      this.g(dmo.cE);
      this.a(dmo.aV);
      this.b(dmo.bG, frz.z);
      this.b(czo.dd);
      this.b(dmo.cu, frz.f);
      this.b(dmo.pL, frz.d);
      this.a(dmo.oV);
      this.a(dmo.aW);
      this.a(dmo.rb);
      this.a(dmo.rc);
      this.a(dmo.rv);
      this.a(dmo.tc);
      this.a(dmo.tP);
      this.a(dmo.tQ);
      this.a(dmo.tR);
      this.d(dmo.rA);
      this.n(dmo.ud);
      this.aB();
      this.a(dmo.rI);
      this.a(dmo.rJ);
      this.a(dmo.rE);
      this.a(dmo.rF);
      this.a(dmo.rG);
      this.a(dmo.rH);
      this.l(dmo.rE, dmo.se);
      this.l(dmo.rF, dmo.sg);
      this.l(dmo.rG, dmo.sf);
      this.l(dmo.rH, dmo.sh);
      this.j(dmo.su);
      this.j(dmo.sv);
      this.j(dmo.sx);
      this.j(dmo.sw);
      this.b(dmo.su, dmo.sy);
      this.b(dmo.sv, dmo.sz);
      this.b(dmo.sx, dmo.sB);
      this.b(dmo.sw, dmo.sA);
      this.l(dmo.sC);
      this.l(dmo.sD);
      this.l(dmo.sF);
      this.l(dmo.sE);
      this.c(dmo.sC, dmo.sG);
      this.c(dmo.sD, dmo.sH);
      this.c(dmo.sF, dmo.sJ);
      this.c(dmo.sE, dmo.sI);
      this.a(dmo.sK);
      this.a(dmo.sL);
      this.a(dmo.sM);
      this.a(dmo.sN);
      this.l(dmo.sK, dmo.sO);
      this.l(dmo.sL, dmo.sP);
      this.l(dmo.sM, dmo.sQ);
      this.l(dmo.sN, dmo.sR);
      this.k(dmo.hx, dmo.cr);
      this.k(dmo.hy, dmo.cs);
      this.D();
      this.o();
      this.av();
      this.s();
      this.t();
      this.a(dmo.oM, dmo.oN);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dmo.kZ);
      this.G();
      this.H();
      this.I();
      this.J();
      this.M();
      this.N();
      this.O();
      this.P();
      this.n();
      this.Q();
      this.R();
      this.S();
      this.T();
      this.V();
      this.W();
      this.X();
      this.Y();
      this.Z();
      this.af();
      this.ai();
      this.ah();
      this.aj();
      this.ak();
      this.v();
      this.al();
      this.am();
      this.an();
      this.ap();
      this.ao();
      this.a(dmo.pJ);
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.d();
      this.J(dmo.fy);
      this.J(dmo.rB);
      this.b(dmo.fz, czo.gt);
      this.aw();
      this.aA();
      this.ac();
      this.ad();
      this.ae();
      this.U();
      this.L();
      this.K();
      this.aa();
      this.ab();
      this.I(dmo.da);
      this.c(dmo.da);
      this.I(dmo.oG);
      this.e();
      this.I(dmo.to);
      this.m(dmo.cz, dmo.cA);
      this.m(dmo.er, dmo.es);
      this.a(dmo.cL, dmo.n, frx::c);
      this.a(dmo.oE, dmo.p, frx::d);
      this.C(dmo.pc);
      this.C(dmo.oT);
      this.z(dmo.bb);
      this.z(dmo.hJ);
      this.z();
      this.H(dmo.oK);
      this.H(dmo.oL);
      this.c(dmo.fp, b(fru.a(dmo.fp)));
      this.a(dmo.ep, frz.d);
      this.a(dmo.eq, frz.d);
      this.a(dmo.tO);
      this.a(dmo.ls, frz.d);
      this.e(dmo.j);
      this.e(dmo.tr);
      this.e(dmo.L);
      this.f(dmo.M);
      this.f(dmo.P);
      this.e(dmo.N);
      this.d(dmo.I);
      this.b(dmo.tY, frz.f);
      this.a(dmo.iL, frz.d, frz.e);
      this.a(dmo.ld, frz.A, frz.B);
      this.a(dmo.hG, frz.A, frz.B);
      this.a(dmo.tU, frz.d, frz.e);
      this.a(dmo.tV, frz.d, frz.e);
      this.a(dmo.tW, frz.d, frz.e);
      this.c(dmo.oz, frz.i);
      this.w();
      this.a(dmo.pM, frx::D);
      this.a(dmo.pN, frx::F);
      this.a(dmo.lj, ebe.av, 0, 1, 2, 3);
      this.a(dmo.gT, ebe.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmo.fP, ebe.av, 0, 1, 1, 2);
      this.a(dmo.gU, ebe.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmo.cM, ebe.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dmo.lg, frf.d.b, ebe.at, 0, 1);
      this.g();
      this.f();
      this.aD();
      this.aF();
      this.aC();
      this.aE();
      this.a(dmo.lv, null);
      this.a(dmo.lw, cyi.a);
      this.a(dmo.lx, cyi.b);
      this.a(dmo.ly, cyi.c);
      this.a(dmo.lz, cyi.d);
      this.a(dmo.lA, cyi.e);
      this.a(dmo.lB, cyi.f);
      this.a(dmo.lC, cyi.g);
      this.a(dmo.lD, cyi.h);
      this.a(dmo.lE, cyi.i);
      this.a(dmo.lF, cyi.j);
      this.a(dmo.lG, cyi.k);
      this.a(dmo.lH, cyi.l);
      this.a(dmo.lI, cyi.m);
      this.a(dmo.lJ, cyi.n);
      this.a(dmo.lK, cyi.o);
      this.a(dmo.lL, cyi.p);
      this.r(dmo.nD);
      this.a(dmo.nD, new hih.a());
      this.a(dmo.tZ, dmo.jc);
      this.a(dmo.tZ, new hii.a());
      this.a(dmo.fW, dmo.cy);
      this.a(dmo.ll, dmo.cy);
      this.a(dmo.aT);
      this.a(dmo.aU);
      this.a(dmo.mc);
      this.a(dmo.md);
      this.a(dmo.me);
      this.a(dmo.mf);
      this.a(dmo.mg);
      this.a(dmo.mh);
      this.a(dmo.mi);
      this.a(dmo.mj);
      this.a(dmo.mk);
      this.a(dmo.ml);
      this.a(dmo.mm);
      this.a(dmo.mn);
      this.a(dmo.mo);
      this.a(dmo.mp);
      this.a(dmo.mq);
      this.a(dmo.mr);
      this.a(frz.a, dmo.ms, dmo.mt, dmo.mu, dmo.mv, dmo.mw, dmo.mx, dmo.my, dmo.mz, dmo.mA, dmo.mB, dmo.mC, dmo.mD, dmo.mE, dmo.mF, dmo.mG, dmo.mH);
      this.a(dmo.jc);
      this.a(dmo.hK);
      this.a(dmo.hL);
      this.a(dmo.hM);
      this.a(dmo.hN);
      this.a(dmo.hO);
      this.a(dmo.hP);
      this.a(dmo.hQ);
      this.a(dmo.hR);
      this.a(dmo.hS);
      this.a(dmo.hT);
      this.a(dmo.hU);
      this.a(dmo.hV);
      this.a(dmo.hW);
      this.a(dmo.hX);
      this.a(dmo.hY);
      this.a(dmo.hZ);
      this.a(dmo.rw);
      this.i(dmo.aX, dmo.fq);
      this.i(dmo.ez, dmo.ia);
      this.i(dmo.eA, dmo.ib);
      this.i(dmo.eB, dmo.ic);
      this.i(dmo.eC, dmo.id);
      this.i(dmo.eD, dmo.ie);
      this.i(dmo.eE, dmo.if);
      this.i(dmo.eF, dmo.ig);
      this.i(dmo.eG, dmo.ih);
      this.i(dmo.eH, dmo.ii);
      this.i(dmo.eI, dmo.ij);
      this.i(dmo.eJ, dmo.ik);
      this.i(dmo.eK, dmo.il);
      this.i(dmo.eL, dmo.im);
      this.i(dmo.eM, dmo.in);
      this.i(dmo.eN, dmo.io);
      this.i(dmo.eO, dmo.ip);
      this.b(frz.t, dmo.lM, dmo.lN, dmo.lO, dmo.lP, dmo.lQ, dmo.lR, dmo.lS, dmo.lT, dmo.lU, dmo.lV, dmo.lW, dmo.lX, dmo.lY, dmo.lZ, dmo.ma, dmo.mb);
      this.h(dmo.bK, dmo.iM);
      this.h(dmo.bL, dmo.iN);
      this.h(dmo.bM, dmo.iO);
      this.h(dmo.bN, dmo.iP);
      this.h(dmo.bO, dmo.iQ);
      this.h(dmo.bP, dmo.iR);
      this.h(dmo.bQ, dmo.iS);
      this.h(dmo.bR, dmo.iT);
      this.h(dmo.bS, dmo.iU);
      this.h(dmo.bT, dmo.iV);
      this.h(dmo.bU, dmo.iW);
      this.h(dmo.bV, dmo.iX);
      this.h(dmo.bW, dmo.iY);
      this.h(dmo.bX, dmo.iZ);
      this.h(dmo.bY, dmo.ja);
      this.h(dmo.bZ, dmo.jb);
      this.a(dmo.ts);
      this.a(dmo.fd);
      this.b(dmo.bB, dmo.gB, frf.d.a);
      this.h(dmo.bB);
      this.a(dmo.cb, dmo.gC, frf.d.b);
      this.a(dmo.cd, dmo.gD, frf.d.b);
      this.a(dmo.uh, dmo.uj, frf.d.c);
      this.a(dmo.ui, dmo.uk, frf.d.b);
      this.a(dmo.ce, dmo.gE, frf.d.b);
      this.a(dmo.cf, dmo.gF, frf.d.b);
      this.a(dmo.cg, dmo.gG, frf.d.b);
      this.a(dmo.ch, dmo.gH, frf.d.b);
      this.a(dmo.ci, dmo.gI, frf.d.b);
      this.a(dmo.cj, dmo.gJ, frf.d.b);
      this.a(dmo.ck, dmo.gK, frf.d.b);
      this.a(dmo.cl, dmo.gL, frf.d.b);
      this.a(dmo.cm, dmo.gM, frf.d.b);
      this.a(dmo.co, dmo.gN, frf.d.b);
      this.a(dmo.cn, dmo.gO, frf.d.b);
      this.a(dmo.cq, dmo.gP, frf.d.b);
      this.a(dmo.cp, dmo.gQ, frf.d.b);
      this.a(dmo.bC, dmo.gR, frf.d.b);
      this.a(dmo.cc, dmo.gr, frf.d.b);
      this.E();
      this.y(dmo.fl);
      this.y(dmo.fm);
      this.y(dmo.fn);
      this.b(dmo.bA, frf.d.a);
      this.h(dmo.bA);
      this.a(dmo.bE, frf.d.b);
      this.a(dmo.bF, frf.d.b);
      this.b(dmo.bD, frf.d.a);
      this.h(dmo.bD);
      this.b(dmo.ej, frf.d.a);
      this.b(czo.dW);
      this.c(dmo.mI, dmo.mJ, frf.d.b);
      this.b(czo.dX);
      this.b(dmo.tq, frf.d.b);
      this.c(dmo.pf, dmo.pg, frf.d.b);
      this.c(dmo.ph, dmo.pi, frf.d.b);
      this.a(dmo.pf, "_plant");
      this.a(dmo.ph, "_plant");
      this.a(dmo.nE, frf.d.a, frx.c(frx.a(dmo.nF, "_stage0")));
      this.k();
      this.a(dmo.eh, frf.d.b);
      this.a(dmo.bz, frf.d.b);
      this.d(dmo.jg, frf.d.b);
      this.d(dmo.jh, frf.d.b);
      this.d(dmo.ji, frf.d.b);
      this.o(dmo.jj);
      this.o(dmo.jk);
      this.h();
      this.i();
      this.j();
      this.a(dmo.nc, dmo.mX, dmo.mS, dmo.mN, dmo.nm, dmo.nh, dmo.nw, dmo.nr);
      this.a(dmo.nd, dmo.mY, dmo.mT, dmo.mO, dmo.nn, dmo.ni, dmo.nx, dmo.ns);
      this.a(dmo.ne, dmo.mZ, dmo.mU, dmo.mP, dmo.no, dmo.nj, dmo.ny, dmo.nt);
      this.a(dmo.nf, dmo.na, dmo.mV, dmo.mQ, dmo.np, dmo.nk, dmo.nz, dmo.nu);
      this.a(dmo.ng, dmo.nb, dmo.mW, dmo.mR, dmo.nq, dmo.nl, dmo.nA, dmo.nv);
      this.f(dmo.fw, dmo.fu);
      this.f(dmo.fv, dmo.ft);
      this.m(dmo.af).c(dmo.af).a(dmo.aA);
      this.m(dmo.ar).c(dmo.ar).a(dmo.aJ);
      this.a(dmo.ar, dmo.dx, dmo.dH);
      this.a(dmo.aS, frz.w, -7158200);
      this.m(dmo.ab).c(dmo.ab).a(dmo.ax);
      this.m(dmo.am).c(dmo.am).a(dmo.aF);
      this.a(dmo.am, dmo.dq, dmo.dC);
      this.a(dmo.D, dmo.gw, frf.d.b);
      this.a(dmo.aO, frz.w, -12012264);
      this.m(dmo.ac).d(dmo.ac).a(dmo.ay);
      this.m(dmo.an).d(dmo.an).a(dmo.aG);
      this.a(dmo.an, dmo.dr, dmo.dD);
      this.a(dmo.E, dmo.gx, frf.d.b);
      this.b(dmo.aP, frz.w);
      this.m(dmo.Z).c(dmo.Z).a(dmo.av);
      this.m(dmo.ak).c(dmo.ak).a(dmo.aD);
      this.a(dmo.ak, dmo.dp, dmo.dB);
      this.a(dmo.B, dmo.gu, frf.d.b);
      this.a(dmo.aM, frz.w, -8345771);
      this.m(dmo.X).c(dmo.X).a(dmo.at);
      this.m(dmo.aq).c(dmo.aq).a(dmo.aB);
      this.a(dmo.aq, dmo.dn, dmo.dz);
      this.a(dmo.z, dmo.gs, frf.d.b);
      this.a(dmo.aK, frz.w, -12012264);
      this.m(dmo.Y).c(dmo.Y).a(dmo.au);
      this.m(dmo.aj).c(dmo.aj).a(dmo.aC);
      this.a(dmo.aj, dmo.do, dmo.dA);
      this.a(dmo.A, dmo.gt, frf.d.b);
      this.a(dmo.aL, frz.w, -10380959);
      this.m(dmo.ad).c(dmo.ad).a(dmo.az);
      this.m(dmo.ao).c(dmo.ao).a(dmo.aH);
      this.a(dmo.ao, dmo.dt, dmo.dF);
      this.a(dmo.F, dmo.gy, frf.d.b);
      this.a(dmo.aQ, frz.w, -12012264);
      this.m(dmo.ae).c(dmo.ae).a(dmo.u);
      this.m(dmo.ap).c(dmo.ap).a(dmo.aI);
      this.a(dmo.ap, dmo.du, dmo.dG);
      this.a(dmo.G, dmo.gz, frf.d.b);
      this.b(dmo.aR, frz.w);
      this.m(dmo.aa).c(dmo.aa).a(dmo.aw);
      this.m(dmo.al).c(dmo.al).a(dmo.aE);
      this.a(dmo.al, dmo.ds, dmo.dE);
      this.a(dmo.C, dmo.gv, frf.d.b);
      this.a(dmo.aN, frz.w, -12012264);
      this.m(dmo.oY).b(dmo.oY).a(dmo.pa);
      this.m(dmo.oZ).b(dmo.oZ).a(dmo.pb);
      this.a(dmo.oZ, dmo.dv, dmo.dI);
      this.a(dmo.pd, dmo.pU, frf.d.b);
      this.n(dmo.pj, dmo.pW);
      this.m(dmo.oP).b(dmo.oP).a(dmo.oR);
      this.m(dmo.oQ).b(dmo.oQ).a(dmo.oS);
      this.a(dmo.oQ, dmo.dw, dmo.dJ);
      this.a(dmo.oU, dmo.pV, frf.d.b);
      this.n(dmo.oW, dmo.pX);
      this.m(dmo.ai).d(dmo.ai);
      this.m(dmo.as).d(dmo.as);
      this.a(dmo.x, dmo.dy, dmo.dK);
      this.b(dmo.oX, frf.d.b);
      this.b(czo.dT);
      this.j(dmo.dN);
      this.l(dmo.iA);
      this.r();
      this.p(dmo.db);
      this.q(dmo.bw);
      this.q(dmo.bx);
      this.q(dmo.hI);
      this.q();
      this.u(dmo.gm);
      this.u(dmo.lm);
      this.u(dmo.ln);
      this.v(dmo.ht);
      this.v(dmo.hu);
      this.v(dmo.hv);
      this.l();
      this.m();
      this.d(dmo.cO, frz.h);
      this.d(dmo.oC, frz.h);
      this.d(dmo.oB, frz.i);
      this.p();
      this.az();
      this.au();
      this.l(dmo.fc, dmo.fk);
      this.l(dmo.m, dmo.fg);
      this.l(dmo.fb, dmo.fj);
      this.l(dmo.fa, dmo.fi);
      this.ax();
      this.l(dmo.eZ, dmo.fh);
      this.ay();
   }

   private void aG() {
      hfz.b $$0 = frs.a(this.a(czo.ig));
      Map<Integer, hfz.b> $$1 = new HashMap<>(16);
      fro.a<gsd, Integer> $$2 = fro.a(ebe.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alg $$5 = frx.a(czo.ig, $$4);
         $$2.a($$3, b(frw.aa.a(dmo.iz, $$4, frx.h($$5), this.l)));
         hfz.b $$6 = frs.a(frw.bI.a(fru.a(czo.ig, $$4), frx.k($$5), this.l));
         $$1.put($$3, $$6);
      }

      this.k.a(czo.ig, frs.a(drg.c, $$0, $$1));
      this.j.accept(frn.a(dmo.iz).a($$2));
   }

   private void o(dmm $$0, dmm $$1) {
      this.b($$0.h());
      frx $$2 = frx.b(frx.J($$0));
      frx $$3 = frx.b(frx.a($$0, "_lit"));
      gsd $$4 = b(frw.bV.a($$0, "_one_candle", $$2, this.l));
      gsd $$5 = b(frw.bW.a($$0, "_two_candles", $$2, this.l));
      gsd $$6 = b(frw.bX.a($$0, "_three_candles", $$2, this.l));
      gsd $$7 = b(frw.bY.a($$0, "_four_candles", $$2, this.l));
      gsd $$8 = b(frw.bV.a($$0, "_one_candle_lit", $$3, this.l));
      gsd $$9 = b(frw.bW.a($$0, "_two_candles_lit", $$3, this.l));
      gsd $$10 = b(frw.bX.a($$0, "_three_candles_lit", $$3, this.l));
      gsd $$11 = b(frw.bY.a($$0, "_four_candles_lit", $$3, this.l));
      this.j
         .accept(
            frn.a($$0)
               .a(
                  fro.a(ebe.aC, ebe.u)
                     .a(1, false, $$4)
                     .a(2, false, $$5)
                     .a(3, false, $$6)
                     .a(4, false, $$7)
                     .a(1, true, $$8)
                     .a(2, true, $$9)
                     .a(3, true, $$10)
                     .a(4, true, $$11)
               )
         );
      gsd $$12 = b(frw.bZ.a($$1, frx.a($$0, false), this.l));
      gsd $$13 = b(frw.bZ.a($$1, "_lit", frx.a($$0, true), this.l));
      this.j.accept(frn.a($$1).a(a(ebe.u, $$13, $$12)));
   }

   class a {
      private final frx b;
      private final Map<frv, alg> c = new HashMap<>();
      @Nullable
      private mk d;
      @Nullable
      private gsh e;
      private final Set<dmm> f = new HashSet<>();

      public a(final frx $$0) {
         this.b = $$0;
      }

      public frf.a a(dmm $$0, frv $$1) {
         this.e = frf.a($$1.a($$0, this.b, frf.this.l));
         if (frf.n.containsKey($$0)) {
            frf.this.j.accept(frf.n.get($$0).create($$0, this.e, this.b, frf.this.l));
         } else {
            frf.this.j.accept(frf.a($$0, frf.a(this.e)));
         }

         return this;
      }

      public frf.a a(dmm $$0, dmm $$1) {
         alg $$2 = fru.a($$0);
         frf.this.j.accept(frf.a($$1, frf.b($$2)));
         frf.this.k.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public frf.a a(dmm $$0) {
         gsd $$1 = frf.b(frw.s.a($$0, this.b, frf.this.l));
         gsd $$2 = frf.b(frw.t.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$1, $$2));
         alg $$3 = frw.u.a($$0, this.b, frf.this.l);
         frf.this.a($$0, $$3);
         return this;
      }

      public frf.a b(dmm $$0) {
         gsd $$1 = frf.b(frw.M.a($$0, this.b, frf.this.l));
         gsd $$2 = frf.b(frw.N.a($$0, this.b, frf.this.l));
         gsd $$3 = frf.b(frw.O.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$1, $$2, $$3));
         alg $$4 = frw.P.a($$0, this.b, frf.this.l);
         frf.this.a($$0, $$4);
         return this;
      }

      public frf.a c(dmm $$0) {
         frx $$1 = frx.s($$0);
         gsd $$2 = frf.b(frw.D.a($$0, $$1, frf.this.l));
         gsd $$3 = frf.b(frw.E.a($$0, $$1, frf.this.l));
         gsd $$4 = frf.b(frw.F.a($$0, $$1, frf.this.l));
         gsd $$5 = frf.b(frw.G.a($$0, $$1, frf.this.l));
         gsd $$6 = frf.b(frw.H.a($$0, $$1, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$2, $$3, $$4, $$5, $$6));
         alg $$7 = frw.I.a($$0, $$1, frf.this.l);
         frf.this.a($$0, $$7);
         return this;
      }

      public frf.a d(dmm $$0) {
         gsd $$1 = frf.b(frw.J.a($$0, this.b, frf.this.l));
         gsd $$2 = frf.b(frw.K.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.b($$0, $$1, $$2));
         alg $$3 = frw.L.a($$0, this.b, frf.this.l);
         frf.this.a($$0, $$3);
         return this;
      }

      public frf.a e(dmm $$0) {
         frx $$1 = frx.s($$0);
         gsd $$2 = frf.b(frw.R.a($$0, $$1, frf.this.l));
         gsd $$3 = frf.b(frw.Q.a($$0, $$1, frf.this.l));
         gsd $$4 = frf.b(frw.T.a($$0, $$1, frf.this.l));
         gsd $$5 = frf.b(frw.S.a($$0, $$1, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public frf.a f(dmm $$0) {
         gsd $$1 = frf.b(frw.V.a($$0, this.b, frf.this.l));
         gsd $$2 = frf.b(frw.U.a($$0, this.b, frf.this.l));
         gsd $$3 = frf.b(frw.X.a($$0, this.b, frf.this.l));
         gsd $$4 = frf.b(frw.W.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public frf.a g(dmm $$0) {
         gsd $$1 = frf.b(frw.Y.a($$0, this.b, frf.this.l));
         gsd $$2 = frf.b(frw.Z.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.d($$0, $$1, $$2));
         return this;
      }

      public frf.a h(dmm $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dmm $$1 = this.d.b().get(mk.b.r);
            gsd $$2 = frf.b(frw.aa.a($$0, this.b, frf.this.l));
            frf.this.j.accept(frf.a($$0, $$2));
            frf.this.j.accept(frf.a($$1, $$2));
            frf.this.b($$0.h());
            return this;
         }
      }

      public frf.a i(dmm $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alg $$1 = this.a(frw.ab, $$0);
            gsd $$2 = frf.b(this.a(frw.ac, $$0));
            frf.this.j.accept(frf.e($$0, frf.b($$1), $$2, frf.a(this.e)));
            frf.this.a($$0, $$1);
            return this;
         }
      }

      public frf.a j(dmm $$0) {
         gsd $$1 = frf.b(this.a(frw.af, $$0));
         alg $$2 = this.a(frw.ae, $$0);
         gsd $$3 = frf.b(this.a(frw.ag, $$0));
         frf.this.j.accept(frf.b($$0, $$1, frf.b($$2), $$3));
         frf.this.a($$0, $$2);
         return this;
      }

      private frf.a k(dmm $$0) {
         frz $$1 = frf.t.getOrDefault($$0, frz.a.get($$0));
         gsd $$2 = frf.b($$1.a($$0, frf.this.l));
         frf.this.j.accept(frf.a($$0, $$2));
         return this;
      }

      private frf.a l(dmm $$0) {
         frf.this.j($$0);
         return this;
      }

      private void m(dmm $$0) {
         if (frf.m.contains($$0)) {
            frf.this.l($$0);
         } else {
            frf.this.k($$0);
         }
      }

      private alg a(frv $$0, dmm $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, frf.this.l));
      }

      public frf.a a(mk $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<frf.a, dmm> $$2 = frf.u.get($$0x);
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
      frk create(dmm var1, gsh var2, frx var3, BiConsumer<alg, frt> var4);
   }

   static record c(frv a, String b) {
   }

   static enum d {
      a(frw.ap, frw.as, false),
      b(frw.ao, frw.ar, false),
      c(frw.aq, frw.at, true);

      private final frv d;
      private final frv e;
      private final boolean f;

      private d(final frv $$0, final frv $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public frv a() {
         return this.d;
      }

      public frv b() {
         return this.e;
      }

      public alg a(frf $$0, dmm $$1) {
         czg $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public frx a(dmm $$0) {
         return this.f ? frx.e($$0) : frx.c($$0);
      }

      public frx b(dmm $$0) {
         return this.f ? frx.g($$0) : frx.f($$0);
      }
   }

   class e {
      private final frx b;

      public e(final frx $$0) {
         this.b = $$0;
      }

      public frf.e a(dmm $$0) {
         frx $$1 = this.b.c(fry.d, this.b.a(fry.i));
         alg $$2 = frw.j.a($$0, $$1, frf.this.l);
         frf.this.j.accept(frf.b($$0, frf.b($$2)));
         frf.this.a($$0, $$2);
         return this;
      }

      public frf.e b(dmm $$0) {
         alg $$1 = frw.j.a($$0, this.b, frf.this.l);
         frf.this.j.accept(frf.b($$0, frf.b($$1)));
         frf.this.a($$0, $$1);
         return this;
      }

      public frf.e c(dmm $$0) {
         alg $$1 = frw.j.a($$0, this.b, frf.this.l);
         gsd $$2 = frf.b(frw.k.a($$0, this.b, frf.this.l));
         frf.this.j.accept(frf.c($$0, frf.b($$1), $$2));
         frf.this.a($$0, $$1);
         return this;
      }

      public frf.e d(dmm $$0) {
         frf.this.j.accept(frf.a($$0, this.b, frf.this.l));
         frf.this.a($$0, frw.j.a($$0, this.b, frf.this.l));
         return this;
      }
   }
}
