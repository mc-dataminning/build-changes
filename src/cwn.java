import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cwn {
   public static final int a = 20;
   public static final cwn b = new cwn(List.of(), List.of(), List.of());
   private final List<cyq> c;
   private final List<cwn.b<cwm>> d;
   private final List<cwn.b<cui>> e;

   cwn(List<cyq> $$0, List<cwn.b<cwm>> $$1, List<cwn.b<cui>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cun $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cun $$0) {
      for (cyq $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cun $$0) {
      for (cwn.b<cui> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cun $$0) {
      for (cwn.b<cwm> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji<cwm> $$0) {
      for (cwn.b<cwm> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cun $$0, cun $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cun $$0, cun $$1) {
      for (cwn.b<cui> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cun $$0, cun $$1) {
      Optional<ji<cwm>> $$2 = $$0.a(km.F, cwo.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cwn.b<cwm> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cun d(cun $$0, cun $$1) {
      if ($$1.e()) {
         return $$1;
      } else {
         Optional<ji<cwm>> $$2 = $$1.a(km.F, cwo.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cwn.b<cui> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cwo.a($$3.c.a(), $$2.get());
               }
            }

            for (cwn.b<cwm> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cwo.a($$1.g(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cwn a(cpj $$0) {
      cwn.a $$1 = new cwn.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cwn.a $$0) {
      $$0.a(cuq.sk);
      $$0.a(cuq.vo);
      $$0.a(cuq.vr);
      $$0.a(cuq.sk, cuq.pu, cuq.vo);
      $$0.a(cuq.vo, cuq.vn, cuq.vr);
      $$0.a(cwp.a, cuq.qY, cwp.c);
      $$0.a(cwp.a, cuq.lH, cwp.b);
      $$0.a(cwp.a, cuq.sj, cwp.d);
      $$0.a(cuq.yD, cwp.Q);
      $$0.a(cuq.lO, cwp.S);
      $$0.a(cuq.b, cwp.T);
      $$0.a(cuq.cM, cwp.R);
      $$0.a(cwp.d, cuq.uk, cwp.e);
      $$0.a(cwp.e, cuq.lH, cwp.f);
      $$0.a(cwp.e, cuq.sn, cwp.g);
      $$0.a(cwp.f, cuq.sn, cwp.h);
      $$0.a(cwp.g, cuq.lH, cwp.h);
      $$0.a(cuq.sp, cwp.l);
      $$0.a(cwp.l, cuq.lH, cwp.m);
      $$0.a(cuq.uD, cwp.i);
      $$0.a(cwp.i, cuq.lH, cwp.j);
      $$0.a(cwp.i, cuq.qY, cwp.k);
      $$0.a(cwp.i, cuq.sn, cwp.q);
      $$0.a(cwp.j, cuq.sn, cwp.r);
      $$0.a(cwp.q, cuq.lH, cwp.r);
      $$0.a(cwp.q, cuq.qY, cwp.s);
      $$0.a(cwp.d, cuq.oo, cwp.t);
      $$0.a(cwp.t, cuq.lH, cwp.u);
      $$0.a(cwp.t, cuq.qY, cwp.v);
      $$0.a(cwp.n, cuq.sn, cwp.q);
      $$0.a(cwp.o, cuq.sn, cwp.r);
      $$0.a(cuq.rA, cwp.n);
      $$0.a(cwp.n, cuq.lH, cwp.o);
      $$0.a(cwp.n, cuq.qY, cwp.p);
      $$0.a(cwp.d, cuq.rc, cwp.w);
      $$0.a(cwp.w, cuq.lH, cwp.x);
      $$0.a(cuq.st, cwp.y);
      $$0.a(cwp.y, cuq.qY, cwp.z);
      $$0.a(cwp.y, cuq.sn, cwp.A);
      $$0.a(cwp.z, cuq.sn, cwp.B);
      $$0.a(cwp.A, cuq.qY, cwp.B);
      $$0.a(cwp.C, cuq.sn, cwp.A);
      $$0.a(cwp.D, cuq.sn, cwp.A);
      $$0.a(cwp.E, cuq.sn, cwp.B);
      $$0.a(cuq.sm, cwp.C);
      $$0.a(cwp.C, cuq.lH, cwp.D);
      $$0.a(cwp.C, cuq.qY, cwp.E);
      $$0.a(cuq.sh, cwp.F);
      $$0.a(cwp.F, cuq.lH, cwp.G);
      $$0.a(cwp.F, cuq.qY, cwp.H);
      $$0.a(cuq.so, cwp.I);
      $$0.a(cwp.I, cuq.lH, cwp.J);
      $$0.a(cwp.I, cuq.qY, cwp.K);
      $$0.a(cwp.a, cuq.sn, cwp.L);
      $$0.a(cwp.L, cuq.lH, cwp.M);
      $$0.a(cwp.d, cuq.vQ, cwp.O);
      $$0.a(cwp.O, cuq.lH, cwp.P);
   }

   public static class a {
      private final List<cyq> a = new ArrayList<>();
      private final List<cwn.b<cwm>> b = new ArrayList<>();
      private final List<cwn.b<cui>> c = new ArrayList<>();
      private final cpj d;

      public a(cpj $$0) {
         this.d = $$0;
      }

      private static void b(cui $$0) {
         if (!($$0 instanceof cve)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lp.h.b($$0));
         }
      }

      public void a(cui $$0, cui $$1, cui $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cwn.b<>($$0.o(), cyq.a($$1), $$2.o()));
         }
      }

      public void a(cui $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(cyq.a($$0));
         }
      }

      public void a(ji<cwm> $$0, cui $$1, ji<cwm> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cwn.b<>($$0, cyq.a($$1), $$2));
         }
      }

      public void a(cui $$0, ji<cwm> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cwp.a, $$0, cwp.b);
            this.a(cwp.d, $$0, $$1);
         }
      }

      public cwn a() {
         return new cwn(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(ji<T> a, cyq b, ji<T> c) {
   }
}
