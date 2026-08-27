import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ctp {
   public static final int a = 20;
   private static final List<ctp.a<cto>> b = Lists.newArrayList();
   private static final List<ctp.a<crn>> c = Lists.newArrayList();
   private static final List<cvp> d = Lists.newArrayList();
   private static final Predicate<crs> e = $$0 -> {
      for (cvp $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(crs $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(crs $$0) {
      for (ctp.a<crn> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(crs $$0) {
      for (ctp.a<cto> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(in<cto> $$0) {
      for (ctp.a<cto> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(crs $$0, crs $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(crs $$0, crs $$1) {
      for (ctp.a<crn> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(crs $$0, crs $$1) {
      Optional<in<cto>> $$2 = $$0.a(jr.x, ctq.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (ctp.a<cto> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static crs d(crs $$0, crs $$1) {
      if ($$1.d()) {
         return $$1;
      } else {
         Optional<in<cto>> $$2 = $$1.a(jr.x, ctq.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (ctp.a<crn> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return ctq.a($$3.c.a(), $$2.get());
               }
            }

            for (ctp.a<cto> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return ctq.a($$1.f(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(crv.sj);
      a(crv.vm);
      a(crv.vp);
      a(crv.sj, crv.pt, crv.vm);
      a(crv.vm, crv.vl, crv.vp);
      a(ctr.a, crv.ss, ctr.b);
      a(ctr.a, crv.sg, ctr.b);
      a(ctr.a, crv.uB, ctr.b);
      a(ctr.a, crv.sn, ctr.b);
      a(ctr.a, crv.sl, ctr.b);
      a(ctr.a, crv.rz, ctr.b);
      a(ctr.a, crv.so, ctr.b);
      a(ctr.a, crv.qX, ctr.c);
      a(ctr.a, crv.lG, ctr.b);
      a(ctr.a, crv.si, ctr.d);
      a(ctr.d, crv.ui, ctr.e);
      a(ctr.e, crv.lG, ctr.f);
      a(ctr.e, crv.sm, ctr.g);
      a(ctr.f, crv.sm, ctr.h);
      a(ctr.g, crv.lG, ctr.h);
      a(ctr.d, crv.so, ctr.l);
      a(ctr.l, crv.lG, ctr.m);
      a(ctr.d, crv.uB, ctr.i);
      a(ctr.i, crv.lG, ctr.j);
      a(ctr.i, crv.qX, ctr.k);
      a(ctr.i, crv.sm, ctr.q);
      a(ctr.j, crv.sm, ctr.r);
      a(ctr.q, crv.lG, ctr.r);
      a(ctr.q, crv.qX, ctr.s);
      a(ctr.d, crv.on, ctr.t);
      a(ctr.t, crv.lG, ctr.u);
      a(ctr.t, crv.qX, ctr.v);
      a(ctr.n, crv.sm, ctr.q);
      a(ctr.o, crv.sm, ctr.r);
      a(ctr.d, crv.rz, ctr.n);
      a(ctr.n, crv.lG, ctr.o);
      a(ctr.n, crv.qX, ctr.p);
      a(ctr.d, crv.rb, ctr.w);
      a(ctr.w, crv.lG, ctr.x);
      a(ctr.d, crv.ss, ctr.y);
      a(ctr.y, crv.qX, ctr.z);
      a(ctr.y, crv.sm, ctr.A);
      a(ctr.z, crv.sm, ctr.B);
      a(ctr.A, crv.qX, ctr.B);
      a(ctr.C, crv.sm, ctr.A);
      a(ctr.D, crv.sm, ctr.A);
      a(ctr.E, crv.sm, ctr.B);
      a(ctr.d, crv.sl, ctr.C);
      a(ctr.C, crv.lG, ctr.D);
      a(ctr.C, crv.qX, ctr.E);
      a(ctr.d, crv.sg, ctr.F);
      a(ctr.F, crv.lG, ctr.G);
      a(ctr.F, crv.qX, ctr.H);
      a(ctr.d, crv.sn, ctr.I);
      a(ctr.I, crv.lG, ctr.J);
      a(ctr.I, crv.qX, ctr.K);
      a(ctr.a, crv.sm, ctr.L);
      a(ctr.L, crv.lG, ctr.M);
      a(ctr.d, crv.vO, ctr.O);
      a(ctr.O, crv.lG, ctr.P);
   }

   private static void a(crn $$0, crn $$1, crn $$2) {
      if (!($$0 instanceof csh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kt.h.b($$0));
      } else if (!($$2 instanceof csh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kt.h.b($$2));
      } else {
         c.add(new ctp.a<>($$0.n(), cvp.a($$1), $$2.n()));
      }
   }

   private static void a(crn $$0) {
      if (!($$0 instanceof csh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kt.h.b($$0));
      } else {
         d.add(cvp.a($$0));
      }
   }

   private static void a(in<cto> $$0, crn $$1, in<cto> $$2) {
      b.add(new ctp.a<>($$0, cvp.a($$1), $$2));
   }

   static record a<T>(in<T> a, cvp b, in<T> c) {
   }
}
