import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cvo {
   public static final int a = 20;
   private static final List<cvo.a<cvn>> b = Lists.newArrayList();
   private static final List<cvo.a<ctj>> c = Lists.newArrayList();
   private static final List<cxr> d = Lists.newArrayList();
   private static final Predicate<cto> e = $$0 -> {
      for (cxr $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cto $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cto $$0) {
      for (cvo.a<ctj> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cto $$0) {
      for (cvo.a<cvn> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ix<cvn> $$0) {
      for (cvo.a<cvn> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cto $$0, cto $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cto $$0, cto $$1) {
      for (cvo.a<ctj> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cto $$0, cto $$1) {
      Optional<ix<cvn>> $$2 = $$0.a(kb.F, cvp.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cvo.a<cvn> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static cto d(cto $$0, cto $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ix<cvn>> $$2 = $$1.a(kb.F, cvp.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cvo.a<ctj> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cvp.a($$3.c.a(), $$2.get());
               }
            }

            for (cvo.a<cvn> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cvp.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(ctr.sk);
      a(ctr.vo);
      a(ctr.vr);
      a(ctr.sk, ctr.pu, ctr.vo);
      a(ctr.vo, ctr.vn, ctr.vr);
      a(cvq.a, ctr.st, cvq.b);
      a(cvq.a, ctr.sh, cvq.b);
      a(cvq.a, ctr.uD, cvq.b);
      a(cvq.a, ctr.so, cvq.b);
      a(cvq.a, ctr.sm, cvq.b);
      a(cvq.a, ctr.rA, cvq.b);
      a(cvq.a, ctr.sp, cvq.b);
      a(cvq.a, ctr.yD, cvq.b);
      a(cvq.a, ctr.lO, cvq.b);
      a(cvq.a, ctr.b, cvq.b);
      a(cvq.a, ctr.cM, cvq.b);
      a(cvq.a, ctr.qY, cvq.c);
      a(cvq.a, ctr.lH, cvq.b);
      a(cvq.a, ctr.sj, cvq.d);
      a(cvq.d, ctr.yD, cvq.Q);
      a(cvq.d, ctr.lO, cvq.S);
      a(cvq.d, ctr.b, cvq.T);
      a(cvq.d, ctr.cM, cvq.R);
      a(cvq.d, ctr.uk, cvq.e);
      a(cvq.e, ctr.lH, cvq.f);
      a(cvq.e, ctr.sn, cvq.g);
      a(cvq.f, ctr.sn, cvq.h);
      a(cvq.g, ctr.lH, cvq.h);
      a(cvq.d, ctr.sp, cvq.l);
      a(cvq.l, ctr.lH, cvq.m);
      a(cvq.d, ctr.uD, cvq.i);
      a(cvq.i, ctr.lH, cvq.j);
      a(cvq.i, ctr.qY, cvq.k);
      a(cvq.i, ctr.sn, cvq.q);
      a(cvq.j, ctr.sn, cvq.r);
      a(cvq.q, ctr.lH, cvq.r);
      a(cvq.q, ctr.qY, cvq.s);
      a(cvq.d, ctr.oo, cvq.t);
      a(cvq.t, ctr.lH, cvq.u);
      a(cvq.t, ctr.qY, cvq.v);
      a(cvq.n, ctr.sn, cvq.q);
      a(cvq.o, ctr.sn, cvq.r);
      a(cvq.d, ctr.rA, cvq.n);
      a(cvq.n, ctr.lH, cvq.o);
      a(cvq.n, ctr.qY, cvq.p);
      a(cvq.d, ctr.rc, cvq.w);
      a(cvq.w, ctr.lH, cvq.x);
      a(cvq.d, ctr.st, cvq.y);
      a(cvq.y, ctr.qY, cvq.z);
      a(cvq.y, ctr.sn, cvq.A);
      a(cvq.z, ctr.sn, cvq.B);
      a(cvq.A, ctr.qY, cvq.B);
      a(cvq.C, ctr.sn, cvq.A);
      a(cvq.D, ctr.sn, cvq.A);
      a(cvq.E, ctr.sn, cvq.B);
      a(cvq.d, ctr.sm, cvq.C);
      a(cvq.C, ctr.lH, cvq.D);
      a(cvq.C, ctr.qY, cvq.E);
      a(cvq.d, ctr.sh, cvq.F);
      a(cvq.F, ctr.lH, cvq.G);
      a(cvq.F, ctr.qY, cvq.H);
      a(cvq.d, ctr.so, cvq.I);
      a(cvq.I, ctr.lH, cvq.J);
      a(cvq.I, ctr.qY, cvq.K);
      a(cvq.a, ctr.sn, cvq.L);
      a(cvq.L, ctr.lH, cvq.M);
      a(cvq.d, ctr.vQ, cvq.O);
      a(cvq.O, ctr.lH, cvq.P);
   }

   private static void a(ctj $$0, ctj $$1, ctj $$2) {
      if (!($$0 instanceof cuf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$0));
      } else if (!($$2 instanceof cuf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$2));
      } else {
         c.add(new cvo.a<>($$0.n(), cxr.a($$1), $$2.n()));
      }
   }

   private static void a(ctj $$0) {
      if (!($$0 instanceof cuf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + le.h.b($$0));
      } else {
         d.add(cxr.a($$0));
      }
   }

   private static void a(ix<cvn> $$0, ctj $$1, ix<cvn> $$2) {
      b.add(new cvo.a<>($$0, cxr.a($$1), $$2));
   }

   static record a<T>(ix<T> a, cxr b, ix<T> c) {
   }
}
