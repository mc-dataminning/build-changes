import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class chx {
   public static final int a = 20;
   private static final List<chx.a<chw>> b = Lists.newArrayList();
   private static final List<chx.a<cfu>> c = Lists.newArrayList();
   private static final List<ciz> d = Lists.newArrayList();
   private static final Predicate<cfz> e = $$0 -> {
      for (ciz $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cfz $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cfz $$0) {
      int $$1 = 0;

      for (int $$2 = c.size(); $$1 < $$2; $$1++) {
         if (c.get($$1).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cfz $$0) {
      int $$1 = 0;

      for (int $$2 = b.size(); $$1 < $$2; $$1++) {
         if (b.get($$1).b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(chw $$0) {
      int $$1 = 0;

      for (int $$2 = b.size(); $$1 < $$2; $$1++) {
         if (b.get($$1).c == $$0) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cfz $$0, cfz $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cfz $$0, cfz $$1) {
      cfu $$2 = $$0.d();
      int $$3 = 0;

      for (int $$4 = c.size(); $$3 < $$4; $$3++) {
         chx.a<cfu> $$5 = c.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cfz $$0, cfz $$1) {
      chw $$2 = chy.d($$0);
      int $$3 = 0;

      for (int $$4 = b.size(); $$3 < $$4; $$3++) {
         chx.a<chw> $$5 = b.get($$3);
         if ($$5.a == $$2 && $$5.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cfz d(cfz $$0, cfz $$1) {
      if (!$$1.b()) {
         chw $$2 = chy.d($$1);
         cfu $$3 = $$1.d();
         int $$4 = 0;

         for (int $$5 = c.size(); $$4 < $$5; $$4++) {
            chx.a<cfu> $$6 = c.get($$4);
            if ($$6.a == $$3 && $$6.b.a($$0)) {
               return chy.a(new cfz($$6.c), $$2);
            }
         }

         $$4 = 0;

         for (int $$8 = b.size(); $$4 < $$8; $$4++) {
            chx.a<chw> $$9 = b.get($$4);
            if ($$9.a == $$2 && $$9.b.a($$0)) {
               return chy.a(new cfz($$3), $$9.c);
            }
         }
      }

      return $$1;
   }

   public static void a() {
      a(cgc.rv);
      a(cgc.uu);
      a(cgc.ux);
      a(cgc.rv, cgc.oG, cgc.uu);
      a(cgc.uu, cgc.ut, cgc.ux);
      a(chz.c, cgc.rE, chz.d);
      a(chz.c, cgc.rs, chz.d);
      a(chz.c, cgc.tJ, chz.d);
      a(chz.c, cgc.rz, chz.d);
      a(chz.c, cgc.rx, chz.d);
      a(chz.c, cgc.qM, chz.d);
      a(chz.c, cgc.rA, chz.d);
      a(chz.c, cgc.qk, chz.e);
      a(chz.c, cgc.ll, chz.d);
      a(chz.c, cgc.ru, chz.f);
      a(chz.f, cgc.tq, chz.g);
      a(chz.g, cgc.ll, chz.h);
      a(chz.g, cgc.ry, chz.i);
      a(chz.h, cgc.ry, chz.j);
      a(chz.i, cgc.ll, chz.j);
      a(chz.f, cgc.rA, chz.n);
      a(chz.n, cgc.ll, chz.o);
      a(chz.f, cgc.tJ, chz.k);
      a(chz.k, cgc.ll, chz.l);
      a(chz.k, cgc.qk, chz.m);
      a(chz.k, cgc.ry, chz.s);
      a(chz.l, cgc.ry, chz.t);
      a(chz.s, cgc.ll, chz.t);
      a(chz.s, cgc.qk, chz.u);
      a(chz.f, cgc.nC, chz.v);
      a(chz.v, cgc.ll, chz.w);
      a(chz.v, cgc.qk, chz.x);
      a(chz.p, cgc.ry, chz.s);
      a(chz.q, cgc.ry, chz.t);
      a(chz.f, cgc.qM, chz.p);
      a(chz.p, cgc.ll, chz.q);
      a(chz.p, cgc.qk, chz.r);
      a(chz.f, cgc.qo, chz.y);
      a(chz.y, cgc.ll, chz.z);
      a(chz.f, cgc.rE, chz.A);
      a(chz.A, cgc.qk, chz.B);
      a(chz.A, cgc.ry, chz.C);
      a(chz.B, cgc.ry, chz.D);
      a(chz.C, cgc.qk, chz.D);
      a(chz.E, cgc.ry, chz.C);
      a(chz.F, cgc.ry, chz.C);
      a(chz.G, cgc.ry, chz.D);
      a(chz.f, cgc.rx, chz.E);
      a(chz.E, cgc.ll, chz.F);
      a(chz.E, cgc.qk, chz.G);
      a(chz.f, cgc.rs, chz.H);
      a(chz.H, cgc.ll, chz.I);
      a(chz.H, cgc.qk, chz.J);
      a(chz.f, cgc.rz, chz.K);
      a(chz.K, cgc.ll, chz.L);
      a(chz.K, cgc.qk, chz.M);
      a(chz.c, cgc.ry, chz.N);
      a(chz.N, cgc.ll, chz.O);
      a(chz.f, cgc.uW, chz.Q);
      a(chz.Q, cgc.ll, chz.R);
   }

   private static void a(cfu $$0, cfu $$1, cfu $$2) {
      if (!($$0 instanceof cgo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else if (!($$2 instanceof cgo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$2));
      } else {
         c.add(new chx.a<>($$0, ciz.a($$1), $$2));
      }
   }

   private static void a(cfu $$0) {
      if (!($$0 instanceof cgo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + jb.i.b($$0));
      } else {
         d.add(ciz.a($$0));
      }
   }

   private static void a(chw $$0, cfu $$1, chw $$2) {
      b.add(new chx.a<>($$0, ciz.a($$1), $$2));
   }

   static class a<T> {
      final T a;
      final ciz b;
      final T c;

      public a(T $$0, ciz $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
