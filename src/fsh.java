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

public class fsh {
   final Consumer<fsn> i;
   final fsk j;
   final BiConsumer<alr, fsw> k;
   static final List<dno> l = List.of(dnq.eP, dnq.eV, dnq.iA);
   public static final gtk a = $$0 -> $$0;
   public static final gtk b = gtk.d.withValue(true);
   public static final gtk c = gtk.a.withValue(i.b);
   public static final gtk d = gtk.a.withValue(i.c);
   public static final gtk e = gtk.a.withValue(i.d);
   public static final gtk f = gtk.b.withValue(i.b);
   public static final gtk g = gtk.b.withValue(i.c);
   public static final gtk h = gtk.b.withValue(i.d);
   private static final Function<fso, fso> m = $$0 -> $$0;
   private static final Function<fso, fso> n = $$0 -> $$0.a(ecg.U, 2, 3, 4);
   private static final Function<fso, fso> o = $$0 -> $$0.a(ecg.U, 3, 4);
   private static final Function<fso, fso> p = $$0 -> $$0.a(ecg.U, 4);
   private static final Function<fso, fso> q = $$0 -> $$0.a(ecg.V, 1);
   private static final Function<fso, fso> r = $$0 -> $$0.a(ecg.V, 2, 3);
   private static final Function<fso, fso> s = $$0 -> $$0.a(ecg.V, 3);
   private static final Function<fso, fso> t = $$0 -> $$0.a(ecg.V, 4);
   static final Map<dno, fsh.b> u = Map.of(dnq.b, fsh::a, dnq.tt, fsh::c, dnq.fe, fsh::b);
   private static final fsr<gtk> v = fsr.b(ecg.R).a(jc.a, c).a(jc.b, e).a(jc.c, a).a(jc.d, g).a(jc.e, h).a(jc.f, f);
   private static final fsr<gtk> w = fsr.b(ecg.R).a(jc.a, d).a(jc.b, a).a(jc.c, c).a(jc.d, c.then(g)).a(jc.e, c.then(h)).a(jc.f, c.then(f));
   private static final fsr<gtk> x = fsr.b(ecg.T).a(jc.f, a).a(jc.d, f).a(jc.e, g).a(jc.c, h);
   private static final fsr<gtk> y = fsr.b(ecg.T).a(jc.d, a).a(jc.e, f).a(jc.c, g).a(jc.f, h);
   private static final fsr<gtk> z = fsr.b(ecg.T).a(jc.f, f).a(jc.d, g).a(jc.e, h).a(jc.c, a);
   static final Map<dno, ftc> A = ImmutableMap.builder()
      .put(dnq.bc, ftc.C.get(dnq.bc))
      .put(dnq.jR, ftc.C.get(dnq.jR))
      .put(dnq.kv, ftc.a(fta.a(dnq.bc, "_top")))
      .put(dnq.kx, ftc.a(fta.a(dnq.jR, "_top")))
      .put(dnq.be, ftc.d.get(dnq.bc).a($$0 -> $$0.a(ftb.i, fta.J(dnq.be))))
      .put(dnq.jT, ftc.d.get(dnq.jR).a($$0 -> $$0.a(ftb.i, fta.J(dnq.jT))))
      .put(dnq.hE, ftc.d.get(dnq.hE))
      .put(dnq.kw, ftc.a(fta.a(dnq.hE, "_bottom")))
      .put(dnq.pZ, ftc.D.get(dnq.pZ))
      .put(dnq.tt, ftc.D.get(dnq.tt))
      .put(dnq.hF, ftc.d.get(dnq.hF).a($$0 -> $$0.a(ftb.i, fta.J(dnq.hF))))
      .put(dnq.bd, ftc.d.get(dnq.bd).a($$0 -> {
         $$0.a(ftb.d, fta.a(dnq.bc, "_top"));
         $$0.a(ftb.i, fta.J(dnq.bd));
      }))
      .put(dnq.jS, ftc.d.get(dnq.jS).a($$0 -> {
         $$0.a(ftb.d, fta.a(dnq.jR, "_top"));
         $$0.a(ftb.i, fta.J(dnq.jS));
      }))
      .put(dnq.ru, ftc.D.get(dnq.ru))
      .put(dnq.rp, ftc.D.get(dnq.rp))
      .build();
   static final Map<ml.b, BiConsumer<fsh.a, dno>> B = ImmutableMap.builder()
      .put(ml.b.a, fsh.a::a)
      .put(ml.b.e, fsh.a::l)
      .put(ml.b.b, fsh.a::k)
      .put(ml.b.c, fsh.a::k)
      .put(ml.b.f, fsh.a::c)
      .put(ml.b.g, fsh.a::d)
      .put(ml.b.h, fsh.a::e)
      .put(ml.b.i, fsh.a::f)
      .put(ml.b.k, fsh.a::h)
      .put(ml.b.l, fsh.a::i)
      .put(ml.b.m, fsh.a::j)
      .put(ml.b.n, fsh.a::g)
      .put(ml.b.p, fsh.a::m)
      .put(ml.b.q, fsh.a::b)
      .build();
   private static final Map<jc, gtk> C = ImmutableMap.of(jc.c, a, jc.f, f.then(b), jc.d, g.then(b), jc.e, h.then(b), jc.b, e.then(b), jc.a, c.then(b));
   private static final Map<fsh.c, alr> D = new HashMap<>();

   static gtj a(alr $$0) {
      return new gtj($$0);
   }

   static fsm a(gtj $$0) {
      return new fsm(btm.a($$0));
   }

   private static fsm a(gtj... $$0) {
      return new fsm(btm.a(Arrays.stream($$0).map($$0x -> new btl<>($$0x, 1)).toList()));
   }

   static fsm b(alr $$0) {
      return a(a($$0));
   }

   private static fso b() {
      return new fso();
   }

   private static gtn a(fso... $$0) {
      return new gtm(gtm.a.b, Stream.of($$0).map(fso::a).toList());
   }

   private static fsn a(dno $$0, gtj $$1, fta $$2, BiConsumer<alr, fsw> $$3) {
      gtj $$4 = a(fsz.e.a($$0, $$2, $$3));
      return fsq.a($$0, a($$1, $$4));
   }

   private static fsn b(dno $$0, gtj $$1, fta $$2, BiConsumer<alr, fsw> $$3) {
      fsm $$4 = b(fsz.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static fsn c(dno $$0, gtj $$1, fta $$2, BiConsumer<alr, fsw> $$3) {
      gtj $$4 = a(fsz.l.a($$0, $$2, $$3));
      return fsq.a($$0, a($$1, $$4)).a(c());
   }

   public fsh(Consumer<fsn> $$0, fsk $$1, BiConsumer<alr, fsw> $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   private void a(dag $$0, alr $$1) {
      this.j.a($$0, fsv.a($$1));
   }

   void a(dno $$0, alr $$1) {
      this.j.a($$0.h(), fsv.a($$1));
   }

   private void a(dno $$0, alr $$1, fsa $$2) {
      this.j.a($$0.h(), fsv.a($$1, $$2));
   }

   private alr a(dag $$0) {
      return fsz.bI.a(fsx.a($$0), fta.b($$0), this.k);
   }

   alr a(dag $$0, dno $$1) {
      return fsz.bI.a(fsx.a($$0), fta.I($$1), this.k);
   }

   private alr a(dag $$0, dno $$1, String $$2) {
      return fsz.bI.a(fsx.a($$0), fta.k(fta.a($$1, $$2)), this.k);
   }

   alr b(dag $$0, dno $$1, String $$2) {
      alr $$3 = fta.J($$1);
      alr $$4 = fta.a($$1, $$2);
      return fsz.bM.a(fsx.a($$0), fta.c($$3, $$4), this.k);
   }

   void b(dag $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dno $$0) {
      dag $$1 = $$0.h();
      if ($$1 != dao.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dno $$0, String $$1) {
      dag $$2 = $$0.h();
      if ($$2 != dao.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dno $$0, String $$1) {
      dag $$2 = $$0.h();
      if ($$2 != dao.a) {
         alr $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fsm b(gtj $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static fsm a(gtj $$0, gtj $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static fsr<fsm> a(ech $$0, fsm $$1, fsm $$2) {
      return fsr.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dno $$0) {
      gtj $$1 = a(ftc.a.create($$0, this.k));
      gtj $$2 = a(ftc.c.create($$0, this.k));
      this.i.accept(fsq.a($$0, a($$1, $$2)));
   }

   private void e(dno $$0) {
      gtj $$1 = a(ftc.a.create($$0, this.k));
      this.i.accept(fsq.a($$0, b($$1)));
   }

   private void f(dno $$0) {
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.by).a($$1 -> {
         String $$2 = "_" + $$1;
         alr $$3 = fta.a($$0, $$2);
         alr $$4 = fsz.c.a($$0, $$2, new fta().a(ftb.a, $$3), this.k);
         return b($$4);
      })));
      this.a($$0, fsx.a($$0, "_0"));
   }

   static fsn a(dno $$0, fsm $$1, fsm $$2) {
      return fsq.a($$0)
         .a(fsr.a(ecg.A).a(false, $$1).a(true, $$2))
         .a(
            fsr.b(ecg.X, ecg.T)
               .a(ecb.a, jc.f, f)
               .a(ecb.a, jc.e, h)
               .a(ecb.a, jc.d, g)
               .a(ecb.a, jc.c, a)
               .a(ecb.b, jc.f, f.then(c).then(b))
               .a(ecb.b, jc.e, h.then(c).then(b))
               .a(ecb.b, jc.d, g.then(c).then(b))
               .a(ecb.b, jc.c, c.then(b))
               .a(ecb.c, jc.f, h.then(d))
               .a(ecb.c, jc.e, f.then(d))
               .a(ecb.c, jc.d, d)
               .a(ecb.c, jc.c, g.then(d))
         );
   }

   private static fsn a(dno $$0, fsm $$1, fsm $$2, fsm $$3, fsm $$4, fsm $$5, fsm $$6, fsm $$7, fsm $$8) {
      return fsq.a($$0)
         .a(
            fsr.a(ecg.T, ecg.ah, ecg.bh, ecg.y)
               .a(jc.f, ecm.b, ecl.a, false, $$1)
               .a(jc.d, ecm.b, ecl.a, false, $$1.a(f))
               .a(jc.e, ecm.b, ecl.a, false, $$1.a(g))
               .a(jc.c, ecm.b, ecl.a, false, $$1.a(h))
               .a(jc.f, ecm.b, ecl.b, false, $$3)
               .a(jc.d, ecm.b, ecl.b, false, $$3.a(f))
               .a(jc.e, ecm.b, ecl.b, false, $$3.a(g))
               .a(jc.c, ecm.b, ecl.b, false, $$3.a(h))
               .a(jc.f, ecm.b, ecl.a, true, $$2.a(f))
               .a(jc.d, ecm.b, ecl.a, true, $$2.a(g))
               .a(jc.e, ecm.b, ecl.a, true, $$2.a(h))
               .a(jc.c, ecm.b, ecl.a, true, $$2)
               .a(jc.f, ecm.b, ecl.b, true, $$4.a(h))
               .a(jc.d, ecm.b, ecl.b, true, $$4)
               .a(jc.e, ecm.b, ecl.b, true, $$4.a(f))
               .a(jc.c, ecm.b, ecl.b, true, $$4.a(g))
               .a(jc.f, ecm.a, ecl.a, false, $$5)
               .a(jc.d, ecm.a, ecl.a, false, $$5.a(f))
               .a(jc.e, ecm.a, ecl.a, false, $$5.a(g))
               .a(jc.c, ecm.a, ecl.a, false, $$5.a(h))
               .a(jc.f, ecm.a, ecl.b, false, $$7)
               .a(jc.d, ecm.a, ecl.b, false, $$7.a(f))
               .a(jc.e, ecm.a, ecl.b, false, $$7.a(g))
               .a(jc.c, ecm.a, ecl.b, false, $$7.a(h))
               .a(jc.f, ecm.a, ecl.a, true, $$6.a(f))
               .a(jc.d, ecm.a, ecl.a, true, $$6.a(g))
               .a(jc.e, ecm.a, ecl.a, true, $$6.a(h))
               .a(jc.c, ecm.a, ecl.a, true, $$6)
               .a(jc.f, ecm.a, ecl.b, true, $$8.a(h))
               .a(jc.d, ecm.a, ecl.b, true, $$8)
               .a(jc.e, ecm.a, ecl.b, true, $$8.a(f))
               .a(jc.c, ecm.a, ecl.b, true, $$8.a(g))
         );
   }

   static fsn a(dno $$0, fsm $$1, fsm $$2, fsm $$3, fsm $$4, fsm $$5) {
      return fsp.a($$0).a($$1).a(b().a(ecg.N, true), $$2).a(b().a(ecg.O, true), $$3).a(b().a(ecg.P, true), $$4).a(b().a(ecg.Q, true), $$5);
   }

   static fsn b(dno $$0, fsm $$1, fsm $$2) {
      return fsp.a($$0)
         .a($$1)
         .a(b().a(ecg.N, true), $$2.a(b))
         .a(b().a(ecg.O, true), $$2.a(f).a(b))
         .a(b().a(ecg.P, true), $$2.a(g).a(b))
         .a(b().a(ecg.Q, true), $$2.a(h).a(b));
   }

   static fsn a(dno $$0, fsm $$1, fsm $$2, fsm $$3) {
      return fsp.a($$0)
         .a(b().a(ecg.L, true), $$1)
         .a(b().a(ecg.aa, edd.b), $$2.a(b))
         .a(b().a(ecg.Z, edd.b), $$2.a(f).a(b))
         .a(b().a(ecg.ab, edd.b), $$2.a(g).a(b))
         .a(b().a(ecg.ac, edd.b), $$2.a(h).a(b))
         .a(b().a(ecg.aa, edd.c), $$3.a(b))
         .a(b().a(ecg.Z, edd.c), $$3.a(f).a(b))
         .a(b().a(ecg.ab, edd.c), $$3.a(g).a(b))
         .a(b().a(ecg.ac, edd.c), $$3.a(h).a(b));
   }

   static fsn a(dno $$0, fsm $$1, fsm $$2, fsm $$3, fsm $$4, boolean $$5) {
      return fsq.a($$0).a(fsr.a(ecg.t, ecg.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(y);
   }

   static fsn b(dno $$0, fsm $$1, fsm $$2, fsm $$3) {
      return fsq.a($$0)
         .a(
            fsr.a(ecg.T, ecg.ai, ecg.bl)
               .a(jc.f, ecp.b, ecz.a, $$2)
               .a(jc.e, ecp.b, ecz.a, $$2.a(g).a(b))
               .a(jc.d, ecp.b, ecz.a, $$2.a(f).a(b))
               .a(jc.c, ecp.b, ecz.a, $$2.a(h).a(b))
               .a(jc.f, ecp.b, ecz.e, $$3)
               .a(jc.e, ecp.b, ecz.e, $$3.a(g).a(b))
               .a(jc.d, ecp.b, ecz.e, $$3.a(f).a(b))
               .a(jc.c, ecp.b, ecz.e, $$3.a(h).a(b))
               .a(jc.f, ecp.b, ecz.d, $$3.a(h).a(b))
               .a(jc.e, ecp.b, ecz.d, $$3.a(f).a(b))
               .a(jc.d, ecp.b, ecz.d, $$3)
               .a(jc.c, ecp.b, ecz.d, $$3.a(g).a(b))
               .a(jc.f, ecp.b, ecz.c, $$1)
               .a(jc.e, ecp.b, ecz.c, $$1.a(g).a(b))
               .a(jc.d, ecp.b, ecz.c, $$1.a(f).a(b))
               .a(jc.c, ecp.b, ecz.c, $$1.a(h).a(b))
               .a(jc.f, ecp.b, ecz.b, $$1.a(h).a(b))
               .a(jc.e, ecp.b, ecz.b, $$1.a(f).a(b))
               .a(jc.d, ecp.b, ecz.b, $$1)
               .a(jc.c, ecp.b, ecz.b, $$1.a(g).a(b))
               .a(jc.f, ecp.a, ecz.a, $$2.a(d).a(b))
               .a(jc.e, ecp.a, ecz.a, $$2.a(d).a(g).a(b))
               .a(jc.d, ecp.a, ecz.a, $$2.a(d).a(f).a(b))
               .a(jc.c, ecp.a, ecz.a, $$2.a(d).a(h).a(b))
               .a(jc.f, ecp.a, ecz.e, $$3.a(d).a(f).a(b))
               .a(jc.e, ecp.a, ecz.e, $$3.a(d).a(h).a(b))
               .a(jc.d, ecp.a, ecz.e, $$3.a(d).a(g).a(b))
               .a(jc.c, ecp.a, ecz.e, $$3.a(d).a(b))
               .a(jc.f, ecp.a, ecz.d, $$3.a(d).a(b))
               .a(jc.e, ecp.a, ecz.d, $$3.a(d).a(g).a(b))
               .a(jc.d, ecp.a, ecz.d, $$3.a(d).a(f).a(b))
               .a(jc.c, ecp.a, ecz.d, $$3.a(d).a(h).a(b))
               .a(jc.f, ecp.a, ecz.c, $$1.a(d).a(f).a(b))
               .a(jc.e, ecp.a, ecz.c, $$1.a(d).a(h).a(b))
               .a(jc.d, ecp.a, ecz.c, $$1.a(d).a(g).a(b))
               .a(jc.c, ecp.a, ecz.c, $$1.a(d).a(b))
               .a(jc.f, ecp.a, ecz.b, $$1.a(d).a(b))
               .a(jc.e, ecp.a, ecz.b, $$1.a(d).a(g).a(b))
               .a(jc.d, ecp.a, ecz.b, $$1.a(d).a(f).a(b))
               .a(jc.c, ecp.a, ecz.b, $$1.a(d).a(h).a(b))
         );
   }

   private static fsn c(dno $$0, fsm $$1, fsm $$2, fsm $$3) {
      return fsq.a($$0)
         .a(
            fsr.a(ecg.T, ecg.ai, ecg.y)
               .a(jc.c, ecp.b, false, $$2)
               .a(jc.d, ecp.b, false, $$2.a(g))
               .a(jc.f, ecp.b, false, $$2.a(f))
               .a(jc.e, ecp.b, false, $$2.a(h))
               .a(jc.c, ecp.a, false, $$1)
               .a(jc.d, ecp.a, false, $$1.a(g))
               .a(jc.f, ecp.a, false, $$1.a(f))
               .a(jc.e, ecp.a, false, $$1.a(h))
               .a(jc.c, ecp.b, true, $$3)
               .a(jc.d, ecp.b, true, $$3.a(g))
               .a(jc.f, ecp.b, true, $$3.a(f))
               .a(jc.e, ecp.b, true, $$3.a(h))
               .a(jc.c, ecp.a, true, $$3.a(d).a(g))
               .a(jc.d, ecp.a, true, $$3.a(d))
               .a(jc.f, ecp.a, true, $$3.a(d).a(h))
               .a(jc.e, ecp.a, true, $$3.a(d).a(f))
         );
   }

   private static fsn d(dno $$0, fsm $$1, fsm $$2, fsm $$3) {
      return fsq.a($$0)
         .a(
            fsr.a(ecg.T, ecg.ai, ecg.y)
               .a(jc.c, ecp.b, false, $$2)
               .a(jc.d, ecp.b, false, $$2)
               .a(jc.f, ecp.b, false, $$2)
               .a(jc.e, ecp.b, false, $$2)
               .a(jc.c, ecp.a, false, $$1)
               .a(jc.d, ecp.a, false, $$1)
               .a(jc.f, ecp.a, false, $$1)
               .a(jc.e, ecp.a, false, $$1)
               .a(jc.c, ecp.b, true, $$3)
               .a(jc.d, ecp.b, true, $$3.a(g))
               .a(jc.f, ecp.b, true, $$3.a(f))
               .a(jc.e, ecp.b, true, $$3.a(h))
               .a(jc.c, ecp.a, true, $$3)
               .a(jc.d, ecp.a, true, $$3.a(g))
               .a(jc.f, ecp.a, true, $$3.a(f))
               .a(jc.e, ecp.a, true, $$3.a(h))
         );
   }

   static fsq a(dno $$0, fsm $$1) {
      return fsq.a($$0, $$1);
   }

   private static fsr<gtk> c() {
      return fsr.b(ecg.K).a(jc.a.b, a).a(jc.a.c, c).a(jc.a.a, c.then(f));
   }

   static fsn a(dno $$0, fta $$1, BiConsumer<alr, fsw> $$2) {
      fsm $$3 = b(fsz.g.a($$0, $$1, $$2));
      fsm $$4 = b(fsz.h.a($$0, $$1, $$2));
      fsm $$5 = b(fsz.i.a($$0, $$1, $$2));
      return fsq.a($$0).a(fsr.a(ecg.K).a(jc.a.a, $$3).a(jc.a.b, $$4).a(jc.a.c, $$5));
   }

   static fsn b(dno $$0, fsm $$1) {
      return fsq.a($$0, $$1).a(c());
   }

   private void c(dno $$0, fsm $$1) {
      this.i.accept(b($$0, $$1));
   }

   public void a(dno $$0, ftc.a $$1) {
      fsm $$2 = b($$1.create($$0, this.k));
      this.i.accept(b($$0, $$2));
   }

   private void c(dno $$0, ftc.a $$1) {
      fsm $$2 = b($$1.create($$0, this.k));
      this.i.accept(fsq.a($$0, $$2).a(z));
   }

   static fsn c(dno $$0, fsm $$1, fsm $$2) {
      return fsq.a($$0).a(fsr.a(ecg.K).a(jc.a.b, $$1).a(jc.a.c, $$2.a(c)).a(jc.a.a, $$2.a(c).a(f)));
   }

   private void a(dno $$0, ftc.a $$1, ftc.a $$2) {
      fsm $$3 = b($$1.create($$0, this.k));
      fsm $$4 = b($$2.create($$0, this.k));
      this.i.accept(c($$0, $$3, $$4));
   }

   private void g(dno $$0) {
      fsm $$1 = b(ftc.A.create($$0, this.k));
      fsm $$2 = b(ftc.B.create($$0, this.k));
      fsm $$3 = b(this.a(ftc.A, $$0, "_awake"));
      fsm $$4 = b(this.a(ftc.B, $$0, "_awake"));
      fsm $$5 = b(this.a(ftc.A, $$0, "_dormant"));
      fsm $$6 = b(this.a(ftc.B, $$0, "_dormant"));
      this.i
         .accept(
            fsq.a($$0)
               .a(
                  fsr.a(ecg.K, dpk.c)
                     .a(jc.a.b, eck.a, $$1)
                     .a(jc.a.c, eck.a, $$2.a(c))
                     .a(jc.a.a, eck.a, $$2.a(c).a(f))
                     .a(jc.a.b, eck.b, $$5)
                     .a(jc.a.c, eck.b, $$6.a(c))
                     .a(jc.a.a, eck.b, $$6.a(c).a(f))
                     .a(jc.a.b, eck.c, $$3)
                     .a(jc.a.c, eck.c, $$4.a(c))
                     .a(jc.a.a, eck.c, $$4.a(c).a(f))
               )
         );
   }

   private alr a(ftc.a $$0, dno $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(ftb.i, fta.a($$1, $$2)).a(ftb.d, fta.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.k);
   }

   private alr a(dno $$0, String $$1, fsy $$2, Function<alr, fta> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fta.a($$0, $$1)), this.k);
   }

   static fsn d(dno $$0, fsm $$1, fsm $$2) {
      return fsq.a($$0).a(a(ecg.A, $$2, $$1));
   }

   static fsn e(dno $$0, fsm $$1, fsm $$2, fsm $$3) {
      return fsq.a($$0).a(fsr.a(ecg.bk).a(ecy.b, $$1).a(ecy.a, $$2).a(ecy.c, $$3));
   }

   public void a(dno $$0) {
      this.b($$0, ftc.a);
   }

   public void b(dno $$0, ftc.a $$1) {
      this.i.accept(a($$0, b($$1.create($$0, this.k))));
   }

   public void a(dno $$0, ftc.a $$1, int $$2) {
      alr $$3 = $$1.create($$0, this.k);
      this.i.accept(a($$0, b($$3)));
      this.a($$0, $$3, fsv.a($$2));
   }

   private void d() {
      this.K(dnq.fx);
      alr $$0 = this.a(dao.gr, dnq.fx);
      this.a(dnq.fx, $$0, fsv.a(-12012264));
   }

   private void h(dno $$0) {
      alr $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new frz());
   }

   private fsh.a i(dno $$0) {
      ftc $$1 = A.getOrDefault($$0, ftc.a.get($$0));
      return new fsh.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dno $$0, dno $$1, dno $$2) {
      fsm $$3 = this.g($$1, $$0);
      this.i.accept(a($$1, $$3));
      this.i.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dno $$0) {
      fta $$1 = fta.w($$0);
      fsm $$2 = b(fsz.v.a($$0, $$1, this.k));
      fsm $$3 = b(fsz.w.a($$0, $$1, this.k));
      fsm $$4 = b(fsz.x.a($$0, $$1, this.k));
      fsm $$5 = b(fsz.y.a($$0, $$1, this.k));
      fsm $$6 = b(fsz.z.a($$0, $$1, this.k));
      fsm $$7 = b(fsz.A.a($$0, $$1, this.k));
      fsm $$8 = b(fsz.B.a($$0, $$1, this.k));
      fsm $$9 = b(fsz.C.a($$0, $$1, this.k));
      this.b($$0.h());
      this.i.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dno $$0, dno $$1) {
      fsm $$2 = b(fsz.v.a($$0));
      fsm $$3 = b(fsz.w.a($$0));
      fsm $$4 = b(fsz.x.a($$0));
      fsm $$5 = b(fsz.y.a($$0));
      fsm $$6 = b(fsz.z.a($$0));
      fsm $$7 = b(fsz.A.a($$0));
      fsm $$8 = b(fsz.B.a($$0));
      fsm $$9 = b(fsz.C.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dno $$0) {
      fta $$1 = fta.b($$0);
      fsm $$2 = b(fsz.ak.a($$0, $$1, this.k));
      alr $$3 = fsz.al.a($$0, $$1, this.k);
      fsm $$4 = b(fsz.am.a($$0, $$1, this.k));
      this.i.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dno $$0) {
      fta $$1 = fta.b($$0);
      fsm $$2 = b(fsz.ah.a($$0, $$1, this.k));
      alr $$3 = fsz.ai.a($$0, $$1, this.k);
      fsm $$4 = b(fsz.aj.a($$0, $$1, this.k));
      this.i.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dno $$0, dno $$1) {
      fsm $$2 = b(fsz.ah.a($$0));
      fsm $$3 = b(fsz.ai.a($$0));
      fsm $$4 = b(fsz.aj.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      fsm $$0 = b(fsx.a(dnq.tn));
      fsm $$1 = b(fsx.a(dnq.tn, "_partial_tilt"));
      fsm $$2 = b(fsx.a(dnq.tn, "_full_tilt"));
      this.i.accept(fsq.a(dnq.tn).a(fsr.a(ecg.bo).a(edc.a, $$0).a(edc.b, $$0).a(edc.c, $$1).a(edc.d, $$2)).a(z));
   }

   private fsh.e m(dno $$0) {
      return new fsh.e(fta.q($$0));
   }

   private void n(dno $$0) {
      this.d($$0, $$0);
   }

   private void d(dno $$0, dno $$1) {
      this.i.accept(a($$0, b(fsx.a($$1))));
   }

   private void a(dno $$0, fsh.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dno $$0, fsh.d $$1, fta $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dno $$0, fsh.d $$1) {
      fta $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dno $$0, fsh.d $$1, fta $$2) {
      fsm $$3 = b($$1.a().a($$0, $$2, this.k));
      this.i.accept(a($$0, $$3));
   }

   private void a(dno $$0, fsh.d $$1, ect<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.i.accept(fsq.a($$0).a(fsr.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            fta $$5 = fta.c(fta.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.k));
         })));
      }
   }

   private void a(dno $$0, dno $$1, fsh.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dno $$0, dno $$1, fsh.d $$2) {
      this.b($$0, $$2);
      fta $$3 = $$2.b($$0);
      fsm $$4 = b($$2.b().a($$1, $$3, this.k));
      this.i.accept(a($$1, $$4));
   }

   private void e(dno $$0, dno $$1) {
      ftc $$2 = ftc.u.get($$0);
      fsm $$3 = b($$2.a($$0, this.k));
      this.i.accept(a($$0, $$3));
      fsm $$4 = b(fsz.aJ.a($$1, $$2.b(), this.k));
      this.i.accept(fsq.a($$1, $$4).a(z));
      this.c($$0);
   }

   private void f(dno $$0, dno $$1) {
      this.b($$0.h());
      fta $$2 = fta.k($$0);
      fta $$3 = fta.a($$0, $$1);
      fsm $$4 = b(fsz.bb.a($$1, $$3, this.k));
      this.i.accept(fsq.a($$1, $$4).a(fsr.b(ecg.T).a(jc.e, a).a(jc.d, h).a(jc.c, f).a(jc.f, g)));
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.ay).a($$2x -> b(fsz.ba[$$2x].a($$0, $$2, this.k)))));
   }

   private void f() {
      dno $$0 = dnq.li;
      this.b($$0.h());
      fsm $$1 = b(fsx.a($$0, "_top"));
      fsm $$2 = b(fsx.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dno $$0 = dnq.lh;
      this.b($$0.h());
      this.i.accept(fsq.a($$0).a(fsr.a(dtj.e, ecg.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(fsx.a($$0, "_top_stage_" + $$1));
            case b -> b(fsx.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dno $$0, dno $$1, dno $$2, dno $$3, dno $$4, dno $$5, dno $$6, dno $$7) {
      this.a($$0, fsh.d.b);
      this.a($$1, fsh.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dno $$0, fsh.d $$1) {
      fsm $$2 = b(this.a($$0, "_top", $$1.a(), fta::c));
      fsm $$3 = b(this.a($$0, "_bottom", $$1.a(), fta::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dno $$0, fsh.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dno $$0) {
      alr $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new frz());
      this.c($$0, fsh.d.a);
   }

   private void h() {
      this.a(dnq.jf, "_front");
      fsm $$0 = b(fsx.a(dnq.jf, "_top"));
      fsm $$1 = b(this.a(dnq.jf, "_bottom", fsh.d.b.a(), fta::c));
      this.e(dnq.jf, $$0, $$1);
   }

   private void i() {
      fsm $$0 = b(this.a(dnq.bH, "_top", fsz.bv, fta::a));
      fsm $$1 = b(this.a(dnq.bH, "_bottom", fsz.bv, fta::a));
      this.e(dnq.bH, $$0, $$1);
   }

   private void j() {
      fsm $$0 = b(fsx.a(dnq.tp, "_top"));
      fsm $$1 = b(fsx.a(dnq.tp, "_bottom"));
      this.i.accept(fsq.a(dnq.tp).a(fsr.a(ecg.ah).a(ecm.b, $$1).a(ecm.a, $$0)).a(z));
   }

   private void e(dno $$0, fsm $$1, fsm $$2) {
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.ah).a(ecm.b, $$2).a(ecm.a, $$1)));
   }

   private void p(dno $$0) {
      fta $$1 = fta.h($$0);
      fta $$2 = fta.e(fta.a($$0, "_corner"));
      fsm $$3 = b(fsz.au.a($$0, $$1, this.k));
      fsm $$4 = b(fsz.av.a($$0, $$2, this.k));
      fsm $$5 = b(fsz.aw.a($$0, $$1, this.k));
      fsm $$6 = b(fsz.ax.a($$0, $$1, this.k));
      this.c($$0);
      this.i
         .accept(
            fsq.a($$0)
               .a(
                  fsr.a(ecg.aj)
                     .a(ecu.a, $$3)
                     .a(ecu.b, $$3.a(f))
                     .a(ecu.c, $$5.a(f))
                     .a(ecu.d, $$6.a(f))
                     .a(ecu.e, $$5)
                     .a(ecu.f, $$6)
                     .a(ecu.g, $$4)
                     .a(ecu.h, $$4.a(f))
                     .a(ecu.i, $$4.a(g))
                     .a(ecu.j, $$4.a(h))
               )
         );
   }

   private void q(dno $$0) {
      fsm $$1 = b(this.a($$0, "", fsz.au, fta::e));
      fsm $$2 = b(this.a($$0, "", fsz.aw, fta::e));
      fsm $$3 = b(this.a($$0, "", fsz.ax, fta::e));
      fsm $$4 = b(this.a($$0, "_on", fsz.au, fta::e));
      fsm $$5 = b(this.a($$0, "_on", fsz.aw, fta::e));
      fsm $$6 = b(this.a($$0, "_on", fsz.ax, fta::e));
      this.c($$0);
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.A, ecg.ak).a(($$6x, $$7) -> {
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

   private void a(dno $$0, dag $$1) {
      fsm $$2 = b(fsz.aa.a($$0, fta.a($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private void b(dno $$0, alr $$1) {
      fsm $$2 = b(fsz.aa.a($$0, fta.h($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private fsm g(dno $$0, dno $$1) {
      return b(fsz.aa.a($$0, fta.x($$1), this.k));
   }

   public void a(dno $$0, dno $$1) {
      this.i.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dno $$0) {
      this.a($$0, $$0);
   }

   private void h(dno $$0, dno $$1) {
      this.a($$0);
      fsm $$2 = b(ftc.j.get($$0).a($$1, this.k));
      this.i.accept(a($$1, $$2));
   }

   private void s(dno $$0) {
      fsm $$1 = b(ftc.p.create($$0, this.k));
      fsm $$2 = b(ftc.q.create($$0, this.k));
      fsm $$3 = b(ftc.r.create($$0, this.k));
      fsm $$4 = b(ftc.s.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, $$1, q, $$2, r, $$3, s, $$4, t);
   }

   private void t(dno $$0) {
      fsm $$1 = b(ftc.l.create($$0, this.k));
      fsm $$2 = b(ftc.m.create($$0, this.k));
      fsm $$3 = b(ftc.n.create($$0, this.k));
      fsm $$4 = b(ftc.o.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, $$1, m, $$2, n, $$3, o, $$4, p);
   }

   private void a(dno $$0, fsm $$1, Function<fso, fso> $$2, fsm $$3, Function<fso, fso> $$4, fsm $$5, Function<fso, fso> $$6, fsm $$7, Function<fso, fso> $$8) {
      this.i
         .accept(
            fsp.a($$0)
               .a($$2.apply(b().a(ecg.T, jc.c)), $$1)
               .a($$2.apply(b().a(ecg.T, jc.f)), $$1.a(f))
               .a($$2.apply(b().a(ecg.T, jc.d)), $$1.a(g))
               .a($$2.apply(b().a(ecg.T, jc.e)), $$1.a(h))
               .a($$4.apply(b().a(ecg.T, jc.c)), $$3)
               .a($$4.apply(b().a(ecg.T, jc.f)), $$3.a(f))
               .a($$4.apply(b().a(ecg.T, jc.d)), $$3.a(g))
               .a($$4.apply(b().a(ecg.T, jc.e)), $$3.a(h))
               .a($$6.apply(b().a(ecg.T, jc.c)), $$5)
               .a($$6.apply(b().a(ecg.T, jc.f)), $$5.a(f))
               .a($$6.apply(b().a(ecg.T, jc.d)), $$5.a(g))
               .a($$6.apply(b().a(ecg.T, jc.e)), $$5.a(h))
               .a($$8.apply(b().a(ecg.T, jc.c)), $$7)
               .a($$8.apply(b().a(ecg.T, jc.f)), $$7.a(f))
               .a($$8.apply(b().a(ecg.T, jc.d)), $$7.a(g))
               .a($$8.apply(b().a(ecg.T, jc.e)), $$7.a(h))
         );
   }

   private void a(ftc.a $$0, dno... $$1) {
      for (dno $$2 : $$1) {
         gtj $$3 = a($$0.create($$2, this.k));
         this.i.accept(fsq.a($$2, b($$3)));
      }
   }

   private void b(ftc.a $$0, dno... $$1) {
      for (dno $$2 : $$1) {
         fsm $$3 = b($$0.create($$2, this.k));
         this.i.accept(fsq.a($$2, $$3).a(y));
      }
   }

   private void i(dno $$0, dno $$1) {
      this.a($$0);
      fta $$2 = fta.b($$0, $$1);
      fsm $$3 = b(fsz.aP.a($$1, $$2, this.k));
      fsm $$4 = b(fsz.aQ.a($$1, $$2, this.k));
      fsm $$5 = b(fsz.aR.a($$1, $$2, this.k));
      fsm $$6 = b(fsz.aN.a($$1, $$2, this.k));
      fsm $$7 = b(fsz.aO.a($$1, $$2, this.k));
      dag $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.i
         .accept(
            fsp.a($$1)
               .a($$3)
               .a(b().a(ecg.N, true), $$4)
               .a(b().a(ecg.O, true), $$4.a(f))
               .a(b().a(ecg.P, true), $$5)
               .a(b().a(ecg.Q, true), $$5.a(f))
               .a(b().a(ecg.N, false), $$6)
               .a(b().a(ecg.O, false), $$7)
               .a(b().a(ecg.P, false), $$7.a(f))
               .a(b().a(ecg.Q, false), $$6.a(h))
         );
   }

   private void u(dno $$0) {
      fta $$1 = fta.C($$0);
      fsm $$2 = b(fsz.aS.a($$0, $$1, this.k));
      fsm $$3 = b(this.a($$0, "_conditional", fsz.aS, $$1x -> $$1.c(ftb.i, $$1x)));
      this.i.accept(fsq.a($$0).a(a(ecg.f, $$3, $$2)).a(v));
   }

   private void v(dno $$0) {
      fsm $$1 = b(ftc.v.create($$0, this.k));
      this.i.accept(a($$0, $$1).a(y));
   }

   private static fsm a(int $$0) {
      String $$1 = "_age" + $$0;
      return new fsm(btm.a(IntStream.range(1, 5).mapToObj($$1x -> new btl<>(a(fsx.a(dnq.nF, $$1x + $$1)), 1)).collect(Collectors.toList())));
   }

   private void k() {
      this.i
         .accept(
            fsp.a(dnq.nF)
               .a(b().a(ecg.at, 0), a(0))
               .a(b().a(ecg.at, 1), a(1))
               .a(b().a(ecg.bn, ecc.b), b(fsx.a(dnq.nF, "_small_leaves")))
               .a(b().a(ecg.bn, ecc.c), b(fsx.a(dnq.nF, "_large_leaves")))
         );
   }

   private void l() {
      alr $$0 = fta.a(dnq.oA, "_top_open");
      fsm $$1 = b(ftc.f.create(dnq.oA, this.k));
      fsm $$2 = b(ftc.f.get(dnq.oA).a($$1x -> $$1x.a(ftb.f, $$0)).a(dnq.oA, "_open", this.k));
      this.i.accept(fsq.a(dnq.oA).a(fsr.a(ecg.y).a(false, $$1).a(true, $$2)).a(w));
   }

   private static <T extends Comparable<T>> fsr<fsm> a(ect<T> $$0, T $$1, fsm $$2, fsm $$3) {
      return fsr.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dno $$0, Function<dno, fta> $$1) {
      fta $$2 = $$1.apply($$0).b(ftb.i, ftb.c);
      fta $$3 = $$2.c(ftb.g, fta.a($$0, "_front_honey"));
      alr $$4 = fsz.q.a($$0, "_empty", $$2, this.k);
      alr $$5 = fsz.q.a($$0, "_honey", $$3, this.k);
      this.j.a($$0.h(), fsv.a(dni.c, fsv.a($$4), Map.of(5, fsv.a($$5))));
      this.i.accept(fsq.a($$0).a(a(dni.c, 5, b($$5), b($$4))).a(z));
   }

   private void a(dno $$0, ect<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<alr> $$3 = new Int2ObjectOpenHashMap();
         this.i.accept(fsq.a($$0).a(fsr.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((alr)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, fsz.bc, fta::g)));
         })));
      }
   }

   private void m() {
      fsm $$0 = b(fsx.a(dnq.oJ, "_floor"));
      fsm $$1 = b(fsx.a(dnq.oJ, "_ceiling"));
      fsm $$2 = b(fsx.a(dnq.oJ, "_wall"));
      fsm $$3 = b(fsx.a(dnq.oJ, "_between_walls"));
      this.b(dao.xD);
      this.i
         .accept(
            fsq.a(dnq.oJ)
               .a(
                  fsr.a(ecg.T, ecg.Y)
                     .a(jc.c, ece.a, $$0)
                     .a(jc.d, ece.a, $$0.a(g))
                     .a(jc.f, ece.a, $$0.a(f))
                     .a(jc.e, ece.a, $$0.a(h))
                     .a(jc.c, ece.b, $$1)
                     .a(jc.d, ece.b, $$1.a(g))
                     .a(jc.f, ece.b, $$1.a(f))
                     .a(jc.e, ece.b, $$1.a(h))
                     .a(jc.c, ece.c, $$2.a(h))
                     .a(jc.d, ece.c, $$2.a(f))
                     .a(jc.f, ece.c, $$2)
                     .a(jc.e, ece.c, $$2.a(g))
                     .a(jc.d, ece.d, $$3.a(f))
                     .a(jc.c, ece.d, $$3.a(h))
                     .a(jc.f, ece.d, $$3)
                     .a(jc.e, ece.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.i
         .accept(
            fsq.a(dnq.oF, b(fsx.a(dnq.oF)))
               .a(
                  fsr.b(ecg.X, ecg.T)
                     .a(ecb.a, jc.c, a)
                     .a(ecb.a, jc.f, f)
                     .a(ecb.a, jc.d, g)
                     .a(ecb.a, jc.e, h)
                     .a(ecb.b, jc.c, c)
                     .a(ecb.b, jc.f, c.then(f))
                     .a(ecb.b, jc.d, c.then(g))
                     .a(ecb.b, jc.e, c.then(h))
                     .a(ecb.c, jc.d, d)
                     .a(ecb.c, jc.e, d.then(f))
                     .a(ecb.c, jc.c, d.then(g))
                     .a(ecb.c, jc.f, d.then(h))
               )
         );
   }

   private void d(dno $$0, ftc.a $$1) {
      fsm $$2 = b($$1.create($$0, this.k));
      alr $$3 = fta.a($$0, "_front_on");
      fsm $$4 = b($$1.get($$0).a($$1x -> $$1x.a(ftb.g, $$3)).a($$0, "_on", this.k));
      this.i.accept(fsq.a($$0).a(a(ecg.u, $$4, $$2)).a(z));
   }

   private void a(dno... $$0) {
      fsm $$1 = b(fsx.a("campfire_off"));

      for (dno $$2 : $$0) {
         fsm $$3 = b(fsz.bj.a($$2, fta.H($$2), this.k));
         this.b($$2.h());
         this.i.accept(fsq.a($$2).a(a(ecg.u, $$3, $$1)).a(y));
      }
   }

   private void w(dno $$0) {
      fsm $$1 = b(fsz.bE.a($$0, fta.o($$0), this.k));
      this.i.accept(a($$0, $$1));
   }

   private void x(dno $$0) {
      fsm $$1;
      if ($$0 == dnq.tT) {
         $$1 = b(fsz.bG.a($$0, fta.p($$0), this.k));
      } else {
         $$1 = b(fsz.bF.a($$0, fta.p($$0), this.k));
      }

      this.i.accept(a($$0, $$1));
   }

   private void o() {
      fta $$0 = fta.a(fta.J(dnq.cv), fta.J(dnq.n));
      fsm $$1 = b(fsz.j.a(dnq.cv, $$0, this.k));
      this.i.accept(a(dnq.cv, $$1));
   }

   private void p() {
      this.b(dao.ml);
      this.i
         .accept(
            fsp.a(dnq.cH)
               .a(
                  a(
                     b().a(ecg.ae, ecv.c).a(ecg.ad, ecv.c).a(ecg.af, ecv.c).a(ecg.ag, ecv.c),
                     b().a(ecg.ae, ecv.b, ecv.a).a(ecg.ad, ecv.b, ecv.a),
                     b().a(ecg.ad, ecv.b, ecv.a).a(ecg.af, ecv.b, ecv.a),
                     b().a(ecg.af, ecv.b, ecv.a).a(ecg.ag, ecv.b, ecv.a),
                     b().a(ecg.ag, ecv.b, ecv.a).a(ecg.ae, ecv.b, ecv.a)
                  ),
                  b(fsx.a("redstone_dust_dot"))
               )
               .a(b().a(ecg.ae, ecv.b, ecv.a), b(fsx.a("redstone_dust_side0")))
               .a(b().a(ecg.af, ecv.b, ecv.a), b(fsx.a("redstone_dust_side_alt0")))
               .a(b().a(ecg.ad, ecv.b, ecv.a), b(fsx.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(ecg.ag, ecv.b, ecv.a), b(fsx.a("redstone_dust_side1")).a(h))
               .a(b().a(ecg.ae, ecv.a), b(fsx.a("redstone_dust_up")))
               .a(b().a(ecg.ad, ecv.a), b(fsx.a("redstone_dust_up")).a(f))
               .a(b().a(ecg.af, ecv.a), b(fsx.a("redstone_dust_up")).a(g))
               .a(b().a(ecg.ag, ecv.a), b(fsx.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(dao.mp);
      this.i
         .accept(
            fsq.a(dnq.hz)
               .a(
                  fsr.a(ecg.bg, ecg.A)
                     .a(ecj.a, false, b(fsx.a(dnq.hz)))
                     .a(ecj.a, true, b(fsx.a(dnq.hz, "_on")))
                     .a(ecj.b, false, b(fsx.a(dnq.hz, "_subtract")))
                     .a(ecj.b, true, b(fsx.a(dnq.hz, "_on_subtract")))
               )
               .a(y)
         );
   }

   private void r() {
      fta $$0 = fta.a(dnq.ku);
      fta $$1 = fta.a(fta.a(dnq.kh, "_side"), $$0.a(ftb.f));
      fsm $$2 = b(fsz.ab.a(dnq.kh, $$1, this.k));
      fsm $$3 = b(fsz.ac.a(dnq.kh, $$1, this.k));
      fsm $$4 = b(fsz.j.b(dnq.kh, "_double", $$1, this.k));
      this.i.accept(e(dnq.kh, $$2, $$3, $$4));
      this.i.accept(a(dnq.ku, b(fsz.c.a(dnq.ku, $$0, this.k))));
   }

   private void s() {
      this.b(dao.ty);
      this.i
         .accept(
            fsp.a(dnq.fR)
               .a(b(fta.J(dnq.fR)))
               .a(b().a(ecg.n, true), b(fta.a(dnq.fR, "_bottle0")))
               .a(b().a(ecg.o, true), b(fta.a(dnq.fR, "_bottle1")))
               .a(b().a(ecg.p, true), b(fta.a(dnq.fR, "_bottle2")))
               .a(b().a(ecg.n, false), b(fta.a(dnq.fR, "_empty0")))
               .a(b().a(ecg.o, false), b(fta.a(dnq.fR, "_empty1")))
               .a(b().a(ecg.p, false), b(fta.a(dnq.fR, "_empty2")))
         );
   }

   private void y(dno $$0) {
      fsm $$1 = b(fsz.bA.a($$0, fta.b($$0), this.k));
      fsm $$2 = b(fsx.a("mushroom_block_inside"));
      this.i
         .accept(
            fsp.a($$0)
               .a(b().a(ecg.N, true), $$1)
               .a(b().a(ecg.O, true), $$1.a(f).a(b))
               .a(b().a(ecg.P, true), $$1.a(g).a(b))
               .a(b().a(ecg.Q, true), $$1.a(h).a(b))
               .a(b().a(ecg.L, true), $$1.a(e).a(b))
               .a(b().a(ecg.M, true), $$1.a(c).a(b))
               .a(b().a(ecg.N, false), $$2)
               .a(b().a(ecg.O, false), $$2.a(f))
               .a(b().a(ecg.P, false), $$2.a(g))
               .a(b().a(ecg.Q, false), $$2.a(h))
               .a(b().a(ecg.L, false), $$2.a(e))
               .a(b().a(ecg.M, false), $$2.a(c))
         );
      this.a($$0, ftc.a.createWithSuffix($$0, "_inventory", this.k));
   }

   private void t() {
      this.b(dao.sJ);
      this.i
         .accept(
            fsq.a(dnq.ex)
               .a(
                  fsr.a(ecg.aB)
                     .a(0, b(fsx.a(dnq.ex)))
                     .a(1, b(fsx.a(dnq.ex, "_slice1")))
                     .a(2, b(fsx.a(dnq.ex, "_slice2")))
                     .a(3, b(fsx.a(dnq.ex, "_slice3")))
                     .a(4, b(fsx.a(dnq.ex, "_slice4")))
                     .a(5, b(fsx.a(dnq.ex, "_slice5")))
                     .a(6, b(fsx.a(dnq.ex, "_slice6")))
               )
         );
   }

   private void u() {
      fta $$0 = new fta()
         .a(ftb.c, fta.a(dnq.oD, "_side3"))
         .a(ftb.o, fta.J(dnq.t))
         .a(ftb.n, fta.a(dnq.oD, "_top"))
         .a(ftb.j, fta.a(dnq.oD, "_side3"))
         .a(ftb.l, fta.a(dnq.oD, "_side3"))
         .a(ftb.k, fta.a(dnq.oD, "_side1"))
         .a(ftb.m, fta.a(dnq.oD, "_side2"));
      this.i.accept(a(dnq.oD, b(fsz.a.a(dnq.oD, $$0, this.k))));
   }

   private void v() {
      fta $$0 = new fta()
         .a(ftb.c, fta.a(dnq.oH, "_front"))
         .a(ftb.o, fta.a(dnq.oH, "_bottom"))
         .a(ftb.n, fta.a(dnq.oH, "_top"))
         .a(ftb.j, fta.a(dnq.oH, "_front"))
         .a(ftb.k, fta.a(dnq.oH, "_front"))
         .a(ftb.l, fta.a(dnq.oH, "_side"))
         .a(ftb.m, fta.a(dnq.oH, "_side"));
      this.i.accept(a(dnq.oH, b(fsz.a.a(dnq.oH, $$0, this.k))));
   }

   private void a(dno $$0, dno $$1, BiFunction<dno, dno, fta> $$2) {
      fta $$3 = $$2.apply($$0, $$1);
      this.i.accept(a($$0, b(fsz.a.a($$0, $$3, this.k))));
   }

   public void b(dno $$0) {
      fta $$1 = new fta()
         .a(ftb.c, fta.a($$0, "_particle"))
         .a(ftb.o, fta.a($$0, "_down"))
         .a(ftb.n, fta.a($$0, "_up"))
         .a(ftb.j, fta.a($$0, "_north"))
         .a(ftb.k, fta.a($$0, "_south"))
         .a(ftb.l, fta.a($$0, "_east"))
         .a(ftb.m, fta.a($$0, "_west"));
      this.i.accept(a($$0, b(fsz.a.a($$0, $$1, this.k))));
   }

   private void w() {
      fta $$0 = fta.n(dnq.fr);
      this.i.accept(a(dnq.fr, b(fsx.a(dnq.fr))));
      this.a(dnq.ev, $$0);
      this.a(dnq.ew, $$0);
   }

   private void a(dno $$0, fta $$1) {
      fsm $$2 = b(fsz.p.a($$0, $$1.c(ftb.g, fta.J($$0)), this.k));
      this.i.accept(fsq.a($$0, $$2).a(z));
   }

   private void x() {
      this.b(dao.tz);
      this.n(dnq.fS);
      this.i.accept(a(dnq.fU, b(fsz.bD.a(dnq.fU, fta.j(fta.a(dnq.K, "_still")), this.k))));
      this.i
         .accept(
            fsq.a(dnq.fT)
               .a(
                  fsr.a(dsc.f)
                     .a(1, b(fsz.bB.a(dnq.fT, "_level1", fta.j(fta.a(dnq.J, "_still")), this.k)))
                     .a(2, b(fsz.bC.a(dnq.fT, "_level2", fta.j(fta.a(dnq.J, "_still")), this.k)))
                     .a(3, b(fsz.bD.a(dnq.fT, "_full", fta.j(fta.a(dnq.J, "_still")), this.k)))
               )
         );
      this.i
         .accept(
            fsq.a(dnq.fV)
               .a(
                  fsr.a(dsc.f)
                     .a(1, b(fsz.bB.a(dnq.fV, "_level1", fta.j(fta.J(dnq.rx)), this.k)))
                     .a(2, b(fsz.bC.a(dnq.fV, "_level2", fta.j(fta.J(dnq.rx)), this.k)))
                     .a(3, b(fsz.bD.a(dnq.fV, "_full", fta.j(fta.J(dnq.rx)), this.k)))
               )
         );
   }

   private void y() {
      fta $$0 = fta.b(dnq.lb);
      fsm $$1 = b(fsz.aL.a(dnq.lb, $$0, this.k));
      fsm $$2 = b(this.a(dnq.lb, "_dead", fsz.aL, $$1x -> $$0.c(ftb.b, $$1x)));
      this.i.accept(fsq.a(dnq.lb).a(a(ecg.ax, 5, $$2, $$1)));
   }

   private void z() {
      fsm $$0 = b(fsx.a(dnq.ua));
      fsm $$1 = b(fsx.a(dnq.ua, "_triggered"));
      fsm $$2 = b(fsx.a(dnq.ua, "_crafting"));
      fsm $$3 = b(fsx.a(dnq.ua, "_crafting_triggered"));
      this.i
         .accept(fsq.a(dnq.ua).a(fsr.a(ecg.G, dpi.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(fsr.b(ecg.W).a(fsh::a)));
   }

   private void z(dno $$0) {
      fta $$1 = new fta().a(ftb.f, fta.a(dnq.cO, "_top")).a(ftb.i, fta.a(dnq.cO, "_side")).a(ftb.g, fta.a($$0, "_front"));
      fta $$2 = new fta().a(ftb.i, fta.a(dnq.cO, "_top")).a(ftb.g, fta.a($$0, "_front_vertical"));
      fsm $$3 = b(fsz.p.a($$0, $$1, this.k));
      fsm $$4 = b(fsz.r.a($$0, $$2, this.k));
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.R).a(jc.a, $$4.a(d)).a(jc.b, $$4).a(jc.c, $$3).a(jc.f, $$3.a(f)).a(jc.d, $$3.a(g)).a(jc.e, $$3.a(h))));
   }

   private void A() {
      fsm $$0 = b(fsx.a(dnq.fX));
      fsm $$1 = b(fsx.a(dnq.fX, "_filled"));
      this.i.accept(fsq.a(dnq.fX).a(fsr.a(ecg.k).a(false, $$0).a(true, $$1)).a(y));
   }

   private void B() {
      fsm $$0 = b(fsx.a(dnq.la, "_side"));
      gtj $$1 = a(fsx.a(dnq.la, "_noside"));
      gtj $$2 = a(fsx.a(dnq.la, "_noside1"));
      gtj $$3 = a(fsx.a(dnq.la, "_noside2"));
      gtj $$4 = a(fsx.a(dnq.la, "_noside3"));
      gtj $$5 = $$1.a(b);
      gtj $$6 = $$2.a(b);
      gtj $$7 = $$3.a(b);
      gtj $$8 = $$4.a(b);
      this.i
         .accept(
            fsp.a(dnq.la)
               .a(b().a(ecg.N, true), $$0)
               .a(b().a(ecg.O, true), $$0.a(f).a(b))
               .a(b().a(ecg.P, true), $$0.a(g).a(b))
               .a(b().a(ecg.Q, true), $$0.a(h).a(b))
               .a(b().a(ecg.L, true), $$0.a(e).a(b))
               .a(b().a(ecg.M, true), $$0.a(c).a(b))
               .a(b().a(ecg.N, false), new fsm(btm.a(new btl<>($$1, 2), new btl<>($$2, 1), new btl<>($$3, 1), new btl<>($$4, 1))))
               .a(b().a(ecg.O, false), new fsm(btm.a(new btl<>($$6.a(f), 1), new btl<>($$7.a(f), 1), new btl<>($$8.a(f), 1), new btl<>($$5.a(f), 2))))
               .a(b().a(ecg.P, false), new fsm(btm.a(new btl<>($$7.a(g), 1), new btl<>($$8.a(g), 1), new btl<>($$5.a(g), 2), new btl<>($$6.a(g), 1))))
               .a(b().a(ecg.Q, false), new fsm(btm.a(new btl<>($$8.a(h), 1), new btl<>($$5.a(h), 2), new btl<>($$6.a(h), 1), new btl<>($$7.a(h), 1))))
               .a(b().a(ecg.L, false), new fsm(btm.a(new btl<>($$5.a(e), 2), new btl<>($$8.a(e), 1), new btl<>($$6.a(e), 1), new btl<>($$7.a(e), 1))))
               .a(b().a(ecg.M, false), new fsm(btm.a(new btl<>($$8.a(c), 1), new btl<>($$7.a(c), 1), new btl<>($$6.a(c), 1), new btl<>($$5.a(c), 2))))
         );
   }

   private void C() {
      this.i
         .accept(
            fsp.a(dnq.pK)
               .a(b(fta.J(dnq.pK)))
               .a(b().a(ecg.aO, 1), b(fta.a(dnq.pK, "_contents1")))
               .a(b().a(ecg.aO, 2), b(fta.a(dnq.pK, "_contents2")))
               .a(b().a(ecg.aO, 3), b(fta.a(dnq.pK, "_contents3")))
               .a(b().a(ecg.aO, 4), b(fta.a(dnq.pK, "_contents4")))
               .a(b().a(ecg.aO, 5), b(fta.a(dnq.pK, "_contents5")))
               .a(b().a(ecg.aO, 6), b(fta.a(dnq.pK, "_contents6")))
               .a(b().a(ecg.aO, 7), b(fta.a(dnq.pK, "_contents7")))
               .a(b().a(ecg.aO, 8), b(fta.a(dnq.pK, "_contents_ready")))
         );
   }

   private void A(dno $$0) {
      fsm $$1 = b(fsz.c.a($$0, fta.a($$0), this.k));
      fsm $$2 = b(this.a($$0, "_powered", fsz.c, fta::b));
      fsm $$3 = b(this.a($$0, "_lit", fsz.c, fta::b));
      fsm $$4 = b(this.a($$0, "_lit_powered", fsz.c, fta::b));
      this.i.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static fsn a(dno $$0, fsm $$1, fsm $$2, fsm $$3, fsm $$4) {
      return fsq.a($$0).a(fsr.a(ecg.u, ecg.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dno $$0, dno $$1) {
      fsm $$2 = b(fsx.a($$0));
      fsm $$3 = b(fsx.a($$0, "_powered"));
      fsm $$4 = b(fsx.a($$0, "_lit"));
      fsm $$5 = b(fsx.a($$0, "_lit_powered"));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dno $$0) {
      fsm $$1 = b(fsz.ao.a($$0, fta.c($$0), this.k));
      this.i.accept(fsq.a($$0, $$1).a(w));
   }

   private void D() {
      this.B(dnq.rg);
      this.B(dnq.rf);
      this.B(dnq.re);
      this.B(dnq.rd);
   }

   private void E() {
      fsr.b<fsm, jc, ecn> $$0 = fsr.a(ecg.bp, ecg.bq);

      for (ecn $$1 : ecn.values()) {
         $$0.a(jc.b, $$1, this.a(jc.b, $$1));
      }

      for (ecn $$2 : ecn.values()) {
         $$0.a(jc.a, $$2, this.a(jc.a, $$2));
      }

      this.i.accept(fsq.a(dnq.tb).a($$0));
   }

   private fsm a(jc $$0, ecn $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fta $$3 = fta.c(fta.a(dnq.tb, $$2));
      return b(fsz.an.a(dnq.tb, $$2, $$3, this.k));
   }

   private void C(dno $$0) {
      fta $$1 = new fta().a(ftb.e, fta.J(dnq.em)).a(ftb.f, fta.J($$0)).a(ftb.i, fta.a($$0, "_side"));
      this.i.accept(a($$0, b(fsz.n.a($$0, $$1, this.k))));
   }

   private void F() {
      alr $$0 = fta.a(dnq.hA, "_side");
      fta $$1 = new fta().a(ftb.f, fta.a(dnq.hA, "_top")).a(ftb.i, $$0);
      fta $$2 = new fta().a(ftb.f, fta.a(dnq.hA, "_inverted_top")).a(ftb.i, $$0);
      this.i.accept(fsq.a(dnq.hA).a(fsr.a(ecg.s).a(false, b(fsz.aM.a(dnq.hA, $$1, this.k))).a(true, b(fsz.aM.a(fsx.a(dnq.hA, "_inverted"), $$2, this.k)))));
   }

   private void D(dno $$0) {
      this.i.accept(fsq.a($$0, b(fsx.a($$0))).a(w));
   }

   private void G() {
      dno $$0 = dnq.ta;
      fsm $$1 = b(fsx.a($$0, "_on"));
      fsm $$2 = b(fsx.a($$0));
      this.i.accept(fsq.a($$0).a(a(ecg.A, $$1, $$2)).a(w));
   }

   private void H() {
      fta $$0 = new fta().a(ftb.C, fta.J(dnq.j)).a(ftb.f, fta.J(dnq.cN));
      fta $$1 = new fta().a(ftb.C, fta.J(dnq.j)).a(ftb.f, fta.a(dnq.cN, "_moist"));
      fsm $$2 = b(fsz.bd.a(dnq.cN, $$0, this.k));
      fsm $$3 = b(fsz.bd.a(fta.a(dnq.cN, "_moist"), $$1, this.k));
      this.i.accept(fsq.a(dnq.cN).a(a(ecg.aT, 7, $$3, $$2)));
   }

   private fsm E(dno $$0) {
      return a(a(fsz.be.a(fsx.a($$0, "_floor0"), fta.y($$0), this.k)), a(fsz.be.a(fsx.a($$0, "_floor1"), fta.z($$0), this.k)));
   }

   private fsm F(dno $$0) {
      return a(
         a(fsz.bf.a(fsx.a($$0, "_side0"), fta.y($$0), this.k)),
         a(fsz.bf.a(fsx.a($$0, "_side1"), fta.z($$0), this.k)),
         a(fsz.bg.a(fsx.a($$0, "_side_alt0"), fta.y($$0), this.k)),
         a(fsz.bg.a(fsx.a($$0, "_side_alt1"), fta.z($$0), this.k))
      );
   }

   private fsm G(dno $$0) {
      return a(
         a(fsz.bh.a(fsx.a($$0, "_up0"), fta.y($$0), this.k)),
         a(fsz.bh.a(fsx.a($$0, "_up1"), fta.z($$0), this.k)),
         a(fsz.bi.a(fsx.a($$0, "_up_alt0"), fta.y($$0), this.k)),
         a(fsz.bi.a(fsx.a($$0, "_up_alt1"), fta.z($$0), this.k))
      );
   }

   private void I() {
      fso $$0 = b().a(ecg.N, false).a(ecg.O, false).a(ecg.P, false).a(ecg.Q, false).a(ecg.L, false);
      fsm $$1 = this.E(dnq.cB);
      fsm $$2 = this.F(dnq.cB);
      fsm $$3 = this.G(dnq.cB);
      this.i
         .accept(
            fsp.a(dnq.cB)
               .a($$0, $$1)
               .a(a(b().a(ecg.N, true), $$0), $$2)
               .a(a(b().a(ecg.O, true), $$0), $$2.a(f))
               .a(a(b().a(ecg.P, true), $$0), $$2.a(g))
               .a(a(b().a(ecg.Q, true), $$0), $$2.a(h))
               .a(b().a(ecg.L, true), $$3)
         );
   }

   private void J() {
      fsm $$0 = this.E(dnq.cC);
      fsm $$1 = this.F(dnq.cC);
      this.i.accept(fsp.a(dnq.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dno $$0) {
      fsm $$1 = b(ftc.x.create($$0, this.k));
      fsm $$2 = b(ftc.y.create($$0, this.k));
      this.b($$0.h());
      this.i.accept(fsq.a($$0).a(a(ecg.m, $$2, $$1)));
   }

   private void K() {
      fta $$0 = fta.a(fta.a(dnq.ah, "_side"), fta.a(dnq.ah, "_top"));
      fsm $$1 = b(fsz.j.a(dnq.ah, $$0, this.k));
      this.i.accept(b(dnq.ah, $$1));
   }

   private void L() {
      this.b(dao.af);
      dno $$0 = dnq.H;
      fsm $$1 = b(fsx.a($$0));
      this.i.accept(fsq.a(dnq.H).a(fsr.a(dsp.d, dsp.b).a(($$2, $$3) -> $$2 ? b(fsx.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.i
         .accept(
            fsq.a(dnq.lo)
               .a(
                  fsr.a(ecg.av)
                     .a(0, b(this.a(dnq.lo, "_0", fsz.c, fta::b)))
                     .a(1, b(this.a(dnq.lo, "_1", fsz.c, fta::b)))
                     .a(2, b(this.a(dnq.lo, "_2", fsz.c, fta::b)))
                     .a(3, b(this.a(dnq.lo, "_3", fsz.c, fta::b)))
               )
         );
   }

   private void N() {
      alr $$0 = fta.J(dnq.j);
      fta $$1 = new fta().a(ftb.e, $$0).b(ftb.e, ftb.c).a(ftb.f, fta.a(dnq.i, "_top")).a(ftb.i, fta.a(dnq.i, "_snow"));
      fsm $$2 = b(fsz.n.a(dnq.i, "_snow", $$1, this.k));
      alr $$3 = fsx.a(dnq.i);
      this.f(dnq.i, b(a($$3)), $$2);
      this.a(dnq.i, $$3, new frz());
      fsm $$4 = b(a(ftc.f.get(dnq.fE).a($$1x -> $$1x.a(ftb.e, $$0)).a(dnq.fE, this.k)));
      this.f(dnq.fE, $$4, $$2);
      fsm $$5 = b(a(ftc.f.get(dnq.l).a($$1x -> $$1x.a(ftb.e, $$0)).a(dnq.l, this.k)));
      this.f(dnq.l, $$5, $$2);
   }

   private void f(dno $$0, fsm $$1, fsm $$2) {
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(dao.sp);
      this.i.accept(fsq.a(dnq.gb).a(fsr.a(ecg.au).a(0, b(fsx.a(dnq.gb, "_stage0"))).a(1, b(fsx.a(dnq.gb, "_stage1"))).a(2, b(fsx.a(dnq.gb, "_stage2")))).a(y));
   }

   private void P() {
      gtj $$0 = a(fsx.a(dnq.lk));
      this.i.accept(fsq.a(dnq.lk, b($$0)));
   }

   private void k(dno $$0, dno $$1) {
      fta $$2 = fta.b($$1);
      fsm $$3 = b(fsz.Y.a($$0, $$2, this.k));
      fsm $$4 = b(fsz.Z.a($$0, $$2, this.k));
      this.i.accept(fsq.a($$0).a(a(ecg.aW, 1, $$4, $$3)));
   }

   private void Q() {
      fsm $$0 = b(fsx.a(dnq.hD));
      fsm $$1 = b(fsx.a(dnq.hD, "_side"));
      this.b(dao.mv);
      this.i.accept(fsq.a(dnq.hD).a(fsr.a(ecg.S).a(jc.a, $$0).a(jc.c, $$1).a(jc.f, $$1.a(f)).a(jc.d, $$1.a(g)).a(jc.e, $$1.a(h))));
   }

   private void l(dno $$0, dno $$1) {
      fsm $$2 = b(fsx.a($$0));
      this.i.accept(fsq.a($$1, $$2));
      this.j.a($$0.h(), $$1.h());
   }

   private void R() {
      fsm $$0 = b(fsx.a(dnq.fo, "_post_ends"));
      fsm $$1 = b(fsx.a(dnq.fo, "_post"));
      fsm $$2 = b(fsx.a(dnq.fo, "_cap"));
      fsm $$3 = b(fsx.a(dnq.fo, "_cap_alt"));
      fsm $$4 = b(fsx.a(dnq.fo, "_side"));
      fsm $$5 = b(fsx.a(dnq.fo, "_side_alt"));
      this.i
         .accept(
            fsp.a(dnq.fo)
               .a($$0)
               .a(b().a(ecg.N, false).a(ecg.O, false).a(ecg.P, false).a(ecg.Q, false), $$1)
               .a(b().a(ecg.N, true).a(ecg.O, false).a(ecg.P, false).a(ecg.Q, false), $$2)
               .a(b().a(ecg.N, false).a(ecg.O, true).a(ecg.P, false).a(ecg.Q, false), $$2.a(f))
               .a(b().a(ecg.N, false).a(ecg.O, false).a(ecg.P, true).a(ecg.Q, false), $$3)
               .a(b().a(ecg.N, false).a(ecg.O, false).a(ecg.P, false).a(ecg.Q, true), $$3.a(f))
               .a(b().a(ecg.N, true), $$4)
               .a(b().a(ecg.O, true), $$4.a(f))
               .a(b().a(ecg.P, true), $$5)
               .a(b().a(ecg.Q, true), $$5.a(f))
         );
      this.c(dnq.fo);
   }

   private void I(dno $$0) {
      this.i.accept(fsq.a($$0, b(fsx.a($$0))).a(z));
   }

   private void S() {
      fsm $$0 = b(fsx.a(dnq.dL));
      fsm $$1 = b(fsx.a(dnq.dL, "_on"));
      this.c(dnq.dL);
      this.i
         .accept(
            fsq.a(dnq.dL)
               .a(a(ecg.A, $$0, $$1))
               .a(
                  fsr.b(ecg.X, ecg.T)
                     .a(ecb.c, jc.c, d.then(g))
                     .a(ecb.c, jc.f, d.then(h))
                     .a(ecb.c, jc.d, d)
                     .a(ecb.c, jc.e, d.then(f))
                     .a(ecb.a, jc.c, a)
                     .a(ecb.a, jc.f, f)
                     .a(ecb.a, jc.d, g)
                     .a(ecb.a, jc.e, h)
                     .a(ecb.b, jc.c, c)
                     .a(ecb.b, jc.f, c.then(f))
                     .a(ecb.b, jc.d, c.then(g))
                     .a(ecb.b, jc.e, c.then(h))
               )
         );
   }

   private void T() {
      alr $$0 = this.a(dao.gE, dnq.fF);
      this.a(dnq.fF, $$0, fsv.a(-9321636));
      gtj $$1 = a(fsx.a(dnq.fF));
      this.i.accept(fsq.a(dnq.fF, b($$1)));
   }

   private void U() {
      this.c(dnq.tX);
      this.i.accept(a(dnq.tX, b(fsx.a(dnq.tX))));
   }

   private void V() {
      this.i.accept(fsq.a(dnq.eu).a(fsr.a(ecg.J).a(jc.a.a, b(fsx.a(dnq.eu, "_ns"))).a(jc.a.c, b(fsx.a(dnq.eu, "_ew")))));
   }

   private void W() {
      gtj $$0 = a(ftc.a.create(dnq.em, this.k));
      this.i
         .accept(
            fsq.a(
               dnq.em,
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
      fsm $$0 = b(fsx.a(dnq.lu));
      fsm $$1 = b(fsx.a(dnq.lu, "_on"));
      this.i.accept(fsq.a(dnq.lu).a(a(ecg.A, $$1, $$0)).a(v));
   }

   private void Y() {
      fta $$0 = new fta().a(ftb.e, fta.a(dnq.bI, "_bottom")).a(ftb.i, fta.a(dnq.bI, "_side"));
      alr $$1 = fta.a(dnq.bI, "_top_sticky");
      alr $$2 = fta.a(dnq.bI, "_top");
      fta $$3 = $$0.c(ftb.F, $$1);
      fta $$4 = $$0.c(ftb.F, $$2);
      fsm $$5 = b(fsx.a(dnq.bI, "_base"));
      this.a(dnq.bI, $$5, $$4);
      this.a(dnq.by, $$5, $$3);
      alr $$6 = fsz.n.a(dnq.bI, "_inventory", $$0.c(ftb.f, $$2), this.k);
      alr $$7 = fsz.n.a(dnq.by, "_inventory", $$0.c(ftb.f, $$1), this.k);
      this.a(dnq.bI, $$6);
      this.a(dnq.by, $$7);
   }

   private void a(dno $$0, fsm $$1, fta $$2) {
      fsm $$3 = b(fsz.bs.a($$0, $$2, this.k));
      this.i.accept(fsq.a($$0).a(a(ecg.j, $$1, $$3)).a(v));
   }

   private void Z() {
      fta $$0 = new fta().a(ftb.G, fta.a(dnq.bI, "_top")).a(ftb.i, fta.a(dnq.bI, "_side"));
      fta $$1 = $$0.c(ftb.F, fta.a(dnq.bI, "_top_sticky"));
      fta $$2 = $$0.c(ftb.F, fta.a(dnq.bI, "_top"));
      this.i
         .accept(
            fsq.a(dnq.bJ)
               .a(
                  fsr.a(ecg.B, ecg.bj)
                     .a(false, ecs.a, b(fsz.bt.a(dnq.bI, "_head", $$2, this.k)))
                     .a(false, ecs.b, b(fsz.bt.a(dnq.bI, "_head_sticky", $$1, this.k)))
                     .a(true, ecs.a, b(fsz.bu.a(dnq.bI, "_head_short", $$2, this.k)))
                     .a(true, ecs.b, b(fsz.bu.a(dnq.bI, "_head_short_sticky", $$1, this.k)))
               )
               .a(v)
         );
   }

   private void aa() {
      dno $$0 = dnq.ub;
      fta $$1 = fta.a($$0, "_side_inactive", "_top_inactive");
      fta $$2 = fta.a($$0, "_side_active", "_top_active");
      fta $$3 = fta.a($$0, "_side_active", "_top_ejecting_reward");
      fta $$4 = fta.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fta $$5 = fta.a($$0, "_side_active_ominous", "_top_active_ominous");
      fta $$6 = fta.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      alr $$7 = fsz.o.a($$0, $$1, this.k);
      fsm $$8 = b($$7);
      fsm $$9 = b(fsz.o.a($$0, "_active", $$2, this.k));
      fsm $$10 = b(fsz.o.a($$0, "_ejecting_reward", $$3, this.k));
      fsm $$11 = b(fsz.o.a($$0, "_inactive_ominous", $$4, this.k));
      fsm $$12 = b(fsz.o.a($$0, "_active_ominous", $$5, this.k));
      fsm $$13 = b(fsz.o.a($$0, "_ejecting_reward_ominous", $$6, this.k));
      this.a($$0, $$7);
      this.i.accept(fsq.a($$0).a(fsr.a(ecg.bB, ecg.bE).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dno $$0 = dnq.uc;
      fta $$1 = fta.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fta $$2 = fta.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fta $$3 = fta.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fta $$4 = fta.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      alr $$5 = fsz.cb.a($$0, $$1, this.k);
      fsm $$6 = b($$5);
      fsm $$7 = b(fsz.cb.a($$0, "_active", $$2, this.k));
      fsm $$8 = b(fsz.cb.a($$0, "_unlocking", $$3, this.k));
      fsm $$9 = b(fsz.cb.a($$0, "_ejecting_reward", $$4, this.k));
      fta $$10 = fta.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fta $$11 = fta.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fta $$12 = fta.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fta $$13 = fta.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      fsm $$14 = b(fsz.cb.a($$0, "_ominous", $$10, this.k));
      fsm $$15 = b(fsz.cb.a($$0, "_active_ominous", $$11, this.k));
      fsm $$16 = b(fsz.cb.a($$0, "_unlocking_ominous", $$12, this.k));
      fsm $$17 = b(fsz.cb.a($$0, "_ejecting_reward_ominous", $$13, this.k));
      this.a($$0, $$5);
      this.i.accept(fsq.a($$0).a(fsr.a(dwz.b, dwz.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(z));
   }

   private void ac() {
      alr $$0 = fsx.a(dnq.ry, "_inactive");
      fsm $$1 = b($$0);
      fsm $$2 = b(fsx.a(dnq.ry, "_active"));
      this.a(dnq.ry, $$0);
      this.i.accept(fsq.a(dnq.ry).a(fsr.a(ecg.br).a($$2x -> $$2x != ecx.b && $$2x != ecx.c ? $$1 : $$2)));
   }

   private void ad() {
      alr $$0 = fsx.a(dnq.rz, "_inactive");
      fsm $$1 = b($$0);
      fsm $$2 = b(fsx.a(dnq.rz, "_active"));
      this.a(dnq.rz, $$0);
      this.i.accept(fsq.a(dnq.rz).a(fsr.a(ecg.br).a($$2x -> $$2x != ecx.b && $$2x != ecx.c ? $$1 : $$2)).a(z));
   }

   private void ae() {
      alr $$0 = fsz.ca.a(dnq.rD, fta.a(false), this.k);
      fsm $$1 = b($$0);
      fsm $$2 = b(fsz.ca.a(dnq.rD, "_can_summon", fta.a(true), this.k));
      this.a(dnq.rD, $$0);
      this.i.accept(fsq.a(dnq.rD).a(a(ecg.e, $$2, $$1)));
   }

   private void af() {
      alr $$0 = fsx.a(dnq.oy, "_stable");
      fsm $$1 = b($$0);
      fsm $$2 = b(fsx.a(dnq.oy, "_unstable"));
      this.a(dnq.oy, $$0);
      this.i.accept(fsq.a(dnq.oy).a(a(ecg.d, $$2, $$1)));
   }

   private void ag() {
      fsm $$0 = b(this.a(dnq.td, "", fsz.ao, fta::c));
      fsm $$1 = b(this.a(dnq.td, "_lit", fsz.ao, fta::c));
      this.i.accept(fsq.a(dnq.td).a(a(ecg.b, $$1, $$0)));
      fsm $$2 = b(this.a(dnq.te, "", fsz.ao, fta::c));
      fsm $$3 = b(this.a(dnq.te, "_lit", fsz.ao, fta::c));
      this.i.accept(fsq.a(dnq.te).a(a(ecg.b, $$3, $$2)));
   }

   private void ah() {
      fsm $$0 = b(ftc.a.create(dnq.ga, this.k));
      fsm $$1 = b(this.a(dnq.ga, "_on", fsz.c, fta::b));
      this.i.accept(fsq.a(dnq.ga).a(a(ecg.u, $$1, $$0)));
   }

   private void m(dno $$0, dno $$1) {
      fta $$2 = fta.B($$0);
      this.i.accept(a($$0, b(fsz.bm.a($$0, $$2, this.k))));
      this.i.accept(fsq.a($$1, b(fsz.bo.a($$1, $$2, this.k))).a(x));
      this.c($$0);
   }

   private void ai() {
      fta $$0 = fta.B(dnq.ea);
      fta $$1 = fta.i(fta.a(dnq.ea, "_off"));
      fsm $$2 = b(fsz.bq.a(dnq.ea, $$0, this.k));
      fsm $$3 = b(fsz.bn.a(dnq.ea, "_off", $$1, this.k));
      this.i.accept(fsq.a(dnq.ea).a(a(ecg.u, $$2, $$3)));
      fsm $$4 = b(fsz.br.a(dnq.eb, $$0, this.k));
      fsm $$5 = b(fsz.bp.a(dnq.eb, "_off", $$1, this.k));
      this.i.accept(fsq.a(dnq.eb).a(a(ecg.u, $$4, $$5)).a(x));
      this.c(dnq.ea);
   }

   private void aj() {
      this.b(dao.mo);
      this.i.accept(fsq.a(dnq.ey).a(fsr.a(ecg.aD, ecg.v, ecg.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(fta.a(dnq.ey, $$3.toString()));
      })).a(y));
   }

   private void ak() {
      this.b(dao.de);
      this.i
         .accept(
            fsq.a(dnq.nB)
               .a(
                  fsr.a(ecg.aV, ecg.I)
                     .a(1, false, b(a(fsx.a("dead_sea_pickle"))))
                     .a(2, false, b(a(fsx.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(fsx.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(fsx.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(fsx.a("sea_pickle"))))
                     .a(2, true, b(a(fsx.a("two_sea_pickles"))))
                     .a(3, true, b(a(fsx.a("three_sea_pickles"))))
                     .a(4, true, b(a(fsx.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      fta $$0 = fta.a(dnq.ed);
      fsm $$1 = b(fsz.c.a(dnq.ef, $$0, this.k));
      this.i.accept(fsq.a(dnq.ed).a(fsr.a(ecg.aI).a($$1x -> $$1x < 8 ? b(fsx.a(dnq.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dnq.ed, fsx.a(dnq.ed, "_height2"));
      this.i.accept(a(dnq.ef, $$1));
   }

   private void am() {
      this.i.accept(fsq.a(dnq.oI, b(fsx.a(dnq.oI))).a(z));
   }

   private void an() {
      alr $$0 = ftc.a.create(dnq.pG, this.k);
      this.a(dnq.pG, $$0);
      this.i.accept(fsq.a(dnq.pG).a(fsr.a(ecg.bm).a($$0x -> b(this.a(dnq.pG, "_" + $$0x.c(), fsz.c, fta::b)))));
   }

   private void ao() {
      Map<edb, alr> $$0 = new HashMap<>();

      for (edb $$1 : edb.values()) {
         $$0.put($$1, this.a(dnq.pI, "_" + $$1.c(), fsz.c, fta::b));
      }

      this.i.accept(fsq.a(dnq.pI).a(fsr.a(ecg.bF).a($$1x -> b($$0.get($$1x)))));
      this.j.a(dao.pa, fsv.a(dwi.b, fsv.a($$0.get(edb.a)), Map.of(edb.c, fsv.a($$0.get(edb.c)), edb.b, fsv.a($$0.get(edb.b)), edb.d, fsv.a($$0.get(edb.d)))));
   }

   private void ap() {
      this.b(dao.xG);
      this.i.accept(fsq.a(dnq.oO).a(fsr.a(ecg.av).a($$0 -> b(this.a(dnq.oO, "_stage" + $$0, fsz.ao, fta::c)))));
   }

   private void aq() {
      this.b(dao.qg);
      this.i
         .accept(
            fsq.a(dnq.gh)
               .a(
                  fsr.a(ecg.a, ecg.O, ecg.N, ecg.P, ecg.Q)
                     .a(false, false, false, false, false, b(fsx.a(dnq.gh, "_ns")))
                     .a(false, true, false, false, false, b(fsx.a(dnq.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(fsx.a(dnq.gh, "_n")))
                     .a(false, false, false, true, false, b(fsx.a(dnq.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(fsx.a(dnq.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(fsx.a(dnq.gh, "_ne")))
                     .a(false, true, false, true, false, b(fsx.a(dnq.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(fsx.a(dnq.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(fsx.a(dnq.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(fsx.a(dnq.gh, "_ns")))
                     .a(false, true, false, false, true, b(fsx.a(dnq.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(fsx.a(dnq.gh, "_nse")))
                     .a(false, true, false, true, true, b(fsx.a(dnq.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(fsx.a(dnq.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(fsx.a(dnq.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(fsx.a(dnq.gh, "_nsew")))
                     .a(true, false, false, false, false, b(fsx.a(dnq.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(fsx.a(dnq.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(fsx.a(dnq.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(fsx.a(dnq.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(fsx.a(dnq.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(fsx.a(dnq.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(fsx.a(dnq.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(fsx.a(dnq.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(fsx.a(dnq.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(fsx.a(dnq.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(fsx.a(dnq.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(fsx.a(dnq.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(fsx.a(dnq.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(fsx.a(dnq.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(fsx.a(dnq.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(fsx.a(dnq.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dnq.gg);
      this.i.accept(fsq.a(dnq.gg).a(fsr.a(ecg.a, ecg.A).a(($$0, $$1) -> b(fsx.a(dnq.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(z));
   }

   private gtj a(int $$0, String $$1, fta $$2) {
      return switch ($$0) {
         case 1 -> a(fsz.bw.a(fsx.a($$1 + "turtle_egg"), $$2, this.k));
         case 2 -> a(fsz.bx.a(fsx.a("two_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 3 -> a(fsz.by.a(fsx.a("three_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 4 -> a(fsz.bz.a(fsx.a("four_" + $$1 + "turtle_eggs"), $$2, this.k));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gtj a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", fta.b(fta.J(dnq.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", fta.b(fta.a(dnq.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", fta.b(fta.a(dnq.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(dao.kT);
      this.i.accept(fsq.a(dnq.mL).a(fsr.a(ecg.aG, ecg.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      this.b(dao.kU);
      this.i.accept(fsq.a(dnq.mM).a(fsr.a(dvg.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fta $$2 = fta.a($$1);
         return b(fsz.bH.a(dnq.mM, $$1, $$2, this.k));
      })));
   }

   private void J(dno $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dno $$0, dag $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends ect<?>> Map<T, gtk> a(ebs<?, ?> $$0, Function<jc, T> $$1) {
      Builder<T, gtk> $$2 = ImmutableMap.builderWithExpectedSize(C.size());
      C.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dno $$0) {
      Map<ect<Boolean>, gtk> $$1 = a($$0.m(), dsu::b);
      fso $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      fsm $$3 = b(fsx.a($$0));
      fsp $$4 = fsp.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.i.accept($$4);
   }

   private void L(dno $$0) {
      Map<ect<edd>, gtk> $$1 = a($$0.m(), dss::a);
      fso $$2 = b().a(dss.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, edd.a));
      fsm $$3 = b(ftc.j.create($$0, this.k));
      fsm $$4 = b(ftc.k.get($$0).a($$1x -> $$1x.a(ftb.i, fta.a($$0, "_side_tall"))).a($$0, "_side_tall", this.k));
      fsm $$5 = b(ftc.k.get($$0).a($$1x -> $$1x.a(ftb.i, fta.a($$0, "_side_small"))).a($$0, "_side_small", this.k));
      fsp $$6 = fsp.a($$0);
      $$6.a(b().a(dss.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, edd.c), $$4.a($$5x));
         $$6.a(b().a($$4x, edd.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.i.accept($$6);
   }

   private void M(dno $$0) {
      this.c($$0);
      this.i.accept(fsq.a($$0).a(fsr.a(drj.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         fta $$3 = fta.c(fta.a($$0, $$2));
         return b(fsh.d.b.a().a($$0, $$2, $$3, this.k));
      })));
   }

   private void au() {
      alr $$0 = fta.a(dnq.rC, "_bottom");
      fta $$1 = new fta().a(ftb.e, $$0).a(ftb.f, fta.a(dnq.rC, "_top")).a(ftb.i, fta.a(dnq.rC, "_side"));
      fta $$2 = new fta().a(ftb.e, $$0).a(ftb.f, fta.a(dnq.rC, "_top_bloom")).a(ftb.i, fta.a(dnq.rC, "_side_bloom"));
      alr $$3 = fsz.n.a(dnq.rC, $$1, this.k);
      fsm $$4 = b($$3);
      fsm $$5 = b(fsz.n.a(dnq.rC, "_bloom", $$2, this.k));
      this.i.accept(fsq.a(dnq.rC).a(fsr.a(ecg.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dnq.rC, $$3);
   }

   private void av() {
      dno $$0 = dnq.cw;
      fsm $$1 = b(fsx.a($$0));
      fsp $$2 = fsp.a($$0);
      List.of(Pair.of(jc.c, a), Pair.of(jc.f, f), Pair.of(jc.d, g), Pair.of(jc.e, h)).forEach($$2x -> {
         jc $$3 = (jc)$$2x.getFirst();
         gtk $$4 = (gtk)$$2x.getSecond();
         gtn $$5 = b().a(ecg.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.i.accept($$2);
      this.a($$0, fsx.a($$0, "_inventory"));
      D.clear();
   }

   private void a(fsp $$0, gtn $$1, gtk $$2) {
      List.of(
            Pair.of(ecg.bs, fsz.aT),
            Pair.of(ecg.bt, fsz.aU),
            Pair.of(ecg.bu, fsz.aV),
            Pair.of(ecg.bv, fsz.aW),
            Pair.of(ecg.bw, fsz.aX),
            Pair.of(ecg.bx, fsz.aY)
         )
         .forEach($$3 -> {
            ech $$4 = (ech)$$3.getFirst();
            fsy $$5 = (fsy)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fsp $$0, gtn $$1, gtk $$2, ech $$3, fsy $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fta $$7 = new fta().a(ftb.b, fta.a(dnq.cw, $$6));
      fsh.c $$8 = new fsh.c($$4, $$6);
      fsm $$9 = b(D.computeIfAbsent($$8, $$3x -> $$4.a(dnq.cw, $$6, $$7, this.k)));
      $$0.a(new gtm(gtm.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void aw() {
      fsm $$0 = b(fsz.c.a(dnq.lp, fta.b(fsx.a("magma")), this.k));
      this.i.accept(a(dnq.lp, $$0));
   }

   private void a(dno $$0, @Nullable czi $$1) {
      this.r($$0);
      dag $$2 = $$0.h();
      alr $$3 = fsz.bO.a($$2, fta.x($$0), this.k);
      hhf.b $$4 = $$1 != null ? fsv.a($$3, new hjs.a($$1)) : fsv.a($$3, new hjs.a());
      this.j.a($$2, $$4);
   }

   private void c(dno $$0, dno $$1, fsh.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ax() {
      alr $$0 = fsx.a(dnq.b);
      gtj $$1 = a($$0);
      gtj $$2 = a(fsx.a(dnq.b, "_mirrored"));
      this.i.accept(fsq.a(dnq.ff, a($$1, $$2)));
      this.a(dnq.ff, $$0);
   }

   private void ay() {
      alr $$0 = fsx.a(dnq.tt);
      gtj $$1 = a($$0);
      gtj $$2 = a(fsx.a(dnq.tt, "_mirrored"));
      this.i.accept(fsq.a(dnq.tN, a($$1, $$2)).a(c()));
      this.a(dnq.tN, $$0);
   }

   private void n(dno $$0, dno $$1) {
      this.a($$0, fsh.d.b);
      fta $$2 = fta.d(fta.a($$0, "_pot"));
      fsm $$3 = b(fsh.d.b.b().a($$1, $$2, this.k));
      this.i.accept(a($$1, $$3));
   }

   private void az() {
      alr $$0 = fta.a(dnq.pT, "_bottom");
      alr $$1 = fta.a(dnq.pT, "_top_off");
      alr $$2 = fta.a(dnq.pT, "_top");
      alr[] $$3 = new alr[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fta $$5 = new fta().a(ftb.e, $$0).a(ftb.f, $$4 == 0 ? $$1 : $$2).a(ftb.i, fta.a(dnq.pT, "_side" + $$4));
         $$3[$$4] = fsz.n.a(dnq.pT, "_" + $$4, $$5, this.k);
      }

      this.i.accept(fsq.a(dnq.pT).a(fsr.a(ecg.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dnq.pT, $$3[0]);
   }

   private static gtk a(je $$0) {
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
      alr $$0 = fta.a(dnq.pH, "_top");
      alr $$1 = fta.a(dnq.pH, "_bottom");
      alr $$2 = fta.a(dnq.pH, "_side");
      alr $$3 = fta.a(dnq.pH, "_lock");
      fta $$4 = new fta().a(ftb.o, $$2).a(ftb.m, $$2).a(ftb.l, $$2).a(ftb.c, $$0).a(ftb.j, $$0).a(ftb.k, $$1).a(ftb.n, $$3);
      this.i.accept(fsq.a(dnq.pH, b(fsz.b.a(dnq.pH, $$4, this.k))).a(fsr.b(ecg.W).a(fsh::a)));
   }

   private void aB() {
      dno $$0 = dnq.n;
      fsm $$1 = b(fsx.a($$0));
      fta $$2 = fta.a($$0);
      dno $$3 = dnq.kk;
      fsm $$4 = b(fsz.ab.a($$3, $$2, this.k));
      fsm $$5 = b(fsz.ac.a($$3, $$2, this.k));
      this.i.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dno $$0, dno $$1, dva.a $$2, alr $$3) {
      fsm $$4 = b(fsx.a("skull"));
      this.i.accept(a($$0, $$4));
      this.i.accept(a($$1, $$4));
      this.j.a($$0.h(), fsv.a($$3, new hjt.a($$2)));
   }

   private void aC() {
      alr $$0 = fsx.b("template_skull");
      this.a(dnq.hn, dnq.ho, dva.b.g, $$0);
      this.a(dnq.hl, dnq.hm, dva.b.e, $$0);
      this.a(dnq.hj, dnq.hk, dva.b.f, $$0);
      this.a(dnq.hf, dnq.hg, dva.b.c, $$0);
      this.a(dnq.hh, dnq.hi, dva.b.d, $$0);
      this.a(dnq.hr, dnq.hs, dva.b.h, $$0);
      this.a(dnq.hp, dnq.hq, dva.b.i, fsx.a(dao.vA));
   }

   private void a(dno $$0, dno $$1, czi $$2) {
      fsm $$3 = b(fsx.a("banner"));
      alr $$4 = fsx.b("template_banner");
      this.i.accept(a($$0, $$3));
      this.i.accept(a($$1, $$3));
      dag $$5 = $$0.h();
      this.j.a($$5, fsv.a($$4, new hjk.a($$2)));
   }

   private void aD() {
      this.a(dnq.jl, dnq.jB, czi.a);
      this.a(dnq.jm, dnq.jC, czi.b);
      this.a(dnq.jn, dnq.jD, czi.c);
      this.a(dnq.jo, dnq.jE, czi.d);
      this.a(dnq.jp, dnq.jF, czi.e);
      this.a(dnq.jq, dnq.jG, czi.f);
      this.a(dnq.jr, dnq.jH, czi.g);
      this.a(dnq.js, dnq.jI, czi.h);
      this.a(dnq.jt, dnq.jJ, czi.i);
      this.a(dnq.ju, dnq.jK, czi.j);
      this.a(dnq.jv, dnq.jL, czi.k);
      this.a(dnq.jw, dnq.jM, czi.l);
      this.a(dnq.jx, dnq.jN, czi.m);
      this.a(dnq.jy, dnq.jO, czi.n);
      this.a(dnq.jz, dnq.jP, czi.o);
      this.a(dnq.jA, dnq.jQ, czi.p);
   }

   private void a(dno $$0, dno $$1, alr $$2, boolean $$3) {
      this.a($$0, $$1);
      dag $$4 = $$0.h();
      alr $$5 = fsz.bQ.a($$4, fta.x($$1), this.k);
      hhf.b $$6 = fsv.a($$5, new hjm.a($$2));
      if ($$3) {
         hhf.b $$7 = fsv.a($$5, new hjm.a(hjm.a));
         this.j.a($$4, fsv.b($$7, $$6));
      } else {
         this.j.a($$4, $$6);
      }
   }

   private void aE() {
      this.a(dnq.cG, dnq.n, hjm.b, true);
      this.a(dnq.hw, dnq.n, hjm.c, true);
      this.a(dnq.gf, dnq.cy, hjm.d, false);
   }

   private void b(dno $$0, dno $$1, czi $$2) {
      fsm $$3 = b(fsx.a("bed"));
      this.i.accept(a($$0, $$3));
      dag $$4 = $$0.h();
      alr $$5 = fsz.bP.a(fsx.a($$4), fta.x($$1), this.k);
      this.j.a($$4, fsv.a($$5, new hjl.a($$2)));
   }

   private void aF() {
      this.b(dnq.bg, dnq.bK, czi.a);
      this.b(dnq.bh, dnq.bL, czi.b);
      this.b(dnq.bi, dnq.bM, czi.c);
      this.b(dnq.bj, dnq.bN, czi.d);
      this.b(dnq.bk, dnq.bO, czi.e);
      this.b(dnq.bl, dnq.bP, czi.f);
      this.b(dnq.bm, dnq.bQ, czi.g);
      this.b(dnq.bn, dnq.bR, czi.h);
      this.b(dnq.bo, dnq.bS, czi.i);
      this.b(dnq.bp, dnq.bT, czi.j);
      this.b(dnq.bq, dnq.bU, czi.k);
      this.b(dnq.br, dnq.bV, czi.l);
      this.b(dnq.bs, dnq.bW, czi.m);
      this.b(dnq.bt, dnq.bX, czi.n);
      this.b(dnq.bu, dnq.bY, czi.o);
      this.b(dnq.bv, dnq.bZ, czi.p);
   }

   private void a(dno $$0, hju.a $$1) {
      dag $$2 = $$0.h();
      alr $$3 = fsx.a($$2);
      this.j.a($$2, fsv.a($$3, $$1));
   }

   public void a() {
      mk.a().filter(ml::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dnq.rN).a(mk.x).a(dnq.rN, dnq.sl).a(dnq.rR, dnq.rV).a(mk.z);
      this.i(dnq.rM).a(mk.B).a(dnq.rM, dnq.sk).a(dnq.rQ, dnq.rU).a(mk.D);
      this.i(dnq.rL).a(mk.F).a(dnq.rL, dnq.sj).a(dnq.rP, dnq.rT).a(mk.H);
      this.i(dnq.rK).a(mk.J).a(dnq.rK, dnq.si).a(dnq.rO, dnq.rS).a(mk.L);
      this.A(dnq.sS);
      this.A(dnq.sT);
      this.A(dnq.sU);
      this.A(dnq.sV);
      this.j(dnq.sS, dnq.sW);
      this.j(dnq.sT, dnq.sX);
      this.j(dnq.sU, dnq.sY);
      this.j(dnq.sV, dnq.sZ);
      this.n(dnq.a);
      this.d(dnq.nI, dnq.a);
      this.d(dnq.nH, dnq.a);
      this.n(dnq.gn);
      this.n(dnq.eg);
      this.d(dnq.nJ, dnq.J);
      this.n(dnq.fZ);
      this.n(dnq.mK);
      this.n(dnq.fQ);
      this.n(dnq.gq);
      this.b(dao.vo);
      this.n(dnq.pO);
      this.n(dnq.J);
      this.n(dnq.K);
      this.n(dnq.ix);
      this.b(dao.go);
      this.o(dnq.qu, dnq.qL);
      this.o(dnq.qv, dnq.qM);
      this.o(dnq.qw, dnq.qN);
      this.o(dnq.qx, dnq.qO);
      this.o(dnq.qy, dnq.qP);
      this.o(dnq.qz, dnq.qQ);
      this.o(dnq.qA, dnq.qR);
      this.o(dnq.qB, dnq.qS);
      this.o(dnq.qC, dnq.qT);
      this.o(dnq.qD, dnq.qU);
      this.o(dnq.qE, dnq.qV);
      this.o(dnq.qF, dnq.qW);
      this.o(dnq.qG, dnq.qX);
      this.o(dnq.qH, dnq.qY);
      this.o(dnq.qI, dnq.qZ);
      this.o(dnq.qJ, dnq.ra);
      this.o(dnq.qt, dnq.qK);
      this.n(dnq.nG);
      this.n(dnq.gS);
      this.n(dnq.rx);
      this.n(dnq.tf);
      this.w(dnq.tg);
      this.w(dnq.th);
      this.x(dnq.tS);
      this.x(dnq.tT);
      this.ag();
      this.h(dnq.tm, dnq.ti);
      this.L(dnq.uf);
      this.M(dnq.ug);
      this.a(dnq.ue);
      this.t(dnq.tj);
      this.t(dnq.tk);
      this.s(dnq.tl);
      this.b(dnq.ul, fsh.d.c);
      this.b(dao.da);
      this.a(dnq.iy, dao.if);
      this.b(dao.if);
      this.aG();
      this.a(dnq.lt, dao.jF);
      this.b(dao.jF);
      this.b(dnq.ca, fta.a(dnq.bI, "_side"));
      this.a(dnq.U);
      this.a(dnq.V);
      this.a(dnq.jd);
      this.a(dnq.cI);
      this.a(dnq.cJ);
      this.a(dnq.cK);
      this.a(dnq.gd);
      this.a(dnq.ge);
      this.a(dnq.gi);
      this.a(dnq.Q);
      this.a(dnq.W);
      this.a(dnq.R);
      this.a(dnq.cr);
      this.a(dnq.S);
      this.a(dnq.T);
      this.a(dnq.cs);
      this.b(dnq.pR, ftc.d);
      this.a(dnq.pQ);
      this.a(dnq.aY);
      this.a(dnq.aZ);
      this.a(dnq.ba);
      this.a(dnq.fG);
      this.a(dnq.hC);
      this.a(dnq.dY);
      this.a(dnq.dZ);
      this.a(dnq.hB);
      this.a(dnq.qk);
      this.a(dnq.nC);
      this.a(dnq.ei);
      this.a(dnq.k);
      this.a(dnq.pS);
      this.a(dnq.fY);
      this.a(dnq.et);
      this.a(dnq.O);
      this.a(dnq.pP);
      this.a(dnq.ee);
      this.b(dnq.ek, ftc.g);
      this.b(dnq.pY, ftc.d);
      this.b(dnq.fs, ftc.d);
      this.n(dnq.ag);
      this.n(dnq.gA);
      this.a(dnq.lq);
      this.a(dnq.bf);
      this.a(dnq.je);
      this.a(dnq.cy);
      this.a(dnq.qs);
      this.a(dnq.iK);
      this.a(dnq.pe);
      this.a(dnq.en);
      this.a(dnq.eo);
      this.b(dnq.cD, ftc.b);
      this.g(dnq.cE);
      this.a(dnq.aV);
      this.b(dnq.bG, ftc.z);
      this.b(dao.dd);
      this.b(dnq.cu, ftc.f);
      this.b(dnq.pL, ftc.d);
      this.a(dnq.oV);
      this.a(dnq.aW);
      this.a(dnq.rb);
      this.a(dnq.rc);
      this.a(dnq.rv);
      this.a(dnq.tc);
      this.a(dnq.tP);
      this.a(dnq.tQ);
      this.a(dnq.tR);
      this.d(dnq.rA);
      this.n(dnq.ud);
      this.aB();
      this.a(dnq.rI);
      this.a(dnq.rJ);
      this.a(dnq.rE);
      this.a(dnq.rF);
      this.a(dnq.rG);
      this.a(dnq.rH);
      this.l(dnq.rE, dnq.se);
      this.l(dnq.rF, dnq.sg);
      this.l(dnq.rG, dnq.sf);
      this.l(dnq.rH, dnq.sh);
      this.j(dnq.su);
      this.j(dnq.sv);
      this.j(dnq.sx);
      this.j(dnq.sw);
      this.b(dnq.su, dnq.sy);
      this.b(dnq.sv, dnq.sz);
      this.b(dnq.sx, dnq.sB);
      this.b(dnq.sw, dnq.sA);
      this.l(dnq.sC);
      this.l(dnq.sD);
      this.l(dnq.sF);
      this.l(dnq.sE);
      this.c(dnq.sC, dnq.sG);
      this.c(dnq.sD, dnq.sH);
      this.c(dnq.sF, dnq.sJ);
      this.c(dnq.sE, dnq.sI);
      this.a(dnq.sK);
      this.a(dnq.sL);
      this.a(dnq.sM);
      this.a(dnq.sN);
      this.l(dnq.sK, dnq.sO);
      this.l(dnq.sL, dnq.sP);
      this.l(dnq.sM, dnq.sQ);
      this.l(dnq.sN, dnq.sR);
      this.k(dnq.hx, dnq.cr);
      this.k(dnq.hy, dnq.cs);
      this.D();
      this.o();
      this.av();
      this.s();
      this.t();
      this.a(dnq.oM, dnq.oN);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dnq.kZ);
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
      this.a(dnq.pJ);
      this.aq();
      this.ar();
      this.as();
      this.at();
      this.d();
      this.J(dnq.fy);
      this.J(dnq.rB);
      this.b(dnq.fz, dao.gt);
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
      this.I(dnq.da);
      this.c(dnq.da);
      this.I(dnq.oG);
      this.e();
      this.I(dnq.to);
      this.m(dnq.cz, dnq.cA);
      this.m(dnq.er, dnq.es);
      this.a(dnq.cL, dnq.n, fta::c);
      this.a(dnq.oE, dnq.p, fta::d);
      this.C(dnq.pc);
      this.C(dnq.oT);
      this.z(dnq.bb);
      this.z(dnq.hJ);
      this.z();
      this.H(dnq.oK);
      this.H(dnq.oL);
      this.c(dnq.fp, b(fsx.a(dnq.fp)));
      this.a(dnq.ep, ftc.d);
      this.a(dnq.eq, ftc.d);
      this.a(dnq.tO);
      this.a(dnq.ls, ftc.d);
      this.e(dnq.j);
      this.e(dnq.tr);
      this.e(dnq.L);
      this.f(dnq.M);
      this.f(dnq.P);
      this.e(dnq.N);
      this.d(dnq.I);
      this.b(dnq.tY, ftc.f);
      this.a(dnq.iL, ftc.d, ftc.e);
      this.a(dnq.ld, ftc.A, ftc.B);
      this.a(dnq.hG, ftc.A, ftc.B);
      this.a(dnq.tU, ftc.d, ftc.e);
      this.a(dnq.tV, ftc.d, ftc.e);
      this.a(dnq.tW, ftc.d, ftc.e);
      this.c(dnq.oz, ftc.i);
      this.w();
      this.a(dnq.pM, fta::D);
      this.a(dnq.pN, fta::F);
      this.a(dnq.lj, ecg.av, 0, 1, 2, 3);
      this.a(dnq.gT, ecg.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dnq.fP, ecg.av, 0, 1, 1, 2);
      this.a(dnq.gU, ecg.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dnq.cM, ecg.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dnq.lg, fsh.d.b, ecg.at, 0, 1);
      this.g();
      this.f();
      this.aD();
      this.aF();
      this.aC();
      this.aE();
      this.a(dnq.lv, null);
      this.a(dnq.lw, czi.a);
      this.a(dnq.lx, czi.b);
      this.a(dnq.ly, czi.c);
      this.a(dnq.lz, czi.d);
      this.a(dnq.lA, czi.e);
      this.a(dnq.lB, czi.f);
      this.a(dnq.lC, czi.g);
      this.a(dnq.lD, czi.h);
      this.a(dnq.lE, czi.i);
      this.a(dnq.lF, czi.j);
      this.a(dnq.lG, czi.k);
      this.a(dnq.lH, czi.l);
      this.a(dnq.lI, czi.m);
      this.a(dnq.lJ, czi.n);
      this.a(dnq.lK, czi.o);
      this.a(dnq.lL, czi.p);
      this.r(dnq.nD);
      this.a(dnq.nD, new hjn.a());
      this.a(dnq.tZ, dnq.jc);
      this.a(dnq.tZ, new hjo.a());
      this.a(dnq.fW, dnq.cy);
      this.a(dnq.ll, dnq.cy);
      this.a(dnq.aT);
      this.a(dnq.aU);
      this.a(dnq.mc);
      this.a(dnq.md);
      this.a(dnq.me);
      this.a(dnq.mf);
      this.a(dnq.mg);
      this.a(dnq.mh);
      this.a(dnq.mi);
      this.a(dnq.mj);
      this.a(dnq.mk);
      this.a(dnq.ml);
      this.a(dnq.mm);
      this.a(dnq.mn);
      this.a(dnq.mo);
      this.a(dnq.mp);
      this.a(dnq.mq);
      this.a(dnq.mr);
      this.a(ftc.a, dnq.ms, dnq.mt, dnq.mu, dnq.mv, dnq.mw, dnq.mx, dnq.my, dnq.mz, dnq.mA, dnq.mB, dnq.mC, dnq.mD, dnq.mE, dnq.mF, dnq.mG, dnq.mH);
      this.a(dnq.jc);
      this.a(dnq.hK);
      this.a(dnq.hL);
      this.a(dnq.hM);
      this.a(dnq.hN);
      this.a(dnq.hO);
      this.a(dnq.hP);
      this.a(dnq.hQ);
      this.a(dnq.hR);
      this.a(dnq.hS);
      this.a(dnq.hT);
      this.a(dnq.hU);
      this.a(dnq.hV);
      this.a(dnq.hW);
      this.a(dnq.hX);
      this.a(dnq.hY);
      this.a(dnq.hZ);
      this.a(dnq.rw);
      this.i(dnq.aX, dnq.fq);
      this.i(dnq.ez, dnq.ia);
      this.i(dnq.eA, dnq.ib);
      this.i(dnq.eB, dnq.ic);
      this.i(dnq.eC, dnq.id);
      this.i(dnq.eD, dnq.ie);
      this.i(dnq.eE, dnq.if);
      this.i(dnq.eF, dnq.ig);
      this.i(dnq.eG, dnq.ih);
      this.i(dnq.eH, dnq.ii);
      this.i(dnq.eI, dnq.ij);
      this.i(dnq.eJ, dnq.ik);
      this.i(dnq.eK, dnq.il);
      this.i(dnq.eL, dnq.im);
      this.i(dnq.eM, dnq.in);
      this.i(dnq.eN, dnq.io);
      this.i(dnq.eO, dnq.ip);
      this.b(ftc.t, dnq.lM, dnq.lN, dnq.lO, dnq.lP, dnq.lQ, dnq.lR, dnq.lS, dnq.lT, dnq.lU, dnq.lV, dnq.lW, dnq.lX, dnq.lY, dnq.lZ, dnq.ma, dnq.mb);
      this.h(dnq.bK, dnq.iM);
      this.h(dnq.bL, dnq.iN);
      this.h(dnq.bM, dnq.iO);
      this.h(dnq.bN, dnq.iP);
      this.h(dnq.bO, dnq.iQ);
      this.h(dnq.bP, dnq.iR);
      this.h(dnq.bQ, dnq.iS);
      this.h(dnq.bR, dnq.iT);
      this.h(dnq.bS, dnq.iU);
      this.h(dnq.bT, dnq.iV);
      this.h(dnq.bU, dnq.iW);
      this.h(dnq.bV, dnq.iX);
      this.h(dnq.bW, dnq.iY);
      this.h(dnq.bX, dnq.iZ);
      this.h(dnq.bY, dnq.ja);
      this.h(dnq.bZ, dnq.jb);
      this.a(dnq.ts);
      this.a(dnq.fd);
      this.b(dnq.bB, dnq.gB, fsh.d.a);
      this.h(dnq.bB);
      this.a(dnq.cb, dnq.gC, fsh.d.b);
      this.a(dnq.cd, dnq.gD, fsh.d.b);
      this.a(dnq.uh, dnq.uj, fsh.d.c);
      this.a(dnq.ui, dnq.uk, fsh.d.b);
      this.a(dnq.ce, dnq.gE, fsh.d.b);
      this.a(dnq.cf, dnq.gF, fsh.d.b);
      this.a(dnq.cg, dnq.gG, fsh.d.b);
      this.a(dnq.ch, dnq.gH, fsh.d.b);
      this.a(dnq.ci, dnq.gI, fsh.d.b);
      this.a(dnq.cj, dnq.gJ, fsh.d.b);
      this.a(dnq.ck, dnq.gK, fsh.d.b);
      this.a(dnq.cl, dnq.gL, fsh.d.b);
      this.a(dnq.cm, dnq.gM, fsh.d.b);
      this.a(dnq.co, dnq.gN, fsh.d.b);
      this.a(dnq.cn, dnq.gO, fsh.d.b);
      this.a(dnq.cq, dnq.gP, fsh.d.b);
      this.a(dnq.cp, dnq.gQ, fsh.d.b);
      this.a(dnq.bC, dnq.gR, fsh.d.b);
      this.a(dnq.cc, dnq.gr, fsh.d.b);
      this.E();
      this.y(dnq.fl);
      this.y(dnq.fm);
      this.y(dnq.fn);
      this.b(dnq.bA, fsh.d.a);
      this.h(dnq.bA);
      this.a(dnq.bE, fsh.d.b);
      this.a(dnq.bF, fsh.d.b);
      this.b(dnq.bD, fsh.d.a);
      this.h(dnq.bD);
      this.b(dnq.ej, fsh.d.a);
      this.b(dao.dW);
      this.c(dnq.mI, dnq.mJ, fsh.d.b);
      this.b(dao.dX);
      this.b(dnq.tq, fsh.d.b);
      this.c(dnq.pf, dnq.pg, fsh.d.b);
      this.c(dnq.ph, dnq.pi, fsh.d.b);
      this.a(dnq.pf, "_plant");
      this.a(dnq.ph, "_plant");
      this.a(dnq.nE, fsh.d.a, fta.c(fta.a(dnq.nF, "_stage0")));
      this.k();
      this.a(dnq.eh, fsh.d.b);
      this.a(dnq.bz, fsh.d.b);
      this.d(dnq.jg, fsh.d.b);
      this.d(dnq.jh, fsh.d.b);
      this.d(dnq.ji, fsh.d.b);
      this.o(dnq.jj);
      this.o(dnq.jk);
      this.h();
      this.i();
      this.j();
      this.a(dnq.nc, dnq.mX, dnq.mS, dnq.mN, dnq.nm, dnq.nh, dnq.nw, dnq.nr);
      this.a(dnq.nd, dnq.mY, dnq.mT, dnq.mO, dnq.nn, dnq.ni, dnq.nx, dnq.ns);
      this.a(dnq.ne, dnq.mZ, dnq.mU, dnq.mP, dnq.no, dnq.nj, dnq.ny, dnq.nt);
      this.a(dnq.nf, dnq.na, dnq.mV, dnq.mQ, dnq.np, dnq.nk, dnq.nz, dnq.nu);
      this.a(dnq.ng, dnq.nb, dnq.mW, dnq.mR, dnq.nq, dnq.nl, dnq.nA, dnq.nv);
      this.f(dnq.fw, dnq.fu);
      this.f(dnq.fv, dnq.ft);
      this.m(dnq.af).c(dnq.af).a(dnq.aA);
      this.m(dnq.ar).c(dnq.ar).a(dnq.aJ);
      this.a(dnq.ar, dnq.dx, dnq.dH);
      this.a(dnq.aS, ftc.w, -7158200);
      this.m(dnq.ab).c(dnq.ab).a(dnq.ax);
      this.m(dnq.am).c(dnq.am).a(dnq.aF);
      this.a(dnq.am, dnq.dq, dnq.dC);
      this.a(dnq.D, dnq.gw, fsh.d.b);
      this.a(dnq.aO, ftc.w, -12012264);
      this.m(dnq.ac).d(dnq.ac).a(dnq.ay);
      this.m(dnq.an).d(dnq.an).a(dnq.aG);
      this.a(dnq.an, dnq.dr, dnq.dD);
      this.a(dnq.E, dnq.gx, fsh.d.b);
      this.b(dnq.aP, ftc.w);
      this.m(dnq.Z).c(dnq.Z).a(dnq.av);
      this.m(dnq.ak).c(dnq.ak).a(dnq.aD);
      this.a(dnq.ak, dnq.dp, dnq.dB);
      this.a(dnq.B, dnq.gu, fsh.d.b);
      this.a(dnq.aM, ftc.w, -8345771);
      this.m(dnq.X).c(dnq.X).a(dnq.at);
      this.m(dnq.aq).c(dnq.aq).a(dnq.aB);
      this.a(dnq.aq, dnq.dn, dnq.dz);
      this.a(dnq.z, dnq.gs, fsh.d.b);
      this.a(dnq.aK, ftc.w, -12012264);
      this.m(dnq.Y).c(dnq.Y).a(dnq.au);
      this.m(dnq.aj).c(dnq.aj).a(dnq.aC);
      this.a(dnq.aj, dnq.do, dnq.dA);
      this.a(dnq.A, dnq.gt, fsh.d.b);
      this.a(dnq.aL, ftc.w, -10380959);
      this.m(dnq.ad).c(dnq.ad).a(dnq.az);
      this.m(dnq.ao).c(dnq.ao).a(dnq.aH);
      this.a(dnq.ao, dnq.dt, dnq.dF);
      this.a(dnq.F, dnq.gy, fsh.d.b);
      this.a(dnq.aQ, ftc.w, -12012264);
      this.m(dnq.ae).c(dnq.ae).a(dnq.u);
      this.m(dnq.ap).c(dnq.ap).a(dnq.aI);
      this.a(dnq.ap, dnq.du, dnq.dG);
      this.a(dnq.G, dnq.gz, fsh.d.b);
      this.b(dnq.aR, ftc.w);
      this.m(dnq.aa).c(dnq.aa).a(dnq.aw);
      this.m(dnq.al).c(dnq.al).a(dnq.aE);
      this.a(dnq.al, dnq.ds, dnq.dE);
      this.a(dnq.C, dnq.gv, fsh.d.b);
      this.a(dnq.aN, ftc.w, -12012264);
      this.m(dnq.oY).b(dnq.oY).a(dnq.pa);
      this.m(dnq.oZ).b(dnq.oZ).a(dnq.pb);
      this.a(dnq.oZ, dnq.dv, dnq.dI);
      this.a(dnq.pd, dnq.pU, fsh.d.b);
      this.n(dnq.pj, dnq.pW);
      this.m(dnq.oP).b(dnq.oP).a(dnq.oR);
      this.m(dnq.oQ).b(dnq.oQ).a(dnq.oS);
      this.a(dnq.oQ, dnq.dw, dnq.dJ);
      this.a(dnq.oU, dnq.pV, fsh.d.b);
      this.n(dnq.oW, dnq.pX);
      this.m(dnq.ai).d(dnq.ai);
      this.m(dnq.as).d(dnq.as);
      this.a(dnq.x, dnq.dy, dnq.dK);
      this.b(dnq.oX, fsh.d.b);
      this.b(dao.dT);
      this.j(dnq.dN);
      this.l(dnq.iA);
      this.r();
      this.p(dnq.db);
      this.q(dnq.bw);
      this.q(dnq.bx);
      this.q(dnq.hI);
      this.q();
      this.u(dnq.gm);
      this.u(dnq.lm);
      this.u(dnq.ln);
      this.v(dnq.ht);
      this.v(dnq.hu);
      this.v(dnq.hv);
      this.l();
      this.m();
      this.d(dnq.cO, ftc.h);
      this.d(dnq.oC, ftc.h);
      this.d(dnq.oB, ftc.i);
      this.p();
      this.az();
      this.au();
      this.l(dnq.fc, dnq.fk);
      this.l(dnq.m, dnq.fg);
      this.l(dnq.fb, dnq.fj);
      this.l(dnq.fa, dnq.fi);
      this.ax();
      this.l(dnq.eZ, dnq.fh);
      this.ay();
   }

   private void aG() {
      hhf.b $$0 = fsv.a(this.a(dao.ig));
      Map<Integer, hhf.b> $$1 = new HashMap<>(16);
      fsr.a<fsm, Integer> $$2 = fsr.a(ecg.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         alr $$5 = fta.a(dao.ig, $$4);
         $$2.a($$3, b(fsz.aa.a(dnq.iz, $$4, fta.h($$5), this.k)));
         hhf.b $$6 = fsv.a(fsz.bI.a(fsx.a(dao.ig, $$4), fta.k($$5), this.k));
         $$1.put($$3, $$6);
      }

      this.j.a(dao.ig, fsv.a(dsi.c, $$0, $$1));
      this.i.accept(fsq.a(dnq.iz).a($$2));
   }

   private void o(dno $$0, dno $$1) {
      this.b($$0.h());
      fta $$2 = fta.b(fta.J($$0));
      fta $$3 = fta.b(fta.a($$0, "_lit"));
      fsm $$4 = b(fsz.bV.a($$0, "_one_candle", $$2, this.k));
      fsm $$5 = b(fsz.bW.a($$0, "_two_candles", $$2, this.k));
      fsm $$6 = b(fsz.bX.a($$0, "_three_candles", $$2, this.k));
      fsm $$7 = b(fsz.bY.a($$0, "_four_candles", $$2, this.k));
      fsm $$8 = b(fsz.bV.a($$0, "_one_candle_lit", $$3, this.k));
      fsm $$9 = b(fsz.bW.a($$0, "_two_candles_lit", $$3, this.k));
      fsm $$10 = b(fsz.bX.a($$0, "_three_candles_lit", $$3, this.k));
      fsm $$11 = b(fsz.bY.a($$0, "_four_candles_lit", $$3, this.k));
      this.i
         .accept(
            fsq.a($$0)
               .a(
                  fsr.a(ecg.aC, ecg.u)
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
      fsm $$12 = b(fsz.bZ.a($$1, fta.a($$0, false), this.k));
      fsm $$13 = b(fsz.bZ.a($$1, "_lit", fta.a($$0, true), this.k));
      this.i.accept(fsq.a($$1).a(a(ecg.u, $$13, $$12)));
   }

   class a {
      private final fta b;
      private final Map<fsy, alr> c = new HashMap<>();
      @Nullable
      private ml d;
      @Nullable
      private gtj e;
      private final Set<dno> f = new HashSet<>();

      public a(final fta $$0) {
         this.b = $$0;
      }

      public fsh.a a(dno $$0, fsy $$1) {
         this.e = fsh.a($$1.a($$0, this.b, fsh.this.k));
         if (fsh.u.containsKey($$0)) {
            fsh.this.i.accept(fsh.u.get($$0).create($$0, this.e, this.b, fsh.this.k));
         } else {
            fsh.this.i.accept(fsh.a($$0, fsh.a(this.e)));
         }

         return this;
      }

      public fsh.a a(dno $$0, dno $$1) {
         alr $$2 = fsx.a($$0);
         fsh.this.i.accept(fsh.a($$1, fsh.b($$2)));
         fsh.this.j.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fsh.a a(dno $$0) {
         fsm $$1 = fsh.b(fsz.s.a($$0, this.b, fsh.this.k));
         fsm $$2 = fsh.b(fsz.t.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$1, $$2));
         alr $$3 = fsz.u.a($$0, this.b, fsh.this.k);
         fsh.this.a($$0, $$3);
         return this;
      }

      public fsh.a b(dno $$0) {
         fsm $$1 = fsh.b(fsz.M.a($$0, this.b, fsh.this.k));
         fsm $$2 = fsh.b(fsz.N.a($$0, this.b, fsh.this.k));
         fsm $$3 = fsh.b(fsz.O.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$1, $$2, $$3));
         alr $$4 = fsz.P.a($$0, this.b, fsh.this.k);
         fsh.this.a($$0, $$4);
         return this;
      }

      public fsh.a c(dno $$0) {
         fta $$1 = fta.s($$0);
         fsm $$2 = fsh.b(fsz.D.a($$0, $$1, fsh.this.k));
         fsm $$3 = fsh.b(fsz.E.a($$0, $$1, fsh.this.k));
         fsm $$4 = fsh.b(fsz.F.a($$0, $$1, fsh.this.k));
         fsm $$5 = fsh.b(fsz.G.a($$0, $$1, fsh.this.k));
         fsm $$6 = fsh.b(fsz.H.a($$0, $$1, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$2, $$3, $$4, $$5, $$6));
         alr $$7 = fsz.I.a($$0, $$1, fsh.this.k);
         fsh.this.a($$0, $$7);
         return this;
      }

      public fsh.a d(dno $$0) {
         fsm $$1 = fsh.b(fsz.J.a($$0, this.b, fsh.this.k));
         fsm $$2 = fsh.b(fsz.K.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.b($$0, $$1, $$2));
         alr $$3 = fsz.L.a($$0, this.b, fsh.this.k);
         fsh.this.a($$0, $$3);
         return this;
      }

      public fsh.a e(dno $$0) {
         fta $$1 = fta.s($$0);
         fsm $$2 = fsh.b(fsz.R.a($$0, $$1, fsh.this.k));
         fsm $$3 = fsh.b(fsz.Q.a($$0, $$1, fsh.this.k));
         fsm $$4 = fsh.b(fsz.T.a($$0, $$1, fsh.this.k));
         fsm $$5 = fsh.b(fsz.S.a($$0, $$1, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fsh.a f(dno $$0) {
         fsm $$1 = fsh.b(fsz.V.a($$0, this.b, fsh.this.k));
         fsm $$2 = fsh.b(fsz.U.a($$0, this.b, fsh.this.k));
         fsm $$3 = fsh.b(fsz.X.a($$0, this.b, fsh.this.k));
         fsm $$4 = fsh.b(fsz.W.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fsh.a g(dno $$0) {
         fsm $$1 = fsh.b(fsz.Y.a($$0, this.b, fsh.this.k));
         fsm $$2 = fsh.b(fsz.Z.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.d($$0, $$1, $$2));
         return this;
      }

      public fsh.a h(dno $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dno $$1 = this.d.b().get(ml.b.r);
            fsm $$2 = fsh.b(fsz.aa.a($$0, this.b, fsh.this.k));
            fsh.this.i.accept(fsh.a($$0, $$2));
            fsh.this.i.accept(fsh.a($$1, $$2));
            fsh.this.b($$0.h());
            return this;
         }
      }

      public fsh.a i(dno $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            alr $$1 = this.a(fsz.ab, $$0);
            fsm $$2 = fsh.b(this.a(fsz.ac, $$0));
            fsh.this.i.accept(fsh.e($$0, fsh.b($$1), $$2, fsh.a(this.e)));
            fsh.this.a($$0, $$1);
            return this;
         }
      }

      public fsh.a j(dno $$0) {
         fsm $$1 = fsh.b(this.a(fsz.af, $$0));
         alr $$2 = this.a(fsz.ae, $$0);
         fsm $$3 = fsh.b(this.a(fsz.ag, $$0));
         fsh.this.i.accept(fsh.b($$0, $$1, fsh.b($$2), $$3));
         fsh.this.a($$0, $$2);
         return this;
      }

      private fsh.a k(dno $$0) {
         ftc $$1 = fsh.A.getOrDefault($$0, ftc.a.get($$0));
         fsm $$2 = fsh.b($$1.a($$0, fsh.this.k));
         fsh.this.i.accept(fsh.a($$0, $$2));
         return this;
      }

      private fsh.a l(dno $$0) {
         fsh.this.j($$0);
         return this;
      }

      private void m(dno $$0) {
         if (fsh.l.contains($$0)) {
            fsh.this.l($$0);
         } else {
            fsh.this.k($$0);
         }
      }

      private alr a(fsy $$0, dno $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fsh.this.k));
      }

      public fsh.a a(ml $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fsh.a, dno> $$2 = fsh.B.get($$0x);
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
      fsn create(dno var1, gtj var2, fta var3, BiConsumer<alr, fsw> var4);
   }

   static record c(fsy a, String b) {
   }

   static enum d {
      a(fsz.ap, fsz.as, false),
      b(fsz.ao, fsz.ar, false),
      c(fsz.aq, fsz.at, true);

      private final fsy d;
      private final fsy e;
      private final boolean f;

      private d(final fsy $$0, final fsy $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fsy a() {
         return this.d;
      }

      public fsy b() {
         return this.e;
      }

      public alr a(fsh $$0, dno $$1) {
         dag $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fta a(dno $$0) {
         return this.f ? fta.e($$0) : fta.c($$0);
      }

      public fta b(dno $$0) {
         return this.f ? fta.g($$0) : fta.f($$0);
      }
   }

   class e {
      private final fta b;

      public e(final fta $$0) {
         this.b = $$0;
      }

      public fsh.e a(dno $$0) {
         fta $$1 = this.b.c(ftb.d, this.b.a(ftb.i));
         alr $$2 = fsz.j.a($$0, $$1, fsh.this.k);
         fsh.this.i.accept(fsh.b($$0, fsh.b($$2)));
         fsh.this.a($$0, $$2);
         return this;
      }

      public fsh.e b(dno $$0) {
         alr $$1 = fsz.j.a($$0, this.b, fsh.this.k);
         fsh.this.i.accept(fsh.b($$0, fsh.b($$1)));
         fsh.this.a($$0, $$1);
         return this;
      }

      public fsh.e c(dno $$0) {
         alr $$1 = fsz.j.a($$0, this.b, fsh.this.k);
         fsm $$2 = fsh.b(fsz.k.a($$0, this.b, fsh.this.k));
         fsh.this.i.accept(fsh.c($$0, fsh.b($$1), $$2));
         fsh.this.a($$0, $$1);
         return this;
      }

      public fsh.e d(dno $$0) {
         fsh.this.i.accept(fsh.a($$0, this.b, fsh.this.k));
         fsh.this.a($$0, fsz.j.a($$0, this.b, fsh.this.k));
         return this;
      }
   }
}
