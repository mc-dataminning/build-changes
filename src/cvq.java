import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cvq {
   public static final int a = 20;
   private static final List<cvq.a<cvp>> b = Lists.newArrayList();
   private static final List<cvq.a<ctl>> c = Lists.newArrayList();
   private static final List<cxt> d = Lists.newArrayList();
   private static final Predicate<ctq> e = $$0 -> {
      for (cxt $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(ctq $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(ctq $$0) {
      for (cvq.a<ctl> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ctq $$0) {
      for (cvq.a<cvp> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ix<cvp> $$0) {
      for (cvq.a<cvp> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ctq $$0, ctq $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(ctq $$0, ctq $$1) {
      for (cvq.a<ctl> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ctq $$0, ctq $$1) {
      Optional<ix<cvp>> $$2 = $$0.a(kb.F, cvr.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cvq.a<cvp> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static ctq d(ctq $$0, ctq $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ix<cvp>> $$2 = $$1.a(kb.F, cvr.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cvq.a<ctl> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cvr.a($$3.c.a(), $$2.get());
               }
            }

            for (cvq.a<cvp> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cvr.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(ctt.sk);
      a(ctt.vo);
      a(ctt.vr);
      a(ctt.sk, ctt.pu, ctt.vo);
      a(ctt.vo, ctt.vn, ctt.vr);
      a(cvs.a, ctt.st, cvs.b);
      a(cvs.a, ctt.sh, cvs.b);
      a(cvs.a, ctt.uD, cvs.b);
      a(cvs.a, ctt.so, cvs.b);
      a(cvs.a, ctt.sm, cvs.b);
      a(cvs.a, ctt.rA, cvs.b);
      a(cvs.a, ctt.sp, cvs.b);
      a(cvs.a, ctt.yD, cvs.b);
      a(cvs.a, ctt.lO, cvs.b);
      a(cvs.a, ctt.b, cvs.b);
      a(cvs.a, ctt.cM, cvs.b);
      a(cvs.a, ctt.qY, cvs.c);
      a(cvs.a, ctt.lH, cvs.b);
      a(cvs.a, ctt.sj, cvs.d);
      a(cvs.d, ctt.yD, cvs.Q);
      a(cvs.d, ctt.lO, cvs.S);
      a(cvs.d, ctt.b, cvs.T);
      a(cvs.d, ctt.cM, cvs.R);
      a(cvs.d, ctt.uk, cvs.e);
      a(cvs.e, ctt.lH, cvs.f);
      a(cvs.e, ctt.sn, cvs.g);
      a(cvs.f, ctt.sn, cvs.h);
      a(cvs.g, ctt.lH, cvs.h);
      a(cvs.d, ctt.sp, cvs.l);
      a(cvs.l, ctt.lH, cvs.m);
      a(cvs.d, ctt.uD, cvs.i);
      a(cvs.i, ctt.lH, cvs.j);
      a(cvs.i, ctt.qY, cvs.k);
      a(cvs.i, ctt.sn, cvs.q);
      a(cvs.j, ctt.sn, cvs.r);
      a(cvs.q, ctt.lH, cvs.r);
      a(cvs.q, ctt.qY, cvs.s);
      a(cvs.d, ctt.oo, cvs.t);
      a(cvs.t, ctt.lH, cvs.u);
      a(cvs.t, ctt.qY, cvs.v);
      a(cvs.n, ctt.sn, cvs.q);
      a(cvs.o, ctt.sn, cvs.r);
      a(cvs.d, ctt.rA, cvs.n);
      a(cvs.n, ctt.lH, cvs.o);
      a(cvs.n, ctt.qY, cvs.p);
      a(cvs.d, ctt.rc, cvs.w);
      a(cvs.w, ctt.lH, cvs.x);
      a(cvs.d, ctt.st, cvs.y);
      a(cvs.y, ctt.qY, cvs.z);
      a(cvs.y, ctt.sn, cvs.A);
      a(cvs.z, ctt.sn, cvs.B);
      a(cvs.A, ctt.qY, cvs.B);
      a(cvs.C, ctt.sn, cvs.A);
      a(cvs.D, ctt.sn, cvs.A);
      a(cvs.E, ctt.sn, cvs.B);
      a(cvs.d, ctt.sm, cvs.C);
      a(cvs.C, ctt.lH, cvs.D);
      a(cvs.C, ctt.qY, cvs.E);
      a(cvs.d, ctt.sh, cvs.F);
      a(cvs.F, ctt.lH, cvs.G);
      a(cvs.F, ctt.qY, cvs.H);
      a(cvs.d, ctt.so, cvs.I);
      a(cvs.I, ctt.lH, cvs.J);
      a(cvs.I, ctt.qY, cvs.K);
      a(cvs.a, ctt.sn, cvs.L);
      a(cvs.L, ctt.lH, cvs.M);
      a(cvs.d, ctt.vQ, cvs.O);
      a(cvs.O, ctt.lH, cvs.P);
   }

   private static void a(ctl $$0, ctl $$1, ctl $$2) {
      if (!($$0 instanceof cuh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$0));
      } else if (!($$2 instanceof cuh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$2));
      } else {
         c.add(new cvq.a<>($$0.o(), cxt.a($$1), $$2.o()));
      }
   }

   private static void a(ctl $$0) {
      if (!($$0 instanceof cuh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$0));
      } else {
         d.add(cxt.a($$0));
      }
   }

   private static void a(ix<cvp> $$0, ctl $$1, ix<cvp> $$2) {
      b.add(new cvq.a<>($$0, cxt.a($$1), $$2));
   }

   static record a<T>(ix<T> a, cxt b, ix<T> c) {
   }
}
