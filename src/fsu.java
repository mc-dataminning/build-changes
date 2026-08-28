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

public class fsu {
   final Consumer<fta> i;
   final fsx j;
   final BiConsumer<ali, ftj> k;
   static final List<dnc> l = List.of(dne.eP, dne.eV, dne.iA);
   public static final gtx a = $$0 -> $$0;
   public static final gtx b = gtx.d.withValue(true);
   public static final gtx c = gtx.a.withValue(i.b);
   public static final gtx d = gtx.a.withValue(i.c);
   public static final gtx e = gtx.a.withValue(i.d);
   public static final gtx f = gtx.b.withValue(i.b);
   public static final gtx g = gtx.b.withValue(i.c);
   public static final gtx h = gtx.b.withValue(i.d);
   static final Map<dnc, fsu.b> m = Map.of(dne.b, fsu::a, dne.tt, fsu::c, dne.fe, fsu::b);
   private static final fte<gtx> n = fte.b(ebu.R).a(jb.a, c).a(jb.b, e).a(jb.c, a).a(jb.d, g).a(jb.e, h).a(jb.f, f);
   private static final fte<gtx> o = fte.b(ebu.R).a(jb.a, d).a(jb.b, a).a(jb.c, c).a(jb.d, c.then(g)).a(jb.e, c.then(h)).a(jb.f, c.then(f));
   private static final fte<gtx> p = fte.b(ebu.T).a(jb.f, a).a(jb.d, f).a(jb.e, g).a(jb.c, h);
   private static final fte<gtx> q = fte.b(ebu.T).a(jb.d, a).a(jb.e, f).a(jb.c, g).a(jb.f, h);
   private static final fte<gtx> r = fte.b(ebu.T).a(jb.f, f).a(jb.d, g).a(jb.e, h).a(jb.c, a);
   static final Map<dnc, ftp> s = ImmutableMap.builder()
      .put(dne.bc, ftp.C.get(dne.bc))
      .put(dne.jR, ftp.C.get(dne.jR))
      .put(dne.kv, ftp.a(ftn.a(dne.bc, "_top")))
      .put(dne.kx, ftp.a(ftn.a(dne.jR, "_top")))
      .put(dne.be, ftp.d.get(dne.bc).a($$0 -> $$0.a(fto.i, ftn.J(dne.be))))
      .put(dne.jT, ftp.d.get(dne.jR).a($$0 -> $$0.a(fto.i, ftn.J(dne.jT))))
      .put(dne.hE, ftp.d.get(dne.hE))
      .put(dne.kw, ftp.a(ftn.a(dne.hE, "_bottom")))
      .put(dne.pZ, ftp.D.get(dne.pZ))
      .put(dne.tt, ftp.D.get(dne.tt))
      .put(dne.hF, ftp.d.get(dne.hF).a($$0 -> $$0.a(fto.i, ftn.J(dne.hF))))
      .put(dne.bd, ftp.d.get(dne.bd).a($$0 -> {
         $$0.a(fto.d, ftn.a(dne.bc, "_top"));
         $$0.a(fto.i, ftn.J(dne.bd));
      }))
      .put(dne.jS, ftp.d.get(dne.jS).a($$0 -> {
         $$0.a(fto.d, ftn.a(dne.jR, "_top"));
         $$0.a(fto.i, ftn.J(dne.jS));
      }))
      .put(dne.ru, ftp.D.get(dne.ru))
      .put(dne.rp, ftp.D.get(dne.rp))
      .build();
   static final Map<mk.b, BiConsumer<fsu.a, dnc>> t = ImmutableMap.builder()
      .put(mk.b.a, fsu.a::a)
      .put(mk.b.e, fsu.a::l)
      .put(mk.b.b, fsu.a::k)
      .put(mk.b.c, fsu.a::k)
      .put(mk.b.f, fsu.a::c)
      .put(mk.b.g, fsu.a::d)
      .put(mk.b.h, fsu.a::e)
      .put(mk.b.i, fsu.a::f)
      .put(mk.b.k, fsu.a::h)
      .put(mk.b.l, fsu.a::i)
      .put(mk.b.m, fsu.a::j)
      .put(mk.b.n, fsu.a::g)
      .put(mk.b.p, fsu.a::m)
      .put(mk.b.q, fsu.a::b)
      .build();
   private static final Map<jb, gtx> u = ImmutableMap.of(jb.c, a, jb.f, f.then(b), jb.d, g.then(b), jb.e, h.then(b), jb.b, e.then(b), jb.a, c.then(b));
   private static final Map<fsu.c, ali> v = new HashMap<>();

   static gtw a(ali $$0) {
      return new gtw($$0);
   }

   static fsz a(gtw $$0) {
      return new fsz(btb.a($$0));
   }

   private static fsz a(gtw... $$0) {
      return new fsz(btb.a(Arrays.stream($$0).map($$0x -> new bta<>($$0x, 1)).toList()));
   }

   static fsz b(ali $$0) {
      return a(a($$0));
   }

   private static ftb b() {
      return new ftb();
   }

   private static gua a(ftb... $$0) {
      return new gtz(gtz.a.b, Stream.of($$0).map(ftb::a).toList());
   }

   private static fta a(dnc $$0, gtw $$1, ftn $$2, BiConsumer<ali, ftj> $$3) {
      gtw $$4 = a(ftm.e.a($$0, $$2, $$3));
      return ftd.a($$0, a($$1, $$4));
   }

   private static fta b(dnc $$0, gtw $$1, ftn $$2, BiConsumer<ali, ftj> $$3) {
      fsz $$4 = b(ftm.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static fta c(dnc $$0, gtw $$1, ftn $$2, BiConsumer<ali, ftj> $$3) {
      gtw $$4 = a(ftm.l.a($$0, $$2, $$3));
      return ftd.a($$0, a($$1, $$4)).a(c());
   }

   public fsu(Consumer<fta> $$0, fsx $$1, BiConsumer<ali, ftj> $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   private void a(czu $$0, ali $$1) {
      this.j.a($$0, fti.a($$1));
   }

   void a(dnc $$0, ali $$1) {
      this.j.a($$0.h(), fti.a($$1));
   }

   private void a(dnc $$0, ali $$1, fsn $$2) {
      this.j.a($$0.h(), fti.a($$1, $$2));
   }

   private ali a(czu $$0) {
      return ftm.bI.a(ftk.a($$0), ftn.b($$0), this.k);
   }

   ali a(czu $$0, dnc $$1) {
      return ftm.bI.a(ftk.a($$0), ftn.I($$1), this.k);
   }

   private ali a(czu $$0, dnc $$1, String $$2) {
      return ftm.bI.a(ftk.a($$0), ftn.k(ftn.a($$1, $$2)), this.k);
   }

   ali b(czu $$0, dnc $$1, String $$2) {
      ali $$3 = ftn.J($$1);
      ali $$4 = ftn.a($$1, $$2);
      return ftm.bM.a(ftk.a($$0), ftn.c($$3, $$4), this.k);
   }

   void b(czu $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dnc $$0) {
      czu $$1 = $$0.h();
      if ($$1 != dac.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dnc $$0, String $$1) {
      czu $$2 = $$0.h();
      if ($$2 != dac.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dnc $$0, String $$1) {
      czu $$2 = $$0.h();
      if ($$2 != dac.a) {
         ali $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fsz b(gtw $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static fsz a(gtw $$0, gtw $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static fte<fsz> a(ebv $$0, fsz $$1, fsz $$2) {
      return fte.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dnc $$0) {
      gtw $$1 = a(ftp.a.create($$0, this.k));
      gtw $$2 = a(ftp.c.create($$0, this.k));
      this.i.accept(ftd.a($$0, a($$1, $$2)));
   }

   private void e(dnc $$0) {
      gtw $$1 = a(ftp.a.create($$0, this.k));
      this.i.accept(ftd.a($$0, b($$1)));
   }

   private void f(dnc $$0) {
      this.i.accept(ftd.a($$0).a(fte.a(ebu.by).a($$1 -> {
         String $$2 = "_" + $$1;
         ali $$3 = ftn.a($$0, $$2);
         ali $$4 = ftm.c.a($$0, $$2, new ftn().a(fto.a, $$3), this.k);
         return b($$4);
      })));
      this.a($$0, ftk.a($$0, "_0"));
   }

   static fta a(dnc $$0, fsz $$1, fsz $$2) {
      return ftd.a($$0)
         .a(fte.a(ebu.A).a(false, $$1).a(true, $$2))
         .a(
            fte.b(ebu.X, ebu.T)
               .a(ebp.a, jb.f, f)
               .a(ebp.a, jb.e, h)
               .a(ebp.a, jb.d, g)
               .a(ebp.a, jb.c, a)
               .a(ebp.b, jb.f, f.then(c).then(b))
               .a(ebp.b, jb.e, h.then(c).then(b))
               .a(ebp.b, jb.d, g.then(c).then(b))
               .a(ebp.b, jb.c, c.then(b))
               .a(ebp.c, jb.f, h.then(d))
               .a(ebp.c, jb.e, f.then(d))
               .a(ebp.c, jb.d, d)
               .a(ebp.c, jb.c, g.then(d))
         );
   }

   private static fta a(dnc $$0, fsz $$1, fsz $$2, fsz $$3, fsz $$4, fsz $$5, fsz $$6, fsz $$7, fsz $$8) {
      return ftd.a($$0)
         .a(
            fte.a(ebu.T, ebu.ah, ebu.bh, ebu.y)
               .a(jb.f, eca.b, ebz.a, false, $$1)
               .a(jb.d, eca.b, ebz.a, false, $$1.a(f))
               .a(jb.e, eca.b, ebz.a, false, $$1.a(g))
               .a(jb.c, eca.b, ebz.a, false, $$1.a(h))
               .a(jb.f, eca.b, ebz.b, false, $$3)
               .a(jb.d, eca.b, ebz.b, false, $$3.a(f))
               .a(jb.e, eca.b, ebz.b, false, $$3.a(g))
               .a(jb.c, eca.b, ebz.b, false, $$3.a(h))
               .a(jb.f, eca.b, ebz.a, true, $$2.a(f))
               .a(jb.d, eca.b, ebz.a, true, $$2.a(g))
               .a(jb.e, eca.b, ebz.a, true, $$2.a(h))
               .a(jb.c, eca.b, ebz.a, true, $$2)
               .a(jb.f, eca.b, ebz.b, true, $$4.a(h))
               .a(jb.d, eca.b, ebz.b, true, $$4)
               .a(jb.e, eca.b, ebz.b, true, $$4.a(f))
               .a(jb.c, eca.b, ebz.b, true, $$4.a(g))
               .a(jb.f, eca.a, ebz.a, false, $$5)
               .a(jb.d, eca.a, ebz.a, false, $$5.a(f))
               .a(jb.e, eca.a, ebz.a, false, $$5.a(g))
               .a(jb.c, eca.a, ebz.a, false, $$5.a(h))
               .a(jb.f, eca.a, ebz.b, false, $$7)
               .a(jb.d, eca.a, ebz.b, false, $$7.a(f))
               .a(jb.e, eca.a, ebz.b, false, $$7.a(g))
               .a(jb.c, eca.a, ebz.b, false, $$7.a(h))
               .a(jb.f, eca.a, ebz.a, true, $$6.a(f))
               .a(jb.d, eca.a, ebz.a, true, $$6.a(g))
               .a(jb.e, eca.a, ebz.a, true, $$6.a(h))
               .a(jb.c, eca.a, ebz.a, true, $$6)
               .a(jb.f, eca.a, ebz.b, true, $$8.a(h))
               .a(jb.d, eca.a, ebz.b, true, $$8)
               .a(jb.e, eca.a, ebz.b, true, $$8.a(f))
               .a(jb.c, eca.a, ebz.b, true, $$8.a(g))
         );
   }

   static fta a(dnc $$0, fsz $$1, fsz $$2, fsz $$3, fsz $$4, fsz $$5) {
      return ftc.a($$0).a($$1).a(b().a(ebu.N, true), $$2).a(b().a(ebu.O, true), $$3).a(b().a(ebu.P, true), $$4).a(b().a(ebu.Q, true), $$5);
   }

   static fta b(dnc $$0, fsz $$1, fsz $$2) {
      return ftc.a($$0)
         .a($$1)
         .a(b().a(ebu.N, true), $$2.a(b))
         .a(b().a(ebu.O, true), $$2.a(f).a(b))
         .a(b().a(ebu.P, true), $$2.a(g).a(b))
         .a(b().a(ebu.Q, true), $$2.a(h).a(b));
   }

   static fta a(dnc $$0, fsz $$1, fsz $$2, fsz $$3) {
      return ftc.a($$0)
         .a(b().a(ebu.L, true), $$1)
         .a(b().a(ebu.aa, ecr.b), $$2.a(b))
         .a(b().a(ebu.Z, ecr.b), $$2.a(f).a(b))
         .a(b().a(ebu.ab, ecr.b), $$2.a(g).a(b))
         .a(b().a(ebu.ac, ecr.b), $$2.a(h).a(b))
         .a(b().a(ebu.aa, ecr.c), $$3.a(b))
         .a(b().a(ebu.Z, ecr.c), $$3.a(f).a(b))
         .a(b().a(ebu.ab, ecr.c), $$3.a(g).a(b))
         .a(b().a(ebu.ac, ecr.c), $$3.a(h).a(b));
   }

   static fta a(dnc $$0, fsz $$1, fsz $$2, fsz $$3, fsz $$4, boolean $$5) {
      return ftd.a($$0).a(fte.a(ebu.t, ebu.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(q);
   }

   static fta b(dnc $$0, fsz $$1, fsz $$2, fsz $$3) {
      return ftd.a($$0)
         .a(
            fte.a(ebu.T, ebu.ai, ebu.bl)
               .a(jb.f, ecd.b, ecn.a, $$2)
               .a(jb.e, ecd.b, ecn.a, $$2.a(g).a(b))
               .a(jb.d, ecd.b, ecn.a, $$2.a(f).a(b))
               .a(jb.c, ecd.b, ecn.a, $$2.a(h).a(b))
               .a(jb.f, ecd.b, ecn.e, $$3)
               .a(jb.e, ecd.b, ecn.e, $$3.a(g).a(b))
               .a(jb.d, ecd.b, ecn.e, $$3.a(f).a(b))
               .a(jb.c, ecd.b, ecn.e, $$3.a(h).a(b))
               .a(jb.f, ecd.b, ecn.d, $$3.a(h).a(b))
               .a(jb.e, ecd.b, ecn.d, $$3.a(f).a(b))
               .a(jb.d, ecd.b, ecn.d, $$3)
               .a(jb.c, ecd.b, ecn.d, $$3.a(g).a(b))
               .a(jb.f, ecd.b, ecn.c, $$1)
               .a(jb.e, ecd.b, ecn.c, $$1.a(g).a(b))
               .a(jb.d, ecd.b, ecn.c, $$1.a(f).a(b))
               .a(jb.c, ecd.b, ecn.c, $$1.a(h).a(b))
               .a(jb.f, ecd.b, ecn.b, $$1.a(h).a(b))
               .a(jb.e, ecd.b, ecn.b, $$1.a(f).a(b))
               .a(jb.d, ecd.b, ecn.b, $$1)
               .a(jb.c, ecd.b, ecn.b, $$1.a(g).a(b))
               .a(jb.f, ecd.a, ecn.a, $$2.a(d).a(b))
               .a(jb.e, ecd.a, ecn.a, $$2.a(d).a(g).a(b))
               .a(jb.d, ecd.a, ecn.a, $$2.a(d).a(f).a(b))
               .a(jb.c, ecd.a, ecn.a, $$2.a(d).a(h).a(b))
               .a(jb.f, ecd.a, ecn.e, $$3.a(d).a(f).a(b))
               .a(jb.e, ecd.a, ecn.e, $$3.a(d).a(h).a(b))
               .a(jb.d, ecd.a, ecn.e, $$3.a(d).a(g).a(b))
               .a(jb.c, ecd.a, ecn.e, $$3.a(d).a(b))
               .a(jb.f, ecd.a, ecn.d, $$3.a(d).a(b))
               .a(jb.e, ecd.a, ecn.d, $$3.a(d).a(g).a(b))
               .a(jb.d, ecd.a, ecn.d, $$3.a(d).a(f).a(b))
               .a(jb.c, ecd.a, ecn.d, $$3.a(d).a(h).a(b))
               .a(jb.f, ecd.a, ecn.c, $$1.a(d).a(f).a(b))
               .a(jb.e, ecd.a, ecn.c, $$1.a(d).a(h).a(b))
               .a(jb.d, ecd.a, ecn.c, $$1.a(d).a(g).a(b))
               .a(jb.c, ecd.a, ecn.c, $$1.a(d).a(b))
               .a(jb.f, ecd.a, ecn.b, $$1.a(d).a(b))
               .a(jb.e, ecd.a, ecn.b, $$1.a(d).a(g).a(b))
               .a(jb.d, ecd.a, ecn.b, $$1.a(d).a(f).a(b))
               .a(jb.c, ecd.a, ecn.b, $$1.a(d).a(h).a(b))
         );
   }

   private static fta c(dnc $$0, fsz $$1, fsz $$2, fsz $$3) {
      return ftd.a($$0)
         .a(
            fte.a(ebu.T, ebu.ai, ebu.y)
               .a(jb.c, ecd.b, false, $$2)
               .a(jb.d, ecd.b, false, $$2.a(g))
               .a(jb.f, ecd.b, false, $$2.a(f))
               .a(jb.e, ecd.b, false, $$2.a(h))
               .a(jb.c, ecd.a, false, $$1)
               .a(jb.d, ecd.a, false, $$1.a(g))
               .a(jb.f, ecd.a, false, $$1.a(f))
               .a(jb.e, ecd.a, false, $$1.a(h))
               .a(jb.c, ecd.b, true, $$3)
               .a(jb.d, ecd.b, true, $$3.a(g))
               .a(jb.f, ecd.b, true, $$3.a(f))
               .a(jb.e, ecd.b, true, $$3.a(h))
               .a(jb.c, ecd.a, true, $$3.a(d).a(g))
               .a(jb.d, ecd.a, true, $$3.a(d))
               .a(jb.f, ecd.a, true, $$3.a(d).a(h))
               .a(jb.e, ecd.a, true, $$3.a(d).a(f))
         );
   }

   private static fta d(dnc $$0, fsz $$1, fsz $$2, fsz $$3) {
      return ftd.a($$0)
         .a(
            fte.a(ebu.T, ebu.ai, ebu.y)
               .a(jb.c, ecd.b, false, $$2)
               .a(jb.d, ecd.b, false, $$2)
               .a(jb.f, ecd.b, false, $$2)
               .a(jb.e, ecd.b, false, $$2)
               .a(jb.c, ecd.a, false, $$1)
               .a(jb.d, ecd.a, false, $$1)
               .a(jb.f, ecd.a, false, $$1)
               .a(jb.e, ecd.a, false, $$1)
               .a(jb.c, ecd.b, true, $$3)
               .a(jb.d, ecd.b, true, $$3.a(g))
               .a(jb.f, ecd.b, true, $$3.a(f))
               .a(jb.e, ecd.b, true, $$3.a(h))
               .a(jb.c, ecd.a, true, $$3)
               .a(jb.d, ecd.a, true, $$3.a(g))
               .a(jb.f, ecd.a, true, $$3.a(f))
               .a(jb.e, ecd.a, true, $$3.a(h))
         );
   }

   static ftd a(dnc $$0, fsz $$1) {
      return ftd.a($$0, $$1);
   }

   private static fte<gtx> c() {
      return fte.b(ebu.K).a(jb.a.b, a).a(jb.a.c, c).a(jb.a.a, c.then(f));
   }

   static fta a(dnc $$0, ftn $$1, BiConsumer<ali, ftj> $$2) {
      fsz $$3 = b(ftm.g.a($$0, $$1, $$2));
      fsz $$4 = b(ftm.h.a($$0, $$1, $$2));
      fsz $$5 = b(ftm.i.a($$0, $$1, $$2));
      return ftd.a($$0).a(fte.a(ebu.K).a(jb.a.a, $$3).a(jb.a.b, $$4).a(jb.a.c, $$5));
   }

   static fta b(dnc $$0, fsz $$1) {
      return ftd.a($$0, $$1).a(c());
   }

   private void c(dnc $$0, fsz $$1) {
      this.i.accept(b($$0, $$1));
   }

   public void a(dnc $$0, ftp.a $$1) {
      fsz $$2 = b($$1.create($$0, this.k));
      this.i.accept(b($$0, $$2));
   }

   private void c(dnc $$0, ftp.a $$1) {
      fsz $$2 = b($$1.create($$0, this.k));
      this.i.accept(ftd.a($$0, $$2).a(r));
   }

   static fta c(dnc $$0, fsz $$1, fsz $$2) {
      return ftd.a($$0).a(fte.a(ebu.K).a(jb.a.b, $$1).a(jb.a.c, $$2.a(c)).a(jb.a.a, $$2.a(c).a(f)));
   }

   private void a(dnc $$0, ftp.a $$1, ftp.a $$2) {
      fsz $$3 = b($$1.create($$0, this.k));
      fsz $$4 = b($$2.create($$0, this.k));
      this.i.accept(c($$0, $$3, $$4));
   }

   private void g(dnc $$0) {
      fsz $$1 = b(ftp.A.create($$0, this.k));
      fsz $$2 = b(ftp.B.create($$0, this.k));
      fsz $$3 = b(this.a(ftp.A, $$0, "_awake"));
      fsz $$4 = b(this.a(ftp.B, $$0, "_awake"));
      fsz $$5 = b(this.a(ftp.A, $$0, "_dormant"));
      fsz $$6 = b(this.a(ftp.B, $$0, "_dormant"));
      this.i
         .accept(
            ftd.a($$0)
               .a(
                  fte.a(ebu.K, doy.c)
                     .a(jb.a.b, eby.a, $$1)
                     .a(jb.a.c, eby.a, $$2.a(c))
                     .a(jb.a.a, eby.a, $$2.a(c).a(f))
                     .a(jb.a.b, eby.b, $$5)
                     .a(jb.a.c, eby.b, $$6.a(c))
                     .a(jb.a.a, eby.b, $$6.a(c).a(f))
                     .a(jb.a.b, eby.c, $$3)
                     .a(jb.a.c, eby.c, $$4.a(c))
                     .a(jb.a.a, eby.c, $$4.a(c).a(f))
               )
         );
   }

   private ali a(ftp.a $$0, dnc $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fto.i, ftn.a($$1, $$2)).a(fto.d, ftn.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.k);
   }

   private ali a(dnc $$0, String $$1, ftl $$2, Function<ali, ftn> $$3) {
      return $$2.a($$0, $$1, $$3.apply(ftn.a($$0, $$1)), this.k);
   }

   static fta d(dnc $$0, fsz $$1, fsz $$2) {
      return ftd.a($$0).a(a(ebu.A, $$2, $$1));
   }

   static fta e(dnc $$0, fsz $$1, fsz $$2, fsz $$3) {
      return ftd.a($$0).a(fte.a(ebu.bk).a(ecm.b, $$1).a(ecm.a, $$2).a(ecm.c, $$3));
   }

   public void a(dnc $$0) {
      this.b($$0, ftp.a);
   }

   public void b(dnc $$0, ftp.a $$1) {
      this.i.accept(a($$0, b($$1.create($$0, this.k))));
   }

   public void a(dnc $$0, ftp.a $$1, int $$2) {
      ali $$3 = $$1.create($$0, this.k);
      this.i.accept(a($$0, b($$3)));
      this.a($$0, $$3, fti.a($$2));
   }

   private void d() {
      this.K(dne.fx);
      ali $$0 = this.a(dac.gr, dne.fx);
      this.a(dne.fx, $$0, fti.a(-12012264));
   }

   private void h(dnc $$0) {
      ali $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fsm());
   }

   private fsu.a i(dnc $$0) {
      ftp $$1 = s.getOrDefault($$0, ftp.a.get($$0));
      return new fsu.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dnc $$0, dnc $$1, dnc $$2) {
      fsz $$3 = this.g($$1, $$0);
      this.i.accept(a($$1, $$3));
      this.i.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dnc $$0) {
      ftn $$1 = ftn.w($$0);
      fsz $$2 = b(ftm.v.a($$0, $$1, this.k));
      fsz $$3 = b(ftm.w.a($$0, $$1, this.k));
      fsz $$4 = b(ftm.x.a($$0, $$1, this.k));
      fsz $$5 = b(ftm.y.a($$0, $$1, this.k));
      fsz $$6 = b(ftm.z.a($$0, $$1, this.k));
      fsz $$7 = b(ftm.A.a($$0, $$1, this.k));
      fsz $$8 = b(ftm.B.a($$0, $$1, this.k));
      fsz $$9 = b(ftm.C.a($$0, $$1, this.k));
      this.b($$0.h());
      this.i.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dnc $$0, dnc $$1) {
      fsz $$2 = b(ftm.v.a($$0));
      fsz $$3 = b(ftm.w.a($$0));
      fsz $$4 = b(ftm.x.a($$0));
      fsz $$5 = b(ftm.y.a($$0));
      fsz $$6 = b(ftm.z.a($$0));
      fsz $$7 = b(ftm.A.a($$0));
      fsz $$8 = b(ftm.B.a($$0));
      fsz $$9 = b(ftm.C.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dnc $$0) {
      ftn $$1 = ftn.b($$0);
      fsz $$2 = b(ftm.ak.a($$0, $$1, this.k));
      ali $$3 = ftm.al.a($$0, $$1, this.k);
      fsz $$4 = b(ftm.am.a($$0, $$1, this.k));
      this.i.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dnc $$0) {
      ftn $$1 = ftn.b($$0);
      fsz $$2 = b(ftm.ah.a($$0, $$1, this.k));
      ali $$3 = ftm.ai.a($$0, $$1, this.k);
      fsz $$4 = b(ftm.aj.a($$0, $$1, this.k));
      this.i.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dnc $$0, dnc $$1) {
      fsz $$2 = b(ftm.ah.a($$0));
      fsz $$3 = b(ftm.ai.a($$0));
      fsz $$4 = b(ftm.aj.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      fsz $$0 = b(ftk.a(dne.tn));
      fsz $$1 = b(ftk.a(dne.tn, "_partial_tilt"));
      fsz $$2 = b(ftk.a(dne.tn, "_full_tilt"));
      this.i.accept(ftd.a(dne.tn).a(fte.a(ebu.bo).a(ecq.a, $$0).a(ecq.b, $$0).a(ecq.c, $$1).a(ecq.d, $$2)).a(r));
   }

   private fsu.e m(dnc $$0) {
      return new fsu.e(ftn.q($$0));
   }

   private void n(dnc $$0) {
      this.d($$0, $$0);
   }

   private void d(dnc $$0, dnc $$1) {
      this.i.accept(a($$0, b(ftk.a($$1))));
   }

   private void a(dnc $$0, fsu.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dnc $$0, fsu.d $$1, ftn $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dnc $$0, fsu.d $$1) {
      ftn $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dnc $$0, fsu.d $$1, ftn $$2) {
      fsz $$3 = b($$1.a().a($$0, $$2, this.k));
      this.i.accept(a($$0, $$3));
   }

   private void a(dnc $$0, fsu.d $$1, ech<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.i.accept(ftd.a($$0).a(fte.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            ftn $$5 = ftn.c(ftn.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.k));
         })));
      }
   }

   private void a(dnc $$0, dnc $$1, fsu.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dnc $$0, dnc $$1, fsu.d $$2) {
      this.b($$0, $$2);
      ftn $$3 = $$2.b($$0);
      fsz $$4 = b($$2.b().a($$1, $$3, this.k));
      this.i.accept(a($$1, $$4));
   }

   private void e(dnc $$0, dnc $$1) {
      ftp $$2 = ftp.u.get($$0);
      fsz $$3 = b($$2.a($$0, this.k));
      this.i.accept(a($$0, $$3));
      fsz $$4 = b(ftm.aJ.a($$1, $$2.b(), this.k));
      this.i.accept(ftd.a($$1, $$4).a(r));
      this.c($$0);
   }

   private void f(dnc $$0, dnc $$1) {
      this.b($$0.h());
      ftn $$2 = ftn.k($$0);
      ftn $$3 = ftn.a($$0, $$1);
      fsz $$4 = b(ftm.bb.a($$1, $$3, this.k));
      this.i.accept(ftd.a($$1, $$4).a(fte.b(ebu.T).a(jb.e, a).a(jb.d, h).a(jb.c, f).a(jb.f, g)));
      this.i.accept(ftd.a($$0).a(fte.a(ebu.ay).a($$2x -> b(ftm.ba[$$2x].a($$0, $$2, this.k)))));
   }

   private void f() {
      dnc $$0 = dne.li;
      this.b($$0.h());
      fsz $$1 = b(ftk.a($$0, "_top"));
      fsz $$2 = b(ftk.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dnc $$0 = dne.lh;
      this.b($$0.h());
      this.i.accept(ftd.a($$0).a(fte.a(dsx.e, ebu.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(ftk.a($$0, "_top_stage_" + $$1));
            case b -> b(ftk.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dnc $$0, dnc $$1, dnc $$2, dnc $$3, dnc $$4, dnc $$5, dnc $$6, dnc $$7) {
      this.a($$0, fsu.d.b);
      this.a($$1, fsu.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dnc $$0, fsu.d $$1) {
      fsz $$2 = b(this.a($$0, "_top", $$1.a(), ftn::c));
      fsz $$3 = b(this.a($$0, "_bottom", $$1.a(), ftn::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dnc $$0, fsu.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dnc $$0) {
      ali $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fsm());
      this.c($$0, fsu.d.a);
   }

   private void h() {
      this.a(dne.jf, "_front");
      fsz $$0 = b(ftk.a(dne.jf, "_top"));
      fsz $$1 = b(this.a(dne.jf, "_bottom", fsu.d.b.a(), ftn::c));
      this.e(dne.jf, $$0, $$1);
   }

   private void i() {
      fsz $$0 = b(this.a(dne.bH, "_top", ftm.bv, ftn::a));
      fsz $$1 = b(this.a(dne.bH, "_bottom", ftm.bv, ftn::a));
      this.e(dne.bH, $$0, $$1);
   }

   private void j() {
      fsz $$0 = b(ftk.a(dne.tp, "_top"));
      fsz $$1 = b(ftk.a(dne.tp, "_bottom"));
      this.i.accept(ftd.a(dne.tp).a(fte.a(ebu.ah).a(eca.b, $$1).a(eca.a, $$0)).a(r));
   }

   private void e(dnc $$0, fsz $$1, fsz $$2) {
      this.i.accept(ftd.a($$0).a(fte.a(ebu.ah).a(eca.b, $$2).a(eca.a, $$1)));
   }

   private void p(dnc $$0) {
      ftn $$1 = ftn.h($$0);
      ftn $$2 = ftn.e(ftn.a($$0, "_corner"));
      fsz $$3 = b(ftm.au.a($$0, $$1, this.k));
      fsz $$4 = b(ftm.av.a($$0, $$2, this.k));
      fsz $$5 = b(ftm.aw.a($$0, $$1, this.k));
      fsz $$6 = b(ftm.ax.a($$0, $$1, this.k));
      this.c($$0);
      this.i
         .accept(
            ftd.a($$0)
               .a(
                  fte.a(ebu.aj)
                     .a(eci.a, $$3)
                     .a(eci.b, $$3.a(f))
                     .a(eci.c, $$5.a(f))
                     .a(eci.d, $$6.a(f))
                     .a(eci.e, $$5)
                     .a(eci.f, $$6)
                     .a(eci.g, $$4)
                     .a(eci.h, $$4.a(f))
                     .a(eci.i, $$4.a(g))
                     .a(eci.j, $$4.a(h))
               )
         );
   }

   private void q(dnc $$0) {
      fsz $$1 = b(this.a($$0, "", ftm.au, ftn::e));
      fsz $$2 = b(this.a($$0, "", ftm.aw, ftn::e));
      fsz $$3 = b(this.a($$0, "", ftm.ax, ftn::e));
      fsz $$4 = b(this.a($$0, "_on", ftm.au, ftn::e));
      fsz $$5 = b(this.a($$0, "_on", ftm.aw, ftn::e));
      fsz $$6 = b(this.a($$0, "_on", ftm.ax, ftn::e));
      this.c($$0);
      this.i.accept(ftd.a($$0).a(fte.a(ebu.A, ebu.ak).a(($$6x, $$7) -> {
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

   private void a(dnc $$0, czu $$1) {
      fsz $$2 = b(ftm.aa.a($$0, ftn.a($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private void b(dnc $$0, ali $$1) {
      fsz $$2 = b(ftm.aa.a($$0, ftn.h($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private fsz g(dnc $$0, dnc $$1) {
      return b(ftm.aa.a($$0, ftn.x($$1), this.k));
   }

   public void a(dnc $$0, dnc $$1) {
      this.i.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dnc $$0) {
      this.a($$0, $$0);
   }

   private void h(dnc $$0, dnc $$1) {
      this.a($$0);
      fsz $$2 = b(ftp.j.get($$0).a($$1, this.k));
      this.i.accept(a($$1, $$2));
   }

   private void s(dnc $$0) {
      fsz $$1 = b(ftp.p.create($$0, this.k));
      fsz $$2 = b(ftp.q.create($$0, this.k));
      fsz $$3 = b(ftp.r.create($$0, this.k));
      fsz $$4 = b(ftp.s.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, ebu.V, $$1, $$2, $$3, $$4);
   }

   private void t(dnc $$0) {
      fsz $$1 = b(ftp.l.create($$0, this.k));
      fsz $$2 = b(ftp.m.create($$0, this.k));
      fsz $$3 = b(ftp.n.create($$0, this.k));
      fsz $$4 = b(ftp.o.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, ebu.U, $$1, $$2, $$3, $$4);
   }

   private void a(dnc $$0, ece $$1, fsz $$2, fsz $$3, fsz $$4, fsz $$5) {
      this.i
         .accept(
            ftc.a($$0)
               .a(b().a(ebu.T, jb.c), $$2)
               .a(b().a(ebu.T, jb.f), $$2.a(f))
               .a(b().a(ebu.T, jb.d), $$2.a(g))
               .a(b().a(ebu.T, jb.e), $$2.a(h))
               .a(b().a($$1, 2, 3, 4).a(ebu.T, jb.c), $$3)
               .a(b().a($$1, 2, 3, 4).a(ebu.T, jb.f), $$3.a(f))
               .a(b().a($$1, 2, 3, 4).a(ebu.T, jb.d), $$3.a(g))
               .a(b().a($$1, 2, 3, 4).a(ebu.T, jb.e), $$3.a(h))
               .a(b().a($$1, 3, 4).a(ebu.T, jb.c), $$4)
               .a(b().a($$1, 3, 4).a(ebu.T, jb.f), $$4.a(f))
               .a(b().a($$1, 3, 4).a(ebu.T, jb.d), $$4.a(g))
               .a(b().a($$1, 3, 4).a(ebu.T, jb.e), $$4.a(h))
               .a(b().a($$1, 4).a(ebu.T, jb.c), $$5)
               .a(b().a($$1, 4).a(ebu.T, jb.f), $$5.a(f))
               .a(b().a($$1, 4).a(ebu.T, jb.d), $$5.a(g))
               .a(b().a($$1, 4).a(ebu.T, jb.e), $$5.a(h))
         );
   }

   private void a(ftp.a $$0, dnc... $$1) {
      for (dnc $$2 : $$1) {
         gtw $$3 = a($$0.create($$2, this.k));
         this.i.accept(ftd.a($$2, b($$3)));
      }
   }

   private void b(ftp.a $$0, dnc... $$1) {
      for (dnc $$2 : $$1) {
         fsz $$3 = b($$0.create($$2, this.k));
         this.i.accept(ftd.a($$2, $$3).a(q));
      }
   }

   private void i(dnc $$0, dnc $$1) {
      this.a($$0);
      ftn $$2 = ftn.b($$0, $$1);
      fsz $$3 = b(ftm.aP.a($$1, $$2, this.k));
      fsz $$4 = b(ftm.aQ.a($$1, $$2, this.k));
      fsz $$5 = b(ftm.aR.a($$1, $$2, this.k));
      fsz $$6 = b(ftm.aN.a($$1, $$2, this.k));
      fsz $$7 = b(ftm.aO.a($$1, $$2, this.k));
      czu $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.i
         .accept(
            ftc.a($$1)
               .a($$3)
               .a(b().a(ebu.N, true), $$4)
               .a(b().a(ebu.O, true), $$4.a(f))
               .a(b().a(ebu.P, true), $$5)
               .a(b().a(ebu.Q, true), $$5.a(f))
               .a(b().a(ebu.N, false), $$6)
               .a(b().a(ebu.O, false), $$7)
               .a(b().a(ebu.P, false), $$7.a(f))
               .a(b().a(ebu.Q, false), $$6.a(h))
         );
   }

   private void u(dnc $$0) {
      ftn $$1 = ftn.C($$0);
      fsz $$2 = b(ftm.aS.a($$0, $$1, this.k));
      fsz $$3 = b(this.a($$0, "_conditional", ftm.aS, $$1x -> $$1.c(fto.i, $$1x)));
      this.i.accept(ftd.a($$0).a(a(ebu.f, $$3, $$2)).a(n));
   }

   private void v(dnc $$0) {
      fsz $$1 = b(ftp.v.create($$0, this.k));
      this.i.accept(a($$0, $$1).a(q));
   }

   private static fsz a(int $$0) {
      String $$1 = "_age" + $$0;
      return new fsz(btb.a(IntStream.range(1, 5).mapToObj($$1x -> new bta<>(a(ftk.a(dne.nF, $$1x + $$1)), 1)).collect(Collectors.toList())));
   }

   private void k() {
      this.i
         .accept(
            ftc.a(dne.nF)
               .a(b().a(ebu.at, 0), a(0))
               .a(b().a(ebu.at, 1), a(1))
               .a(b().a(ebu.bn, ebq.b), b(ftk.a(dne.nF, "_small_leaves")))
               .a(b().a(ebu.bn, ebq.c), b(ftk.a(dne.nF, "_large_leaves")))
         );
   }

   private void l() {
      ali $$0 = ftn.a(dne.oA, "_top_open");
      fsz $$1 = b(ftp.f.create(dne.oA, this.k));
      fsz $$2 = b(ftp.f.get(dne.oA).a($$1x -> $$1x.a(fto.f, $$0)).a(dne.oA, "_open", this.k));
      this.i.accept(ftd.a(dne.oA).a(fte.a(ebu.y).a(false, $$1).a(true, $$2)).a(o));
   }

   private static <T extends Comparable<T>> fte<fsz> a(ech<T> $$0, T $$1, fsz $$2, fsz $$3) {
      return fte.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dnc $$0, Function<dnc, ftn> $$1) {
      ftn $$2 = $$1.apply($$0).b(fto.i, fto.c);
      ftn $$3 = $$2.c(fto.g, ftn.a($$0, "_front_honey"));
      ali $$4 = ftm.q.a($$0, "_empty", $$2, this.k);
      ali $$5 = ftm.q.a($$0, "_honey", $$3, this.k);
      this.j.a($$0.h(), fti.a(dmw.c, fti.a($$4), Map.of(5, fti.a($$5))));
      this.i.accept(ftd.a($$0).a(a(dmw.c, 5, b($$5), b($$4))).a(r));
   }

   private void a(dnc $$0, ech<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ali> $$3 = new Int2ObjectOpenHashMap();
         this.i.accept(ftd.a($$0).a(fte.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((ali)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, ftm.bc, ftn::g)));
         })));
      }
   }

   private void m() {
      fsz $$0 = b(ftk.a(dne.oJ, "_floor"));
      fsz $$1 = b(ftk.a(dne.oJ, "_ceiling"));
      fsz $$2 = b(ftk.a(dne.oJ, "_wall"));
      fsz $$3 = b(ftk.a(dne.oJ, "_between_walls"));
      this.b(dac.xD);
      this.i
         .accept(
            ftd.a(dne.oJ)
               .a(
                  fte.a(ebu.T, ebu.Y)
                     .a(jb.c, ebs.a, $$0)
                     .a(jb.d, ebs.a, $$0.a(g))
                     .a(jb.f, ebs.a, $$0.a(f))
                     .a(jb.e, ebs.a, $$0.a(h))
                     .a(jb.c, ebs.b, $$1)
                     .a(jb.d, ebs.b, $$1.a(g))
                     .a(jb.f, ebs.b, $$1.a(f))
                     .a(jb.e, ebs.b, $$1.a(h))
                     .a(jb.c, ebs.c, $$2.a(h))
                     .a(jb.d, ebs.c, $$2.a(f))
                     .a(jb.f, ebs.c, $$2)
                     .a(jb.e, ebs.c, $$2.a(g))
                     .a(jb.d, ebs.d, $$3.a(f))
                     .a(jb.c, ebs.d, $$3.a(h))
                     .a(jb.f, ebs.d, $$3)
                     .a(jb.e, ebs.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.i
         .accept(
            ftd.a(dne.oF, b(ftk.a(dne.oF)))
               .a(
                  fte.b(ebu.X, ebu.T)
                     .a(ebp.a, jb.c, a)
                     .a(ebp.a, jb.f, f)
                     .a(ebp.a, jb.d, g)
                     .a(ebp.a, jb.e, h)
                     .a(ebp.b, jb.c, c)
                     .a(ebp.b, jb.f, c.then(f))
                     .a(ebp.b, jb.d, c.then(g))
                     .a(ebp.b, jb.e, c.then(h))
                     .a(ebp.c, jb.d, d)
                     .a(ebp.c, jb.e, d.then(f))
                     .a(ebp.c, jb.c, d.then(g))
                     .a(ebp.c, jb.f, d.then(h))
               )
         );
   }

   private void d(dnc $$0, ftp.a $$1) {
      fsz $$2 = b($$1.create($$0, this.k));
      ali $$3 = ftn.a($$0, "_front_on");
      fsz $$4 = b($$1.get($$0).a($$1x -> $$1x.a(fto.g, $$3)).a($$0, "_on", this.k));
      this.i.accept(ftd.a($$0).a(a(ebu.u, $$4, $$2)).a(r));
   }

   private void a(dnc... $$0) {
      fsz $$1 = b(ftk.a("campfire_off"));

      for (dnc $$2 : $$0) {
         fsz $$3 = b(ftm.bj.a($$2, ftn.H($$2), this.k));
         this.b($$2.h());
         this.i.accept(ftd.a($$2).a(a(ebu.u, $$3, $$1)).a(q));
      }
   }

   private void w(dnc $$0) {
      fsz $$1 = b(ftm.bE.a($$0, ftn.o($$0), this.k));
      this.i.accept(a($$0, $$1));
   }

   private void x(dnc $$0) {
      fsz $$1;
      if ($$0 == dne.tT) {
         $$1 = b(ftm.bG.a($$0, ftn.p($$0), this.k));
      } else {
         $$1 = b(ftm.bF.a($$0, ftn.p($$0), this.k));
      }

      this.i.accept(a($$0, $$1));
   }

   private void o() {
      ftn $$0 = ftn.a(ftn.J(dne.cv), ftn.J(dne.n));
      fsz $$1 = b(ftm.j.a(dne.cv, $$0, this.k));
      this.i.accept(a(dne.cv, $$1));
   }

   private void p() {
      this.b(dac.ml);
      this.i
         .accept(
            ftc.a(dne.cH)
               .a(
                  a(
                     b().a(ebu.ae, ecj.c).a(ebu.ad, ecj.c).a(ebu.af, ecj.c).a(ebu.ag, ecj.c),
                     b().a(ebu.ae, ecj.b, ecj.a).a(ebu.ad, ecj.b, ecj.a),
                     b().a(ebu.ad, ecj.b, ecj.a).a(ebu.af, ecj.b, ecj.a),
                     b().a(ebu.af, ecj.b, ecj.a).a(ebu.ag, ecj.b, ecj.a),
                     b().a(ebu.ag, ecj.b, ecj.a).a(ebu.ae, ecj.b, ecj.a)
                  ),
                  b(ftk.a("redstone_dust_dot"))
               )
               .a(b().a(ebu.ae, ecj.b, ecj.a), b(ftk.a("redstone_dust_side0")))
               .a(b().a(ebu.af, ecj.b, ecj.a), b(ftk.a("redstone_dust_side_alt0")))
               .a(b().a(ebu.ad, ecj.b, ecj.a), b(ftk.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(ebu.ag, ecj.b, ecj.a), b(ftk.a("redstone_dust_side1")).a(h))
               .a(b().a(ebu.ae, ecj.a), b(ftk.a("redstone_dust_up")))
               .a(b().a(ebu.ad, ecj.a), b(ftk.a("redstone_dust_up")).a(f))
               .a(b().a(ebu.af, ecj.a), b(ftk.a("redstone_dust_up")).a(g))
               .a(b().a(ebu.ag, ecj.a), b(ftk.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(dac.mp);
      this.i
         .accept(
            ftd.a(dne.hz)
               .a(
                  fte.a(ebu.bg, ebu.A)
                     .a(ebx.a, false, b(ftk.a(dne.hz)))
                     .a(ebx.a, true, b(ftk.a(dne.hz, "_on")))
                     .a(ebx.b, false, b(ftk.a(dne.hz, "_subtract")))
                     .a(ebx.b, true, b(ftk.a(dne.hz, "_on_subtract")))
               )
               .a(q)
         );
   }

   private void r() {
      ftn $$0 = ftn.a(dne.ku);
      ftn $$1 = ftn.a(ftn.a(dne.kh, "_side"), $$0.a(fto.f));
      fsz $$2 = b(ftm.ab.a(dne.kh, $$1, this.k));
      fsz $$3 = b(ftm.ac.a(dne.kh, $$1, this.k));
      fsz $$4 = b(ftm.j.b(dne.kh, "_double", $$1, this.k));
      this.i.accept(e(dne.kh, $$2, $$3, $$4));
      this.i.accept(a(dne.ku, b(ftm.c.a(dne.ku, $$0, this.k))));
   }

   private void s() {
      this.b(dac.ty);
      this.i
         .accept(
            ftc.a(dne.fR)
               .a(b(ftn.J(dne.fR)))
               .a(b().a(ebu.n, true), b(ftn.a(dne.fR, "_bottle0")))
               .a(b().a(ebu.o, true), b(ftn.a(dne.fR, "_bottle1")))
               .a(b().a(ebu.p, true), b(ftn.a(dne.fR, "_bottle2")))
               .a(b().a(ebu.n, false), b(ftn.a(dne.fR, "_empty0")))
               .a(b().a(ebu.o, false), b(ftn.a(dne.fR, "_empty1")))
               .a(b().a(ebu.p, false), b(ftn.a(dne.fR, "_empty2")))
         );
   }

   private void y(dnc $$0) {
      fsz $$1 = b(ftm.bA.a($$0, ftn.b($$0), this.k));
      fsz $$2 = b(ftk.a("mushroom_block_inside"));
      this.i
         .accept(
            ftc.a($$0)
               .a(b().a(ebu.N, true), $$1)
               .a(b().a(ebu.O, true), $$1.a(f).a(b))
               .a(b().a(ebu.P, true), $$1.a(g).a(b))
               .a(b().a(ebu.Q, true), $$1.a(h).a(b))
               .a(b().a(ebu.L, true), $$1.a(e).a(b))
               .a(b().a(ebu.M, true), $$1.a(c).a(b))
               .a(b().a(ebu.N, false), $$2)
               .a(b().a(ebu.O, false), $$2.a(f))
               .a(b().a(ebu.P, false), $$2.a(g))
               .a(b().a(ebu.Q, false), $$2.a(h))
               .a(b().a(ebu.L, false), $$2.a(e))
               .a(b().a(ebu.M, false), $$2.a(c))
         );
      this.a($$0, ftp.a.createWithSuffix($$0, "_inventory", this.k));
   }

   private void t() {
      this.b(dac.sJ);
      this.i
         .accept(
            ftd.a(dne.ex)
               .a(
                  fte.a(ebu.aB)
                     .a(0, b(ftk.a(dne.ex)))
                     .a(1, b(ftk.a(dne.ex, "_slice1")))
                     .a(2, b(ftk.a(dne.ex, "_slice2")))
                     .a(3, b(ftk.a(dne.ex, "_slice3")))
                     .a(4, b(ftk.a(dne.ex, "_slice4")))
                     .a(5, b(ftk.a(dne.ex, "_slice5")))
                     .a(6, b(ftk.a(dne.ex, "_slice6")))
               )
         );
   }

   private void u() {
      ftn $$0 = new ftn()
         .a(fto.c, ftn.a(dne.oD, "_side3"))
         .a(fto.o, ftn.J(dne.t))
         .a(fto.n, ftn.a(dne.oD, "_top"))
         .a(fto.j, ftn.a(dne.oD, "_side3"))
         .a(fto.l, ftn.a(dne.oD, "_side3"))
         .a(fto.k, ftn.a(dne.oD, "_side1"))
         .a(fto.m, ftn.a(dne.oD, "_side2"));
      this.i.accept(a(dne.oD, b(ftm.a.a(dne.oD, $$0, this.k))));
   }

   private void v() {
      ftn $$0 = new ftn()
         .a(fto.c, ftn.a(dne.oH, "_front"))
         .a(fto.o, ftn.a(dne.oH, "_bottom"))
         .a(fto.n, ftn.a(dne.oH, "_top"))
         .a(fto.j, ftn.a(dne.oH, "_front"))
         .a(fto.k, ftn.a(dne.oH, "_front"))
         .a(fto.l, ftn.a(dne.oH, "_side"))
         .a(fto.m, ftn.a(dne.oH, "_side"));
      this.i.accept(a(dne.oH, b(ftm.a.a(dne.oH, $$0, this.k))));
   }

   private void a(dnc $$0, dnc $$1, BiFunction<dnc, dnc, ftn> $$2) {
      ftn $$3 = $$2.apply($$0, $$1);
      this.i.accept(a($$0, b(ftm.a.a($$0, $$3, this.k))));
   }

   public void b(dnc $$0) {
      ftn $$1 = new ftn()
         .a(fto.c, ftn.a($$0, "_particle"))
         .a(fto.o, ftn.a($$0, "_down"))
         .a(fto.n, ftn.a($$0, "_up"))
         .a(fto.j, ftn.a($$0, "_north"))
         .a(fto.k, ftn.a($$0, "_south"))
         .a(fto.l, ftn.a($$0, "_east"))
         .a(fto.m, ftn.a($$0, "_west"));
      this.i.accept(a($$0, b(ftm.a.a($$0, $$1, this.k))));
   }

   private void w() {
      ftn $$0 = ftn.n(dne.fr);
      this.i.accept(a(dne.fr, b(ftk.a(dne.fr))));
      this.a(dne.ev, $$0);
      this.a(dne.ew, $$0);
   }

   private void a(dnc $$0, ftn $$1) {
      fsz $$2 = b(ftm.p.a($$0, $$1.c(fto.g, ftn.J($$0)), this.k));
      this.i.accept(ftd.a($$0, $$2).a(r));
   }

   private void x() {
      this.b(dac.tz);
      this.n(dne.fS);
      this.i.accept(a(dne.fU, b(ftm.bD.a(dne.fU, ftn.j(ftn.a(dne.K, "_still")), this.k))));
      this.i
         .accept(
            ftd.a(dne.fT)
               .a(
                  fte.a(drq.f)
                     .a(1, b(ftm.bB.a(dne.fT, "_level1", ftn.j(ftn.a(dne.J, "_still")), this.k)))
                     .a(2, b(ftm.bC.a(dne.fT, "_level2", ftn.j(ftn.a(dne.J, "_still")), this.k)))
                     .a(3, b(ftm.bD.a(dne.fT, "_full", ftn.j(ftn.a(dne.J, "_still")), this.k)))
               )
         );
      this.i
         .accept(
            ftd.a(dne.fV)
               .a(
                  fte.a(drq.f)
                     .a(1, b(ftm.bB.a(dne.fV, "_level1", ftn.j(ftn.J(dne.rx)), this.k)))
                     .a(2, b(ftm.bC.a(dne.fV, "_level2", ftn.j(ftn.J(dne.rx)), this.k)))
                     .a(3, b(ftm.bD.a(dne.fV, "_full", ftn.j(ftn.J(dne.rx)), this.k)))
               )
         );
   }

   private void y() {
      ftn $$0 = ftn.b(dne.lb);
      fsz $$1 = b(ftm.aL.a(dne.lb, $$0, this.k));
      fsz $$2 = b(this.a(dne.lb, "_dead", ftm.aL, $$1x -> $$0.c(fto.b, $$1x)));
      this.i.accept(ftd.a(dne.lb).a(a(ebu.ax, 5, $$2, $$1)));
   }

   private void z() {
      fsz $$0 = b(ftk.a(dne.ua));
      fsz $$1 = b(ftk.a(dne.ua, "_triggered"));
      fsz $$2 = b(ftk.a(dne.ua, "_crafting"));
      fsz $$3 = b(ftk.a(dne.ua, "_crafting_triggered"));
      this.i
         .accept(ftd.a(dne.ua).a(fte.a(ebu.G, dow.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(fte.b(ebu.W).a(fsu::a)));
   }

   private void z(dnc $$0) {
      ftn $$1 = new ftn().a(fto.f, ftn.a(dne.cO, "_top")).a(fto.i, ftn.a(dne.cO, "_side")).a(fto.g, ftn.a($$0, "_front"));
      ftn $$2 = new ftn().a(fto.i, ftn.a(dne.cO, "_top")).a(fto.g, ftn.a($$0, "_front_vertical"));
      fsz $$3 = b(ftm.p.a($$0, $$1, this.k));
      fsz $$4 = b(ftm.r.a($$0, $$2, this.k));
      this.i.accept(ftd.a($$0).a(fte.a(ebu.R).a(jb.a, $$4.a(d)).a(jb.b, $$4).a(jb.c, $$3).a(jb.f, $$3.a(f)).a(jb.d, $$3.a(g)).a(jb.e, $$3.a(h))));
   }

   private void A() {
      fsz $$0 = b(ftk.a(dne.fX));
      fsz $$1 = b(ftk.a(dne.fX, "_filled"));
      this.i.accept(ftd.a(dne.fX).a(fte.a(ebu.k).a(false, $$0).a(true, $$1)).a(q));
   }

   private void B() {
      fsz $$0 = b(ftk.a(dne.la, "_side"));
      gtw $$1 = a(ftk.a(dne.la, "_noside"));
      gtw $$2 = a(ftk.a(dne.la, "_noside1"));
      gtw $$3 = a(ftk.a(dne.la, "_noside2"));
      gtw $$4 = a(ftk.a(dne.la, "_noside3"));
      gtw $$5 = $$1.a(b);
      gtw $$6 = $$2.a(b);
      gtw $$7 = $$3.a(b);
      gtw $$8 = $$4.a(b);
      this.i
         .accept(
            ftc.a(dne.la)
               .a(b().a(ebu.N, true), $$0)
               .a(b().a(ebu.O, true), $$0.a(f).a(b))
               .a(b().a(ebu.P, true), $$0.a(g).a(b))
               .a(b().a(ebu.Q, true), $$0.a(h).a(b))
               .a(b().a(ebu.L, true), $$0.a(e).a(b))
               .a(b().a(ebu.M, true), $$0.a(c).a(b))
               .a(b().a(ebu.N, false), new fsz(btb.a(new bta<>($$1, 2), new bta<>($$2, 1), new bta<>($$3, 1), new bta<>($$4, 1))))
               .a(b().a(ebu.O, false), new fsz(btb.a(new bta<>($$6.a(f), 1), new bta<>($$7.a(f), 1), new bta<>($$8.a(f), 1), new bta<>($$5.a(f), 2))))
               .a(b().a(ebu.P, false), new fsz(btb.a(new bta<>($$7.a(g), 1), new bta<>($$8.a(g), 1), new bta<>($$5.a(g), 2), new bta<>($$6.a(g), 1))))
               .a(b().a(ebu.Q, false), new fsz(btb.a(new bta<>($$8.a(h), 1), new bta<>($$5.a(h), 2), new bta<>($$6.a(h), 1), new bta<>($$7.a(h), 1))))
               .a(b().a(ebu.L, false), new fsz(btb.a(new bta<>($$5.a(e), 2), new bta<>($$8.a(e), 1), new bta<>($$6.a(e), 1), new bta<>($$7.a(e), 1))))
               .a(b().a(ebu.M, false), new fsz(btb.a(new bta<>($$8.a(c), 1), new bta<>($$7.a(c), 1), new bta<>($$6.a(c), 1), new bta<>($$5.a(c), 2))))
         );
   }

   private void C() {
      this.i
         .accept(
            ftc.a(dne.pK)
               .a(b(ftn.J(dne.pK)))
               .a(b().a(ebu.aO, 1), b(ftn.a(dne.pK, "_contents1")))
               .a(b().a(ebu.aO, 2), b(ftn.a(dne.pK, "_contents2")))
               .a(b().a(ebu.aO, 3), b(ftn.a(dne.pK, "_contents3")))
               .a(b().a(ebu.aO, 4), b(ftn.a(dne.pK, "_contents4")))
               .a(b().a(ebu.aO, 5), b(ftn.a(dne.pK, "_contents5")))
               .a(b().a(ebu.aO, 6), b(ftn.a(dne.pK, "_contents6")))
               .a(b().a(ebu.aO, 7), b(ftn.a(dne.pK, "_contents7")))
               .a(b().a(ebu.aO, 8), b(ftn.a(dne.pK, "_contents_ready")))
         );
   }

   private void A(dnc $$0) {
      fsz $$1 = b(ftm.c.a($$0, ftn.a($$0), this.k));
      fsz $$2 = b(this.a($$0, "_powered", ftm.c, ftn::b));
      fsz $$3 = b(this.a($$0, "_lit", ftm.c, ftn::b));
      fsz $$4 = b(this.a($$0, "_lit_powered", ftm.c, ftn::b));
      this.i.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static fta a(dnc $$0, fsz $$1, fsz $$2, fsz $$3, fsz $$4) {
      return ftd.a($$0).a(fte.a(ebu.u, ebu.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dnc $$0, dnc $$1) {
      fsz $$2 = b(ftk.a($$0));
      fsz $$3 = b(ftk.a($$0, "_powered"));
      fsz $$4 = b(ftk.a($$0, "_lit"));
      fsz $$5 = b(ftk.a($$0, "_lit_powered"));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dnc $$0) {
      fsz $$1 = b(ftm.ao.a($$0, ftn.c($$0), this.k));
      this.i.accept(ftd.a($$0, $$1).a(o));
   }

   private void D() {
      this.B(dne.rg);
      this.B(dne.rf);
      this.B(dne.re);
      this.B(dne.rd);
   }

   private void E() {
      fte.b<fsz, jb, ecb> $$0 = fte.a(ebu.bp, ebu.bq);

      for (ecb $$1 : ecb.values()) {
         $$0.a(jb.b, $$1, this.a(jb.b, $$1));
      }

      for (ecb $$2 : ecb.values()) {
         $$0.a(jb.a, $$2, this.a(jb.a, $$2));
      }

      this.i.accept(ftd.a(dne.tb).a($$0));
   }

   private fsz a(jb $$0, ecb $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      ftn $$3 = ftn.c(ftn.a(dne.tb, $$2));
      return b(ftm.an.a(dne.tb, $$2, $$3, this.k));
   }

   private void C(dnc $$0) {
      ftn $$1 = new ftn().a(fto.e, ftn.J(dne.em)).a(fto.f, ftn.J($$0)).a(fto.i, ftn.a($$0, "_side"));
      this.i.accept(a($$0, b(ftm.n.a($$0, $$1, this.k))));
   }

   private void F() {
      ali $$0 = ftn.a(dne.hA, "_side");
      ftn $$1 = new ftn().a(fto.f, ftn.a(dne.hA, "_top")).a(fto.i, $$0);
      ftn $$2 = new ftn().a(fto.f, ftn.a(dne.hA, "_inverted_top")).a(fto.i, $$0);
      this.i.accept(ftd.a(dne.hA).a(fte.a(ebu.s).a(false, b(ftm.aM.a(dne.hA, $$1, this.k))).a(true, b(ftm.aM.a(ftk.a(dne.hA, "_inverted"), $$2, this.k)))));
   }

   private void D(dnc $$0) {
      this.i.accept(ftd.a($$0, b(ftk.a($$0))).a(o));
   }

   private void G() {
      dnc $$0 = dne.ta;
      fsz $$1 = b(ftk.a($$0, "_on"));
      fsz $$2 = b(ftk.a($$0));
      this.i.accept(ftd.a($$0).a(a(ebu.A, $$1, $$2)).a(o));
   }

   private void H() {
      ftn $$0 = new ftn().a(fto.C, ftn.J(dne.j)).a(fto.f, ftn.J(dne.cN));
      ftn $$1 = new ftn().a(fto.C, ftn.J(dne.j)).a(fto.f, ftn.a(dne.cN, "_moist"));
      fsz $$2 = b(ftm.bd.a(dne.cN, $$0, this.k));
      fsz $$3 = b(ftm.bd.a(ftn.a(dne.cN, "_moist"), $$1, this.k));
      this.i.accept(ftd.a(dne.cN).a(a(ebu.aT, 7, $$3, $$2)));
   }

   private fsz E(dnc $$0) {
      return a(a(ftm.be.a(ftk.a($$0, "_floor0"), ftn.y($$0), this.k)), a(ftm.be.a(ftk.a($$0, "_floor1"), ftn.z($$0), this.k)));
   }

   private fsz F(dnc $$0) {
      return a(
         a(ftm.bf.a(ftk.a($$0, "_side0"), ftn.y($$0), this.k)),
         a(ftm.bf.a(ftk.a($$0, "_side1"), ftn.z($$0), this.k)),
         a(ftm.bg.a(ftk.a($$0, "_side_alt0"), ftn.y($$0), this.k)),
         a(ftm.bg.a(ftk.a($$0, "_side_alt1"), ftn.z($$0), this.k))
      );
   }

   private fsz G(dnc $$0) {
      return a(
         a(ftm.bh.a(ftk.a($$0, "_up0"), ftn.y($$0), this.k)),
         a(ftm.bh.a(ftk.a($$0, "_up1"), ftn.z($$0), this.k)),
         a(ftm.bi.a(ftk.a($$0, "_up_alt0"), ftn.y($$0), this.k)),
         a(ftm.bi.a(ftk.a($$0, "_up_alt1"), ftn.z($$0), this.k))
      );
   }

   private void I() {
      ftb $$0 = b().a(ebu.N, false).a(ebu.O, false).a(ebu.P, false).a(ebu.Q, false).a(ebu.L, false);
      fsz $$1 = this.E(dne.cB);
      fsz $$2 = this.F(dne.cB);
      fsz $$3 = this.G(dne.cB);
      this.i
         .accept(
            ftc.a(dne.cB)
               .a($$0, $$1)
               .a(a(b().a(ebu.N, true), $$0), $$2)
               .a(a(b().a(ebu.O, true), $$0), $$2.a(f))
               .a(a(b().a(ebu.P, true), $$0), $$2.a(g))
               .a(a(b().a(ebu.Q, true), $$0), $$2.a(h))
               .a(b().a(ebu.L, true), $$3)
         );
   }

   private void J() {
      fsz $$0 = this.E(dne.cC);
      fsz $$1 = this.F(dne.cC);
      this.i.accept(ftc.a(dne.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dnc $$0) {
      fsz $$1 = b(ftp.x.create($$0, this.k));
      fsz $$2 = b(ftp.y.create($$0, this.k));
      this.b($$0.h());
      this.i.accept(ftd.a($$0).a(a(ebu.m, $$2, $$1)));
   }

   private void K() {
      ftn $$0 = ftn.a(ftn.a(dne.ah, "_side"), ftn.a(dne.ah, "_top"));
      fsz $$1 = b(ftm.j.a(dne.ah, $$0, this.k));
      this.i.accept(b(dne.ah, $$1));
   }

   private void L() {
      this.b(dac.af);
      dnc $$0 = dne.H;
      fsz $$1 = b(ftk.a($$0));
      this.i.accept(ftd.a(dne.H).a(fte.a(dsd.d, dsd.b).a(($$2, $$3) -> $$2 ? b(ftk.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.i
         .accept(
            ftd.a(dne.lo)
               .a(
                  fte.a(ebu.av)
                     .a(0, b(this.a(dne.lo, "_0", ftm.c, ftn::b)))
                     .a(1, b(this.a(dne.lo, "_1", ftm.c, ftn::b)))
                     .a(2, b(this.a(dne.lo, "_2", ftm.c, ftn::b)))
                     .a(3, b(this.a(dne.lo, "_3", ftm.c, ftn::b)))
               )
         );
   }

   private void N() {
      ali $$0 = ftn.J(dne.j);
      ftn $$1 = new ftn().a(fto.e, $$0).b(fto.e, fto.c).a(fto.f, ftn.a(dne.i, "_top")).a(fto.i, ftn.a(dne.i, "_snow"));
      fsz $$2 = b(ftm.n.a(dne.i, "_snow", $$1, this.k));
      ali $$3 = ftk.a(dne.i);
      this.f(dne.i, b(a($$3)), $$2);
      this.a(dne.i, $$3, new fsm());
      fsz $$4 = b(a(ftp.f.get(dne.fE).a($$1x -> $$1x.a(fto.e, $$0)).a(dne.fE, this.k)));
      this.f(dne.fE, $$4, $$2);
      fsz $$5 = b(a(ftp.f.get(dne.l).a($$1x -> $$1x.a(fto.e, $$0)).a(dne.l, this.k)));
      this.f(dne.l, $$5, $$2);
   }

   private void f(dnc $$0, fsz $$1, fsz $$2) {
      this.i.accept(ftd.a($$0).a(fte.a(ebu.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(dac.sp);
      this.i.accept(ftd.a(dne.gb).a(fte.a(ebu.au).a(0, b(ftk.a(dne.gb, "_stage0"))).a(1, b(ftk.a(dne.gb, "_stage1"))).a(2, b(ftk.a(dne.gb, "_stage2")))).a(q));
   }

   private void P() {
      gtw $$0 = a(ftk.a(dne.lk));
      this.i.accept(ftd.a(dne.lk, b($$0)));
   }

   private void k(dnc $$0, dnc $$1) {
      ftn $$2 = ftn.b($$1);
      fsz $$3 = b(ftm.Y.a($$0, $$2, this.k));
      fsz $$4 = b(ftm.Z.a($$0, $$2, this.k));
      this.i.accept(ftd.a($$0).a(a(ebu.aW, 1, $$4, $$3)));
   }

   private void Q() {
      fsz $$0 = b(ftk.a(dne.hD));
      fsz $$1 = b(ftk.a(dne.hD, "_side"));
      this.b(dac.mv);
      this.i.accept(ftd.a(dne.hD).a(fte.a(ebu.S).a(jb.a, $$0).a(jb.c, $$1).a(jb.f, $$1.a(f)).a(jb.d, $$1.a(g)).a(jb.e, $$1.a(h))));
   }

   private void l(dnc $$0, dnc $$1) {
      fsz $$2 = b(ftk.a($$0));
      this.i.accept(ftd.a($$1, $$2));
      this.j.a($$0.h(), $$1.h());
   }

   private void R() {
      fsz $$0 = b(ftk.a(dne.fo, "_post_ends"));
      fsz $$1 = b(ftk.a(dne.fo, "_post"));
      fsz $$2 = b(ftk.a(dne.fo, "_cap"));
      fsz $$3 = b(ftk.a(dne.fo, "_cap_alt"));
      fsz $$4 = b(ftk.a(dne.fo, "_side"));
      fsz $$5 = b(ftk.a(dne.fo, "_side_alt"));
      this.i
         .accept(
            ftc.a(dne.fo)
               .a($$0)
               .a(b().a(ebu.N, false).a(ebu.O, false).a(ebu.P, false).a(ebu.Q, false), $$1)
               .a(b().a(ebu.N, true).a(ebu.O, false).a(ebu.P, false).a(ebu.Q, false), $$2)
               .a(b().a(ebu.N, false).a(ebu.O, true).a(ebu.P, false).a(ebu.Q, false), $$2.a(f))
               .a(b().a(ebu.N, false).a(ebu.O, false).a(ebu.P, true).a(ebu.Q, false), $$3)
               .a(b().a(ebu.N, false).a(ebu.O, false).a(ebu.P, false).a(ebu.Q, true), $$3.a(f))
               .a(b().a(ebu.N, true), $$4)
               .a(b().a(ebu.O, true), $$4.a(f))
               .a(b().a(ebu.P, true), $$5)
               .a(b().a(ebu.Q, true), $$5.a(f))
         );
      this.c(dne.fo);
   }

   private void I(dnc $$0) {
      this.i.accept(ftd.a($$0, b(ftk.a($$0))).a(r));
   }

   private void S() {
      fsz $$0 = b(ftk.a(dne.dL));
      fsz $$1 = b(ftk.a(dne.dL, "_on"));
      this.c(dne.dL);
      this.i
         .accept(
            ftd.a(dne.dL)
               .a(a(ebu.A, $$0, $$1))
               .a(
                  fte.b(ebu.X, ebu.T)
                     .a(ebp.c, jb.c, d.then(g))
                     .a(ebp.c, jb.f, d.then(h))
                     .a(ebp.c, jb.d, d)
                     .a(ebp.c, jb.e, d.then(f))
                     .a(ebp.a, jb.c, a)
                     .a(ebp.a, jb.f, f)
                     .a(ebp.a, jb.d, g)
                     .a(ebp.a, jb.e, h)
                     .a(ebp.b, jb.c, c)
                     .a(ebp.b, jb.f, c.then(f))
                     .a(ebp.b, jb.d, c.then(g))
                     .a(ebp.b, jb.e, c.then(h))
               )
         );
   }

   private void T() {
      ali $$0 = this.a(dac.gE, dne.fF);
      this.a(dne.fF, $$0, fti.a(-9321636));
      gtw $$1 = a(ftk.a(dne.fF));
      this.i.accept(ftd.a(dne.fF, b($$1)));
   }

   private void U() {
      this.c(dne.tX);
      this.i.accept(a(dne.tX, b(ftk.a(dne.tX))));
   }

   private void V() {
      this.i.accept(ftd.a(dne.eu).a(fte.a(ebu.J).a(jb.a.a, b(ftk.a(dne.eu, "_ns"))).a(jb.a.c, b(ftk.a(dne.eu, "_ew")))));
   }

   private void W() {
      gtw $$0 = a(ftp.a.create(dne.em, this.k));
      this.i
         .accept(
            ftd.a(
               dne.em,
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
      fsz $$0 = b(ftk.a(dne.lu));
      fsz $$1 = b(ftk.a(dne.lu, "_on"));
      this.i.accept(ftd.a(dne.lu).a(a(ebu.A, $$1, $$0)).a(n));
   }

   private void Y() {
      ftn $$0 = new ftn().a(fto.e, ftn.a(dne.bI, "_bottom")).a(fto.i, ftn.a(dne.bI, "_side"));
      ali $$1 = ftn.a(dne.bI, "_top_sticky");
      ali $$2 = ftn.a(dne.bI, "_top");
      ftn $$3 = $$0.c(fto.F, $$1);
      ftn $$4 = $$0.c(fto.F, $$2);
      fsz $$5 = b(ftk.a(dne.bI, "_base"));
      this.a(dne.bI, $$5, $$4);
      this.a(dne.by, $$5, $$3);
      ali $$6 = ftm.n.a(dne.bI, "_inventory", $$0.c(fto.f, $$2), this.k);
      ali $$7 = ftm.n.a(dne.by, "_inventory", $$0.c(fto.f, $$1), this.k);
      this.a(dne.bI, $$6);
      this.a(dne.by, $$7);
   }

   private void a(dnc $$0, fsz $$1, ftn $$2) {
      fsz $$3 = b(ftm.bs.a($$0, $$2, this.k));
      this.i.accept(ftd.a($$0).a(a(ebu.j, $$1, $$3)).a(n));
   }

   private void Z() {
      ftn $$0 = new ftn().a(fto.G, ftn.a(dne.bI, "_top")).a(fto.i, ftn.a(dne.bI, "_side"));
      ftn $$1 = $$0.c(fto.F, ftn.a(dne.bI, "_top_sticky"));
      ftn $$2 = $$0.c(fto.F, ftn.a(dne.bI, "_top"));
      this.i
         .accept(
            ftd.a(dne.bJ)
               .a(
                  fte.a(ebu.B, ebu.bj)
                     .a(false, ecg.a, b(ftm.bt.a(dne.bI, "_head", $$2, this.k)))
                     .a(false, ecg.b, b(ftm.bt.a(dne.bI, "_head_sticky", $$1, this.k)))
                     .a(true, ecg.a, b(ftm.bu.a(dne.bI, "_head_short", $$2, this.k)))
                     .a(true, ecg.b, b(ftm.bu.a(dne.bI, "_head_short_sticky", $$1, this.k)))
               )
               .a(n)
         );
   }

   private void aa() {
      dnc $$0 = dne.ub;
      ftn $$1 = ftn.a($$0, "_side_inactive", "_top_inactive");
      ftn $$2 = ftn.a($$0, "_side_active", "_top_active");
      ftn $$3 = ftn.a($$0, "_side_active", "_top_ejecting_reward");
      ftn $$4 = ftn.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      ftn $$5 = ftn.a($$0, "_side_active_ominous", "_top_active_ominous");
      ftn $$6 = ftn.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ali $$7 = ftm.o.a($$0, $$1, this.k);
      fsz $$8 = b($$7);
      fsz $$9 = b(ftm.o.a($$0, "_active", $$2, this.k));
      fsz $$10 = b(ftm.o.a($$0, "_ejecting_reward", $$3, this.k));
      fsz $$11 = b(ftm.o.a($$0, "_inactive_ominous", $$4, this.k));
      fsz $$12 = b(ftm.o.a($$0, "_active_ominous", $$5, this.k));
      fsz $$13 = b(ftm.o.a($$0, "_ejecting_reward_ominous", $$6, this.k));
      this.a($$0, $$7);
      this.i.accept(ftd.a($$0).a(fte.a(ebu.bB, ebu.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dnc $$0 = dne.uc;
      ftn $$1 = ftn.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      ftn $$2 = ftn.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      ftn $$3 = ftn.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      ftn $$4 = ftn.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ali $$5 = ftm.cb.a($$0, $$1, this.k);
      fsz $$6 = b($$5);
      fsz $$7 = b(ftm.cb.a($$0, "_active", $$2, this.k));
      fsz $$8 = b(ftm.cb.a($$0, "_unlocking", $$3, this.k));
      fsz $$9 = b(ftm.cb.a($$0, "_ejecting_reward", $$4, this.k));
      ftn $$10 = ftn.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      ftn $$11 = ftn.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ftn $$12 = ftn.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      ftn $$13 = ftn.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      fsz $$14 = b(ftm.cb.a($$0, "_ominous", $$10, this.k));
      fsz $$15 = b(ftm.cb.a($$0, "_active_ominous", $$11, this.k));
      fsz $$16 = b(ftm.cb.a($$0, "_unlocking_ominous", $$12, this.k));
      fsz $$17 = b(ftm.cb.a($$0, "_ejecting_reward_ominous", $$13, this.k));
      this.a($$0, $$5);
      this.i.accept(ftd.a($$0).a(fte.a(dwn.b, dwn.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(r));
   }

   private void ac() {
      ali $$0 = ftk.a(dne.ry, "_inactive");
      fsz $$1 = b($$0);
      fsz $$2 = b(ftk.a(dne.ry, "_active"));
      this.a(dne.ry, $$0);
      this.i.accept(ftd.a(dne.ry).a(fte.a(ebu.br).a($$2x -> $$2x != ecl.b && $$2x != ecl.c ? $$1 : $$2)));
   }

   private void ad() {
      ali $$0 = ftk.a(dne.rz, "_inactive");
      fsz $$1 = b($$0);
      fsz $$2 = b(ftk.a(dne.rz, "_active"));
      this.a(dne.rz, $$0);
      this.i.accept(ftd.a(dne.rz).a(fte.a(ebu.br).a($$2x -> $$2x != ecl.b && $$2x != ecl.c ? $$1 : $$2)).a(r));
   }

   private void ae() {
      ali $$0 = ftm.ca.a(dne.rD, ftn.a(false), this.k);
      fsz $$1 = b($$0);
      fsz $$2 = b(ftm.ca.a(dne.rD, "_can_summon", ftn.a(true), this.k));
      this.a(dne.rD, $$0);
      this.i.accept(ftd.a(dne.rD).a(a(ebu.e, $$2, $$1)));
   }

   private void af() {
      ali $$0 = ftk.a(dne.oy, "_stable");
      fsz $$1 = b($$0);
      fsz $$2 = b(ftk.a(dne.oy, "_unstable"));
      this.a(dne.oy, $$0);
      this.i.accept(ftd.a(dne.oy).a(a(ebu.d, $$2, $$1)));
   }

   private void ag() {
      fsz $$0 = b(this.a(dne.td, "", ftm.ao, ftn::c));
      fsz $$1 = b(this.a(dne.td, "_lit", ftm.ao, ftn::c));
      this.i.accept(ftd.a(dne.td).a(a(ebu.b, $$1, $$0)));
      fsz $$2 = b(this.a(dne.te, "", ftm.ao, ftn::c));
      fsz $$3 = b(this.a(dne.te, "_lit", ftm.ao, ftn::c));
      this.i.accept(ftd.a(dne.te).a(a(ebu.b, $$3, $$2)));
   }

   private void ah() {
      fsz $$0 = b(ftp.a.create(dne.ga, this.k));
      fsz $$1 = b(this.a(dne.ga, "_on", ftm.c, ftn::b));
      this.i.accept(ftd.a(dne.ga).a(a(ebu.u, $$1, $$0)));
   }

   private void m(dnc $$0, dnc $$1) {
      ftn $$2 = ftn.B($$0);
      this.i.accept(a($$0, b(ftm.bm.a($$0, $$2, this.k))));
      this.i.accept(ftd.a($$1, b(ftm.bo.a($$1, $$2, this.k))).a(p));
      this.c($$0);
   }

   private void ai() {
      ftn $$0 = ftn.B(dne.ea);
      ftn $$1 = ftn.i(ftn.a(dne.ea, "_off"));
      fsz $$2 = b(ftm.bq.a(dne.ea, $$0, this.k));
      fsz $$3 = b(ftm.bn.a(dne.ea, "_off", $$1, this.k));
      this.i.accept(ftd.a(dne.ea).a(a(ebu.u, $$2, $$3)));
      fsz $$4 = b(ftm.br.a(dne.eb, $$0, this.k));
      fsz $$5 = b(ftm.bp.a(dne.eb, "_off", $$1, this.k));
      this.i.accept(ftd.a(dne.eb).a(a(ebu.u, $$4, $$5)).a(p));
      this.c(dne.ea);
   }

   private void aj() {
      this.b(dac.mo);
      this.i.accept(ftd.a(dne.ey).a(fte.a(ebu.aD, ebu.v, ebu.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(ftn.a(dne.ey, $$3.toString()));
      })).a(q));
   }

   private void ak() {
      this.b(dac.de);
      this.i
         .accept(
            ftd.a(dne.nB)
               .a(
                  fte.a(ebu.aV, ebu.I)
                     .a(1, false, b(a(ftk.a("dead_sea_pickle"))))
                     .a(2, false, b(a(ftk.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(ftk.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(ftk.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(ftk.a("sea_pickle"))))
                     .a(2, true, b(a(ftk.a("two_sea_pickles"))))
                     .a(3, true, b(a(ftk.a("three_sea_pickles"))))
                     .a(4, true, b(a(ftk.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      ftn $$0 = ftn.a(dne.ed);
      fsz $$1 = b(ftm.c.a(dne.ef, $$0, this.k));
      this.i.accept(ftd.a(dne.ed).a(fte.a(ebu.aI).a($$1x -> $$1x < 8 ? b(ftk.a(dne.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dne.ed, ftk.a(dne.ed, "_height2"));
      this.i.accept(a(dne.ef, $$1));
   }

   private void am() {
      this.i.accept(ftd.a(dne.oI, b(ftk.a(dne.oI))).a(r));
   }

   private void an() {
      ali $$0 = ftp.a.create(dne.pG, this.k);
      this.a(dne.pG, $$0);
      this.i.accept(ftd.a(dne.pG).a(fte.a(ebu.bm).a($$0x -> b(this.a(dne.pG, "_" + $$0x.c(), ftm.c, ftn::b)))));
   }

   private void ao() {
      Map<ecp, ali> $$0 = new HashMap<>();

      for (ecp $$1 : ecp.values()) {
         $$0.put($$1, this.a(dne.pI, "_" + $$1.c(), ftm.c, ftn::b));
      }

      this.i.accept(ftd.a(dne.pI).a(fte.a(ebu.bF).a($$1x -> b($$0.get($$1x)))));
      this.j.a(dac.pa, fti.a(dvw.b, fti.a($$0.get(ecp.a)), Map.of(ecp.c, fti.a($$0.get(ecp.c)), ecp.b, fti.a($$0.get(ecp.b)), ecp.d, fti.a($$0.get(ecp.d)))));
   }

   private void ap() {
      this.b(dac.xG);
      this.i.accept(ftd.a(dne.oO).a(fte.a(ebu.av).a($$0 -> b(this.a(dne.oO, "_stage" + $$0, ftm.ao, ftn::c)))));
   }

   private void aq() {
      this.b(dac.qg);
      this.i
         .accept(
            ftd.a(dne.gh)
               .a(
                  fte.a(ebu.a, ebu.O, ebu.N, ebu.P, ebu.Q)
                     .a(false, false, false, false, false, b(ftk.a(dne.gh, "_ns")))
                     .a(false, true, false, false, false, b(ftk.a(dne.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(ftk.a(dne.gh, "_n")))
                     .a(false, false, false, true, false, b(ftk.a(dne.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(ftk.a(dne.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(ftk.a(dne.gh, "_ne")))
                     .a(false, true, false, true, false, b(ftk.a(dne.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(ftk.a(dne.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(ftk.a(dne.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(ftk.a(dne.gh, "_ns")))
                     .a(false, true, false, false, true, b(ftk.a(dne.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(ftk.a(dne.gh, "_nse")))
                     .a(false, true, false, true, true, b(ftk.a(dne.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(ftk.a(dne.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(ftk.a(dne.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(ftk.a(dne.gh, "_nsew")))
                     .a(true, false, false, false, false, b(ftk.a(dne.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(ftk.a(dne.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(ftk.a(dne.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(ftk.a(dne.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(ftk.a(dne.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(ftk.a(dne.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(ftk.a(dne.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(ftk.a(dne.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(ftk.a(dne.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(ftk.a(dne.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(ftk.a(dne.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(ftk.a(dne.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(ftk.a(dne.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(ftk.a(dne.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(ftk.a(dne.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(ftk.a(dne.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dne.gg);
      this.i.accept(ftd.a(dne.gg).a(fte.a(ebu.a, ebu.A).a(($$0, $$1) -> b(ftk.a(dne.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(r));
   }

   private gtw a(int $$0, String $$1, ftn $$2) {
      return switch ($$0) {
         case 1 -> a(ftm.bw.a(ftk.a($$1 + "turtle_egg"), $$2, this.k));
         case 2 -> a(ftm.bx.a(ftk.a("two_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 3 -> a(ftm.by.a(ftk.a("three_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 4 -> a(ftm.bz.a(ftk.a("four_" + $$1 + "turtle_eggs"), $$2, this.k));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gtw a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", ftn.b(ftn.J(dne.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", ftn.b(ftn.a(dne.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", ftn.b(ftn.a(dne.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(dac.kT);
      this.i.accept(ftd.a(dne.mL).a(fte.a(ebu.aG, ebu.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      this.b(dac.kU);
      this.i.accept(ftd.a(dne.mM).a(fte.a(duu.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         ftn $$2 = ftn.a($$1);
         return b(ftm.bH.a(dne.mM, $$1, $$2, this.k));
      })));
   }

   private void J(dnc $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dnc $$0, czu $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends ech<?>> Map<T, gtx> a(ebg<?, ?> $$0, Function<jb, T> $$1) {
      Builder<T, gtx> $$2 = ImmutableMap.builderWithExpectedSize(u.size());
      u.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dnc $$0) {
      Map<ech<Boolean>, gtx> $$1 = a($$0.m(), dsi::b);
      ftb $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      fsz $$3 = b(ftk.a($$0));
      ftc $$4 = ftc.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.i.accept($$4);
   }

   private void L(dnc $$0) {
      Map<ech<ecr>, gtx> $$1 = a($$0.m(), dsg::a);
      ftb $$2 = b().a(dsg.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, ecr.a));
      fsz $$3 = b(ftp.j.create($$0, this.k));
      fsz $$4 = b(ftp.k.get($$0).a($$1x -> $$1x.a(fto.i, ftn.a($$0, "_side_tall"))).a($$0, "_side_tall", this.k));
      fsz $$5 = b(ftp.k.get($$0).a($$1x -> $$1x.a(fto.i, ftn.a($$0, "_side_small"))).a($$0, "_side_small", this.k));
      ftc $$6 = ftc.a($$0);
      $$6.a(b().a(dsg.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, ecr.c), $$4.a($$5x));
         $$6.a(b().a($$4x, ecr.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.i.accept($$6);
   }

   private void M(dnc $$0) {
      this.c($$0);
      this.i.accept(ftd.a($$0).a(fte.a(dqx.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         ftn $$3 = ftn.c(ftn.a($$0, $$2));
         return b(fsu.d.b.a().a($$0, $$2, $$3, this.k));
      })));
   }

   private void au() {
      ali $$0 = ftn.a(dne.rC, "_bottom");
      ftn $$1 = new ftn().a(fto.e, $$0).a(fto.f, ftn.a(dne.rC, "_top")).a(fto.i, ftn.a(dne.rC, "_side"));
      ftn $$2 = new ftn().a(fto.e, $$0).a(fto.f, ftn.a(dne.rC, "_top_bloom")).a(fto.i, ftn.a(dne.rC, "_side_bloom"));
      ali $$3 = ftm.n.a(dne.rC, $$1, this.k);
      fsz $$4 = b($$3);
      fsz $$5 = b(ftm.n.a(dne.rC, "_bloom", $$2, this.k));
      this.i.accept(ftd.a(dne.rC).a(fte.a(ebu.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dne.rC, $$3);
   }

   private void av() {
      dnc $$0 = dne.cw;
      fsz $$1 = b(ftk.a($$0));
      ftc $$2 = ftc.a($$0);
      List.of(Pair.of(jb.c, a), Pair.of(jb.f, f), Pair.of(jb.d, g), Pair.of(jb.e, h)).forEach($$2x -> {
         jb $$3 = (jb)$$2x.getFirst();
         gtx $$4 = (gtx)$$2x.getSecond();
         gua $$5 = b().a(ebu.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.i.accept($$2);
      this.a($$0, ftk.a($$0, "_inventory"));
      v.clear();
   }

   private void a(ftc $$0, gua $$1, gtx $$2) {
      List.of(
            Pair.of(ebu.bs, ftm.aT),
            Pair.of(ebu.bt, ftm.aU),
            Pair.of(ebu.bu, ftm.aV),
            Pair.of(ebu.bv, ftm.aW),
            Pair.of(ebu.bw, ftm.aX),
            Pair.of(ebu.bx, ftm.aY)
         )
         .forEach($$3 -> {
            ebv $$4 = (ebv)$$3.getFirst();
            ftl $$5 = (ftl)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(ftc $$0, gua $$1, gtx $$2, ebv $$3, ftl $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      ftn $$7 = new ftn().a(fto.b, ftn.a(dne.cw, $$6));
      fsu.c $$8 = new fsu.c($$4, $$6);
      fsz $$9 = b(v.computeIfAbsent($$8, $$3x -> $$4.a(dne.cw, $$6, $$7, this.k)));
      $$0.a(new gtz(gtz.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void aw() {
      fsz $$0 = b(ftm.c.a(dne.lp, ftn.b(ftk.a("magma")), this.k));
      this.i.accept(a(dne.lp, $$0));
   }

   private void a(dnc $$0, @Nullable cyw $$1) {
      this.r($$0);
      czu $$2 = $$0.h();
      ali $$3 = ftm.bO.a($$2, ftn.x($$0), this.k);
      hhp.b $$4 = $$1 != null ? fti.a($$3, new hkc.a($$1)) : fti.a($$3, new hkc.a());
      this.j.a($$2, $$4);
   }

   private void c(dnc $$0, dnc $$1, fsu.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ax() {
      ali $$0 = ftk.a(dne.b);
      gtw $$1 = a($$0);
      gtw $$2 = a(ftk.a(dne.b, "_mirrored"));
      this.i.accept(ftd.a(dne.ff, a($$1, $$2)));
      this.a(dne.ff, $$0);
   }

   private void ay() {
      ali $$0 = ftk.a(dne.tt);
      gtw $$1 = a($$0);
      gtw $$2 = a(ftk.a(dne.tt, "_mirrored"));
      this.i.accept(ftd.a(dne.tN, a($$1, $$2)).a(c()));
      this.a(dne.tN, $$0);
   }

   private void n(dnc $$0, dnc $$1) {
      this.a($$0, fsu.d.b);
      ftn $$2 = ftn.d(ftn.a($$0, "_pot"));
      fsz $$3 = b(fsu.d.b.b().a($$1, $$2, this.k));
      this.i.accept(a($$1, $$3));
   }

   private void az() {
      ali $$0 = ftn.a(dne.pT, "_bottom");
      ali $$1 = ftn.a(dne.pT, "_top_off");
      ali $$2 = ftn.a(dne.pT, "_top");
      ali[] $$3 = new ali[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         ftn $$5 = new ftn().a(fto.e, $$0).a(fto.f, $$4 == 0 ? $$1 : $$2).a(fto.i, ftn.a(dne.pT, "_side" + $$4));
         $$3[$$4] = ftm.n.a(dne.pT, "_" + $$4, $$5, this.k);
      }

      this.i.accept(ftd.a(dne.pT).a(fte.a(ebu.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dne.pT, $$3[0]);
   }

   private static gtx a(jd $$0) {
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
      ali $$0 = ftn.a(dne.pH, "_top");
      ali $$1 = ftn.a(dne.pH, "_bottom");
      ali $$2 = ftn.a(dne.pH, "_side");
      ali $$3 = ftn.a(dne.pH, "_lock");
      ftn $$4 = new ftn().a(fto.o, $$2).a(fto.m, $$2).a(fto.l, $$2).a(fto.c, $$0).a(fto.j, $$0).a(fto.k, $$1).a(fto.n, $$3);
      this.i.accept(ftd.a(dne.pH, b(ftm.b.a(dne.pH, $$4, this.k))).a(fte.b(ebu.W).a(fsu::a)));
   }

   private void aB() {
      dnc $$0 = dne.n;
      fsz $$1 = b(ftk.a($$0));
      ftn $$2 = ftn.a($$0);
      dnc $$3 = dne.kk;
      fsz $$4 = b(ftm.ab.a($$3, $$2, this.k));
      fsz $$5 = b(ftm.ac.a($$3, $$2, this.k));
      this.i.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dnc $$0, dnc $$1, duo.a $$2, ali $$3) {
      fsz $$4 = b(ftk.a("skull"));
      this.i.accept(a($$0, $$4));
      this.i.accept(a($$1, $$4));
      this.j.a($$0.h(), fti.a($$3, new hkd.a($$2)));
   }

   private void aC() {
      ali $$0 = ftk.b("template_skull");
      this.a(dne.hn, dne.ho, duo.b.g, $$0);
      this.a(dne.hl, dne.hm, duo.b.e, $$0);
      this.a(dne.hj, dne.hk, duo.b.f, $$0);
      this.a(dne.hf, dne.hg, duo.b.c, $$0);
      this.a(dne.hh, dne.hi, duo.b.d, $$0);
      this.a(dne.hr, dne.hs, duo.b.h, $$0);
      this.a(dne.hp, dne.hq, duo.b.i, ftk.a(dac.vA));
   }

   private void a(dnc $$0, dnc $$1, cyw $$2) {
      fsz $$3 = b(ftk.a("banner"));
      ali $$4 = ftk.b("template_banner");
      this.i.accept(a($$0, $$3));
      this.i.accept(a($$1, $$3));
      czu $$5 = $$0.h();
      this.j.a($$5, fti.a($$4, new hju.a($$2)));
   }

   private void aD() {
      this.a(dne.jl, dne.jB, cyw.a);
      this.a(dne.jm, dne.jC, cyw.b);
      this.a(dne.jn, dne.jD, cyw.c);
      this.a(dne.jo, dne.jE, cyw.d);
      this.a(dne.jp, dne.jF, cyw.e);
      this.a(dne.jq, dne.jG, cyw.f);
      this.a(dne.jr, dne.jH, cyw.g);
      this.a(dne.js, dne.jI, cyw.h);
      this.a(dne.jt, dne.jJ, cyw.i);
      this.a(dne.ju, dne.jK, cyw.j);
      this.a(dne.jv, dne.jL, cyw.k);
      this.a(dne.jw, dne.jM, cyw.l);
      this.a(dne.jx, dne.jN, cyw.m);
      this.a(dne.jy, dne.jO, cyw.n);
      this.a(dne.jz, dne.jP, cyw.o);
      this.a(dne.jA, dne.jQ, cyw.p);
   }

   private void a(dnc $$0, dnc $$1, ali $$2, boolean $$3) {
      this.a($$0, $$1);
      czu $$4 = $$0.h();
      ali $$5 = ftm.bQ.a($$4, ftn.x($$1), this.k);
      hhp.b $$6 = fti.a($$5, new hjw.a($$2));
      if ($$3) {
         hhp.b $$7 = fti.a($$5, new hjw.a(hjw.a));
         this.j.a($$4, fti.b($$7, $$6));
      } else {
         this.j.a($$4, $$6);
      }
   }

   private void aE() {
      this.a(dne.cG, dne.n, hjw.b, true);
      this.a(dne.hw, dne.n, hjw.c, true);
      this.a(dne.gf, dne.cy, hjw.d, false);
   }

   private void b(dnc $$0, dnc $$1, cyw $$2) {
      fsz $$3 = b(ftk.a("bed"));
      this.i.accept(a($$0, $$3));
      czu $$4 = $$0.h();
      ali $$5 = ftm.bP.a(ftk.a($$4), ftn.x($$1), this.k);
      this.j.a($$4, fti.a($$5, new hjv.a($$2)));
   }

   private void aF() {
      this.b(dne.bg, dne.bK, cyw.a);
      this.b(dne.bh, dne.bL, cyw.b);
      this.b(dne.bi, dne.bM, cyw.c);
      this.b(dne.bj, dne.bN, cyw.d);
      this.b(dne.bk, dne.bO, cyw.e);
      this.b(dne.bl, dne.bP, cyw.f);
      this.b(dne.bm, dne.bQ, cyw.g);
      this.b(dne.bn, dne.bR, cyw.h);
      this.b(dne.bo, dne.bS, cyw.i);
      this.b(dne.bp, dne.bT, cyw.j);
      this.b(dne.bq, dne.bU, cyw.k);
      this.b(dne.br, dne.bV, cyw.l);
      this.b(dne.bs, dne.bW, cyw.m);
      this.b(dne.bt, dne.bX, cyw.n);
      this.b(dne.bu, dne.bY, cyw.o);
      this.b(dne.bv, dne.bZ, cyw.p);
   }

   private void a(dnc $$0, hke.a $$1) {
      czu $$2 = $$0.h();
      ali $$3 = ftk.a($$2);
      this.j.a($$2, fti.a($$3, $$1));
   }

   public void a() {
      mj.a().filter(mk::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dne.rN).a(mj.x).a(dne.rN, dne.sl).a(dne.rR, dne.rV).a(mj.z);
      this.i(dne.rM).a(mj.B).a(dne.rM, dne.sk).a(dne.rQ, dne.rU).a(mj.D);
      this.i(dne.rL).a(mj.F).a(dne.rL, dne.sj).a(dne.rP, dne.rT).a(mj.H);
      this.i(dne.rK).a(mj.J).a(dne.rK, dne.si).a(dne.rO, dne.rS).a(mj.L);
      this.A(dne.sS);
      this.A(dne.sT);
      this.A(dne.sU);
      this.A(dne.sV);
      this.j(dne.sS, dne.sW);
      this.j(dne.sT, dne.sX);
      this.j(dne.sU, dne.sY);
      this.j(dne.sV, dne.sZ);
      this.n(dne.a);
      this.d(dne.nI, dne.a);
      this.d(dne.nH, dne.a);
      this.n(dne.gn);
      this.n(dne.eg);
      this.d(dne.nJ, dne.J);
      this.n(dne.fZ);
      this.n(dne.mK);
      this.n(dne.fQ);
      this.n(dne.gq);
      this.b(dac.vo);
      this.n(dne.pO);
      this.n(dne.J);
      this.n(dne.K);
      this.n(dne.ix);
      this.b(dac.go);
      this.o(dne.qu, dne.qL);
      this.o(dne.qv, dne.qM);
      this.o(dne.qw, dne.qN);
      this.o(dne.qx, dne.qO);
      this.o(dne.qy, dne.qP);
      this.o(dne.qz, dne.qQ);
      this.o(dne.qA, dne.qR);
      this.o(dne.qB, dne.qS);
      this.o(dne.qC, dne.qT);
      this.o(dne.qD, dne.qU);
      this.o(dne.qE, dne.qV);
      this.o(dne.qF, dne.qW);
      this.o(dne.qG, dne.qX);
      this.o(dne.qH, dne.qY);
      this.o(dne.qI, dne.qZ);
      this.o(dne.qJ, dne.ra);
      this.o(dne.qt, dne.qK);
      this.n(dne.nG);
      this.n(dne.gS);
      this.n(dne.rx);
      this.n(dne.tf);
      this.w(dne.tg);
      this.w(dne.th);
      this.x(dne.tS);
      this.x(dne.tT);
      this.ag();
      this.h(dne.tm, dne.ti);
      this.L(dne.uf);
      this.M(dne.ug);
      this.a(dne.ue);
      this.t(dne.tj);
      this.t(dne.tk);
      this.s(dne.tl);
      this.b(dne.ul, fsu.d.c);
      this.b(dac.da);
      this.a(dne.iy, dac.if);
      this.b(dac.if);
      this.aG();
      this.a(dne.lt, dac.jF);
      this.b(dac.jF);
      this.b(dne.ca, ftn.a(dne.bI, "_side"));
      this.a(dne.U);
      this.a(dne.V);
      this.a(dne.jd);
      this.a(dne.cI);
      this.a(dne.cJ);
      this.a(dne.cK);
      this.a(dne.gd);
      this.a(dne.ge);
      this.a(dne.gi);
      this.a(dne.Q);
      this.a(dne.W);
      this.a(dne.R);
      this.a(dne.cr);
      this.a(dne.S);
      this.a(dne.T);
      this.a(dne.cs);
      this.b(dne.pR, ftp.d);
      this.a(dne.pQ);
      this.a(dne.aY);
      this.a(dne.aZ);
      this.a(dne.ba);
      this.a(dne.fG);
      this.a(dne.hC);
      this.a(dne.dY);
      this.a(dne.dZ);
      this.a(dne.hB);
      this.a(dne.qk);
      this.a(dne.nC);
      this.a(dne.ei);
      this.a(dne.k);
      this.a(dne.pS);
      this.a(dne.fY);
      this.a(dne.et);
      this.a(dne.O);
      this.a(dne.pP);
      this.a(dne.ee);
      this.b(dne.ek, ftp.g);
      this.b(dne.pY, ftp.d);
      this.b(dne.fs, ftp.d);
      this.n(dne.ag);
      this.n(dne.gA);
      this.a(dne.lq);
      this.a(dne.bf);
      this.a(dne.je);
      this.a(dne.cy);
      this.a(dne.qs);
      this.a(dne.iK);
      this.a(dne.pe);
      this.a(dne.en);
      this.a(dne.eo);
      this.b(dne.cD, ftp.b);
      this.g(dne.cE);
      this.a(dne.aV);
      this.b(dne.bG, ftp.z);
      this.b(dac.dd);
      this.b(dne.cu, ftp.f);
      this.b(dne.pL, ftp.d);
      this.a(dne.oV);
      this.a(dne.aW);
      this.a(dne.rb);
      this.a(dne.rc);
      this.a(dne.rv);
      this.a(dne.tc);
      this.a(dne.tP);
      this.a(dne.tQ);
      this.a(dne.tR);
      this.d(dne.rA);
      this.n(dne.ud);
      this.aB();
      this.a(dne.rI);
      this.a(dne.rJ);
      this.a(dne.rE);
      this.a(dne.rF);
      this.a(dne.rG);
      this.a(dne.rH);
      this.l(dne.rE, dne.se);
      this.l(dne.rF, dne.sg);
      this.l(dne.rG, dne.sf);
      this.l(dne.rH, dne.sh);
      this.j(dne.su);
      this.j(dne.sv);
      this.j(dne.sx);
      this.j(dne.sw);
      this.b(dne.su, dne.sy);
      this.b(dne.sv, dne.sz);
      this.b(dne.sx, dne.sB);
      this.b(dne.sw, dne.sA);
      this.l(dne.sC);
      this.l(dne.sD);
      this.l(dne.sF);
      this.l(dne.sE);
      this.c(dne.sC, dne.sG);
      this.c(dne.sD, dne.sH);
      this.c(dne.sF, dne.sJ);
      this.c(dne.sE, dne.sI);
      this.a(dne.sK);
      this.a(dne.sL);
      this.a(dne.sM);
      this.a(dne.sN);
      this.l(dne.sK, dne.sO);
      this.l(dne.sL, dne.sP);
      this.l(dne.sM, dne.sQ);
      this.l(dne.sN, dne.sR);
      this.k(dne.hx, dne.cr);
      this.k(dne.hy, dne.cs);
      this.D();
      this.o();
      this.av();
      this.s();
      this.t();
      this.a(dne.oM, dne.oN);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dne.kZ);
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
      this.a(dne.pJ);
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.d();
      this.J(dne.fy);
      this.J(dne.rB);
      this.b(dne.fz, dac.gt);
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
      this.I(dne.da);
      this.c(dne.da);
      this.I(dne.oG);
      this.e();
      this.I(dne.to);
      this.m(dne.cz, dne.cA);
      this.m(dne.er, dne.es);
      this.a(dne.cL, dne.n, ftn::c);
      this.a(dne.oE, dne.p, ftn::d);
      this.C(dne.pc);
      this.C(dne.oT);
      this.z(dne.bb);
      this.z(dne.hJ);
      this.z();
      this.H(dne.oK);
      this.H(dne.oL);
      this.c(dne.fp, b(ftk.a(dne.fp)));
      this.a(dne.ep, ftp.d);
      this.a(dne.eq, ftp.d);
      this.a(dne.tO);
      this.a(dne.ls, ftp.d);
      this.e(dne.j);
      this.e(dne.tr);
      this.e(dne.L);
      this.f(dne.M);
      this.f(dne.P);
      this.e(dne.N);
      this.d(dne.I);
      this.b(dne.tY, ftp.f);
      this.a(dne.iL, ftp.d, ftp.e);
      this.a(dne.ld, ftp.A, ftp.B);
      this.a(dne.hG, ftp.A, ftp.B);
      this.a(dne.tU, ftp.d, ftp.e);
      this.a(dne.tV, ftp.d, ftp.e);
      this.a(dne.tW, ftp.d, ftp.e);
      this.c(dne.oz, ftp.i);
      this.w();
      this.a(dne.pM, ftn::D);
      this.a(dne.pN, ftn::F);
      this.a(dne.lj, ebu.av, 0, 1, 2, 3);
      this.a(dne.gT, ebu.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dne.fP, ebu.av, 0, 1, 1, 2);
      this.a(dne.gU, ebu.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dne.cM, ebu.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dne.lg, fsu.d.b, ebu.at, 0, 1);
      this.g();
      this.f();
      this.aD();
      this.aF();
      this.aC();
      this.aE();
      this.a(dne.lv, null);
      this.a(dne.lw, cyw.a);
      this.a(dne.lx, cyw.b);
      this.a(dne.ly, cyw.c);
      this.a(dne.lz, cyw.d);
      this.a(dne.lA, cyw.e);
      this.a(dne.lB, cyw.f);
      this.a(dne.lC, cyw.g);
      this.a(dne.lD, cyw.h);
      this.a(dne.lE, cyw.i);
      this.a(dne.lF, cyw.j);
      this.a(dne.lG, cyw.k);
      this.a(dne.lH, cyw.l);
      this.a(dne.lI, cyw.m);
      this.a(dne.lJ, cyw.n);
      this.a(dne.lK, cyw.o);
      this.a(dne.lL, cyw.p);
      this.r(dne.nD);
      this.a(dne.nD, new hjx.a());
      this.a(dne.tZ, dne.jc);
      this.a(dne.tZ, new hjy.a());
      this.a(dne.fW, dne.cy);
      this.a(dne.ll, dne.cy);
      this.a(dne.aT);
      this.a(dne.aU);
      this.a(dne.mc);
      this.a(dne.md);
      this.a(dne.me);
      this.a(dne.mf);
      this.a(dne.mg);
      this.a(dne.mh);
      this.a(dne.mi);
      this.a(dne.mj);
      this.a(dne.mk);
      this.a(dne.ml);
      this.a(dne.mm);
      this.a(dne.mn);
      this.a(dne.mo);
      this.a(dne.mp);
      this.a(dne.mq);
      this.a(dne.mr);
      this.a(ftp.a, dne.ms, dne.mt, dne.mu, dne.mv, dne.mw, dne.mx, dne.my, dne.mz, dne.mA, dne.mB, dne.mC, dne.mD, dne.mE, dne.mF, dne.mG, dne.mH);
      this.a(dne.jc);
      this.a(dne.hK);
      this.a(dne.hL);
      this.a(dne.hM);
      this.a(dne.hN);
      this.a(dne.hO);
      this.a(dne.hP);
      this.a(dne.hQ);
      this.a(dne.hR);
      this.a(dne.hS);
      this.a(dne.hT);
      this.a(dne.hU);
      this.a(dne.hV);
      this.a(dne.hW);
      this.a(dne.hX);
      this.a(dne.hY);
      this.a(dne.hZ);
      this.a(dne.rw);
      this.i(dne.aX, dne.fq);
      this.i(dne.ez, dne.ia);
      this.i(dne.eA, dne.ib);
      this.i(dne.eB, dne.ic);
      this.i(dne.eC, dne.id);
      this.i(dne.eD, dne.ie);
      this.i(dne.eE, dne.if);
      this.i(dne.eF, dne.ig);
      this.i(dne.eG, dne.ih);
      this.i(dne.eH, dne.ii);
      this.i(dne.eI, dne.ij);
      this.i(dne.eJ, dne.ik);
      this.i(dne.eK, dne.il);
      this.i(dne.eL, dne.im);
      this.i(dne.eM, dne.in);
      this.i(dne.eN, dne.io);
      this.i(dne.eO, dne.ip);
      this.b(ftp.t, dne.lM, dne.lN, dne.lO, dne.lP, dne.lQ, dne.lR, dne.lS, dne.lT, dne.lU, dne.lV, dne.lW, dne.lX, dne.lY, dne.lZ, dne.ma, dne.mb);
      this.h(dne.bK, dne.iM);
      this.h(dne.bL, dne.iN);
      this.h(dne.bM, dne.iO);
      this.h(dne.bN, dne.iP);
      this.h(dne.bO, dne.iQ);
      this.h(dne.bP, dne.iR);
      this.h(dne.bQ, dne.iS);
      this.h(dne.bR, dne.iT);
      this.h(dne.bS, dne.iU);
      this.h(dne.bT, dne.iV);
      this.h(dne.bU, dne.iW);
      this.h(dne.bV, dne.iX);
      this.h(dne.bW, dne.iY);
      this.h(dne.bX, dne.iZ);
      this.h(dne.bY, dne.ja);
      this.h(dne.bZ, dne.jb);
      this.a(dne.ts);
      this.a(dne.fd);
      this.b(dne.bB, dne.gB, fsu.d.a);
      this.h(dne.bB);
      this.a(dne.cb, dne.gC, fsu.d.b);
      this.a(dne.cd, dne.gD, fsu.d.b);
      this.a(dne.uh, dne.uj, fsu.d.c);
      this.a(dne.ui, dne.uk, fsu.d.b);
      this.a(dne.ce, dne.gE, fsu.d.b);
      this.a(dne.cf, dne.gF, fsu.d.b);
      this.a(dne.cg, dne.gG, fsu.d.b);
      this.a(dne.ch, dne.gH, fsu.d.b);
      this.a(dne.ci, dne.gI, fsu.d.b);
      this.a(dne.cj, dne.gJ, fsu.d.b);
      this.a(dne.ck, dne.gK, fsu.d.b);
      this.a(dne.cl, dne.gL, fsu.d.b);
      this.a(dne.cm, dne.gM, fsu.d.b);
      this.a(dne.co, dne.gN, fsu.d.b);
      this.a(dne.cn, dne.gO, fsu.d.b);
      this.a(dne.cq, dne.gP, fsu.d.b);
      this.a(dne.cp, dne.gQ, fsu.d.b);
      this.a(dne.bC, dne.gR, fsu.d.b);
      this.a(dne.cc, dne.gr, fsu.d.b);
      this.E();
      this.y(dne.fl);
      this.y(dne.fm);
      this.y(dne.fn);
      this.b(dne.bA, fsu.d.a);
      this.h(dne.bA);
      this.a(dne.bE, fsu.d.b);
      this.a(dne.bF, fsu.d.b);
      this.b(dne.bD, fsu.d.a);
      this.h(dne.bD);
      this.b(dne.ej, fsu.d.a);
      this.b(dac.dW);
      this.c(dne.mI, dne.mJ, fsu.d.b);
      this.b(dac.dX);
      this.b(dne.tq, fsu.d.b);
      this.c(dne.pf, dne.pg, fsu.d.b);
      this.c(dne.ph, dne.pi, fsu.d.b);
      this.a(dne.pf, "_plant");
      this.a(dne.ph, "_plant");
      this.a(dne.nE, fsu.d.a, ftn.c(ftn.a(dne.nF, "_stage0")));
      this.k();
      this.a(dne.eh, fsu.d.b);
      this.a(dne.bz, fsu.d.b);
      this.d(dne.jg, fsu.d.b);
      this.d(dne.jh, fsu.d.b);
      this.d(dne.ji, fsu.d.b);
      this.o(dne.jj);
      this.o(dne.jk);
      this.h();
      this.i();
      this.j();
      this.a(dne.nc, dne.mX, dne.mS, dne.mN, dne.nm, dne.nh, dne.nw, dne.nr);
      this.a(dne.nd, dne.mY, dne.mT, dne.mO, dne.nn, dne.ni, dne.nx, dne.ns);
      this.a(dne.ne, dne.mZ, dne.mU, dne.mP, dne.no, dne.nj, dne.ny, dne.nt);
      this.a(dne.nf, dne.na, dne.mV, dne.mQ, dne.np, dne.nk, dne.nz, dne.nu);
      this.a(dne.ng, dne.nb, dne.mW, dne.mR, dne.nq, dne.nl, dne.nA, dne.nv);
      this.f(dne.fw, dne.fu);
      this.f(dne.fv, dne.ft);
      this.m(dne.af).c(dne.af).a(dne.aA);
      this.m(dne.ar).c(dne.ar).a(dne.aJ);
      this.a(dne.ar, dne.dx, dne.dH);
      this.a(dne.aS, ftp.w, -7158200);
      this.m(dne.ab).c(dne.ab).a(dne.ax);
      this.m(dne.am).c(dne.am).a(dne.aF);
      this.a(dne.am, dne.dq, dne.dC);
      this.a(dne.D, dne.gw, fsu.d.b);
      this.a(dne.aO, ftp.w, -12012264);
      this.m(dne.ac).d(dne.ac).a(dne.ay);
      this.m(dne.an).d(dne.an).a(dne.aG);
      this.a(dne.an, dne.dr, dne.dD);
      this.a(dne.E, dne.gx, fsu.d.b);
      this.b(dne.aP, ftp.w);
      this.m(dne.Z).c(dne.Z).a(dne.av);
      this.m(dne.ak).c(dne.ak).a(dne.aD);
      this.a(dne.ak, dne.dp, dne.dB);
      this.a(dne.B, dne.gu, fsu.d.b);
      this.a(dne.aM, ftp.w, -8345771);
      this.m(dne.X).c(dne.X).a(dne.at);
      this.m(dne.aq).c(dne.aq).a(dne.aB);
      this.a(dne.aq, dne.dn, dne.dz);
      this.a(dne.z, dne.gs, fsu.d.b);
      this.a(dne.aK, ftp.w, -12012264);
      this.m(dne.Y).c(dne.Y).a(dne.au);
      this.m(dne.aj).c(dne.aj).a(dne.aC);
      this.a(dne.aj, dne.do, dne.dA);
      this.a(dne.A, dne.gt, fsu.d.b);
      this.a(dne.aL, ftp.w, -10380959);
      this.m(dne.ad).c(dne.ad).a(dne.az);
      this.m(dne.ao).c(dne.ao).a(dne.aH);
      this.a(dne.ao, dne.dt, dne.dF);
      this.a(dne.F, dne.gy, fsu.d.b);
      this.a(dne.aQ, ftp.w, -12012264);
      this.m(dne.ae).c(dne.ae).a(dne.u);
      this.m(dne.ap).c(dne.ap).a(dne.aI);
      this.a(dne.ap, dne.du, dne.dG);
      this.a(dne.G, dne.gz, fsu.d.b);
      this.b(dne.aR, ftp.w);
      this.m(dne.aa).c(dne.aa).a(dne.aw);
      this.m(dne.al).c(dne.al).a(dne.aE);
      this.a(dne.al, dne.ds, dne.dE);
      this.a(dne.C, dne.gv, fsu.d.b);
      this.a(dne.aN, ftp.w, -12012264);
      this.m(dne.oY).b(dne.oY).a(dne.pa);
      this.m(dne.oZ).b(dne.oZ).a(dne.pb);
      this.a(dne.oZ, dne.dv, dne.dI);
      this.a(dne.pd, dne.pU, fsu.d.b);
      this.n(dne.pj, dne.pW);
      this.m(dne.oP).b(dne.oP).a(dne.oR);
      this.m(dne.oQ).b(dne.oQ).a(dne.oS);
      this.a(dne.oQ, dne.dw, dne.dJ);
      this.a(dne.oU, dne.pV, fsu.d.b);
      this.n(dne.oW, dne.pX);
      this.m(dne.ai).d(dne.ai);
      this.m(dne.as).d(dne.as);
      this.a(dne.x, dne.dy, dne.dK);
      this.b(dne.oX, fsu.d.b);
      this.b(dac.dT);
      this.j(dne.dN);
      this.l(dne.iA);
      this.r();
      this.p(dne.db);
      this.q(dne.bw);
      this.q(dne.bx);
      this.q(dne.hI);
      this.q();
      this.u(dne.gm);
      this.u(dne.lm);
      this.u(dne.ln);
      this.v(dne.ht);
      this.v(dne.hu);
      this.v(dne.hv);
      this.l();
      this.m();
      this.d(dne.cO, ftp.h);
      this.d(dne.oC, ftp.h);
      this.d(dne.oB, ftp.i);
      this.p();
      this.az();
      this.au();
      this.l(dne.fc, dne.fk);
      this.l(dne.m, dne.fg);
      this.l(dne.fb, dne.fj);
      this.l(dne.fa, dne.fi);
      this.ax();
      this.l(dne.eZ, dne.fh);
      this.ay();
   }

   private void aG() {
      hhp.b $$0 = fti.a(this.a(dac.ig));
      Map<Integer, hhp.b> $$1 = new HashMap<>(16);
      fte.a<fsz, Integer> $$2 = fte.a(ebu.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         ali $$5 = ftn.a(dac.ig, $$4);
         $$2.a($$3, b(ftm.aa.a(dne.iz, $$4, ftn.h($$5), this.k)));
         hhp.b $$6 = fti.a(ftm.bI.a(ftk.a(dac.ig, $$4), ftn.k($$5), this.k));
         $$1.put($$3, $$6);
      }

      this.j.a(dac.ig, fti.a(drw.c, $$0, $$1));
      this.i.accept(ftd.a(dne.iz).a($$2));
   }

   private void o(dnc $$0, dnc $$1) {
      this.b($$0.h());
      ftn $$2 = ftn.b(ftn.J($$0));
      ftn $$3 = ftn.b(ftn.a($$0, "_lit"));
      fsz $$4 = b(ftm.bV.a($$0, "_one_candle", $$2, this.k));
      fsz $$5 = b(ftm.bW.a($$0, "_two_candles", $$2, this.k));
      fsz $$6 = b(ftm.bX.a($$0, "_three_candles", $$2, this.k));
      fsz $$7 = b(ftm.bY.a($$0, "_four_candles", $$2, this.k));
      fsz $$8 = b(ftm.bV.a($$0, "_one_candle_lit", $$3, this.k));
      fsz $$9 = b(ftm.bW.a($$0, "_two_candles_lit", $$3, this.k));
      fsz $$10 = b(ftm.bX.a($$0, "_three_candles_lit", $$3, this.k));
      fsz $$11 = b(ftm.bY.a($$0, "_four_candles_lit", $$3, this.k));
      this.i
         .accept(
            ftd.a($$0)
               .a(
                  fte.a(ebu.aC, ebu.u)
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
      fsz $$12 = b(ftm.bZ.a($$1, ftn.a($$0, false), this.k));
      fsz $$13 = b(ftm.bZ.a($$1, "_lit", ftn.a($$0, true), this.k));
      this.i.accept(ftd.a($$1).a(a(ebu.u, $$13, $$12)));
   }

   class a {
      private final ftn b;
      private final Map<ftl, ali> c = new HashMap<>();
      @Nullable
      private mk d;
      @Nullable
      private gtw e;
      private final Set<dnc> f = new HashSet<>();

      public a(final ftn $$0) {
         this.b = $$0;
      }

      public fsu.a a(dnc $$0, ftl $$1) {
         this.e = fsu.a($$1.a($$0, this.b, fsu.this.k));
         if (fsu.m.containsKey($$0)) {
            fsu.this.i.accept(fsu.m.get($$0).create($$0, this.e, this.b, fsu.this.k));
         } else {
            fsu.this.i.accept(fsu.a($$0, fsu.a(this.e)));
         }

         return this;
      }

      public fsu.a a(dnc $$0, dnc $$1) {
         ali $$2 = ftk.a($$0);
         fsu.this.i.accept(fsu.a($$1, fsu.b($$2)));
         fsu.this.j.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fsu.a a(dnc $$0) {
         fsz $$1 = fsu.b(ftm.s.a($$0, this.b, fsu.this.k));
         fsz $$2 = fsu.b(ftm.t.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$1, $$2));
         ali $$3 = ftm.u.a($$0, this.b, fsu.this.k);
         fsu.this.a($$0, $$3);
         return this;
      }

      public fsu.a b(dnc $$0) {
         fsz $$1 = fsu.b(ftm.M.a($$0, this.b, fsu.this.k));
         fsz $$2 = fsu.b(ftm.N.a($$0, this.b, fsu.this.k));
         fsz $$3 = fsu.b(ftm.O.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$1, $$2, $$3));
         ali $$4 = ftm.P.a($$0, this.b, fsu.this.k);
         fsu.this.a($$0, $$4);
         return this;
      }

      public fsu.a c(dnc $$0) {
         ftn $$1 = ftn.s($$0);
         fsz $$2 = fsu.b(ftm.D.a($$0, $$1, fsu.this.k));
         fsz $$3 = fsu.b(ftm.E.a($$0, $$1, fsu.this.k));
         fsz $$4 = fsu.b(ftm.F.a($$0, $$1, fsu.this.k));
         fsz $$5 = fsu.b(ftm.G.a($$0, $$1, fsu.this.k));
         fsz $$6 = fsu.b(ftm.H.a($$0, $$1, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$2, $$3, $$4, $$5, $$6));
         ali $$7 = ftm.I.a($$0, $$1, fsu.this.k);
         fsu.this.a($$0, $$7);
         return this;
      }

      public fsu.a d(dnc $$0) {
         fsz $$1 = fsu.b(ftm.J.a($$0, this.b, fsu.this.k));
         fsz $$2 = fsu.b(ftm.K.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.b($$0, $$1, $$2));
         ali $$3 = ftm.L.a($$0, this.b, fsu.this.k);
         fsu.this.a($$0, $$3);
         return this;
      }

      public fsu.a e(dnc $$0) {
         ftn $$1 = ftn.s($$0);
         fsz $$2 = fsu.b(ftm.R.a($$0, $$1, fsu.this.k));
         fsz $$3 = fsu.b(ftm.Q.a($$0, $$1, fsu.this.k));
         fsz $$4 = fsu.b(ftm.T.a($$0, $$1, fsu.this.k));
         fsz $$5 = fsu.b(ftm.S.a($$0, $$1, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fsu.a f(dnc $$0) {
         fsz $$1 = fsu.b(ftm.V.a($$0, this.b, fsu.this.k));
         fsz $$2 = fsu.b(ftm.U.a($$0, this.b, fsu.this.k));
         fsz $$3 = fsu.b(ftm.X.a($$0, this.b, fsu.this.k));
         fsz $$4 = fsu.b(ftm.W.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fsu.a g(dnc $$0) {
         fsz $$1 = fsu.b(ftm.Y.a($$0, this.b, fsu.this.k));
         fsz $$2 = fsu.b(ftm.Z.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.d($$0, $$1, $$2));
         return this;
      }

      public fsu.a h(dnc $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dnc $$1 = this.d.b().get(mk.b.r);
            fsz $$2 = fsu.b(ftm.aa.a($$0, this.b, fsu.this.k));
            fsu.this.i.accept(fsu.a($$0, $$2));
            fsu.this.i.accept(fsu.a($$1, $$2));
            fsu.this.b($$0.h());
            return this;
         }
      }

      public fsu.a i(dnc $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ali $$1 = this.a(ftm.ab, $$0);
            fsz $$2 = fsu.b(this.a(ftm.ac, $$0));
            fsu.this.i.accept(fsu.e($$0, fsu.b($$1), $$2, fsu.a(this.e)));
            fsu.this.a($$0, $$1);
            return this;
         }
      }

      public fsu.a j(dnc $$0) {
         fsz $$1 = fsu.b(this.a(ftm.af, $$0));
         ali $$2 = this.a(ftm.ae, $$0);
         fsz $$3 = fsu.b(this.a(ftm.ag, $$0));
         fsu.this.i.accept(fsu.b($$0, $$1, fsu.b($$2), $$3));
         fsu.this.a($$0, $$2);
         return this;
      }

      private fsu.a k(dnc $$0) {
         ftp $$1 = fsu.s.getOrDefault($$0, ftp.a.get($$0));
         fsz $$2 = fsu.b($$1.a($$0, fsu.this.k));
         fsu.this.i.accept(fsu.a($$0, $$2));
         return this;
      }

      private fsu.a l(dnc $$0) {
         fsu.this.j($$0);
         return this;
      }

      private void m(dnc $$0) {
         if (fsu.l.contains($$0)) {
            fsu.this.l($$0);
         } else {
            fsu.this.k($$0);
         }
      }

      private ali a(ftl $$0, dnc $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fsu.this.k));
      }

      public fsu.a a(mk $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fsu.a, dnc> $$2 = fsu.t.get($$0x);
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
      fta create(dnc var1, gtw var2, ftn var3, BiConsumer<ali, ftj> var4);
   }

   static record c(ftl a, String b) {
   }

   static enum d {
      a(ftm.ap, ftm.as, false),
      b(ftm.ao, ftm.ar, false),
      c(ftm.aq, ftm.at, true);

      private final ftl d;
      private final ftl e;
      private final boolean f;

      private d(final ftl $$0, final ftl $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public ftl a() {
         return this.d;
      }

      public ftl b() {
         return this.e;
      }

      public ali a(fsu $$0, dnc $$1) {
         czu $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public ftn a(dnc $$0) {
         return this.f ? ftn.e($$0) : ftn.c($$0);
      }

      public ftn b(dnc $$0) {
         return this.f ? ftn.g($$0) : ftn.f($$0);
      }
   }

   class e {
      private final ftn b;

      public e(final ftn $$0) {
         this.b = $$0;
      }

      public fsu.e a(dnc $$0) {
         ftn $$1 = this.b.c(fto.d, this.b.a(fto.i));
         ali $$2 = ftm.j.a($$0, $$1, fsu.this.k);
         fsu.this.i.accept(fsu.b($$0, fsu.b($$2)));
         fsu.this.a($$0, $$2);
         return this;
      }

      public fsu.e b(dnc $$0) {
         ali $$1 = ftm.j.a($$0, this.b, fsu.this.k);
         fsu.this.i.accept(fsu.b($$0, fsu.b($$1)));
         fsu.this.a($$0, $$1);
         return this;
      }

      public fsu.e c(dnc $$0) {
         ali $$1 = ftm.j.a($$0, this.b, fsu.this.k);
         fsz $$2 = fsu.b(ftm.k.a($$0, this.b, fsu.this.k));
         fsu.this.i.accept(fsu.c($$0, fsu.b($$1), $$2));
         fsu.this.a($$0, $$1);
         return this;
      }

      public fsu.e d(dnc $$0) {
         fsu.this.i.accept(fsu.a($$0, this.b, fsu.this.k));
         fsu.this.a($$0, ftm.j.a($$0, this.b, fsu.this.k));
         return this;
      }
   }
}
