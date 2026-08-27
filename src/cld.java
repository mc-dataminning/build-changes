import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cld {
   public static final int a = 20;
   private static final List<cld.a<clc>> b = Lists.newArrayList();
   private static final List<cld.a<cja>> c = Lists.newArrayList();
   private static final List<cmg> d = Lists.newArrayList();
   private static final Predicate<cjf> e = $$0 -> {
      for (cmg $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cjf $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cjf $$0) {
      for (cld.a<cja> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjf $$0) {
      for (cld.a<clc> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(clc $$0) {
      for (cld.a<clc> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cjf $$0, cjf $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cjf $$0, cjf $$1) {
      cja $$2 = $$0.d();

      for (cld.a<cja> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjf $$0, cjf $$1) {
      clc $$2 = cle.d($$0);

      for (cld.a<clc> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cjf d(cjf $$0, cjf $$1) {
      if (!$$1.b()) {
         clc $$2 = cle.d($$1);
         cja $$3 = $$1.d();

         for (cld.a<cja> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cle.a(new cjf($$4.c), $$2);
            }
         }

         for (cld.a<clc> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cle.a(new cjf($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cji.rv);
      a(cji.uu);
      a(cji.ux);
      a(cji.rv, cji.oG, cji.uu);
      a(cji.uu, cji.ut, cji.ux);
      a(clf.c, cji.rE, clf.d);
      a(clf.c, cji.rs, clf.d);
      a(clf.c, cji.tJ, clf.d);
      a(clf.c, cji.rz, clf.d);
      a(clf.c, cji.rx, clf.d);
      a(clf.c, cji.qM, clf.d);
      a(clf.c, cji.rA, clf.d);
      a(clf.c, cji.qk, clf.e);
      a(clf.c, cji.ll, clf.d);
      a(clf.c, cji.ru, clf.f);
      a(clf.f, cji.tq, clf.g);
      a(clf.g, cji.ll, clf.h);
      a(clf.g, cji.ry, clf.i);
      a(clf.h, cji.ry, clf.j);
      a(clf.i, cji.ll, clf.j);
      a(clf.f, cji.rA, clf.n);
      a(clf.n, cji.ll, clf.o);
      a(clf.f, cji.tJ, clf.k);
      a(clf.k, cji.ll, clf.l);
      a(clf.k, cji.qk, clf.m);
      a(clf.k, cji.ry, clf.s);
      a(clf.l, cji.ry, clf.t);
      a(clf.s, cji.ll, clf.t);
      a(clf.s, cji.qk, clf.u);
      a(clf.f, cji.nC, clf.v);
      a(clf.v, cji.ll, clf.w);
      a(clf.v, cji.qk, clf.x);
      a(clf.p, cji.ry, clf.s);
      a(clf.q, cji.ry, clf.t);
      a(clf.f, cji.qM, clf.p);
      a(clf.p, cji.ll, clf.q);
      a(clf.p, cji.qk, clf.r);
      a(clf.f, cji.qo, clf.y);
      a(clf.y, cji.ll, clf.z);
      a(clf.f, cji.rE, clf.A);
      a(clf.A, cji.qk, clf.B);
      a(clf.A, cji.ry, clf.C);
      a(clf.B, cji.ry, clf.D);
      a(clf.C, cji.qk, clf.D);
      a(clf.E, cji.ry, clf.C);
      a(clf.F, cji.ry, clf.C);
      a(clf.G, cji.ry, clf.D);
      a(clf.f, cji.rx, clf.E);
      a(clf.E, cji.ll, clf.F);
      a(clf.E, cji.qk, clf.G);
      a(clf.f, cji.rs, clf.H);
      a(clf.H, cji.ll, clf.I);
      a(clf.H, cji.qk, clf.J);
      a(clf.f, cji.rz, clf.K);
      a(clf.K, cji.ll, clf.L);
      a(clf.K, cji.qk, clf.M);
      a(clf.c, cji.ry, clf.N);
      a(clf.N, cji.ll, clf.O);
      a(clf.f, cji.uW, clf.Q);
      a(clf.Q, cji.ll, clf.R);
   }

   private static void a(cja $$0, cja $$1, cja $$2) {
      if (!($$0 instanceof cju)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else if (!($$2 instanceof cju)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$2));
      } else {
         c.add(new cld.a<>($$0, cmg.a($$1), $$2));
      }
   }

   private static void a(cja $$0) {
      if (!($$0 instanceof cju)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else {
         d.add(cmg.a($$0));
      }
   }

   private static void a(clc $$0, cja $$1, clc $$2) {
      b.add(new cld.a<>($$0, cmg.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cmg b;
      final T c;

      public a(T $$0, cmg $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
