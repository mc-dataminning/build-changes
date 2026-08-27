import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cnm {
   public static final int a = 20;
   private static final List<cnm.a<cnl>> b = Lists.newArrayList();
   private static final List<cnm.a<clj>> c = Lists.newArrayList();
   private static final List<coq> d = Lists.newArrayList();
   private static final Predicate<clo> e = $$0 -> {
      for (coq $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(clo $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(clo $$0) {
      for (cnm.a<clj> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clo $$0) {
      for (cnm.a<cnl> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cnl $$0) {
      for (cnm.a<cnl> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(clo $$0, clo $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(clo $$0, clo $$1) {
      clj $$2 = $$0.d();

      for (cnm.a<clj> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(clo $$0, clo $$1) {
      cnl $$2 = cnn.d($$0);

      for (cnm.a<cnl> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static clo d(clo $$0, clo $$1) {
      if (!$$1.b()) {
         cnl $$2 = cnn.d($$1);
         clj $$3 = $$1.d();

         for (cnm.a<clj> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cnn.a(new clo($$4.c), $$2);
            }
         }

         for (cnm.a<cnl> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cnn.a(new clo($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(clr.sh);
      a(clr.vg);
      a(clr.vj);
      a(clr.sh, clr.pr, clr.vg);
      a(clr.vg, clr.vf, clr.vj);
      a(cno.c, clr.sq, cno.d);
      a(cno.c, clr.se, cno.d);
      a(cno.c, clr.uv, cno.d);
      a(cno.c, clr.sl, cno.d);
      a(cno.c, clr.sj, cno.d);
      a(cno.c, clr.rx, cno.d);
      a(cno.c, clr.sm, cno.d);
      a(cno.c, clr.qV, cno.e);
      a(cno.c, clr.lG, cno.d);
      a(cno.c, clr.sg, cno.f);
      a(cno.f, clr.uc, cno.g);
      a(cno.g, clr.lG, cno.h);
      a(cno.g, clr.sk, cno.i);
      a(cno.h, clr.sk, cno.j);
      a(cno.i, clr.lG, cno.j);
      a(cno.f, clr.sm, cno.n);
      a(cno.n, clr.lG, cno.o);
      a(cno.f, clr.uv, cno.k);
      a(cno.k, clr.lG, cno.l);
      a(cno.k, clr.qV, cno.m);
      a(cno.k, clr.sk, cno.s);
      a(cno.l, clr.sk, cno.t);
      a(cno.s, clr.lG, cno.t);
      a(cno.s, clr.qV, cno.u);
      a(cno.f, clr.on, cno.v);
      a(cno.v, clr.lG, cno.w);
      a(cno.v, clr.qV, cno.x);
      a(cno.p, clr.sk, cno.s);
      a(cno.q, clr.sk, cno.t);
      a(cno.f, clr.rx, cno.p);
      a(cno.p, clr.lG, cno.q);
      a(cno.p, clr.qV, cno.r);
      a(cno.f, clr.qZ, cno.y);
      a(cno.y, clr.lG, cno.z);
      a(cno.f, clr.sq, cno.A);
      a(cno.A, clr.qV, cno.B);
      a(cno.A, clr.sk, cno.C);
      a(cno.B, clr.sk, cno.D);
      a(cno.C, clr.qV, cno.D);
      a(cno.E, clr.sk, cno.C);
      a(cno.F, clr.sk, cno.C);
      a(cno.G, clr.sk, cno.D);
      a(cno.f, clr.sj, cno.E);
      a(cno.E, clr.lG, cno.F);
      a(cno.E, clr.qV, cno.G);
      a(cno.f, clr.se, cno.H);
      a(cno.H, clr.lG, cno.I);
      a(cno.H, clr.qV, cno.J);
      a(cno.f, clr.sl, cno.K);
      a(cno.K, clr.lG, cno.L);
      a(cno.K, clr.qV, cno.M);
      a(cno.c, clr.sk, cno.N);
      a(cno.N, clr.lG, cno.O);
      a(cno.f, clr.vI, cno.Q);
      a(cno.Q, clr.lG, cno.R);
   }

   private static void a(clj $$0, clj $$1, clj $$2) {
      if (!($$0 instanceof cmd)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kc.i.b($$0));
      } else if (!($$2 instanceof cmd)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kc.i.b($$2));
      } else {
         c.add(new cnm.a<>($$0, coq.a($$1), $$2));
      }
   }

   private static void a(clj $$0) {
      if (!($$0 instanceof cmd)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kc.i.b($$0));
      } else {
         d.add(coq.a($$0));
      }
   }

   private static void a(cnl $$0, clj $$1, cnl $$2) {
      b.add(new cnm.a<>($$0, coq.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final coq b;
      final T c;

      public a(T $$0, coq $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
