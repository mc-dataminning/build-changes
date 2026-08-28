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

public class frk {
   final Consumer<frp> j;
   final frn k;
   final BiConsumer<alg, fry> l;
   static final List<dmr> m = List.of(dmt.eP, dmt.eV, dmt.iA);
   public static final gsn a = $$0 -> $$0;
   public static final gsn b = gsn.d.withValue(true);
   public static final gsn c = gsn.a.withValue(i.b);
   public static final gsn d = gsn.a.withValue(i.c);
   public static final gsn e = gsn.a.withValue(i.d);
   public static final gsn f = gsn.b.withValue(i.b);
   public static final gsn g = gsn.b.withValue(i.c);
   public static final gsn h = gsn.b.withValue(i.d);
   public static final gsn i = gsn.e.withValue(2);
   static final Map<dmr, frk.b> n = Map.of(dmt.b, frk::a, dmt.tt, frk::c, dmt.fe, frk::b);
   private static final frt<gsn> o = frt.b(ebj.R).a(jb.a, c).a(jb.b, e).a(jb.c, a).a(jb.d, g).a(jb.e, h).a(jb.f, f);
   private static final frt<gsn> p = frt.b(ebj.R).a(jb.a, d).a(jb.b, a).a(jb.c, c).a(jb.d, c.then(g)).a(jb.e, c.then(h)).a(jb.f, c.then(f));
   private static final frt<gsn> q = frt.b(ebj.T).a(jb.f, a).a(jb.d, f).a(jb.e, g).a(jb.c, h);
   private static final frt<gsn> r = frt.b(ebj.T).a(jb.d, a).a(jb.e, f).a(jb.c, g).a(jb.f, h);
   private static final frt<gsn> s = frt.b(ebj.T).a(jb.f, f).a(jb.d, g).a(jb.e, h).a(jb.c, a);
   static final Map<dmr, fse> t = ImmutableMap.builder()
      .put(dmt.bc, fse.C.get(dmt.bc))
      .put(dmt.jR, fse.C.get(dmt.jR))
      .put(dmt.kv, fse.a(fsc.a(dmt.bc, "_top")))
      .put(dmt.kx, fse.a(fsc.a(dmt.jR, "_top")))
      .put(dmt.be, fse.d.get(dmt.bc).a($$0 -> $$0.a(fsd.i, fsc.J(dmt.be))))
      .put(dmt.jT, fse.d.get(dmt.jR).a($$0 -> $$0.a(fsd.i, fsc.J(dmt.jT))))
      .put(dmt.hE, fse.d.get(dmt.hE))
      .put(dmt.kw, fse.a(fsc.a(dmt.hE, "_bottom")))
      .put(dmt.pZ, fse.D.get(dmt.pZ))
      .put(dmt.tt, fse.D.get(dmt.tt))
      .put(dmt.hF, fse.d.get(dmt.hF).a($$0 -> $$0.a(fsd.i, fsc.J(dmt.hF))))
      .put(dmt.bd, fse.d.get(dmt.bd).a($$0 -> {
         $$0.a(fsd.d, fsc.a(dmt.bc, "_top"));
         $$0.a(fsd.i, fsc.J(dmt.bd));
      }))
      .put(dmt.jS, fse.d.get(dmt.jS).a($$0 -> {
         $$0.a(fsd.d, fsc.a(dmt.jR, "_top"));
         $$0.a(fsd.i, fsc.J(dmt.jS));
      }))
      .put(dmt.ru, fse.D.get(dmt.ru))
      .put(dmt.rp, fse.D.get(dmt.rp))
      .build();
   static final Map<mk.b, BiConsumer<frk.a, dmr>> u = ImmutableMap.builder()
      .put(mk.b.a, frk.a::a)
      .put(mk.b.e, frk.a::l)
      .put(mk.b.b, frk.a::k)
      .put(mk.b.c, frk.a::k)
      .put(mk.b.f, frk.a::c)
      .put(mk.b.g, frk.a::d)
      .put(mk.b.h, frk.a::e)
      .put(mk.b.i, frk.a::f)
      .put(mk.b.k, frk.a::h)
      .put(mk.b.l, frk.a::i)
      .put(mk.b.m, frk.a::j)
      .put(mk.b.n, frk.a::g)
      .put(mk.b.p, frk.a::m)
      .put(mk.b.q, frk.a::b)
      .build();
   private static final Map<jb, gsn> v = ImmutableMap.of(jb.c, a, jb.f, f.then(b), jb.d, g.then(b), jb.e, h.then(b), jb.b, e.then(b), jb.a, c.then(b));
   private static final Map<frk.c, alg> w = new HashMap<>();

   static gsm a(alg $$0) {
      return new gsm($$0);
   }

   static gsi a(gsm $$0) {
      return new gsi(List.of($$0));
   }

   private static gsi a(gsm... $$0) {
      return new gsi(List.of($$0));
   }

   static gsi b(alg $$0) {
      return a(a($$0));
   }

   private static frq b() {
      return new frq();
   }

   private static gsq a(frq... $$0) {
      return new gsp(gsp.a.b, Stream.of($$0).map(frq::a).toList());
   }

   private static frp a(dmr $$0, gsm $$1, fsc $$2, BiConsumer<alg, fry> $$3) {
      gsm $$4 = a(fsb.e.a($$0, $$2, $$3));
      return frs.a($$0, a($$1, $$4));
   }

   private static frp b(dmr $$0, gsm $$1, fsc $$2, BiConsumer<alg, fry> $$3) {
      gsi $$4 = b(fsb.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static frp c(dmr $$0, gsm $$1, fsc $$2, BiConsumer<alg, fry> $$3) {
      gsm $$4 = a(fsb.l.a($$0, $$2, $$3));
      return frs.a($$0, a($$1, $$4)).a(c());
   }

   public frk(Consumer<frp> $$0, frn $$1, BiConsumer<alg, fry> $$2) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   private void a(czj $$0, alg $$1) {
      this.k.a($$0, frx.a($$1));
   }

   void a(dmr $$0, alg $$1) {
      this.k.a($$0.h(), frx.a($$1));
   }

   private void a(dmr $$0, alg $$1, frd $$2) {
      this.k.a($$0.h(), frx.a($$1, $$2));
   }

   private alg a(czj $$0) {
      return fsb.bI.a(frz.a($$0), fsc.b($$0), this.l);
   }

   alg a(czj $$0, dmr $$1) {
      return fsb.bI.a(frz.a($$0), fsc.I($$1), this.l);
   }

   private alg a(czj $$0, dmr $$1, String $$2) {
      return fsb.bI.a(frz.a($$0), fsc.k(fsc.a($$1, $$2)), this.l);
   }

   alg b(czj $$0, dmr $$1, String $$2) {
      alg $$3 = fsc.J($$1);
      alg $$4 = fsc.a($$1, $$2);
      return fsb.bM.a(frz.a($$0), fsc.c($$3, $$4), this.l);
   }

   void b(czj $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dmr $$0) {
      czj $$1 = $$0.h();
      if ($$1 != czr.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dmr $$0, String $$1) {
      czj $$2 = $$0.h();
      if ($$2 != czr.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dmr $$0, String $$1) {
      czj $$2 = $$0.h();
      if ($$2 != czr.a) {
         alg $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static gsi b(gsm $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static gsi a(gsm $$0, gsm $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static frt<gsi> a(ebk $$0, gsi $$1, gsi $$2) {
      return frt.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dmr $$0) {
      gsm $$1 = a(fse.a.create($$0, this.l));
      gsm $$2 = a(fse.c.create($$0, this.l));
      this.j.accept(frs.a($$0, a($$1, $$2)));
   }

   private void e(dmr $$0) {
      gsm $$1 = a(fse.a.create($$0, this.l));
      this.j.accept(frs.a($$0, b($$1)));
   }

   private void f(dmr $$0) {
      this.j.accept(frs.a($$0).a(frt.a(ebj.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alg $$3 = fsc.a($$0, $$2);
         alg $$4 = fsb.c.a($$0, $$2, new fsc().a(fsd.a, $$3), this.l);
         return b($$4);
      })));
      this.a($$0, frz.a($$0, "_0"));
   }

   static frp a(dmr $$0, gsi $$1, gsi $$2) {
      return frs.a($$0)
         .a(frt.a(ebj.A).a(false, $$1).a(true, $$2))
         .a(
            frt.b(ebj.X, ebj.T)
               .a(ebe.a, jb.f, f)
               .a(ebe.a, jb.e, h)
               .a(ebe.a, jb.d, g)
               .a(ebe.a, jb.c, a)
               .a(ebe.b, jb.f, f.then(c).then(b))
               .a(ebe.b, jb.e, h.then(c).then(b))
               .a(ebe.b, jb.d, g.then(c).then(b))
               .a(ebe.b, jb.c, c.then(b))
               .a(ebe.c, jb.f, h.then(d))
               .a(ebe.c, jb.e, f.then(d))
               .a(ebe.c, jb.d, d)
               .a(ebe.c, jb.c, g.then(d))
         );
   }

   private static frp a(dmr $$0, gsi $$1, gsi $$2, gsi $$3, gsi $$4, gsi $$5, gsi $$6, gsi $$7, gsi $$8) {
      return frs.a($$0)
         .a(
            frt.a(ebj.T, ebj.ah, ebj.bh, ebj.y)
               .a(jb.f, ebp.b, ebo.a, false, $$1)
               .a(jb.d, ebp.b, ebo.a, false, $$1.a(f))
               .a(jb.e, ebp.b, ebo.a, false, $$1.a(g))
               .a(jb.c, ebp.b, ebo.a, false, $$1.a(h))
               .a(jb.f, ebp.b, ebo.b, false, $$3)
               .a(jb.d, ebp.b, ebo.b, false, $$3.a(f))
               .a(jb.e, ebp.b, ebo.b, false, $$3.a(g))
               .a(jb.c, ebp.b, ebo.b, false, $$3.a(h))
               .a(jb.f, ebp.b, ebo.a, true, $$2.a(f))
               .a(jb.d, ebp.b, ebo.a, true, $$2.a(g))
               .a(jb.e, ebp.b, ebo.a, true, $$2.a(h))
               .a(jb.c, ebp.b, ebo.a, true, $$2)
               .a(jb.f, ebp.b, ebo.b, true, $$4.a(h))
               .a(jb.d, ebp.b, ebo.b, true, $$4)
               .a(jb.e, ebp.b, ebo.b, true, $$4.a(f))
               .a(jb.c, ebp.b, ebo.b, true, $$4.a(g))
               .a(jb.f, ebp.a, ebo.a, false, $$5)
               .a(jb.d, ebp.a, ebo.a, false, $$5.a(f))
               .a(jb.e, ebp.a, ebo.a, false, $$5.a(g))
               .a(jb.c, ebp.a, ebo.a, false, $$5.a(h))
               .a(jb.f, ebp.a, ebo.b, false, $$7)
               .a(jb.d, ebp.a, ebo.b, false, $$7.a(f))
               .a(jb.e, ebp.a, ebo.b, false, $$7.a(g))
               .a(jb.c, ebp.a, ebo.b, false, $$7.a(h))
               .a(jb.f, ebp.a, ebo.a, true, $$6.a(f))
               .a(jb.d, ebp.a, ebo.a, true, $$6.a(g))
               .a(jb.e, ebp.a, ebo.a, true, $$6.a(h))
               .a(jb.c, ebp.a, ebo.a, true, $$6)
               .a(jb.f, ebp.a, ebo.b, true, $$8.a(h))
               .a(jb.d, ebp.a, ebo.b, true, $$8)
               .a(jb.e, ebp.a, ebo.b, true, $$8.a(f))
               .a(jb.c, ebp.a, ebo.b, true, $$8.a(g))
         );
   }

   static frp a(dmr $$0, gsi $$1, gsi $$2, gsi $$3, gsi $$4, gsi $$5) {
      return frr.a($$0).a($$1).a(b().a(ebj.N, true), $$2).a(b().a(ebj.O, true), $$3).a(b().a(ebj.P, true), $$4).a(b().a(ebj.Q, true), $$5);
   }

   static frp b(dmr $$0, gsi $$1, gsi $$2) {
      return frr.a($$0)
         .a($$1)
         .a(b().a(ebj.N, true), $$2.a(b))
         .a(b().a(ebj.O, true), $$2.a(f).a(b))
         .a(b().a(ebj.P, true), $$2.a(g).a(b))
         .a(b().a(ebj.Q, true), $$2.a(h).a(b));
   }

   static frp a(dmr $$0, gsi $$1, gsi $$2, gsi $$3) {
      return frr.a($$0)
         .a(b().a(ebj.L, true), $$1)
         .a(b().a(ebj.aa, ecg.b), $$2.a(b))
         .a(b().a(ebj.Z, ecg.b), $$2.a(f).a(b))
         .a(b().a(ebj.ab, ecg.b), $$2.a(g).a(b))
         .a(b().a(ebj.ac, ecg.b), $$2.a(h).a(b))
         .a(b().a(ebj.aa, ecg.c), $$3.a(b))
         .a(b().a(ebj.Z, ecg.c), $$3.a(f).a(b))
         .a(b().a(ebj.ab, ecg.c), $$3.a(g).a(b))
         .a(b().a(ebj.ac, ecg.c), $$3.a(h).a(b));
   }

   static frp a(dmr $$0, gsi $$1, gsi $$2, gsi $$3, gsi $$4, boolean $$5) {
      return frs.a($$0).a(frt.a(ebj.t, ebj.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(r);
   }

   static frp b(dmr $$0, gsi $$1, gsi $$2, gsi $$3) {
      return frs.a($$0)
         .a(
            frt.a(ebj.T, ebj.ai, ebj.bl)
               .a(jb.f, ebs.b, ecc.a, $$2)
               .a(jb.e, ebs.b, ecc.a, $$2.a(g).a(b))
               .a(jb.d, ebs.b, ecc.a, $$2.a(f).a(b))
               .a(jb.c, ebs.b, ecc.a, $$2.a(h).a(b))
               .a(jb.f, ebs.b, ecc.e, $$3)
               .a(jb.e, ebs.b, ecc.e, $$3.a(g).a(b))
               .a(jb.d, ebs.b, ecc.e, $$3.a(f).a(b))
               .a(jb.c, ebs.b, ecc.e, $$3.a(h).a(b))
               .a(jb.f, ebs.b, ecc.d, $$3.a(h).a(b))
               .a(jb.e, ebs.b, ecc.d, $$3.a(f).a(b))
               .a(jb.d, ebs.b, ecc.d, $$3)
               .a(jb.c, ebs.b, ecc.d, $$3.a(g).a(b))
               .a(jb.f, ebs.b, ecc.c, $$1)
               .a(jb.e, ebs.b, ecc.c, $$1.a(g).a(b))
               .a(jb.d, ebs.b, ecc.c, $$1.a(f).a(b))
               .a(jb.c, ebs.b, ecc.c, $$1.a(h).a(b))
               .a(jb.f, ebs.b, ecc.b, $$1.a(h).a(b))
               .a(jb.e, ebs.b, ecc.b, $$1.a(f).a(b))
               .a(jb.d, ebs.b, ecc.b, $$1)
               .a(jb.c, ebs.b, ecc.b, $$1.a(g).a(b))
               .a(jb.f, ebs.a, ecc.a, $$2.a(d).a(b))
               .a(jb.e, ebs.a, ecc.a, $$2.a(d).a(g).a(b))
               .a(jb.d, ebs.a, ecc.a, $$2.a(d).a(f).a(b))
               .a(jb.c, ebs.a, ecc.a, $$2.a(d).a(h).a(b))
               .a(jb.f, ebs.a, ecc.e, $$3.a(d).a(f).a(b))
               .a(jb.e, ebs.a, ecc.e, $$3.a(d).a(h).a(b))
               .a(jb.d, ebs.a, ecc.e, $$3.a(d).a(g).a(b))
               .a(jb.c, ebs.a, ecc.e, $$3.a(d).a(b))
               .a(jb.f, ebs.a, ecc.d, $$3.a(d).a(b))
               .a(jb.e, ebs.a, ecc.d, $$3.a(d).a(g).a(b))
               .a(jb.d, ebs.a, ecc.d, $$3.a(d).a(f).a(b))
               .a(jb.c, ebs.a, ecc.d, $$3.a(d).a(h).a(b))
               .a(jb.f, ebs.a, ecc.c, $$1.a(d).a(f).a(b))
               .a(jb.e, ebs.a, ecc.c, $$1.a(d).a(h).a(b))
               .a(jb.d, ebs.a, ecc.c, $$1.a(d).a(g).a(b))
               .a(jb.c, ebs.a, ecc.c, $$1.a(d).a(b))
               .a(jb.f, ebs.a, ecc.b, $$1.a(d).a(b))
               .a(jb.e, ebs.a, ecc.b, $$1.a(d).a(g).a(b))
               .a(jb.d, ebs.a, ecc.b, $$1.a(d).a(f).a(b))
               .a(jb.c, ebs.a, ecc.b, $$1.a(d).a(h).a(b))
         );
   }

   private static frp c(dmr $$0, gsi $$1, gsi $$2, gsi $$3) {
      return frs.a($$0)
         .a(
            frt.a(ebj.T, ebj.ai, ebj.y)
               .a(jb.c, ebs.b, false, $$2)
               .a(jb.d, ebs.b, false, $$2.a(g))
               .a(jb.f, ebs.b, false, $$2.a(f))
               .a(jb.e, ebs.b, false, $$2.a(h))
               .a(jb.c, ebs.a, false, $$1)
               .a(jb.d, ebs.a, false, $$1.a(g))
               .a(jb.f, ebs.a, false, $$1.a(f))
               .a(jb.e, ebs.a, false, $$1.a(h))
               .a(jb.c, ebs.b, true, $$3)
               .a(jb.d, ebs.b, true, $$3.a(g))
               .a(jb.f, ebs.b, true, $$3.a(f))
               .a(jb.e, ebs.b, true, $$3.a(h))
               .a(jb.c, ebs.a, true, $$3.a(d).a(g))
               .a(jb.d, ebs.a, true, $$3.a(d))
               .a(jb.f, ebs.a, true, $$3.a(d).a(h))
               .a(jb.e, ebs.a, true, $$3.a(d).a(f))
         );
   }

   private static frp d(dmr $$0, gsi $$1, gsi $$2, gsi $$3) {
      return frs.a($$0)
         .a(
            frt.a(ebj.T, ebj.ai, ebj.y)
               .a(jb.c, ebs.b, false, $$2)
               .a(jb.d, ebs.b, false, $$2)
               .a(jb.f, ebs.b, false, $$2)
               .a(jb.e, ebs.b, false, $$2)
               .a(jb.c, ebs.a, false, $$1)
               .a(jb.d, ebs.a, false, $$1)
               .a(jb.f, ebs.a, false, $$1)
               .a(jb.e, ebs.a, false, $$1)
               .a(jb.c, ebs.b, true, $$3)
               .a(jb.d, ebs.b, true, $$3.a(g))
               .a(jb.f, ebs.b, true, $$3.a(f))
               .a(jb.e, ebs.b, true, $$3.a(h))
               .a(jb.c, ebs.a, true, $$3)
               .a(jb.d, ebs.a, true, $$3.a(g))
               .a(jb.f, ebs.a, true, $$3.a(f))
               .a(jb.e, ebs.a, true, $$3.a(h))
         );
   }

   static frs a(dmr $$0, gsi $$1) {
      return frs.a($$0, $$1);
   }

   private static frt<gsn> c() {
      return frt.b(ebj.K).a(jb.a.b, a).a(jb.a.c, c).a(jb.a.a, c.then(f));
   }

   static frp a(dmr $$0, fsc $$1, BiConsumer<alg, fry> $$2) {
      gsi $$3 = b(fsb.g.a($$0, $$1, $$2));
      gsi $$4 = b(fsb.h.a($$0, $$1, $$2));
      gsi $$5 = b(fsb.i.a($$0, $$1, $$2));
      return frs.a($$0).a(frt.a(ebj.K).a(jb.a.a, $$3).a(jb.a.b, $$4).a(jb.a.c, $$5));
   }

   static frp b(dmr $$0, gsi $$1) {
      return frs.a($$0, $$1).a(c());
   }

   private void c(dmr $$0, gsi $$1) {
      this.j.accept(b($$0, $$1));
   }

   public void a(dmr $$0, fse.a $$1) {
      gsi $$2 = b($$1.create($$0, this.l));
      this.j.accept(b($$0, $$2));
   }

   private void c(dmr $$0, fse.a $$1) {
      gsi $$2 = b($$1.create($$0, this.l));
      this.j.accept(frs.a($$0, $$2).a(s));
   }

   static frp c(dmr $$0, gsi $$1, gsi $$2) {
      return frs.a($$0).a(frt.a(ebj.K).a(jb.a.b, $$1).a(jb.a.c, $$2.a(c)).a(jb.a.a, $$2.a(c).a(f)));
   }

   private void a(dmr $$0, fse.a $$1, fse.a $$2) {
      gsi $$3 = b($$1.create($$0, this.l));
      gsi $$4 = b($$2.create($$0, this.l));
      this.j.accept(c($$0, $$3, $$4));
   }

   private void g(dmr $$0) {
      gsi $$1 = b(fse.A.create($$0, this.l));
      gsi $$2 = b(fse.B.create($$0, this.l));
      gsi $$3 = b(this.a(fse.A, $$0, "_awake"));
      gsi $$4 = b(this.a(fse.B, $$0, "_awake"));
      gsi $$5 = b(this.a(fse.A, $$0, "_dormant"));
      gsi $$6 = b(this.a(fse.B, $$0, "_dormant"));
      this.j
         .accept(
            frs.a($$0)
               .a(
                  frt.a(ebj.K, don.c)
                     .a(jb.a.b, ebn.a, $$1)
                     .a(jb.a.c, ebn.a, $$2.a(c))
                     .a(jb.a.a, ebn.a, $$2.a(c).a(f))
                     .a(jb.a.b, ebn.b, $$5)
                     .a(jb.a.c, ebn.b, $$6.a(c))
                     .a(jb.a.a, ebn.b, $$6.a(c).a(f))
                     .a(jb.a.b, ebn.c, $$3)
                     .a(jb.a.c, ebn.c, $$4.a(c))
                     .a(jb.a.a, ebn.c, $$4.a(c).a(f))
               )
         );
   }

   private alg a(fse.a $$0, dmr $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fsd.i, fsc.a($$1, $$2)).a(fsd.d, fsc.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.l);
   }

   private alg a(dmr $$0, String $$1, fsa $$2, Function<alg, fsc> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fsc.a($$0, $$1)), this.l);
   }

   static frp d(dmr $$0, gsi $$1, gsi $$2) {
      return frs.a($$0).a(a(ebj.A, $$2, $$1));
   }

   static frp e(dmr $$0, gsi $$1, gsi $$2, gsi $$3) {
      return frs.a($$0).a(frt.a(ebj.bk).a(ecb.b, $$1).a(ecb.a, $$2).a(ecb.c, $$3));
   }

   public void a(dmr $$0) {
      this.b($$0, fse.a);
   }

   public void b(dmr $$0, fse.a $$1) {
      this.j.accept(a($$0, b($$1.create($$0, this.l))));
   }

   public void a(dmr $$0, fse.a $$1, int $$2) {
      alg $$3 = $$1.create($$0, this.l);
      this.j.accept(a($$0, b($$3)));
      this.a($$0, $$3, frx.a($$2));
   }

   private void d() {
      this.K(dmt.fx);
      alg $$0 = this.a(czr.gr, dmt.fx);
      this.a(dmt.fx, $$0, frx.a(-12012264));
   }

   private void h(dmr $$0) {
      alg $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new frc());
   }

   private frk.a i(dmr $$0) {
      fse $$1 = t.getOrDefault($$0, fse.a.get($$0));
      return new frk.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dmr $$0, dmr $$1, dmr $$2) {
      gsi $$3 = this.g($$1, $$0);
      this.j.accept(a($$1, $$3));
      this.j.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dmr $$0) {
      fsc $$1 = fsc.w($$0);
      gsi $$2 = b(fsb.v.a($$0, $$1, this.l));
      gsi $$3 = b(fsb.w.a($$0, $$1, this.l));
      gsi $$4 = b(fsb.x.a($$0, $$1, this.l));
      gsi $$5 = b(fsb.y.a($$0, $$1, this.l));
      gsi $$6 = b(fsb.z.a($$0, $$1, this.l));
      gsi $$7 = b(fsb.A.a($$0, $$1, this.l));
      gsi $$8 = b(fsb.B.a($$0, $$1, this.l));
      gsi $$9 = b(fsb.C.a($$0, $$1, this.l));
      this.b($$0.h());
      this.j.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dmr $$0, dmr $$1) {
      gsi $$2 = b(fsb.v.a($$0));
      gsi $$3 = b(fsb.w.a($$0));
      gsi $$4 = b(fsb.x.a($$0));
      gsi $$5 = b(fsb.y.a($$0));
      gsi $$6 = b(fsb.z.a($$0));
      gsi $$7 = b(fsb.A.a($$0));
      gsi $$8 = b(fsb.B.a($$0));
      gsi $$9 = b(fsb.C.a($$0));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dmr $$0) {
      fsc $$1 = fsc.b($$0);
      gsi $$2 = b(fsb.ak.a($$0, $$1, this.l));
      alg $$3 = fsb.al.a($$0, $$1, this.l);
      gsi $$4 = b(fsb.am.a($$0, $$1, this.l));
      this.j.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dmr $$0) {
      fsc $$1 = fsc.b($$0);
      gsi $$2 = b(fsb.ah.a($$0, $$1, this.l));
      alg $$3 = fsb.ai.a($$0, $$1, this.l);
      gsi $$4 = b(fsb.aj.a($$0, $$1, this.l));
      this.j.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dmr $$0, dmr $$1) {
      gsi $$2 = b(fsb.ah.a($$0));
      gsi $$3 = b(fsb.ai.a($$0));
      gsi $$4 = b(fsb.aj.a($$0));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      gsi $$0 = b(frz.a(dmt.tn));
      gsi $$1 = b(frz.a(dmt.tn, "_partial_tilt"));
      gsi $$2 = b(frz.a(dmt.tn, "_full_tilt"));
      this.j.accept(frs.a(dmt.tn).a(frt.a(ebj.bo).a(ecf.a, $$0).a(ecf.b, $$0).a(ecf.c, $$1).a(ecf.d, $$2)).a(s));
   }

   private frk.e m(dmr $$0) {
      return new frk.e(fsc.q($$0));
   }

   private void n(dmr $$0) {
      this.d($$0, $$0);
   }

   private void d(dmr $$0, dmr $$1) {
      this.j.accept(a($$0, b(frz.a($$1))));
   }

   private void a(dmr $$0, frk.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dmr $$0, frk.d $$1, fsc $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmr $$0, frk.d $$1) {
      fsc $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dmr $$0, frk.d $$1, fsc $$2) {
      gsi $$3 = b($$1.a().a($$0, $$2, this.l));
      this.j.accept(a($$0, $$3));
   }

   private void a(dmr $$0, frk.d $$1, ebw<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.j.accept(frs.a($$0).a(frt.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            fsc $$5 = fsc.c(fsc.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.l));
         })));
      }
   }

   private void a(dmr $$0, dmr $$1, frk.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dmr $$0, dmr $$1, frk.d $$2) {
      this.b($$0, $$2);
      fsc $$3 = $$2.b($$0);
      gsi $$4 = b($$2.b().a($$1, $$3, this.l));
      this.j.accept(a($$1, $$4));
   }

   private void e(dmr $$0, dmr $$1) {
      fse $$2 = fse.u.get($$0);
      gsi $$3 = b($$2.a($$0, this.l));
      this.j.accept(a($$0, $$3));
      gsi $$4 = b(fsb.aJ.a($$1, $$2.b(), this.l));
      this.j.accept(frs.a($$1, $$4).a(s));
      this.c($$0);
   }

   private void f(dmr $$0, dmr $$1) {
      this.b($$0.h());
      fsc $$2 = fsc.k($$0);
      fsc $$3 = fsc.a($$0, $$1);
      gsi $$4 = b(fsb.bb.a($$1, $$3, this.l));
      this.j.accept(frs.a($$1, $$4).a(frt.b(ebj.T).a(jb.e, a).a(jb.d, h).a(jb.c, f).a(jb.f, g)));
      this.j.accept(frs.a($$0).a(frt.a(ebj.ay).a($$2x -> b(fsb.ba[$$2x].a($$0, $$2, this.l)))));
   }

   private void f() {
      dmr $$0 = dmt.li;
      this.b($$0.h());
      gsi $$1 = b(frz.a($$0, "_top"));
      gsi $$2 = b(frz.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dmr $$0 = dmt.lh;
      this.b($$0.h());
      this.j.accept(frs.a($$0).a(frt.a(dsm.e, ebj.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(frz.a($$0, "_top_stage_" + $$1));
            case b -> b(frz.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dmr $$0, dmr $$1, dmr $$2, dmr $$3, dmr $$4, dmr $$5, dmr $$6, dmr $$7) {
      this.a($$0, frk.d.b);
      this.a($$1, frk.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dmr $$0, frk.d $$1) {
      gsi $$2 = b(this.a($$0, "_top", $$1.a(), fsc::c));
      gsi $$3 = b(this.a($$0, "_bottom", $$1.a(), fsc::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dmr $$0, frk.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dmr $$0) {
      alg $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new frc());
      this.c($$0, frk.d.a);
   }

   private void h() {
      this.a(dmt.jf, "_front");
      gsi $$0 = b(frz.a(dmt.jf, "_top"));
      gsi $$1 = b(this.a(dmt.jf, "_bottom", frk.d.b.a(), fsc::c));
      this.e(dmt.jf, $$0, $$1);
   }

   private void i() {
      gsi $$0 = b(this.a(dmt.bH, "_top", fsb.bv, fsc::a));
      gsi $$1 = b(this.a(dmt.bH, "_bottom", fsb.bv, fsc::a));
      this.e(dmt.bH, $$0, $$1);
   }

   private void j() {
      gsi $$0 = b(frz.a(dmt.tp, "_top"));
      gsi $$1 = b(frz.a(dmt.tp, "_bottom"));
      this.j.accept(frs.a(dmt.tp).a(frt.a(ebj.ah).a(ebp.b, $$1).a(ebp.a, $$0)).a(s));
   }

   private void e(dmr $$0, gsi $$1, gsi $$2) {
      this.j.accept(frs.a($$0).a(frt.a(ebj.ah).a(ebp.b, $$2).a(ebp.a, $$1)));
   }

   private void p(dmr $$0) {
      fsc $$1 = fsc.h($$0);
      fsc $$2 = fsc.e(fsc.a($$0, "_corner"));
      gsi $$3 = b(fsb.au.a($$0, $$1, this.l));
      gsi $$4 = b(fsb.av.a($$0, $$2, this.l));
      gsi $$5 = b(fsb.aw.a($$0, $$1, this.l));
      gsi $$6 = b(fsb.ax.a($$0, $$1, this.l));
      this.c($$0);
      this.j
         .accept(
            frs.a($$0)
               .a(
                  frt.a(ebj.aj)
                     .a(ebx.a, $$3)
                     .a(ebx.b, $$3.a(f))
                     .a(ebx.c, $$5.a(f))
                     .a(ebx.d, $$6.a(f))
                     .a(ebx.e, $$5)
                     .a(ebx.f, $$6)
                     .a(ebx.g, $$4)
                     .a(ebx.h, $$4.a(f))
                     .a(ebx.i, $$4.a(g))
                     .a(ebx.j, $$4.a(h))
               )
         );
   }

   private void q(dmr $$0) {
      gsi $$1 = b(this.a($$0, "", fsb.au, fsc::e));
      gsi $$2 = b(this.a($$0, "", fsb.aw, fsc::e));
      gsi $$3 = b(this.a($$0, "", fsb.ax, fsc::e));
      gsi $$4 = b(this.a($$0, "_on", fsb.au, fsc::e));
      gsi $$5 = b(this.a($$0, "_on", fsb.aw, fsc::e));
      gsi $$6 = b(this.a($$0, "_on", fsb.ax, fsc::e));
      this.c($$0);
      this.j.accept(frs.a($$0).a(frt.a(ebj.A, ebj.ak).a(($$6x, $$7) -> {
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

   private void a(dmr $$0, czj $$1) {
      gsi $$2 = b(fsb.aa.a($$0, fsc.a($$1), this.l));
      this.j.accept(a($$0, $$2));
   }

   private void b(dmr $$0, alg $$1) {
      gsi $$2 = b(fsb.aa.a($$0, fsc.h($$1), this.l));
      this.j.accept(a($$0, $$2));
   }

   private gsi g(dmr $$0, dmr $$1) {
      return b(fsb.aa.a($$0, fsc.x($$1), this.l));
   }

   public void a(dmr $$0, dmr $$1) {
      this.j.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dmr $$0) {
      this.a($$0, $$0);
   }

   private void h(dmr $$0, dmr $$1) {
      this.a($$0);
      gsi $$2 = b(fse.j.get($$0).a($$1, this.l));
      this.j.accept(a($$1, $$2));
   }

   private void s(dmr $$0) {
      gsi $$1 = b(fse.p.create($$0, this.l));
      gsi $$2 = b(fse.q.create($$0, this.l));
      gsi $$3 = b(fse.r.create($$0, this.l));
      gsi $$4 = b(fse.s.create($$0, this.l));
      this.b($$0.h());
      this.a($$0, ebj.V, $$1, $$2, $$3, $$4);
   }

   private void t(dmr $$0) {
      gsi $$1 = b(fse.l.create($$0, this.l));
      gsi $$2 = b(fse.m.create($$0, this.l));
      gsi $$3 = b(fse.n.create($$0, this.l));
      gsi $$4 = b(fse.o.create($$0, this.l));
      this.b($$0.h());
      this.a($$0, ebj.U, $$1, $$2, $$3, $$4);
   }

   private void a(dmr $$0, ebt $$1, gsi $$2, gsi $$3, gsi $$4, gsi $$5) {
      this.j
         .accept(
            frr.a($$0)
               .a(b().a(ebj.T, jb.c), $$2)
               .a(b().a(ebj.T, jb.f), $$2.a(f))
               .a(b().a(ebj.T, jb.d), $$2.a(g))
               .a(b().a(ebj.T, jb.e), $$2.a(h))
               .a(b().a($$1, 2, 3, 4).a(ebj.T, jb.c), $$3)
               .a(b().a($$1, 2, 3, 4).a(ebj.T, jb.f), $$3.a(f))
               .a(b().a($$1, 2, 3, 4).a(ebj.T, jb.d), $$3.a(g))
               .a(b().a($$1, 2, 3, 4).a(ebj.T, jb.e), $$3.a(h))
               .a(b().a($$1, 3, 4).a(ebj.T, jb.c), $$4)
               .a(b().a($$1, 3, 4).a(ebj.T, jb.f), $$4.a(f))
               .a(b().a($$1, 3, 4).a(ebj.T, jb.d), $$4.a(g))
               .a(b().a($$1, 3, 4).a(ebj.T, jb.e), $$4.a(h))
               .a(b().a($$1, 4).a(ebj.T, jb.c), $$5)
               .a(b().a($$1, 4).a(ebj.T, jb.f), $$5.a(f))
               .a(b().a($$1, 4).a(ebj.T, jb.d), $$5.a(g))
               .a(b().a($$1, 4).a(ebj.T, jb.e), $$5.a(h))
         );
   }

   private void a(fse.a $$0, dmr... $$1) {
      for (dmr $$2 : $$1) {
         gsm $$3 = a($$0.create($$2, this.l));
         this.j.accept(frs.a($$2, b($$3)));
      }
   }

   private void b(fse.a $$0, dmr... $$1) {
      for (dmr $$2 : $$1) {
         gsi $$3 = b($$0.create($$2, this.l));
         this.j.accept(frs.a($$2, $$3).a(r));
      }
   }

   private void i(dmr $$0, dmr $$1) {
      this.a($$0);
      fsc $$2 = fsc.b($$0, $$1);
      gsi $$3 = b(fsb.aP.a($$1, $$2, this.l));
      gsi $$4 = b(fsb.aQ.a($$1, $$2, this.l));
      gsi $$5 = b(fsb.aR.a($$1, $$2, this.l));
      gsi $$6 = b(fsb.aN.a($$1, $$2, this.l));
      gsi $$7 = b(fsb.aO.a($$1, $$2, this.l));
      czj $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.j
         .accept(
            frr.a($$1)
               .a($$3)
               .a(b().a(ebj.N, true), $$4)
               .a(b().a(ebj.O, true), $$4.a(f))
               .a(b().a(ebj.P, true), $$5)
               .a(b().a(ebj.Q, true), $$5.a(f))
               .a(b().a(ebj.N, false), $$6)
               .a(b().a(ebj.O, false), $$7)
               .a(b().a(ebj.P, false), $$7.a(f))
               .a(b().a(ebj.Q, false), $$6.a(h))
         );
   }

   private void u(dmr $$0) {
      fsc $$1 = fsc.C($$0);
      gsi $$2 = b(fsb.aS.a($$0, $$1, this.l));
      gsi $$3 = b(this.a($$0, "_conditional", fsb.aS, $$1x -> $$1.c(fsd.i, $$1x)));
      this.j.accept(frs.a($$0).a(a(ebj.f, $$3, $$2)).a(o));
   }

   private void v(dmr $$0) {
      gsi $$1 = b(fse.v.create($$0, this.l));
      this.j.accept(a($$0, $$1).a(r));
   }

   private static gsi a(int $$0) {
      String $$1 = "_age" + $$0;
      return new gsi(IntStream.range(1, 5).mapToObj($$1x -> a(frz.a(dmt.nF, $$1x + $$1))).collect(Collectors.toList()));
   }

   private void k() {
      this.j
         .accept(
            frr.a(dmt.nF)
               .a(b().a(ebj.at, 0), a(0))
               .a(b().a(ebj.at, 1), a(1))
               .a(b().a(ebj.bn, ebf.b), b(frz.a(dmt.nF, "_small_leaves")))
               .a(b().a(ebj.bn, ebf.c), b(frz.a(dmt.nF, "_large_leaves")))
         );
   }

   private void l() {
      alg $$0 = fsc.a(dmt.oA, "_top_open");
      gsi $$1 = b(fse.f.create(dmt.oA, this.l));
      gsi $$2 = b(fse.f.get(dmt.oA).a($$1x -> $$1x.a(fsd.f, $$0)).a(dmt.oA, "_open", this.l));
      this.j.accept(frs.a(dmt.oA).a(frt.a(ebj.y).a(false, $$1).a(true, $$2)).a(p));
   }

   private static <T extends Comparable<T>> frt<gsi> a(ebw<T> $$0, T $$1, gsi $$2, gsi $$3) {
      return frt.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dmr $$0, Function<dmr, fsc> $$1) {
      fsc $$2 = $$1.apply($$0).b(fsd.i, fsd.c);
      fsc $$3 = $$2.c(fsd.g, fsc.a($$0, "_front_honey"));
      alg $$4 = fsb.q.a($$0, "_empty", $$2, this.l);
      alg $$5 = fsb.q.a($$0, "_honey", $$3, this.l);
      this.k.a($$0.h(), frx.a(dml.c, frx.a($$4), Map.of(5, frx.a($$5))));
      this.j.accept(frs.a($$0).a(a(dml.c, 5, b($$5), b($$4))).a(s));
   }

   private void a(dmr $$0, ebw<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alg> $$3 = new Int2ObjectOpenHashMap();
         this.j.accept(frs.a($$0).a(frt.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((alg)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, fsb.bc, fsc::g)));
         })));
      }
   }

   private void m() {
      gsi $$0 = b(frz.a(dmt.oJ, "_floor"));
      gsi $$1 = b(frz.a(dmt.oJ, "_ceiling"));
      gsi $$2 = b(frz.a(dmt.oJ, "_wall"));
      gsi $$3 = b(frz.a(dmt.oJ, "_between_walls"));
      this.b(czr.xD);
      this.j
         .accept(
            frs.a(dmt.oJ)
               .a(
                  frt.a(ebj.T, ebj.Y)
                     .a(jb.c, ebh.a, $$0)
                     .a(jb.d, ebh.a, $$0.a(g))
                     .a(jb.f, ebh.a, $$0.a(f))
                     .a(jb.e, ebh.a, $$0.a(h))
                     .a(jb.c, ebh.b, $$1)
                     .a(jb.d, ebh.b, $$1.a(g))
                     .a(jb.f, ebh.b, $$1.a(f))
                     .a(jb.e, ebh.b, $$1.a(h))
                     .a(jb.c, ebh.c, $$2.a(h))
                     .a(jb.d, ebh.c, $$2.a(f))
                     .a(jb.f, ebh.c, $$2)
                     .a(jb.e, ebh.c, $$2.a(g))
                     .a(jb.d, ebh.d, $$3.a(f))
                     .a(jb.c, ebh.d, $$3.a(h))
                     .a(jb.f, ebh.d, $$3)
                     .a(jb.e, ebh.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.j
         .accept(
            frs.a(dmt.oF, b(frz.a(dmt.oF)))
               .a(
                  frt.b(ebj.X, ebj.T)
                     .a(ebe.a, jb.c, a)
                     .a(ebe.a, jb.f, f)
                     .a(ebe.a, jb.d, g)
                     .a(ebe.a, jb.e, h)
                     .a(ebe.b, jb.c, c)
                     .a(ebe.b, jb.f, c.then(f))
                     .a(ebe.b, jb.d, c.then(g))
                     .a(ebe.b, jb.e, c.then(h))
                     .a(ebe.c, jb.d, d)
                     .a(ebe.c, jb.e, d.then(f))
                     .a(ebe.c, jb.c, d.then(g))
                     .a(ebe.c, jb.f, d.then(h))
               )
         );
   }

   private void d(dmr $$0, fse.a $$1) {
      gsi $$2 = b($$1.create($$0, this.l));
      alg $$3 = fsc.a($$0, "_front_on");
      gsi $$4 = b($$1.get($$0).a($$1x -> $$1x.a(fsd.g, $$3)).a($$0, "_on", this.l));
      this.j.accept(frs.a($$0).a(a(ebj.u, $$4, $$2)).a(s));
   }

   private void a(dmr... $$0) {
      gsi $$1 = b(frz.a("campfire_off"));

      for (dmr $$2 : $$0) {
         gsi $$3 = b(fsb.bj.a($$2, fsc.H($$2), this.l));
         this.b($$2.h());
         this.j.accept(frs.a($$2).a(a(ebj.u, $$3, $$1)).a(r));
      }
   }

   private void w(dmr $$0) {
      gsi $$1 = b(fsb.bE.a($$0, fsc.o($$0), this.l));
      this.j.accept(a($$0, $$1));
   }

   private void x(dmr $$0) {
      gsi $$1;
      if ($$0 == dmt.tT) {
         $$1 = b(fsb.bG.a($$0, fsc.p($$0), this.l));
      } else {
         $$1 = b(fsb.bF.a($$0, fsc.p($$0), this.l));
      }

      this.j.accept(a($$0, $$1));
   }

   private void o() {
      fsc $$0 = fsc.a(fsc.J(dmt.cv), fsc.J(dmt.n));
      gsi $$1 = b(fsb.j.a(dmt.cv, $$0, this.l));
      this.j.accept(a(dmt.cv, $$1));
   }

   private void p() {
      this.b(czr.ml);
      this.j
         .accept(
            frr.a(dmt.cH)
               .a(
                  a(
                     b().a(ebj.ae, eby.c).a(ebj.ad, eby.c).a(ebj.af, eby.c).a(ebj.ag, eby.c),
                     b().a(ebj.ae, eby.b, eby.a).a(ebj.ad, eby.b, eby.a),
                     b().a(ebj.ad, eby.b, eby.a).a(ebj.af, eby.b, eby.a),
                     b().a(ebj.af, eby.b, eby.a).a(ebj.ag, eby.b, eby.a),
                     b().a(ebj.ag, eby.b, eby.a).a(ebj.ae, eby.b, eby.a)
                  ),
                  b(frz.a("redstone_dust_dot"))
               )
               .a(b().a(ebj.ae, eby.b, eby.a), b(frz.a("redstone_dust_side0")))
               .a(b().a(ebj.af, eby.b, eby.a), b(frz.a("redstone_dust_side_alt0")))
               .a(b().a(ebj.ad, eby.b, eby.a), b(frz.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(ebj.ag, eby.b, eby.a), b(frz.a("redstone_dust_side1")).a(h))
               .a(b().a(ebj.ae, eby.a), b(frz.a("redstone_dust_up")))
               .a(b().a(ebj.ad, eby.a), b(frz.a("redstone_dust_up")).a(f))
               .a(b().a(ebj.af, eby.a), b(frz.a("redstone_dust_up")).a(g))
               .a(b().a(ebj.ag, eby.a), b(frz.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(czr.mp);
      this.j
         .accept(
            frs.a(dmt.hz)
               .a(
                  frt.a(ebj.bg, ebj.A)
                     .a(ebm.a, false, b(frz.a(dmt.hz)))
                     .a(ebm.a, true, b(frz.a(dmt.hz, "_on")))
                     .a(ebm.b, false, b(frz.a(dmt.hz, "_subtract")))
                     .a(ebm.b, true, b(frz.a(dmt.hz, "_on_subtract")))
               )
               .a(r)
         );
   }

   private void r() {
      fsc $$0 = fsc.a(dmt.ku);
      fsc $$1 = fsc.a(fsc.a(dmt.kh, "_side"), $$0.a(fsd.f));
      gsi $$2 = b(fsb.ab.a(dmt.kh, $$1, this.l));
      gsi $$3 = b(fsb.ac.a(dmt.kh, $$1, this.l));
      gsi $$4 = b(fsb.j.b(dmt.kh, "_double", $$1, this.l));
      this.j.accept(e(dmt.kh, $$2, $$3, $$4));
      this.j.accept(a(dmt.ku, b(fsb.c.a(dmt.ku, $$0, this.l))));
   }

   private void s() {
      this.b(czr.ty);
      this.j
         .accept(
            frr.a(dmt.fR)
               .a(b(fsc.J(dmt.fR)))
               .a(b().a(ebj.n, true), b(fsc.a(dmt.fR, "_bottle0")))
               .a(b().a(ebj.o, true), b(fsc.a(dmt.fR, "_bottle1")))
               .a(b().a(ebj.p, true), b(fsc.a(dmt.fR, "_bottle2")))
               .a(b().a(ebj.n, false), b(fsc.a(dmt.fR, "_empty0")))
               .a(b().a(ebj.o, false), b(fsc.a(dmt.fR, "_empty1")))
               .a(b().a(ebj.p, false), b(fsc.a(dmt.fR, "_empty2")))
         );
   }

   private void y(dmr $$0) {
      gsi $$1 = b(fsb.bA.a($$0, fsc.b($$0), this.l));
      gsi $$2 = b(frz.a("mushroom_block_inside"));
      this.j
         .accept(
            frr.a($$0)
               .a(b().a(ebj.N, true), $$1)
               .a(b().a(ebj.O, true), $$1.a(f).a(b))
               .a(b().a(ebj.P, true), $$1.a(g).a(b))
               .a(b().a(ebj.Q, true), $$1.a(h).a(b))
               .a(b().a(ebj.L, true), $$1.a(e).a(b))
               .a(b().a(ebj.M, true), $$1.a(c).a(b))
               .a(b().a(ebj.N, false), $$2)
               .a(b().a(ebj.O, false), $$2.a(f))
               .a(b().a(ebj.P, false), $$2.a(g))
               .a(b().a(ebj.Q, false), $$2.a(h))
               .a(b().a(ebj.L, false), $$2.a(e))
               .a(b().a(ebj.M, false), $$2.a(c))
         );
      this.a($$0, fse.a.createWithSuffix($$0, "_inventory", this.l));
   }

   private void t() {
      this.b(czr.sJ);
      this.j
         .accept(
            frs.a(dmt.ex)
               .a(
                  frt.a(ebj.aB)
                     .a(0, b(frz.a(dmt.ex)))
                     .a(1, b(frz.a(dmt.ex, "_slice1")))
                     .a(2, b(frz.a(dmt.ex, "_slice2")))
                     .a(3, b(frz.a(dmt.ex, "_slice3")))
                     .a(4, b(frz.a(dmt.ex, "_slice4")))
                     .a(5, b(frz.a(dmt.ex, "_slice5")))
                     .a(6, b(frz.a(dmt.ex, "_slice6")))
               )
         );
   }

   private void u() {
      fsc $$0 = new fsc()
         .a(fsd.c, fsc.a(dmt.oD, "_side3"))
         .a(fsd.o, fsc.J(dmt.t))
         .a(fsd.n, fsc.a(dmt.oD, "_top"))
         .a(fsd.j, fsc.a(dmt.oD, "_side3"))
         .a(fsd.l, fsc.a(dmt.oD, "_side3"))
         .a(fsd.k, fsc.a(dmt.oD, "_side1"))
         .a(fsd.m, fsc.a(dmt.oD, "_side2"));
      this.j.accept(a(dmt.oD, b(fsb.a.a(dmt.oD, $$0, this.l))));
   }

   private void v() {
      fsc $$0 = new fsc()
         .a(fsd.c, fsc.a(dmt.oH, "_front"))
         .a(fsd.o, fsc.a(dmt.oH, "_bottom"))
         .a(fsd.n, fsc.a(dmt.oH, "_top"))
         .a(fsd.j, fsc.a(dmt.oH, "_front"))
         .a(fsd.k, fsc.a(dmt.oH, "_front"))
         .a(fsd.l, fsc.a(dmt.oH, "_side"))
         .a(fsd.m, fsc.a(dmt.oH, "_side"));
      this.j.accept(a(dmt.oH, b(fsb.a.a(dmt.oH, $$0, this.l))));
   }

   private void a(dmr $$0, dmr $$1, BiFunction<dmr, dmr, fsc> $$2) {
      fsc $$3 = $$2.apply($$0, $$1);
      this.j.accept(a($$0, b(fsb.a.a($$0, $$3, this.l))));
   }

   public void b(dmr $$0) {
      fsc $$1 = new fsc()
         .a(fsd.c, fsc.a($$0, "_particle"))
         .a(fsd.o, fsc.a($$0, "_down"))
         .a(fsd.n, fsc.a($$0, "_up"))
         .a(fsd.j, fsc.a($$0, "_north"))
         .a(fsd.k, fsc.a($$0, "_south"))
         .a(fsd.l, fsc.a($$0, "_east"))
         .a(fsd.m, fsc.a($$0, "_west"));
      this.j.accept(a($$0, b(fsb.a.a($$0, $$1, this.l))));
   }

   private void w() {
      fsc $$0 = fsc.n(dmt.fr);
      this.j.accept(a(dmt.fr, b(frz.a(dmt.fr))));
      this.a(dmt.ev, $$0);
      this.a(dmt.ew, $$0);
   }

   private void a(dmr $$0, fsc $$1) {
      gsi $$2 = b(fsb.p.a($$0, $$1.c(fsd.g, fsc.J($$0)), this.l));
      this.j.accept(frs.a($$0, $$2).a(s));
   }

   private void x() {
      this.b(czr.tz);
      this.n(dmt.fS);
      this.j.accept(a(dmt.fU, b(fsb.bD.a(dmt.fU, fsc.j(fsc.a(dmt.K, "_still")), this.l))));
      this.j
         .accept(
            frs.a(dmt.fT)
               .a(
                  frt.a(drf.f)
                     .a(1, b(fsb.bB.a(dmt.fT, "_level1", fsc.j(fsc.a(dmt.J, "_still")), this.l)))
                     .a(2, b(fsb.bC.a(dmt.fT, "_level2", fsc.j(fsc.a(dmt.J, "_still")), this.l)))
                     .a(3, b(fsb.bD.a(dmt.fT, "_full", fsc.j(fsc.a(dmt.J, "_still")), this.l)))
               )
         );
      this.j
         .accept(
            frs.a(dmt.fV)
               .a(
                  frt.a(drf.f)
                     .a(1, b(fsb.bB.a(dmt.fV, "_level1", fsc.j(fsc.J(dmt.rx)), this.l)))
                     .a(2, b(fsb.bC.a(dmt.fV, "_level2", fsc.j(fsc.J(dmt.rx)), this.l)))
                     .a(3, b(fsb.bD.a(dmt.fV, "_full", fsc.j(fsc.J(dmt.rx)), this.l)))
               )
         );
   }

   private void y() {
      fsc $$0 = fsc.b(dmt.lb);
      gsi $$1 = b(fsb.aL.a(dmt.lb, $$0, this.l));
      gsi $$2 = b(this.a(dmt.lb, "_dead", fsb.aL, $$1x -> $$0.c(fsd.b, $$1x)));
      this.j.accept(frs.a(dmt.lb).a(a(ebj.ax, 5, $$2, $$1)));
   }

   private void z() {
      gsi $$0 = b(frz.a(dmt.ua));
      gsi $$1 = b(frz.a(dmt.ua, "_triggered"));
      gsi $$2 = b(frz.a(dmt.ua, "_crafting"));
      gsi $$3 = b(frz.a(dmt.ua, "_crafting_triggered"));
      this.j
         .accept(frs.a(dmt.ua).a(frt.a(ebj.G, dol.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(frt.b(ebj.W).a(frk::a)));
   }

   private void z(dmr $$0) {
      fsc $$1 = new fsc().a(fsd.f, fsc.a(dmt.cO, "_top")).a(fsd.i, fsc.a(dmt.cO, "_side")).a(fsd.g, fsc.a($$0, "_front"));
      fsc $$2 = new fsc().a(fsd.i, fsc.a(dmt.cO, "_top")).a(fsd.g, fsc.a($$0, "_front_vertical"));
      gsi $$3 = b(fsb.p.a($$0, $$1, this.l));
      gsi $$4 = b(fsb.r.a($$0, $$2, this.l));
      this.j.accept(frs.a($$0).a(frt.a(ebj.R).a(jb.a, $$4.a(d)).a(jb.b, $$4).a(jb.c, $$3).a(jb.f, $$3.a(f)).a(jb.d, $$3.a(g)).a(jb.e, $$3.a(h))));
   }

   private void A() {
      gsi $$0 = b(frz.a(dmt.fX));
      gsi $$1 = b(frz.a(dmt.fX, "_filled"));
      this.j.accept(frs.a(dmt.fX).a(frt.a(ebj.k).a(false, $$0).a(true, $$1)).a(r));
   }

   private void B() {
      gsi $$0 = b(frz.a(dmt.la, "_side"));
      gsm $$1 = a(frz.a(dmt.la, "_noside"));
      gsm $$2 = a(frz.a(dmt.la, "_noside1"));
      gsm $$3 = a(frz.a(dmt.la, "_noside2"));
      gsm $$4 = a(frz.a(dmt.la, "_noside3"));
      this.j
         .accept(
            frr.a(dmt.la)
               .a(b().a(ebj.N, true), $$0)
               .a(b().a(ebj.O, true), $$0.a(f).a(b))
               .a(b().a(ebj.P, true), $$0.a(g).a(b))
               .a(b().a(ebj.Q, true), $$0.a(h).a(b))
               .a(b().a(ebj.L, true), $$0.a(e).a(b))
               .a(b().a(ebj.M, true), $$0.a(c).a(b))
               .a(b().a(ebj.N, false), a($$1.a(i), $$2, $$3, $$4))
               .a(b().a(ebj.O, false), a($$2.a(f).a(b), $$3.a(f).a(b), $$4.a(f).a(b), $$1.a(i).a(f).a(b)))
               .a(b().a(ebj.P, false), a($$3.a(g).a(b), $$4.a(g).a(b), $$1.a(i).a(g).a(b), $$2.a(g).a(b)))
               .a(b().a(ebj.Q, false), a($$4.a(h).a(b), $$1.a(i).a(h).a(b), $$2.a(h).a(b), $$3.a(h).a(b)))
               .a(b().a(ebj.L, false), a($$1.a(i).a(e).a(b), $$4.a(e).a(b), $$2.a(e).a(b), $$3.a(e).a(b)))
               .a(b().a(ebj.M, false), a($$4.a(c).a(b), $$3.a(c).a(b), $$2.a(c).a(b), $$1.a(i).a(c).a(b)))
         );
   }

   private void C() {
      this.j
         .accept(
            frr.a(dmt.pK)
               .a(b(fsc.J(dmt.pK)))
               .a(b().a(ebj.aO, 1), b(fsc.a(dmt.pK, "_contents1")))
               .a(b().a(ebj.aO, 2), b(fsc.a(dmt.pK, "_contents2")))
               .a(b().a(ebj.aO, 3), b(fsc.a(dmt.pK, "_contents3")))
               .a(b().a(ebj.aO, 4), b(fsc.a(dmt.pK, "_contents4")))
               .a(b().a(ebj.aO, 5), b(fsc.a(dmt.pK, "_contents5")))
               .a(b().a(ebj.aO, 6), b(fsc.a(dmt.pK, "_contents6")))
               .a(b().a(ebj.aO, 7), b(fsc.a(dmt.pK, "_contents7")))
               .a(b().a(ebj.aO, 8), b(fsc.a(dmt.pK, "_contents_ready")))
         );
   }

   private void A(dmr $$0) {
      gsi $$1 = b(fsb.c.a($$0, fsc.a($$0), this.l));
      gsi $$2 = b(this.a($$0, "_powered", fsb.c, fsc::b));
      gsi $$3 = b(this.a($$0, "_lit", fsb.c, fsc::b));
      gsi $$4 = b(this.a($$0, "_lit_powered", fsb.c, fsc::b));
      this.j.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static frp a(dmr $$0, gsi $$1, gsi $$2, gsi $$3, gsi $$4) {
      return frs.a($$0).a(frt.a(ebj.u, ebj.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dmr $$0, dmr $$1) {
      gsi $$2 = b(frz.a($$0));
      gsi $$3 = b(frz.a($$0, "_powered"));
      gsi $$4 = b(frz.a($$0, "_lit"));
      gsi $$5 = b(frz.a($$0, "_lit_powered"));
      this.k.a($$0.h(), $$1.h());
      this.j.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dmr $$0) {
      gsi $$1 = b(fsb.ao.a($$0, fsc.c($$0), this.l));
      this.j.accept(frs.a($$0, $$1).a(p));
   }

   private void D() {
      this.B(dmt.rg);
      this.B(dmt.rf);
      this.B(dmt.re);
      this.B(dmt.rd);
   }

   private void E() {
      frt.b<gsi, jb, ebq> $$0 = frt.a(ebj.bp, ebj.bq);

      for (ebq $$1 : ebq.values()) {
         $$0.a(jb.b, $$1, this.a(jb.b, $$1));
      }

      for (ebq $$2 : ebq.values()) {
         $$0.a(jb.a, $$2, this.a(jb.a, $$2));
      }

      this.j.accept(frs.a(dmt.tb).a($$0));
   }

   private gsi a(jb $$0, ebq $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fsc $$3 = fsc.c(fsc.a(dmt.tb, $$2));
      return b(fsb.an.a(dmt.tb, $$2, $$3, this.l));
   }

   private void C(dmr $$0) {
      fsc $$1 = new fsc().a(fsd.e, fsc.J(dmt.em)).a(fsd.f, fsc.J($$0)).a(fsd.i, fsc.a($$0, "_side"));
      this.j.accept(a($$0, b(fsb.n.a($$0, $$1, this.l))));
   }

   private void F() {
      alg $$0 = fsc.a(dmt.hA, "_side");
      fsc $$1 = new fsc().a(fsd.f, fsc.a(dmt.hA, "_top")).a(fsd.i, $$0);
      fsc $$2 = new fsc().a(fsd.f, fsc.a(dmt.hA, "_inverted_top")).a(fsd.i, $$0);
      this.j.accept(frs.a(dmt.hA).a(frt.a(ebj.s).a(false, b(fsb.aM.a(dmt.hA, $$1, this.l))).a(true, b(fsb.aM.a(frz.a(dmt.hA, "_inverted"), $$2, this.l)))));
   }

   private void D(dmr $$0) {
      this.j.accept(frs.a($$0, b(frz.a($$0))).a(p));
   }

   private void G() {
      dmr $$0 = dmt.ta;
      gsi $$1 = b(frz.a($$0, "_on"));
      gsi $$2 = b(frz.a($$0));
      this.j.accept(frs.a($$0).a(a(ebj.A, $$1, $$2)).a(p));
   }

   private void H() {
      fsc $$0 = new fsc().a(fsd.C, fsc.J(dmt.j)).a(fsd.f, fsc.J(dmt.cN));
      fsc $$1 = new fsc().a(fsd.C, fsc.J(dmt.j)).a(fsd.f, fsc.a(dmt.cN, "_moist"));
      gsi $$2 = b(fsb.bd.a(dmt.cN, $$0, this.l));
      gsi $$3 = b(fsb.bd.a(fsc.a(dmt.cN, "_moist"), $$1, this.l));
      this.j.accept(frs.a(dmt.cN).a(a(ebj.aT, 7, $$3, $$2)));
   }

   private gsi E(dmr $$0) {
      return a(a(fsb.be.a(frz.a($$0, "_floor0"), fsc.y($$0), this.l)), a(fsb.be.a(frz.a($$0, "_floor1"), fsc.z($$0), this.l)));
   }

   private gsi F(dmr $$0) {
      return a(
         a(fsb.bf.a(frz.a($$0, "_side0"), fsc.y($$0), this.l)),
         a(fsb.bf.a(frz.a($$0, "_side1"), fsc.z($$0), this.l)),
         a(fsb.bg.a(frz.a($$0, "_side_alt0"), fsc.y($$0), this.l)),
         a(fsb.bg.a(frz.a($$0, "_side_alt1"), fsc.z($$0), this.l))
      );
   }

   private gsi G(dmr $$0) {
      return a(
         a(fsb.bh.a(frz.a($$0, "_up0"), fsc.y($$0), this.l)),
         a(fsb.bh.a(frz.a($$0, "_up1"), fsc.z($$0), this.l)),
         a(fsb.bi.a(frz.a($$0, "_up_alt0"), fsc.y($$0), this.l)),
         a(fsb.bi.a(frz.a($$0, "_up_alt1"), fsc.z($$0), this.l))
      );
   }

   private void I() {
      frq $$0 = b().a(ebj.N, false).a(ebj.O, false).a(ebj.P, false).a(ebj.Q, false).a(ebj.L, false);
      gsi $$1 = this.E(dmt.cB);
      gsi $$2 = this.F(dmt.cB);
      gsi $$3 = this.G(dmt.cB);
      this.j
         .accept(
            frr.a(dmt.cB)
               .a($$0, $$1)
               .a(a(b().a(ebj.N, true), $$0), $$2)
               .a(a(b().a(ebj.O, true), $$0), $$2.a(f))
               .a(a(b().a(ebj.P, true), $$0), $$2.a(g))
               .a(a(b().a(ebj.Q, true), $$0), $$2.a(h))
               .a(b().a(ebj.L, true), $$3)
         );
   }

   private void J() {
      gsi $$0 = this.E(dmt.cC);
      gsi $$1 = this.F(dmt.cC);
      this.j.accept(frr.a(dmt.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dmr $$0) {
      gsi $$1 = b(fse.x.create($$0, this.l));
      gsi $$2 = b(fse.y.create($$0, this.l));
      this.b($$0.h());
      this.j.accept(frs.a($$0).a(a(ebj.m, $$2, $$1)));
   }

   private void K() {
      fsc $$0 = fsc.a(fsc.a(dmt.ah, "_side"), fsc.a(dmt.ah, "_top"));
      gsi $$1 = b(fsb.j.a(dmt.ah, $$0, this.l));
      this.j.accept(b(dmt.ah, $$1));
   }

   private void L() {
      this.b(czr.af);
      dmr $$0 = dmt.H;
      gsi $$1 = b(frz.a($$0));
      this.j.accept(frs.a(dmt.H).a(frt.a(drs.d, drs.b).a(($$2, $$3) -> $$2 ? b(frz.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.j
         .accept(
            frs.a(dmt.lo)
               .a(
                  frt.a(ebj.av)
                     .a(0, b(this.a(dmt.lo, "_0", fsb.c, fsc::b)))
                     .a(1, b(this.a(dmt.lo, "_1", fsb.c, fsc::b)))
                     .a(2, b(this.a(dmt.lo, "_2", fsb.c, fsc::b)))
                     .a(3, b(this.a(dmt.lo, "_3", fsb.c, fsc::b)))
               )
         );
   }

   private void N() {
      alg $$0 = fsc.J(dmt.j);
      fsc $$1 = new fsc().a(fsd.e, $$0).b(fsd.e, fsd.c).a(fsd.f, fsc.a(dmt.i, "_top")).a(fsd.i, fsc.a(dmt.i, "_snow"));
      gsi $$2 = b(fsb.n.a(dmt.i, "_snow", $$1, this.l));
      alg $$3 = frz.a(dmt.i);
      this.f(dmt.i, b(a($$3)), $$2);
      this.a(dmt.i, $$3, new frc());
      gsi $$4 = b(a(fse.f.get(dmt.fE).a($$1x -> $$1x.a(fsd.e, $$0)).a(dmt.fE, this.l)));
      this.f(dmt.fE, $$4, $$2);
      gsi $$5 = b(a(fse.f.get(dmt.l).a($$1x -> $$1x.a(fsd.e, $$0)).a(dmt.l, this.l)));
      this.f(dmt.l, $$5, $$2);
   }

   private void f(dmr $$0, gsi $$1, gsi $$2) {
      this.j.accept(frs.a($$0).a(frt.a(ebj.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(czr.sp);
      this.j.accept(frs.a(dmt.gb).a(frt.a(ebj.au).a(0, b(frz.a(dmt.gb, "_stage0"))).a(1, b(frz.a(dmt.gb, "_stage1"))).a(2, b(frz.a(dmt.gb, "_stage2")))).a(r));
   }

   private void P() {
      gsm $$0 = a(frz.a(dmt.lk));
      this.j.accept(frs.a(dmt.lk, b($$0)));
   }

   private void k(dmr $$0, dmr $$1) {
      fsc $$2 = fsc.b($$1);
      gsi $$3 = b(fsb.Y.a($$0, $$2, this.l));
      gsi $$4 = b(fsb.Z.a($$0, $$2, this.l));
      this.j.accept(frs.a($$0).a(a(ebj.aW, 1, $$4, $$3)));
   }

   private void Q() {
      gsi $$0 = b(frz.a(dmt.hD));
      gsi $$1 = b(frz.a(dmt.hD, "_side"));
      this.b(czr.mv);
      this.j.accept(frs.a(dmt.hD).a(frt.a(ebj.S).a(jb.a, $$0).a(jb.c, $$1).a(jb.f, $$1.a(f)).a(jb.d, $$1.a(g)).a(jb.e, $$1.a(h))));
   }

   private void l(dmr $$0, dmr $$1) {
      gsi $$2 = b(frz.a($$0));
      this.j.accept(frs.a($$1, $$2));
      this.k.a($$0.h(), $$1.h());
   }

   private void R() {
      gsi $$0 = b(frz.a(dmt.fo, "_post_ends"));
      gsi $$1 = b(frz.a(dmt.fo, "_post"));
      gsi $$2 = b(frz.a(dmt.fo, "_cap"));
      gsi $$3 = b(frz.a(dmt.fo, "_cap_alt"));
      gsi $$4 = b(frz.a(dmt.fo, "_side"));
      gsi $$5 = b(frz.a(dmt.fo, "_side_alt"));
      this.j
         .accept(
            frr.a(dmt.fo)
               .a($$0)
               .a(b().a(ebj.N, false).a(ebj.O, false).a(ebj.P, false).a(ebj.Q, false), $$1)
               .a(b().a(ebj.N, true).a(ebj.O, false).a(ebj.P, false).a(ebj.Q, false), $$2)
               .a(b().a(ebj.N, false).a(ebj.O, true).a(ebj.P, false).a(ebj.Q, false), $$2.a(f))
               .a(b().a(ebj.N, false).a(ebj.O, false).a(ebj.P, true).a(ebj.Q, false), $$3)
               .a(b().a(ebj.N, false).a(ebj.O, false).a(ebj.P, false).a(ebj.Q, true), $$3.a(f))
               .a(b().a(ebj.N, true), $$4)
               .a(b().a(ebj.O, true), $$4.a(f))
               .a(b().a(ebj.P, true), $$5)
               .a(b().a(ebj.Q, true), $$5.a(f))
         );
      this.c(dmt.fo);
   }

   private void I(dmr $$0) {
      this.j.accept(frs.a($$0, b(frz.a($$0))).a(s));
   }

   private void S() {
      gsi $$0 = b(frz.a(dmt.dL));
      gsi $$1 = b(frz.a(dmt.dL, "_on"));
      this.c(dmt.dL);
      this.j
         .accept(
            frs.a(dmt.dL)
               .a(a(ebj.A, $$0, $$1))
               .a(
                  frt.b(ebj.X, ebj.T)
                     .a(ebe.c, jb.c, d.then(g))
                     .a(ebe.c, jb.f, d.then(h))
                     .a(ebe.c, jb.d, d)
                     .a(ebe.c, jb.e, d.then(f))
                     .a(ebe.a, jb.c, a)
                     .a(ebe.a, jb.f, f)
                     .a(ebe.a, jb.d, g)
                     .a(ebe.a, jb.e, h)
                     .a(ebe.b, jb.c, c)
                     .a(ebe.b, jb.f, c.then(f))
                     .a(ebe.b, jb.d, c.then(g))
                     .a(ebe.b, jb.e, c.then(h))
               )
         );
   }

   private void T() {
      alg $$0 = this.a(czr.gE, dmt.fF);
      this.a(dmt.fF, $$0, frx.a(-9321636));
      gsm $$1 = a(frz.a(dmt.fF));
      this.j.accept(frs.a(dmt.fF, b($$1)));
   }

   private void U() {
      this.c(dmt.tX);
      this.j.accept(a(dmt.tX, b(frz.a(dmt.tX))));
   }

   private void V() {
      this.j.accept(frs.a(dmt.eu).a(frt.a(ebj.J).a(jb.a.a, b(frz.a(dmt.eu, "_ns"))).a(jb.a.c, b(frz.a(dmt.eu, "_ew")))));
   }

   private void W() {
      gsm $$0 = a(fse.a.create(dmt.em, this.l));
      this.j
         .accept(
            frs.a(
               dmt.em,
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
      gsi $$0 = b(frz.a(dmt.lu));
      gsi $$1 = b(frz.a(dmt.lu, "_on"));
      this.j.accept(frs.a(dmt.lu).a(a(ebj.A, $$1, $$0)).a(o));
   }

   private void Y() {
      fsc $$0 = new fsc().a(fsd.e, fsc.a(dmt.bI, "_bottom")).a(fsd.i, fsc.a(dmt.bI, "_side"));
      alg $$1 = fsc.a(dmt.bI, "_top_sticky");
      alg $$2 = fsc.a(dmt.bI, "_top");
      fsc $$3 = $$0.c(fsd.F, $$1);
      fsc $$4 = $$0.c(fsd.F, $$2);
      gsi $$5 = b(frz.a(dmt.bI, "_base"));
      this.a(dmt.bI, $$5, $$4);
      this.a(dmt.by, $$5, $$3);
      alg $$6 = fsb.n.a(dmt.bI, "_inventory", $$0.c(fsd.f, $$2), this.l);
      alg $$7 = fsb.n.a(dmt.by, "_inventory", $$0.c(fsd.f, $$1), this.l);
      this.a(dmt.bI, $$6);
      this.a(dmt.by, $$7);
   }

   private void a(dmr $$0, gsi $$1, fsc $$2) {
      gsi $$3 = b(fsb.bs.a($$0, $$2, this.l));
      this.j.accept(frs.a($$0).a(a(ebj.j, $$1, $$3)).a(o));
   }

   private void Z() {
      fsc $$0 = new fsc().a(fsd.G, fsc.a(dmt.bI, "_top")).a(fsd.i, fsc.a(dmt.bI, "_side"));
      fsc $$1 = $$0.c(fsd.F, fsc.a(dmt.bI, "_top_sticky"));
      fsc $$2 = $$0.c(fsd.F, fsc.a(dmt.bI, "_top"));
      this.j
         .accept(
            frs.a(dmt.bJ)
               .a(
                  frt.a(ebj.B, ebj.bj)
                     .a(false, ebv.a, b(fsb.bt.a(dmt.bI, "_head", $$2, this.l)))
                     .a(false, ebv.b, b(fsb.bt.a(dmt.bI, "_head_sticky", $$1, this.l)))
                     .a(true, ebv.a, b(fsb.bu.a(dmt.bI, "_head_short", $$2, this.l)))
                     .a(true, ebv.b, b(fsb.bu.a(dmt.bI, "_head_short_sticky", $$1, this.l)))
               )
               .a(o)
         );
   }

   private void aa() {
      dmr $$0 = dmt.ub;
      fsc $$1 = fsc.a($$0, "_side_inactive", "_top_inactive");
      fsc $$2 = fsc.a($$0, "_side_active", "_top_active");
      fsc $$3 = fsc.a($$0, "_side_active", "_top_ejecting_reward");
      fsc $$4 = fsc.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fsc $$5 = fsc.a($$0, "_side_active_ominous", "_top_active_ominous");
      fsc $$6 = fsc.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alg $$7 = fsb.o.a($$0, $$1, this.l);
      gsi $$8 = b($$7);
      gsi $$9 = b(fsb.o.a($$0, "_active", $$2, this.l));
      gsi $$10 = b(fsb.o.a($$0, "_ejecting_reward", $$3, this.l));
      gsi $$11 = b(fsb.o.a($$0, "_inactive_ominous", $$4, this.l));
      gsi $$12 = b(fsb.o.a($$0, "_active_ominous", $$5, this.l));
      gsi $$13 = b(fsb.o.a($$0, "_ejecting_reward_ominous", $$6, this.l));
      this.a($$0, $$7);
      this.j.accept(frs.a($$0).a(frt.a(ebj.bB, ebj.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dmr $$0 = dmt.uc;
      fsc $$1 = fsc.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fsc $$2 = fsc.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fsc $$3 = fsc.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fsc $$4 = fsc.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alg $$5 = fsb.cb.a($$0, $$1, this.l);
      gsi $$6 = b($$5);
      gsi $$7 = b(fsb.cb.a($$0, "_active", $$2, this.l));
      gsi $$8 = b(fsb.cb.a($$0, "_unlocking", $$3, this.l));
      gsi $$9 = b(fsb.cb.a($$0, "_ejecting_reward", $$4, this.l));
      fsc $$10 = fsc.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fsc $$11 = fsc.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fsc $$12 = fsc.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fsc $$13 = fsc.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      gsi $$14 = b(fsb.cb.a($$0, "_ominous", $$10, this.l));
      gsi $$15 = b(fsb.cb.a($$0, "_active_ominous", $$11, this.l));
      gsi $$16 = b(fsb.cb.a($$0, "_unlocking_ominous", $$12, this.l));
      gsi $$17 = b(fsb.cb.a($$0, "_ejecting_reward_ominous", $$13, this.l));
      this.a($$0, $$5);
      this.j.accept(frs.a($$0).a(frt.a(dwc.b, dwc.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(s));
   }

   private void ac() {
      alg $$0 = frz.a(dmt.ry, "_inactive");
      gsi $$1 = b($$0);
      gsi $$2 = b(frz.a(dmt.ry, "_active"));
      this.a(dmt.ry, $$0);
      this.j.accept(frs.a(dmt.ry).a(frt.a(ebj.br).a($$2x -> $$2x != eca.b && $$2x != eca.c ? $$1 : $$2)));
   }

   private void ad() {
      alg $$0 = frz.a(dmt.rz, "_inactive");
      gsi $$1 = b($$0);
      gsi $$2 = b(frz.a(dmt.rz, "_active"));
      this.a(dmt.rz, $$0);
      this.j.accept(frs.a(dmt.rz).a(frt.a(ebj.br).a($$2x -> $$2x != eca.b && $$2x != eca.c ? $$1 : $$2)).a(s));
   }

   private void ae() {
      alg $$0 = fsb.ca.a(dmt.rD, fsc.a(false), this.l);
      gsi $$1 = b($$0);
      gsi $$2 = b(fsb.ca.a(dmt.rD, "_can_summon", fsc.a(true), this.l));
      this.a(dmt.rD, $$0);
      this.j.accept(frs.a(dmt.rD).a(a(ebj.e, $$2, $$1)));
   }

   private void af() {
      alg $$0 = frz.a(dmt.oy, "_stable");
      gsi $$1 = b($$0);
      gsi $$2 = b(frz.a(dmt.oy, "_unstable"));
      this.a(dmt.oy, $$0);
      this.j.accept(frs.a(dmt.oy).a(a(ebj.d, $$2, $$1)));
   }

   private void ag() {
      gsi $$0 = b(this.a(dmt.td, "", fsb.ao, fsc::c));
      gsi $$1 = b(this.a(dmt.td, "_lit", fsb.ao, fsc::c));
      this.j.accept(frs.a(dmt.td).a(a(ebj.b, $$1, $$0)));
      gsi $$2 = b(this.a(dmt.te, "", fsb.ao, fsc::c));
      gsi $$3 = b(this.a(dmt.te, "_lit", fsb.ao, fsc::c));
      this.j.accept(frs.a(dmt.te).a(a(ebj.b, $$3, $$2)));
   }

   private void ah() {
      gsi $$0 = b(fse.a.create(dmt.ga, this.l));
      gsi $$1 = b(this.a(dmt.ga, "_on", fsb.c, fsc::b));
      this.j.accept(frs.a(dmt.ga).a(a(ebj.u, $$1, $$0)));
   }

   private void m(dmr $$0, dmr $$1) {
      fsc $$2 = fsc.B($$0);
      this.j.accept(a($$0, b(fsb.bm.a($$0, $$2, this.l))));
      this.j.accept(frs.a($$1, b(fsb.bo.a($$1, $$2, this.l))).a(q));
      this.c($$0);
   }

   private void ai() {
      fsc $$0 = fsc.B(dmt.ea);
      fsc $$1 = fsc.i(fsc.a(dmt.ea, "_off"));
      gsi $$2 = b(fsb.bq.a(dmt.ea, $$0, this.l));
      gsi $$3 = b(fsb.bn.a(dmt.ea, "_off", $$1, this.l));
      this.j.accept(frs.a(dmt.ea).a(a(ebj.u, $$2, $$3)));
      gsi $$4 = b(fsb.br.a(dmt.eb, $$0, this.l));
      gsi $$5 = b(fsb.bp.a(dmt.eb, "_off", $$1, this.l));
      this.j.accept(frs.a(dmt.eb).a(a(ebj.u, $$4, $$5)).a(q));
      this.c(dmt.ea);
   }

   private void aj() {
      this.b(czr.mo);
      this.j.accept(frs.a(dmt.ey).a(frt.a(ebj.aD, ebj.v, ebj.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(fsc.a(dmt.ey, $$3.toString()));
      })).a(r));
   }

   private void ak() {
      this.b(czr.de);
      this.j
         .accept(
            frs.a(dmt.nB)
               .a(
                  frt.a(ebj.aV, ebj.I)
                     .a(1, false, b(a(frz.a("dead_sea_pickle"))))
                     .a(2, false, b(a(frz.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(frz.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(frz.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(frz.a("sea_pickle"))))
                     .a(2, true, b(a(frz.a("two_sea_pickles"))))
                     .a(3, true, b(a(frz.a("three_sea_pickles"))))
                     .a(4, true, b(a(frz.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      fsc $$0 = fsc.a(dmt.ed);
      gsi $$1 = b(fsb.c.a(dmt.ef, $$0, this.l));
      this.j.accept(frs.a(dmt.ed).a(frt.a(ebj.aI).a($$1x -> $$1x < 8 ? b(frz.a(dmt.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dmt.ed, frz.a(dmt.ed, "_height2"));
      this.j.accept(a(dmt.ef, $$1));
   }

   private void am() {
      this.j.accept(frs.a(dmt.oI, b(frz.a(dmt.oI))).a(s));
   }

   private void an() {
      alg $$0 = fse.a.create(dmt.pG, this.l);
      this.a(dmt.pG, $$0);
      this.j.accept(frs.a(dmt.pG).a(frt.a(ebj.bm).a($$0x -> b(this.a(dmt.pG, "_" + $$0x.c(), fsb.c, fsc::b)))));
   }

   private void ao() {
      Map<ece, alg> $$0 = new HashMap<>();

      for (ece $$1 : ece.values()) {
         $$0.put($$1, this.a(dmt.pI, "_" + $$1.c(), fsb.c, fsc::b));
      }

      this.j.accept(frs.a(dmt.pI).a(frt.a(ebj.bF).a($$1x -> b($$0.get($$1x)))));
      this.k.a(czr.pa, frx.a(dvl.b, frx.a($$0.get(ece.a)), Map.of(ece.c, frx.a($$0.get(ece.c)), ece.b, frx.a($$0.get(ece.b)), ece.d, frx.a($$0.get(ece.d)))));
   }

   private void ap() {
      this.b(czr.xG);
      this.j.accept(frs.a(dmt.oO).a(frt.a(ebj.av).a($$0 -> b(this.a(dmt.oO, "_stage" + $$0, fsb.ao, fsc::c)))));
   }

   private void aq() {
      this.b(czr.qg);
      this.j
         .accept(
            frs.a(dmt.gh)
               .a(
                  frt.a(ebj.a, ebj.O, ebj.N, ebj.P, ebj.Q)
                     .a(false, false, false, false, false, b(frz.a(dmt.gh, "_ns")))
                     .a(false, true, false, false, false, b(frz.a(dmt.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(frz.a(dmt.gh, "_n")))
                     .a(false, false, false, true, false, b(frz.a(dmt.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(frz.a(dmt.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(frz.a(dmt.gh, "_ne")))
                     .a(false, true, false, true, false, b(frz.a(dmt.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(frz.a(dmt.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(frz.a(dmt.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(frz.a(dmt.gh, "_ns")))
                     .a(false, true, false, false, true, b(frz.a(dmt.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(frz.a(dmt.gh, "_nse")))
                     .a(false, true, false, true, true, b(frz.a(dmt.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(frz.a(dmt.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(frz.a(dmt.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(frz.a(dmt.gh, "_nsew")))
                     .a(true, false, false, false, false, b(frz.a(dmt.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(frz.a(dmt.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(frz.a(dmt.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(frz.a(dmt.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(frz.a(dmt.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(frz.a(dmt.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(frz.a(dmt.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(frz.a(dmt.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(frz.a(dmt.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(frz.a(dmt.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(frz.a(dmt.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(frz.a(dmt.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(frz.a(dmt.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(frz.a(dmt.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(frz.a(dmt.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(frz.a(dmt.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dmt.gg);
      this.j.accept(frs.a(dmt.gg).a(frt.a(ebj.a, ebj.A).a(($$0, $$1) -> b(frz.a(dmt.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(s));
   }

   private gsm a(int $$0, String $$1, fsc $$2) {
      return switch ($$0) {
         case 1 -> a(fsb.bw.a(frz.a($$1 + "turtle_egg"), $$2, this.l));
         case 2 -> a(fsb.bx.a(frz.a("two_" + $$1 + "turtle_eggs"), $$2, this.l));
         case 3 -> a(fsb.by.a(frz.a("three_" + $$1 + "turtle_eggs"), $$2, this.l));
         case 4 -> a(fsb.bz.a(frz.a("four_" + $$1 + "turtle_eggs"), $$2, this.l));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gsm a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", fsc.b(fsc.J(dmt.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", fsc.b(fsc.a(dmt.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", fsc.b(fsc.a(dmt.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(czr.kT);
      this.j.accept(frs.a(dmt.mL).a(frt.a(ebj.aG, ebj.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      this.b(czr.kU);
      this.j.accept(frs.a(dmt.mM).a(frt.a(duj.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fsc $$2 = fsc.a($$1);
         return b(fsb.bH.a(dmt.mM, $$1, $$2, this.l));
      })));
   }

   private void J(dmr $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dmr $$0, czj $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends ebw<?>> Map<T, gsn> a(eav<?, ?> $$0, Function<jb, T> $$1) {
      Builder<T, gsn> $$2 = ImmutableMap.builderWithExpectedSize(v.size());
      v.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dmr $$0) {
      Map<ebw<Boolean>, gsn> $$1 = a($$0.m(), drx::b);
      frq $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      gsi $$3 = b(frz.a($$0));
      frr $$4 = frr.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.j.accept($$4);
   }

   private void L(dmr $$0) {
      Map<ebw<ecg>, gsn> $$1 = a($$0.m(), drv::a);
      frq $$2 = b().a(drv.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, ecg.a));
      gsi $$3 = b(fse.j.create($$0, this.l));
      gsi $$4 = b(fse.k.get($$0).a($$1x -> $$1x.a(fsd.i, fsc.a($$0, "_side_tall"))).a($$0, "_side_tall", this.l));
      gsi $$5 = b(fse.k.get($$0).a($$1x -> $$1x.a(fsd.i, fsc.a($$0, "_side_small"))).a($$0, "_side_small", this.l));
      frr $$6 = frr.a($$0);
      $$6.a(b().a(drv.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, ecg.c), $$4.a($$5x));
         $$6.a(b().a($$4x, ecg.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.j.accept($$6);
   }

   private void M(dmr $$0) {
      this.c($$0);
      this.j.accept(frs.a($$0).a(frt.a(dqm.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         fsc $$3 = fsc.c(fsc.a($$0, $$2));
         return b(frk.d.b.a().a($$0, $$2, $$3, this.l));
      })));
   }

   private void au() {
      alg $$0 = fsc.a(dmt.rC, "_bottom");
      fsc $$1 = new fsc().a(fsd.e, $$0).a(fsd.f, fsc.a(dmt.rC, "_top")).a(fsd.i, fsc.a(dmt.rC, "_side"));
      fsc $$2 = new fsc().a(fsd.e, $$0).a(fsd.f, fsc.a(dmt.rC, "_top_bloom")).a(fsd.i, fsc.a(dmt.rC, "_side_bloom"));
      alg $$3 = fsb.n.a(dmt.rC, $$1, this.l);
      gsi $$4 = b($$3);
      gsi $$5 = b(fsb.n.a(dmt.rC, "_bloom", $$2, this.l));
      this.j.accept(frs.a(dmt.rC).a(frt.a(ebj.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dmt.rC, $$3);
   }

   private void av() {
      dmr $$0 = dmt.cw;
      gsi $$1 = b(frz.a($$0));
      frr $$2 = frr.a($$0);
      List.of(Pair.of(jb.c, a), Pair.of(jb.f, f), Pair.of(jb.d, g), Pair.of(jb.e, h)).forEach($$2x -> {
         jb $$3 = (jb)$$2x.getFirst();
         gsn $$4 = (gsn)$$2x.getSecond();
         gsq $$5 = b().a(ebj.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.j.accept($$2);
      this.a($$0, frz.a($$0, "_inventory"));
      w.clear();
   }

   private void a(frr $$0, gsq $$1, gsn $$2) {
      List.of(
            Pair.of(ebj.bs, fsb.aT),
            Pair.of(ebj.bt, fsb.aU),
            Pair.of(ebj.bu, fsb.aV),
            Pair.of(ebj.bv, fsb.aW),
            Pair.of(ebj.bw, fsb.aX),
            Pair.of(ebj.bx, fsb.aY)
         )
         .forEach($$3 -> {
            ebk $$4 = (ebk)$$3.getFirst();
            fsa $$5 = (fsa)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(frr $$0, gsq $$1, gsn $$2, ebk $$3, fsa $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fsc $$7 = new fsc().a(fsd.b, fsc.a(dmt.cw, $$6));
      frk.c $$8 = new frk.c($$4, $$6);
      gsi $$9 = b(w.computeIfAbsent($$8, $$3x -> $$4.a(dmt.cw, $$6, $$7, this.l)));
      $$0.a(new gsp(gsp.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void aw() {
      gsi $$0 = b(fsb.c.a(dmt.lp, fsc.b(frz.a("magma")), this.l));
      this.j.accept(a(dmt.lp, $$0));
   }

   private void a(dmr $$0, @Nullable cyl $$1) {
      this.r($$0);
      czj $$2 = $$0.h();
      alg $$3 = fsb.bO.a($$2, fsc.x($$0), this.l);
      hgf.b $$4 = $$1 != null ? frx.a($$3, new his.a($$1)) : frx.a($$3, new his.a());
      this.k.a($$2, $$4);
   }

   private void c(dmr $$0, dmr $$1, frk.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ax() {
      alg $$0 = frz.a(dmt.b);
      gsm $$1 = a($$0);
      gsm $$2 = a(frz.a(dmt.b, "_mirrored"));
      this.j.accept(frs.a(dmt.ff, a($$1, $$2)));
      this.a(dmt.ff, $$0);
   }

   private void ay() {
      alg $$0 = frz.a(dmt.tt);
      gsm $$1 = a($$0);
      gsm $$2 = a(frz.a(dmt.tt, "_mirrored"));
      this.j.accept(frs.a(dmt.tN, a($$1, $$2)).a(c()));
      this.a(dmt.tN, $$0);
   }

   private void n(dmr $$0, dmr $$1) {
      this.a($$0, frk.d.b);
      fsc $$2 = fsc.d(fsc.a($$0, "_pot"));
      gsi $$3 = b(frk.d.b.b().a($$1, $$2, this.l));
      this.j.accept(a($$1, $$3));
   }

   private void az() {
      alg $$0 = fsc.a(dmt.pT, "_bottom");
      alg $$1 = fsc.a(dmt.pT, "_top_off");
      alg $$2 = fsc.a(dmt.pT, "_top");
      alg[] $$3 = new alg[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fsc $$5 = new fsc().a(fsd.e, $$0).a(fsd.f, $$4 == 0 ? $$1 : $$2).a(fsd.i, fsc.a(dmt.pT, "_side" + $$4));
         $$3[$$4] = fsb.n.a(dmt.pT, "_" + $$4, $$5, this.l);
      }

      this.j.accept(frs.a(dmt.pT).a(frt.a(ebj.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dmt.pT, $$3[0]);
   }

   private static gsn a(jd $$0) {
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
      alg $$0 = fsc.a(dmt.pH, "_top");
      alg $$1 = fsc.a(dmt.pH, "_bottom");
      alg $$2 = fsc.a(dmt.pH, "_side");
      alg $$3 = fsc.a(dmt.pH, "_lock");
      fsc $$4 = new fsc().a(fsd.o, $$2).a(fsd.m, $$2).a(fsd.l, $$2).a(fsd.c, $$0).a(fsd.j, $$0).a(fsd.k, $$1).a(fsd.n, $$3);
      this.j.accept(frs.a(dmt.pH, b(fsb.b.a(dmt.pH, $$4, this.l))).a(frt.b(ebj.W).a(frk::a)));
   }

   private void aB() {
      dmr $$0 = dmt.n;
      gsi $$1 = b(frz.a($$0));
      fsc $$2 = fsc.a($$0);
      dmr $$3 = dmt.kk;
      gsi $$4 = b(fsb.ab.a($$3, $$2, this.l));
      gsi $$5 = b(fsb.ac.a($$3, $$2, this.l));
      this.j.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dmr $$0, dmr $$1, dud.a $$2, alg $$3) {
      gsi $$4 = b(frz.a("skull"));
      this.j.accept(a($$0, $$4));
      this.j.accept(a($$1, $$4));
      this.k.a($$0.h(), frx.a($$3, new hit.a($$2)));
   }

   private void aC() {
      alg $$0 = frz.b("template_skull");
      this.a(dmt.hn, dmt.ho, dud.b.g, $$0);
      this.a(dmt.hl, dmt.hm, dud.b.e, $$0);
      this.a(dmt.hj, dmt.hk, dud.b.f, $$0);
      this.a(dmt.hf, dmt.hg, dud.b.c, $$0);
      this.a(dmt.hh, dmt.hi, dud.b.d, $$0);
      this.a(dmt.hr, dmt.hs, dud.b.h, $$0);
      this.a(dmt.hp, dmt.hq, dud.b.i, frz.a(czr.vA));
   }

   private void a(dmr $$0, dmr $$1, cyl $$2) {
      gsi $$3 = b(frz.a("banner"));
      alg $$4 = frz.b("template_banner");
      this.j.accept(a($$0, $$3));
      this.j.accept(a($$1, $$3));
      czj $$5 = $$0.h();
      this.k.a($$5, frx.a($$4, new hik.a($$2)));
   }

   private void aD() {
      this.a(dmt.jl, dmt.jB, cyl.a);
      this.a(dmt.jm, dmt.jC, cyl.b);
      this.a(dmt.jn, dmt.jD, cyl.c);
      this.a(dmt.jo, dmt.jE, cyl.d);
      this.a(dmt.jp, dmt.jF, cyl.e);
      this.a(dmt.jq, dmt.jG, cyl.f);
      this.a(dmt.jr, dmt.jH, cyl.g);
      this.a(dmt.js, dmt.jI, cyl.h);
      this.a(dmt.jt, dmt.jJ, cyl.i);
      this.a(dmt.ju, dmt.jK, cyl.j);
      this.a(dmt.jv, dmt.jL, cyl.k);
      this.a(dmt.jw, dmt.jM, cyl.l);
      this.a(dmt.jx, dmt.jN, cyl.m);
      this.a(dmt.jy, dmt.jO, cyl.n);
      this.a(dmt.jz, dmt.jP, cyl.o);
      this.a(dmt.jA, dmt.jQ, cyl.p);
   }

   private void a(dmr $$0, dmr $$1, alg $$2, boolean $$3) {
      this.a($$0, $$1);
      czj $$4 = $$0.h();
      alg $$5 = fsb.bQ.a($$4, fsc.x($$1), this.l);
      hgf.b $$6 = frx.a($$5, new him.a($$2));
      if ($$3) {
         hgf.b $$7 = frx.a($$5, new him.a(him.a));
         this.k.a($$4, frx.b($$7, $$6));
      } else {
         this.k.a($$4, $$6);
      }
   }

   private void aE() {
      this.a(dmt.cG, dmt.n, him.b, true);
      this.a(dmt.hw, dmt.n, him.c, true);
      this.a(dmt.gf, dmt.cy, him.d, false);
   }

   private void b(dmr $$0, dmr $$1, cyl $$2) {
      gsi $$3 = b(frz.a("bed"));
      this.j.accept(a($$0, $$3));
      czj $$4 = $$0.h();
      alg $$5 = fsb.bP.a(frz.a($$4), fsc.x($$1), this.l);
      this.k.a($$4, frx.a($$5, new hil.a($$2)));
   }

   private void aF() {
      this.b(dmt.bg, dmt.bK, cyl.a);
      this.b(dmt.bh, dmt.bL, cyl.b);
      this.b(dmt.bi, dmt.bM, cyl.c);
      this.b(dmt.bj, dmt.bN, cyl.d);
      this.b(dmt.bk, dmt.bO, cyl.e);
      this.b(dmt.bl, dmt.bP, cyl.f);
      this.b(dmt.bm, dmt.bQ, cyl.g);
      this.b(dmt.bn, dmt.bR, cyl.h);
      this.b(dmt.bo, dmt.bS, cyl.i);
      this.b(dmt.bp, dmt.bT, cyl.j);
      this.b(dmt.bq, dmt.bU, cyl.k);
      this.b(dmt.br, dmt.bV, cyl.l);
      this.b(dmt.bs, dmt.bW, cyl.m);
      this.b(dmt.bt, dmt.bX, cyl.n);
      this.b(dmt.bu, dmt.bY, cyl.o);
      this.b(dmt.bv, dmt.bZ, cyl.p);
   }

   private void a(dmr $$0, hiu.a $$1) {
      czj $$2 = $$0.h();
      alg $$3 = frz.a($$2);
      this.k.a($$2, frx.a($$3, $$1));
   }

   public void a() {
      mj.a().filter(mk::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dmt.rN).a(mj.x).a(dmt.rN, dmt.sl).a(dmt.rR, dmt.rV).a(mj.z);
      this.i(dmt.rM).a(mj.B).a(dmt.rM, dmt.sk).a(dmt.rQ, dmt.rU).a(mj.D);
      this.i(dmt.rL).a(mj.F).a(dmt.rL, dmt.sj).a(dmt.rP, dmt.rT).a(mj.H);
      this.i(dmt.rK).a(mj.J).a(dmt.rK, dmt.si).a(dmt.rO, dmt.rS).a(mj.L);
      this.A(dmt.sS);
      this.A(dmt.sT);
      this.A(dmt.sU);
      this.A(dmt.sV);
      this.j(dmt.sS, dmt.sW);
      this.j(dmt.sT, dmt.sX);
      this.j(dmt.sU, dmt.sY);
      this.j(dmt.sV, dmt.sZ);
      this.n(dmt.a);
      this.d(dmt.nI, dmt.a);
      this.d(dmt.nH, dmt.a);
      this.n(dmt.gn);
      this.n(dmt.eg);
      this.d(dmt.nJ, dmt.J);
      this.n(dmt.fZ);
      this.n(dmt.mK);
      this.n(dmt.fQ);
      this.n(dmt.gq);
      this.b(czr.vo);
      this.n(dmt.pO);
      this.n(dmt.J);
      this.n(dmt.K);
      this.n(dmt.ix);
      this.b(czr.go);
      this.o(dmt.qu, dmt.qL);
      this.o(dmt.qv, dmt.qM);
      this.o(dmt.qw, dmt.qN);
      this.o(dmt.qx, dmt.qO);
      this.o(dmt.qy, dmt.qP);
      this.o(dmt.qz, dmt.qQ);
      this.o(dmt.qA, dmt.qR);
      this.o(dmt.qB, dmt.qS);
      this.o(dmt.qC, dmt.qT);
      this.o(dmt.qD, dmt.qU);
      this.o(dmt.qE, dmt.qV);
      this.o(dmt.qF, dmt.qW);
      this.o(dmt.qG, dmt.qX);
      this.o(dmt.qH, dmt.qY);
      this.o(dmt.qI, dmt.qZ);
      this.o(dmt.qJ, dmt.ra);
      this.o(dmt.qt, dmt.qK);
      this.n(dmt.nG);
      this.n(dmt.gS);
      this.n(dmt.rx);
      this.n(dmt.tf);
      this.w(dmt.tg);
      this.w(dmt.th);
      this.x(dmt.tS);
      this.x(dmt.tT);
      this.ag();
      this.h(dmt.tm, dmt.ti);
      this.L(dmt.uf);
      this.M(dmt.ug);
      this.a(dmt.ue);
      this.t(dmt.tj);
      this.t(dmt.tk);
      this.s(dmt.tl);
      this.b(dmt.ul, frk.d.c);
      this.b(czr.da);
      this.a(dmt.iy, czr.if);
      this.b(czr.if);
      this.aG();
      this.a(dmt.lt, czr.jF);
      this.b(czr.jF);
      this.b(dmt.ca, fsc.a(dmt.bI, "_side"));
      this.a(dmt.U);
      this.a(dmt.V);
      this.a(dmt.jd);
      this.a(dmt.cI);
      this.a(dmt.cJ);
      this.a(dmt.cK);
      this.a(dmt.gd);
      this.a(dmt.ge);
      this.a(dmt.gi);
      this.a(dmt.Q);
      this.a(dmt.W);
      this.a(dmt.R);
      this.a(dmt.cr);
      this.a(dmt.S);
      this.a(dmt.T);
      this.a(dmt.cs);
      this.b(dmt.pR, fse.d);
      this.a(dmt.pQ);
      this.a(dmt.aY);
      this.a(dmt.aZ);
      this.a(dmt.ba);
      this.a(dmt.fG);
      this.a(dmt.hC);
      this.a(dmt.dY);
      this.a(dmt.dZ);
      this.a(dmt.hB);
      this.a(dmt.qk);
      this.a(dmt.nC);
      this.a(dmt.ei);
      this.a(dmt.k);
      this.a(dmt.pS);
      this.a(dmt.fY);
      this.a(dmt.et);
      this.a(dmt.O);
      this.a(dmt.pP);
      this.a(dmt.ee);
      this.b(dmt.ek, fse.g);
      this.b(dmt.pY, fse.d);
      this.b(dmt.fs, fse.d);
      this.n(dmt.ag);
      this.n(dmt.gA);
      this.a(dmt.lq);
      this.a(dmt.bf);
      this.a(dmt.je);
      this.a(dmt.cy);
      this.a(dmt.qs);
      this.a(dmt.iK);
      this.a(dmt.pe);
      this.a(dmt.en);
      this.a(dmt.eo);
      this.b(dmt.cD, fse.b);
      this.g(dmt.cE);
      this.a(dmt.aV);
      this.b(dmt.bG, fse.z);
      this.b(czr.dd);
      this.b(dmt.cu, fse.f);
      this.b(dmt.pL, fse.d);
      this.a(dmt.oV);
      this.a(dmt.aW);
      this.a(dmt.rb);
      this.a(dmt.rc);
      this.a(dmt.rv);
      this.a(dmt.tc);
      this.a(dmt.tP);
      this.a(dmt.tQ);
      this.a(dmt.tR);
      this.d(dmt.rA);
      this.n(dmt.ud);
      this.aB();
      this.a(dmt.rI);
      this.a(dmt.rJ);
      this.a(dmt.rE);
      this.a(dmt.rF);
      this.a(dmt.rG);
      this.a(dmt.rH);
      this.l(dmt.rE, dmt.se);
      this.l(dmt.rF, dmt.sg);
      this.l(dmt.rG, dmt.sf);
      this.l(dmt.rH, dmt.sh);
      this.j(dmt.su);
      this.j(dmt.sv);
      this.j(dmt.sx);
      this.j(dmt.sw);
      this.b(dmt.su, dmt.sy);
      this.b(dmt.sv, dmt.sz);
      this.b(dmt.sx, dmt.sB);
      this.b(dmt.sw, dmt.sA);
      this.l(dmt.sC);
      this.l(dmt.sD);
      this.l(dmt.sF);
      this.l(dmt.sE);
      this.c(dmt.sC, dmt.sG);
      this.c(dmt.sD, dmt.sH);
      this.c(dmt.sF, dmt.sJ);
      this.c(dmt.sE, dmt.sI);
      this.a(dmt.sK);
      this.a(dmt.sL);
      this.a(dmt.sM);
      this.a(dmt.sN);
      this.l(dmt.sK, dmt.sO);
      this.l(dmt.sL, dmt.sP);
      this.l(dmt.sM, dmt.sQ);
      this.l(dmt.sN, dmt.sR);
      this.k(dmt.hx, dmt.cr);
      this.k(dmt.hy, dmt.cs);
      this.D();
      this.o();
      this.av();
      this.s();
      this.t();
      this.a(dmt.oM, dmt.oN);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dmt.kZ);
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
      this.a(dmt.pJ);
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.d();
      this.J(dmt.fy);
      this.J(dmt.rB);
      this.b(dmt.fz, czr.gt);
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
      this.I(dmt.da);
      this.c(dmt.da);
      this.I(dmt.oG);
      this.e();
      this.I(dmt.to);
      this.m(dmt.cz, dmt.cA);
      this.m(dmt.er, dmt.es);
      this.a(dmt.cL, dmt.n, fsc::c);
      this.a(dmt.oE, dmt.p, fsc::d);
      this.C(dmt.pc);
      this.C(dmt.oT);
      this.z(dmt.bb);
      this.z(dmt.hJ);
      this.z();
      this.H(dmt.oK);
      this.H(dmt.oL);
      this.c(dmt.fp, b(frz.a(dmt.fp)));
      this.a(dmt.ep, fse.d);
      this.a(dmt.eq, fse.d);
      this.a(dmt.tO);
      this.a(dmt.ls, fse.d);
      this.e(dmt.j);
      this.e(dmt.tr);
      this.e(dmt.L);
      this.f(dmt.M);
      this.f(dmt.P);
      this.e(dmt.N);
      this.d(dmt.I);
      this.b(dmt.tY, fse.f);
      this.a(dmt.iL, fse.d, fse.e);
      this.a(dmt.ld, fse.A, fse.B);
      this.a(dmt.hG, fse.A, fse.B);
      this.a(dmt.tU, fse.d, fse.e);
      this.a(dmt.tV, fse.d, fse.e);
      this.a(dmt.tW, fse.d, fse.e);
      this.c(dmt.oz, fse.i);
      this.w();
      this.a(dmt.pM, fsc::D);
      this.a(dmt.pN, fsc::F);
      this.a(dmt.lj, ebj.av, 0, 1, 2, 3);
      this.a(dmt.gT, ebj.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmt.fP, ebj.av, 0, 1, 1, 2);
      this.a(dmt.gU, ebj.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dmt.cM, ebj.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dmt.lg, frk.d.b, ebj.at, 0, 1);
      this.g();
      this.f();
      this.aD();
      this.aF();
      this.aC();
      this.aE();
      this.a(dmt.lv, null);
      this.a(dmt.lw, cyl.a);
      this.a(dmt.lx, cyl.b);
      this.a(dmt.ly, cyl.c);
      this.a(dmt.lz, cyl.d);
      this.a(dmt.lA, cyl.e);
      this.a(dmt.lB, cyl.f);
      this.a(dmt.lC, cyl.g);
      this.a(dmt.lD, cyl.h);
      this.a(dmt.lE, cyl.i);
      this.a(dmt.lF, cyl.j);
      this.a(dmt.lG, cyl.k);
      this.a(dmt.lH, cyl.l);
      this.a(dmt.lI, cyl.m);
      this.a(dmt.lJ, cyl.n);
      this.a(dmt.lK, cyl.o);
      this.a(dmt.lL, cyl.p);
      this.r(dmt.nD);
      this.a(dmt.nD, new hin.a());
      this.a(dmt.tZ, dmt.jc);
      this.a(dmt.tZ, new hio.a());
      this.a(dmt.fW, dmt.cy);
      this.a(dmt.ll, dmt.cy);
      this.a(dmt.aT);
      this.a(dmt.aU);
      this.a(dmt.mc);
      this.a(dmt.md);
      this.a(dmt.me);
      this.a(dmt.mf);
      this.a(dmt.mg);
      this.a(dmt.mh);
      this.a(dmt.mi);
      this.a(dmt.mj);
      this.a(dmt.mk);
      this.a(dmt.ml);
      this.a(dmt.mm);
      this.a(dmt.mn);
      this.a(dmt.mo);
      this.a(dmt.mp);
      this.a(dmt.mq);
      this.a(dmt.mr);
      this.a(fse.a, dmt.ms, dmt.mt, dmt.mu, dmt.mv, dmt.mw, dmt.mx, dmt.my, dmt.mz, dmt.mA, dmt.mB, dmt.mC, dmt.mD, dmt.mE, dmt.mF, dmt.mG, dmt.mH);
      this.a(dmt.jc);
      this.a(dmt.hK);
      this.a(dmt.hL);
      this.a(dmt.hM);
      this.a(dmt.hN);
      this.a(dmt.hO);
      this.a(dmt.hP);
      this.a(dmt.hQ);
      this.a(dmt.hR);
      this.a(dmt.hS);
      this.a(dmt.hT);
      this.a(dmt.hU);
      this.a(dmt.hV);
      this.a(dmt.hW);
      this.a(dmt.hX);
      this.a(dmt.hY);
      this.a(dmt.hZ);
      this.a(dmt.rw);
      this.i(dmt.aX, dmt.fq);
      this.i(dmt.ez, dmt.ia);
      this.i(dmt.eA, dmt.ib);
      this.i(dmt.eB, dmt.ic);
      this.i(dmt.eC, dmt.id);
      this.i(dmt.eD, dmt.ie);
      this.i(dmt.eE, dmt.if);
      this.i(dmt.eF, dmt.ig);
      this.i(dmt.eG, dmt.ih);
      this.i(dmt.eH, dmt.ii);
      this.i(dmt.eI, dmt.ij);
      this.i(dmt.eJ, dmt.ik);
      this.i(dmt.eK, dmt.il);
      this.i(dmt.eL, dmt.im);
      this.i(dmt.eM, dmt.in);
      this.i(dmt.eN, dmt.io);
      this.i(dmt.eO, dmt.ip);
      this.b(fse.t, dmt.lM, dmt.lN, dmt.lO, dmt.lP, dmt.lQ, dmt.lR, dmt.lS, dmt.lT, dmt.lU, dmt.lV, dmt.lW, dmt.lX, dmt.lY, dmt.lZ, dmt.ma, dmt.mb);
      this.h(dmt.bK, dmt.iM);
      this.h(dmt.bL, dmt.iN);
      this.h(dmt.bM, dmt.iO);
      this.h(dmt.bN, dmt.iP);
      this.h(dmt.bO, dmt.iQ);
      this.h(dmt.bP, dmt.iR);
      this.h(dmt.bQ, dmt.iS);
      this.h(dmt.bR, dmt.iT);
      this.h(dmt.bS, dmt.iU);
      this.h(dmt.bT, dmt.iV);
      this.h(dmt.bU, dmt.iW);
      this.h(dmt.bV, dmt.iX);
      this.h(dmt.bW, dmt.iY);
      this.h(dmt.bX, dmt.iZ);
      this.h(dmt.bY, dmt.ja);
      this.h(dmt.bZ, dmt.jb);
      this.a(dmt.ts);
      this.a(dmt.fd);
      this.b(dmt.bB, dmt.gB, frk.d.a);
      this.h(dmt.bB);
      this.a(dmt.cb, dmt.gC, frk.d.b);
      this.a(dmt.cd, dmt.gD, frk.d.b);
      this.a(dmt.uh, dmt.uj, frk.d.c);
      this.a(dmt.ui, dmt.uk, frk.d.b);
      this.a(dmt.ce, dmt.gE, frk.d.b);
      this.a(dmt.cf, dmt.gF, frk.d.b);
      this.a(dmt.cg, dmt.gG, frk.d.b);
      this.a(dmt.ch, dmt.gH, frk.d.b);
      this.a(dmt.ci, dmt.gI, frk.d.b);
      this.a(dmt.cj, dmt.gJ, frk.d.b);
      this.a(dmt.ck, dmt.gK, frk.d.b);
      this.a(dmt.cl, dmt.gL, frk.d.b);
      this.a(dmt.cm, dmt.gM, frk.d.b);
      this.a(dmt.co, dmt.gN, frk.d.b);
      this.a(dmt.cn, dmt.gO, frk.d.b);
      this.a(dmt.cq, dmt.gP, frk.d.b);
      this.a(dmt.cp, dmt.gQ, frk.d.b);
      this.a(dmt.bC, dmt.gR, frk.d.b);
      this.a(dmt.cc, dmt.gr, frk.d.b);
      this.E();
      this.y(dmt.fl);
      this.y(dmt.fm);
      this.y(dmt.fn);
      this.b(dmt.bA, frk.d.a);
      this.h(dmt.bA);
      this.a(dmt.bE, frk.d.b);
      this.a(dmt.bF, frk.d.b);
      this.b(dmt.bD, frk.d.a);
      this.h(dmt.bD);
      this.b(dmt.ej, frk.d.a);
      this.b(czr.dW);
      this.c(dmt.mI, dmt.mJ, frk.d.b);
      this.b(czr.dX);
      this.b(dmt.tq, frk.d.b);
      this.c(dmt.pf, dmt.pg, frk.d.b);
      this.c(dmt.ph, dmt.pi, frk.d.b);
      this.a(dmt.pf, "_plant");
      this.a(dmt.ph, "_plant");
      this.a(dmt.nE, frk.d.a, fsc.c(fsc.a(dmt.nF, "_stage0")));
      this.k();
      this.a(dmt.eh, frk.d.b);
      this.a(dmt.bz, frk.d.b);
      this.d(dmt.jg, frk.d.b);
      this.d(dmt.jh, frk.d.b);
      this.d(dmt.ji, frk.d.b);
      this.o(dmt.jj);
      this.o(dmt.jk);
      this.h();
      this.i();
      this.j();
      this.a(dmt.nc, dmt.mX, dmt.mS, dmt.mN, dmt.nm, dmt.nh, dmt.nw, dmt.nr);
      this.a(dmt.nd, dmt.mY, dmt.mT, dmt.mO, dmt.nn, dmt.ni, dmt.nx, dmt.ns);
      this.a(dmt.ne, dmt.mZ, dmt.mU, dmt.mP, dmt.no, dmt.nj, dmt.ny, dmt.nt);
      this.a(dmt.nf, dmt.na, dmt.mV, dmt.mQ, dmt.np, dmt.nk, dmt.nz, dmt.nu);
      this.a(dmt.ng, dmt.nb, dmt.mW, dmt.mR, dmt.nq, dmt.nl, dmt.nA, dmt.nv);
      this.f(dmt.fw, dmt.fu);
      this.f(dmt.fv, dmt.ft);
      this.m(dmt.af).c(dmt.af).a(dmt.aA);
      this.m(dmt.ar).c(dmt.ar).a(dmt.aJ);
      this.a(dmt.ar, dmt.dx, dmt.dH);
      this.a(dmt.aS, fse.w, -7158200);
      this.m(dmt.ab).c(dmt.ab).a(dmt.ax);
      this.m(dmt.am).c(dmt.am).a(dmt.aF);
      this.a(dmt.am, dmt.dq, dmt.dC);
      this.a(dmt.D, dmt.gw, frk.d.b);
      this.a(dmt.aO, fse.w, -12012264);
      this.m(dmt.ac).d(dmt.ac).a(dmt.ay);
      this.m(dmt.an).d(dmt.an).a(dmt.aG);
      this.a(dmt.an, dmt.dr, dmt.dD);
      this.a(dmt.E, dmt.gx, frk.d.b);
      this.b(dmt.aP, fse.w);
      this.m(dmt.Z).c(dmt.Z).a(dmt.av);
      this.m(dmt.ak).c(dmt.ak).a(dmt.aD);
      this.a(dmt.ak, dmt.dp, dmt.dB);
      this.a(dmt.B, dmt.gu, frk.d.b);
      this.a(dmt.aM, fse.w, -8345771);
      this.m(dmt.X).c(dmt.X).a(dmt.at);
      this.m(dmt.aq).c(dmt.aq).a(dmt.aB);
      this.a(dmt.aq, dmt.dn, dmt.dz);
      this.a(dmt.z, dmt.gs, frk.d.b);
      this.a(dmt.aK, fse.w, -12012264);
      this.m(dmt.Y).c(dmt.Y).a(dmt.au);
      this.m(dmt.aj).c(dmt.aj).a(dmt.aC);
      this.a(dmt.aj, dmt.do, dmt.dA);
      this.a(dmt.A, dmt.gt, frk.d.b);
      this.a(dmt.aL, fse.w, -10380959);
      this.m(dmt.ad).c(dmt.ad).a(dmt.az);
      this.m(dmt.ao).c(dmt.ao).a(dmt.aH);
      this.a(dmt.ao, dmt.dt, dmt.dF);
      this.a(dmt.F, dmt.gy, frk.d.b);
      this.a(dmt.aQ, fse.w, -12012264);
      this.m(dmt.ae).c(dmt.ae).a(dmt.u);
      this.m(dmt.ap).c(dmt.ap).a(dmt.aI);
      this.a(dmt.ap, dmt.du, dmt.dG);
      this.a(dmt.G, dmt.gz, frk.d.b);
      this.b(dmt.aR, fse.w);
      this.m(dmt.aa).c(dmt.aa).a(dmt.aw);
      this.m(dmt.al).c(dmt.al).a(dmt.aE);
      this.a(dmt.al, dmt.ds, dmt.dE);
      this.a(dmt.C, dmt.gv, frk.d.b);
      this.a(dmt.aN, fse.w, -12012264);
      this.m(dmt.oY).b(dmt.oY).a(dmt.pa);
      this.m(dmt.oZ).b(dmt.oZ).a(dmt.pb);
      this.a(dmt.oZ, dmt.dv, dmt.dI);
      this.a(dmt.pd, dmt.pU, frk.d.b);
      this.n(dmt.pj, dmt.pW);
      this.m(dmt.oP).b(dmt.oP).a(dmt.oR);
      this.m(dmt.oQ).b(dmt.oQ).a(dmt.oS);
      this.a(dmt.oQ, dmt.dw, dmt.dJ);
      this.a(dmt.oU, dmt.pV, frk.d.b);
      this.n(dmt.oW, dmt.pX);
      this.m(dmt.ai).d(dmt.ai);
      this.m(dmt.as).d(dmt.as);
      this.a(dmt.x, dmt.dy, dmt.dK);
      this.b(dmt.oX, frk.d.b);
      this.b(czr.dT);
      this.j(dmt.dN);
      this.l(dmt.iA);
      this.r();
      this.p(dmt.db);
      this.q(dmt.bw);
      this.q(dmt.bx);
      this.q(dmt.hI);
      this.q();
      this.u(dmt.gm);
      this.u(dmt.lm);
      this.u(dmt.ln);
      this.v(dmt.ht);
      this.v(dmt.hu);
      this.v(dmt.hv);
      this.l();
      this.m();
      this.d(dmt.cO, fse.h);
      this.d(dmt.oC, fse.h);
      this.d(dmt.oB, fse.i);
      this.p();
      this.az();
      this.au();
      this.l(dmt.fc, dmt.fk);
      this.l(dmt.m, dmt.fg);
      this.l(dmt.fb, dmt.fj);
      this.l(dmt.fa, dmt.fi);
      this.ax();
      this.l(dmt.eZ, dmt.fh);
      this.ay();
   }

   private void aG() {
      hgf.b $$0 = frx.a(this.a(czr.ig));
      Map<Integer, hgf.b> $$1 = new HashMap<>(16);
      frt.a<gsi, Integer> $$2 = frt.a(ebj.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alg $$5 = fsc.a(czr.ig, $$4);
         $$2.a($$3, b(fsb.aa.a(dmt.iz, $$4, fsc.h($$5), this.l)));
         hgf.b $$6 = frx.a(fsb.bI.a(frz.a(czr.ig, $$4), fsc.k($$5), this.l));
         $$1.put($$3, $$6);
      }

      this.k.a(czr.ig, frx.a(drl.c, $$0, $$1));
      this.j.accept(frs.a(dmt.iz).a($$2));
   }

   private void o(dmr $$0, dmr $$1) {
      this.b($$0.h());
      fsc $$2 = fsc.b(fsc.J($$0));
      fsc $$3 = fsc.b(fsc.a($$0, "_lit"));
      gsi $$4 = b(fsb.bV.a($$0, "_one_candle", $$2, this.l));
      gsi $$5 = b(fsb.bW.a($$0, "_two_candles", $$2, this.l));
      gsi $$6 = b(fsb.bX.a($$0, "_three_candles", $$2, this.l));
      gsi $$7 = b(fsb.bY.a($$0, "_four_candles", $$2, this.l));
      gsi $$8 = b(fsb.bV.a($$0, "_one_candle_lit", $$3, this.l));
      gsi $$9 = b(fsb.bW.a($$0, "_two_candles_lit", $$3, this.l));
      gsi $$10 = b(fsb.bX.a($$0, "_three_candles_lit", $$3, this.l));
      gsi $$11 = b(fsb.bY.a($$0, "_four_candles_lit", $$3, this.l));
      this.j
         .accept(
            frs.a($$0)
               .a(
                  frt.a(ebj.aC, ebj.u)
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
      gsi $$12 = b(fsb.bZ.a($$1, fsc.a($$0, false), this.l));
      gsi $$13 = b(fsb.bZ.a($$1, "_lit", fsc.a($$0, true), this.l));
      this.j.accept(frs.a($$1).a(a(ebj.u, $$13, $$12)));
   }

   class a {
      private final fsc b;
      private final Map<fsa, alg> c = new HashMap<>();
      @Nullable
      private mk d;
      @Nullable
      private gsm e;
      private final Set<dmr> f = new HashSet<>();

      public a(final fsc $$0) {
         this.b = $$0;
      }

      public frk.a a(dmr $$0, fsa $$1) {
         this.e = frk.a($$1.a($$0, this.b, frk.this.l));
         if (frk.n.containsKey($$0)) {
            frk.this.j.accept(frk.n.get($$0).create($$0, this.e, this.b, frk.this.l));
         } else {
            frk.this.j.accept(frk.a($$0, frk.a(this.e)));
         }

         return this;
      }

      public frk.a a(dmr $$0, dmr $$1) {
         alg $$2 = frz.a($$0);
         frk.this.j.accept(frk.a($$1, frk.b($$2)));
         frk.this.k.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public frk.a a(dmr $$0) {
         gsi $$1 = frk.b(fsb.s.a($$0, this.b, frk.this.l));
         gsi $$2 = frk.b(fsb.t.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$1, $$2));
         alg $$3 = fsb.u.a($$0, this.b, frk.this.l);
         frk.this.a($$0, $$3);
         return this;
      }

      public frk.a b(dmr $$0) {
         gsi $$1 = frk.b(fsb.M.a($$0, this.b, frk.this.l));
         gsi $$2 = frk.b(fsb.N.a($$0, this.b, frk.this.l));
         gsi $$3 = frk.b(fsb.O.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$1, $$2, $$3));
         alg $$4 = fsb.P.a($$0, this.b, frk.this.l);
         frk.this.a($$0, $$4);
         return this;
      }

      public frk.a c(dmr $$0) {
         fsc $$1 = fsc.s($$0);
         gsi $$2 = frk.b(fsb.D.a($$0, $$1, frk.this.l));
         gsi $$3 = frk.b(fsb.E.a($$0, $$1, frk.this.l));
         gsi $$4 = frk.b(fsb.F.a($$0, $$1, frk.this.l));
         gsi $$5 = frk.b(fsb.G.a($$0, $$1, frk.this.l));
         gsi $$6 = frk.b(fsb.H.a($$0, $$1, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$2, $$3, $$4, $$5, $$6));
         alg $$7 = fsb.I.a($$0, $$1, frk.this.l);
         frk.this.a($$0, $$7);
         return this;
      }

      public frk.a d(dmr $$0) {
         gsi $$1 = frk.b(fsb.J.a($$0, this.b, frk.this.l));
         gsi $$2 = frk.b(fsb.K.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.b($$0, $$1, $$2));
         alg $$3 = fsb.L.a($$0, this.b, frk.this.l);
         frk.this.a($$0, $$3);
         return this;
      }

      public frk.a e(dmr $$0) {
         fsc $$1 = fsc.s($$0);
         gsi $$2 = frk.b(fsb.R.a($$0, $$1, frk.this.l));
         gsi $$3 = frk.b(fsb.Q.a($$0, $$1, frk.this.l));
         gsi $$4 = frk.b(fsb.T.a($$0, $$1, frk.this.l));
         gsi $$5 = frk.b(fsb.S.a($$0, $$1, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public frk.a f(dmr $$0) {
         gsi $$1 = frk.b(fsb.V.a($$0, this.b, frk.this.l));
         gsi $$2 = frk.b(fsb.U.a($$0, this.b, frk.this.l));
         gsi $$3 = frk.b(fsb.X.a($$0, this.b, frk.this.l));
         gsi $$4 = frk.b(fsb.W.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public frk.a g(dmr $$0) {
         gsi $$1 = frk.b(fsb.Y.a($$0, this.b, frk.this.l));
         gsi $$2 = frk.b(fsb.Z.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.d($$0, $$1, $$2));
         return this;
      }

      public frk.a h(dmr $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dmr $$1 = this.d.b().get(mk.b.r);
            gsi $$2 = frk.b(fsb.aa.a($$0, this.b, frk.this.l));
            frk.this.j.accept(frk.a($$0, $$2));
            frk.this.j.accept(frk.a($$1, $$2));
            frk.this.b($$0.h());
            return this;
         }
      }

      public frk.a i(dmr $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alg $$1 = this.a(fsb.ab, $$0);
            gsi $$2 = frk.b(this.a(fsb.ac, $$0));
            frk.this.j.accept(frk.e($$0, frk.b($$1), $$2, frk.a(this.e)));
            frk.this.a($$0, $$1);
            return this;
         }
      }

      public frk.a j(dmr $$0) {
         gsi $$1 = frk.b(this.a(fsb.af, $$0));
         alg $$2 = this.a(fsb.ae, $$0);
         gsi $$3 = frk.b(this.a(fsb.ag, $$0));
         frk.this.j.accept(frk.b($$0, $$1, frk.b($$2), $$3));
         frk.this.a($$0, $$2);
         return this;
      }

      private frk.a k(dmr $$0) {
         fse $$1 = frk.t.getOrDefault($$0, fse.a.get($$0));
         gsi $$2 = frk.b($$1.a($$0, frk.this.l));
         frk.this.j.accept(frk.a($$0, $$2));
         return this;
      }

      private frk.a l(dmr $$0) {
         frk.this.j($$0);
         return this;
      }

      private void m(dmr $$0) {
         if (frk.m.contains($$0)) {
            frk.this.l($$0);
         } else {
            frk.this.k($$0);
         }
      }

      private alg a(fsa $$0, dmr $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, frk.this.l));
      }

      public frk.a a(mk $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<frk.a, dmr> $$2 = frk.u.get($$0x);
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
      frp create(dmr var1, gsm var2, fsc var3, BiConsumer<alg, fry> var4);
   }

   static record c(fsa a, String b) {
   }

   static enum d {
      a(fsb.ap, fsb.as, false),
      b(fsb.ao, fsb.ar, false),
      c(fsb.aq, fsb.at, true);

      private final fsa d;
      private final fsa e;
      private final boolean f;

      private d(final fsa $$0, final fsa $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fsa a() {
         return this.d;
      }

      public fsa b() {
         return this.e;
      }

      public alg a(frk $$0, dmr $$1) {
         czj $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fsc a(dmr $$0) {
         return this.f ? fsc.e($$0) : fsc.c($$0);
      }

      public fsc b(dmr $$0) {
         return this.f ? fsc.g($$0) : fsc.f($$0);
      }
   }

   class e {
      private final fsc b;

      public e(final fsc $$0) {
         this.b = $$0;
      }

      public frk.e a(dmr $$0) {
         fsc $$1 = this.b.c(fsd.d, this.b.a(fsd.i));
         alg $$2 = fsb.j.a($$0, $$1, frk.this.l);
         frk.this.j.accept(frk.b($$0, frk.b($$2)));
         frk.this.a($$0, $$2);
         return this;
      }

      public frk.e b(dmr $$0) {
         alg $$1 = fsb.j.a($$0, this.b, frk.this.l);
         frk.this.j.accept(frk.b($$0, frk.b($$1)));
         frk.this.a($$0, $$1);
         return this;
      }

      public frk.e c(dmr $$0) {
         alg $$1 = fsb.j.a($$0, this.b, frk.this.l);
         gsi $$2 = frk.b(fsb.k.a($$0, this.b, frk.this.l));
         frk.this.j.accept(frk.c($$0, frk.b($$1), $$2));
         frk.this.a($$0, $$1);
         return this;
      }

      public frk.e d(dmr $$0) {
         frk.this.j.accept(frk.a($$0, this.b, frk.this.l));
         frk.this.a($$0, fsb.j.a($$0, this.b, frk.this.l));
         return this;
      }
   }
}
