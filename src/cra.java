import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class cra {
   public static final int a = 20;
   private static final List<cra.a<cqz>> b = Lists.newArrayList();
   private static final List<cra.a<coy>> c = Lists.newArrayList();
   private static final List<csc> d = Lists.newArrayList();
   private static final Predicate<cpd> e = $$0 -> {
      for (csc $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cpd $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cpd $$0) {
      for (cra.a<coy> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cpd $$0) {
      for (cra.a<cqz> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(ij<cqz> $$0) {
      for (cra.a<cqz> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cpd $$0, cpd $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cpd $$0, cpd $$1) {
      for (cra.a<coy> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cpd $$0, cpd $$1) {
      ij<cqz> $$2 = crb.d($$0);

      for (cra.a<cqz> $$3 : b) {
         if ($$3.a.a($$2) && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cpd d(cpd $$0, cpd $$1) {
      if ($$1.b()) {
         return $$1;
      } else {
         ij<cqz> $$2 = crb.d($$1);

         for (cra.a<coy> $$3 : c) {
            if ($$1.a($$3.a) && $$3.b.a($$0)) {
               return crb.a(new cpd($$3.c), $$2);
            }
         }

         for (cra.a<cqz> $$4 : b) {
            if ($$4.a.a($$2) && $$4.b.a($$0)) {
               return crb.a(new cpd($$1.d()), $$4.c);
            }
         }

         return $$1;
      }
   }

   public static void a() {
      a(cpg.sj);
      a(cpg.vk);
      a(cpg.vn);
      a(cpg.sj, cpg.pt, cpg.vk);
      a(cpg.vk, cpg.vj, cpg.vn);
      a(crc.c, cpg.ss, crc.d);
      a(crc.c, cpg.sg, crc.d);
      a(crc.c, cpg.uz, crc.d);
      a(crc.c, cpg.sn, crc.d);
      a(crc.c, cpg.sl, crc.d);
      a(crc.c, cpg.rz, crc.d);
      a(crc.c, cpg.so, crc.d);
      a(crc.c, cpg.qX, crc.e);
      a(crc.c, cpg.lG, crc.d);
      a(crc.c, cpg.si, crc.f);
      a(crc.f, cpg.ug, crc.g);
      a(crc.g, cpg.lG, crc.h);
      a(crc.g, cpg.sm, crc.i);
      a(crc.h, cpg.sm, crc.j);
      a(crc.i, cpg.lG, crc.j);
      a(crc.f, cpg.so, crc.n);
      a(crc.n, cpg.lG, crc.o);
      a(crc.f, cpg.uz, crc.k);
      a(crc.k, cpg.lG, crc.l);
      a(crc.k, cpg.qX, crc.m);
      a(crc.k, cpg.sm, crc.s);
      a(crc.l, cpg.sm, crc.t);
      a(crc.s, cpg.lG, crc.t);
      a(crc.s, cpg.qX, crc.u);
      a(crc.f, cpg.on, crc.v);
      a(crc.v, cpg.lG, crc.w);
      a(crc.v, cpg.qX, crc.x);
      a(crc.p, cpg.sm, crc.s);
      a(crc.q, cpg.sm, crc.t);
      a(crc.f, cpg.rz, crc.p);
      a(crc.p, cpg.lG, crc.q);
      a(crc.p, cpg.qX, crc.r);
      a(crc.f, cpg.rb, crc.y);
      a(crc.y, cpg.lG, crc.z);
      a(crc.f, cpg.ss, crc.A);
      a(crc.A, cpg.qX, crc.B);
      a(crc.A, cpg.sm, crc.C);
      a(crc.B, cpg.sm, crc.D);
      a(crc.C, cpg.qX, crc.D);
      a(crc.E, cpg.sm, crc.C);
      a(crc.F, cpg.sm, crc.C);
      a(crc.G, cpg.sm, crc.D);
      a(crc.f, cpg.sl, crc.E);
      a(crc.E, cpg.lG, crc.F);
      a(crc.E, cpg.qX, crc.G);
      a(crc.f, cpg.sg, crc.H);
      a(crc.H, cpg.lG, crc.I);
      a(crc.H, cpg.qX, crc.J);
      a(crc.f, cpg.sn, crc.K);
      a(crc.K, cpg.lG, crc.L);
      a(crc.K, cpg.qX, crc.M);
      a(crc.c, cpg.sm, crc.N);
      a(crc.N, cpg.lG, crc.O);
      a(crc.f, cpg.vM, crc.Q);
      a(crc.Q, cpg.lG, crc.R);
   }

   private static void a(coy $$0, coy $$1, coy $$2) {
      if (!($$0 instanceof cps)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$0));
      } else if (!($$2 instanceof cps)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$2));
      } else {
         c.add(new cra.a<>($$0.i(), csc.a($$1), $$2.i()));
      }
   }

   private static void a(coy $$0) {
      if (!($$0 instanceof cps)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kf.h.b($$0));
      } else {
         d.add(csc.a($$0));
      }
   }

   private static void a(ij<cqz> $$0, coy $$1, ij<cqz> $$2) {
      b.add(new cra.a<>($$0, csc.a($$1), $$2));
   }

   static record a<T>(ij<T> a, csc b, ij<T> c) {
   }
}
