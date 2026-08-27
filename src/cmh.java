import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cmh {
   public static final int a = 20;
   private static final List<cmh.a<cmg>> b = Lists.newArrayList();
   private static final List<cmh.a<cke>> c = Lists.newArrayList();
   private static final List<cnk> d = Lists.newArrayList();
   private static final Predicate<ckj> e = $$0 -> {
      for (cnk $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(ckj $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(ckj $$0) {
      for (cmh.a<cke> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ckj $$0) {
      for (cmh.a<cmg> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cmg $$0) {
      for (cmh.a<cmg> $$1 : b) {
         if ($$1.c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ckj $$0, ckj $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(ckj $$0, ckj $$1) {
      cke $$2 = $$0.d();

      for (cmh.a<cke> $$3 : c) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ckj $$0, ckj $$1) {
      cmg $$2 = cmi.d($$0);

      for (cmh.a<cmg> $$3 : b) {
         if ($$3.a == $$2 && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static ckj d(ckj $$0, ckj $$1) {
      if (!$$1.b()) {
         cmg $$2 = cmi.d($$1);
         cke $$3 = $$1.d();

         for (cmh.a<cke> $$4 : c) {
            if ($$4.a == $$3 && $$4.b.a($$0)) {
               return cmi.a(new ckj($$4.c), $$2);
            }
         }

         for (cmh.a<cmg> $$5 : b) {
            if ($$5.a == $$2 && $$5.b.a($$0)) {
               return cmi.a(new ckj($$3), $$5.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(ckm.rv);
      a(ckm.uu);
      a(ckm.ux);
      a(ckm.rv, ckm.oG, ckm.uu);
      a(ckm.uu, ckm.ut, ckm.ux);
      a(cmj.c, ckm.rE, cmj.d);
      a(cmj.c, ckm.rs, cmj.d);
      a(cmj.c, ckm.tJ, cmj.d);
      a(cmj.c, ckm.rz, cmj.d);
      a(cmj.c, ckm.rx, cmj.d);
      a(cmj.c, ckm.qM, cmj.d);
      a(cmj.c, ckm.rA, cmj.d);
      a(cmj.c, ckm.qk, cmj.e);
      a(cmj.c, ckm.ll, cmj.d);
      a(cmj.c, ckm.ru, cmj.f);
      a(cmj.f, ckm.tq, cmj.g);
      a(cmj.g, ckm.ll, cmj.h);
      a(cmj.g, ckm.ry, cmj.i);
      a(cmj.h, ckm.ry, cmj.j);
      a(cmj.i, ckm.ll, cmj.j);
      a(cmj.f, ckm.rA, cmj.n);
      a(cmj.n, ckm.ll, cmj.o);
      a(cmj.f, ckm.tJ, cmj.k);
      a(cmj.k, ckm.ll, cmj.l);
      a(cmj.k, ckm.qk, cmj.m);
      a(cmj.k, ckm.ry, cmj.s);
      a(cmj.l, ckm.ry, cmj.t);
      a(cmj.s, ckm.ll, cmj.t);
      a(cmj.s, ckm.qk, cmj.u);
      a(cmj.f, ckm.nC, cmj.v);
      a(cmj.v, ckm.ll, cmj.w);
      a(cmj.v, ckm.qk, cmj.x);
      a(cmj.p, ckm.ry, cmj.s);
      a(cmj.q, ckm.ry, cmj.t);
      a(cmj.f, ckm.qM, cmj.p);
      a(cmj.p, ckm.ll, cmj.q);
      a(cmj.p, ckm.qk, cmj.r);
      a(cmj.f, ckm.qo, cmj.y);
      a(cmj.y, ckm.ll, cmj.z);
      a(cmj.f, ckm.rE, cmj.A);
      a(cmj.A, ckm.qk, cmj.B);
      a(cmj.A, ckm.ry, cmj.C);
      a(cmj.B, ckm.ry, cmj.D);
      a(cmj.C, ckm.qk, cmj.D);
      a(cmj.E, ckm.ry, cmj.C);
      a(cmj.F, ckm.ry, cmj.C);
      a(cmj.G, ckm.ry, cmj.D);
      a(cmj.f, ckm.rx, cmj.E);
      a(cmj.E, ckm.ll, cmj.F);
      a(cmj.E, ckm.qk, cmj.G);
      a(cmj.f, ckm.rs, cmj.H);
      a(cmj.H, ckm.ll, cmj.I);
      a(cmj.H, ckm.qk, cmj.J);
      a(cmj.f, ckm.rz, cmj.K);
      a(cmj.K, ckm.ll, cmj.L);
      a(cmj.K, ckm.qk, cmj.M);
      a(cmj.c, ckm.ry, cmj.N);
      a(cmj.N, ckm.ll, cmj.O);
      a(cmj.f, ckm.uW, cmj.Q);
      a(cmj.Q, ckm.ll, cmj.R);
   }

   private static void a(cke $$0, cke $$1, cke $$2) {
      if (!($$0 instanceof cky)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else if (!($$2 instanceof cky)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$2));
      } else {
         c.add(new cmh.a<>($$0, cnk.a($$1), $$2));
      }
   }

   private static void a(cke $$0) {
      if (!($$0 instanceof cky)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jy.i.b($$0));
      } else {
         d.add(cnk.a($$0));
      }
   }

   private static void a(cmg $$0, cke $$1, cmg $$2) {
      b.add(new cmh.a<>($$0, cnk.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final cnk b;
      final T c;

      public a(T $$0, cnk $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
