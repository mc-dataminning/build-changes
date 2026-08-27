import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class cub {
   public static final int a = 20;
   private static final List<cub.a<cua>> b = Lists.newArrayList();
   private static final List<cub.a<cry>> c = Lists.newArrayList();
   private static final List<cwd> d = Lists.newArrayList();
   private static final Predicate<csd> e = $$0 -> {
      for (cwd $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(csd $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(csd $$0) {
      for (cub.a<cry> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(csd $$0) {
      for (cub.a<cua> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(iv<cua> $$0) {
      for (cub.a<cua> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(csd $$0, csd $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(csd $$0, csd $$1) {
      for (cub.a<cry> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(csd $$0, csd $$1) {
      Optional<iv<cua>> $$2 = $$0.a(jz.x, cuc.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cub.a<cua> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static csd d(csd $$0, csd $$1) {
      if ($$1.d()) {
         return $$1;
      } else {
         Optional<iv<cua>> $$2 = $$1.a(jz.x, cuc.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cub.a<cry> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cuc.a($$3.c.a(), $$2.get());
               }
            }

            for (cub.a<cua> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cuc.a($$1.f(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(csg.sk);
      a(csg.vo);
      a(csg.vr);
      a(csg.sk, csg.pu, csg.vo);
      a(csg.vo, csg.vn, csg.vr);
      a(cud.a, csg.st, cud.b);
      a(cud.a, csg.sh, cud.b);
      a(cud.a, csg.uD, cud.b);
      a(cud.a, csg.so, cud.b);
      a(cud.a, csg.sm, cud.b);
      a(cud.a, csg.rA, cud.b);
      a(cud.a, csg.sp, cud.b);
      a(cud.a, csg.qY, cud.c);
      a(cud.a, csg.lH, cud.b);
      a(cud.a, csg.sj, cud.d);
      a(cud.d, csg.uk, cud.e);
      a(cud.e, csg.lH, cud.f);
      a(cud.e, csg.sn, cud.g);
      a(cud.f, csg.sn, cud.h);
      a(cud.g, csg.lH, cud.h);
      a(cud.d, csg.sp, cud.l);
      a(cud.l, csg.lH, cud.m);
      a(cud.d, csg.uD, cud.i);
      a(cud.i, csg.lH, cud.j);
      a(cud.i, csg.qY, cud.k);
      a(cud.i, csg.sn, cud.q);
      a(cud.j, csg.sn, cud.r);
      a(cud.q, csg.lH, cud.r);
      a(cud.q, csg.qY, cud.s);
      a(cud.d, csg.oo, cud.t);
      a(cud.t, csg.lH, cud.u);
      a(cud.t, csg.qY, cud.v);
      a(cud.n, csg.sn, cud.q);
      a(cud.o, csg.sn, cud.r);
      a(cud.d, csg.rA, cud.n);
      a(cud.n, csg.lH, cud.o);
      a(cud.n, csg.qY, cud.p);
      a(cud.d, csg.rc, cud.w);
      a(cud.w, csg.lH, cud.x);
      a(cud.d, csg.st, cud.y);
      a(cud.y, csg.qY, cud.z);
      a(cud.y, csg.sn, cud.A);
      a(cud.z, csg.sn, cud.B);
      a(cud.A, csg.qY, cud.B);
      a(cud.C, csg.sn, cud.A);
      a(cud.D, csg.sn, cud.A);
      a(cud.E, csg.sn, cud.B);
      a(cud.d, csg.sm, cud.C);
      a(cud.C, csg.lH, cud.D);
      a(cud.C, csg.qY, cud.E);
      a(cud.d, csg.sh, cud.F);
      a(cud.F, csg.lH, cud.G);
      a(cud.F, csg.qY, cud.H);
      a(cud.d, csg.so, cud.I);
      a(cud.I, csg.lH, cud.J);
      a(cud.I, csg.qY, cud.K);
      a(cud.a, csg.sn, cud.L);
      a(cud.L, csg.lH, cud.M);
      a(cud.d, csg.vQ, cud.O);
      a(cud.O, csg.lH, cud.P);
   }

   private static void a(cry $$0, cry $$1, cry $$2) {
      if (!($$0 instanceof cst)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lc.h.b($$0));
      } else if (!($$2 instanceof cst)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lc.h.b($$2));
      } else {
         c.add(new cub.a<>($$0.n(), cwd.a($$1), $$2.n()));
      }
   }

   private static void a(cry $$0) {
      if (!($$0 instanceof cst)) {
         throw new IllegalArgumentException("Expected a potion, got: " + lc.h.b($$0));
      } else {
         d.add(cwd.a($$0));
      }
   }

   private static void a(iv<cua> $$0, cry $$1, iv<cua> $$2) {
      b.add(new cub.a<>($$0, cwd.a($$1), $$2));
   }

   static record a<T>(iv<T> a, cwd b, iv<T> c) {
   }
}
