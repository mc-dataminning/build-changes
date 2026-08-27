import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class ckv {
   public static final int a = 20;
   private static final List<ckv.a<cku>> b = Lists.newArrayList();
   private static final List<ckv.a<cis>> c = Lists.newArrayList();
   private static final List<clx> d = Lists.newArrayList();
   private static final Predicate<cix> e = $$0 -> {
      for (clx $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cix $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cix $$0) {
      for (ckv.a<cis> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cix $$0) {
      for (ckv.a<cku> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cku $$0) {
      for (ckv.a<cku> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cix $$0, cix $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cix $$0, cix $$1) {
      cis $$2 = $$0.d();

      for (ckv.a<cis> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cix $$0, cix $$1) {
      cku $$2 = ckw.d($$0);

      for (ckv.a<cku> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cix d(cix $$0, cix $$1) {
      if (!$$1.b()) {
         cku $$2 = ckw.d($$1);
         cis $$3 = $$1.d();

         for (ckv.a<cis> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return ckw.a(new cix($$4.c), $$2);
            }
         }

         for (ckv.a<cku> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return ckw.a(new cix($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cja.rv);
      a(cja.uu);
      a(cja.ux);
      a(cja.rv, cja.oG, cja.uu);
      a(cja.uu, cja.ut, cja.ux);
      a(ckx.c, cja.rE, ckx.d);
      a(ckx.c, cja.rs, ckx.d);
      a(ckx.c, cja.tJ, ckx.d);
      a(ckx.c, cja.rz, ckx.d);
      a(ckx.c, cja.rx, ckx.d);
      a(ckx.c, cja.qM, ckx.d);
      a(ckx.c, cja.rA, ckx.d);
      a(ckx.c, cja.qk, ckx.e);
      a(ckx.c, cja.ll, ckx.d);
      a(ckx.c, cja.ru, ckx.f);
      a(ckx.f, cja.tq, ckx.g);
      a(ckx.g, cja.ll, ckx.h);
      a(ckx.g, cja.ry, ckx.i);
      a(ckx.h, cja.ry, ckx.j);
      a(ckx.i, cja.ll, ckx.j);
      a(ckx.f, cja.rA, ckx.n);
      a(ckx.n, cja.ll, ckx.o);
      a(ckx.f, cja.tJ, ckx.k);
      a(ckx.k, cja.ll, ckx.l);
      a(ckx.k, cja.qk, ckx.m);
      a(ckx.k, cja.ry, ckx.s);
      a(ckx.l, cja.ry, ckx.t);
      a(ckx.s, cja.ll, ckx.t);
      a(ckx.s, cja.qk, ckx.u);
      a(ckx.f, cja.nC, ckx.v);
      a(ckx.v, cja.ll, ckx.w);
      a(ckx.v, cja.qk, ckx.x);
      a(ckx.p, cja.ry, ckx.s);
      a(ckx.q, cja.ry, ckx.t);
      a(ckx.f, cja.qM, ckx.p);
      a(ckx.p, cja.ll, ckx.q);
      a(ckx.p, cja.qk, ckx.r);
      a(ckx.f, cja.qo, ckx.y);
      a(ckx.y, cja.ll, ckx.z);
      a(ckx.f, cja.rE, ckx.A);
      a(ckx.A, cja.qk, ckx.B);
      a(ckx.A, cja.ry, ckx.C);
      a(ckx.B, cja.ry, ckx.D);
      a(ckx.C, cja.qk, ckx.D);
      a(ckx.E, cja.ry, ckx.C);
      a(ckx.F, cja.ry, ckx.C);
      a(ckx.G, cja.ry, ckx.D);
      a(ckx.f, cja.rx, ckx.E);
      a(ckx.E, cja.ll, ckx.F);
      a(ckx.E, cja.qk, ckx.G);
      a(ckx.f, cja.rs, ckx.H);
      a(ckx.H, cja.ll, ckx.I);
      a(ckx.H, cja.qk, ckx.J);
      a(ckx.f, cja.rz, ckx.K);
      a(ckx.K, cja.ll, ckx.L);
      a(ckx.K, cja.qk, ckx.M);
      a(ckx.c, cja.ry, ckx.N);
      a(ckx.N, cja.ll, ckx.O);
      a(ckx.f, cja.uW, ckx.Q);
      a(ckx.Q, cja.ll, ckx.R);
   }

   private static void a(cis $$0, cis $$1, cis $$2) {
      if (!($$0 instanceof cjm)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else if (!($$2 instanceof cjm)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$2));
      } else {
         c.add(new ckv.a<>($$0, clx.a($$1), $$2));
      }
   }

   private static void a(cis $$0) {
      if (!($$0 instanceof cjm)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else {
         d.add(clx.a($$0));
      }
   }

   private static void a(cku $$0, cis $$1, cku $$2) {
      b.add(new ckv.a<>($$0, clx.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final clx b;
      final T c;

      public a(T $$0, clx $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
