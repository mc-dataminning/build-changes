import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cyd {
   public static final int a = 20;
   public static final cyd b = new cyd(List.of(), List.of(), List.of());
   private final List<dap> c;
   private final List<cyd.b<cyc>> d;
   private final List<cyd.b<cwb>> e;

   cyd(List<dap> $$0, List<cyd.b<cyc>> $$1, List<cyd.b<cwb>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwf $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwf $$0) {
      for (dap $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwf $$0) {
      for (cyd.b<cwb> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwf $$0) {
      for (cyd.b<cyc> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<cyc> $$0) {
      for (cyd.b<cyc> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwf $$0, cwf $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwf $$0, cwf $$1) {
      for (cyd.b<cwb> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwf $$0, cwf $$1) {
      Optional<jq<cyc>> $$2 = $$0.a(ku.Q, cye.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cyd.b<cyc> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwf d(cwf $$0, cwf $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<cyc>> $$2 = $$1.a(ku.Q, cye.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cyd.b<cwb> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cye.a($$3.c.a(), $$2.get());
               }
            }

            for (cyd.b<cyc> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cye.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cyd a(crj $$0) {
      cyd.a $$1 = new cyd.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cyd.a $$0) {
      $$0.a(cwj.sC);
      $$0.a(cwj.vG);
      $$0.a(cwj.vJ);
      $$0.a(cwj.sC, cwj.pv, cwj.vG);
      $$0.a(cwj.vG, cwj.vF, cwj.vJ);
      $$0.a(cyf.a, cwj.rp, cyf.c);
      $$0.a(cyf.a, cwj.lH, cyf.b);
      $$0.a(cyf.a, cwj.sA, cyf.d);
      $$0.a(cwj.us, cyf.Q);
      $$0.a(cwj.lO, cyf.S);
      $$0.a(cwj.b, cyf.T);
      $$0.a(cwj.cM, cyf.R);
      $$0.a(cyf.d, cwj.uC, cyf.e);
      $$0.a(cyf.e, cwj.lH, cyf.f);
      $$0.a(cyf.e, cwj.sE, cyf.g);
      $$0.a(cyf.f, cwj.sE, cyf.h);
      $$0.a(cyf.g, cwj.lH, cyf.h);
      $$0.a(cwj.sG, cyf.l);
      $$0.a(cyf.l, cwj.lH, cyf.m);
      $$0.a(cwj.uV, cyf.i);
      $$0.a(cyf.i, cwj.lH, cyf.j);
      $$0.a(cyf.i, cwj.rp, cyf.k);
      $$0.a(cyf.i, cwj.sE, cyf.q);
      $$0.a(cyf.j, cwj.sE, cyf.r);
      $$0.a(cyf.q, cwj.lH, cyf.r);
      $$0.a(cyf.q, cwj.rp, cyf.s);
      $$0.a(cyf.d, cwj.op, cyf.t);
      $$0.a(cyf.t, cwj.lH, cyf.u);
      $$0.a(cyf.t, cwj.rp, cyf.v);
      $$0.a(cyf.n, cwj.sE, cyf.q);
      $$0.a(cyf.o, cwj.sE, cyf.r);
      $$0.a(cwj.rR, cyf.n);
      $$0.a(cyf.n, cwj.lH, cyf.o);
      $$0.a(cyf.n, cwj.rp, cyf.p);
      $$0.a(cyf.d, cwj.rt, cyf.w);
      $$0.a(cyf.w, cwj.lH, cyf.x);
      $$0.a(cwj.sK, cyf.y);
      $$0.a(cyf.y, cwj.rp, cyf.z);
      $$0.a(cyf.y, cwj.sE, cyf.A);
      $$0.a(cyf.z, cwj.sE, cyf.B);
      $$0.a(cyf.A, cwj.rp, cyf.B);
      $$0.a(cyf.C, cwj.sE, cyf.A);
      $$0.a(cyf.D, cwj.sE, cyf.A);
      $$0.a(cyf.E, cwj.sE, cyf.B);
      $$0.a(cwj.sD, cyf.C);
      $$0.a(cyf.C, cwj.lH, cyf.D);
      $$0.a(cyf.C, cwj.rp, cyf.E);
      $$0.a(cwj.sy, cyf.F);
      $$0.a(cyf.F, cwj.lH, cyf.G);
      $$0.a(cyf.F, cwj.rp, cyf.H);
      $$0.a(cwj.sF, cyf.I);
      $$0.a(cyf.I, cwj.lH, cyf.J);
      $$0.a(cyf.I, cwj.rp, cyf.K);
      $$0.a(cyf.a, cwj.sE, cyf.L);
      $$0.a(cyf.L, cwj.lH, cyf.M);
      $$0.a(cyf.d, cwj.nT, cyf.O);
      $$0.a(cyf.O, cwj.lH, cyf.P);
   }

   public static class a {
      private final List<dap> a = new ArrayList<>();
      private final List<cyd.b<cyc>> b = new ArrayList<>();
      private final List<cyd.b<cwb>> c = new ArrayList<>();
      private final crj d;

      public a(crj $$0) {
         this.d = $$0;
      }

      private static void b(cwb $$0) {
         if (!($$0 instanceof cwz)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lz.g.b($$0));
         }
      }

      public void a(cwb $$0, cwb $$1, cwb $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cyd.b<>($$0.f(), dap.a($$1), $$2.f()));
         }
      }

      public void a(cwb $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dap.a($$0));
         }
      }

      public void a(jq<cyc> $$0, cwb $$1, jq<cyc> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cyd.b<>($$0, dap.a($$1), $$2));
         }
      }

      public void a(cwb $$0, jq<cyc> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyf.a, $$0, cyf.b);
            this.a(cyf.d, $$0, $$1);
         }
      }

      public cyd a() {
         return new cyd(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dap b, jq<T> c) {
   }
}
