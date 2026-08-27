import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ceg extends cee {
   private static final double b = 0.15;
   @Nullable
   private bki c;
   @Nullable
   private hx d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public ceg(bkm<? extends ceg> $$0, crs $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public ceg(crs $$0, bky $$1, bki $$2, hx.a $$3) {
      this(bkm.aH, $$0);
      this.b($$1);
      ht $$4 = $$1.dl();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dB(), this.dD());
      this.c = $$2;
      this.d = hx.b;
      this.a($$3);
   }

   @Override
   public aqo da() {
      return aqo.f;
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cv());
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
   protected void a(rz $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = hx.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void b_() {
   }

   @Nullable
   private hx q() {
      return this.d;
   }

   private void a(@Nullable hx $$0) {
      this.d = $$0;
   }

   private void a(@Nullable hx.a $$0) {
      double $$1 = 0.5;
      ht $$2;
      if (this.c == null) {
         $$2 = this.dl().d();
      } else {
         $$1 = (double)this.c.dg() * 0.5;
         $$2 = ht.a(this.c.dq(), this.c.ds() + $$1, this.c.dw());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      hx $$7 = null;
      if (!$$2.a(this.dj(), 2.0)) {
         ht $$8 = this.dl();
         List<hx> $$9 = Lists.newArrayList();
         if ($$0 != hx.a.a) {
            if ($$8.u() < $$2.u() && this.dL().t($$8.h())) {
               $$9.add(hx.f);
            } else if ($$8.u() > $$2.u() && this.dL().t($$8.g())) {
               $$9.add(hx.e);
            }
         }

         if ($$0 != hx.a.b) {
            if ($$8.v() < $$2.v() && this.dL().t($$8.c())) {
               $$9.add(hx.b);
            } else if ($$8.v() > $$2.v() && this.dL().t($$8.d())) {
               $$9.add(hx.a);
            }
         }

         if ($$0 != hx.a.c) {
            if ($$8.w() < $$2.w() && this.dL().t($$8.f())) {
               $$9.add(hx.d);
            } else if ($$8.w() > $$2.w() && this.dL().t($$8.e())) {
               $$9.add(hx.c);
            }
         }

         $$7 = hx.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dL().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = hx.b(this.ag);
            }
         } else {
            $$7 = $$9.get(this.ag.a($$9.size()));
         }

         $$4 = this.dq() + (double)$$7.j();
         $$5 = this.ds() + (double)$$7.k();
         $$6 = this.dw() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dq();
      double $$12 = $$5 - this.ds();
      double $$13 = $$6 - this.dw();
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

      this.au = true;
      this.e = 10 + this.ag.a(5) * 10;
   }

   @Override
   public void dx() {
      if (this.dL().ai() == bin.a) {
         this.ak();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         if (this.c == null && this.i != null) {
            this.c = ((ama)this.dL()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bv() || this.c instanceof cdm && this.c.N_()) {
            if (!this.aT()) {
               this.f(this.do().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = ati.a(this.f * 1.025, -1.0, 1.0);
            this.g = ati.a(this.g * 1.025, -1.0, 1.0);
            this.h = ati.a(this.h * 1.025, -1.0, 1.0);
            eji $$0 = this.do();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ejg $$1 = cef.a(this, this::a);
         if ($$1.c() != ejg.a.a) {
            this.a($$1);
         }
      }

      this.aO();
      eji $$2 = this.do();
      this.e(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
      cef.a(this, 0.5F);
      if (this.dL().B) {
         this.dL().a(js.u, this.dq() - $$2.c, this.ds() - $$2.d + 0.15, this.dw() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dG()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            ht $$3 = this.dl();
            hx.a $$4 = this.d.o();
            if (this.dL().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               ht $$5 = this.c.dl();
               if ($$4 == hx.a.a && $$3.u() == $$5.u() || $$4 == hx.a.c && $$3.w() == $$5.w() || $$4 == hx.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bki $$0) {
      return super.a($$0) && !$$0.af;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      bki $$1 = $$0.a();
      bki $$2 = this.v();
      bky $$3 = $$2 instanceof bky ? (bky)$$2 : null;
      boolean $$4 = $$1.a(this.dM().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bky $$5) {
            $$5.b(new bjv(bjx.y, 200), (bki)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(eje $$0) {
      super.a($$0);
      ((ama)this.dL()).a(js.x, this.dq(), this.ds(), this.dw(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(aqn.vf, 1.0F, 1.0F);
   }

   private void s() {
      this.ak();
      this.dL().a(dlg.o, this.dj(), dlg.a.a(this));
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (!this.dL().B) {
         this.a(aqn.vg, 1.0F, 1.0F);
         ((ama)this.dL()).a(js.g, this.dq(), this.ds(), this.dw(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
