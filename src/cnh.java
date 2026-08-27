import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cnh {
   public static final int a = 20;
   private static final List<cnh.a<cng>> b = Lists.newArrayList();
   private static final List<cnh.a<cle>> c = Lists.newArrayList();
   private static final List<cok> d = Lists.newArrayList();
   private static final Predicate<clj> e = $$0 -> {
      for (cok $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(clj $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(clj $$0) {
      for (cnh.a<cle> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clj $$0) {
      for (cnh.a<cng> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cng $$0) {
      for (cnh.a<cng> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(clj $$0, clj $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(clj $$0, clj $$1) {
      cle $$2 = $$0.d();

      for (cnh.a<cle> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clj $$0, clj $$1) {
      cng $$2 = cni.d($$0);

      for (cnh.a<cng> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static clj d(clj $$0, clj $$1) {
      if (!$$1.b()) {
         cng $$2 = cni.d($$1);
         cle $$3 = $$1.d();

         for (cnh.a<cle> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cni.a(new clj($$4.c), $$2);
            }
         }

         for (cnh.a<cng> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cni.a(new clj($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(clm.sh);
      a(clm.vg);
      a(clm.vj);
      a(clm.sh, clm.pr, clm.vg);
      a(clm.vg, clm.vf, clm.vj);
      a(cnj.c, clm.sq, cnj.d);
      a(cnj.c, clm.se, cnj.d);
      a(cnj.c, clm.uv, cnj.d);
      a(cnj.c, clm.sl, cnj.d);
      a(cnj.c, clm.sj, cnj.d);
      a(cnj.c, clm.rx, cnj.d);
      a(cnj.c, clm.sm, cnj.d);
      a(cnj.c, clm.qV, cnj.e);
      a(cnj.c, clm.lG, cnj.d);
      a(cnj.c, clm.sg, cnj.f);
      a(cnj.f, clm.uc, cnj.g);
      a(cnj.g, clm.lG, cnj.h);
      a(cnj.g, clm.sk, cnj.i);
      a(cnj.h, clm.sk, cnj.j);
      a(cnj.i, clm.lG, cnj.j);
      a(cnj.f, clm.sm, cnj.n);
      a(cnj.n, clm.lG, cnj.o);
      a(cnj.f, clm.uv, cnj.k);
      a(cnj.k, clm.lG, cnj.l);
      a(cnj.k, clm.qV, cnj.m);
      a(cnj.k, clm.sk, cnj.s);
      a(cnj.l, clm.sk, cnj.t);
      a(cnj.s, clm.lG, cnj.t);
      a(cnj.s, clm.qV, cnj.u);
      a(cnj.f, clm.on, cnj.v);
      a(cnj.v, clm.lG, cnj.w);
      a(cnj.v, clm.qV, cnj.x);
      a(cnj.p, clm.sk, cnj.s);
      a(cnj.q, clm.sk, cnj.t);
      a(cnj.f, clm.rx, cnj.p);
      a(cnj.p, clm.lG, cnj.q);
      a(cnj.p, clm.qV, cnj.r);
      a(cnj.f, clm.qZ, cnj.y);
      a(cnj.y, clm.lG, cnj.z);
      a(cnj.f, clm.sq, cnj.A);
      a(cnj.A, clm.qV, cnj.B);
      a(cnj.A, clm.sk, cnj.C);
      a(cnj.B, clm.sk, cnj.D);
      a(cnj.C, clm.qV, cnj.D);
      a(cnj.E, clm.sk, cnj.C);
      a(cnj.F, clm.sk, cnj.C);
      a(cnj.G, clm.sk, cnj.D);
      a(cnj.f, clm.sj, cnj.E);
      a(cnj.E, clm.lG, cnj.F);
      a(cnj.E, clm.qV, cnj.G);
      a(cnj.f, clm.se, cnj.H);
      a(cnj.H, clm.lG, cnj.I);
      a(cnj.H, clm.qV, cnj.J);
      a(cnj.f, clm.sl, cnj.K);
      a(cnj.K, clm.lG, cnj.L);
      a(cnj.K, clm.qV, cnj.M);
      a(cnj.c, clm.sk, cnj.N);
      a(cnj.N, clm.lG, cnj.O);
      a(cnj.f, clm.vI, cnj.Q);
      a(cnj.Q, clm.lG, cnj.R);
   }

   private static void a(cle $$0, cle $$1, cle $$2) {
      if (!($$0 instanceof cly)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else if (!($$2 instanceof cly)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$2));
      } else {
         c.add(new cnh.a<>($$0, cok.a($$1), $$2));
      }
   }

   private static void a(cle $$0) {
      if (!($$0 instanceof cly)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else {
         d.add(cok.a($$0));
      }
   }

   private static void a(cng $$0, cle $$1, cng $$2) {
      b.add(new cnh.a<>($$0, cok.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cok b;
      final T c;

      public a(T $$0, cok $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
