import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cux {
   public static final int a = 20;
   private static final List<cux.a<cuw>> b = Lists.newArrayList();
   private static final List<cux.a<csu>> c = Lists.newArrayList();
   private static final List<cxa> d = Lists.newArrayList();
   private static final Predicate<csz> e = $$0 -> {
      for (cxa $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(csz $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(csz $$0) {
      for (cux.a<csu> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(csz $$0) {
      for (cux.a<cuw> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(iw<cuw> $$0) {
      for (cux.a<cuw> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(csz $$0, csz $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(csz $$0, csz $$1) {
      for (cux.a<csu> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(csz $$0, csz $$1) {
      Optional<iw<cuw>> $$2 = $$0.a(ka.E, cuy.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cux.a<cuw> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static csz d(csz $$0, csz $$1) {
      if ($$1.d()) {
         return $$1;
      } else {
         Optional<iw<cuw>> $$2 = $$1.a(ka.E, cuy.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cux.a<csu> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cuy.a($$3.c.a(), $$2.get());
               }
            }

            for (cux.a<cuw> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cuy.a($$1.f(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(ctc.sk);
      a(ctc.vo);
      a(ctc.vr);
      a(ctc.sk, ctc.pu, ctc.vo);
      a(ctc.vo, ctc.vn, ctc.vr);
      a(cuz.a, ctc.st, cuz.b);
      a(cuz.a, ctc.sh, cuz.b);
      a(cuz.a, ctc.uD, cuz.b);
      a(cuz.a, ctc.so, cuz.b);
      a(cuz.a, ctc.sm, cuz.b);
      a(cuz.a, ctc.rA, cuz.b);
      a(cuz.a, ctc.sp, cuz.b);
      a(cuz.a, ctc.qY, cuz.c);
      a(cuz.a, ctc.lH, cuz.b);
      a(cuz.a, ctc.sj, cuz.d);
      a(cuz.d, ctc.uk, cuz.e);
      a(cuz.e, ctc.lH, cuz.f);
      a(cuz.e, ctc.sn, cuz.g);
      a(cuz.f, ctc.sn, cuz.h);
      a(cuz.g, ctc.lH, cuz.h);
      a(cuz.d, ctc.sp, cuz.l);
      a(cuz.l, ctc.lH, cuz.m);
      a(cuz.d, ctc.uD, cuz.i);
      a(cuz.i, ctc.lH, cuz.j);
      a(cuz.i, ctc.qY, cuz.k);
      a(cuz.i, ctc.sn, cuz.q);
      a(cuz.j, ctc.sn, cuz.r);
      a(cuz.q, ctc.lH, cuz.r);
      a(cuz.q, ctc.qY, cuz.s);
      a(cuz.d, ctc.oo, cuz.t);
      a(cuz.t, ctc.lH, cuz.u);
      a(cuz.t, ctc.qY, cuz.v);
      a(cuz.n, ctc.sn, cuz.q);
      a(cuz.o, ctc.sn, cuz.r);
      a(cuz.d, ctc.rA, cuz.n);
      a(cuz.n, ctc.lH, cuz.o);
      a(cuz.n, ctc.qY, cuz.p);
      a(cuz.d, ctc.rc, cuz.w);
      a(cuz.w, ctc.lH, cuz.x);
      a(cuz.d, ctc.st, cuz.y);
      a(cuz.y, ctc.qY, cuz.z);
      a(cuz.y, ctc.sn, cuz.A);
      a(cuz.z, ctc.sn, cuz.B);
      a(cuz.A, ctc.qY, cuz.B);
      a(cuz.C, ctc.sn, cuz.A);
      a(cuz.D, ctc.sn, cuz.A);
      a(cuz.E, ctc.sn, cuz.B);
      a(cuz.d, ctc.sm, cuz.C);
      a(cuz.C, ctc.lH, cuz.D);
      a(cuz.C, ctc.qY, cuz.E);
      a(cuz.d, ctc.sh, cuz.F);
      a(cuz.F, ctc.lH, cuz.G);
      a(cuz.F, ctc.qY, cuz.H);
      a(cuz.d, ctc.so, cuz.I);
      a(cuz.I, ctc.lH, cuz.J);
      a(cuz.I, ctc.qY, cuz.K);
      a(cuz.a, ctc.sn, cuz.L);
      a(cuz.L, ctc.lH, cuz.M);
      a(cuz.d, ctc.vQ, cuz.O);
      a(cuz.O, ctc.lH, cuz.P);
   }

   private static void a(csu $$0, csu $$1, csu $$2) {
      if (!($$0 instanceof ctp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ld.h.b($$0));
      } else if (!($$2 instanceof ctp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ld.h.b($$2));
      } else {
         c.add(new cux.a<>($$0.n(), cxa.a($$1), $$2.n()));
      }
   }

   private static void a(csu $$0) {
      if (!($$0 instanceof ctp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ld.h.b($$0));
      } else {
         d.add(cxa.a($$0));
      }
   }

   private static void a(iw<cuw> $$0, csu $$1, iw<cuw> $$2) {
      b.add(new cux.a<>($$0, cxa.a($$1), $$2));
   }

   static record a<T>(iw<T> a, cxa b, iw<T> c) {
   }
}
