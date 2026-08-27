import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class bxf {
   public static final int a = 8;
   public static final int b = 4;
   public static final cfu c = cgc.nU;
   private static final int e = 16;
   private static final int f = 600;
   private static final int g = 120;
   private static final int h = 9;
   private static final int i = 200;
   private static final int j = 200;
   private static final int k = 300;
   protected static final bdi d = apw.a(30, 120);
   private static final int l = 100;
   private static final int m = 400;
   private static final int n = 8;
   private static final bdi o = apw.a(10, 40);
   private static final bdi p = apw.a(10, 30);
   private static final bdi q = apw.a(5, 20);
   private static final int r = 20;
   private static final int s = 200;
   private static final int t = 12;
   private static final int u = 8;
   private static final int v = 14;
   private static final int w = 8;
   private static final int x = 5;
   private static final float y = 0.75F;
   private static final int z = 6;
   private static final bdi A = apw.a(5, 7);
   private static final bdi B = apw.a(5, 7);
   private static final float C = 0.1F;
   private static final float D = 1.0F;
   private static final float E = 1.0F;
   private static final float F = 0.8F;
   private static final float G = 1.0F;
   private static final float H = 1.0F;
   private static final float I = 0.6F;
   private static final float J = 0.6F;

   protected static bha<?> a(bxe $$0, bha<bxe> $$1) {
      a($$1);
      b($$1);
      d($$1);
      b($$0, $$1);
      c($$1);
      e($$1);
      f($$1);
      $$1.a(ImmutableSet.of(bzz.a));
      $$1.b(bzz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(bxe $$0, apf $$1) {
      int $$2 = d.a($$1);
      $$0.dK().a(bpb.ag, true, (long)$$2);
   }

   private static void a(bha<bxe> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new biw(45, 90), new bja(), bip.a(), e(), f(), bxo.a(), bxk.a(120), bkd.a(300, bxf::a), bkg.a()));
   }

   private static void b(bha<bxe> $$0) {
      $$0.a(bzz.b, 10, ImmutableList.of(bjp.a(bxf::b, 14.0F), bkc.a(bxd::fZ, bxf::i), bld.a(bxe::q, bxl.a()), d(), g(), b(), c(), bjs.a(bfn.bt, 4)));
   }

   private static void b(bxe $$0, bha<bxe> $$1) {
      $$1.a(
         bzz.k,
         10,
         ImmutableList.of(bkf.a($$1x -> !b($$0, $$1x)), bld.a(bxf::c, bhp.a(5, 0.75F)), bjv.a(1.0F), bix.a(20), new bhz(), bxj.a(), bid.a(bxf::h, bpb.o)),
         bpb.o
      );
   }

   private static void c(bha<bxe> $$0) {
      $$0.a(
         bzz.l,
         10,
         ImmutableList.of(
            d(),
            bjp.a(bxf::b, 14.0F),
            bkc.a(bxd::fZ, bxf::i),
            bld.a($$0x -> !$$0x.gg(), bik.a(bpb.ah, 2, 1.0F)),
            bld.a(bxe::gg, bik.a(bpb.ah, 4, 0.6F)),
            new bjn(ImmutableList.of(Pair.of(bjp.a(bfn.aw, 8.0F), 1), Pair.of(bji.a(0.6F, 2, 1), 1), Pair.of(new bib(10, 20), 1)))
         ),
         bpb.ah
      );
   }

   private static void d(bha<bxe> $$0) {
      $$0.a(bzz.m, 10, ImmutableList.of(bil.a(bxf::v, 1.0F, true, 9), bxm.a(9), bxn.a(200, 200)), bpb.ac);
   }

   private static void e(bha<bxe> $$0) {
      $$0.a(bzz.n, 10, ImmutableList.of(bju.b(bpb.z, 1.0F, 12, true), b(), c(), bid.a(bxf::l, bpb.z)), bpb.z);
   }

   private static void f(bha<bxe> $$0) {
      $$0.a(
         bzz.o,
         10,
         ImmutableList.of(
            biy.a(0.8F),
            bjp.a(bxf::b, 8.0F),
            bld.a(bld.a(bfj::bM), bkm.a(ImmutableList.builder().addAll(a()).add(Pair.of(bld.a((Predicate<bxe>)($$0x -> true)), 1)).build())),
            bia.a(8, bxf::a)
         ),
         bpb.s
      );
   }

   private static ImmutableList<Pair<bjb<bfz>, Integer>> a() {
      return ImmutableList.of(Pair.of(bjp.a(bfn.bt, 8.0F), 1), Pair.of(bjp.a(bfn.aw, 8.0F), 1), Pair.of(bjp.a(8.0F), 1));
   }

   private static bjn<bfz> b() {
      return new bjn<>(ImmutableList.builder().addAll(a()).add(Pair.of(new bib(30, 60), 1)).build());
   }

   private static bjn<bxe> c() {
      return new bjn<>(
         ImmutableList.of(
            Pair.of(bji.a(0.6F), 2), Pair.of(bio.a(bfn.aw, 8, bpb.q, 0.6F, 2), 2), Pair.of(bld.a(bxf::f, bjx.a(0.6F, 3)), 2), Pair.of(new bib(30, 60), 1)
         )
      );
   }

   private static bhs<bgi> d() {
      return bju.a(bpb.av, 1.0F, 8, false);
   }

   private static bhs<bxe> e() {
      return bhw.a(bxe::h_, bpb.L, bpb.z, B);
   }

   private static bhs<bxe> f() {
      return bhw.a(bxf::h, bpb.aq, bpb.z, A);
   }

   protected static void a(bxe $$0) {
      bha<bxe> $$1 = $$0.dK();
      bzz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(bzz.m, bzz.k, bzz.n, bzz.l, bzz.o, bzz.b));
      bzz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         c($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bpb.o));
      if (!$$1.a(bpb.s) && f($$0)) {
         $$0.Y();
      }

      if (!$$1.a(bpb.ah)) {
         $$1.b(bpb.ai);
      }

      $$0.x($$1.a(bpb.ai));
   }

   private static boolean f(bxe $$0) {
      if (!$$0.h_()) {
         return false;
      } else {
         bfj $$1 = $$0.cW();
         return $$1 instanceof bxe && ((bxe)$$1).h_() || $$1 instanceof bwy && ((bwy)$$1).h_();
      }
   }

   protected static void a(bxe $$0, bvh $$1) {
      k($$0);
      cfz $$2;
      if ($$1.j().a(cgc.rt)) {
         $$0.a($$1, $$1.j().L());
         $$2 = $$1.j();
         $$1.ai();
      } else {
         $$0.a($$1, 1);
         $$2 = a($$1);
      }

      if (a($$2)) {
         $$0.dK().b(bpb.ad);
         c($$0, $$2);
         d((bfz)$$0);
      } else if (c($$2) && !q($$0)) {
         o($$0);
      } else {
         boolean $$4 = !$$0.i($$2).equals(cfz.b);
         if (!$$4) {
            d($$0, $$2);
         }
      }
   }

   private static void c(bxe $$0, cfz $$1) {
      if (u($$0)) {
         $$0.b($$0.b(bdw.b));
      }

      $$0.o($$1);
   }

   private static cfz a(bvh $$0) {
      cfz $$1 = $$0.j();
      cfz $$2 = $$1.a(1);
      if ($$1.b()) {
         $$0.ai();
      } else {
         $$0.a($$1);
      }

      return $$2;
   }

   protected static void a(bxe $$0, boolean $$1) {
      cfz $$2 = $$0.b(bdw.b);
      $$0.a(bdw.b, cfz.b);
      if ($$0.fZ()) {
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
            cfz $$6 = $$0.eO();
            if (a($$6)) {
               d($$0, $$6);
            } else {
               a($$0, Collections.singletonList($$6));
            }

            $$0.n($$2);
         }
      }
   }

   protected static void b(bxe $$0) {
      if (r($$0) && !$$0.eP().b()) {
         $$0.b($$0.eP());
         $$0.a(bdw.b, cfz.b);
      }
   }

   private static void d(bxe $$0, cfz $$1) {
      cfz $$2 = $$0.l($$1);
      b($$0, Collections.singletonList($$2));
   }

   private static void a(bxe $$0, List<cfz> $$1) {
      Optional<byo> $$2 = $$0.dK().c(bpb.k);
      if ($$2.isPresent()) {
         a($$0, $$2.get(), $$1);
      } else {
         b($$0, $$1);
      }
   }

   private static void b(bxe $$0, List<cfz> $$1) {
      a($$0, $$1, p($$0));
   }

   private static void a(bxe $$0, byo $$1, List<cfz> $$2) {
      a($$0, $$2, $$1.dg());
   }

   private static void a(bxe $$0, List<cfz> $$1, eei $$2) {
      if (!$$1.isEmpty()) {
         $$0.a(bdw.b);

         for (cfz $$3 : $$1) {
            bht.a($$0, $$3, $$2.b(0.0, 1.0, 0.0));
         }
      }
   }

   private static List<cfz> g(bxe $$0) {
      dzs $$1 = $$0.dI().n().aH().getLootTable(dzg.aB);
      List<cfz> $$2 = $$1.a(new dzq.a((aif)$$0.dI()).a(ebw.a, $$0).a(ebv.i));
      return $$2;
   }

   private static boolean a(bfz $$0, bfz $$1) {
      return $$1.ae() != bfn.W ? false : apf.a($$0.dI().V()).i() < 0.1F;
   }

   protected static boolean a(bxe $$0, cfz $$1) {
      if ($$0.h_() && $$1.a(ane.V)) {
         return false;
      } else if ($$1.a(ane.T)) {
         return false;
      } else if (t($$0) && $$0.dK().a(bpb.o)) {
         return false;
      } else if (b($$1)) {
         return v($$0);
      } else {
         boolean $$2 = $$0.m($$1);
         if ($$1.a(cgc.rt)) {
            return $$2;
         } else if (c($$1)) {
            return !q($$0) && $$2;
         } else {
            return !a($$1) ? $$0.p($$1) : v($$0) && $$2;
         }
      }
   }

   protected static boolean a(cfz $$0) {
      return $$0.a(ane.U);
   }

   private static boolean a(bxe $$0, bfj $$1) {
      return !($$1 instanceof bgb $$2) ? false : !$$2.h_() || !$$2.bs() || g((bfz)$$0) || g($$2) || $$2 instanceof bxe && $$2.cW() == null;
   }

   private static boolean b(bxe $$0, bfz $$1) {
      return i($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static boolean h(bxe $$0) {
      bha<bxe> $$1 = $$0.dK();
      if ($$1.a(bpb.aq)) {
         bfz $$2 = $$1.c(bpb.aq).get();
         return $$0.a($$2, 6.0);
      } else {
         return false;
      }
   }

   private static Optional<? extends bfz> i(bxe $$0) {
      bha<bxe> $$1 = $$0.dK();
      if (h($$0)) {
         return Optional.empty();
      } else {
         Optional<bfz> $$2 = bht.a($$0, bpb.aa);
         if ($$2.isPresent() && bqf.d($$0, $$2.get())) {
            return $$2;
         } else {
            if ($$1.a(bpb.ab)) {
               Optional<byo> $$3 = $$1.c(bpb.l);
               if ($$3.isPresent()) {
                  return $$3;
               }
            }

            Optional<bgb> $$4 = $$1.c(bpb.L);
            if ($$4.isPresent()) {
               return $$4;
            } else {
               Optional<byo> $$5 = $$1.c(bpb.al);
               return $$5.isPresent() && bqf.c($$0, $$5.get()) ? $$5 : Optional.empty();
            }
         }
      }
   }

   public static void a(byo $$0, boolean $$1) {
      List<bxe> $$2 = $$0.dI().a(bxe.class, $$0.cE().g(16.0));
      $$2.stream().filter(bxf::d).filter($$2x -> !$$1 || bht.b($$2x, $$0)).forEach($$1x -> {
         if ($$1x.dI().X().b(cmi.K)) {
            d((bxd)$$1x, $$0);
         } else {
            c((bxd)$$1x, $$0);
         }
      });
   }

   public static bdx a(bxe $$0, byo $$1, bdw $$2) {
      cfz $$3 = $$1.b($$2);
      if (b($$0, $$3)) {
         cfz $$4 = $$3.a(1);
         c($$0, $$4);
         d((bfz)$$0);
         k($$0);
         return bdx.b;
      } else {
         return bdx.d;
      }
   }

   protected static boolean b(bxe $$0, cfz $$1) {
      return !t($$0) && !r($$0) && $$0.fZ() && b($$1);
   }

   protected static void a(bxe $$0, bfz $$1) {
      if (!($$1 instanceof bxe)) {
         if (u($$0)) {
            a($$0, false);
         }

         bha<bxe> $$2 = $$0.dK();
         $$2.b(bpb.ah);
         $$2.b(bpb.ai);
         $$2.b(bpb.ac);
         if ($$1 instanceof byo) {
            $$2.a(bpb.af, true, 400L);
         }

         e($$0).ifPresent($$2x -> {
            if ($$2x.ae() != $$1.ae()) {
               $$2.b(bpb.z);
            }
         });
         if ($$0.h_()) {
            $$2.a(bpb.z, $$1, 100L);
            if (bqf.d($$0, $$1)) {
               b((bxd)$$0, $$1);
            }
         } else if ($$1.ae() == bfn.W && n($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            a((bxd)$$0, $$1);
         }
      }
   }

   protected static void a(bxd $$0, bfz $$1) {
      if (!$$0.dK().c(bzz.n)) {
         if (bqf.d($$0, $$1)) {
            if (!bht.a($$0, $$1, 4.0)) {
               if ($$1.ae() == bfn.bt && $$0.dI().X().b(cmi.K)) {
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

   public static Optional<amg> c(bxe $$0) {
      return $$0.dK().g().map($$1 -> a($$0, $$1));
   }

   private static amg a(bxe $$0, bzz $$1) {
      if ($$1 == bzz.k) {
         return amh.rV;
      } else if ($$0.fY()) {
         return amh.sa;
      } else if ($$1 == bzz.n && j($$0)) {
         return amh.sa;
      } else if ($$1 == bzz.m) {
         return amh.rT;
      } else if ($$1 == bzz.l) {
         return amh.rW;
      } else if (e((bfz)$$0)) {
         return amh.rY;
      } else {
         return s($$0) ? amh.sa : amh.rU;
      }
   }

   private static boolean j(bxe $$0) {
      bha<bxe> $$1 = $$0.dK();
      return !$$1.a(bpb.z) ? false : $$1.c(bpb.z).get().a($$0, 12.0);
   }

   protected static List<bxd> d(bxe $$0) {
      return $$0.dK().c(bpb.an).orElse(ImmutableList.of());
   }

   private static List<bxd> e(bxd $$0) {
      return $$0.dK().c(bpb.am).orElse(ImmutableList.of());
   }

   public static boolean a(bfz $$0) {
      for (cfz $$2 : $$0.bJ()) {
         cfu $$3 = $$2.d();
         if ($$3 instanceof cdj && ((cdj)$$3).d() == cdl.d) {
            return true;
         }
      }

      return false;
   }

   private static void k(bxe $$0) {
      $$0.dK().b(bpb.m);
      $$0.J().n();
   }

   private static bhs<bfz> g() {
      bjq.a $$0 = new bjq.a(o);
      return bhw.a($$1 -> $$1.h_() && $$0.a($$1.dI().z), bpb.ak, bpb.s, p);
   }

   protected static void b(bxd $$0, bfz $$1) {
      e($$0).forEach($$1x -> {
         if ($$1.ae() != bfn.W || $$1x.q() && ((bwy)$$1).ge()) {
            e($$1x, $$1);
         }
      });
   }

   protected static void a(bxd $$0) {
      e($$0).forEach($$0x -> b($$0x).ifPresent($$1 -> c($$0x, $$1)));
   }

   protected static void c(bxd $$0, bfz $$1) {
      if (bqf.d($$0, $$1)) {
         $$0.dK().b(bpb.E);
         $$0.dK().a(bpb.aa, $$1.ct(), 600L);
         if ($$1.ae() == bfn.W && $$0.q()) {
            c($$0);
         }

         if ($$1.ae() == bfn.bt && $$0.dI().X().b(cmi.K)) {
            $$0.dK().a(bpb.ab, true, 600L);
         }
      }
   }

   private static void d(bxd $$0, bfz $$1) {
      Optional<byo> $$2 = b($$0);
      if ($$2.isPresent()) {
         c($$0, $$2.get());
      } else {
         c($$0, $$1);
      }
   }

   private static void e(bxd $$0, bfz $$1) {
      Optional<bfz> $$2 = f($$0);
      bfz $$3 = bht.a($$0, $$2, $$1);
      if (!$$2.isPresent() || $$2.get() != $$3) {
         c($$0, $$3);
      }
   }

   private static Optional<bfz> f(bxd $$0) {
      return bht.a($$0, bpb.aa);
   }

   public static Optional<bfz> e(bxe $$0) {
      return $$0.dK().a(bpb.z) ? $$0.dK().c(bpb.z) : Optional.empty();
   }

   public static Optional<byo> b(bxd $$0) {
      return $$0.dK().a(bpb.l) ? $$0.dK().c(bpb.l) : Optional.empty();
   }

   private static void c(bxe $$0, bfz $$1) {
      d($$0).stream().filter($$0x -> $$0x instanceof bxe).forEach($$1x -> d((bxe)$$1x, $$1));
   }

   private static void d(bxe $$0, bfz $$1) {
      bha<bxe> $$2 = $$0.dK();
      bfz $$3 = bht.a($$0, $$2.c(bpb.z), $$1);
      $$3 = bht.a($$0, $$2.c(bpb.o), $$3);
      e($$0, $$3);
   }

   private static boolean l(bxe $$0) {
      bha<bxe> $$1 = $$0.dK();
      if (!$$1.a(bpb.z)) {
         return true;
      } else {
         bfz $$2 = $$1.c(bpb.z).get();
         bfn<?> $$3 = $$2.ae();
         if ($$3 == bfn.W) {
            return m($$0);
         } else {
            return a($$3) ? !$$1.b(bpb.aq, $$2) : false;
         }
      }
   }

   private static boolean m(bxe $$0) {
      return !n($$0);
   }

   private static boolean n(bxe $$0) {
      int $$1 = $$0.dK().c(bpb.ar).orElse(0) + 1;
      int $$2 = $$0.dK().c(bpb.as).orElse(0);
      return $$2 > $$1;
   }

   private static void e(bxe $$0, bfz $$1) {
      $$0.dK().b(bpb.aa);
      $$0.dK().b(bpb.o);
      $$0.dK().b(bpb.m);
      $$0.dK().a(bpb.z, $$1, (long)q.a($$0.dI().z));
      c((bxd)$$0);
   }

   protected static void c(bxd $$0) {
      $$0.dK().a(bpb.ag, true, (long)d.a($$0.dI().z));
   }

   private static void o(bxe $$0) {
      $$0.dK().a(bpb.au, true, 200L);
   }

   private static eei p(bxe $$0) {
      eei $$1 = bqt.a($$0, 4, 2);
      return $$1 == null ? $$0.dg() : $$1;
   }

   private static boolean q(bxe $$0) {
      return $$0.dK().a(bpb.au);
   }

   protected static boolean d(bxd $$0) {
      return $$0.dK().c(bzz.b);
   }

   private static boolean c(bfz $$0) {
      return $$0.b(cgc.uZ);
   }

   private static void d(bfz $$0) {
      $$0.dK().a(bpb.ac, true, 120L);
   }

   private static boolean r(bxe $$0) {
      return $$0.dK().a(bpb.ac);
   }

   private static boolean b(cfz $$0) {
      return $$0.a(c);
   }

   private static boolean c(cfz $$0) {
      return $$0.a(ane.W);
   }

   private static boolean s(bxe $$0) {
      return $$0.dK().a(bpb.av);
   }

   private static boolean e(bfz $$0) {
      return $$0.dK().a(bpb.at);
   }

   private static boolean f(bfz $$0) {
      return !e($$0);
   }

   public static boolean b(bfz $$0) {
      return $$0.ae() == bfn.bt && $$0.b(bxf::a);
   }

   private static boolean t(bxe $$0) {
      return $$0.dK().a(bpb.af);
   }

   private static boolean g(bfz $$0) {
      return $$0.dK().a(bpb.x);
   }

   private static boolean u(bxe $$0) {
      return !$$0.eP().b();
   }

   private static boolean v(bxe $$0) {
      return $$0.eP().b() || !a($$0.eP());
   }

   public static boolean a(bfn<?> $$0) {
      return $$0 == bfn.bs || $$0 == bfn.bo;
   }
}
