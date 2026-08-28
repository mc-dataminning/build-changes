import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cxm {
   public static final int a = 20;
   public static final cxm b = new cxm(List.of(), List.of(), List.of());
   private final List<czp> c;
   private final List<cxm.b<cxl>> d;
   private final List<cxm.b<cvg>> e;

   cxm(List<czp> $$0, List<cxm.b<cxl>> $$1, List<cxm.b<cvg>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(cvl $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(cvl $$0) {
      for (czp $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(cvl $$0) {
      for (cxm.b<cvg> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvl $$0) {
      for (cxm.b<cxl> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jn<cxl> $$0) {
      for (cxm.b<cxl> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(cvl $$0, cvl $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(cvl $$0, cvl $$1) {
      for (cxm.b<cvg> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(cvl $$0, cvl $$1) {
      Optional<jn<cxl>> $$2 = $$0.a(kr.I, cxn.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (cxm.b<cxl> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public cvl d(cvl $$0, cvl $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jn<cxl>> $$2 = $$1.a(kr.I, cxn.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (cxm.b<cvg> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return cxn.a($$3.c.a(), $$2.get());
               }
            }

            for (cxm.b<cxl> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return cxn.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static cxm a(cqh $$0) {
      cxm.a $$1 = new cxm.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(cxm.a $$0) {
      $$0.a(cvo.sl);
      $$0.a(cvo.vq);
      $$0.a(cvo.vt);
      $$0.a(cvo.sl, cvo.pv, cvo.vq);
      $$0.a(cvo.vq, cvo.vp, cvo.vt);
      $$0.a(cxo.a, cvo.qZ, cxo.c);
      $$0.a(cxo.a, cvo.lH, cxo.b);
      $$0.a(cxo.a, cvo.sk, cxo.d);
      $$0.a(cvo.uc, cxo.Q);
      $$0.a(cvo.lO, cxo.S);
      $$0.a(cvo.b, cxo.T);
      $$0.a(cvo.cM, cxo.R);
      $$0.a(cxo.d, cvo.um, cxo.e);
      $$0.a(cxo.e, cvo.lH, cxo.f);
      $$0.a(cxo.e, cvo.so, cxo.g);
      $$0.a(cxo.f, cvo.so, cxo.h);
      $$0.a(cxo.g, cvo.lH, cxo.h);
      $$0.a(cvo.sq, cxo.l);
      $$0.a(cxo.l, cvo.lH, cxo.m);
      $$0.a(cvo.uF, cxo.i);
      $$0.a(cxo.i, cvo.lH, cxo.j);
      $$0.a(cxo.i, cvo.qZ, cxo.k);
      $$0.a(cxo.i, cvo.so, cxo.q);
      $$0.a(cxo.j, cvo.so, cxo.r);
      $$0.a(cxo.q, cvo.lH, cxo.r);
      $$0.a(cxo.q, cvo.qZ, cxo.s);
      $$0.a(cxo.d, cvo.op, cxo.t);
      $$0.a(cxo.t, cvo.lH, cxo.u);
      $$0.a(cxo.t, cvo.qZ, cxo.v);
      $$0.a(cxo.n, cvo.so, cxo.q);
      $$0.a(cxo.o, cvo.so, cxo.r);
      $$0.a(cvo.rB, cxo.n);
      $$0.a(cxo.n, cvo.lH, cxo.o);
      $$0.a(cxo.n, cvo.qZ, cxo.p);
      $$0.a(cxo.d, cvo.rd, cxo.w);
      $$0.a(cxo.w, cvo.lH, cxo.x);
      $$0.a(cvo.su, cxo.y);
      $$0.a(cxo.y, cvo.qZ, cxo.z);
      $$0.a(cxo.y, cvo.so, cxo.A);
      $$0.a(cxo.z, cvo.so, cxo.B);
      $$0.a(cxo.A, cvo.qZ, cxo.B);
      $$0.a(cxo.C, cvo.so, cxo.A);
      $$0.a(cxo.D, cvo.so, cxo.A);
      $$0.a(cxo.E, cvo.so, cxo.B);
      $$0.a(cvo.sn, cxo.C);
      $$0.a(cxo.C, cvo.lH, cxo.D);
      $$0.a(cxo.C, cvo.qZ, cxo.E);
      $$0.a(cvo.si, cxo.F);
      $$0.a(cxo.F, cvo.lH, cxo.G);
      $$0.a(cxo.F, cvo.qZ, cxo.H);
      $$0.a(cvo.sp, cxo.I);
      $$0.a(cxo.I, cvo.lH, cxo.J);
      $$0.a(cxo.I, cvo.qZ, cxo.K);
      $$0.a(cxo.a, cvo.so, cxo.L);
      $$0.a(cxo.L, cvo.lH, cxo.M);
      $$0.a(cxo.d, cvo.nT, cxo.O);
      $$0.a(cxo.O, cvo.lH, cxo.P);
   }

   public static class a {
      private final List<czp> a = new ArrayList<>();
      private final List<cxm.b<cxl>> b = new ArrayList<>();
      private final List<cxm.b<cvg>> c = new ArrayList<>();
      private final cqh d;

      public a(cqh $$0) {
         this.d = $$0;
      }

      private static void b(cvg $$0) {
         if (!($$0 instanceof cwg)) {
            throw new IllegalArgumentException("Expected a potion, got: " + lu.g.b($$0));
         }
      }

      public void a(cvg $$0, cvg $$1, cvg $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new cxm.b<>($$0.o(), czp.a($$1), $$2.o()));
         }
      }

      public void a(cvg $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(czp.a($$0));
         }
      }

      public void a(jn<cxl> $$0, cvg $$1, jn<cxl> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new cxm.b<>($$0, czp.a($$1), $$2));
         }
      }

      public void a(cvg $$0, jn<cxl> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(cxo.a, $$0, cxo.b);
            this.a(cxo.d, $$0, $$1);
         }
      }

      public cxm a() {
         return new cxm(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   static record b<T>(jn<T> a, czp b, jn<T> c) {
   }
}
