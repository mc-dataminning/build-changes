import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
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
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fsw {
   final Consumer<ftc> i;
   final fsz j;
   final BiConsumer<alk, ftl> k;
   static final List<dne> l = List.of(dng.eP, dng.eV, dng.iA);
   public static final gtz a = $$0 -> $$0;
   public static final gtz b = gtz.d.withValue(true);
   public static final gtz c = gtz.a.withValue(i.b);
   public static final gtz d = gtz.a.withValue(i.c);
   public static final gtz e = gtz.a.withValue(i.d);
   public static final gtz f = gtz.b.withValue(i.b);
   public static final gtz g = gtz.b.withValue(i.c);
   public static final gtz h = gtz.b.withValue(i.d);
   static final Map<dne, fsw.b> m = Map.of(dng.b, fsw::a, dng.tt, fsw::c, dng.fe, fsw::b);
   private static final ftg<gtz> n = ftg.b(ebw.R).a(jc.a, c).a(jc.b, e).a(jc.c, a).a(jc.d, g).a(jc.e, h).a(jc.f, f);
   private static final ftg<gtz> o = ftg.b(ebw.R).a(jc.a, d).a(jc.b, a).a(jc.c, c).a(jc.d, c.then(g)).a(jc.e, c.then(h)).a(jc.f, c.then(f));
   private static final ftg<gtz> p = ftg.b(ebw.T).a(jc.f, a).a(jc.d, f).a(jc.e, g).a(jc.c, h);
   private static final ftg<gtz> q = ftg.b(ebw.T).a(jc.d, a).a(jc.e, f).a(jc.c, g).a(jc.f, h);
   private static final ftg<gtz> r = ftg.b(ebw.T).a(jc.f, f).a(jc.d, g).a(jc.e, h).a(jc.c, a);
   static final Map<dne, ftr> s = ImmutableMap.builder()
      .put(dng.bc, ftr.C.get(dng.bc))
      .put(dng.jR, ftr.C.get(dng.jR))
      .put(dng.kv, ftr.a(ftp.a(dng.bc, "_top")))
      .put(dng.kx, ftr.a(ftp.a(dng.jR, "_top")))
      .put(dng.be, ftr.d.get(dng.bc).a($$0 -> $$0.a(ftq.i, ftp.J(dng.be))))
      .put(dng.jT, ftr.d.get(dng.jR).a($$0 -> $$0.a(ftq.i, ftp.J(dng.jT))))
      .put(dng.hE, ftr.d.get(dng.hE))
      .put(dng.kw, ftr.a(ftp.a(dng.hE, "_bottom")))
      .put(dng.pZ, ftr.D.get(dng.pZ))
      .put(dng.tt, ftr.D.get(dng.tt))
      .put(dng.hF, ftr.d.get(dng.hF).a($$0 -> $$0.a(ftq.i, ftp.J(dng.hF))))
      .put(dng.bd, ftr.d.get(dng.bd).a($$0 -> {
         $$0.a(ftq.d, ftp.a(dng.bc, "_top"));
         $$0.a(ftq.i, ftp.J(dng.bd));
      }))
      .put(dng.jS, ftr.d.get(dng.jS).a($$0 -> {
         $$0.a(ftq.d, ftp.a(dng.jR, "_top"));
         $$0.a(ftq.i, ftp.J(dng.jS));
      }))
      .put(dng.ru, ftr.D.get(dng.ru))
      .put(dng.rp, ftr.D.get(dng.rp))
      .build();
   static final Map<ml.b, BiConsumer<fsw.a, dne>> t = ImmutableMap.builder()
      .put(ml.b.a, fsw.a::a)
      .put(ml.b.e, fsw.a::l)
      .put(ml.b.b, fsw.a::k)
      .put(ml.b.c, fsw.a::k)
      .put(ml.b.f, fsw.a::c)
      .put(ml.b.g, fsw.a::d)
      .put(ml.b.h, fsw.a::e)
      .put(ml.b.i, fsw.a::f)
      .put(ml.b.k, fsw.a::h)
      .put(ml.b.l, fsw.a::i)
      .put(ml.b.m, fsw.a::j)
      .put(ml.b.n, fsw.a::g)
      .put(ml.b.p, fsw.a::m)
      .put(ml.b.q, fsw.a::b)
      .build();
   private static final Map<jc, gtz> u = ImmutableMap.of(jc.c, a, jc.f, f.then(b), jc.d, g.then(b), jc.e, h.then(b), jc.b, e.then(b), jc.a, c.then(b));
   private static final Map<fsw.c, alk> v = new HashMap<>();

   static gty a(alk $$0) {
      return new gty($$0);
   }

   static ftb a(gty $$0) {
      return new ftb(btd.a($$0));
   }

   private static ftb a(gty... $$0) {
      return new ftb(btd.a(Arrays.stream($$0).map($$0x -> new btc<>($$0x, 1)).toList()));
   }

   static ftb b(alk $$0) {
      return a(a($$0));
   }

   private static ftd b() {
      return new ftd();
   }

   private static guc a(ftd... $$0) {
      return new gub(gub.a.b, Stream.of($$0).map(ftd::a).toList());
   }

   private static ftc a(dne $$0, gty $$1, ftp $$2, BiConsumer<alk, ftl> $$3) {
      gty $$4 = a(fto.e.a($$0, $$2, $$3));
      return ftf.a($$0, a($$1, $$4));
   }

   private static ftc b(dne $$0, gty $$1, ftp $$2, BiConsumer<alk, ftl> $$3) {
      ftb $$4 = b(fto.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static ftc c(dne $$0, gty $$1, ftp $$2, BiConsumer<alk, ftl> $$3) {
      gty $$4 = a(fto.l.a($$0, $$2, $$3));
      return ftf.a($$0, a($$1, $$4)).a(c());
   }

   public fsw(Consumer<ftc> $$0, fsz $$1, BiConsumer<alk, ftl> $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   private void a(czw $$0, alk $$1) {
      this.j.a($$0, ftk.a($$1));
   }

   void a(dne $$0, alk $$1) {
      this.j.a($$0.h(), ftk.a($$1));
   }

   private void a(dne $$0, alk $$1, fsp $$2) {
      this.j.a($$0.h(), ftk.a($$1, $$2));
   }

   private alk a(czw $$0) {
      return fto.bI.a(ftm.a($$0), ftp.b($$0), this.k);
   }

   alk a(czw $$0, dne $$1) {
      return fto.bI.a(ftm.a($$0), ftp.I($$1), this.k);
   }

   private alk a(czw $$0, dne $$1, String $$2) {
      return fto.bI.a(ftm.a($$0), ftp.k(ftp.a($$1, $$2)), this.k);
   }

   alk b(czw $$0, dne $$1, String $$2) {
      alk $$3 = ftp.J($$1);
      alk $$4 = ftp.a($$1, $$2);
      return fto.bM.a(ftm.a($$0), ftp.c($$3, $$4), this.k);
   }

   void b(czw $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dne $$0) {
      czw $$1 = $$0.h();
      if ($$1 != dae.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dne $$0, String $$1) {
      czw $$2 = $$0.h();
      if ($$2 != dae.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dne $$0, String $$1) {
      czw $$2 = $$0.h();
      if ($$2 != dae.a) {
         alk $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static ftb b(gty $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static ftb a(gty $$0, gty $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static ftg<ftb> a(ebx $$0, ftb $$1, ftb $$2) {
      return ftg.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dne $$0) {
      gty $$1 = a(ftr.a.create($$0, this.k));
      gty $$2 = a(ftr.c.create($$0, this.k));
      this.i.accept(ftf.a($$0, a($$1, $$2)));
   }

   private void e(dne $$0) {
      gty $$1 = a(ftr.a.create($$0, this.k));
      this.i.accept(ftf.a($$0, b($$1)));
   }

   private void f(dne $$0) {
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alk $$3 = ftp.a($$0, $$2);
         alk $$4 = fto.c.a($$0, $$2, new ftp().a(ftq.a, $$3), this.k);
         return b($$4);
      })));
      this.a($$0, ftm.a($$0, "_0"));
   }

   static ftc a(dne $$0, ftb $$1, ftb $$2) {
      return ftf.a($$0)
         .a(ftg.a(ebw.A).a(false, $$1).a(true, $$2))
         .a(
            ftg.b(ebw.X, ebw.T)
               .a(ebr.a, jc.f, f)
               .a(ebr.a, jc.e, h)
               .a(ebr.a, jc.d, g)
               .a(ebr.a, jc.c, a)
               .a(ebr.b, jc.f, f.then(c).then(b))
               .a(ebr.b, jc.e, h.then(c).then(b))
               .a(ebr.b, jc.d, g.then(c).then(b))
               .a(ebr.b, jc.c, c.then(b))
               .a(ebr.c, jc.f, h.then(d))
               .a(ebr.c, jc.e, f.then(d))
               .a(ebr.c, jc.d, d)
               .a(ebr.c, jc.c, g.then(d))
         );
   }

   private static ftc a(dne $$0, ftb $$1, ftb $$2, ftb $$3, ftb $$4, ftb $$5, ftb $$6, ftb $$7, ftb $$8) {
      return ftf.a($$0)
         .a(
            ftg.a(ebw.T, ebw.ah, ebw.bh, ebw.y)
               .a(jc.f, ecc.b, ecb.a, false, $$1)
               .a(jc.d, ecc.b, ecb.a, false, $$1.a(f))
               .a(jc.e, ecc.b, ecb.a, false, $$1.a(g))
               .a(jc.c, ecc.b, ecb.a, false, $$1.a(h))
               .a(jc.f, ecc.b, ecb.b, false, $$3)
               .a(jc.d, ecc.b, ecb.b, false, $$3.a(f))
               .a(jc.e, ecc.b, ecb.b, false, $$3.a(g))
               .a(jc.c, ecc.b, ecb.b, false, $$3.a(h))
               .a(jc.f, ecc.b, ecb.a, true, $$2.a(f))
               .a(jc.d, ecc.b, ecb.a, true, $$2.a(g))
               .a(jc.e, ecc.b, ecb.a, true, $$2.a(h))
               .a(jc.c, ecc.b, ecb.a, true, $$2)
               .a(jc.f, ecc.b, ecb.b, true, $$4.a(h))
               .a(jc.d, ecc.b, ecb.b, true, $$4)
               .a(jc.e, ecc.b, ecb.b, true, $$4.a(f))
               .a(jc.c, ecc.b, ecb.b, true, $$4.a(g))
               .a(jc.f, ecc.a, ecb.a, false, $$5)
               .a(jc.d, ecc.a, ecb.a, false, $$5.a(f))
               .a(jc.e, ecc.a, ecb.a, false, $$5.a(g))
               .a(jc.c, ecc.a, ecb.a, false, $$5.a(h))
               .a(jc.f, ecc.a, ecb.b, false, $$7)
               .a(jc.d, ecc.a, ecb.b, false, $$7.a(f))
               .a(jc.e, ecc.a, ecb.b, false, $$7.a(g))
               .a(jc.c, ecc.a, ecb.b, false, $$7.a(h))
               .a(jc.f, ecc.a, ecb.a, true, $$6.a(f))
               .a(jc.d, ecc.a, ecb.a, true, $$6.a(g))
               .a(jc.e, ecc.a, ecb.a, true, $$6.a(h))
               .a(jc.c, ecc.a, ecb.a, true, $$6)
               .a(jc.f, ecc.a, ecb.b, true, $$8.a(h))
               .a(jc.d, ecc.a, ecb.b, true, $$8)
               .a(jc.e, ecc.a, ecb.b, true, $$8.a(f))
               .a(jc.c, ecc.a, ecb.b, true, $$8.a(g))
         );
   }

   static ftc a(dne $$0, ftb $$1, ftb $$2, ftb $$3, ftb $$4, ftb $$5) {
      return fte.a($$0).a($$1).a(b().a(ebw.N, true), $$2).a(b().a(ebw.O, true), $$3).a(b().a(ebw.P, true), $$4).a(b().a(ebw.Q, true), $$5);
   }

   static ftc b(dne $$0, ftb $$1, ftb $$2) {
      return fte.a($$0)
         .a($$1)
         .a(b().a(ebw.N, true), $$2.a(b))
         .a(b().a(ebw.O, true), $$2.a(f).a(b))
         .a(b().a(ebw.P, true), $$2.a(g).a(b))
         .a(b().a(ebw.Q, true), $$2.a(h).a(b));
   }

   static ftc a(dne $$0, ftb $$1, ftb $$2, ftb $$3) {
      return fte.a($$0)
         .a(b().a(ebw.L, true), $$1)
         .a(b().a(ebw.aa, ect.b), $$2.a(b))
         .a(b().a(ebw.Z, ect.b), $$2.a(f).a(b))
         .a(b().a(ebw.ab, ect.b), $$2.a(g).a(b))
         .a(b().a(ebw.ac, ect.b), $$2.a(h).a(b))
         .a(b().a(ebw.aa, ect.c), $$3.a(b))
         .a(b().a(ebw.Z, ect.c), $$3.a(f).a(b))
         .a(b().a(ebw.ab, ect.c), $$3.a(g).a(b))
         .a(b().a(ebw.ac, ect.c), $$3.a(h).a(b));
   }

   static ftc a(dne $$0, ftb $$1, ftb $$2, ftb $$3, ftb $$4, boolean $$5) {
      return ftf.a($$0).a(ftg.a(ebw.t, ebw.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(q);
   }

   static ftc b(dne $$0, ftb $$1, ftb $$2, ftb $$3) {
      return ftf.a($$0)
         .a(
            ftg.a(ebw.T, ebw.ai, ebw.bl)
               .a(jc.f, ecf.b, ecp.a, $$2)
               .a(jc.e, ecf.b, ecp.a, $$2.a(g).a(b))
               .a(jc.d, ecf.b, ecp.a, $$2.a(f).a(b))
               .a(jc.c, ecf.b, ecp.a, $$2.a(h).a(b))
               .a(jc.f, ecf.b, ecp.e, $$3)
               .a(jc.e, ecf.b, ecp.e, $$3.a(g).a(b))
               .a(jc.d, ecf.b, ecp.e, $$3.a(f).a(b))
               .a(jc.c, ecf.b, ecp.e, $$3.a(h).a(b))
               .a(jc.f, ecf.b, ecp.d, $$3.a(h).a(b))
               .a(jc.e, ecf.b, ecp.d, $$3.a(f).a(b))
               .a(jc.d, ecf.b, ecp.d, $$3)
               .a(jc.c, ecf.b, ecp.d, $$3.a(g).a(b))
               .a(jc.f, ecf.b, ecp.c, $$1)
               .a(jc.e, ecf.b, ecp.c, $$1.a(g).a(b))
               .a(jc.d, ecf.b, ecp.c, $$1.a(f).a(b))
               .a(jc.c, ecf.b, ecp.c, $$1.a(h).a(b))
               .a(jc.f, ecf.b, ecp.b, $$1.a(h).a(b))
               .a(jc.e, ecf.b, ecp.b, $$1.a(f).a(b))
               .a(jc.d, ecf.b, ecp.b, $$1)
               .a(jc.c, ecf.b, ecp.b, $$1.a(g).a(b))
               .a(jc.f, ecf.a, ecp.a, $$2.a(d).a(b))
               .a(jc.e, ecf.a, ecp.a, $$2.a(d).a(g).a(b))
               .a(jc.d, ecf.a, ecp.a, $$2.a(d).a(f).a(b))
               .a(jc.c, ecf.a, ecp.a, $$2.a(d).a(h).a(b))
               .a(jc.f, ecf.a, ecp.e, $$3.a(d).a(f).a(b))
               .a(jc.e, ecf.a, ecp.e, $$3.a(d).a(h).a(b))
               .a(jc.d, ecf.a, ecp.e, $$3.a(d).a(g).a(b))
               .a(jc.c, ecf.a, ecp.e, $$3.a(d).a(b))
               .a(jc.f, ecf.a, ecp.d, $$3.a(d).a(b))
               .a(jc.e, ecf.a, ecp.d, $$3.a(d).a(g).a(b))
               .a(jc.d, ecf.a, ecp.d, $$3.a(d).a(f).a(b))
               .a(jc.c, ecf.a, ecp.d, $$3.a(d).a(h).a(b))
               .a(jc.f, ecf.a, ecp.c, $$1.a(d).a(f).a(b))
               .a(jc.e, ecf.a, ecp.c, $$1.a(d).a(h).a(b))
               .a(jc.d, ecf.a, ecp.c, $$1.a(d).a(g).a(b))
               .a(jc.c, ecf.a, ecp.c, $$1.a(d).a(b))
               .a(jc.f, ecf.a, ecp.b, $$1.a(d).a(b))
               .a(jc.e, ecf.a, ecp.b, $$1.a(d).a(g).a(b))
               .a(jc.d, ecf.a, ecp.b, $$1.a(d).a(f).a(b))
               .a(jc.c, ecf.a, ecp.b, $$1.a(d).a(h).a(b))
         );
   }

   private static ftc c(dne $$0, ftb $$1, ftb $$2, ftb $$3) {
      return ftf.a($$0)
         .a(
            ftg.a(ebw.T, ebw.ai, ebw.y)
               .a(jc.c, ecf.b, false, $$2)
               .a(jc.d, ecf.b, false, $$2.a(g))
               .a(jc.f, ecf.b, false, $$2.a(f))
               .a(jc.e, ecf.b, false, $$2.a(h))
               .a(jc.c, ecf.a, false, $$1)
               .a(jc.d, ecf.a, false, $$1.a(g))
               .a(jc.f, ecf.a, false, $$1.a(f))
               .a(jc.e, ecf.a, false, $$1.a(h))
               .a(jc.c, ecf.b, true, $$3)
               .a(jc.d, ecf.b, true, $$3.a(g))
               .a(jc.f, ecf.b, true, $$3.a(f))
               .a(jc.e, ecf.b, true, $$3.a(h))
               .a(jc.c, ecf.a, true, $$3.a(d).a(g))
               .a(jc.d, ecf.a, true, $$3.a(d))
               .a(jc.f, ecf.a, true, $$3.a(d).a(h))
               .a(jc.e, ecf.a, true, $$3.a(d).a(f))
         );
   }

   private static ftc d(dne $$0, ftb $$1, ftb $$2, ftb $$3) {
      return ftf.a($$0)
         .a(
            ftg.a(ebw.T, ebw.ai, ebw.y)
               .a(jc.c, ecf.b, false, $$2)
               .a(jc.d, ecf.b, false, $$2)
               .a(jc.f, ecf.b, false, $$2)
               .a(jc.e, ecf.b, false, $$2)
               .a(jc.c, ecf.a, false, $$1)
               .a(jc.d, ecf.a, false, $$1)
               .a(jc.f, ecf.a, false, $$1)
               .a(jc.e, ecf.a, false, $$1)
               .a(jc.c, ecf.b, true, $$3)
               .a(jc.d, ecf.b, true, $$3.a(g))
               .a(jc.f, ecf.b, true, $$3.a(f))
               .a(jc.e, ecf.b, true, $$3.a(h))
               .a(jc.c, ecf.a, true, $$3)
               .a(jc.d, ecf.a, true, $$3.a(g))
               .a(jc.f, ecf.a, true, $$3.a(f))
               .a(jc.e, ecf.a, true, $$3.a(h))
         );
   }

   static ftf a(dne $$0, ftb $$1) {
      return ftf.a($$0, $$1);
   }

   private static ftg<gtz> c() {
      return ftg.b(ebw.K).a(jc.a.b, a).a(jc.a.c, c).a(jc.a.a, c.then(f));
   }

   static ftc a(dne $$0, ftp $$1, BiConsumer<alk, ftl> $$2) {
      ftb $$3 = b(fto.g.a($$0, $$1, $$2));
      ftb $$4 = b(fto.h.a($$0, $$1, $$2));
      ftb $$5 = b(fto.i.a($$0, $$1, $$2));
      return ftf.a($$0).a(ftg.a(ebw.K).a(jc.a.a, $$3).a(jc.a.b, $$4).a(jc.a.c, $$5));
   }

   static ftc b(dne $$0, ftb $$1) {
      return ftf.a($$0, $$1).a(c());
   }

   private void c(dne $$0, ftb $$1) {
      this.i.accept(b($$0, $$1));
   }

   public void a(dne $$0, ftr.a $$1) {
      ftb $$2 = b($$1.create($$0, this.k));
      this.i.accept(b($$0, $$2));
   }

   private void c(dne $$0, ftr.a $$1) {
      ftb $$2 = b($$1.create($$0, this.k));
      this.i.accept(ftf.a($$0, $$2).a(r));
   }

   static ftc c(dne $$0, ftb $$1, ftb $$2) {
      return ftf.a($$0).a(ftg.a(ebw.K).a(jc.a.b, $$1).a(jc.a.c, $$2.a(c)).a(jc.a.a, $$2.a(c).a(f)));
   }

   private void a(dne $$0, ftr.a $$1, ftr.a $$2) {
      ftb $$3 = b($$1.create($$0, this.k));
      ftb $$4 = b($$2.create($$0, this.k));
      this.i.accept(c($$0, $$3, $$4));
   }

   private void g(dne $$0) {
      ftb $$1 = b(ftr.A.create($$0, this.k));
      ftb $$2 = b(ftr.B.create($$0, this.k));
      ftb $$3 = b(this.a(ftr.A, $$0, "_awake"));
      ftb $$4 = b(this.a(ftr.B, $$0, "_awake"));
      ftb $$5 = b(this.a(ftr.A, $$0, "_dormant"));
      ftb $$6 = b(this.a(ftr.B, $$0, "_dormant"));
      this.i
         .accept(
            ftf.a($$0)
               .a(
                  ftg.a(ebw.K, dpa.c)
                     .a(jc.a.b, eca.a, $$1)
                     .a(jc.a.c, eca.a, $$2.a(c))
                     .a(jc.a.a, eca.a, $$2.a(c).a(f))
                     .a(jc.a.b, eca.b, $$5)
                     .a(jc.a.c, eca.b, $$6.a(c))
                     .a(jc.a.a, eca.b, $$6.a(c).a(f))
                     .a(jc.a.b, eca.c, $$3)
                     .a(jc.a.c, eca.c, $$4.a(c))
                     .a(jc.a.a, eca.c, $$4.a(c).a(f))
               )
         );
   }

   private alk a(ftr.a $$0, dne $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(ftq.i, ftp.a($$1, $$2)).a(ftq.d, ftp.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.k);
   }

   private alk a(dne $$0, String $$1, ftn $$2, Function<alk, ftp> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ftp.a($$0, $$1)), this.k);
   }

   static ftc d(dne $$0, ftb $$1, ftb $$2) {
      return ftf.a($$0).a(a(ebw.A, $$2, $$1));
   }

   static ftc e(dne $$0, ftb $$1, ftb $$2, ftb $$3) {
      return ftf.a($$0).a(ftg.a(ebw.bk).a(eco.b, $$1).a(eco.a, $$2).a(eco.c, $$3));
   }

   public void a(dne $$0) {
      this.b($$0, ftr.a);
   }

   public void b(dne $$0, ftr.a $$1) {
      this.i.accept(a($$0, b($$1.create($$0, this.k))));
   }

   public void a(dne $$0, ftr.a $$1, int $$2) {
      alk $$3 = $$1.create($$0, this.k);
      this.i.accept(a($$0, b($$3)));
      this.a($$0, $$3, ftk.a($$2));
   }

   private void d() {
      this.K(dng.fx);
      alk $$0 = this.a(dae.gr, dng.fx);
      this.a(dng.fx, $$0, ftk.a(-12012264));
   }

   private void h(dne $$0) {
      alk $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fso());
   }

   private fsw.a i(dne $$0) {
      ftr $$1 = s.getOrDefault($$0, ftr.a.get($$0));
      return new fsw.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dne $$0, dne $$1, dne $$2) {
      ftb $$3 = this.g($$1, $$0);
      this.i.accept(a($$1, $$3));
      this.i.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dne $$0) {
      ftp $$1 = ftp.w($$0);
      ftb $$2 = b(fto.v.a($$0, $$1, this.k));
      ftb $$3 = b(fto.w.a($$0, $$1, this.k));
      ftb $$4 = b(fto.x.a($$0, $$1, this.k));
      ftb $$5 = b(fto.y.a($$0, $$1, this.k));
      ftb $$6 = b(fto.z.a($$0, $$1, this.k));
      ftb $$7 = b(fto.A.a($$0, $$1, this.k));
      ftb $$8 = b(fto.B.a($$0, $$1, this.k));
      ftb $$9 = b(fto.C.a($$0, $$1, this.k));
      this.b($$0.h());
      this.i.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dne $$0, dne $$1) {
      ftb $$2 = b(fto.v.a($$0));
      ftb $$3 = b(fto.w.a($$0));
      ftb $$4 = b(fto.x.a($$0));
      ftb $$5 = b(fto.y.a($$0));
      ftb $$6 = b(fto.z.a($$0));
      ftb $$7 = b(fto.A.a($$0));
      ftb $$8 = b(fto.B.a($$0));
      ftb $$9 = b(fto.C.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dne $$0) {
      ftp $$1 = ftp.b($$0);
      ftb $$2 = b(fto.ak.a($$0, $$1, this.k));
      alk $$3 = fto.al.a($$0, $$1, this.k);
      ftb $$4 = b(fto.am.a($$0, $$1, this.k));
      this.i.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dne $$0) {
      ftp $$1 = ftp.b($$0);
      ftb $$2 = b(fto.ah.a($$0, $$1, this.k));
      alk $$3 = fto.ai.a($$0, $$1, this.k);
      ftb $$4 = b(fto.aj.a($$0, $$1, this.k));
      this.i.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dne $$0, dne $$1) {
      ftb $$2 = b(fto.ah.a($$0));
      ftb $$3 = b(fto.ai.a($$0));
      ftb $$4 = b(fto.aj.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      ftb $$0 = b(ftm.a(dng.tn));
      ftb $$1 = b(ftm.a(dng.tn, "_partial_tilt"));
      ftb $$2 = b(ftm.a(dng.tn, "_full_tilt"));
      this.i.accept(ftf.a(dng.tn).a(ftg.a(ebw.bo).a(ecs.a, $$0).a(ecs.b, $$0).a(ecs.c, $$1).a(ecs.d, $$2)).a(r));
   }

   private fsw.e m(dne $$0) {
      return new fsw.e(ftp.q($$0));
   }

   private void n(dne $$0) {
      this.d($$0, $$0);
   }

   private void d(dne $$0, dne $$1) {
      this.i.accept(a($$0, b(ftm.a($$1))));
   }

   private void a(dne $$0, fsw.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dne $$0, fsw.d $$1, ftp $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dne $$0, fsw.d $$1) {
      ftp $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dne $$0, fsw.d $$1, ftp $$2) {
      ftb $$3 = b($$1.a().a($$0, $$2, this.k));
      this.i.accept(a($$0, $$3));
   }

   private void a(dne $$0, fsw.d $$1, ecj<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.i.accept(ftf.a($$0).a(ftg.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            ftp $$5 = ftp.c(ftp.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.k));
         })));
      }
   }

   private void a(dne $$0, dne $$1, fsw.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dne $$0, dne $$1, fsw.d $$2) {
      this.b($$0, $$2);
      ftp $$3 = $$2.b($$0);
      ftb $$4 = b($$2.b().a($$1, $$3, this.k));
      this.i.accept(a($$1, $$4));
   }

   private void e(dne $$0, dne $$1) {
      ftr $$2 = ftr.u.get($$0);
      ftb $$3 = b($$2.a($$0, this.k));
      this.i.accept(a($$0, $$3));
      ftb $$4 = b(fto.aJ.a($$1, $$2.b(), this.k));
      this.i.accept(ftf.a($$1, $$4).a(r));
      this.c($$0);
   }

   private void f(dne $$0, dne $$1) {
      this.b($$0.h());
      ftp $$2 = ftp.k($$0);
      ftp $$3 = ftp.a($$0, $$1);
      ftb $$4 = b(fto.bb.a($$1, $$3, this.k));
      this.i.accept(ftf.a($$1, $$4).a(ftg.b(ebw.T).a(jc.e, a).a(jc.d, h).a(jc.c, f).a(jc.f, g)));
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.ay).a($$2x -> b(fto.ba[$$2x].a($$0, $$2, this.k)))));
   }

   private void f() {
      dne $$0 = dng.li;
      this.b($$0.h());
      ftb $$1 = b(ftm.a($$0, "_top"));
      ftb $$2 = b(ftm.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dne $$0 = dng.lh;
      this.b($$0.h());
      this.i.accept(ftf.a($$0).a(ftg.a(dsz.e, ebw.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(ftm.a($$0, "_top_stage_" + $$1));
            case b -> b(ftm.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dne $$0, dne $$1, dne $$2, dne $$3, dne $$4, dne $$5, dne $$6, dne $$7) {
      this.a($$0, fsw.d.b);
      this.a($$1, fsw.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dne $$0, fsw.d $$1) {
      ftb $$2 = b(this.a($$0, "_top", $$1.a(), ftp::c));
      ftb $$3 = b(this.a($$0, "_bottom", $$1.a(), ftp::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dne $$0, fsw.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dne $$0) {
      alk $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fso());
      this.c($$0, fsw.d.a);
   }

   private void h() {
      this.a(dng.jf, "_front");
      ftb $$0 = b(ftm.a(dng.jf, "_top"));
      ftb $$1 = b(this.a(dng.jf, "_bottom", fsw.d.b.a(), ftp::c));
      this.e(dng.jf, $$0, $$1);
   }

   private void i() {
      ftb $$0 = b(this.a(dng.bH, "_top", fto.bv, ftp::a));
      ftb $$1 = b(this.a(dng.bH, "_bottom", fto.bv, ftp::a));
      this.e(dng.bH, $$0, $$1);
   }

   private void j() {
      ftb $$0 = b(ftm.a(dng.tp, "_top"));
      ftb $$1 = b(ftm.a(dng.tp, "_bottom"));
      this.i.accept(ftf.a(dng.tp).a(ftg.a(ebw.ah).a(ecc.b, $$1).a(ecc.a, $$0)).a(r));
   }

   private void e(dne $$0, ftb $$1, ftb $$2) {
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.ah).a(ecc.b, $$2).a(ecc.a, $$1)));
   }

   private void p(dne $$0) {
      ftp $$1 = ftp.h($$0);
      ftp $$2 = ftp.e(ftp.a($$0, "_corner"));
      ftb $$3 = b(fto.au.a($$0, $$1, this.k));
      ftb $$4 = b(fto.av.a($$0, $$2, this.k));
      ftb $$5 = b(fto.aw.a($$0, $$1, this.k));
      ftb $$6 = b(fto.ax.a($$0, $$1, this.k));
      this.c($$0);
      this.i
         .accept(
            ftf.a($$0)
               .a(
                  ftg.a(ebw.aj)
                     .a(eck.a, $$3)
                     .a(eck.b, $$3.a(f))
                     .a(eck.c, $$5.a(f))
                     .a(eck.d, $$6.a(f))
                     .a(eck.e, $$5)
                     .a(eck.f, $$6)
                     .a(eck.g, $$4)
                     .a(eck.h, $$4.a(f))
                     .a(eck.i, $$4.a(g))
                     .a(eck.j, $$4.a(h))
               )
         );
   }

   private void q(dne $$0) {
      ftb $$1 = b(this.a($$0, "", fto.au, ftp::e));
      ftb $$2 = b(this.a($$0, "", fto.aw, ftp::e));
      ftb $$3 = b(this.a($$0, "", fto.ax, ftp::e));
      ftb $$4 = b(this.a($$0, "_on", fto.au, ftp::e));
      ftb $$5 = b(this.a($$0, "_on", fto.aw, ftp::e));
      ftb $$6 = b(this.a($$0, "_on", fto.ax, ftp::e));
      this.c($$0);
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.A, ebw.ak).a(($$6x, $$7) -> {
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

   private void a(dne $$0, czw $$1) {
      ftb $$2 = b(fto.aa.a($$0, ftp.a($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private void b(dne $$0, alk $$1) {
      ftb $$2 = b(fto.aa.a($$0, ftp.h($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private ftb g(dne $$0, dne $$1) {
      return b(fto.aa.a($$0, ftp.x($$1), this.k));
   }

   public void a(dne $$0, dne $$1) {
      this.i.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dne $$0) {
      this.a($$0, $$0);
   }

   private void h(dne $$0, dne $$1) {
      this.a($$0);
      ftb $$2 = b(ftr.j.get($$0).a($$1, this.k));
      this.i.accept(a($$1, $$2));
   }

   private void s(dne $$0) {
      ftb $$1 = b(ftr.p.create($$0, this.k));
      ftb $$2 = b(ftr.q.create($$0, this.k));
      ftb $$3 = b(ftr.r.create($$0, this.k));
      ftb $$4 = b(ftr.s.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, ebw.V, $$1, $$2, $$3, $$4);
   }

   private void t(dne $$0) {
      ftb $$1 = b(ftr.l.create($$0, this.k));
      ftb $$2 = b(ftr.m.create($$0, this.k));
      ftb $$3 = b(ftr.n.create($$0, this.k));
      ftb $$4 = b(ftr.o.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, ebw.U, $$1, $$2, $$3, $$4);
   }

   private void a(dne $$0, ecg $$1, ftb $$2, ftb $$3, ftb $$4, ftb $$5) {
      this.i
         .accept(
            fte.a($$0)
               .a(b().a(ebw.T, jc.c), $$2)
               .a(b().a(ebw.T, jc.f), $$2.a(f))
               .a(b().a(ebw.T, jc.d), $$2.a(g))
               .a(b().a(ebw.T, jc.e), $$2.a(h))
               .a(b().a($$1, 2, 3, 4).a(ebw.T, jc.c), $$3)
               .a(b().a($$1, 2, 3, 4).a(ebw.T, jc.f), $$3.a(f))
               .a(b().a($$1, 2, 3, 4).a(ebw.T, jc.d), $$3.a(g))
               .a(b().a($$1, 2, 3, 4).a(ebw.T, jc.e), $$3.a(h))
               .a(b().a($$1, 3, 4).a(ebw.T, jc.c), $$4)
               .a(b().a($$1, 3, 4).a(ebw.T, jc.f), $$4.a(f))
               .a(b().a($$1, 3, 4).a(ebw.T, jc.d), $$4.a(g))
               .a(b().a($$1, 3, 4).a(ebw.T, jc.e), $$4.a(h))
               .a(b().a($$1, 4).a(ebw.T, jc.c), $$5)
               .a(b().a($$1, 4).a(ebw.T, jc.f), $$5.a(f))
               .a(b().a($$1, 4).a(ebw.T, jc.d), $$5.a(g))
               .a(b().a($$1, 4).a(ebw.T, jc.e), $$5.a(h))
         );
   }

   private void a(ftr.a $$0, dne... $$1) {
      for (dne $$2 : $$1) {
         gty $$3 = a($$0.create($$2, this.k));
         this.i.accept(ftf.a($$2, b($$3)));
      }
   }

   private void b(ftr.a $$0, dne... $$1) {
      for (dne $$2 : $$1) {
         ftb $$3 = b($$0.create($$2, this.k));
         this.i.accept(ftf.a($$2, $$3).a(q));
      }
   }

   private void i(dne $$0, dne $$1) {
      this.a($$0);
      ftp $$2 = ftp.b($$0, $$1);
      ftb $$3 = b(fto.aP.a($$1, $$2, this.k));
      ftb $$4 = b(fto.aQ.a($$1, $$2, this.k));
      ftb $$5 = b(fto.aR.a($$1, $$2, this.k));
      ftb $$6 = b(fto.aN.a($$1, $$2, this.k));
      ftb $$7 = b(fto.aO.a($$1, $$2, this.k));
      czw $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.i
         .accept(
            fte.a($$1)
               .a($$3)
               .a(b().a(ebw.N, true), $$4)
               .a(b().a(ebw.O, true), $$4.a(f))
               .a(b().a(ebw.P, true), $$5)
               .a(b().a(ebw.Q, true), $$5.a(f))
               .a(b().a(ebw.N, false), $$6)
               .a(b().a(ebw.O, false), $$7)
               .a(b().a(ebw.P, false), $$7.a(f))
               .a(b().a(ebw.Q, false), $$6.a(h))
         );
   }

   private void u(dne $$0) {
      ftp $$1 = ftp.C($$0);
      ftb $$2 = b(fto.aS.a($$0, $$1, this.k));
      ftb $$3 = b(this.a($$0, "_conditional", fto.aS, $$1x -> $$1.c(ftq.i, $$1x)));
      this.i.accept(ftf.a($$0).a(a(ebw.f, $$3, $$2)).a(n));
   }

   private void v(dne $$0) {
      ftb $$1 = b(ftr.v.create($$0, this.k));
      this.i.accept(a($$0, $$1).a(q));
   }

   private static ftb a(int $$0) {
      String $$1 = "_age" + $$0;
      return new ftb(btd.a(IntStream.range(1, 5).mapToObj($$1x -> new btc<>(a(ftm.a(dng.nF, $$1x + $$1)), 1)).collect(Collectors.toList())));
   }

   private void k() {
      this.i
         .accept(
            fte.a(dng.nF)
               .a(b().a(ebw.at, 0), a(0))
               .a(b().a(ebw.at, 1), a(1))
               .a(b().a(ebw.bn, ebs.b), b(ftm.a(dng.nF, "_small_leaves")))
               .a(b().a(ebw.bn, ebs.c), b(ftm.a(dng.nF, "_large_leaves")))
         );
   }

   private void l() {
      alk $$0 = ftp.a(dng.oA, "_top_open");
      ftb $$1 = b(ftr.f.create(dng.oA, this.k));
      ftb $$2 = b(ftr.f.get(dng.oA).a($$1x -> $$1x.a(ftq.f, $$0)).a(dng.oA, "_open", this.k));
      this.i.accept(ftf.a(dng.oA).a(ftg.a(ebw.y).a(false, $$1).a(true, $$2)).a(o));
   }

   private static <T extends Comparable<T>> ftg<ftb> a(ecj<T> $$0, T $$1, ftb $$2, ftb $$3) {
      return ftg.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dne $$0, Function<dne, ftp> $$1) {
      ftp $$2 = $$1.apply($$0).b(ftq.i, ftq.c);
      ftp $$3 = $$2.c(ftq.g, ftp.a($$0, "_front_honey"));
      alk $$4 = fto.q.a($$0, "_empty", $$2, this.k);
      alk $$5 = fto.q.a($$0, "_honey", $$3, this.k);
      this.j.a($$0.h(), ftk.a(dmy.c, ftk.a($$4), Map.of(5, ftk.a($$5))));
      this.i.accept(ftf.a($$0).a(a(dmy.c, 5, b($$5), b($$4))).a(r));
   }

   private void a(dne $$0, ecj<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alk> $$3 = new Int2ObjectOpenHashMap();
         this.i.accept(ftf.a($$0).a(ftg.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((alk)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, fto.bc, ftp::g)));
         })));
      }
   }

   private void m() {
      ftb $$0 = b(ftm.a(dng.oJ, "_floor"));
      ftb $$1 = b(ftm.a(dng.oJ, "_ceiling"));
      ftb $$2 = b(ftm.a(dng.oJ, "_wall"));
      ftb $$3 = b(ftm.a(dng.oJ, "_between_walls"));
      this.b(dae.xD);
      this.i
         .accept(
            ftf.a(dng.oJ)
               .a(
                  ftg.a(ebw.T, ebw.Y)
                     .a(jc.c, ebu.a, $$0)
                     .a(jc.d, ebu.a, $$0.a(g))
                     .a(jc.f, ebu.a, $$0.a(f))
                     .a(jc.e, ebu.a, $$0.a(h))
                     .a(jc.c, ebu.b, $$1)
                     .a(jc.d, ebu.b, $$1.a(g))
                     .a(jc.f, ebu.b, $$1.a(f))
                     .a(jc.e, ebu.b, $$1.a(h))
                     .a(jc.c, ebu.c, $$2.a(h))
                     .a(jc.d, ebu.c, $$2.a(f))
                     .a(jc.f, ebu.c, $$2)
                     .a(jc.e, ebu.c, $$2.a(g))
                     .a(jc.d, ebu.d, $$3.a(f))
                     .a(jc.c, ebu.d, $$3.a(h))
                     .a(jc.f, ebu.d, $$3)
                     .a(jc.e, ebu.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.i
         .accept(
            ftf.a(dng.oF, b(ftm.a(dng.oF)))
               .a(
                  ftg.b(ebw.X, ebw.T)
                     .a(ebr.a, jc.c, a)
                     .a(ebr.a, jc.f, f)
                     .a(ebr.a, jc.d, g)
                     .a(ebr.a, jc.e, h)
                     .a(ebr.b, jc.c, c)
                     .a(ebr.b, jc.f, c.then(f))
                     .a(ebr.b, jc.d, c.then(g))
                     .a(ebr.b, jc.e, c.then(h))
                     .a(ebr.c, jc.d, d)
                     .a(ebr.c, jc.e, d.then(f))
                     .a(ebr.c, jc.c, d.then(g))
                     .a(ebr.c, jc.f, d.then(h))
               )
         );
   }

   private void d(dne $$0, ftr.a $$1) {
      ftb $$2 = b($$1.create($$0, this.k));
      alk $$3 = ftp.a($$0, "_front_on");
      ftb $$4 = b($$1.get($$0).a($$1x -> $$1x.a(ftq.g, $$3)).a($$0, "_on", this.k));
      this.i.accept(ftf.a($$0).a(a(ebw.u, $$4, $$2)).a(r));
   }

   private void a(dne... $$0) {
      ftb $$1 = b(ftm.a("campfire_off"));

      for (dne $$2 : $$0) {
         ftb $$3 = b(fto.bj.a($$2, ftp.H($$2), this.k));
         this.b($$2.h());
         this.i.accept(ftf.a($$2).a(a(ebw.u, $$3, $$1)).a(q));
      }
   }

   private void w(dne $$0) {
      ftb $$1 = b(fto.bE.a($$0, ftp.o($$0), this.k));
      this.i.accept(a($$0, $$1));
   }

   private void x(dne $$0) {
      ftb $$1;
      if ($$0 == dng.tT) {
         $$1 = b(fto.bG.a($$0, ftp.p($$0), this.k));
      } else {
         $$1 = b(fto.bF.a($$0, ftp.p($$0), this.k));
      }

      this.i.accept(a($$0, $$1));
   }

   private void o() {
      ftp $$0 = ftp.a(ftp.J(dng.cv), ftp.J(dng.n));
      ftb $$1 = b(fto.j.a(dng.cv, $$0, this.k));
      this.i.accept(a(dng.cv, $$1));
   }

   private void p() {
      this.b(dae.ml);
      this.i
         .accept(
            fte.a(dng.cH)
               .a(
                  a(
                     b().a(ebw.ae, ecl.c).a(ebw.ad, ecl.c).a(ebw.af, ecl.c).a(ebw.ag, ecl.c),
                     b().a(ebw.ae, ecl.b, ecl.a).a(ebw.ad, ecl.b, ecl.a),
                     b().a(ebw.ad, ecl.b, ecl.a).a(ebw.af, ecl.b, ecl.a),
                     b().a(ebw.af, ecl.b, ecl.a).a(ebw.ag, ecl.b, ecl.a),
                     b().a(ebw.ag, ecl.b, ecl.a).a(ebw.ae, ecl.b, ecl.a)
                  ),
                  b(ftm.a("redstone_dust_dot"))
               )
               .a(b().a(ebw.ae, ecl.b, ecl.a), b(ftm.a("redstone_dust_side0")))
               .a(b().a(ebw.af, ecl.b, ecl.a), b(ftm.a("redstone_dust_side_alt0")))
               .a(b().a(ebw.ad, ecl.b, ecl.a), b(ftm.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(ebw.ag, ecl.b, ecl.a), b(ftm.a("redstone_dust_side1")).a(h))
               .a(b().a(ebw.ae, ecl.a), b(ftm.a("redstone_dust_up")))
               .a(b().a(ebw.ad, ecl.a), b(ftm.a("redstone_dust_up")).a(f))
               .a(b().a(ebw.af, ecl.a), b(ftm.a("redstone_dust_up")).a(g))
               .a(b().a(ebw.ag, ecl.a), b(ftm.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(dae.mp);
      this.i
         .accept(
            ftf.a(dng.hz)
               .a(
                  ftg.a(ebw.bg, ebw.A)
                     .a(ebz.a, false, b(ftm.a(dng.hz)))
                     .a(ebz.a, true, b(ftm.a(dng.hz, "_on")))
                     .a(ebz.b, false, b(ftm.a(dng.hz, "_subtract")))
                     .a(ebz.b, true, b(ftm.a(dng.hz, "_on_subtract")))
               )
               .a(q)
         );
   }

   private void r() {
      ftp $$0 = ftp.a(dng.ku);
      ftp $$1 = ftp.a(ftp.a(dng.kh, "_side"), $$0.a(ftq.f));
      ftb $$2 = b(fto.ab.a(dng.kh, $$1, this.k));
      ftb $$3 = b(fto.ac.a(dng.kh, $$1, this.k));
      ftb $$4 = b(fto.j.b(dng.kh, "_double", $$1, this.k));
      this.i.accept(e(dng.kh, $$2, $$3, $$4));
      this.i.accept(a(dng.ku, b(fto.c.a(dng.ku, $$0, this.k))));
   }

   private void s() {
      this.b(dae.ty);
      this.i
         .accept(
            fte.a(dng.fR)
               .a(b(ftp.J(dng.fR)))
               .a(b().a(ebw.n, true), b(ftp.a(dng.fR, "_bottle0")))
               .a(b().a(ebw.o, true), b(ftp.a(dng.fR, "_bottle1")))
               .a(b().a(ebw.p, true), b(ftp.a(dng.fR, "_bottle2")))
               .a(b().a(ebw.n, false), b(ftp.a(dng.fR, "_empty0")))
               .a(b().a(ebw.o, false), b(ftp.a(dng.fR, "_empty1")))
               .a(b().a(ebw.p, false), b(ftp.a(dng.fR, "_empty2")))
         );
   }

   private void y(dne $$0) {
      ftb $$1 = b(fto.bA.a($$0, ftp.b($$0), this.k));
      ftb $$2 = b(ftm.a("mushroom_block_inside"));
      this.i
         .accept(
            fte.a($$0)
               .a(b().a(ebw.N, true), $$1)
               .a(b().a(ebw.O, true), $$1.a(f).a(b))
               .a(b().a(ebw.P, true), $$1.a(g).a(b))
               .a(b().a(ebw.Q, true), $$1.a(h).a(b))
               .a(b().a(ebw.L, true), $$1.a(e).a(b))
               .a(b().a(ebw.M, true), $$1.a(c).a(b))
               .a(b().a(ebw.N, false), $$2)
               .a(b().a(ebw.O, false), $$2.a(f))
               .a(b().a(ebw.P, false), $$2.a(g))
               .a(b().a(ebw.Q, false), $$2.a(h))
               .a(b().a(ebw.L, false), $$2.a(e))
               .a(b().a(ebw.M, false), $$2.a(c))
         );
      this.a($$0, ftr.a.createWithSuffix($$0, "_inventory", this.k));
   }

   private void t() {
      this.b(dae.sJ);
      this.i
         .accept(
            ftf.a(dng.ex)
               .a(
                  ftg.a(ebw.aB)
                     .a(0, b(ftm.a(dng.ex)))
                     .a(1, b(ftm.a(dng.ex, "_slice1")))
                     .a(2, b(ftm.a(dng.ex, "_slice2")))
                     .a(3, b(ftm.a(dng.ex, "_slice3")))
                     .a(4, b(ftm.a(dng.ex, "_slice4")))
                     .a(5, b(ftm.a(dng.ex, "_slice5")))
                     .a(6, b(ftm.a(dng.ex, "_slice6")))
               )
         );
   }

   private void u() {
      ftp $$0 = new ftp()
         .a(ftq.c, ftp.a(dng.oD, "_side3"))
         .a(ftq.o, ftp.J(dng.t))
         .a(ftq.n, ftp.a(dng.oD, "_top"))
         .a(ftq.j, ftp.a(dng.oD, "_side3"))
         .a(ftq.l, ftp.a(dng.oD, "_side3"))
         .a(ftq.k, ftp.a(dng.oD, "_side1"))
         .a(ftq.m, ftp.a(dng.oD, "_side2"));
      this.i.accept(a(dng.oD, b(fto.a.a(dng.oD, $$0, this.k))));
   }

   private void v() {
      ftp $$0 = new ftp()
         .a(ftq.c, ftp.a(dng.oH, "_front"))
         .a(ftq.o, ftp.a(dng.oH, "_bottom"))
         .a(ftq.n, ftp.a(dng.oH, "_top"))
         .a(ftq.j, ftp.a(dng.oH, "_front"))
         .a(ftq.k, ftp.a(dng.oH, "_front"))
         .a(ftq.l, ftp.a(dng.oH, "_side"))
         .a(ftq.m, ftp.a(dng.oH, "_side"));
      this.i.accept(a(dng.oH, b(fto.a.a(dng.oH, $$0, this.k))));
   }

   private void a(dne $$0, dne $$1, BiFunction<dne, dne, ftp> $$2) {
      ftp $$3 = $$2.apply($$0, $$1);
      this.i.accept(a($$0, b(fto.a.a($$0, $$3, this.k))));
   }

   public void b(dne $$0) {
      ftp $$1 = new ftp()
         .a(ftq.c, ftp.a($$0, "_particle"))
         .a(ftq.o, ftp.a($$0, "_down"))
         .a(ftq.n, ftp.a($$0, "_up"))
         .a(ftq.j, ftp.a($$0, "_north"))
         .a(ftq.k, ftp.a($$0, "_south"))
         .a(ftq.l, ftp.a($$0, "_east"))
         .a(ftq.m, ftp.a($$0, "_west"));
      this.i.accept(a($$0, b(fto.a.a($$0, $$1, this.k))));
   }

   private void w() {
      ftp $$0 = ftp.n(dng.fr);
      this.i.accept(a(dng.fr, b(ftm.a(dng.fr))));
      this.a(dng.ev, $$0);
      this.a(dng.ew, $$0);
   }

   private void a(dne $$0, ftp $$1) {
      ftb $$2 = b(fto.p.a($$0, $$1.c(ftq.g, ftp.J($$0)), this.k));
      this.i.accept(ftf.a($$0, $$2).a(r));
   }

   private void x() {
      this.b(dae.tz);
      this.n(dng.fS);
      this.i.accept(a(dng.fU, b(fto.bD.a(dng.fU, ftp.j(ftp.a(dng.K, "_still")), this.k))));
      this.i
         .accept(
            ftf.a(dng.fT)
               .a(
                  ftg.a(drs.f)
                     .a(1, b(fto.bB.a(dng.fT, "_level1", ftp.j(ftp.a(dng.J, "_still")), this.k)))
                     .a(2, b(fto.bC.a(dng.fT, "_level2", ftp.j(ftp.a(dng.J, "_still")), this.k)))
                     .a(3, b(fto.bD.a(dng.fT, "_full", ftp.j(ftp.a(dng.J, "_still")), this.k)))
               )
         );
      this.i
         .accept(
            ftf.a(dng.fV)
               .a(
                  ftg.a(drs.f)
                     .a(1, b(fto.bB.a(dng.fV, "_level1", ftp.j(ftp.J(dng.rx)), this.k)))
                     .a(2, b(fto.bC.a(dng.fV, "_level2", ftp.j(ftp.J(dng.rx)), this.k)))
                     .a(3, b(fto.bD.a(dng.fV, "_full", ftp.j(ftp.J(dng.rx)), this.k)))
               )
         );
   }

   private void y() {
      ftp $$0 = ftp.b(dng.lb);
      ftb $$1 = b(fto.aL.a(dng.lb, $$0, this.k));
      ftb $$2 = b(this.a(dng.lb, "_dead", fto.aL, $$1x -> $$0.c(ftq.b, $$1x)));
      this.i.accept(ftf.a(dng.lb).a(a(ebw.ax, 5, $$2, $$1)));
   }

   private void z() {
      ftb $$0 = b(ftm.a(dng.ua));
      ftb $$1 = b(ftm.a(dng.ua, "_triggered"));
      ftb $$2 = b(ftm.a(dng.ua, "_crafting"));
      ftb $$3 = b(ftm.a(dng.ua, "_crafting_triggered"));
      this.i
         .accept(ftf.a(dng.ua).a(ftg.a(ebw.G, doy.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(ftg.b(ebw.W).a(fsw::a)));
   }

   private void z(dne $$0) {
      ftp $$1 = new ftp().a(ftq.f, ftp.a(dng.cO, "_top")).a(ftq.i, ftp.a(dng.cO, "_side")).a(ftq.g, ftp.a($$0, "_front"));
      ftp $$2 = new ftp().a(ftq.i, ftp.a(dng.cO, "_top")).a(ftq.g, ftp.a($$0, "_front_vertical"));
      ftb $$3 = b(fto.p.a($$0, $$1, this.k));
      ftb $$4 = b(fto.r.a($$0, $$2, this.k));
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.R).a(jc.a, $$4.a(d)).a(jc.b, $$4).a(jc.c, $$3).a(jc.f, $$3.a(f)).a(jc.d, $$3.a(g)).a(jc.e, $$3.a(h))));
   }

   private void A() {
      ftb $$0 = b(ftm.a(dng.fX));
      ftb $$1 = b(ftm.a(dng.fX, "_filled"));
      this.i.accept(ftf.a(dng.fX).a(ftg.a(ebw.k).a(false, $$0).a(true, $$1)).a(q));
   }

   private void B() {
      ftb $$0 = b(ftm.a(dng.la, "_side"));
      gty $$1 = a(ftm.a(dng.la, "_noside"));
      gty $$2 = a(ftm.a(dng.la, "_noside1"));
      gty $$3 = a(ftm.a(dng.la, "_noside2"));
      gty $$4 = a(ftm.a(dng.la, "_noside3"));
      gty $$5 = $$1.a(b);
      gty $$6 = $$2.a(b);
      gty $$7 = $$3.a(b);
      gty $$8 = $$4.a(b);
      this.i
         .accept(
            fte.a(dng.la)
               .a(b().a(ebw.N, true), $$0)
               .a(b().a(ebw.O, true), $$0.a(f).a(b))
               .a(b().a(ebw.P, true), $$0.a(g).a(b))
               .a(b().a(ebw.Q, true), $$0.a(h).a(b))
               .a(b().a(ebw.L, true), $$0.a(e).a(b))
               .a(b().a(ebw.M, true), $$0.a(c).a(b))
               .a(b().a(ebw.N, false), new ftb(btd.a(new btc<>($$1, 2), new btc<>($$2, 1), new btc<>($$3, 1), new btc<>($$4, 1))))
               .a(b().a(ebw.O, false), new ftb(btd.a(new btc<>($$6.a(f), 1), new btc<>($$7.a(f), 1), new btc<>($$8.a(f), 1), new btc<>($$5.a(f), 2))))
               .a(b().a(ebw.P, false), new ftb(btd.a(new btc<>($$7.a(g), 1), new btc<>($$8.a(g), 1), new btc<>($$5.a(g), 2), new btc<>($$6.a(g), 1))))
               .a(b().a(ebw.Q, false), new ftb(btd.a(new btc<>($$8.a(h), 1), new btc<>($$5.a(h), 2), new btc<>($$6.a(h), 1), new btc<>($$7.a(h), 1))))
               .a(b().a(ebw.L, false), new ftb(btd.a(new btc<>($$5.a(e), 2), new btc<>($$8.a(e), 1), new btc<>($$6.a(e), 1), new btc<>($$7.a(e), 1))))
               .a(b().a(ebw.M, false), new ftb(btd.a(new btc<>($$8.a(c), 1), new btc<>($$7.a(c), 1), new btc<>($$6.a(c), 1), new btc<>($$5.a(c), 2))))
         );
   }

   private void C() {
      this.i
         .accept(
            fte.a(dng.pK)
               .a(b(ftp.J(dng.pK)))
               .a(b().a(ebw.aO, 1), b(ftp.a(dng.pK, "_contents1")))
               .a(b().a(ebw.aO, 2), b(ftp.a(dng.pK, "_contents2")))
               .a(b().a(ebw.aO, 3), b(ftp.a(dng.pK, "_contents3")))
               .a(b().a(ebw.aO, 4), b(ftp.a(dng.pK, "_contents4")))
               .a(b().a(ebw.aO, 5), b(ftp.a(dng.pK, "_contents5")))
               .a(b().a(ebw.aO, 6), b(ftp.a(dng.pK, "_contents6")))
               .a(b().a(ebw.aO, 7), b(ftp.a(dng.pK, "_contents7")))
               .a(b().a(ebw.aO, 8), b(ftp.a(dng.pK, "_contents_ready")))
         );
   }

   private void A(dne $$0) {
      ftb $$1 = b(fto.c.a($$0, ftp.a($$0), this.k));
      ftb $$2 = b(this.a($$0, "_powered", fto.c, ftp::b));
      ftb $$3 = b(this.a($$0, "_lit", fto.c, ftp::b));
      ftb $$4 = b(this.a($$0, "_lit_powered", fto.c, ftp::b));
      this.i.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static ftc a(dne $$0, ftb $$1, ftb $$2, ftb $$3, ftb $$4) {
      return ftf.a($$0).a(ftg.a(ebw.u, ebw.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dne $$0, dne $$1) {
      ftb $$2 = b(ftm.a($$0));
      ftb $$3 = b(ftm.a($$0, "_powered"));
      ftb $$4 = b(ftm.a($$0, "_lit"));
      ftb $$5 = b(ftm.a($$0, "_lit_powered"));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dne $$0) {
      ftb $$1 = b(fto.ao.a($$0, ftp.c($$0), this.k));
      this.i.accept(ftf.a($$0, $$1).a(o));
   }

   private void D() {
      this.B(dng.rg);
      this.B(dng.rf);
      this.B(dng.re);
      this.B(dng.rd);
   }

   private void E() {
      ftg.b<ftb, jc, ecd> $$0 = ftg.a(ebw.bp, ebw.bq);

      for (ecd $$1 : ecd.values()) {
         $$0.a(jc.b, $$1, this.a(jc.b, $$1));
      }

      for (ecd $$2 : ecd.values()) {
         $$0.a(jc.a, $$2, this.a(jc.a, $$2));
      }

      this.i.accept(ftf.a(dng.tb).a($$0));
   }

   private ftb a(jc $$0, ecd $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ftp $$3 = ftp.c(ftp.a(dng.tb, $$2));
      return b(fto.an.a(dng.tb, $$2, $$3, this.k));
   }

   private void C(dne $$0) {
      ftp $$1 = new ftp().a(ftq.e, ftp.J(dng.em)).a(ftq.f, ftp.J($$0)).a(ftq.i, ftp.a($$0, "_side"));
      this.i.accept(a($$0, b(fto.n.a($$0, $$1, this.k))));
   }

   private void F() {
      alk $$0 = ftp.a(dng.hA, "_side");
      ftp $$1 = new ftp().a(ftq.f, ftp.a(dng.hA, "_top")).a(ftq.i, $$0);
      ftp $$2 = new ftp().a(ftq.f, ftp.a(dng.hA, "_inverted_top")).a(ftq.i, $$0);
      this.i.accept(ftf.a(dng.hA).a(ftg.a(ebw.s).a(false, b(fto.aM.a(dng.hA, $$1, this.k))).a(true, b(fto.aM.a(ftm.a(dng.hA, "_inverted"), $$2, this.k)))));
   }

   private void D(dne $$0) {
      this.i.accept(ftf.a($$0, b(ftm.a($$0))).a(o));
   }

   private void G() {
      dne $$0 = dng.ta;
      ftb $$1 = b(ftm.a($$0, "_on"));
      ftb $$2 = b(ftm.a($$0));
      this.i.accept(ftf.a($$0).a(a(ebw.A, $$1, $$2)).a(o));
   }

   private void H() {
      ftp $$0 = new ftp().a(ftq.C, ftp.J(dng.j)).a(ftq.f, ftp.J(dng.cN));
      ftp $$1 = new ftp().a(ftq.C, ftp.J(dng.j)).a(ftq.f, ftp.a(dng.cN, "_moist"));
      ftb $$2 = b(fto.bd.a(dng.cN, $$0, this.k));
      ftb $$3 = b(fto.bd.a(ftp.a(dng.cN, "_moist"), $$1, this.k));
      this.i.accept(ftf.a(dng.cN).a(a(ebw.aT, 7, $$3, $$2)));
   }

   private ftb E(dne $$0) {
      return a(a(fto.be.a(ftm.a($$0, "_floor0"), ftp.y($$0), this.k)), a(fto.be.a(ftm.a($$0, "_floor1"), ftp.z($$0), this.k)));
   }

   private ftb F(dne $$0) {
      return a(
         a(fto.bf.a(ftm.a($$0, "_side0"), ftp.y($$0), this.k)),
         a(fto.bf.a(ftm.a($$0, "_side1"), ftp.z($$0), this.k)),
         a(fto.bg.a(ftm.a($$0, "_side_alt0"), ftp.y($$0), this.k)),
         a(fto.bg.a(ftm.a($$0, "_side_alt1"), ftp.z($$0), this.k))
      );
   }

   private ftb G(dne $$0) {
      return a(
         a(fto.bh.a(ftm.a($$0, "_up0"), ftp.y($$0), this.k)),
         a(fto.bh.a(ftm.a($$0, "_up1"), ftp.z($$0), this.k)),
         a(fto.bi.a(ftm.a($$0, "_up_alt0"), ftp.y($$0), this.k)),
         a(fto.bi.a(ftm.a($$0, "_up_alt1"), ftp.z($$0), this.k))
      );
   }

   private void I() {
      ftd $$0 = b().a(ebw.N, false).a(ebw.O, false).a(ebw.P, false).a(ebw.Q, false).a(ebw.L, false);
      ftb $$1 = this.E(dng.cB);
      ftb $$2 = this.F(dng.cB);
      ftb $$3 = this.G(dng.cB);
      this.i
         .accept(
            fte.a(dng.cB)
               .a($$0, $$1)
               .a(a(b().a(ebw.N, true), $$0), $$2)
               .a(a(b().a(ebw.O, true), $$0), $$2.a(f))
               .a(a(b().a(ebw.P, true), $$0), $$2.a(g))
               .a(a(b().a(ebw.Q, true), $$0), $$2.a(h))
               .a(b().a(ebw.L, true), $$3)
         );
   }

   private void J() {
      ftb $$0 = this.E(dng.cC);
      ftb $$1 = this.F(dng.cC);
      this.i.accept(fte.a(dng.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dne $$0) {
      ftb $$1 = b(ftr.x.create($$0, this.k));
      ftb $$2 = b(ftr.y.create($$0, this.k));
      this.b($$0.h());
      this.i.accept(ftf.a($$0).a(a(ebw.m, $$2, $$1)));
   }

   private void K() {
      ftp $$0 = ftp.a(ftp.a(dng.ah, "_side"), ftp.a(dng.ah, "_top"));
      ftb $$1 = b(fto.j.a(dng.ah, $$0, this.k));
      this.i.accept(b(dng.ah, $$1));
   }

   private void L() {
      this.b(dae.af);
      dne $$0 = dng.H;
      ftb $$1 = b(ftm.a($$0));
      this.i.accept(ftf.a(dng.H).a(ftg.a(dsf.d, dsf.b).a(($$2, $$3) -> $$2 ? b(ftm.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.i
         .accept(
            ftf.a(dng.lo)
               .a(
                  ftg.a(ebw.av)
                     .a(0, b(this.a(dng.lo, "_0", fto.c, ftp::b)))
                     .a(1, b(this.a(dng.lo, "_1", fto.c, ftp::b)))
                     .a(2, b(this.a(dng.lo, "_2", fto.c, ftp::b)))
                     .a(3, b(this.a(dng.lo, "_3", fto.c, ftp::b)))
               )
         );
   }

   private void N() {
      alk $$0 = ftp.J(dng.j);
      ftp $$1 = new ftp().a(ftq.e, $$0).b(ftq.e, ftq.c).a(ftq.f, ftp.a(dng.i, "_top")).a(ftq.i, ftp.a(dng.i, "_snow"));
      ftb $$2 = b(fto.n.a(dng.i, "_snow", $$1, this.k));
      alk $$3 = ftm.a(dng.i);
      this.f(dng.i, b(a($$3)), $$2);
      this.a(dng.i, $$3, new fso());
      ftb $$4 = b(a(ftr.f.get(dng.fE).a($$1x -> $$1x.a(ftq.e, $$0)).a(dng.fE, this.k)));
      this.f(dng.fE, $$4, $$2);
      ftb $$5 = b(a(ftr.f.get(dng.l).a($$1x -> $$1x.a(ftq.e, $$0)).a(dng.l, this.k)));
      this.f(dng.l, $$5, $$2);
   }

   private void f(dne $$0, ftb $$1, ftb $$2) {
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(dae.sp);
      this.i.accept(ftf.a(dng.gb).a(ftg.a(ebw.au).a(0, b(ftm.a(dng.gb, "_stage0"))).a(1, b(ftm.a(dng.gb, "_stage1"))).a(2, b(ftm.a(dng.gb, "_stage2")))).a(q));
   }

   private void P() {
      gty $$0 = a(ftm.a(dng.lk));
      this.i.accept(ftf.a(dng.lk, b($$0)));
   }

   private void k(dne $$0, dne $$1) {
      ftp $$2 = ftp.b($$1);
      ftb $$3 = b(fto.Y.a($$0, $$2, this.k));
      ftb $$4 = b(fto.Z.a($$0, $$2, this.k));
      this.i.accept(ftf.a($$0).a(a(ebw.aW, 1, $$4, $$3)));
   }

   private void Q() {
      ftb $$0 = b(ftm.a(dng.hD));
      ftb $$1 = b(ftm.a(dng.hD, "_side"));
      this.b(dae.mv);
      this.i.accept(ftf.a(dng.hD).a(ftg.a(ebw.S).a(jc.a, $$0).a(jc.c, $$1).a(jc.f, $$1.a(f)).a(jc.d, $$1.a(g)).a(jc.e, $$1.a(h))));
   }

   private void l(dne $$0, dne $$1) {
      ftb $$2 = b(ftm.a($$0));
      this.i.accept(ftf.a($$1, $$2));
      this.j.a($$0.h(), $$1.h());
   }

   private void R() {
      ftb $$0 = b(ftm.a(dng.fo, "_post_ends"));
      ftb $$1 = b(ftm.a(dng.fo, "_post"));
      ftb $$2 = b(ftm.a(dng.fo, "_cap"));
      ftb $$3 = b(ftm.a(dng.fo, "_cap_alt"));
      ftb $$4 = b(ftm.a(dng.fo, "_side"));
      ftb $$5 = b(ftm.a(dng.fo, "_side_alt"));
      this.i
         .accept(
            fte.a(dng.fo)
               .a($$0)
               .a(b().a(ebw.N, false).a(ebw.O, false).a(ebw.P, false).a(ebw.Q, false), $$1)
               .a(b().a(ebw.N, true).a(ebw.O, false).a(ebw.P, false).a(ebw.Q, false), $$2)
               .a(b().a(ebw.N, false).a(ebw.O, true).a(ebw.P, false).a(ebw.Q, false), $$2.a(f))
               .a(b().a(ebw.N, false).a(ebw.O, false).a(ebw.P, true).a(ebw.Q, false), $$3)
               .a(b().a(ebw.N, false).a(ebw.O, false).a(ebw.P, false).a(ebw.Q, true), $$3.a(f))
               .a(b().a(ebw.N, true), $$4)
               .a(b().a(ebw.O, true), $$4.a(f))
               .a(b().a(ebw.P, true), $$5)
               .a(b().a(ebw.Q, true), $$5.a(f))
         );
      this.c(dng.fo);
   }

   private void I(dne $$0) {
      this.i.accept(ftf.a($$0, b(ftm.a($$0))).a(r));
   }

   private void S() {
      ftb $$0 = b(ftm.a(dng.dL));
      ftb $$1 = b(ftm.a(dng.dL, "_on"));
      this.c(dng.dL);
      this.i
         .accept(
            ftf.a(dng.dL)
               .a(a(ebw.A, $$0, $$1))
               .a(
                  ftg.b(ebw.X, ebw.T)
                     .a(ebr.c, jc.c, d.then(g))
                     .a(ebr.c, jc.f, d.then(h))
                     .a(ebr.c, jc.d, d)
                     .a(ebr.c, jc.e, d.then(f))
                     .a(ebr.a, jc.c, a)
                     .a(ebr.a, jc.f, f)
                     .a(ebr.a, jc.d, g)
                     .a(ebr.a, jc.e, h)
                     .a(ebr.b, jc.c, c)
                     .a(ebr.b, jc.f, c.then(f))
                     .a(ebr.b, jc.d, c.then(g))
                     .a(ebr.b, jc.e, c.then(h))
               )
         );
   }

   private void T() {
      alk $$0 = this.a(dae.gE, dng.fF);
      this.a(dng.fF, $$0, ftk.a(-9321636));
      gty $$1 = a(ftm.a(dng.fF));
      this.i.accept(ftf.a(dng.fF, b($$1)));
   }

   private void U() {
      this.c(dng.tX);
      this.i.accept(a(dng.tX, b(ftm.a(dng.tX))));
   }

   private void V() {
      this.i.accept(ftf.a(dng.eu).a(ftg.a(ebw.J).a(jc.a.a, b(ftm.a(dng.eu, "_ns"))).a(jc.a.c, b(ftm.a(dng.eu, "_ew")))));
   }

   private void W() {
      gty $$0 = a(ftr.a.create(dng.em, this.k));
      this.i
         .accept(
            ftf.a(
               dng.em,
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
      ftb $$0 = b(ftm.a(dng.lu));
      ftb $$1 = b(ftm.a(dng.lu, "_on"));
      this.i.accept(ftf.a(dng.lu).a(a(ebw.A, $$1, $$0)).a(n));
   }

   private void Y() {
      ftp $$0 = new ftp().a(ftq.e, ftp.a(dng.bI, "_bottom")).a(ftq.i, ftp.a(dng.bI, "_side"));
      alk $$1 = ftp.a(dng.bI, "_top_sticky");
      alk $$2 = ftp.a(dng.bI, "_top");
      ftp $$3 = $$0.c(ftq.F, $$1);
      ftp $$4 = $$0.c(ftq.F, $$2);
      ftb $$5 = b(ftm.a(dng.bI, "_base"));
      this.a(dng.bI, $$5, $$4);
      this.a(dng.by, $$5, $$3);
      alk $$6 = fto.n.a(dng.bI, "_inventory", $$0.c(ftq.f, $$2), this.k);
      alk $$7 = fto.n.a(dng.by, "_inventory", $$0.c(ftq.f, $$1), this.k);
      this.a(dng.bI, $$6);
      this.a(dng.by, $$7);
   }

   private void a(dne $$0, ftb $$1, ftp $$2) {
      ftb $$3 = b(fto.bs.a($$0, $$2, this.k));
      this.i.accept(ftf.a($$0).a(a(ebw.j, $$1, $$3)).a(n));
   }

   private void Z() {
      ftp $$0 = new ftp().a(ftq.G, ftp.a(dng.bI, "_top")).a(ftq.i, ftp.a(dng.bI, "_side"));
      ftp $$1 = $$0.c(ftq.F, ftp.a(dng.bI, "_top_sticky"));
      ftp $$2 = $$0.c(ftq.F, ftp.a(dng.bI, "_top"));
      this.i
         .accept(
            ftf.a(dng.bJ)
               .a(
                  ftg.a(ebw.B, ebw.bj)
                     .a(false, eci.a, b(fto.bt.a(dng.bI, "_head", $$2, this.k)))
                     .a(false, eci.b, b(fto.bt.a(dng.bI, "_head_sticky", $$1, this.k)))
                     .a(true, eci.a, b(fto.bu.a(dng.bI, "_head_short", $$2, this.k)))
                     .a(true, eci.b, b(fto.bu.a(dng.bI, "_head_short_sticky", $$1, this.k)))
               )
               .a(n)
         );
   }

   private void aa() {
      dne $$0 = dng.ub;
      ftp $$1 = ftp.a($$0, "_side_inactive", "_top_inactive");
      ftp $$2 = ftp.a($$0, "_side_active", "_top_active");
      ftp $$3 = ftp.a($$0, "_side_active", "_top_ejecting_reward");
      ftp $$4 = ftp.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      ftp $$5 = ftp.a($$0, "_side_active_ominous", "_top_active_ominous");
      ftp $$6 = ftp.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alk $$7 = fto.o.a($$0, $$1, this.k);
      ftb $$8 = b($$7);
      ftb $$9 = b(fto.o.a($$0, "_active", $$2, this.k));
      ftb $$10 = b(fto.o.a($$0, "_ejecting_reward", $$3, this.k));
      ftb $$11 = b(fto.o.a($$0, "_inactive_ominous", $$4, this.k));
      ftb $$12 = b(fto.o.a($$0, "_active_ominous", $$5, this.k));
      ftb $$13 = b(fto.o.a($$0, "_ejecting_reward_ominous", $$6, this.k));
      this.a($$0, $$7);
      this.i.accept(ftf.a($$0).a(ftg.a(ebw.bB, ebw.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dne $$0 = dng.uc;
      ftp $$1 = ftp.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      ftp $$2 = ftp.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      ftp $$3 = ftp.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      ftp $$4 = ftp.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alk $$5 = fto.cb.a($$0, $$1, this.k);
      ftb $$6 = b($$5);
      ftb $$7 = b(fto.cb.a($$0, "_active", $$2, this.k));
      ftb $$8 = b(fto.cb.a($$0, "_unlocking", $$3, this.k));
      ftb $$9 = b(fto.cb.a($$0, "_ejecting_reward", $$4, this.k));
      ftp $$10 = ftp.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      ftp $$11 = ftp.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ftp $$12 = ftp.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ftp $$13 = ftp.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      ftb $$14 = b(fto.cb.a($$0, "_ominous", $$10, this.k));
      ftb $$15 = b(fto.cb.a($$0, "_active_ominous", $$11, this.k));
      ftb $$16 = b(fto.cb.a($$0, "_unlocking_ominous", $$12, this.k));
      ftb $$17 = b(fto.cb.a($$0, "_ejecting_reward_ominous", $$13, this.k));
      this.a($$0, $$5);
      this.i.accept(ftf.a($$0).a(ftg.a(dwp.b, dwp.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(r));
   }

   private void ac() {
      alk $$0 = ftm.a(dng.ry, "_inactive");
      ftb $$1 = b($$0);
      ftb $$2 = b(ftm.a(dng.ry, "_active"));
      this.a(dng.ry, $$0);
      this.i.accept(ftf.a(dng.ry).a(ftg.a(ebw.br).a($$2x -> $$2x != ecn.b && $$2x != ecn.c ? $$1 : $$2)));
   }

   private void ad() {
      alk $$0 = ftm.a(dng.rz, "_inactive");
      ftb $$1 = b($$0);
      ftb $$2 = b(ftm.a(dng.rz, "_active"));
      this.a(dng.rz, $$0);
      this.i.accept(ftf.a(dng.rz).a(ftg.a(ebw.br).a($$2x -> $$2x != ecn.b && $$2x != ecn.c ? $$1 : $$2)).a(r));
   }

   private void ae() {
      alk $$0 = fto.ca.a(dng.rD, ftp.a(false), this.k);
      ftb $$1 = b($$0);
      ftb $$2 = b(fto.ca.a(dng.rD, "_can_summon", ftp.a(true), this.k));
      this.a(dng.rD, $$0);
      this.i.accept(ftf.a(dng.rD).a(a(ebw.e, $$2, $$1)));
   }

   private void af() {
      alk $$0 = ftm.a(dng.oy, "_stable");
      ftb $$1 = b($$0);
      ftb $$2 = b(ftm.a(dng.oy, "_unstable"));
      this.a(dng.oy, $$0);
      this.i.accept(ftf.a(dng.oy).a(a(ebw.d, $$2, $$1)));
   }

   private void ag() {
      ftb $$0 = b(this.a(dng.td, "", fto.ao, ftp::c));
      ftb $$1 = b(this.a(dng.td, "_lit", fto.ao, ftp::c));
      this.i.accept(ftf.a(dng.td).a(a(ebw.b, $$1, $$0)));
      ftb $$2 = b(this.a(dng.te, "", fto.ao, ftp::c));
      ftb $$3 = b(this.a(dng.te, "_lit", fto.ao, ftp::c));
      this.i.accept(ftf.a(dng.te).a(a(ebw.b, $$3, $$2)));
   }

   private void ah() {
      ftb $$0 = b(ftr.a.create(dng.ga, this.k));
      ftb $$1 = b(this.a(dng.ga, "_on", fto.c, ftp::b));
      this.i.accept(ftf.a(dng.ga).a(a(ebw.u, $$1, $$0)));
   }

   private void m(dne $$0, dne $$1) {
      ftp $$2 = ftp.B($$0);
      this.i.accept(a($$0, b(fto.bm.a($$0, $$2, this.k))));
      this.i.accept(ftf.a($$1, b(fto.bo.a($$1, $$2, this.k))).a(p));
      this.c($$0);
   }

   private void ai() {
      ftp $$0 = ftp.B(dng.ea);
      ftp $$1 = ftp.i(ftp.a(dng.ea, "_off"));
      ftb $$2 = b(fto.bq.a(dng.ea, $$0, this.k));
      ftb $$3 = b(fto.bn.a(dng.ea, "_off", $$1, this.k));
      this.i.accept(ftf.a(dng.ea).a(a(ebw.u, $$2, $$3)));
      ftb $$4 = b(fto.br.a(dng.eb, $$0, this.k));
      ftb $$5 = b(fto.bp.a(dng.eb, "_off", $$1, this.k));
      this.i.accept(ftf.a(dng.eb).a(a(ebw.u, $$4, $$5)).a(p));
      this.c(dng.ea);
   }

   private void aj() {
      this.b(dae.mo);
      this.i.accept(ftf.a(dng.ey).a(ftg.a(ebw.aD, ebw.v, ebw.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(ftp.a(dng.ey, $$3.toString()));
      })).a(q));
   }

   private void ak() {
      this.b(dae.de);
      this.i
         .accept(
            ftf.a(dng.nB)
               .a(
                  ftg.a(ebw.aV, ebw.I)
                     .a(1, false, b(a(ftm.a("dead_sea_pickle"))))
                     .a(2, false, b(a(ftm.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(ftm.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(ftm.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(ftm.a("sea_pickle"))))
                     .a(2, true, b(a(ftm.a("two_sea_pickles"))))
                     .a(3, true, b(a(ftm.a("three_sea_pickles"))))
                     .a(4, true, b(a(ftm.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      ftp $$0 = ftp.a(dng.ed);
      ftb $$1 = b(fto.c.a(dng.ef, $$0, this.k));
      this.i.accept(ftf.a(dng.ed).a(ftg.a(ebw.aI).a($$1x -> $$1x < 8 ? b(ftm.a(dng.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dng.ed, ftm.a(dng.ed, "_height2"));
      this.i.accept(a(dng.ef, $$1));
   }

   private void am() {
      this.i.accept(ftf.a(dng.oI, b(ftm.a(dng.oI))).a(r));
   }

   private void an() {
      alk $$0 = ftr.a.create(dng.pG, this.k);
      this.a(dng.pG, $$0);
      this.i.accept(ftf.a(dng.pG).a(ftg.a(ebw.bm).a($$0x -> b(this.a(dng.pG, "_" + $$0x.c(), fto.c, ftp::b)))));
   }

   private void ao() {
      Map<ecr, alk> $$0 = new HashMap<>();

      for (ecr $$1 : ecr.values()) {
         $$0.put($$1, this.a(dng.pI, "_" + $$1.c(), fto.c, ftp::b));
      }

      this.i.accept(ftf.a(dng.pI).a(ftg.a(ebw.bF).a($$1x -> b($$0.get($$1x)))));
      this.j.a(dae.pa, ftk.a(dvy.b, ftk.a($$0.get(ecr.a)), Map.of(ecr.c, ftk.a($$0.get(ecr.c)), ecr.b, ftk.a($$0.get(ecr.b)), ecr.d, ftk.a($$0.get(ecr.d)))));
   }

   private void ap() {
      this.b(dae.xG);
      this.i.accept(ftf.a(dng.oO).a(ftg.a(ebw.av).a($$0 -> b(this.a(dng.oO, "_stage" + $$0, fto.ao, ftp::c)))));
   }

   private void aq() {
      this.b(dae.qg);
      this.i
         .accept(
            ftf.a(dng.gh)
               .a(
                  ftg.a(ebw.a, ebw.O, ebw.N, ebw.P, ebw.Q)
                     .a(false, false, false, false, false, b(ftm.a(dng.gh, "_ns")))
                     .a(false, true, false, false, false, b(ftm.a(dng.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(ftm.a(dng.gh, "_n")))
                     .a(false, false, false, true, false, b(ftm.a(dng.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(ftm.a(dng.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(ftm.a(dng.gh, "_ne")))
                     .a(false, true, false, true, false, b(ftm.a(dng.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(ftm.a(dng.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(ftm.a(dng.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(ftm.a(dng.gh, "_ns")))
                     .a(false, true, false, false, true, b(ftm.a(dng.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(ftm.a(dng.gh, "_nse")))
                     .a(false, true, false, true, true, b(ftm.a(dng.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(ftm.a(dng.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(ftm.a(dng.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(ftm.a(dng.gh, "_nsew")))
                     .a(true, false, false, false, false, b(ftm.a(dng.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(ftm.a(dng.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(ftm.a(dng.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(ftm.a(dng.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(ftm.a(dng.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(ftm.a(dng.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(ftm.a(dng.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(ftm.a(dng.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(ftm.a(dng.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(ftm.a(dng.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(ftm.a(dng.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(ftm.a(dng.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(ftm.a(dng.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(ftm.a(dng.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(ftm.a(dng.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(ftm.a(dng.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dng.gg);
      this.i.accept(ftf.a(dng.gg).a(ftg.a(ebw.a, ebw.A).a(($$0, $$1) -> b(ftm.a(dng.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(r));
   }

   private gty a(int $$0, String $$1, ftp $$2) {
      return switch ($$0) {
         case 1 -> a(fto.bw.a(ftm.a($$1 + "turtle_egg"), $$2, this.k));
         case 2 -> a(fto.bx.a(ftm.a("two_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 3 -> a(fto.by.a(ftm.a("three_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 4 -> a(fto.bz.a(ftm.a("four_" + $$1 + "turtle_eggs"), $$2, this.k));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gty a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", ftp.b(ftp.J(dng.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", ftp.b(ftp.a(dng.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", ftp.b(ftp.a(dng.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(dae.kT);
      this.i.accept(ftf.a(dng.mL).a(ftg.a(ebw.aG, ebw.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      this.b(dae.kU);
      this.i.accept(ftf.a(dng.mM).a(ftg.a(duw.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ftp $$2 = ftp.a($$1);
         return b(fto.bH.a(dng.mM, $$1, $$2, this.k));
      })));
   }

   private void J(dne $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dne $$0, czw $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends ecj<?>> Map<T, gtz> a(ebi<?, ?> $$0, Function<jc, T> $$1) {
      Builder<T, gtz> $$2 = ImmutableMap.builderWithExpectedSize(u.size());
      u.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dne $$0) {
      Map<ecj<Boolean>, gtz> $$1 = a($$0.m(), dsk::b);
      ftd $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      ftb $$3 = b(ftm.a($$0));
      fte $$4 = fte.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.i.accept($$4);
   }

   private void L(dne $$0) {
      Map<ecj<ect>, gtz> $$1 = a($$0.m(), dsi::a);
      ftd $$2 = b().a(dsi.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, ect.a));
      ftb $$3 = b(ftr.j.create($$0, this.k));
      ftb $$4 = b(ftr.k.get($$0).a($$1x -> $$1x.a(ftq.i, ftp.a($$0, "_side_tall"))).a($$0, "_side_tall", this.k));
      ftb $$5 = b(ftr.k.get($$0).a($$1x -> $$1x.a(ftq.i, ftp.a($$0, "_side_small"))).a($$0, "_side_small", this.k));
      fte $$6 = fte.a($$0);
      $$6.a(b().a(dsi.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, ect.c), $$4.a($$5x));
         $$6.a(b().a($$4x, ect.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.i.accept($$6);
   }

   private void M(dne $$0) {
      this.c($$0);
      this.i.accept(ftf.a($$0).a(ftg.a(dqz.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         ftp $$3 = ftp.c(ftp.a($$0, $$2));
         return b(fsw.d.b.a().a($$0, $$2, $$3, this.k));
      })));
   }

   private void au() {
      alk $$0 = ftp.a(dng.rC, "_bottom");
      ftp $$1 = new ftp().a(ftq.e, $$0).a(ftq.f, ftp.a(dng.rC, "_top")).a(ftq.i, ftp.a(dng.rC, "_side"));
      ftp $$2 = new ftp().a(ftq.e, $$0).a(ftq.f, ftp.a(dng.rC, "_top_bloom")).a(ftq.i, ftp.a(dng.rC, "_side_bloom"));
      alk $$3 = fto.n.a(dng.rC, $$1, this.k);
      ftb $$4 = b($$3);
      ftb $$5 = b(fto.n.a(dng.rC, "_bloom", $$2, this.k));
      this.i.accept(ftf.a(dng.rC).a(ftg.a(ebw.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dng.rC, $$3);
   }

   private void av() {
      dne $$0 = dng.cw;
      ftb $$1 = b(ftm.a($$0));
      fte $$2 = fte.a($$0);
      List.of(Pair.of(jc.c, a), Pair.of(jc.f, f), Pair.of(jc.d, g), Pair.of(jc.e, h)).forEach($$2x -> {
         jc $$3 = (jc)$$2x.getFirst();
         gtz $$4 = (gtz)$$2x.getSecond();
         guc $$5 = b().a(ebw.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.i.accept($$2);
      this.a($$0, ftm.a($$0, "_inventory"));
      v.clear();
   }

   private void a(fte $$0, guc $$1, gtz $$2) {
      List.of(
            Pair.of(ebw.bs, fto.aT),
            Pair.of(ebw.bt, fto.aU),
            Pair.of(ebw.bu, fto.aV),
            Pair.of(ebw.bv, fto.aW),
            Pair.of(ebw.bw, fto.aX),
            Pair.of(ebw.bx, fto.aY)
         )
         .forEach($$3 -> {
            ebx $$4 = (ebx)$$3.getFirst();
            ftn $$5 = (ftn)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fte $$0, guc $$1, gtz $$2, ebx $$3, ftn $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ftp $$7 = new ftp().a(ftq.b, ftp.a(dng.cw, $$6));
      fsw.c $$8 = new fsw.c($$4, $$6);
      ftb $$9 = b(v.computeIfAbsent($$8, $$3x -> $$4.a(dng.cw, $$6, $$7, this.k)));
      $$0.a(new gub(gub.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void aw() {
      ftb $$0 = b(fto.c.a(dng.lp, ftp.b(ftm.a("magma")), this.k));
      this.i.accept(a(dng.lp, $$0));
   }

   private void a(dne $$0, @Nullable cyy $$1) {
      this.r($$0);
      czw $$2 = $$0.h();
      alk $$3 = fto.bO.a($$2, ftp.x($$0), this.k);
      hhr.b $$4 = $$1 != null ? ftk.a($$3, new hke.a($$1)) : ftk.a($$3, new hke.a());
      this.j.a($$2, $$4);
   }

   private void c(dne $$0, dne $$1, fsw.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ax() {
      alk $$0 = ftm.a(dng.b);
      gty $$1 = a($$0);
      gty $$2 = a(ftm.a(dng.b, "_mirrored"));
      this.i.accept(ftf.a(dng.ff, a($$1, $$2)));
      this.a(dng.ff, $$0);
   }

   private void ay() {
      alk $$0 = ftm.a(dng.tt);
      gty $$1 = a($$0);
      gty $$2 = a(ftm.a(dng.tt, "_mirrored"));
      this.i.accept(ftf.a(dng.tN, a($$1, $$2)).a(c()));
      this.a(dng.tN, $$0);
   }

   private void n(dne $$0, dne $$1) {
      this.a($$0, fsw.d.b);
      ftp $$2 = ftp.d(ftp.a($$0, "_pot"));
      ftb $$3 = b(fsw.d.b.b().a($$1, $$2, this.k));
      this.i.accept(a($$1, $$3));
   }

   private void az() {
      alk $$0 = ftp.a(dng.pT, "_bottom");
      alk $$1 = ftp.a(dng.pT, "_top_off");
      alk $$2 = ftp.a(dng.pT, "_top");
      alk[] $$3 = new alk[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ftp $$5 = new ftp().a(ftq.e, $$0).a(ftq.f, $$4 == 0 ? $$1 : $$2).a(ftq.i, ftp.a(dng.pT, "_side" + $$4));
         $$3[$$4] = fto.n.a(dng.pT, "_" + $$4, $$5, this.k);
      }

      this.i.accept(ftf.a(dng.pT).a(ftg.a(ebw.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dng.pT, $$3[0]);
   }

   private static gtz a(je $$0) {
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
      alk $$0 = ftp.a(dng.pH, "_top");
      alk $$1 = ftp.a(dng.pH, "_bottom");
      alk $$2 = ftp.a(dng.pH, "_side");
      alk $$3 = ftp.a(dng.pH, "_lock");
      ftp $$4 = new ftp().a(ftq.o, $$2).a(ftq.m, $$2).a(ftq.l, $$2).a(ftq.c, $$0).a(ftq.j, $$0).a(ftq.k, $$1).a(ftq.n, $$3);
      this.i.accept(ftf.a(dng.pH, b(fto.b.a(dng.pH, $$4, this.k))).a(ftg.b(ebw.W).a(fsw::a)));
   }

   private void aB() {
      dne $$0 = dng.n;
      ftb $$1 = b(ftm.a($$0));
      ftp $$2 = ftp.a($$0);
      dne $$3 = dng.kk;
      ftb $$4 = b(fto.ab.a($$3, $$2, this.k));
      ftb $$5 = b(fto.ac.a($$3, $$2, this.k));
      this.i.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dne $$0, dne $$1, duq.a $$2, alk $$3) {
      ftb $$4 = b(ftm.a("skull"));
      this.i.accept(a($$0, $$4));
      this.i.accept(a($$1, $$4));
      this.j.a($$0.h(), ftk.a($$3, new hkf.a($$2)));
   }

   private void aC() {
      alk $$0 = ftm.b("template_skull");
      this.a(dng.hn, dng.ho, duq.b.g, $$0);
      this.a(dng.hl, dng.hm, duq.b.e, $$0);
      this.a(dng.hj, dng.hk, duq.b.f, $$0);
      this.a(dng.hf, dng.hg, duq.b.c, $$0);
      this.a(dng.hh, dng.hi, duq.b.d, $$0);
      this.a(dng.hr, dng.hs, duq.b.h, $$0);
      this.a(dng.hp, dng.hq, duq.b.i, ftm.a(dae.vA));
   }

   private void a(dne $$0, dne $$1, cyy $$2) {
      ftb $$3 = b(ftm.a("banner"));
      alk $$4 = ftm.b("template_banner");
      this.i.accept(a($$0, $$3));
      this.i.accept(a($$1, $$3));
      czw $$5 = $$0.h();
      this.j.a($$5, ftk.a($$4, new hjw.a($$2)));
   }

   private void aD() {
      this.a(dng.jl, dng.jB, cyy.a);
      this.a(dng.jm, dng.jC, cyy.b);
      this.a(dng.jn, dng.jD, cyy.c);
      this.a(dng.jo, dng.jE, cyy.d);
      this.a(dng.jp, dng.jF, cyy.e);
      this.a(dng.jq, dng.jG, cyy.f);
      this.a(dng.jr, dng.jH, cyy.g);
      this.a(dng.js, dng.jI, cyy.h);
      this.a(dng.jt, dng.jJ, cyy.i);
      this.a(dng.ju, dng.jK, cyy.j);
      this.a(dng.jv, dng.jL, cyy.k);
      this.a(dng.jw, dng.jM, cyy.l);
      this.a(dng.jx, dng.jN, cyy.m);
      this.a(dng.jy, dng.jO, cyy.n);
      this.a(dng.jz, dng.jP, cyy.o);
      this.a(dng.jA, dng.jQ, cyy.p);
   }

   private void a(dne $$0, dne $$1, alk $$2, boolean $$3) {
      this.a($$0, $$1);
      czw $$4 = $$0.h();
      alk $$5 = fto.bQ.a($$4, ftp.x($$1), this.k);
      hhr.b $$6 = ftk.a($$5, new hjy.a($$2));
      if ($$3) {
         hhr.b $$7 = ftk.a($$5, new hjy.a(hjy.a));
         this.j.a($$4, ftk.b($$7, $$6));
      } else {
         this.j.a($$4, $$6);
      }
   }

   private void aE() {
      this.a(dng.cG, dng.n, hjy.b, true);
      this.a(dng.hw, dng.n, hjy.c, true);
      this.a(dng.gf, dng.cy, hjy.d, false);
   }

   private void b(dne $$0, dne $$1, cyy $$2) {
      ftb $$3 = b(ftm.a("bed"));
      this.i.accept(a($$0, $$3));
      czw $$4 = $$0.h();
      alk $$5 = fto.bP.a(ftm.a($$4), ftp.x($$1), this.k);
      this.j.a($$4, ftk.a($$5, new hjx.a($$2)));
   }

   private void aF() {
      this.b(dng.bg, dng.bK, cyy.a);
      this.b(dng.bh, dng.bL, cyy.b);
      this.b(dng.bi, dng.bM, cyy.c);
      this.b(dng.bj, dng.bN, cyy.d);
      this.b(dng.bk, dng.bO, cyy.e);
      this.b(dng.bl, dng.bP, cyy.f);
      this.b(dng.bm, dng.bQ, cyy.g);
      this.b(dng.bn, dng.bR, cyy.h);
      this.b(dng.bo, dng.bS, cyy.i);
      this.b(dng.bp, dng.bT, cyy.j);
      this.b(dng.bq, dng.bU, cyy.k);
      this.b(dng.br, dng.bV, cyy.l);
      this.b(dng.bs, dng.bW, cyy.m);
      this.b(dng.bt, dng.bX, cyy.n);
      this.b(dng.bu, dng.bY, cyy.o);
      this.b(dng.bv, dng.bZ, cyy.p);
   }

   private void a(dne $$0, hkg.a $$1) {
      czw $$2 = $$0.h();
      alk $$3 = ftm.a($$2);
      this.j.a($$2, ftk.a($$3, $$1));
   }

   public void a() {
      mk.a().filter(ml::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dng.rN).a(mk.x).a(dng.rN, dng.sl).a(dng.rR, dng.rV).a(mk.z);
      this.i(dng.rM).a(mk.B).a(dng.rM, dng.sk).a(dng.rQ, dng.rU).a(mk.D);
      this.i(dng.rL).a(mk.F).a(dng.rL, dng.sj).a(dng.rP, dng.rT).a(mk.H);
      this.i(dng.rK).a(mk.J).a(dng.rK, dng.si).a(dng.rO, dng.rS).a(mk.L);
      this.A(dng.sS);
      this.A(dng.sT);
      this.A(dng.sU);
      this.A(dng.sV);
      this.j(dng.sS, dng.sW);
      this.j(dng.sT, dng.sX);
      this.j(dng.sU, dng.sY);
      this.j(dng.sV, dng.sZ);
      this.n(dng.a);
      this.d(dng.nI, dng.a);
      this.d(dng.nH, dng.a);
      this.n(dng.gn);
      this.n(dng.eg);
      this.d(dng.nJ, dng.J);
      this.n(dng.fZ);
      this.n(dng.mK);
      this.n(dng.fQ);
      this.n(dng.gq);
      this.b(dae.vo);
      this.n(dng.pO);
      this.n(dng.J);
      this.n(dng.K);
      this.n(dng.ix);
      this.b(dae.go);
      this.o(dng.qu, dng.qL);
      this.o(dng.qv, dng.qM);
      this.o(dng.qw, dng.qN);
      this.o(dng.qx, dng.qO);
      this.o(dng.qy, dng.qP);
      this.o(dng.qz, dng.qQ);
      this.o(dng.qA, dng.qR);
      this.o(dng.qB, dng.qS);
      this.o(dng.qC, dng.qT);
      this.o(dng.qD, dng.qU);
      this.o(dng.qE, dng.qV);
      this.o(dng.qF, dng.qW);
      this.o(dng.qG, dng.qX);
      this.o(dng.qH, dng.qY);
      this.o(dng.qI, dng.qZ);
      this.o(dng.qJ, dng.ra);
      this.o(dng.qt, dng.qK);
      this.n(dng.nG);
      this.n(dng.gS);
      this.n(dng.rx);
      this.n(dng.tf);
      this.w(dng.tg);
      this.w(dng.th);
      this.x(dng.tS);
      this.x(dng.tT);
      this.ag();
      this.h(dng.tm, dng.ti);
      this.L(dng.uf);
      this.M(dng.ug);
      this.a(dng.ue);
      this.t(dng.tj);
      this.t(dng.tk);
      this.s(dng.tl);
      this.b(dng.ul, fsw.d.c);
      this.b(dae.da);
      this.a(dng.iy, dae.if);
      this.b(dae.if);
      this.aG();
      this.a(dng.lt, dae.jF);
      this.b(dae.jF);
      this.b(dng.ca, ftp.a(dng.bI, "_side"));
      this.a(dng.U);
      this.a(dng.V);
      this.a(dng.jd);
      this.a(dng.cI);
      this.a(dng.cJ);
      this.a(dng.cK);
      this.a(dng.gd);
      this.a(dng.ge);
      this.a(dng.gi);
      this.a(dng.Q);
      this.a(dng.W);
      this.a(dng.R);
      this.a(dng.cr);
      this.a(dng.S);
      this.a(dng.T);
      this.a(dng.cs);
      this.b(dng.pR, ftr.d);
      this.a(dng.pQ);
      this.a(dng.aY);
      this.a(dng.aZ);
      this.a(dng.ba);
      this.a(dng.fG);
      this.a(dng.hC);
      this.a(dng.dY);
      this.a(dng.dZ);
      this.a(dng.hB);
      this.a(dng.qk);
      this.a(dng.nC);
      this.a(dng.ei);
      this.a(dng.k);
      this.a(dng.pS);
      this.a(dng.fY);
      this.a(dng.et);
      this.a(dng.O);
      this.a(dng.pP);
      this.a(dng.ee);
      this.b(dng.ek, ftr.g);
      this.b(dng.pY, ftr.d);
      this.b(dng.fs, ftr.d);
      this.n(dng.ag);
      this.n(dng.gA);
      this.a(dng.lq);
      this.a(dng.bf);
      this.a(dng.je);
      this.a(dng.cy);
      this.a(dng.qs);
      this.a(dng.iK);
      this.a(dng.pe);
      this.a(dng.en);
      this.a(dng.eo);
      this.b(dng.cD, ftr.b);
      this.g(dng.cE);
      this.a(dng.aV);
      this.b(dng.bG, ftr.z);
      this.b(dae.dd);
      this.b(dng.cu, ftr.f);
      this.b(dng.pL, ftr.d);
      this.a(dng.oV);
      this.a(dng.aW);
      this.a(dng.rb);
      this.a(dng.rc);
      this.a(dng.rv);
      this.a(dng.tc);
      this.a(dng.tP);
      this.a(dng.tQ);
      this.a(dng.tR);
      this.d(dng.rA);
      this.n(dng.ud);
      this.aB();
      this.a(dng.rI);
      this.a(dng.rJ);
      this.a(dng.rE);
      this.a(dng.rF);
      this.a(dng.rG);
      this.a(dng.rH);
      this.l(dng.rE, dng.se);
      this.l(dng.rF, dng.sg);
      this.l(dng.rG, dng.sf);
      this.l(dng.rH, dng.sh);
      this.j(dng.su);
      this.j(dng.sv);
      this.j(dng.sx);
      this.j(dng.sw);
      this.b(dng.su, dng.sy);
      this.b(dng.sv, dng.sz);
      this.b(dng.sx, dng.sB);
      this.b(dng.sw, dng.sA);
      this.l(dng.sC);
      this.l(dng.sD);
      this.l(dng.sF);
      this.l(dng.sE);
      this.c(dng.sC, dng.sG);
      this.c(dng.sD, dng.sH);
      this.c(dng.sF, dng.sJ);
      this.c(dng.sE, dng.sI);
      this.a(dng.sK);
      this.a(dng.sL);
      this.a(dng.sM);
      this.a(dng.sN);
      this.l(dng.sK, dng.sO);
      this.l(dng.sL, dng.sP);
      this.l(dng.sM, dng.sQ);
      this.l(dng.sN, dng.sR);
      this.k(dng.hx, dng.cr);
      this.k(dng.hy, dng.cs);
      this.D();
      this.o();
      this.av();
      this.s();
      this.t();
      this.a(dng.oM, dng.oN);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dng.kZ);
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
      this.a(dng.pJ);
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.d();
      this.J(dng.fy);
      this.J(dng.rB);
      this.b(dng.fz, dae.gt);
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
      this.I(dng.da);
      this.c(dng.da);
      this.I(dng.oG);
      this.e();
      this.I(dng.to);
      this.m(dng.cz, dng.cA);
      this.m(dng.er, dng.es);
      this.a(dng.cL, dng.n, ftp::c);
      this.a(dng.oE, dng.p, ftp::d);
      this.C(dng.pc);
      this.C(dng.oT);
      this.z(dng.bb);
      this.z(dng.hJ);
      this.z();
      this.H(dng.oK);
      this.H(dng.oL);
      this.c(dng.fp, b(ftm.a(dng.fp)));
      this.a(dng.ep, ftr.d);
      this.a(dng.eq, ftr.d);
      this.a(dng.tO);
      this.a(dng.ls, ftr.d);
      this.e(dng.j);
      this.e(dng.tr);
      this.e(dng.L);
      this.f(dng.M);
      this.f(dng.P);
      this.e(dng.N);
      this.d(dng.I);
      this.b(dng.tY, ftr.f);
      this.a(dng.iL, ftr.d, ftr.e);
      this.a(dng.ld, ftr.A, ftr.B);
      this.a(dng.hG, ftr.A, ftr.B);
      this.a(dng.tU, ftr.d, ftr.e);
      this.a(dng.tV, ftr.d, ftr.e);
      this.a(dng.tW, ftr.d, ftr.e);
      this.c(dng.oz, ftr.i);
      this.w();
      this.a(dng.pM, ftp::D);
      this.a(dng.pN, ftp::F);
      this.a(dng.lj, ebw.av, 0, 1, 2, 3);
      this.a(dng.gT, ebw.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dng.fP, ebw.av, 0, 1, 1, 2);
      this.a(dng.gU, ebw.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dng.cM, ebw.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dng.lg, fsw.d.b, ebw.at, 0, 1);
      this.g();
      this.f();
      this.aD();
      this.aF();
      this.aC();
      this.aE();
      this.a(dng.lv, null);
      this.a(dng.lw, cyy.a);
      this.a(dng.lx, cyy.b);
      this.a(dng.ly, cyy.c);
      this.a(dng.lz, cyy.d);
      this.a(dng.lA, cyy.e);
      this.a(dng.lB, cyy.f);
      this.a(dng.lC, cyy.g);
      this.a(dng.lD, cyy.h);
      this.a(dng.lE, cyy.i);
      this.a(dng.lF, cyy.j);
      this.a(dng.lG, cyy.k);
      this.a(dng.lH, cyy.l);
      this.a(dng.lI, cyy.m);
      this.a(dng.lJ, cyy.n);
      this.a(dng.lK, cyy.o);
      this.a(dng.lL, cyy.p);
      this.r(dng.nD);
      this.a(dng.nD, new hjz.a());
      this.a(dng.tZ, dng.jc);
      this.a(dng.tZ, new hka.a());
      this.a(dng.fW, dng.cy);
      this.a(dng.ll, dng.cy);
      this.a(dng.aT);
      this.a(dng.aU);
      this.a(dng.mc);
      this.a(dng.md);
      this.a(dng.me);
      this.a(dng.mf);
      this.a(dng.mg);
      this.a(dng.mh);
      this.a(dng.mi);
      this.a(dng.mj);
      this.a(dng.mk);
      this.a(dng.ml);
      this.a(dng.mm);
      this.a(dng.mn);
      this.a(dng.mo);
      this.a(dng.mp);
      this.a(dng.mq);
      this.a(dng.mr);
      this.a(ftr.a, dng.ms, dng.mt, dng.mu, dng.mv, dng.mw, dng.mx, dng.my, dng.mz, dng.mA, dng.mB, dng.mC, dng.mD, dng.mE, dng.mF, dng.mG, dng.mH);
      this.a(dng.jc);
      this.a(dng.hK);
      this.a(dng.hL);
      this.a(dng.hM);
      this.a(dng.hN);
      this.a(dng.hO);
      this.a(dng.hP);
      this.a(dng.hQ);
      this.a(dng.hR);
      this.a(dng.hS);
      this.a(dng.hT);
      this.a(dng.hU);
      this.a(dng.hV);
      this.a(dng.hW);
      this.a(dng.hX);
      this.a(dng.hY);
      this.a(dng.hZ);
      this.a(dng.rw);
      this.i(dng.aX, dng.fq);
      this.i(dng.ez, dng.ia);
      this.i(dng.eA, dng.ib);
      this.i(dng.eB, dng.ic);
      this.i(dng.eC, dng.id);
      this.i(dng.eD, dng.ie);
      this.i(dng.eE, dng.if);
      this.i(dng.eF, dng.ig);
      this.i(dng.eG, dng.ih);
      this.i(dng.eH, dng.ii);
      this.i(dng.eI, dng.ij);
      this.i(dng.eJ, dng.ik);
      this.i(dng.eK, dng.il);
      this.i(dng.eL, dng.im);
      this.i(dng.eM, dng.in);
      this.i(dng.eN, dng.io);
      this.i(dng.eO, dng.ip);
      this.b(ftr.t, dng.lM, dng.lN, dng.lO, dng.lP, dng.lQ, dng.lR, dng.lS, dng.lT, dng.lU, dng.lV, dng.lW, dng.lX, dng.lY, dng.lZ, dng.ma, dng.mb);
      this.h(dng.bK, dng.iM);
      this.h(dng.bL, dng.iN);
      this.h(dng.bM, dng.iO);
      this.h(dng.bN, dng.iP);
      this.h(dng.bO, dng.iQ);
      this.h(dng.bP, dng.iR);
      this.h(dng.bQ, dng.iS);
      this.h(dng.bR, dng.iT);
      this.h(dng.bS, dng.iU);
      this.h(dng.bT, dng.iV);
      this.h(dng.bU, dng.iW);
      this.h(dng.bV, dng.iX);
      this.h(dng.bW, dng.iY);
      this.h(dng.bX, dng.iZ);
      this.h(dng.bY, dng.ja);
      this.h(dng.bZ, dng.jb);
      this.a(dng.ts);
      this.a(dng.fd);
      this.b(dng.bB, dng.gB, fsw.d.a);
      this.h(dng.bB);
      this.a(dng.cb, dng.gC, fsw.d.b);
      this.a(dng.cd, dng.gD, fsw.d.b);
      this.a(dng.uh, dng.uj, fsw.d.c);
      this.a(dng.ui, dng.uk, fsw.d.b);
      this.a(dng.ce, dng.gE, fsw.d.b);
      this.a(dng.cf, dng.gF, fsw.d.b);
      this.a(dng.cg, dng.gG, fsw.d.b);
      this.a(dng.ch, dng.gH, fsw.d.b);
      this.a(dng.ci, dng.gI, fsw.d.b);
      this.a(dng.cj, dng.gJ, fsw.d.b);
      this.a(dng.ck, dng.gK, fsw.d.b);
      this.a(dng.cl, dng.gL, fsw.d.b);
      this.a(dng.cm, dng.gM, fsw.d.b);
      this.a(dng.co, dng.gN, fsw.d.b);
      this.a(dng.cn, dng.gO, fsw.d.b);
      this.a(dng.cq, dng.gP, fsw.d.b);
      this.a(dng.cp, dng.gQ, fsw.d.b);
      this.a(dng.bC, dng.gR, fsw.d.b);
      this.a(dng.cc, dng.gr, fsw.d.b);
      this.E();
      this.y(dng.fl);
      this.y(dng.fm);
      this.y(dng.fn);
      this.b(dng.bA, fsw.d.a);
      this.h(dng.bA);
      this.a(dng.bE, fsw.d.b);
      this.a(dng.bF, fsw.d.b);
      this.b(dng.bD, fsw.d.a);
      this.h(dng.bD);
      this.b(dng.ej, fsw.d.a);
      this.b(dae.dW);
      this.c(dng.mI, dng.mJ, fsw.d.b);
      this.b(dae.dX);
      this.b(dng.tq, fsw.d.b);
      this.c(dng.pf, dng.pg, fsw.d.b);
      this.c(dng.ph, dng.pi, fsw.d.b);
      this.a(dng.pf, "_plant");
      this.a(dng.ph, "_plant");
      this.a(dng.nE, fsw.d.a, ftp.c(ftp.a(dng.nF, "_stage0")));
      this.k();
      this.a(dng.eh, fsw.d.b);
      this.a(dng.bz, fsw.d.b);
      this.d(dng.jg, fsw.d.b);
      this.d(dng.jh, fsw.d.b);
      this.d(dng.ji, fsw.d.b);
      this.o(dng.jj);
      this.o(dng.jk);
      this.h();
      this.i();
      this.j();
      this.a(dng.nc, dng.mX, dng.mS, dng.mN, dng.nm, dng.nh, dng.nw, dng.nr);
      this.a(dng.nd, dng.mY, dng.mT, dng.mO, dng.nn, dng.ni, dng.nx, dng.ns);
      this.a(dng.ne, dng.mZ, dng.mU, dng.mP, dng.no, dng.nj, dng.ny, dng.nt);
      this.a(dng.nf, dng.na, dng.mV, dng.mQ, dng.np, dng.nk, dng.nz, dng.nu);
      this.a(dng.ng, dng.nb, dng.mW, dng.mR, dng.nq, dng.nl, dng.nA, dng.nv);
      this.f(dng.fw, dng.fu);
      this.f(dng.fv, dng.ft);
      this.m(dng.af).c(dng.af).a(dng.aA);
      this.m(dng.ar).c(dng.ar).a(dng.aJ);
      this.a(dng.ar, dng.dx, dng.dH);
      this.a(dng.aS, ftr.w, -7158200);
      this.m(dng.ab).c(dng.ab).a(dng.ax);
      this.m(dng.am).c(dng.am).a(dng.aF);
      this.a(dng.am, dng.dq, dng.dC);
      this.a(dng.D, dng.gw, fsw.d.b);
      this.a(dng.aO, ftr.w, -12012264);
      this.m(dng.ac).d(dng.ac).a(dng.ay);
      this.m(dng.an).d(dng.an).a(dng.aG);
      this.a(dng.an, dng.dr, dng.dD);
      this.a(dng.E, dng.gx, fsw.d.b);
      this.b(dng.aP, ftr.w);
      this.m(dng.Z).c(dng.Z).a(dng.av);
      this.m(dng.ak).c(dng.ak).a(dng.aD);
      this.a(dng.ak, dng.dp, dng.dB);
      this.a(dng.B, dng.gu, fsw.d.b);
      this.a(dng.aM, ftr.w, -8345771);
      this.m(dng.X).c(dng.X).a(dng.at);
      this.m(dng.aq).c(dng.aq).a(dng.aB);
      this.a(dng.aq, dng.dn, dng.dz);
      this.a(dng.z, dng.gs, fsw.d.b);
      this.a(dng.aK, ftr.w, -12012264);
      this.m(dng.Y).c(dng.Y).a(dng.au);
      this.m(dng.aj).c(dng.aj).a(dng.aC);
      this.a(dng.aj, dng.do, dng.dA);
      this.a(dng.A, dng.gt, fsw.d.b);
      this.a(dng.aL, ftr.w, -10380959);
      this.m(dng.ad).c(dng.ad).a(dng.az);
      this.m(dng.ao).c(dng.ao).a(dng.aH);
      this.a(dng.ao, dng.dt, dng.dF);
      this.a(dng.F, dng.gy, fsw.d.b);
      this.a(dng.aQ, ftr.w, -12012264);
      this.m(dng.ae).c(dng.ae).a(dng.u);
      this.m(dng.ap).c(dng.ap).a(dng.aI);
      this.a(dng.ap, dng.du, dng.dG);
      this.a(dng.G, dng.gz, fsw.d.b);
      this.b(dng.aR, ftr.w);
      this.m(dng.aa).c(dng.aa).a(dng.aw);
      this.m(dng.al).c(dng.al).a(dng.aE);
      this.a(dng.al, dng.ds, dng.dE);
      this.a(dng.C, dng.gv, fsw.d.b);
      this.a(dng.aN, ftr.w, -12012264);
      this.m(dng.oY).b(dng.oY).a(dng.pa);
      this.m(dng.oZ).b(dng.oZ).a(dng.pb);
      this.a(dng.oZ, dng.dv, dng.dI);
      this.a(dng.pd, dng.pU, fsw.d.b);
      this.n(dng.pj, dng.pW);
      this.m(dng.oP).b(dng.oP).a(dng.oR);
      this.m(dng.oQ).b(dng.oQ).a(dng.oS);
      this.a(dng.oQ, dng.dw, dng.dJ);
      this.a(dng.oU, dng.pV, fsw.d.b);
      this.n(dng.oW, dng.pX);
      this.m(dng.ai).d(dng.ai);
      this.m(dng.as).d(dng.as);
      this.a(dng.x, dng.dy, dng.dK);
      this.b(dng.oX, fsw.d.b);
      this.b(dae.dT);
      this.j(dng.dN);
      this.l(dng.iA);
      this.r();
      this.p(dng.db);
      this.q(dng.bw);
      this.q(dng.bx);
      this.q(dng.hI);
      this.q();
      this.u(dng.gm);
      this.u(dng.lm);
      this.u(dng.ln);
      this.v(dng.ht);
      this.v(dng.hu);
      this.v(dng.hv);
      this.l();
      this.m();
      this.d(dng.cO, ftr.h);
      this.d(dng.oC, ftr.h);
      this.d(dng.oB, ftr.i);
      this.p();
      this.az();
      this.au();
      this.l(dng.fc, dng.fk);
      this.l(dng.m, dng.fg);
      this.l(dng.fb, dng.fj);
      this.l(dng.fa, dng.fi);
      this.ax();
      this.l(dng.eZ, dng.fh);
      this.ay();
   }

   private void aG() {
      hhr.b $$0 = ftk.a(this.a(dae.ig));
      Map<Integer, hhr.b> $$1 = new HashMap<>(16);
      ftg.a<ftb, Integer> $$2 = ftg.a(ebw.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alk $$5 = ftp.a(dae.ig, $$4);
         $$2.a($$3, b(fto.aa.a(dng.iz, $$4, ftp.h($$5), this.k)));
         hhr.b $$6 = ftk.a(fto.bI.a(ftm.a(dae.ig, $$4), ftp.k($$5), this.k));
         $$1.put($$3, $$6);
      }

      this.j.a(dae.ig, ftk.a(dry.c, $$0, $$1));
      this.i.accept(ftf.a(dng.iz).a($$2));
   }

   private void o(dne $$0, dne $$1) {
      this.b($$0.h());
      ftp $$2 = ftp.b(ftp.J($$0));
      ftp $$3 = ftp.b(ftp.a($$0, "_lit"));
      ftb $$4 = b(fto.bV.a($$0, "_one_candle", $$2, this.k));
      ftb $$5 = b(fto.bW.a($$0, "_two_candles", $$2, this.k));
      ftb $$6 = b(fto.bX.a($$0, "_three_candles", $$2, this.k));
      ftb $$7 = b(fto.bY.a($$0, "_four_candles", $$2, this.k));
      ftb $$8 = b(fto.bV.a($$0, "_one_candle_lit", $$3, this.k));
      ftb $$9 = b(fto.bW.a($$0, "_two_candles_lit", $$3, this.k));
      ftb $$10 = b(fto.bX.a($$0, "_three_candles_lit", $$3, this.k));
      ftb $$11 = b(fto.bY.a($$0, "_four_candles_lit", $$3, this.k));
      this.i
         .accept(
            ftf.a($$0)
               .a(
                  ftg.a(ebw.aC, ebw.u)
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
      ftb $$12 = b(fto.bZ.a($$1, ftp.a($$0, false), this.k));
      ftb $$13 = b(fto.bZ.a($$1, "_lit", ftp.a($$0, true), this.k));
      this.i.accept(ftf.a($$1).a(a(ebw.u, $$13, $$12)));
   }

   class a {
      private final ftp b;
      private final Map<ftn, alk> c = new HashMap<>();
      @Nullable
      private ml d;
      @Nullable
      private gty e;
      private final Set<dne> f = new HashSet<>();

      public a(final ftp $$0) {
         this.b = $$0;
      }

      public fsw.a a(dne $$0, ftn $$1) {
         this.e = fsw.a($$1.a($$0, this.b, fsw.this.k));
         if (fsw.m.containsKey($$0)) {
            fsw.this.i.accept(fsw.m.get($$0).create($$0, this.e, this.b, fsw.this.k));
         } else {
            fsw.this.i.accept(fsw.a($$0, fsw.a(this.e)));
         }

         return this;
      }

      public fsw.a a(dne $$0, dne $$1) {
         alk $$2 = ftm.a($$0);
         fsw.this.i.accept(fsw.a($$1, fsw.b($$2)));
         fsw.this.j.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fsw.a a(dne $$0) {
         ftb $$1 = fsw.b(fto.s.a($$0, this.b, fsw.this.k));
         ftb $$2 = fsw.b(fto.t.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$1, $$2));
         alk $$3 = fto.u.a($$0, this.b, fsw.this.k);
         fsw.this.a($$0, $$3);
         return this;
      }

      public fsw.a b(dne $$0) {
         ftb $$1 = fsw.b(fto.M.a($$0, this.b, fsw.this.k));
         ftb $$2 = fsw.b(fto.N.a($$0, this.b, fsw.this.k));
         ftb $$3 = fsw.b(fto.O.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$1, $$2, $$3));
         alk $$4 = fto.P.a($$0, this.b, fsw.this.k);
         fsw.this.a($$0, $$4);
         return this;
      }

      public fsw.a c(dne $$0) {
         ftp $$1 = ftp.s($$0);
         ftb $$2 = fsw.b(fto.D.a($$0, $$1, fsw.this.k));
         ftb $$3 = fsw.b(fto.E.a($$0, $$1, fsw.this.k));
         ftb $$4 = fsw.b(fto.F.a($$0, $$1, fsw.this.k));
         ftb $$5 = fsw.b(fto.G.a($$0, $$1, fsw.this.k));
         ftb $$6 = fsw.b(fto.H.a($$0, $$1, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$2, $$3, $$4, $$5, $$6));
         alk $$7 = fto.I.a($$0, $$1, fsw.this.k);
         fsw.this.a($$0, $$7);
         return this;
      }

      public fsw.a d(dne $$0) {
         ftb $$1 = fsw.b(fto.J.a($$0, this.b, fsw.this.k));
         ftb $$2 = fsw.b(fto.K.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.b($$0, $$1, $$2));
         alk $$3 = fto.L.a($$0, this.b, fsw.this.k);
         fsw.this.a($$0, $$3);
         return this;
      }

      public fsw.a e(dne $$0) {
         ftp $$1 = ftp.s($$0);
         ftb $$2 = fsw.b(fto.R.a($$0, $$1, fsw.this.k));
         ftb $$3 = fsw.b(fto.Q.a($$0, $$1, fsw.this.k));
         ftb $$4 = fsw.b(fto.T.a($$0, $$1, fsw.this.k));
         ftb $$5 = fsw.b(fto.S.a($$0, $$1, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fsw.a f(dne $$0) {
         ftb $$1 = fsw.b(fto.V.a($$0, this.b, fsw.this.k));
         ftb $$2 = fsw.b(fto.U.a($$0, this.b, fsw.this.k));
         ftb $$3 = fsw.b(fto.X.a($$0, this.b, fsw.this.k));
         ftb $$4 = fsw.b(fto.W.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fsw.a g(dne $$0) {
         ftb $$1 = fsw.b(fto.Y.a($$0, this.b, fsw.this.k));
         ftb $$2 = fsw.b(fto.Z.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.d($$0, $$1, $$2));
         return this;
      }

      public fsw.a h(dne $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dne $$1 = this.d.b().get(ml.b.r);
            ftb $$2 = fsw.b(fto.aa.a($$0, this.b, fsw.this.k));
            fsw.this.i.accept(fsw.a($$0, $$2));
            fsw.this.i.accept(fsw.a($$1, $$2));
            fsw.this.b($$0.h());
            return this;
         }
      }

      public fsw.a i(dne $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alk $$1 = this.a(fto.ab, $$0);
            ftb $$2 = fsw.b(this.a(fto.ac, $$0));
            fsw.this.i.accept(fsw.e($$0, fsw.b($$1), $$2, fsw.a(this.e)));
            fsw.this.a($$0, $$1);
            return this;
         }
      }

      public fsw.a j(dne $$0) {
         ftb $$1 = fsw.b(this.a(fto.af, $$0));
         alk $$2 = this.a(fto.ae, $$0);
         ftb $$3 = fsw.b(this.a(fto.ag, $$0));
         fsw.this.i.accept(fsw.b($$0, $$1, fsw.b($$2), $$3));
         fsw.this.a($$0, $$2);
         return this;
      }

      private fsw.a k(dne $$0) {
         ftr $$1 = fsw.s.getOrDefault($$0, ftr.a.get($$0));
         ftb $$2 = fsw.b($$1.a($$0, fsw.this.k));
         fsw.this.i.accept(fsw.a($$0, $$2));
         return this;
      }

      private fsw.a l(dne $$0) {
         fsw.this.j($$0);
         return this;
      }

      private void m(dne $$0) {
         if (fsw.l.contains($$0)) {
            fsw.this.l($$0);
         } else {
            fsw.this.k($$0);
         }
      }

      private alk a(ftn $$0, dne $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fsw.this.k));
      }

      public fsw.a a(ml $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fsw.a, dne> $$2 = fsw.t.get($$0x);
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
      ftc create(dne var1, gty var2, ftp var3, BiConsumer<alk, ftl> var4);
   }

   static record c(ftn a, String b) {
   }

   static enum d {
      a(fto.ap, fto.as, false),
      b(fto.ao, fto.ar, false),
      c(fto.aq, fto.at, true);

      private final ftn d;
      private final ftn e;
      private final boolean f;

      private d(final ftn $$0, final ftn $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public ftn a() {
         return this.d;
      }

      public ftn b() {
         return this.e;
      }

      public alk a(fsw $$0, dne $$1) {
         czw $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public ftp a(dne $$0) {
         return this.f ? ftp.e($$0) : ftp.c($$0);
      }

      public ftp b(dne $$0) {
         return this.f ? ftp.g($$0) : ftp.f($$0);
      }
   }

   class e {
      private final ftp b;

      public e(final ftp $$0) {
         this.b = $$0;
      }

      public fsw.e a(dne $$0) {
         ftp $$1 = this.b.c(ftq.d, this.b.a(ftq.i));
         alk $$2 = fto.j.a($$0, $$1, fsw.this.k);
         fsw.this.i.accept(fsw.b($$0, fsw.b($$2)));
         fsw.this.a($$0, $$2);
         return this;
      }

      public fsw.e b(dne $$0) {
         alk $$1 = fto.j.a($$0, this.b, fsw.this.k);
         fsw.this.i.accept(fsw.b($$0, fsw.b($$1)));
         fsw.this.a($$0, $$1);
         return this;
      }

      public fsw.e c(dne $$0) {
         alk $$1 = fto.j.a($$0, this.b, fsw.this.k);
         ftb $$2 = fsw.b(fto.k.a($$0, this.b, fsw.this.k));
         fsw.this.i.accept(fsw.c($$0, fsw.b($$1), $$2));
         fsw.this.a($$0, $$1);
         return this;
      }

      public fsw.e d(dne $$0) {
         fsw.this.i.accept(fsw.a($$0, this.b, fsw.this.k));
         fsw.this.a($$0, fto.j.a($$0, this.b, fsw.this.k));
         return this;
      }
   }
}
