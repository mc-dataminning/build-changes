import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class clj {
   public static final int a = 20;
   private static final List<clj.a<cli>> b = Lists.newArrayList();
   private static final List<clj.a<cjg>> c = Lists.newArrayList();
   private static final List<cmm> d = Lists.newArrayList();
   private static final Predicate<cjl> e = $$0 -> {
      for (cmm $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cjl $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cjl $$0) {
      for (clj.a<cjg> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjl $$0) {
      for (clj.a<cli> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cli $$0) {
      for (clj.a<cli> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cjl $$0, cjl $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cjl $$0, cjl $$1) {
      cjg $$2 = $$0.d();

      for (clj.a<cjg> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cjl $$0, cjl $$1) {
      cli $$2 = clk.d($$0);

      for (clj.a<cli> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cjl d(cjl $$0, cjl $$1) {
      if (!$$1.b()) {
         cli $$2 = clk.d($$1);
         cjg $$3 = $$1.d();

         for (clj.a<cjg> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return clk.a(new cjl($$4.c), $$2);
            }
         }

         for (clj.a<cli> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return clk.a(new cjl($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cjo.rv);
      a(cjo.uu);
      a(cjo.ux);
      a(cjo.rv, cjo.oG, cjo.uu);
      a(cjo.uu, cjo.ut, cjo.ux);
      a(cll.c, cjo.rE, cll.d);
      a(cll.c, cjo.rs, cll.d);
      a(cll.c, cjo.tJ, cll.d);
      a(cll.c, cjo.rz, cll.d);
      a(cll.c, cjo.rx, cll.d);
      a(cll.c, cjo.qM, cll.d);
      a(cll.c, cjo.rA, cll.d);
      a(cll.c, cjo.qk, cll.e);
      a(cll.c, cjo.ll, cll.d);
      a(cll.c, cjo.ru, cll.f);
      a(cll.f, cjo.tq, cll.g);
      a(cll.g, cjo.ll, cll.h);
      a(cll.g, cjo.ry, cll.i);
      a(cll.h, cjo.ry, cll.j);
      a(cll.i, cjo.ll, cll.j);
      a(cll.f, cjo.rA, cll.n);
      a(cll.n, cjo.ll, cll.o);
      a(cll.f, cjo.tJ, cll.k);
      a(cll.k, cjo.ll, cll.l);
      a(cll.k, cjo.qk, cll.m);
      a(cll.k, cjo.ry, cll.s);
      a(cll.l, cjo.ry, cll.t);
      a(cll.s, cjo.ll, cll.t);
      a(cll.s, cjo.qk, cll.u);
      a(cll.f, cjo.nC, cll.v);
      a(cll.v, cjo.ll, cll.w);
      a(cll.v, cjo.qk, cll.x);
      a(cll.p, cjo.ry, cll.s);
      a(cll.q, cjo.ry, cll.t);
      a(cll.f, cjo.qM, cll.p);
      a(cll.p, cjo.ll, cll.q);
      a(cll.p, cjo.qk, cll.r);
      a(cll.f, cjo.qo, cll.y);
      a(cll.y, cjo.ll, cll.z);
      a(cll.f, cjo.rE, cll.A);
      a(cll.A, cjo.qk, cll.B);
      a(cll.A, cjo.ry, cll.C);
      a(cll.B, cjo.ry, cll.D);
      a(cll.C, cjo.qk, cll.D);
      a(cll.E, cjo.ry, cll.C);
      a(cll.F, cjo.ry, cll.C);
      a(cll.G, cjo.ry, cll.D);
      a(cll.f, cjo.rx, cll.E);
      a(cll.E, cjo.ll, cll.F);
      a(cll.E, cjo.qk, cll.G);
      a(cll.f, cjo.rs, cll.H);
      a(cll.H, cjo.ll, cll.I);
      a(cll.H, cjo.qk, cll.J);
      a(cll.f, cjo.rz, cll.K);
      a(cll.K, cjo.ll, cll.L);
      a(cll.K, cjo.qk, cll.M);
      a(cll.c, cjo.ry, cll.N);
      a(cll.N, cjo.ll, cll.O);
      a(cll.f, cjo.uW, cll.Q);
      a(cll.Q, cjo.ll, cll.R);
   }

   private static void a(cjg $$0, cjg $$1, cjg $$2) {
      if (!($$0 instanceof cka)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else if (!($$2 instanceof cka)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$2));
      } else {
         c.add(new clj.a<>($$0, cmm.a($$1), $$2));
      }
   }

   private static void a(cjg $$0) {
      if (!($$0 instanceof cka)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else {
         d.add(cmm.a($$0));
      }
   }

   private static void a(cli $$0, cjg $$1, cli $$2) {
      b.add(new clj.a<>($$0, cmm.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cmm b;
      final T c;

      public a(T $$0, cmm $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
