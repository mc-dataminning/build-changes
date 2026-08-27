import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class chj {
   public static final int a = 8;
   public static final int b = 4;
   public static final cqf c = cqn.oH;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 119;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bmn d = axv.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bmn o = axv.a(10, 40);
   private static final bmn p = axv.a(10, 30);
   private static final bmn q = axv.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bmn A = axv.a(5, 7);
   private static final bmn B = axv.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bqp<?> a(chi $$0, bqp<chi> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(ckh.a));
      $$1.b(ckh.b);
      $$1.f();
      return $$1;
   }

   protected static void a(chi $$0, axd $$1) {
      int $$2 = d.a($$1);
      $$0.dP().a(byr.ah, true, (long)$$2);
   }

   private static void a(bqp<chi> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bsm(45, 90), new bsq(), bse.a(), e(), f(), chs.a(), cho.a(119), btt.a(300, chj::a), btw.a()));
   }

   private static void b(bqp<chi> $$0) {
      $$0.a(ckh.b, 10, ImmutableList.of(btf.a(chj::b, 14.0F), bts.a(chh::go, chj::i), but.a(chi::r, chp.a()), d(), g(), b(), c(), bti.a(bpc.bx, 4)));
   }

   private static void b(chi $$0, bqp<chi> $$1) {
      $$1.a(
         ckh.k,
         10,
         ImmutableList.of(btv.a($$1x -> !b($$0, $$1x)), but.a(chj::c, bre.a(5, 0.75F)), btl.a(1.0F), bsn.a(20), new bro(), chn.a(), brs.a(chj::h, byr.o)),
         byr.o
      );
   }

   private static void c(bqp<chi> $$0) {
      $$0.a(
         ckh.l,
         10,
         ImmutableList.of(
            d(),
            btf.a(chj::b, 14.0F),
            bts.a(chh::go, chj::i),
            but.a($$0x -> !$$0x.gv(), brz.a(byr.ai, 2, 1.0F)),
            but.a(chi::gv, brz.a(byr.ai, 4, 0.6F)),
            new btd(ImmutableList.of(Pair.of(btf.a(bpc.az, 8.0F), 1), Pair.of(bsy.a(0.6F, 2, 1), 1), Pair.of(new brq(10, 20), 1)))
         ),
         byr.ai
      );
   }

   private static void d(bqp<chi> $$0) {
      $$0.a(ckh.m, 10, ImmutableList.of(bsa.a(chj::v, 1.0F, true, 9), chq.a(9), chr.a(200, 200)), byr.ad);
   }

   private static void e(bqp<chi> $$0) {
      $$0.a(ckh.n, 10, ImmutableList.of(btk.b(byr.z, 1.0F, 12, true), b(), c(), brs.a(chj::l, byr.z)), byr.z);
   }

   private static void f(bqp<chi> $$0) {
      $$0.a(
         ckh.o,
         10,
         ImmutableList.of(
            bso.a(0.8F),
            btf.a(chj::b, 8.0F),
            but.a(but.a(bow::bO), buc.a(ImmutableList.builder().addAll(a()).add(Pair.of(but.a((Predicate<chi>)($$0x -> true)), 1)).build())),
            brp.a(8, chj::a)
         ),
         byr.s
      );
   }

   private static ImmutableList<Pair<bsr<bpo>, Integer>> a() {
      return ImmutableList.of(Pair.of(btf.a(bpc.bx, 8.0F), 1), Pair.of(btf.a(bpc.az, 8.0F), 1), Pair.of(btf.a(8.0F), 1));
   }

   private static btd<bpo> b() {
      return new btd<>(ImmutableList.builder().addAll(a()).add(Pair.of(new brq(30, 60), 1)).build());
   }

   private static btd<chi> c() {
      return new btd<>(
         ImmutableList.of(
            Pair.of(bsy.a(0.6F), 2), Pair.of(bsd.a(bpc.az, 8, byr.q, 0.6F, 2), 2), Pair.of(but.a(chj::f, btn.a(0.6F, 3)), 2), Pair.of(new brq(30, 60), 1)
         )
      );
   }

   private static brh<bpw> d() {
      return btk.a(byr.aw, 1.0F, 8, false);
   }

   private static brh<chi> e() {
      return brl.a(chi::o_, byr.M, byr.z, B);
   }

   private static brh<chi> f() {
      return brl.a(chj::h, byr.ar, byr.z, A);
   }

   protected static void a(chi $$0) {
      bqp<chi> $$1 = $$0.dP();
      ckh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ckh.m, ckh.k, ckh.n, ckh.l, ckh.o, ckh.b));
      ckh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(byr.o));
      if (!$$1.a(byr.s) && f($$0)) {
         $$0.ac();
      }

      if (!$$1.a(byr.ai)) {
         $$1.b(byr.aj);
      }

      $$0.x($$1.a(byr.aj));
   }

   private static boolean f(chi $$0) {
      if (!$$0.o_()) {
         return false;
      } else {
         bow $$1 = $$0.cZ();
         return $$1 instanceof chi && ((chi)$$1).o_() || $$1 instanceof chc && ((chc)$$1).o_();
      }
   }

   protected static void a(chi $$0, cfd $$1) {
      k($$0);
      cqk $$2;
      if ($$1.p().a(cqn.sh)) {
         $$0.a($$1, $$1.p().M());
         $$2 = $$1.p();
         $$1.am();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dP().b(byr.ae);
         c($$0, $$2);
         d((bpo)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cqk.h);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(chi $$0, cqk $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bnb.b));
      }

      $$0.q($$1);
   }

   private static cqk a(cfd $$0) {
      cqk $$1 = $$0.p();
      cqk $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.am();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(chi $$0, boolean $$1) {
      cqk $$2 = $$0.b(bnb.b);
      $$0.a(bnb.b, cqk.h);
      if ($$0.go()) {
         boolean $$3 = b($$2);
         if ($$1 && $$3) {
            a($$0, g($$0));
         } else if (!$$3) {
            boolean $$4 = !$$0.i($$2).b();
            if (!$$4) {
               d($$0, $$2);
            }
         }
      } else {
         boolean $$5 = !$$0.i($$2).b();
         if (!$$5) {
            cqk $$6 = $$0.eU();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.p($$2);
         }
      }
   }

   protected static void b(chi $$0) {
      if (r($$0) && !$$0.eV().b()) {
         $$0.b($$0.eV());
         $$0.a(bnb.b, cqk.h);
      }
   }

   private static void d(chi $$0, cqk $$1) {
      cqk $$2 = $$0.n($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(chi $$0, List<cqk> $$1) {
      Optional<cis> $$2 = $$0.dP().c(byr.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(chi $$0, List<cqk> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(chi $$0, cis $$1, List<cqk> $$2) {
      a($$0, $$2, $$1.dk());
   }

   private static void a(chi $$0, List<cqk> $$1, epr $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bnb.b);

         for (cqk $$3 : $$1) {
            bri.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cqk> g(chi $$0) {
      elc $$1 = $$0.dM().o().aM().getLootTable(eks.aL);
      List<cqk> $$2 = $$1.a(new ela.a((apf)$$0.dM()).a(enf.a, $$0).a(ene.j));
      return $$2;
   }

   private static boolean a(bpo $$0, bpo $$1) {
      return $$1.ai() != bpc.Z ? false : axd.a($$0.dM().X()).i() < 0.1F;
   }

   protected static boolean a(chi $$0, cqk $$1) {
      if ($$0.o_() && $$1.a(auv.V)) {
         return false;
      } else if ($$1.a(auv.T)) {
         return false;
      } else if (t($$0) && $$0.dP().a(byr.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.o($$1);
         if ($$1.a(cqn.sh)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.r($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cqk $$0) {
      return $$0.a(auv.U);
   }

   private static boolean a(chi $$0, bow $$1) {
      return !($$1 instanceof bpq $$2) ? false : !$$2.o_() || !$$2.bA() || g((bpo)$$0) || g($$2) || $$2 instanceof chi && $$2.cZ() == null;
   }

   private static boolean b(chi $$0, bpo $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(chi $$0) {
      bqp<chi> $$1 = $$0.dP();
      if ($$1.a(byr.ar)) {
         bpo $$2 = $$1.c(byr.ar).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bpo> i(chi $$0) {
      bqp<chi> $$1 = $$0.dP();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bpo> $$2 = bri.a($$0, byr.ab);
         if ($$2.isPresent() && bzx.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(byr.ac)) {
               Optional<cis> $$3 = $$1.c(byr.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bpq> $$4 = $$1.c(byr.M);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<cis> $$5 = $$1.c(byr.am);
               return $$5.isPresent() && bzx.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(cis $$0, boolean $$1) {
      List<chi> $$2 = $$0.dM().a(chi.class, $$0.cH().g(16.0));
      $$2.stream().filter(chj::d).filter($$2x -> !$$1 || bri.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dM().Z().b(cwv.O)) {
            d((chh)$$1x, $$0);
         } else {
            c((chh)$$1x, $$0);
         }
      });
   }

   public static bnc a(chi $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cqk $$4 = $$3.a(1);
         c($$0, $$4);
         d((bpo)$$0);
         k($$0);
         return bnc.b;
      } else {
         return bnc.d;
      }
   }

   protected static boolean b(chi $$0, cqk $$1) {
      return !t($$0) && !r($$0) && $$0.go() && b($$1);
   }

   protected static void a(chi $$0, bpo $$1) {
      if (!($$1 instanceof chi)) {
         if (u($$0)) {
            a($$0, false);
         }

         bqp<chi> $$2 = $$0.dP();
         $$2.b(byr.ai);
         $$2.b(byr.aj);
         $$2.b(byr.ad);
         if ($$1 instanceof cis) {
            $$2.a(byr.ag, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ai() != $$1.ai()) {
               $$2.b(byr.z);
            }
         });
         if ($$0.o_()) {
            $$2.a(byr.z, $$1, 100L);
            if (bzx.d($$0, $$1)) {
               b((chh)$$0, $$1);
            }
         } else if ($$1.ai() == bpc.Z && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((chh)$$0, $$1);
         }
      }
   }

   protected static void a(chh $$0, bpo $$1) {
      if (!$$0.dP().c(ckh.n)) {
         if (bzx.d($$0, $$1)) {
            if (!bri.a($$0, $$1, 4.0)) {
               if ($$1.ai() == bpc.bx && $$0.dM().Z().b(cwv.O)) {
                  d($$0, $$1);
                  a($$0);
               } else {
                  c($$0, $$1);
                  b($$0, $$1);
               }
            }
         }
      }
   }

   public static Optional<atx> c(chi $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static atx a(chi $$0, ckh $$1) {
      if ($$1 == ckh.k) {
         return aty.td;
      } else if ($$0.gn()) {
         return aty.ti;
      } else if ($$1 == ckh.n && j($$0)) {
         return aty.ti;
      } else if ($$1 == ckh.m) {
         return aty.tb;
      } else if ($$1 == ckh.l) {
         return aty.te;
      } else if (e((bpo)$$0)) {
         return aty.tg;
      } else {
         return s($$0) ? aty.ti : aty.tc;
      }
   }

   private static boolean j(chi $$0) {
      bqp<chi> $$1 = $$0.dP();
      return !$$1.a(byr.z) ? false : $$1.c(byr.z).get().a($$0, 12.0);
   }

   protected static List<chh> d(chi $$0) {
      return $$0.dP().c(byr.ao).orElse(ImmutableList.of());
   }

   private static List<chh> e(chh $$0) {
      return $$0.dP().c(byr.an).orElse(ImmutableList.of());
   }

   public static boolean a(bpo $$0) {
      for (cqk $$2 : $$0.eY()) {
         cqf $$3 = $$2.d();
         if ($$3 instanceof cnw && ((cnw)$$3).f().a(cny.d)) {
            return true;
         }
      }

      return false;
   }

   private static void k(chi $$0) {
      $$0.dP().b(byr.m);
      $$0.K().n();
   }

   private static brh<bpo> g() {
      btg.a $$0 = new btg.a(o);
      return brl.a($$1 -> $$1.o_() && $$0.a($$1.dM().z), byr.al, byr.s, p);
   }

   protected static void b(chh $$0, bpo $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ai() != bpc.Z || $$1x.r() && ((chc)$$1).gt()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(chh $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(chh $$0, bpo $$1) {
      if (bzx.d($$0, $$1)) {
         $$0.dP().b(byr.E);
         $$0.dP().a(byr.ab, $$1.cw(), 600L);
         if ($$1.ai() == bpc.Z && $$0.r()) {
            c($$0);
         }

         if ($$1.ai() == bpc.bx && $$0.dM().Z().b(cwv.O)) {
            $$0.dP().a(byr.ac, true, 600L);
         }
      }
   }

   private static void d(chh $$0, bpo $$1) {
      Optional<cis> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(chh $$0, bpo $$1) {
      Optional<bpo> $$2 = f($$0);
      bpo $$3 = bri.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bpo> f(chh $$0) {
      return bri.a($$0, byr.ab);
   }

   public static Optional<bpo> e(chi $$0) {
      return $$0.dP().a(byr.z) ? $$0.dP().c(byr.z) : Optional.empty();
   }

   public static Optional<cis> b(chh $$0) {
      return $$0.dP().a(byr.l) ? $$0.dP().c(byr.l) : Optional.empty();
   }

   private static void c(chi $$0, bpo $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof chi).forEach($$1x -> d((chi)$$1x, $$1));
   }

   private static void d(chi $$0, bpo $$1) {
      bqp<chi> $$2 = $$0.dP();
      bpo $$3 = bri.a($$0, $$2.c(byr.z), $$1);
      $$3 = bri.a($$0, $$2.c(byr.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(chi $$0) {
      bqp<chi> $$1 = $$0.dP();
      if (!$$1.a(byr.z)) {
         return true;
      } else {
         bpo $$2 = $$1.c(byr.z).get();
         bpc<?> $$3 = $$2.ai();
         if ($$3 == bpc.Z) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(byr.ar, $$2) : false;
         }
      }
   }

   private static boolean m(chi $$0) {
      return !n($$0);
   }

   private static boolean n(chi $$0) {
      int $$1 = $$0.dP().c(byr.as).orElse(0) + 1;
      int $$2 = $$0.dP().c(byr.at).orElse(0);
      return $$2 > $$1;
   }

   private static void e(chi $$0, bpo $$1) {
      $$0.dP().b(byr.ab);
      $$0.dP().b(byr.o);
      $$0.dP().b(byr.m);
      $$0.dP().a(byr.z, $$1, (long)q.a($$0.dM().z));
      c((chh)$$0);
   }

   protected static void c(chh $$0) {
      $$0.dP().a(byr.ah, true, (long)d.a($$0.dM().z));
   }

   private static void o(chi $$0) {
      $$0.dP().a(byr.av, true, 200L);
   }

   private static epr p(chi $$0) {
      epr $$1 = cal.a($$0, 4, 2);
      return $$1 == null ? $$0.dk() : $$1;
   }

   private static boolean q(chi $$0) {
      return $$0.dP().a(byr.av);
   }

   protected static boolean d(chh $$0) {
      return $$0.dP().c(ckh.b);
   }

   private static boolean c(bpo $$0) {
      return $$0.b(cqn.vQ);
   }

   private static void d(bpo $$0) {
      $$0.dP().a(byr.ad, true, 119L);
   }

   private static boolean r(chi $$0) {
      return $$0.dP().a(byr.ad);
   }

   private static boolean b(cqk $$0) {
      return $$0.a(c);
   }

   private static boolean c(cqk $$0) {
      return $$0.a(auv.W);
   }

   private static boolean s(chi $$0) {
      return $$0.dP().a(byr.aw);
   }

   private static boolean e(bpo $$0) {
      return $$0.dP().a(byr.au);
   }

   private static boolean f(bpo $$0) {
      return !e($$0);
   }

   public static boolean b(bpo $$0) {
      return $$0.ai() == bpc.bx && $$0.b(chj::a);
   }

   private static boolean t(chi $$0) {
      return $$0.dP().a(byr.ag);
   }

   private static boolean g(bpo $$0) {
      return $$0.dP().a(byr.x);
   }

   private static boolean u(chi $$0) {
      return !$$0.eV().b();
   }

   private static boolean v(chi $$0) {
      return $$0.eV().b() || !a($$0.eV());
   }

   public static boolean a(bpc<?> $$0) {
      return $$0 == bpc.bw || $$0 == bpc.bs;
   }
}
