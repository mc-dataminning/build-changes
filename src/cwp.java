import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwp {
   public static final int a = 20;
   public static final cwp b = new cwp(List.of(), List.of(), List.of());
   private final List<cys> c;
   private final List<cwp.b<cwo>> d;
   private final List<cwp.b<cuk>> e;

   cwp(List<cys> $$0, List<cwp.b<cwo>> $$1, List<cwp.b<cuk>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cup $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cup $$0) {
      for (cys $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cup $$0) {
      for (cwp.b<cuk> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cup $$0) {
      for (cwp.b<cwo> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwo> $$0) {
      for (cwp.b<cwo> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cup $$0, cup $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cup $$0, cup $$1) {
      for (cwp.b<cuk> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cup $$0, cup $$1) {
      Optional<ji<cwo>> $$2 = $$0.a(km.G, cwq.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwp.b<cwo> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cup d(cup $$0, cup $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwo>> $$2 = $$1.a(km.G, cwq.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwp.b<cuk> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwq.a($$3.c.a(), $$2.get());
               }
            }

            for (cwp.b<cwo> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwq.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwp a(cpl $$0) {
      cwp.a $$1 = new cwp.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwp.a $$0) {
      $$0.a(cus.sk);
      $$0.a(cus.vo);
      $$0.a(cus.vr);
      $$0.a(cus.sk, cus.pu, cus.vo);
      $$0.a(cus.vo, cus.vn, cus.vr);
      $$0.a(cwr.a, cus.qY, cwr.c);
      $$0.a(cwr.a, cus.lH, cwr.b);
      $$0.a(cwr.a, cus.sj, cwr.d);
      $$0.a(cus.yD, cwr.Q);
      $$0.a(cus.lO, cwr.S);
      $$0.a(cus.b, cwr.T);
      $$0.a(cus.cM, cwr.R);
      $$0.a(cwr.d, cus.uk, cwr.e);
      $$0.a(cwr.e, cus.lH, cwr.f);
      $$0.a(cwr.e, cus.sn, cwr.g);
      $$0.a(cwr.f, cus.sn, cwr.h);
      $$0.a(cwr.g, cus.lH, cwr.h);
      $$0.a(cus.sp, cwr.l);
      $$0.a(cwr.l, cus.lH, cwr.m);
      $$0.a(cus.uD, cwr.i);
      $$0.a(cwr.i, cus.lH, cwr.j);
      $$0.a(cwr.i, cus.qY, cwr.k);
      $$0.a(cwr.i, cus.sn, cwr.q);
      $$0.a(cwr.j, cus.sn, cwr.r);
      $$0.a(cwr.q, cus.lH, cwr.r);
      $$0.a(cwr.q, cus.qY, cwr.s);
      $$0.a(cwr.d, cus.oo, cwr.t);
      $$0.a(cwr.t, cus.lH, cwr.u);
      $$0.a(cwr.t, cus.qY, cwr.v);
      $$0.a(cwr.n, cus.sn, cwr.q);
      $$0.a(cwr.o, cus.sn, cwr.r);
      $$0.a(cus.rA, cwr.n);
      $$0.a(cwr.n, cus.lH, cwr.o);
      $$0.a(cwr.n, cus.qY, cwr.p);
      $$0.a(cwr.d, cus.rc, cwr.w);
      $$0.a(cwr.w, cus.lH, cwr.x);
      $$0.a(cus.st, cwr.y);
      $$0.a(cwr.y, cus.qY, cwr.z);
      $$0.a(cwr.y, cus.sn, cwr.A);
      $$0.a(cwr.z, cus.sn, cwr.B);
      $$0.a(cwr.A, cus.qY, cwr.B);
      $$0.a(cwr.C, cus.sn, cwr.A);
      $$0.a(cwr.D, cus.sn, cwr.A);
      $$0.a(cwr.E, cus.sn, cwr.B);
      $$0.a(cus.sm, cwr.C);
      $$0.a(cwr.C, cus.lH, cwr.D);
      $$0.a(cwr.C, cus.qY, cwr.E);
      $$0.a(cus.sh, cwr.F);
      $$0.a(cwr.F, cus.lH, cwr.G);
      $$0.a(cwr.F, cus.qY, cwr.H);
      $$0.a(cus.so, cwr.I);
      $$0.a(cwr.I, cus.lH, cwr.J);
      $$0.a(cwr.I, cus.qY, cwr.K);
      $$0.a(cwr.a, cus.sn, cwr.L);
      $$0.a(cwr.L, cus.lH, cwr.M);
      $$0.a(cwr.d, cus.vQ, cwr.O);
      $$0.a(cwr.O, cus.lH, cwr.P);
   }

   public static class a {
      private final List<cys> a = new ArrayList<>();
      private final List<cwp.b<cwo>> b = new ArrayList<>();
      private final List<cwp.b<cuk>> c = new ArrayList<>();
      private final cpl d;

      public a(cpl $$0) {
         this.d = $$0;
      }

      private static void b(cuk $$0) {
         if (!($$0 instanceof cvg)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cuk $$0, cuk $$1, cuk $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwp.b<>($$0.o(), cys.a($$1), $$2.o()));
         }
      }

      public void a(cuk $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cys.a($$0));
         }
      }

      public void a(ji<cwo> $$0, cuk $$1, ji<cwo> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwp.b<>($$0, cys.a($$1), $$2));
         }
      }

      public void a(cuk $$0, ji<cwo> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwr.a, $$0, cwr.b);
            this.a(cwr.d, $$0, $$1);
         }
      }

      public cwp a() {
         return new cwp(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cys b, ji<T> c) {
   }
}
