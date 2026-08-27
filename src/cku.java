import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cku {
   public static final int a = 20;
   private static final List<cku.a<ckt>> b = Lists.newArrayList();
   private static final List<cku.a<cir>> c = Lists.newArrayList();
   private static final List<clw> d = Lists.newArrayList();
   private static final Predicate<ciw> e = $$0 -> {
      for (clw $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(ciw $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(ciw $$0) {
      int $$1 = 0;

      for (int $$2 = c.size(); $$1 < $$2; $$1++) {
         if (c.get($$1).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ciw $$0) {
      int $$1 = 0;

      for (int $$2 = b.size(); $$1 < $$2; $$1++) {
         if (b.get($$1).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ckt $$0) {
      int $$1 = 0;

      for (int $$2 = b.size(); $$1 < $$2; $$1++) {
         if (b.get($$1).c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ciw $$0, ciw $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(ciw $$0, ciw $$1) {
      cir $$2 = $$0.d();
      int $$3 = 0;

      for (int $$4 = c.size(); $$3 < $$4; $$3++) {
         cku.a<cir> $$5 = c.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(ciw $$0, ciw $$1) {
      ckt $$2 = ckv.d($$0);
      int $$3 = 0;

      for (int $$4 = b.size(); $$3 < $$4; $$3++) {
         cku.a<ckt> $$5 = b.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static ciw d(ciw $$0, ciw $$1) {
      if (!$$1.b()) {
         ckt $$2 = ckv.d($$1);
         cir $$3 = $$1.d();
         int $$4 = 0;

         for (int $$5 = c.size(); $$4 < $$5; $$4++) {
            cku.a<cir> $$6 = c.get($$4);
            if ($$6.a == $$3 && $$6.b.a($$0)) {
               return ckv.a(new ciw($$6.c), $$2);
            }
         }

         $$4 = 0;

         for (int $$8 = b.size(); $$4 < $$8; $$4++) {
            cku.a<ckt> $$9 = b.get($$4);
            if ($$9.a == $$2 && $$9.b.a($$0)) {
               return ckv.a(new ciw($$3), $$9.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(ciz.rv);
      a(ciz.uu);
      a(ciz.ux);
      a(ciz.rv, ciz.oG, ciz.uu);
      a(ciz.uu, ciz.ut, ciz.ux);
      a(ckw.c, ciz.rE, ckw.d);
      a(ckw.c, ciz.rs, ckw.d);
      a(ckw.c, ciz.tJ, ckw.d);
      a(ckw.c, ciz.rz, ckw.d);
      a(ckw.c, ciz.rx, ckw.d);
      a(ckw.c, ciz.qM, ckw.d);
      a(ckw.c, ciz.rA, ckw.d);
      a(ckw.c, ciz.qk, ckw.e);
      a(ckw.c, ciz.ll, ckw.d);
      a(ckw.c, ciz.ru, ckw.f);
      a(ckw.f, ciz.tq, ckw.g);
      a(ckw.g, ciz.ll, ckw.h);
      a(ckw.g, ciz.ry, ckw.i);
      a(ckw.h, ciz.ry, ckw.j);
      a(ckw.i, ciz.ll, ckw.j);
      a(ckw.f, ciz.rA, ckw.n);
      a(ckw.n, ciz.ll, ckw.o);
      a(ckw.f, ciz.tJ, ckw.k);
      a(ckw.k, ciz.ll, ckw.l);
      a(ckw.k, ciz.qk, ckw.m);
      a(ckw.k, ciz.ry, ckw.s);
      a(ckw.l, ciz.ry, ckw.t);
      a(ckw.s, ciz.ll, ckw.t);
      a(ckw.s, ciz.qk, ckw.u);
      a(ckw.f, ciz.nC, ckw.v);
      a(ckw.v, ciz.ll, ckw.w);
      a(ckw.v, ciz.qk, ckw.x);
      a(ckw.p, ciz.ry, ckw.s);
      a(ckw.q, ciz.ry, ckw.t);
      a(ckw.f, ciz.qM, ckw.p);
      a(ckw.p, ciz.ll, ckw.q);
      a(ckw.p, ciz.qk, ckw.r);
      a(ckw.f, ciz.qo, ckw.y);
      a(ckw.y, ciz.ll, ckw.z);
      a(ckw.f, ciz.rE, ckw.A);
      a(ckw.A, ciz.qk, ckw.B);
      a(ckw.A, ciz.ry, ckw.C);
      a(ckw.B, ciz.ry, ckw.D);
      a(ckw.C, ciz.qk, ckw.D);
      a(ckw.E, ciz.ry, ckw.C);
      a(ckw.F, ciz.ry, ckw.C);
      a(ckw.G, ciz.ry, ckw.D);
      a(ckw.f, ciz.rx, ckw.E);
      a(ckw.E, ciz.ll, ckw.F);
      a(ckw.E, ciz.qk, ckw.G);
      a(ckw.f, ciz.rs, ckw.H);
      a(ckw.H, ciz.ll, ckw.I);
      a(ckw.H, ciz.qk, ckw.J);
      a(ckw.f, ciz.rz, ckw.K);
      a(ckw.K, ciz.ll, ckw.L);
      a(ckw.K, ciz.qk, ckw.M);
      a(ckw.c, ciz.ry, ckw.N);
      a(ckw.N, ciz.ll, ckw.O);
      a(ckw.f, ciz.uW, ckw.Q);
      a(ckw.Q, ciz.ll, ckw.R);
   }

   private static void a(cir $$0, cir $$1, cir $$2) {
      if (!($$0 instanceof cjl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jc.i.b($$0));
      } else if (!($$2 instanceof cjl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jc.i.b($$2));
      } else {
         c.add(new cku.a<>($$0, clw.a($$1), $$2));
      }
   }

   private static void a(cir $$0) {
      if (!($$0 instanceof cjl)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jc.i.b($$0));
      } else {
         d.add(clw.a($$0));
      }
   }

   private static void a(ckt $$0, cir $$1, ckt $$2) {
      b.add(new cku.a<>($$0, clw.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final clw b;
      final T c;

      public a(T $$0, clw $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
