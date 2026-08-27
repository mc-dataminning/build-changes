import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cky {
   public static final int a = 20;
   private static final List<cky.a<ckx>> b = Lists.newArrayList();
   private static final List<cky.a<civ>> c = Lists.newArrayList();
   private static final List<cmb> d = Lists.newArrayList();
   private static final Predicate<cja> e = $$0 -> {
      for (cmb $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cja $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cja $$0) {
      for (cky.a<civ> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cja $$0) {
      for (cky.a<ckx> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ckx $$0) {
      for (cky.a<ckx> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cja $$0, cja $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cja $$0, cja $$1) {
      civ $$2 = $$0.d();

      for (cky.a<civ> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cja $$0, cja $$1) {
      ckx $$2 = ckz.d($$0);

      for (cky.a<ckx> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cja d(cja $$0, cja $$1) {
      if (!$$1.b()) {
         ckx $$2 = ckz.d($$1);
         civ $$3 = $$1.d();

         for (cky.a<civ> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return ckz.a(new cja($$4.c), $$2);
            }
         }

         for (cky.a<ckx> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return ckz.a(new cja($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cjd.rv);
      a(cjd.uu);
      a(cjd.ux);
      a(cjd.rv, cjd.oG, cjd.uu);
      a(cjd.uu, cjd.ut, cjd.ux);
      a(cla.c, cjd.rE, cla.d);
      a(cla.c, cjd.rs, cla.d);
      a(cla.c, cjd.tJ, cla.d);
      a(cla.c, cjd.rz, cla.d);
      a(cla.c, cjd.rx, cla.d);
      a(cla.c, cjd.qM, cla.d);
      a(cla.c, cjd.rA, cla.d);
      a(cla.c, cjd.qk, cla.e);
      a(cla.c, cjd.ll, cla.d);
      a(cla.c, cjd.ru, cla.f);
      a(cla.f, cjd.tq, cla.g);
      a(cla.g, cjd.ll, cla.h);
      a(cla.g, cjd.ry, cla.i);
      a(cla.h, cjd.ry, cla.j);
      a(cla.i, cjd.ll, cla.j);
      a(cla.f, cjd.rA, cla.n);
      a(cla.n, cjd.ll, cla.o);
      a(cla.f, cjd.tJ, cla.k);
      a(cla.k, cjd.ll, cla.l);
      a(cla.k, cjd.qk, cla.m);
      a(cla.k, cjd.ry, cla.s);
      a(cla.l, cjd.ry, cla.t);
      a(cla.s, cjd.ll, cla.t);
      a(cla.s, cjd.qk, cla.u);
      a(cla.f, cjd.nC, cla.v);
      a(cla.v, cjd.ll, cla.w);
      a(cla.v, cjd.qk, cla.x);
      a(cla.p, cjd.ry, cla.s);
      a(cla.q, cjd.ry, cla.t);
      a(cla.f, cjd.qM, cla.p);
      a(cla.p, cjd.ll, cla.q);
      a(cla.p, cjd.qk, cla.r);
      a(cla.f, cjd.qo, cla.y);
      a(cla.y, cjd.ll, cla.z);
      a(cla.f, cjd.rE, cla.A);
      a(cla.A, cjd.qk, cla.B);
      a(cla.A, cjd.ry, cla.C);
      a(cla.B, cjd.ry, cla.D);
      a(cla.C, cjd.qk, cla.D);
      a(cla.E, cjd.ry, cla.C);
      a(cla.F, cjd.ry, cla.C);
      a(cla.G, cjd.ry, cla.D);
      a(cla.f, cjd.rx, cla.E);
      a(cla.E, cjd.ll, cla.F);
      a(cla.E, cjd.qk, cla.G);
      a(cla.f, cjd.rs, cla.H);
      a(cla.H, cjd.ll, cla.I);
      a(cla.H, cjd.qk, cla.J);
      a(cla.f, cjd.rz, cla.K);
      a(cla.K, cjd.ll, cla.L);
      a(cla.K, cjd.qk, cla.M);
      a(cla.c, cjd.ry, cla.N);
      a(cla.N, cjd.ll, cla.O);
      a(cla.f, cjd.uW, cla.Q);
      a(cla.Q, cjd.ll, cla.R);
   }

   private static void a(civ $$0, civ $$1, civ $$2) {
      if (!($$0 instanceof cjp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else if (!($$2 instanceof cjp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$2));
      } else {
         c.add(new cky.a<>($$0, cmb.a($$1), $$2));
      }
   }

   private static void a(civ $$0) {
      if (!($$0 instanceof cjp)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jd.i.b($$0));
      } else {
         d.add(cmb.a($$0));
      }
   }

   private static void a(ckx $$0, civ $$1, ckx $$2) {
      b.add(new cky.a<>($$0, cmb.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cmb b;
      final T c;

      public a(T $$0, cmb $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
