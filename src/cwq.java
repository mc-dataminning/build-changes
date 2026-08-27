import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cwq {
   public static final int a = 20;
   private static final List<cwq.a<cwp>> b = Lists.newArrayList();
   private static final List<cwq.a<cuc>> c = Lists.newArrayList();
   private static final List<cyv> d = Lists.newArrayList();
   private static final Predicate<cuh> e = $$0 -> {
      for (cyv $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cuh $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cuh $$0) {
      for (cwq.a<cuc> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cuh $$0) {
      for (cwq.a<cwp> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ja<cwp> $$0) {
      for (cwq.a<cwp> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cuh $$0, cuh $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cuh $$0, cuh $$1) {
      for (cwq.a<cuc> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cuh $$0, cuh $$1) {
      Optional<ja<cwp>> $$2 = $$0.a(ke.E, cwr.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwq.a<cwp> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static cuh d(cuh $$0, cuh $$1) {
      if ($$1.d()) {
         return $$1;
      } else {
         Optional<ja<cwp>> $$2 = $$1.a(ke.E, cwr.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwq.a<cuc> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwr.a($$3.c.a(), $$2.get());
               }
            }

            for (cwq.a<cwp> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwr.a($$1.f(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(cuk.tH);
      a(cuk.wZ);
      a(cuk.xc);
      a(cuk.tH, cuk.qN, cuk.wZ);
      a(cuk.wZ, cuk.wY, cuk.xc);
      a(cws.a, cuk.tQ, cws.b);
      a(cws.a, cuk.tE, cws.b);
      a(cws.a, cuk.wo, cws.b);
      a(cws.a, cuk.tL, cws.b);
      a(cws.a, cuk.tJ, cws.b);
      a(cws.a, cuk.sX, cws.b);
      a(cws.a, cuk.tM, cws.b);
      a(cws.a, cuk.sv, cws.c);
      a(cws.a, cuk.mW, cws.b);
      a(cws.a, cuk.tG, cws.d);
      a(cws.d, cuk.vV, cws.g);
      a(cws.g, cuk.mW, cws.h);
      a(cws.g, cuk.tK, cws.i);
      a(cws.h, cuk.tK, cws.j);
      a(cws.i, cuk.mW, cws.j);
      a(cws.d, cuk.tM, cws.n);
      a(cws.n, cuk.mW, cws.o);
      a(cws.d, cuk.wo, cws.k);
      a(cws.k, cuk.mW, cws.l);
      a(cws.k, cuk.sv, cws.m);
      a(cws.k, cuk.tK, cws.s);
      a(cws.l, cuk.tK, cws.t);
      a(cws.s, cuk.mW, cws.t);
      a(cws.s, cuk.sv, cws.u);
      a(cws.d, cuk.pE, cws.v);
      a(cws.v, cuk.mW, cws.w);
      a(cws.v, cuk.sv, cws.x);
      a(cws.p, cuk.tK, cws.s);
      a(cws.q, cuk.tK, cws.t);
      a(cws.d, cuk.sX, cws.p);
      a(cws.p, cuk.mW, cws.q);
      a(cws.p, cuk.sv, cws.r);
      a(cws.d, cuk.sz, cws.y);
      a(cws.y, cuk.mW, cws.z);
      a(cws.d, cuk.tQ, cws.A);
      a(cws.A, cuk.sv, cws.B);
      a(cws.A, cuk.tK, cws.C);
      a(cws.B, cuk.tK, cws.D);
      a(cws.C, cuk.sv, cws.D);
      a(cws.E, cuk.tK, cws.C);
      a(cws.F, cuk.tK, cws.C);
      a(cws.G, cuk.tK, cws.D);
      a(cws.d, cuk.tJ, cws.E);
      a(cws.E, cuk.mW, cws.F);
      a(cws.E, cuk.sv, cws.G);
      a(cws.d, cuk.tE, cws.H);
      a(cws.H, cuk.mW, cws.I);
      a(cws.H, cuk.sv, cws.J);
      a(cws.d, cuk.tL, cws.K);
      a(cws.K, cuk.mW, cws.L);
      a(cws.K, cuk.sv, cws.M);
      a(cws.a, cuk.tK, cws.N);
      a(cws.N, cuk.mW, cws.O);
      a(cws.d, cuk.xB, cws.Q);
      a(cws.Q, cuk.mW, cws.R);
   }

   private static void a(cuc $$0, cuc $$1, cuc $$2) {
      if (!($$0 instanceof cvh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lh.h.b($$0));
      } else if (!($$2 instanceof cvh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lh.h.b($$2));
      } else {
         c.add(new cwq.a<>($$0.n(), cyv.a($$1), $$2.n()));
      }
   }

   private static void a(cuc $$0) {
      if (!($$0 instanceof cvh)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lh.h.b($$0));
      } else {
         d.add(cyv.a($$0));
      }
   }

   private static void a(ja<cwp> $$0, cuc $$1, ja<cwp> $$2) {
      b.add(new cwq.a<>($$0, cyv.a($$1), $$2));
   }

   static record a<T>(ja<T> a, cyv b, ja<T> c) {
   }
}
