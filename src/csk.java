import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class csk {
   public static final int a = 20;
   private static final List<csk.a<csj>> b = Lists.newArrayList();
   private static final List<csk.a<cqh>> c = Lists.newArrayList();
   private static final List<ctm> d = Lists.newArrayList();
   private static final Predicate<cqm> e = $$0 -> {
      for (ctm $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cqm $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cqm $$0) {
      for (csk.a<cqh> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cqm $$0) {
      for (csk.a<csj> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(il<csj> $$0) {
      for (csk.a<csj> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cqm $$0, cqm $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cqm $$0, cqm $$1) {
      for (csk.a<cqh> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cqm $$0, cqm $$1) {
      il<csj> $$2 = csl.d($$0);

      for (csk.a<csj> $$3 : b) {
         if ($$3.a.a($$2) && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cqm d(cqm $$0, cqm $$1) {
      if ($$1.b()) {
         return $$1;
      } else {
         il<csj> $$2 = csl.d($$1);

         for (csk.a<cqh> $$3 : c) {
            if ($$1.a($$3.a) && $$3.b.a($$0)) {
               return csl.a(new cqm($$3.c), $$2);
            }
         }

         for (csk.a<csj> $$4 : b) {
            if ($$4.a.a($$2) && $$4.b.a($$0)) {
               return csl.a(new cqm($$1.d()), $$4.c);
            }
         }

         return $$1;
      }
   }

   public static void a() {
      a(cqp.sj);
      a(cqp.vm);
      a(cqp.vp);
      a(cqp.sj, cqp.pt, cqp.vm);
      a(cqp.vm, cqp.vl, cqp.vp);
      a(csm.c, cqp.ss, csm.d);
      a(csm.c, cqp.sg, csm.d);
      a(csm.c, cqp.uB, csm.d);
      a(csm.c, cqp.sn, csm.d);
      a(csm.c, cqp.sl, csm.d);
      a(csm.c, cqp.rz, csm.d);
      a(csm.c, cqp.so, csm.d);
      a(csm.c, cqp.qX, csm.e);
      a(csm.c, cqp.lG, csm.d);
      a(csm.c, cqp.si, csm.f);
      a(csm.f, cqp.ui, csm.g);
      a(csm.g, cqp.lG, csm.h);
      a(csm.g, cqp.sm, csm.i);
      a(csm.h, cqp.sm, csm.j);
      a(csm.i, cqp.lG, csm.j);
      a(csm.f, cqp.so, csm.n);
      a(csm.n, cqp.lG, csm.o);
      a(csm.f, cqp.uB, csm.k);
      a(csm.k, cqp.lG, csm.l);
      a(csm.k, cqp.qX, csm.m);
      a(csm.k, cqp.sm, csm.s);
      a(csm.l, cqp.sm, csm.t);
      a(csm.s, cqp.lG, csm.t);
      a(csm.s, cqp.qX, csm.u);
      a(csm.f, cqp.on, csm.v);
      a(csm.v, cqp.lG, csm.w);
      a(csm.v, cqp.qX, csm.x);
      a(csm.p, cqp.sm, csm.s);
      a(csm.q, cqp.sm, csm.t);
      a(csm.f, cqp.rz, csm.p);
      a(csm.p, cqp.lG, csm.q);
      a(csm.p, cqp.qX, csm.r);
      a(csm.f, cqp.rb, csm.y);
      a(csm.y, cqp.lG, csm.z);
      a(csm.f, cqp.ss, csm.A);
      a(csm.A, cqp.qX, csm.B);
      a(csm.A, cqp.sm, csm.C);
      a(csm.B, cqp.sm, csm.D);
      a(csm.C, cqp.qX, csm.D);
      a(csm.E, cqp.sm, csm.C);
      a(csm.F, cqp.sm, csm.C);
      a(csm.G, cqp.sm, csm.D);
      a(csm.f, cqp.sl, csm.E);
      a(csm.E, cqp.lG, csm.F);
      a(csm.E, cqp.qX, csm.G);
      a(csm.f, cqp.sg, csm.H);
      a(csm.H, cqp.lG, csm.I);
      a(csm.H, cqp.qX, csm.J);
      a(csm.f, cqp.sn, csm.K);
      a(csm.K, cqp.lG, csm.L);
      a(csm.K, cqp.qX, csm.M);
      a(csm.c, cqp.sm, csm.N);
      a(csm.N, cqp.lG, csm.O);
      a(csm.f, cqp.vO, csm.Q);
      a(csm.Q, cqp.lG, csm.R);
   }

   private static void a(cqh $$0, cqh $$1, cqh $$2) {
      if (!($$0 instanceof crb)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$0));
      } else if (!($$2 instanceof crb)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$2));
      } else {
         c.add(new csk.a<>($$0.k(), ctm.a($$1), $$2.k()));
      }
   }

   private static void a(cqh $$0) {
      if (!($$0 instanceof crb)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$0));
      } else {
         d.add(ctm.a($$0));
      }
   }

   private static void a(il<csj> $$0, cqh $$1, il<csj> $$2) {
      b.add(new csk.a<>($$0, ctm.a($$1), $$2));
   }

   static record a<T>(il<T> a, ctm b, il<T> c) {
   }
}
