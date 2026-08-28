import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cnq extends cnn {
   private static final double b = 0.15;
   @Nullable
   private bsq c;
   @Nullable
   private ji d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cnq(bsw<? extends cnq> $$0, dcu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cnq(dcu $$0, btl $$1, bsq $$2, ji.a $$3) {
      this(bsw.aL, $$0);
      this.c($$1);
      eww $$4 = $$1.cL().f();
      this.b($$4.c, $$4.d, $$4.e, this.dG(), this.dI());
      this.c = $$2;
      this.d = ji.b;
      this.a($$3);
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cA());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.f);
      $$0.a("TYD", this.g);
      $$0.a("TZD", this.h);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ji.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Nullable
   private ji p() {
      return this.d;
   }

   private void a(@Nullable ji $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ji.a $$0) {
      double $$1 = 0.5;
      jd $$2;
      if (this.c == null) {
         $$2 = this.dq().d();
      } else {
         $$1 = (double)this.c.dl() * 0.5;
         $$2 = jd.a(this.c.dv(), this.c.dx() + $$1, this.c.dB());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ji $$7 = null;
      if (!$$2.a(this.do(), 2.0)) {
         jd $$8 = this.dq();
         List<ji> $$9 = Lists.newArrayList();
         if ($$0 != ji.a.a) {
            if ($$8.u() < $$2.u() && this.dQ().u($$8.h())) {
               $$9.add(ji.f);
            } else if ($$8.u() > $$2.u() && this.dQ().u($$8.g())) {
               $$9.add(ji.e);
            }
         }

         if ($$0 != ji.a.b) {
            if ($$8.v() < $$2.v() && this.dQ().u($$8.c())) {
               $$9.add(ji.b);
            } else if ($$8.v() > $$2.v() && this.dQ().u($$8.d())) {
               $$9.add(ji.a);
            }
         }

         if ($$0 != ji.a.c) {
            if ($$8.w() < $$2.w() && this.dQ().u($$8.f())) {
               $$9.add(ji.d);
            } else if ($$8.w() > $$2.w() && this.dQ().u($$8.e())) {
               $$9.add(ji.c);
            }
         }

         $$7 = ji.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dQ().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ji.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
         }

         $$4 = this.dv() + (double)$$7.j();
         $$5 = this.dx() + (double)$$7.k();
         $$6 = this.dB() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dv();
      double $$12 = $$5 - this.dx();
      double $$13 = $$6 - this.dB();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.f = 0.0;
         this.g = 0.0;
         this.h = 0.0;
      } else {
         this.f = $$11 / $$14 * 0.15;
         this.g = $$12 / $$14 * 0.15;
         this.h = $$13 / $$14 * 0.15;
      }

      this.av = true;
      this.e = 10 + this.ah.a(5) * 10;
   }

   @Override
   public void dC() {
      if (this.dQ().al() == bqn.a) {
         this.aq();
      }
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aqt)this.dQ()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bE() || this.c instanceof cmv && this.c.N_()) {
            this.bb();
         } else {
            this.f = ayn.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayn.a(this.g * 1.025, -1.0, 1.0);
            this.h = ayn.a(this.h * 1.025, -1.0, 1.0);
            eww $$0 = this.dt();
            this.i($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ewu $$1 = cnp.a(this, this::b);
         if ($$1.c() != ewu.a.a) {
            this.b($$1);
         }
      }

      this.aT();
      eww $$2 = this.dt();
      this.a_(this.dv() + $$2.c, this.dx() + $$2.d, this.dB() + $$2.e);
      cnp.a(this, 0.5F);
      if (this.dQ().B) {
         this.dQ().a(lm.t, this.dv() - $$2.c, this.dx() - $$2.d + 0.15, this.dB() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dL()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            jd $$3 = this.dq();
            ji.a $$4 = this.d.o();
            if (this.dQ().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               jd $$5 = this.c.dq();
               if ($$4 == ji.a.a && $$3.u() == $$5.u() || $$4 == ji.a.c && $$3.w() == $$5.w() || $$4 == ji.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bsq $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      bsq $$1 = $$0.a();
      bsq $$2 = this.s();
      btl $$3 = $$2 instanceof btl ? (btl)$$2 : null;
      brj $$4 = this.dR().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dQ() instanceof aqt $$6) {
            dac.a($$6, $$1, $$4);
         }

         if ($$1 instanceof btl $$7) {
            $$7.b(new bry(bsa.y, 200), (bsq)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      ((aqt)this.dQ()).a(lm.w, this.dv(), this.dx(), this.dB(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avo.wO, 1.0F, 1.0F);
   }

   private void t() {
      this.aq();
      this.dQ().a(dxw.o, this.do(), dxw.a.a(this));
   }

   @Override
   protected void a(ewu $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (!this.dQ().B) {
         this.a(avo.wP, 1.0F, 1.0F);
         ((aqt)this.dQ()).a(lm.f, this.dv(), this.dx(), this.dB(), 15, 0.2, 0.2, 0.2, 0.0);
         this.t();
      }

      return true;
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
