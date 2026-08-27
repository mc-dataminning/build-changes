import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class coq {
   public static final int a = 20;
   private static final List<coq.a<cop>> b = Lists.newArrayList();
   private static final List<coq.a<cmm>> c = Lists.newArrayList();
   private static final List<cps> d = Lists.newArrayList();
   private static final Predicate<cmr> e = $$0 -> {
      for (cps $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cmr $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cmr $$0) {
      for (coq.a<cmm> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cmr $$0) {
      for (coq.a<cop> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cop $$0) {
      for (coq.a<cop> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cmr $$0, cmr $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cmr $$0, cmr $$1) {
      cmm $$2 = $$0.d();

      for (coq.a<cmm> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cmr $$0, cmr $$1) {
      cop $$2 = cor.d($$0);

      for (coq.a<cop> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cmr d(cmr $$0, cmr $$1) {
      if (!$$1.b()) {
         cop $$2 = cor.d($$1);
         cmm $$3 = $$1.d();

         for (coq.a<cmm> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cor.a(new cmr($$4.c), $$2);
            }
         }

         for (coq.a<cop> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cor.a(new cmr($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cmu.sh);
      a(cmu.vh);
      a(cmu.vk);
      a(cmu.sh, cmu.pr, cmu.vh);
      a(cmu.vh, cmu.vg, cmu.vk);
      a(cos.c, cmu.sq, cos.d);
      a(cos.c, cmu.se, cos.d);
      a(cos.c, cmu.uw, cos.d);
      a(cos.c, cmu.sl, cos.d);
      a(cos.c, cmu.sj, cos.d);
      a(cos.c, cmu.rx, cos.d);
      a(cos.c, cmu.sm, cos.d);
      a(cos.c, cmu.qV, cos.e);
      a(cos.c, cmu.lG, cos.d);
      a(cos.c, cmu.sg, cos.f);
      a(cos.f, cmu.ud, cos.g);
      a(cos.g, cmu.lG, cos.h);
      a(cos.g, cmu.sk, cos.i);
      a(cos.h, cmu.sk, cos.j);
      a(cos.i, cmu.lG, cos.j);
      a(cos.f, cmu.sm, cos.n);
      a(cos.n, cmu.lG, cos.o);
      a(cos.f, cmu.uw, cos.k);
      a(cos.k, cmu.lG, cos.l);
      a(cos.k, cmu.qV, cos.m);
      a(cos.k, cmu.sk, cos.s);
      a(cos.l, cmu.sk, cos.t);
      a(cos.s, cmu.lG, cos.t);
      a(cos.s, cmu.qV, cos.u);
      a(cos.f, cmu.on, cos.v);
      a(cos.v, cmu.lG, cos.w);
      a(cos.v, cmu.qV, cos.x);
      a(cos.p, cmu.sk, cos.s);
      a(cos.q, cmu.sk, cos.t);
      a(cos.f, cmu.rx, cos.p);
      a(cos.p, cmu.lG, cos.q);
      a(cos.p, cmu.qV, cos.r);
      a(cos.f, cmu.qZ, cos.y);
      a(cos.y, cmu.lG, cos.z);
      a(cos.f, cmu.sq, cos.A);
      a(cos.A, cmu.qV, cos.B);
      a(cos.A, cmu.sk, cos.C);
      a(cos.B, cmu.sk, cos.D);
      a(cos.C, cmu.qV, cos.D);
      a(cos.E, cmu.sk, cos.C);
      a(cos.F, cmu.sk, cos.C);
      a(cos.G, cmu.sk, cos.D);
      a(cos.f, cmu.sj, cos.E);
      a(cos.E, cmu.lG, cos.F);
      a(cos.E, cmu.qV, cos.G);
      a(cos.f, cmu.se, cos.H);
      a(cos.H, cmu.lG, cos.I);
      a(cos.H, cmu.qV, cos.J);
      a(cos.f, cmu.sl, cos.K);
      a(cos.K, cmu.lG, cos.L);
      a(cos.K, cmu.qV, cos.M);
      a(cos.c, cmu.sk, cos.N);
      a(cos.N, cmu.lG, cos.O);
      a(cos.f, cmu.vJ, cos.Q);
      a(cos.Q, cmu.lG, cos.R);
   }

   private static void a(cmm $$0, cmm $$1, cmm $$2) {
      if (!($$0 instanceof cng)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kd.h.b($$0));
      } else if (!($$2 instanceof cng)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kd.h.b($$2));
      } else {
         c.add(new coq.a<>($$0, cps.a($$1), $$2));
      }
   }

   private static void a(cmm $$0) {
      if (!($$0 instanceof cng)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kd.h.b($$0));
      } else {
         d.add(cps.a($$0));
      }
   }

   private static void a(cop $$0, cmm $$1, cop $$2) {
      b.add(new coq.a<>($$0, cps.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cps b;
      final T c;

      public a(T $$0, cps $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
