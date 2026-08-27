import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class crn {
   public static final int a = 20;
   private static final List<crn.a<crm>> b = Lists.newArrayList();
   private static final List<crn.a<cpl>> c = Lists.newArrayList();
   private static final List<csp> d = Lists.newArrayList();
   private static final Predicate<cpq> e = $$0 -> {
      for (csp $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cpq $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cpq $$0) {
      for (crn.a<cpl> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cpq $$0) {
      for (crn.a<crm> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(il<crm> $$0) {
      for (crn.a<crm> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cpq $$0, cpq $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cpq $$0, cpq $$1) {
      for (crn.a<cpl> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cpq $$0, cpq $$1) {
      il<crm> $$2 = cro.d($$0);

      for (crn.a<crm> $$3 : b) {
         if ($$3.a.a($$2) && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cpq d(cpq $$0, cpq $$1) {
      if ($$1.b()) {
         return $$1;
      } else {
         il<crm> $$2 = cro.d($$1);

         for (crn.a<cpl> $$3 : c) {
            if ($$1.a($$3.a) && $$3.b.a($$0)) {
               return cro.a(new cpq($$3.c), $$2);
            }
         }

         for (crn.a<crm> $$4 : b) {
            if ($$4.a.a($$2) && $$4.b.a($$0)) {
               return cro.a(new cpq($$1.d()), $$4.c);
            }
         }

         return $$1;
      }
   }

   public static void a() {
      a(cpt.sj);
      a(cpt.vk);
      a(cpt.vn);
      a(cpt.sj, cpt.pt, cpt.vk);
      a(cpt.vk, cpt.vj, cpt.vn);
      a(crp.c, cpt.ss, crp.d);
      a(crp.c, cpt.sg, crp.d);
      a(crp.c, cpt.uz, crp.d);
      a(crp.c, cpt.sn, crp.d);
      a(crp.c, cpt.sl, crp.d);
      a(crp.c, cpt.rz, crp.d);
      a(crp.c, cpt.so, crp.d);
      a(crp.c, cpt.qX, crp.e);
      a(crp.c, cpt.lG, crp.d);
      a(crp.c, cpt.si, crp.f);
      a(crp.f, cpt.ug, crp.g);
      a(crp.g, cpt.lG, crp.h);
      a(crp.g, cpt.sm, crp.i);
      a(crp.h, cpt.sm, crp.j);
      a(crp.i, cpt.lG, crp.j);
      a(crp.f, cpt.so, crp.n);
      a(crp.n, cpt.lG, crp.o);
      a(crp.f, cpt.uz, crp.k);
      a(crp.k, cpt.lG, crp.l);
      a(crp.k, cpt.qX, crp.m);
      a(crp.k, cpt.sm, crp.s);
      a(crp.l, cpt.sm, crp.t);
      a(crp.s, cpt.lG, crp.t);
      a(crp.s, cpt.qX, crp.u);
      a(crp.f, cpt.on, crp.v);
      a(crp.v, cpt.lG, crp.w);
      a(crp.v, cpt.qX, crp.x);
      a(crp.p, cpt.sm, crp.s);
      a(crp.q, cpt.sm, crp.t);
      a(crp.f, cpt.rz, crp.p);
      a(crp.p, cpt.lG, crp.q);
      a(crp.p, cpt.qX, crp.r);
      a(crp.f, cpt.rb, crp.y);
      a(crp.y, cpt.lG, crp.z);
      a(crp.f, cpt.ss, crp.A);
      a(crp.A, cpt.qX, crp.B);
      a(crp.A, cpt.sm, crp.C);
      a(crp.B, cpt.sm, crp.D);
      a(crp.C, cpt.qX, crp.D);
      a(crp.E, cpt.sm, crp.C);
      a(crp.F, cpt.sm, crp.C);
      a(crp.G, cpt.sm, crp.D);
      a(crp.f, cpt.sl, crp.E);
      a(crp.E, cpt.lG, crp.F);
      a(crp.E, cpt.qX, crp.G);
      a(crp.f, cpt.sg, crp.H);
      a(crp.H, cpt.lG, crp.I);
      a(crp.H, cpt.qX, crp.J);
      a(crp.f, cpt.sn, crp.K);
      a(crp.K, cpt.lG, crp.L);
      a(crp.K, cpt.qX, crp.M);
      a(crp.c, cpt.sm, crp.N);
      a(crp.N, cpt.lG, crp.O);
      a(crp.f, cpt.vM, crp.Q);
      a(crp.Q, cpt.lG, crp.R);
   }

   private static void a(cpl $$0, cpl $$1, cpl $$2) {
      if (!($$0 instanceof cqf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kh.h.b($$0));
      } else if (!($$2 instanceof cqf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kh.h.b($$2));
      } else {
         c.add(new crn.a<>($$0.k(), csp.a($$1), $$2.k()));
      }
   }

   private static void a(cpl $$0) {
      if (!($$0 instanceof cqf)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kh.h.b($$0));
      } else {
         d.add(csp.a($$0));
      }
   }

   private static void a(il<crm> $$0, cpl $$1, il<crm> $$2) {
      b.add(new crn.a<>($$0, csp.a($$1), $$2));
   }

   static record a<T>(il<T> a, csp b, il<T> c) {
   }
}
