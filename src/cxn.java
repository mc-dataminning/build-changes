import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cxn {
   public static final int a = 20;
   public static final cxn b = new cxn(List.of(), List.of(), List.of());
   private final List<dad> c;
   private final List<cxn.b<cxm>> d;
   private final List<cxn.b<cvk>> e;

   cxn(List<dad> $$0, List<cxn.b<cxm>> $$1, List<cxn.b<cvk>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cvp $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cvp $$0) {
      for (dad $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cvp $$0) {
      for (cxn.b<cvk> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvp $$0) {
      for (cxn.b<cxm> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jn<cxm> $$0) {
      for (cxn.b<cxm> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cvp $$0, cvp $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cvp $$0, cvp $$1) {
      for (cxn.b<cvk> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvp $$0, cvp $$1) {
      Optional<jn<cxm>> $$2 = $$0.a(kr.L, cxo.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cxn.b<cxm> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cvp d(cvp $$0, cvp $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jn<cxm>> $$2 = $$1.a(kr.L, cxo.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cxn.b<cvk> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cxo.a($$3.c.a(), $$2.get());
               }
            }

            for (cxn.b<cxm> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cxo.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cxn a(cqn $$0) {
      cxn.a $$1 = new cxn.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cxn.a $$0) {
      $$0.a(cvt.sm);
      $$0.a(cvt.vq);
      $$0.a(cvt.vt);
      $$0.a(cvt.sm, cvt.pv, cvt.vq);
      $$0.a(cvt.vq, cvt.vp, cvt.vt);
      $$0.a(cxp.a, cvt.qZ, cxp.c);
      $$0.a(cxp.a, cvt.lH, cxp.b);
      $$0.a(cxp.a, cvt.sk, cxp.d);
      $$0.a(cvt.uc, cxp.Q);
      $$0.a(cvt.lO, cxp.S);
      $$0.a(cvt.b, cxp.T);
      $$0.a(cvt.cM, cxp.R);
      $$0.a(cxp.d, cvt.um, cxp.e);
      $$0.a(cxp.e, cvt.lH, cxp.f);
      $$0.a(cxp.e, cvt.so, cxp.g);
      $$0.a(cxp.f, cvt.so, cxp.h);
      $$0.a(cxp.g, cvt.lH, cxp.h);
      $$0.a(cvt.sq, cxp.l);
      $$0.a(cxp.l, cvt.lH, cxp.m);
      $$0.a(cvt.uF, cxp.i);
      $$0.a(cxp.i, cvt.lH, cxp.j);
      $$0.a(cxp.i, cvt.qZ, cxp.k);
      $$0.a(cxp.i, cvt.so, cxp.q);
      $$0.a(cxp.j, cvt.so, cxp.r);
      $$0.a(cxp.q, cvt.lH, cxp.r);
      $$0.a(cxp.q, cvt.qZ, cxp.s);
      $$0.a(cxp.d, cvt.op, cxp.t);
      $$0.a(cxp.t, cvt.lH, cxp.u);
      $$0.a(cxp.t, cvt.qZ, cxp.v);
      $$0.a(cxp.n, cvt.so, cxp.q);
      $$0.a(cxp.o, cvt.so, cxp.r);
      $$0.a(cvt.rB, cxp.n);
      $$0.a(cxp.n, cvt.lH, cxp.o);
      $$0.a(cxp.n, cvt.qZ, cxp.p);
      $$0.a(cxp.d, cvt.rd, cxp.w);
      $$0.a(cxp.w, cvt.lH, cxp.x);
      $$0.a(cvt.su, cxp.y);
      $$0.a(cxp.y, cvt.qZ, cxp.z);
      $$0.a(cxp.y, cvt.so, cxp.A);
      $$0.a(cxp.z, cvt.so, cxp.B);
      $$0.a(cxp.A, cvt.qZ, cxp.B);
      $$0.a(cxp.C, cvt.so, cxp.A);
      $$0.a(cxp.D, cvt.so, cxp.A);
      $$0.a(cxp.E, cvt.so, cxp.B);
      $$0.a(cvt.sn, cxp.C);
      $$0.a(cxp.C, cvt.lH, cxp.D);
      $$0.a(cxp.C, cvt.qZ, cxp.E);
      $$0.a(cvt.si, cxp.F);
      $$0.a(cxp.F, cvt.lH, cxp.G);
      $$0.a(cxp.F, cvt.qZ, cxp.H);
      $$0.a(cvt.sp, cxp.I);
      $$0.a(cxp.I, cvt.lH, cxp.J);
      $$0.a(cxp.I, cvt.qZ, cxp.K);
      $$0.a(cxp.a, cvt.so, cxp.L);
      $$0.a(cxp.L, cvt.lH, cxp.M);
      $$0.a(cxp.d, cvt.nT, cxp.O);
      $$0.a(cxp.O, cvt.lH, cxp.P);
   }

   public static class a {
      private final List<dad> a = new ArrayList<>();
      private final List<cxn.b<cxm>> b = new ArrayList<>();
      private final List<cxn.b<cvk>> c = new ArrayList<>();
      private final cqn d;

      public a(cqn $$0) {
         this.d = $$0;
      }

      private static void b(cvk $$0) {
         if (!($$0 instanceof cwj)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lu.g.b($$0));
         }
      }

      public void a(cvk $$0, cvk $$1, cvk $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cxn.b<>($$0.n(), dad.a($$1), $$2.n()));
         }
      }

      public void a(cvk $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dad.a($$0));
         }
      }

      public void a(jn<cxm> $$0, cvk $$1, jn<cxm> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cxn.b<>($$0, dad.a($$1), $$2));
         }
      }

      public void a(cvk $$0, jn<cxm> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cxp.a, $$0, cxp.b);
            this.a(cxp.d, $$0, $$1);
         }
      }

      public cxn a() {
         return new cxn(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jn<T> a, dad b, jn<T> c) {
   }
}
