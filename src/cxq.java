import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cxq {
   public static final int a = 20;
   public static final cxq b = new cxq(List.of(), List.of(), List.of());
   private final List<dag> c;
   private final List<cxq.b<cxp>> d;
   private final List<cxq.b<cvn>> e;

   cxq(List<dag> $$0, List<cxq.b<cxp>> $$1, List<cxq.b<cvn>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cvs $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cvs $$0) {
      for (dag $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cvs $$0) {
      for (cxq.b<cvn> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvs $$0) {
      for (cxq.b<cxp> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jo<cxp> $$0) {
      for (cxq.b<cxp> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cvs $$0, cvs $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cvs $$0, cvs $$1) {
      for (cxq.b<cvn> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvs $$0, cvs $$1) {
      Optional<jo<cxp>> $$2 = $$0.a(ks.L, cxr.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cxq.b<cxp> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cvs d(cvs $$0, cvs $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jo<cxp>> $$2 = $$1.a(ks.L, cxr.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cxq.b<cvn> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cxr.a($$3.c.a(), $$2.get());
               }
            }

            for (cxq.b<cxp> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cxr.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cxq a(cqq $$0) {
      cxq.a $$1 = new cxq.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cxq.a $$0) {
      $$0.a(cvw.sm);
      $$0.a(cvw.vq);
      $$0.a(cvw.vt);
      $$0.a(cvw.sm, cvw.pv, cvw.vq);
      $$0.a(cvw.vq, cvw.vp, cvw.vt);
      $$0.a(cxs.a, cvw.qZ, cxs.c);
      $$0.a(cxs.a, cvw.lH, cxs.b);
      $$0.a(cxs.a, cvw.sk, cxs.d);
      $$0.a(cvw.uc, cxs.Q);
      $$0.a(cvw.lO, cxs.S);
      $$0.a(cvw.b, cxs.T);
      $$0.a(cvw.cM, cxs.R);
      $$0.a(cxs.d, cvw.um, cxs.e);
      $$0.a(cxs.e, cvw.lH, cxs.f);
      $$0.a(cxs.e, cvw.so, cxs.g);
      $$0.a(cxs.f, cvw.so, cxs.h);
      $$0.a(cxs.g, cvw.lH, cxs.h);
      $$0.a(cvw.sq, cxs.l);
      $$0.a(cxs.l, cvw.lH, cxs.m);
      $$0.a(cvw.uF, cxs.i);
      $$0.a(cxs.i, cvw.lH, cxs.j);
      $$0.a(cxs.i, cvw.qZ, cxs.k);
      $$0.a(cxs.i, cvw.so, cxs.q);
      $$0.a(cxs.j, cvw.so, cxs.r);
      $$0.a(cxs.q, cvw.lH, cxs.r);
      $$0.a(cxs.q, cvw.qZ, cxs.s);
      $$0.a(cxs.d, cvw.op, cxs.t);
      $$0.a(cxs.t, cvw.lH, cxs.u);
      $$0.a(cxs.t, cvw.qZ, cxs.v);
      $$0.a(cxs.n, cvw.so, cxs.q);
      $$0.a(cxs.o, cvw.so, cxs.r);
      $$0.a(cvw.rB, cxs.n);
      $$0.a(cxs.n, cvw.lH, cxs.o);
      $$0.a(cxs.n, cvw.qZ, cxs.p);
      $$0.a(cxs.d, cvw.rd, cxs.w);
      $$0.a(cxs.w, cvw.lH, cxs.x);
      $$0.a(cvw.su, cxs.y);
      $$0.a(cxs.y, cvw.qZ, cxs.z);
      $$0.a(cxs.y, cvw.so, cxs.A);
      $$0.a(cxs.z, cvw.so, cxs.B);
      $$0.a(cxs.A, cvw.qZ, cxs.B);
      $$0.a(cxs.C, cvw.so, cxs.A);
      $$0.a(cxs.D, cvw.so, cxs.A);
      $$0.a(cxs.E, cvw.so, cxs.B);
      $$0.a(cvw.sn, cxs.C);
      $$0.a(cxs.C, cvw.lH, cxs.D);
      $$0.a(cxs.C, cvw.qZ, cxs.E);
      $$0.a(cvw.si, cxs.F);
      $$0.a(cxs.F, cvw.lH, cxs.G);
      $$0.a(cxs.F, cvw.qZ, cxs.H);
      $$0.a(cvw.sp, cxs.I);
      $$0.a(cxs.I, cvw.lH, cxs.J);
      $$0.a(cxs.I, cvw.qZ, cxs.K);
      $$0.a(cxs.a, cvw.so, cxs.L);
      $$0.a(cxs.L, cvw.lH, cxs.M);
      $$0.a(cxs.d, cvw.nT, cxs.O);
      $$0.a(cxs.O, cvw.lH, cxs.P);
   }

   public static class a {
      private final List<dag> a = new ArrayList<>();
      private final List<cxq.b<cxp>> b = new ArrayList<>();
      private final List<cxq.b<cvn>> c = new ArrayList<>();
      private final cqq d;

      public a(cqq $$0) {
         this.d = $$0;
      }

      private static void b(cvn $$0) {
         if (!($$0 instanceof cwm)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lv.g.b($$0));
         }
      }

      public void a(cvn $$0, cvn $$1, cvn $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cxq.b<>($$0.n(), dag.a($$1), $$2.n()));
         }
      }

      public void a(cvn $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dag.a($$0));
         }
      }

      public void a(jo<cxp> $$0, cvn $$1, jo<cxp> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cxq.b<>($$0, dag.a($$1), $$2));
         }
      }

      public void a(cvn $$0, jo<cxp> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cxs.a, $$0, cxs.b);
            this.a(cxs.d, $$0, $$1);
         }
      }

      public cxq a() {
         return new cxq(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jo<T> a, dag b, jo<T> c) {
   }
}
