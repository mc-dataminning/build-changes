import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cns extends cnp {
   private static final double b = 0.15;
   @Nullable
   private bsr c;
   @Nullable
   private ji d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cns(bsx<? extends cns> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cns(dcw $$0, btn $$1, bsr $$2, ji.a $$3) {
      this(bsx.aL, $$0);
      this.c($$1);
      exc $$4 = $$1.cK().f();
      this.b($$4.c, $$4.d, $$4.e, this.dE(), this.dG());
      this.c = $$2;
      this.d = ji.b;
      this.a($$3);
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected void b(ub $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cz());
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
   protected void a(ub $$0) {
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
   protected void a(aka.a $$0) {
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
         $$2 = this.do().e();
      } else {
         $$1 = (double)this.c.dk() * 0.5;
         $$2 = jd.a(this.c.dt(), this.c.dv() + $$1, this.c.dz());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ji $$7 = null;
      if (!$$2.a(this.dm(), 2.0)) {
         jd $$8 = this.do();
         List<ji> $$9 = Lists.newArrayList();
         if ($$0 != ji.a.a) {
            if ($$8.u() < $$2.u() && this.dO().u($$8.i())) {
               $$9.add(ji.f);
            } else if ($$8.u() > $$2.u() && this.dO().u($$8.h())) {
               $$9.add(ji.e);
            }
         }

         if ($$0 != ji.a.b) {
            if ($$8.v() < $$2.v() && this.dO().u($$8.d())) {
               $$9.add(ji.b);
            } else if ($$8.v() > $$2.v() && this.dO().u($$8.e())) {
               $$9.add(ji.a);
            }
         }

         if ($$0 != ji.a.c) {
            if ($$8.w() < $$2.w() && this.dO().u($$8.g())) {
               $$9.add(ji.d);
            } else if ($$8.w() > $$2.w() && this.dO().u($$8.f())) {
               $$9.add(ji.c);
            }
         }

         $$7 = ji.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dO().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ji.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
         }

         $$4 = this.dt() + (double)$$7.j();
         $$5 = this.dv() + (double)$$7.k();
         $$6 = this.dz() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dt();
      double $$12 = $$5 - this.dv();
      double $$13 = $$6 - this.dz();
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
   public void dA() {
      if (this.dO().al() == bqo.a) {
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
      if (!this.dO().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aqu)this.dO()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bE() || this.c instanceof cmx && this.c.R_()) {
            this.bb();
         } else {
            this.f = ayo.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayo.a(this.g * 1.025, -1.0, 1.0);
            this.h = ayo.a(this.h * 1.025, -1.0, 1.0);
            exc $$0 = this.dr();
            this.i($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         exa $$1 = cnr.a(this, this::b);
         if ($$1.c() != exa.a.a) {
            this.b($$1);
         }
      }

      this.aT();
      exc $$2 = this.dr();
      this.a_(this.dt() + $$2.c, this.dv() + $$2.d, this.dz() + $$2.e);
      cnr.a(this, 0.5F);
      if (this.dO().B) {
         this.dO().a(lm.t, this.dt() - $$2.c, this.dv() - $$2.d + 0.15, this.dz() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dJ()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            jd $$3 = this.do();
            ji.a $$4 = this.d.o();
            if (this.dO().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               jd $$5 = this.c.do();
               if ($$4 == ji.a.a && $$3.u() == $$5.u() || $$4 == ji.a.c && $$3.w() == $$5.w() || $$4 == ji.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bsr $$0) {
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
   protected void a(ewz $$0) {
      super.a($$0);
      bsr $$1 = $$0.a();
      bsr $$2 = this.s();
      btn $$3 = $$2 instanceof btn ? (btn)$$2 : null;
      brk $$4 = this.dP().a(this, $$3);
      boolean $$5 = $$1.a($$4, 4.0F);
      if ($$5) {
         if (this.dO() instanceof aqu $$6) {
            dae.a($$6, $$1, $$4);
         }

         if ($$1 instanceof btn $$7) {
            $$7.b(new brz(bsb.y, 200), (bsr)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      ((aqu)this.dO()).a(lm.w, this.dt(), this.dv(), this.dz(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avp.wO, 1.0F, 1.0F);
   }

   private void t() {
      this.aq();
      this.dO().a(dxz.o, this.dm(), dxz.a.a(this));
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (!this.dO().B) {
         this.a(avp.wP, 1.0F, 1.0F);
         ((aqu)this.dO()).a(lm.f, this.dt(), this.dv(), this.dz(), 15, 0.2, 0.2, 0.2, 0.0);
         this.t();
      }

      return true;
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
