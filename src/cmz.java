import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cmz {
   public static final int a = 20;
   private static final List<cmz.a<cmy>> b = Lists.newArrayList();
   private static final List<cmz.a<ckw>> c = Lists.newArrayList();
   private static final List<coc> d = Lists.newArrayList();
   private static final Predicate<clb> e = $$0 -> {
      for (coc $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(clb $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(clb $$0) {
      for (cmz.a<ckw> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clb $$0) {
      for (cmz.a<cmy> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cmy $$0) {
      for (cmz.a<cmy> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(clb $$0, clb $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(clb $$0, clb $$1) {
      ckw $$2 = $$0.d();

      for (cmz.a<ckw> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clb $$0, clb $$1) {
      cmy $$2 = cna.d($$0);

      for (cmz.a<cmy> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static clb d(clb $$0, clb $$1) {
      if (!$$1.b()) {
         cmy $$2 = cna.d($$1);
         ckw $$3 = $$1.d();

         for (cmz.a<ckw> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cna.a(new clb($$4.c), $$2);
            }
         }

         for (cmz.a<cmy> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cna.a(new clb($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cle.rw);
      a(cle.uv);
      a(cle.uy);
      a(cle.rw, cle.oG, cle.uv);
      a(cle.uv, cle.uu, cle.uy);
      a(cnb.c, cle.rF, cnb.d);
      a(cnb.c, cle.rt, cnb.d);
      a(cnb.c, cle.tK, cnb.d);
      a(cnb.c, cle.rA, cnb.d);
      a(cnb.c, cle.ry, cnb.d);
      a(cnb.c, cle.qM, cnb.d);
      a(cnb.c, cle.rB, cnb.d);
      a(cnb.c, cle.qk, cnb.e);
      a(cnb.c, cle.ll, cnb.d);
      a(cnb.c, cle.rv, cnb.f);
      a(cnb.f, cle.tr, cnb.g);
      a(cnb.g, cle.ll, cnb.h);
      a(cnb.g, cle.rz, cnb.i);
      a(cnb.h, cle.rz, cnb.j);
      a(cnb.i, cle.ll, cnb.j);
      a(cnb.f, cle.rB, cnb.n);
      a(cnb.n, cle.ll, cnb.o);
      a(cnb.f, cle.tK, cnb.k);
      a(cnb.k, cle.ll, cnb.l);
      a(cnb.k, cle.qk, cnb.m);
      a(cnb.k, cle.rz, cnb.s);
      a(cnb.l, cle.rz, cnb.t);
      a(cnb.s, cle.ll, cnb.t);
      a(cnb.s, cle.qk, cnb.u);
      a(cnb.f, cle.nC, cnb.v);
      a(cnb.v, cle.ll, cnb.w);
      a(cnb.v, cle.qk, cnb.x);
      a(cnb.p, cle.rz, cnb.s);
      a(cnb.q, cle.rz, cnb.t);
      a(cnb.f, cle.qM, cnb.p);
      a(cnb.p, cle.ll, cnb.q);
      a(cnb.p, cle.qk, cnb.r);
      a(cnb.f, cle.qo, cnb.y);
      a(cnb.y, cle.ll, cnb.z);
      a(cnb.f, cle.rF, cnb.A);
      a(cnb.A, cle.qk, cnb.B);
      a(cnb.A, cle.rz, cnb.C);
      a(cnb.B, cle.rz, cnb.D);
      a(cnb.C, cle.qk, cnb.D);
      a(cnb.E, cle.rz, cnb.C);
      a(cnb.F, cle.rz, cnb.C);
      a(cnb.G, cle.rz, cnb.D);
      a(cnb.f, cle.ry, cnb.E);
      a(cnb.E, cle.ll, cnb.F);
      a(cnb.E, cle.qk, cnb.G);
      a(cnb.f, cle.rt, cnb.H);
      a(cnb.H, cle.ll, cnb.I);
      a(cnb.H, cle.qk, cnb.J);
      a(cnb.f, cle.rA, cnb.K);
      a(cnb.K, cle.ll, cnb.L);
      a(cnb.K, cle.qk, cnb.M);
      a(cnb.c, cle.rz, cnb.N);
      a(cnb.N, cle.ll, cnb.O);
      a(cnb.f, cle.uX, cnb.Q);
      a(cnb.Q, cle.ll, cnb.R);
   }

   private static void a(ckw $$0, ckw $$1, ckw $$2) {
      if (!($$0 instanceof clq)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else if (!($$2 instanceof clq)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$2));
      } else {
         c.add(new cmz.a<>($$0, coc.a($$1), $$2));
      }
   }

   private static void a(ckw $$0) {
      if (!($$0 instanceof clq)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else {
         d.add(coc.a($$0));
      }
   }

   private static void a(cmy $$0, ckw $$1, cmy $$2) {
      b.add(new cmz.a<>($$0, coc.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final coc b;
      final T c;

      public a(T $$0, coc $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
