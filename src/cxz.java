import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cxz {
   public static final int a = 20;
   public static final cxz b = new cxz(List.of(), List.of(), List.of());
   private final List<dal> c;
   private final List<cxz.b<cxy>> d;
   private final List<cxz.b<cvx>> e;

   cxz(List<dal> $$0, List<cxz.b<cxy>> $$1, List<cxz.b<cvx>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cwb $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cwb $$0) {
      for (dal $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cwb $$0) {
      for (cxz.b<cvx> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwb $$0) {
      for (cxz.b<cxy> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jq<cxy> $$0) {
      for (cxz.b<cxy> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cwb $$0, cwb $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cwb $$0, cwb $$1) {
      for (cxz.b<cvx> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cwb $$0, cwb $$1) {
      Optional<jq<cxy>> $$2 = $$0.a(ku.Q, cya.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cxz.b<cxy> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cwb d(cwb $$0, cwb $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jq<cxy>> $$2 = $$1.a(ku.Q, cya.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cxz.b<cvx> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cya.a($$3.c.a(), $$2.get());
               }
            }

            for (cxz.b<cxy> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cya.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cxz a(crf $$0) {
      cxz.a $$1 = new cxz.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cxz.a $$0) {
      $$0.a(cwf.sm);
      $$0.a(cwf.vq);
      $$0.a(cwf.vt);
      $$0.a(cwf.sm, cwf.pv, cwf.vq);
      $$0.a(cwf.vq, cwf.vp, cwf.vt);
      $$0.a(cyb.a, cwf.qZ, cyb.c);
      $$0.a(cyb.a, cwf.lH, cyb.b);
      $$0.a(cyb.a, cwf.sk, cyb.d);
      $$0.a(cwf.uc, cyb.Q);
      $$0.a(cwf.lO, cyb.S);
      $$0.a(cwf.b, cyb.T);
      $$0.a(cwf.cM, cyb.R);
      $$0.a(cyb.d, cwf.um, cyb.e);
      $$0.a(cyb.e, cwf.lH, cyb.f);
      $$0.a(cyb.e, cwf.so, cyb.g);
      $$0.a(cyb.f, cwf.so, cyb.h);
      $$0.a(cyb.g, cwf.lH, cyb.h);
      $$0.a(cwf.sq, cyb.l);
      $$0.a(cyb.l, cwf.lH, cyb.m);
      $$0.a(cwf.uF, cyb.i);
      $$0.a(cyb.i, cwf.lH, cyb.j);
      $$0.a(cyb.i, cwf.qZ, cyb.k);
      $$0.a(cyb.i, cwf.so, cyb.q);
      $$0.a(cyb.j, cwf.so, cyb.r);
      $$0.a(cyb.q, cwf.lH, cyb.r);
      $$0.a(cyb.q, cwf.qZ, cyb.s);
      $$0.a(cyb.d, cwf.op, cyb.t);
      $$0.a(cyb.t, cwf.lH, cyb.u);
      $$0.a(cyb.t, cwf.qZ, cyb.v);
      $$0.a(cyb.n, cwf.so, cyb.q);
      $$0.a(cyb.o, cwf.so, cyb.r);
      $$0.a(cwf.rB, cyb.n);
      $$0.a(cyb.n, cwf.lH, cyb.o);
      $$0.a(cyb.n, cwf.qZ, cyb.p);
      $$0.a(cyb.d, cwf.rd, cyb.w);
      $$0.a(cyb.w, cwf.lH, cyb.x);
      $$0.a(cwf.su, cyb.y);
      $$0.a(cyb.y, cwf.qZ, cyb.z);
      $$0.a(cyb.y, cwf.so, cyb.A);
      $$0.a(cyb.z, cwf.so, cyb.B);
      $$0.a(cyb.A, cwf.qZ, cyb.B);
      $$0.a(cyb.C, cwf.so, cyb.A);
      $$0.a(cyb.D, cwf.so, cyb.A);
      $$0.a(cyb.E, cwf.so, cyb.B);
      $$0.a(cwf.sn, cyb.C);
      $$0.a(cyb.C, cwf.lH, cyb.D);
      $$0.a(cyb.C, cwf.qZ, cyb.E);
      $$0.a(cwf.si, cyb.F);
      $$0.a(cyb.F, cwf.lH, cyb.G);
      $$0.a(cyb.F, cwf.qZ, cyb.H);
      $$0.a(cwf.sp, cyb.I);
      $$0.a(cyb.I, cwf.lH, cyb.J);
      $$0.a(cyb.I, cwf.qZ, cyb.K);
      $$0.a(cyb.a, cwf.so, cyb.L);
      $$0.a(cyb.L, cwf.lH, cyb.M);
      $$0.a(cyb.d, cwf.nT, cyb.O);
      $$0.a(cyb.O, cwf.lH, cyb.P);
   }

   public static class a {
      private final List<dal> a = new ArrayList<>();
      private final List<cxz.b<cxy>> b = new ArrayList<>();
      private final List<cxz.b<cvx>> c = new ArrayList<>();
      private final crf d;

      public a(crf $$0) {
         this.d = $$0;
      }

      private static void b(cvx $$0) {
         if (!($$0 instanceof cwv)) {
            throw new IllegalArgumentException("Expected a potion, got: " + ly.g.b($$0));
         }
      }

      public void a(cvx $$0, cvx $$1, cvx $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cxz.b<>($$0.f(), dal.a($$1), $$2.f()));
         }
      }

      public void a(cvx $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dal.a($$0));
         }
      }

      public void a(jq<cxy> $$0, cvx $$1, jq<cxy> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cxz.b<>($$0, dal.a($$1), $$2));
         }
      }

      public void a(cvx $$0, jq<cxy> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cyb.a, $$0, cyb.b);
            this.a(cyb.d, $$0, $$1);
         }
      }

      public cxz a() {
         return new cxz(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jq<T> a, dal b, jq<T> c) {
   }
}
