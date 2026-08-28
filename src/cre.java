import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cre extends crb {
   private static final double a = 0.15;
   @Nullable
   private bvs b;
   @Nullable
   private jo c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public cre(bwb<? extends cre> $$0, dhp $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public cre(dhp $$0, bwr $$1, bvs $$2, jo.a $$3) {
      this(bwb.bc, $$0);
      this.c($$1);
      fcu $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dL(), this.dN());
      this.b = $$2;
      this.c = jo.b;
      this.a($$3);
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected void b(tw $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", this.b.cG());
      }

      if (this.c != null) {
         $$0.a("Dir", this.c.d());
      }

      $$0.a("Steps", this.d);
      $$0.a("TXD", this.e);
      $$0.a("TYD", this.f);
      $$0.a("TZD", this.g);
   }

   @Override
   protected void a(tw $$0) {
      super.a($$0);
      this.d = $$0.h("Steps");
      this.e = $$0.k("TXD");
      this.f = $$0.k("TYD");
      this.g = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.c = jo.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.h = $$0.a("Target");
      }
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Nullable
   private jo f() {
      return this.c;
   }

   private void a(@Nullable jo $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jo.a $$0) {
      double $$1 = 0.5;
      jj $$2;
      if (this.b == null) {
         $$2 = this.dv().e();
      } else {
         $$1 = (double)this.b.dr() * 0.5;
         $$2 = jj.a(this.b.dA(), this.b.dC() + $$1, this.b.dG());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jo $$7 = null;
      if (!$$2.a(this.dt(), 2.0)) {
         jj $$8 = this.dv();
         List<jo> $$9 = Lists.newArrayList();
         if ($$0 != jo.a.a) {
            if ($$8.u() < $$2.u() && this.dV().u($$8.i())) {
               $$9.add(jo.f);
            } else if ($$8.u() > $$2.u() && this.dV().u($$8.h())) {
               $$9.add(jo.e);
            }
         }

         if ($$0 != jo.a.b) {
            if ($$8.v() < $$2.v() && this.dV().u($$8.d())) {
               $$9.add(jo.b);
            } else if ($$8.v() > $$2.v() && this.dV().u($$8.e())) {
               $$9.add(jo.a);
            }
         }

         if ($$0 != jo.a.c) {
            if ($$8.w() < $$2.w() && this.dV().u($$8.g())) {
               $$9.add(jo.d);
            } else if ($$8.w() > $$2.w() && this.dV().u($$8.f())) {
               $$9.add(jo.c);
            }
         }

         $$7 = jo.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dV().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jo.b(this.ae);
            }
         } else {
            $$7 = $$9.get(this.ae.a($$9.size()));
         }

         $$4 = this.dA() + (double)$$7.j();
         $$5 = this.dC() + (double)$$7.k();
         $$6 = this.dG() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dA();
      double $$12 = $$5 - this.dC();
      double $$13 = $$6 - this.dG();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.e = 0.0;
         this.f = 0.0;
         this.g = 0.0;
      } else {
         this.e = $$11 / $$14 * 0.15;
         this.f = $$12 / $$14 * 0.15;
         this.g = $$13 / $$14 * 0.15;
      }

      this.ar = true;
      this.d = 10 + this.ae.a(5) * 10;
   }

   @Override
   public void dH() {
      if (this.dV().an() == btn.a) {
         this.at();
      }
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      super.h();
      fcs $$0 = null;
      if (!this.dV().C) {
         if (this.b == null && this.h != null) {
            this.b = ((arn)this.dV()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bK() || this.b instanceof cqi && this.b.U_()) {
            this.bf();
         } else {
            this.e = azk.a(this.e * 1.025, -1.0, 1.0);
            this.f = azk.a(this.f * 1.025, -1.0, 1.0);
            this.g = azk.a(this.g * 1.025, -1.0, 1.0);
            fcu $$1 = this.dy();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = crd.a(this, this::b);
      }

      fcu $$2 = this.dy();
      this.b(this.dt().e($$2));
      this.aK();
      if (this.as != null && this.as.e()) {
         this.bW();
      }

      if ($$0 != null && this.bK() && $$0.d() != fcs.a.a) {
         this.b($$0);
      }

      crd.a(this, 0.5F);
      if (this.dV().C) {
         this.dV().a(lv.t, this.dA() - $$2.d, this.dC() - $$2.e + 0.15, this.dG() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dQ()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            jj $$3 = this.dv();
            jo.a $$4 = this.c.o();
            if (this.dV().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               jj $$5 = this.b.dv();
               if ($$4 == jo.a.a && $$3.u() == $$5.u() || $$4 == jo.a.c && $$3.w() == $$5.w() || $$4 == jo.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean aL() {
      return !this.dQ();
   }

   @Override
   protected boolean b(bvs $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      bvs $$1 = $$0.a();
      bvs $$2 = this.q();
      bwr $$3 = $$2 instanceof bwr ? (bwr)$$2 : null;
      buh $$4 = this.dW().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dV() instanceof arn $$6) {
            dej.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bwr $$7) {
            $$7.b(new buw(buy.y, 200), (bvs)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fcq $$0) {
      super.a($$0);
      ((arn)this.dV()).a(lv.w, this.dA(), this.dC(), this.dG(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awk.xy, 1.0F, 1.0F);
   }

   private void g() {
      this.at();
      this.dV().a(edm.o, this.dt(), edm.a.a(this));
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public boolean b(buh $$0) {
      return true;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      this.a(awk.xz, 1.0F, 1.0F);
      $$0.a(lv.f, this.dA(), this.dC(), this.dG(), 15, 0.2, 0.2, 0.2, 0.0);
      this.g();
      return true;
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
