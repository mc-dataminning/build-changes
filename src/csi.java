import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class csi {
   public static final int a = 20;
   private static final List<csi.a<csh>> b = Lists.newArrayList();
   private static final List<csi.a<cqf>> c = Lists.newArrayList();
   private static final List<ctk> d = Lists.newArrayList();
   private static final Predicate<cqk> e = $$0 -> {
      for (ctk $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(cqk $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(cqk $$0) {
      for (csi.a<cqf> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cqk $$0) {
      for (csi.a<csh> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(il<csh> $$0) {
      for (csi.a<csh> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(cqk $$0, cqk $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(cqk $$0, cqk $$1) {
      for (csi.a<cqf> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(cqk $$0, cqk $$1) {
      il<csh> $$2 = csj.d($$0);

      for (csi.a<csh> $$3 : b) {
         if ($$3.a.a($$2) && $$3.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public static cqk d(cqk $$0, cqk $$1) {
      if ($$1.b()) {
         return $$1;
      } else {
         il<csh> $$2 = csj.d($$1);

         for (csi.a<cqf> $$3 : c) {
            if ($$1.a($$3.a) && $$3.b.a($$0)) {
               return csj.a(new cqk($$3.c), $$2);
            }
         }

         for (csi.a<csh> $$4 : b) {
            if ($$4.a.a($$2) && $$4.b.a($$0)) {
               return csj.a(new cqk($$1.d()), $$4.c);
            }
         }

         return $$1;
      }
   }

   public static void a() {
      a(cqn.sj);
      a(cqn.vl);
      a(cqn.vo);
      a(cqn.sj, cqn.pt, cqn.vl);
      a(cqn.vl, cqn.vk, cqn.vo);
      a(csk.c, cqn.ss, csk.d);
      a(csk.c, cqn.sg, csk.d);
      a(csk.c, cqn.uA, csk.d);
      a(csk.c, cqn.sn, csk.d);
      a(csk.c, cqn.sl, csk.d);
      a(csk.c, cqn.rz, csk.d);
      a(csk.c, cqn.so, csk.d);
      a(csk.c, cqn.qX, csk.e);
      a(csk.c, cqn.lG, csk.d);
      a(csk.c, cqn.si, csk.f);
      a(csk.f, cqn.uh, csk.g);
      a(csk.g, cqn.lG, csk.h);
      a(csk.g, cqn.sm, csk.i);
      a(csk.h, cqn.sm, csk.j);
      a(csk.i, cqn.lG, csk.j);
      a(csk.f, cqn.so, csk.n);
      a(csk.n, cqn.lG, csk.o);
      a(csk.f, cqn.uA, csk.k);
      a(csk.k, cqn.lG, csk.l);
      a(csk.k, cqn.qX, csk.m);
      a(csk.k, cqn.sm, csk.s);
      a(csk.l, cqn.sm, csk.t);
      a(csk.s, cqn.lG, csk.t);
      a(csk.s, cqn.qX, csk.u);
      a(csk.f, cqn.on, csk.v);
      a(csk.v, cqn.lG, csk.w);
      a(csk.v, cqn.qX, csk.x);
      a(csk.p, cqn.sm, csk.s);
      a(csk.q, cqn.sm, csk.t);
      a(csk.f, cqn.rz, csk.p);
      a(csk.p, cqn.lG, csk.q);
      a(csk.p, cqn.qX, csk.r);
      a(csk.f, cqn.rb, csk.y);
      a(csk.y, cqn.lG, csk.z);
      a(csk.f, cqn.ss, csk.A);
      a(csk.A, cqn.qX, csk.B);
      a(csk.A, cqn.sm, csk.C);
      a(csk.B, cqn.sm, csk.D);
      a(csk.C, cqn.qX, csk.D);
      a(csk.E, cqn.sm, csk.C);
      a(csk.F, cqn.sm, csk.C);
      a(csk.G, cqn.sm, csk.D);
      a(csk.f, cqn.sl, csk.E);
      a(csk.E, cqn.lG, csk.F);
      a(csk.E, cqn.qX, csk.G);
      a(csk.f, cqn.sg, csk.H);
      a(csk.H, cqn.lG, csk.I);
      a(csk.H, cqn.qX, csk.J);
      a(csk.f, cqn.sn, csk.K);
      a(csk.K, cqn.lG, csk.L);
      a(csk.K, cqn.qX, csk.M);
      a(csk.c, cqn.sm, csk.N);
      a(csk.N, cqn.lG, csk.O);
      a(csk.f, cqn.vN, csk.Q);
      a(csk.Q, cqn.lG, csk.R);
   }

   private static void a(cqf $$0, cqf $$1, cqf $$2) {
      if (!($$0 instanceof cqz)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$0));
      } else if (!($$2 instanceof cqz)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$2));
      } else {
         c.add(new csi.a<>($$0.k(), ctk.a($$1), $$2.k()));
      }
   }

   private static void a(cqf $$0) {
      if (!($$0 instanceof cqz)) {
         throw new IllegalArgumentException("Expected a potion, got: " + ki.h.b($$0));
      } else {
         d.add(ctk.a($$0));
      }
   }

   private static void a(il<csh> $$0, cqf $$1, il<csh> $$2) {
      b.add(new csi.a<>($$0, ctk.a($$1), $$2));
   }

   static record a<T>(il<T> a, ctk b, il<T> c) {
   }
}
