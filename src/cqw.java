import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cqw {
   public static final int a = 20;
   private static final List<cqw.a<cqv>> b = Lists.newArrayList();
   private static final List<cqw.a<cou>> c = Lists.newArrayList();
   private static final List<cry> d = Lists.newArrayList();
   private static final Predicate<coz> e = $$0 -> {
      for (cry $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(coz $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(coz $$0) {
      for (cqw.a<cou> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(coz $$0) {
      for (cqw.a<cqv> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ij<cqv> $$0) {
      for (cqw.a<cqv> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(coz $$0, coz $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(coz $$0, coz $$1) {
      for (cqw.a<cou> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(coz $$0, coz $$1) {
      ij<cqv> $$2 = cqx.d($$0);

      for (cqw.a<cqv> $$3 : b) {
         if ($$3.a.a($$2) && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static coz d(coz $$0, coz $$1) {
      if ($$1.b()) {
         return $$1;
      } else {
         ij<cqv> $$2 = cqx.d($$1);

         for (cqw.a<cou> $$3 : c) {
            if ($$1.a($$3.a) && $$3.b.a($$0)) {
               return cqx.a(new coz($$3.c), $$2);
            }
         }

         for (cqw.a<cqv> $$4 : b) {
            if ($$4.a.a($$2) && $$4.b.a($$0)) {
               return cqx.a(new coz($$1.d()), $$4.c);
            }
         }

         return $$1;
      }
   }

   public static void a() {
      a(cpc.sj);
      a(cpc.vk);
      a(cpc.vn);
      a(cpc.sj, cpc.pt, cpc.vk);
      a(cpc.vk, cpc.vj, cpc.vn);
      a(cqy.c, cpc.ss, cqy.d);
      a(cqy.c, cpc.sg, cqy.d);
      a(cqy.c, cpc.uz, cqy.d);
      a(cqy.c, cpc.sn, cqy.d);
      a(cqy.c, cpc.sl, cqy.d);
      a(cqy.c, cpc.rz, cqy.d);
      a(cqy.c, cpc.so, cqy.d);
      a(cqy.c, cpc.qX, cqy.e);
      a(cqy.c, cpc.lG, cqy.d);
      a(cqy.c, cpc.si, cqy.f);
      a(cqy.f, cpc.ug, cqy.g);
      a(cqy.g, cpc.lG, cqy.h);
      a(cqy.g, cpc.sm, cqy.i);
      a(cqy.h, cpc.sm, cqy.j);
      a(cqy.i, cpc.lG, cqy.j);
      a(cqy.f, cpc.so, cqy.n);
      a(cqy.n, cpc.lG, cqy.o);
      a(cqy.f, cpc.uz, cqy.k);
      a(cqy.k, cpc.lG, cqy.l);
      a(cqy.k, cpc.qX, cqy.m);
      a(cqy.k, cpc.sm, cqy.s);
      a(cqy.l, cpc.sm, cqy.t);
      a(cqy.s, cpc.lG, cqy.t);
      a(cqy.s, cpc.qX, cqy.u);
      a(cqy.f, cpc.on, cqy.v);
      a(cqy.v, cpc.lG, cqy.w);
      a(cqy.v, cpc.qX, cqy.x);
      a(cqy.p, cpc.sm, cqy.s);
      a(cqy.q, cpc.sm, cqy.t);
      a(cqy.f, cpc.rz, cqy.p);
      a(cqy.p, cpc.lG, cqy.q);
      a(cqy.p, cpc.qX, cqy.r);
      a(cqy.f, cpc.rb, cqy.y);
      a(cqy.y, cpc.lG, cqy.z);
      a(cqy.f, cpc.ss, cqy.A);
      a(cqy.A, cpc.qX, cqy.B);
      a(cqy.A, cpc.sm, cqy.C);
      a(cqy.B, cpc.sm, cqy.D);
      a(cqy.C, cpc.qX, cqy.D);
      a(cqy.E, cpc.sm, cqy.C);
      a(cqy.F, cpc.sm, cqy.C);
      a(cqy.G, cpc.sm, cqy.D);
      a(cqy.f, cpc.sl, cqy.E);
      a(cqy.E, cpc.lG, cqy.F);
      a(cqy.E, cpc.qX, cqy.G);
      a(cqy.f, cpc.sg, cqy.H);
      a(cqy.H, cpc.lG, cqy.I);
      a(cqy.H, cpc.qX, cqy.J);
      a(cqy.f, cpc.sn, cqy.K);
      a(cqy.K, cpc.lG, cqy.L);
      a(cqy.K, cpc.qX, cqy.M);
      a(cqy.c, cpc.sm, cqy.N);
      a(cqy.N, cpc.lG, cqy.O);
      a(cqy.f, cpc.vM, cqy.Q);
      a(cqy.Q, cpc.lG, cqy.R);
   }

   private static void a(cou $$0, cou $$1, cou $$2) {
      if (!($$0 instanceof cpo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$0));
      } else if (!($$2 instanceof cpo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$2));
      } else {
         c.add(new cqw.a<>($$0.i(), cry.a($$1), $$2.i()));
      }
   }

   private static void a(cou $$0) {
      if (!($$0 instanceof cpo)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$0));
      } else {
         d.add(cry.a($$0));
      }
   }

   private static void a(ij<cqv> $$0, cou $$1, ij<cqv> $$2) {
      b.add(new cqw.a<>($$0, cry.a($$1), $$2));
   }

   static record a<T>(ij<T> a, cry b, ij<T> c) {
   }
}
