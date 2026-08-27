import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class clf {
   public static final int a = 20;
   private static final List<clf.a<cle>> b = Lists.newArrayList();
   private static final List<clf.a<cjc>> c = Lists.newArrayList();
   private static final List<cmi> d = Lists.newArrayList();
   private static final Predicate<cjh> e = $$0 -> {
      for (cmi $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cjh $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cjh $$0) {
      for (clf.a<cjc> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjh $$0) {
      for (clf.a<cle> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cle $$0) {
      for (clf.a<cle> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cjh $$0, cjh $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cjh $$0, cjh $$1) {
      cjc $$2 = $$0.d();

      for (clf.a<cjc> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjh $$0, cjh $$1) {
      cle $$2 = clg.d($$0);

      for (clf.a<cle> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cjh d(cjh $$0, cjh $$1) {
      if (!$$1.b()) {
         cle $$2 = clg.d($$1);
         cjc $$3 = $$1.d();

         for (clf.a<cjc> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return clg.a(new cjh($$4.c), $$2);
            }
         }

         for (clf.a<cle> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return clg.a(new cjh($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cjk.rv);
      a(cjk.uu);
      a(cjk.ux);
      a(cjk.rv, cjk.oG, cjk.uu);
      a(cjk.uu, cjk.ut, cjk.ux);
      a(clh.c, cjk.rE, clh.d);
      a(clh.c, cjk.rs, clh.d);
      a(clh.c, cjk.tJ, clh.d);
      a(clh.c, cjk.rz, clh.d);
      a(clh.c, cjk.rx, clh.d);
      a(clh.c, cjk.qM, clh.d);
      a(clh.c, cjk.rA, clh.d);
      a(clh.c, cjk.qk, clh.e);
      a(clh.c, cjk.ll, clh.d);
      a(clh.c, cjk.ru, clh.f);
      a(clh.f, cjk.tq, clh.g);
      a(clh.g, cjk.ll, clh.h);
      a(clh.g, cjk.ry, clh.i);
      a(clh.h, cjk.ry, clh.j);
      a(clh.i, cjk.ll, clh.j);
      a(clh.f, cjk.rA, clh.n);
      a(clh.n, cjk.ll, clh.o);
      a(clh.f, cjk.tJ, clh.k);
      a(clh.k, cjk.ll, clh.l);
      a(clh.k, cjk.qk, clh.m);
      a(clh.k, cjk.ry, clh.s);
      a(clh.l, cjk.ry, clh.t);
      a(clh.s, cjk.ll, clh.t);
      a(clh.s, cjk.qk, clh.u);
      a(clh.f, cjk.nC, clh.v);
      a(clh.v, cjk.ll, clh.w);
      a(clh.v, cjk.qk, clh.x);
      a(clh.p, cjk.ry, clh.s);
      a(clh.q, cjk.ry, clh.t);
      a(clh.f, cjk.qM, clh.p);
      a(clh.p, cjk.ll, clh.q);
      a(clh.p, cjk.qk, clh.r);
      a(clh.f, cjk.qo, clh.y);
      a(clh.y, cjk.ll, clh.z);
      a(clh.f, cjk.rE, clh.A);
      a(clh.A, cjk.qk, clh.B);
      a(clh.A, cjk.ry, clh.C);
      a(clh.B, cjk.ry, clh.D);
      a(clh.C, cjk.qk, clh.D);
      a(clh.E, cjk.ry, clh.C);
      a(clh.F, cjk.ry, clh.C);
      a(clh.G, cjk.ry, clh.D);
      a(clh.f, cjk.rx, clh.E);
      a(clh.E, cjk.ll, clh.F);
      a(clh.E, cjk.qk, clh.G);
      a(clh.f, cjk.rs, clh.H);
      a(clh.H, cjk.ll, clh.I);
      a(clh.H, cjk.qk, clh.J);
      a(clh.f, cjk.rz, clh.K);
      a(clh.K, cjk.ll, clh.L);
      a(clh.K, cjk.qk, clh.M);
      a(clh.c, cjk.ry, clh.N);
      a(clh.N, cjk.ll, clh.O);
      a(clh.f, cjk.uW, clh.Q);
      a(clh.Q, cjk.ll, clh.R);
   }

   private static void a(cjc $$0, cjc $$1, cjc $$2) {
      if (!($$0 instanceof cjw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else if (!($$2 instanceof cjw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$2));
      } else {
         c.add(new clf.a<>($$0, cmi.a($$1), $$2));
      }
   }

   private static void a(cjc $$0) {
      if (!($$0 instanceof cjw)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else {
         d.add(cmi.a($$0));
      }
   }

   private static void a(cle $$0, cjc $$1, cle $$2) {
      b.add(new clf.a<>($$0, cmi.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cmi b;
      final T c;

      public a(T $$0, cmi $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
