import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cxv {
   public static final int a = 20;
   public static final cxv b = new cxv(List.of(), List.of(), List.of());
   private final List<daf> c;
   private final List<cxv.b<cxu>> d;
   private final List<cxv.b<cvt>> e;

   cxv(List<daf> $$0, List<cxv.b<cxu>> $$1, List<cxv.b<cvt>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cvx $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cvx $$0) {
      for (daf $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cvx $$0) {
      for (cxv.b<cvt> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvx $$0) {
      for (cxv.b<cxu> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jp<cxu> $$0) {
      for (cxv.b<cxu> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cvx $$0, cvx $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cvx $$0, cvx $$1) {
      for (cxv.b<cvt> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvx $$0, cvx $$1) {
      Optional<jp<cxu>> $$2 = $$0.a(kt.P, cxw.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cxv.b<cxu> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cvx d(cvx $$0, cvx $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jp<cxu>> $$2 = $$1.a(kt.P, cxw.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cxv.b<cvt> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cxw.a($$3.c.a(), $$2.get());
               }
            }

            for (cxv.b<cxu> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cxw.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cxv a(cra $$0) {
      cxv.a $$1 = new cxv.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cxv.a $$0) {
      $$0.a(cwb.sm);
      $$0.a(cwb.vq);
      $$0.a(cwb.vt);
      $$0.a(cwb.sm, cwb.pv, cwb.vq);
      $$0.a(cwb.vq, cwb.vp, cwb.vt);
      $$0.a(cxx.a, cwb.qZ, cxx.c);
      $$0.a(cxx.a, cwb.lH, cxx.b);
      $$0.a(cxx.a, cwb.sk, cxx.d);
      $$0.a(cwb.uc, cxx.Q);
      $$0.a(cwb.lO, cxx.S);
      $$0.a(cwb.b, cxx.T);
      $$0.a(cwb.cM, cxx.R);
      $$0.a(cxx.d, cwb.um, cxx.e);
      $$0.a(cxx.e, cwb.lH, cxx.f);
      $$0.a(cxx.e, cwb.so, cxx.g);
      $$0.a(cxx.f, cwb.so, cxx.h);
      $$0.a(cxx.g, cwb.lH, cxx.h);
      $$0.a(cwb.sq, cxx.l);
      $$0.a(cxx.l, cwb.lH, cxx.m);
      $$0.a(cwb.uF, cxx.i);
      $$0.a(cxx.i, cwb.lH, cxx.j);
      $$0.a(cxx.i, cwb.qZ, cxx.k);
      $$0.a(cxx.i, cwb.so, cxx.q);
      $$0.a(cxx.j, cwb.so, cxx.r);
      $$0.a(cxx.q, cwb.lH, cxx.r);
      $$0.a(cxx.q, cwb.qZ, cxx.s);
      $$0.a(cxx.d, cwb.op, cxx.t);
      $$0.a(cxx.t, cwb.lH, cxx.u);
      $$0.a(cxx.t, cwb.qZ, cxx.v);
      $$0.a(cxx.n, cwb.so, cxx.q);
      $$0.a(cxx.o, cwb.so, cxx.r);
      $$0.a(cwb.rB, cxx.n);
      $$0.a(cxx.n, cwb.lH, cxx.o);
      $$0.a(cxx.n, cwb.qZ, cxx.p);
      $$0.a(cxx.d, cwb.rd, cxx.w);
      $$0.a(cxx.w, cwb.lH, cxx.x);
      $$0.a(cwb.su, cxx.y);
      $$0.a(cxx.y, cwb.qZ, cxx.z);
      $$0.a(cxx.y, cwb.so, cxx.A);
      $$0.a(cxx.z, cwb.so, cxx.B);
      $$0.a(cxx.A, cwb.qZ, cxx.B);
      $$0.a(cxx.C, cwb.so, cxx.A);
      $$0.a(cxx.D, cwb.so, cxx.A);
      $$0.a(cxx.E, cwb.so, cxx.B);
      $$0.a(cwb.sn, cxx.C);
      $$0.a(cxx.C, cwb.lH, cxx.D);
      $$0.a(cxx.C, cwb.qZ, cxx.E);
      $$0.a(cwb.si, cxx.F);
      $$0.a(cxx.F, cwb.lH, cxx.G);
      $$0.a(cxx.F, cwb.qZ, cxx.H);
      $$0.a(cwb.sp, cxx.I);
      $$0.a(cxx.I, cwb.lH, cxx.J);
      $$0.a(cxx.I, cwb.qZ, cxx.K);
      $$0.a(cxx.a, cwb.so, cxx.L);
      $$0.a(cxx.L, cwb.lH, cxx.M);
      $$0.a(cxx.d, cwb.nT, cxx.O);
      $$0.a(cxx.O, cwb.lH, cxx.P);
   }

   public static class a {
      private final List<daf> a = new ArrayList<>();
      private final List<cxv.b<cxu>> b = new ArrayList<>();
      private final List<cxv.b<cvt>> c = new ArrayList<>();
      private final cra d;

      public a(cra $$0) {
         this.d = $$0;
      }

      private static void b(cvt $$0) {
         if (!($$0 instanceof cwr)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lx.g.b($$0));
         }
      }

      public void a(cvt $$0, cvt $$1, cvt $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cxv.b<>($$0.f(), daf.a($$1), $$2.f()));
         }
      }

      public void a(cvt $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(daf.a($$0));
         }
      }

      public void a(jp<cxu> $$0, cvt $$1, jp<cxu> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cxv.b<>($$0, daf.a($$1), $$2));
         }
      }

      public void a(cvt $$0, jp<cxu> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cxx.a, $$0, cxx.b);
            this.a(cxx.d, $$0, $$1);
         }
      }

      public cxv a() {
         return new cxv(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jp<T> a, daf b, jp<T> c) {
   }
}
