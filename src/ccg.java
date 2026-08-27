import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccg extends cce {
   private static final double b = 0.15;
   @Nullable
   private bii c;
   @Nullable
   private ha d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public ccg(bim<? extends ccg> $$0, cpl $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public ccg(cpl $$0, biy $$1, bii $$2, ha.a $$3) {
      this(bim.aH, $$0);
      this.b($$1);
      gu $$4 = $$1.dk();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dA(), this.dC());
      this.c = $$2;
      this.d = ha.b;
      this.a($$3);
   }

   @Override
   public aox da() {
      return aox.f;
   }

   @Override
   protected void b(qr $$0) {
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
   protected void a(qr $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ha.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a_() {
   }

   @Nullable
   private ha j() {
      return this.d;
   }

   private void a(@Nullable ha $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ha.a $$0) {
      double $$1 = 0.5;
      gu $$2;
      if (this.c == null) {
         $$2 = this.dk().d();
      } else {
         $$1 = (double)this.c.dg() * 0.5;
         $$2 = gu.a(this.c.dp(), this.c.dr() + $$1, this.c.dv());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ha $$7 = null;
      if (!$$2.a(this.di(), 2.0)) {
         gu $$8 = this.dk();
         List<ha> $$9 = Lists.newArrayList();
         if ($$0 != ha.a.a) {
            if ($$8.u() < $$2.u() && this.dK().t($$8.h())) {
               $$9.add(ha.f);
            } else if ($$8.u() > $$2.u() && this.dK().t($$8.g())) {
               $$9.add(ha.e);
            }
         }

         if ($$0 != ha.a.b) {
            if ($$8.v() < $$2.v() && this.dK().t($$8.c())) {
               $$9.add(ha.b);
            } else if ($$8.v() > $$2.v() && this.dK().t($$8.d())) {
               $$9.add(ha.a);
            }
         }

         if ($$0 != ha.a.c) {
            if ($$8.w() < $$2.w() && this.dK().t($$8.f())) {
               $$9.add(ha.d);
            } else if ($$8.w() > $$2.w() && this.dK().t($$8.e())) {
               $$9.add(ha.c);
            }
         }

         $$7 = ha.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dK().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ha.b(this.ag);
            }
         } else {
            $$7 = $$9.get(this.ag.a($$9.size()));
         }

         $$4 = this.dp() + (double)$$7.j();
         $$5 = this.dr() + (double)$$7.k();
         $$6 = this.dv() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dp();
      double $$12 = $$5 - this.dr();
      double $$13 = $$6 - this.dv();
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
   public void dw() {
      if (this.dK().ai() == bgn.a) {
         this.ak();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B) {
         if (this.c == null && this.i != null) {
            this.c = ((akk)this.dK()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bv() || this.c instanceof cbm && this.c.G_()) {
            if (!this.aT()) {
               this.f(this.dn().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = arp.a(this.f * 1.025, -1.0, 1.0);
            this.g = arp.a(this.g * 1.025, -1.0, 1.0);
            this.h = arp.a(this.h * 1.025, -1.0, 1.0);
            ehd $$0 = this.dn();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ehb $$1 = ccf.a(this, this::a);
         if ($$1.c() != ehb.a.a) {
            this.a($$1);
         }
      }

      this.aO();
      ehd $$2 = this.dn();
      this.e(this.dp() + $$2.c, this.dr() + $$2.d, this.dv() + $$2.e);
      ccf.a(this, 0.5F);
      if (this.dK().B) {
         this.dK().a(iv.u, this.dp() - $$2.c, this.dr() - $$2.d + 0.15, this.dv() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dF()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gu $$3 = this.dk();
            ha.a $$4 = this.d.o();
            if (this.dK().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gu $$5 = this.c.dk();
               if ($$4 == ha.a.a && $$3.u() == $$5.u() || $$4 == ha.a.c && $$3.w() == $$5.w() || $$4 == ha.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bii $$0) {
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
   protected void a(eha $$0) {
      super.a($$0);
      bii $$1 = $$0.a();
      bii $$2 = this.v();
      biy $$3 = $$2 instanceof biy ? (biy)$$2 : null;
      boolean $$4 = $$1.a(this.dL().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof biy $$5) {
            $$5.b(new bhv(bhx.y, 200), (bii)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(egz $$0) {
      super.a($$0);
      ((akk)this.dK()).a(iv.x, this.dp(), this.dr(), this.dv(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(aow.vb, 1.0F, 1.0F);
   }

   private void m() {
      this.ak();
      this.dK().a(djj.o, this.di(), djj.a.a(this));
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      this.m();
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (!this.dK().B) {
         this.a(aow.vc, 1.0F, 1.0F);
         ((akk)this.dK()).a(iv.g, this.dp(), this.dr(), this.dv(), 15, 0.2, 0.2, 0.2, 0.0);
         this.m();
      }

      return true;
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
