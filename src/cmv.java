import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmv extends cms {
   private static final double b = 0.15;
   @Nullable
   private brv c;
   @Nullable
   private iw d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public cmv(bsb<? extends cmv> $$0, dca $$1) {
      super($$0, $$1);
      this.ah = true;
   }

   public cmv(dca $$0, bso $$1, brv $$2, iw.a $$3) {
      this(bsb.aN, $$0);
      this.c($$1);
      ir $$4 = $$1.du();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dK(), this.dM());
      this.c = $$2;
      this.d = iw.b;
      this.a($$3);
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cE());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.g);
      $$0.a("TYD", this.h);
      $$0.a("TZD", this.i);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.g = $$0.k("TXD");
      this.h = $$0.k("TYD");
      this.i = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = iw.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.j = $$0.a("Target");
      }
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Nullable
   private iw p() {
      return this.d;
   }

   private void a(@Nullable iw $$0) {
      this.d = $$0;
   }

   private void a(@Nullable iw.a $$0) {
      double $$1 = 0.5;
      ir $$2;
      if (this.c == null) {
         $$2 = this.du().d();
      } else {
         $$1 = (double)this.c.dp() * 0.5;
         $$2 = ir.a(this.c.dz(), this.c.dB() + $$1, this.c.dF());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      iw $$7 = null;
      if (!$$2.a(this.ds(), 2.0)) {
         ir $$8 = this.du();
         List<iw> $$9 = Lists.newArrayList();
         if ($$0 != iw.a.a) {
            if ($$8.u() < $$2.u() && this.dU().u($$8.h())) {
               $$9.add(iw.f);
            } else if ($$8.u() > $$2.u() && this.dU().u($$8.g())) {
               $$9.add(iw.e);
            }
         }

         if ($$0 != iw.a.b) {
            if ($$8.v() < $$2.v() && this.dU().u($$8.c())) {
               $$9.add(iw.b);
            } else if ($$8.v() > $$2.v() && this.dU().u($$8.d())) {
               $$9.add(iw.a);
            }
         }

         if ($$0 != iw.a.c) {
            if ($$8.w() < $$2.w() && this.dU().u($$8.f())) {
               $$9.add(iw.d);
            } else if ($$8.w() > $$2.w() && this.dU().u($$8.e())) {
               $$9.add(iw.c);
            }
         }

         $$7 = iw.b(this.al);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dU().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = iw.b(this.al);
            }
         } else {
            $$7 = $$9.get(this.al.a($$9.size()));
         }

         $$4 = this.dz() + (double)$$7.j();
         $$5 = this.dB() + (double)$$7.k();
         $$6 = this.dF() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dz();
      double $$12 = $$5 - this.dB();
      double $$13 = $$6 - this.dF();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.g = 0.0;
         this.h = 0.0;
         this.i = 0.0;
      } else {
         this.g = $$11 / $$14 * 0.15;
         this.h = $$12 / $$14 * 0.15;
         this.i = $$13 / $$14 * 0.15;
      }

      this.az = true;
      this.e = 10 + this.al.a(5) * 10;
   }

   @Override
   public void dG() {
      if (this.dU().al() == bpx.a) {
         this.ao();
      }
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dU().C) {
         if (this.c == null && this.j != null) {
            this.c = ((aqt)this.dU()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bI() || this.c instanceof cly && this.c.O_()) {
            this.be();
         } else {
            this.g = aym.a(this.g * 1.025, -1.0, 1.0);
            this.h = aym.a(this.h * 1.025, -1.0, 1.0);
            this.i = aym.a(this.i * 1.025, -1.0, 1.0);
            ewu $$0 = this.dx();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         ews $$1 = cmu.a(this, this::b);
         if ($$1.c() != ews.a.a) {
            this.a($$1);
         }
      }

      this.aW();
      ewu $$2 = this.dx();
      this.a_(this.dz() + $$2.c, this.dB() + $$2.d, this.dF() + $$2.e);
      cmu.a(this, 0.5F);
      if (this.dU().C) {
         this.dU().a(lb.t, this.dz() - $$2.c, this.dB() - $$2.d + 0.15, this.dF() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dP()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ir $$3 = this.du();
            iw.a $$4 = this.d.o();
            if (this.dU().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ir $$5 = this.c.du();
               if ($$4 == iw.a.a && $$3.u() == $$5.u() || $$4 == iw.a.c && $$3.w() == $$5.w() || $$4 == iw.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(brv $$0) {
      return super.b($$0) && !$$0.ah;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      brv $$1 = $$0.a();
      brv $$2 = this.t();
      bso $$3 = $$2 instanceof bso ? (bso)$$2 : null;
      boolean $$4 = $$1.a(this.dX().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bso $$5) {
            $$5.b(new brh(brj.y, 200), (brv)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      ((aqt)this.dU()).a(lb.w, this.dz(), this.dB(), this.dF(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avo.xj, 1.0F, 1.0F);
   }

   private void r() {
      this.ao();
      this.dU().a(dxv.o, this.ds(), dxv.a.a(this));
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      this.r();
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (!this.dU().C) {
         this.a(avo.xk, 1.0F, 1.0F);
         ((aqt)this.dU()).a(lb.f, this.dz(), this.dB(), this.dF(), 15, 0.2, 0.2, 0.2, 0.0);
         this.r();
      }

      return true;
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
