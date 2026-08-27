import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cco extends ccm {
   private static final double b = 0.15;
   @Nullable
   private biq c;
   @Nullable
   private hc d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cco(biu<? extends cco> $$0, cpv $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public cco(cpv $$0, bjg $$1, biq $$2, hc.a $$3) {
      this(biu.aH, $$0);
      this.b($$1);
      gw $$4 = $$1.dl();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dB(), this.dD());
      this.c = $$2;
      this.d = hc.b;
      this.a($$3);
   }

   @Override
   public apf da() {
      return apf.f;
   }

   @Override
   protected void b(qy $$0) {
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
   protected void a(qy $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = hc.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a_() {
   }

   @Nullable
   private hc q() {
      return this.d;
   }

   private void a(@Nullable hc $$0) {
      this.d = $$0;
   }

   private void a(@Nullable hc.a $$0) {
      double $$1 = 0.5;
      gw $$2;
      if (this.c == null) {
         $$2 = this.dl().d();
      } else {
         $$1 = (double)this.c.dg() * 0.5;
         $$2 = gw.a(this.c.dq(), this.c.ds() + $$1, this.c.dw());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      hc $$7 = null;
      if (!$$2.a(this.dj(), 2.0)) {
         gw $$8 = this.dl();
         List<hc> $$9 = Lists.newArrayList();
         if ($$0 != hc.a.a) {
            if ($$8.u() < $$2.u() && this.dL().t($$8.h())) {
               $$9.add(hc.f);
            } else if ($$8.u() > $$2.u() && this.dL().t($$8.g())) {
               $$9.add(hc.e);
            }
         }

         if ($$0 != hc.a.b) {
            if ($$8.v() < $$2.v() && this.dL().t($$8.c())) {
               $$9.add(hc.b);
            } else if ($$8.v() > $$2.v() && this.dL().t($$8.d())) {
               $$9.add(hc.a);
            }
         }

         if ($$0 != hc.a.c) {
            if ($$8.w() < $$2.w() && this.dL().t($$8.f())) {
               $$9.add(hc.d);
            } else if ($$8.w() > $$2.w() && this.dL().t($$8.e())) {
               $$9.add(hc.c);
            }
         }

         $$7 = hc.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dL().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = hc.b(this.ag);
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
      if (this.dL().ai() == bgv.a) {
         this.ak();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         if (this.c == null && this.i != null) {
            this.c = ((akr)this.dL()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bv() || this.c instanceof cbu && this.c.M_()) {
            if (!this.aT()) {
               this.f(this.do().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = arx.a(this.f * 1.025, -1.0, 1.0);
            this.g = arx.a(this.g * 1.025, -1.0, 1.0);
            this.h = arx.a(this.h * 1.025, -1.0, 1.0);
            ehn $$0 = this.do();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ehl $$1 = ccn.a(this, this::a);
         if ($$1.c() != ehl.a.a) {
            this.a($$1);
         }
      }

      this.aO();
      ehn $$2 = this.do();
      this.e(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
      ccn.a(this, 0.5F);
      if (this.dL().B) {
         this.dL().a(ix.u, this.dq() - $$2.c, this.ds() - $$2.d + 0.15, this.dw() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dG()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gw $$3 = this.dl();
            hc.a $$4 = this.d.o();
            if (this.dL().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gw $$5 = this.c.dl();
               if ($$4 == hc.a.a && $$3.u() == $$5.u() || $$4 == hc.a.c && $$3.w() == $$5.w() || $$4 == hc.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(biq $$0) {
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
   protected void a(ehk $$0) {
      super.a($$0);
      biq $$1 = $$0.a();
      biq $$2 = this.v();
      bjg $$3 = $$2 instanceof bjg ? (bjg)$$2 : null;
      boolean $$4 = $$1.a(this.dM().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bjg $$5) {
            $$5.b(new bid(bif.y, 200), (biq)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ehj $$0) {
      super.a($$0);
      ((akr)this.dL()).a(ix.x, this.dq(), this.ds(), this.dw(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(ape.vb, 1.0F, 1.0F);
   }

   private void s() {
      this.ak();
      this.dL().a(djt.o, this.dj(), djt.a.a(this));
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (!this.dL().B) {
         this.a(ape.vc, 1.0F, 1.0F);
         ((akr)this.dL()).a(ix.g, this.dq(), this.ds(), this.dw(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(wy $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
