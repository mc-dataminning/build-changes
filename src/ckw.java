import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class ckw {
   public static final int a = 20;
   private static final List<ckw.a<ckv>> b = Lists.newArrayList();
   private static final List<ckw.a<cit>> c = Lists.newArrayList();
   private static final List<cly> d = Lists.newArrayList();
   private static final Predicate<ciy> e = $$0 -> {
      for (cly $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(ciy $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(ciy $$0) {
      for (ckw.a<cit> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ciy $$0) {
      for (ckw.a<ckv> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ckv $$0) {
      for (ckw.a<ckv> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ciy $$0, ciy $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(ciy $$0, ciy $$1) {
      cit $$2 = $$0.d();

      for (ckw.a<cit> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ciy $$0, ciy $$1) {
      ckv $$2 = ckx.d($$0);

      for (ckw.a<ckv> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static ciy d(ciy $$0, ciy $$1) {
      if (!$$1.b()) {
         ckv $$2 = ckx.d($$1);
         cit $$3 = $$1.d();

         for (ckw.a<cit> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return ckx.a(new ciy($$4.c), $$2);
            }
         }

         for (ckw.a<ckv> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return ckx.a(new ciy($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cjb.rv);
      a(cjb.uu);
      a(cjb.ux);
      a(cjb.rv, cjb.oG, cjb.uu);
      a(cjb.uu, cjb.ut, cjb.ux);
      a(cky.c, cjb.rE, cky.d);
      a(cky.c, cjb.rs, cky.d);
      a(cky.c, cjb.tJ, cky.d);
      a(cky.c, cjb.rz, cky.d);
      a(cky.c, cjb.rx, cky.d);
      a(cky.c, cjb.qM, cky.d);
      a(cky.c, cjb.rA, cky.d);
      a(cky.c, cjb.qk, cky.e);
      a(cky.c, cjb.ll, cky.d);
      a(cky.c, cjb.ru, cky.f);
      a(cky.f, cjb.tq, cky.g);
      a(cky.g, cjb.ll, cky.h);
      a(cky.g, cjb.ry, cky.i);
      a(cky.h, cjb.ry, cky.j);
      a(cky.i, cjb.ll, cky.j);
      a(cky.f, cjb.rA, cky.n);
      a(cky.n, cjb.ll, cky.o);
      a(cky.f, cjb.tJ, cky.k);
      a(cky.k, cjb.ll, cky.l);
      a(cky.k, cjb.qk, cky.m);
      a(cky.k, cjb.ry, cky.s);
      a(cky.l, cjb.ry, cky.t);
      a(cky.s, cjb.ll, cky.t);
      a(cky.s, cjb.qk, cky.u);
      a(cky.f, cjb.nC, cky.v);
      a(cky.v, cjb.ll, cky.w);
      a(cky.v, cjb.qk, cky.x);
      a(cky.p, cjb.ry, cky.s);
      a(cky.q, cjb.ry, cky.t);
      a(cky.f, cjb.qM, cky.p);
      a(cky.p, cjb.ll, cky.q);
      a(cky.p, cjb.qk, cky.r);
      a(cky.f, cjb.qo, cky.y);
      a(cky.y, cjb.ll, cky.z);
      a(cky.f, cjb.rE, cky.A);
      a(cky.A, cjb.qk, cky.B);
      a(cky.A, cjb.ry, cky.C);
      a(cky.B, cjb.ry, cky.D);
      a(cky.C, cjb.qk, cky.D);
      a(cky.E, cjb.ry, cky.C);
      a(cky.F, cjb.ry, cky.C);
      a(cky.G, cjb.ry, cky.D);
      a(cky.f, cjb.rx, cky.E);
      a(cky.E, cjb.ll, cky.F);
      a(cky.E, cjb.qk, cky.G);
      a(cky.f, cjb.rs, cky.H);
      a(cky.H, cjb.ll, cky.I);
      a(cky.H, cjb.qk, cky.J);
      a(cky.f, cjb.rz, cky.K);
      a(cky.K, cjb.ll, cky.L);
      a(cky.K, cjb.qk, cky.M);
      a(cky.c, cjb.ry, cky.N);
      a(cky.N, cjb.ll, cky.O);
      a(cky.f, cjb.uW, cky.Q);
      a(cky.Q, cjb.ll, cky.R);
   }

   private static void a(cit $$0, cit $$1, cit $$2) {
      if (!($$0 instanceof cjn)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else if (!($$2 instanceof cjn)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$2));
      } else {
         c.add(new ckw.a<>($$0, cly.a($$1), $$2));
      }
   }

   private static void a(cit $$0) {
      if (!($$0 instanceof cjn)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else {
         d.add(cly.a($$0));
      }
   }

   private static void a(ckv $$0, cit $$1, ckv $$2) {
      b.add(new ckw.a<>($$0, cly.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cly b;
      final T c;

      public a(T $$0, cly $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
