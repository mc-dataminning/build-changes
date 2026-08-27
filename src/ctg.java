import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ctg {
   public static final int a = 20;
   private static final List<ctg.a<ctf>> b = Lists.newArrayList();
   private static final List<ctg.a<cre>> c = Lists.newArrayList();
   private static final List<cvg> d = Lists.newArrayList();
   private static final Predicate<crj> e = $$0 -> {
      for (cvg $$1 : d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   };

   public static boolean a(crj $$0) {
      return b($$0) || c($$0);
   }

   protected static boolean b(crj $$0) {
      for (ctg.a<cre> $$1 : c) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(crj $$0) {
      for (ctg.a<ctf> $$1 : b) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(il<ctf> $$0) {
      for (ctg.a<ctf> $$1 : b) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(crj $$0, crj $$1) {
      return !e.test($$0) ? false : b($$0, $$1) || c($$0, $$1);
   }

   protected static boolean b(crj $$0, crj $$1) {
      for (ctg.a<cre> $$2 : c) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(crj $$0, crj $$1) {
      Optional<il<ctf>> $$2 = $$0.a(jp.x, cth.a).f();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (ctg.a<ctf> $$3 : b) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static crj d(crj $$0, crj $$1) {
      if ($$1.d()) {
         return $$1;
      } else {
         Optional<il<ctf>> $$2 = $$1.a(jp.x, cth.a).f();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (ctg.a<cre> $$3 : c) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cth.a($$3.c.a(), $$2.get());
               }
            }

            for (ctg.a<ctf> $$4 : b) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cth.a($$1.f(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static void a() {
      a(crm.sj);
      a(crm.vm);
      a(crm.vp);
      a(crm.sj, crm.pt, crm.vm);
      a(crm.vm, crm.vl, crm.vp);
      a(cti.a, crm.ss, cti.b);
      a(cti.a, crm.sg, cti.b);
      a(cti.a, crm.uB, cti.b);
      a(cti.a, crm.sn, cti.b);
      a(cti.a, crm.sl, cti.b);
      a(cti.a, crm.rz, cti.b);
      a(cti.a, crm.so, cti.b);
      a(cti.a, crm.qX, cti.c);
      a(cti.a, crm.lG, cti.b);
      a(cti.a, crm.si, cti.d);
      a(cti.d, crm.ui, cti.e);
      a(cti.e, crm.lG, cti.f);
      a(cti.e, crm.sm, cti.g);
      a(cti.f, crm.sm, cti.h);
      a(cti.g, crm.lG, cti.h);
      a(cti.d, crm.so, cti.l);
      a(cti.l, crm.lG, cti.m);
      a(cti.d, crm.uB, cti.i);
      a(cti.i, crm.lG, cti.j);
      a(cti.i, crm.qX, cti.k);
      a(cti.i, crm.sm, cti.q);
      a(cti.j, crm.sm, cti.r);
      a(cti.q, crm.lG, cti.r);
      a(cti.q, crm.qX, cti.s);
      a(cti.d, crm.on, cti.t);
      a(cti.t, crm.lG, cti.u);
      a(cti.t, crm.qX, cti.v);
      a(cti.n, crm.sm, cti.q);
      a(cti.o, crm.sm, cti.r);
      a(cti.d, crm.rz, cti.n);
      a(cti.n, crm.lG, cti.o);
      a(cti.n, crm.qX, cti.p);
      a(cti.d, crm.rb, cti.w);
      a(cti.w, crm.lG, cti.x);
      a(cti.d, crm.ss, cti.y);
      a(cti.y, crm.qX, cti.z);
      a(cti.y, crm.sm, cti.A);
      a(cti.z, crm.sm, cti.B);
      a(cti.A, crm.qX, cti.B);
      a(cti.C, crm.sm, cti.A);
      a(cti.D, crm.sm, cti.A);
      a(cti.E, crm.sm, cti.B);
      a(cti.d, crm.sl, cti.C);
      a(cti.C, crm.lG, cti.D);
      a(cti.C, crm.qX, cti.E);
      a(cti.d, crm.sg, cti.F);
      a(cti.F, crm.lG, cti.G);
      a(cti.F, crm.qX, cti.H);
      a(cti.d, crm.sn, cti.I);
      a(cti.I, crm.lG, cti.J);
      a(cti.I, crm.qX, cti.K);
      a(cti.a, crm.sm, cti.L);
      a(cti.L, crm.lG, cti.M);
      a(cti.d, crm.vO, cti.O);
      a(cti.O, crm.lG, cti.P);
   }

   private static void a(cre $$0, cre $$1, cre $$2) {
      if (!($$0 instanceof cry)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kr.h.b($$0));
      } else if (!($$2 instanceof cry)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kr.h.b($$2));
      } else {
         c.add(new ctg.a<>($$0.n(), cvg.a($$1), $$2.n()));
      }
   }

   private static void a(cre $$0) {
      if (!($$0 instanceof cry)) {
         throw new IllegalArgumentException("Expected a potion, got: " + kr.h.b($$0));
      } else {
         d.add(cvg.a($$0));
      }
   }

   private static void a(il<ctf> $$0, cre $$1, il<ctf> $$2) {
      b.add(new ctg.a<>($$0, cvg.a($$1), $$2));
   }

   static record a<T>(il<T> a, cvg b, il<T> c) {
   }
}
