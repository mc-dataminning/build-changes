import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cof {
   public static final int a = 20;
   private static final List<cof.a<coe>> b = Lists.newArrayList();
   private static final List<cof.a<cmc>> c = Lists.newArrayList();
   private static final List<cpi> d = Lists.newArrayList();
   private static final Predicate<cmh> e = $$0 -> {
      for (cpi $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cmh $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cmh $$0) {
      for (cof.a<cmc> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cmh $$0) {
      for (cof.a<coe> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(coe $$0) {
      for (cof.a<coe> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cmh $$0, cmh $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cmh $$0, cmh $$1) {
      cmc $$2 = $$0.d();

      for (cof.a<cmc> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cmh $$0, cmh $$1) {
      coe $$2 = cog.d($$0);

      for (cof.a<coe> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cmh d(cmh $$0, cmh $$1) {
      if (!$$1.b()) {
         coe $$2 = cog.d($$1);
         cmc $$3 = $$1.d();

         for (cof.a<cmc> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cog.a(new cmh($$4.c), $$2);
            }
         }

         for (cof.a<coe> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cog.a(new cmh($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cmk.sh);
      a(cmk.vh);
      a(cmk.vk);
      a(cmk.sh, cmk.pr, cmk.vh);
      a(cmk.vh, cmk.vg, cmk.vk);
      a(coh.c, cmk.sq, coh.d);
      a(coh.c, cmk.se, coh.d);
      a(coh.c, cmk.uw, coh.d);
      a(coh.c, cmk.sl, coh.d);
      a(coh.c, cmk.sj, coh.d);
      a(coh.c, cmk.rx, coh.d);
      a(coh.c, cmk.sm, coh.d);
      a(coh.c, cmk.qV, coh.e);
      a(coh.c, cmk.lG, coh.d);
      a(coh.c, cmk.sg, coh.f);
      a(coh.f, cmk.ud, coh.g);
      a(coh.g, cmk.lG, coh.h);
      a(coh.g, cmk.sk, coh.i);
      a(coh.h, cmk.sk, coh.j);
      a(coh.i, cmk.lG, coh.j);
      a(coh.f, cmk.sm, coh.n);
      a(coh.n, cmk.lG, coh.o);
      a(coh.f, cmk.uw, coh.k);
      a(coh.k, cmk.lG, coh.l);
      a(coh.k, cmk.qV, coh.m);
      a(coh.k, cmk.sk, coh.s);
      a(coh.l, cmk.sk, coh.t);
      a(coh.s, cmk.lG, coh.t);
      a(coh.s, cmk.qV, coh.u);
      a(coh.f, cmk.on, coh.v);
      a(coh.v, cmk.lG, coh.w);
      a(coh.v, cmk.qV, coh.x);
      a(coh.p, cmk.sk, coh.s);
      a(coh.q, cmk.sk, coh.t);
      a(coh.f, cmk.rx, coh.p);
      a(coh.p, cmk.lG, coh.q);
      a(coh.p, cmk.qV, coh.r);
      a(coh.f, cmk.qZ, coh.y);
      a(coh.y, cmk.lG, coh.z);
      a(coh.f, cmk.sq, coh.A);
      a(coh.A, cmk.qV, coh.B);
      a(coh.A, cmk.sk, coh.C);
      a(coh.B, cmk.sk, coh.D);
      a(coh.C, cmk.qV, coh.D);
      a(coh.E, cmk.sk, coh.C);
      a(coh.F, cmk.sk, coh.C);
      a(coh.G, cmk.sk, coh.D);
      a(coh.f, cmk.sj, coh.E);
      a(coh.E, cmk.lG, coh.F);
      a(coh.E, cmk.qV, coh.G);
      a(coh.f, cmk.se, coh.H);
      a(coh.H, cmk.lG, coh.I);
      a(coh.H, cmk.qV, coh.J);
      a(coh.f, cmk.sl, coh.K);
      a(coh.K, cmk.lG, coh.L);
      a(coh.K, cmk.qV, coh.M);
      a(coh.c, cmk.sk, coh.N);
      a(coh.N, cmk.lG, coh.O);
      a(coh.f, cmk.vJ, coh.Q);
      a(coh.Q, cmk.lG, coh.R);
   }

   private static void a(cmc $$0, cmc $$1, cmc $$2) {
      if (!($$0 instanceof cmw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kb.h.b($$0));
      } else if (!($$2 instanceof cmw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kb.h.b($$2));
      } else {
         c.add(new cof.a<>($$0, cpi.a($$1), $$2));
      }
   }

   private static void a(cmc $$0) {
      if (!($$0 instanceof cmw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kb.h.b($$0));
      } else {
         d.add(cpi.a($$0));
      }
   }

   private static void a(coe $$0, cmc $$1, coe $$2) {
      b.add(new cof.a<>($$0, cpi.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cpi b;
      final T c;

      public a(T $$0, cpi $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
