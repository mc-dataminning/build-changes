import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cet extends cer {
   private static final double b = 0.15;
   @Nullable
   private bkv c;
   @Nullable
   private ib d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cet(bkz<? extends cet> $$0, csf $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public cet(csf $$0, bll $$1, bkv $$2, ib.a $$3) {
      this(bkz.aH, $$0);
      this.b($$1);
      hx $$4 = $$1.dn();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dD(), this.dF());
      this.c = $$2;
      this.d = ib.b;
      this.a($$3);
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cw());
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
   protected void a(sd $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ib.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void c_() {
   }

   @Nullable
   private ib q() {
      return this.d;
   }

   private void a(@Nullable ib $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ib.a $$0) {
      double $$1 = 0.5;
      hx $$2;
      if (this.c == null) {
         $$2 = this.dn().d();
      } else {
         $$1 = (double)this.c.di() * 0.5;
         $$2 = hx.a(this.c.ds(), this.c.du() + $$1, this.c.dy());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ib $$7 = null;
      if (!$$2.a(this.dl(), 2.0)) {
         hx $$8 = this.dn();
         List<ib> $$9 = Lists.newArrayList();
         if ($$0 != ib.a.a) {
            if ($$8.u() < $$2.u() && this.dN().t($$8.h())) {
               $$9.add(ib.f);
            } else if ($$8.u() > $$2.u() && this.dN().t($$8.g())) {
               $$9.add(ib.e);
            }
         }

         if ($$0 != ib.a.b) {
            if ($$8.v() < $$2.v() && this.dN().t($$8.c())) {
               $$9.add(ib.b);
            } else if ($$8.v() > $$2.v() && this.dN().t($$8.d())) {
               $$9.add(ib.a);
            }
         }

         if ($$0 != ib.a.c) {
            if ($$8.w() < $$2.w() && this.dN().t($$8.f())) {
               $$9.add(ib.d);
            } else if ($$8.w() > $$2.w() && this.dN().t($$8.e())) {
               $$9.add(ib.c);
            }
         }

         $$7 = ib.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dN().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ib.b(this.ag);
            }
         } else {
            $$7 = $$9.get(this.ag.a($$9.size()));
         }

         $$4 = this.ds() + (double)$$7.j();
         $$5 = this.du() + (double)$$7.k();
         $$6 = this.dy() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.ds();
      double $$12 = $$5 - this.du();
      double $$13 = $$6 - this.dy();
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
   public void dz() {
      if (this.dN().aj() == biy.a) {
         this.am();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         if (this.c == null && this.i != null) {
            this.c = ((ami)this.dN()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bx() || this.c instanceof cdz && this.c.P_()) {
            if (!this.aV()) {
               this.g(this.dq().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = atq.a(this.f * 1.025, -1.0, 1.0);
            this.g = atq.a(this.g * 1.025, -1.0, 1.0);
            this.h = atq.a(this.h * 1.025, -1.0, 1.0);
            ejz $$0 = this.dq();
            this.g($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ejx $$1 = ces.a(this, this::a);
         if ($$1.c() != ejx.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      ejz $$2 = this.dq();
      this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
      ces.a(this, 0.5F);
      if (this.dN().B) {
         this.dN().a(jw.u, this.ds() - $$2.c, this.du() - $$2.d + 0.15, this.dy() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dI()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            hx $$3 = this.dn();
            ib.a $$4 = this.d.o();
            if (this.dN().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               hx $$5 = this.c.dn();
               if ($$4 == ib.a.a && $$3.u() == $$5.u() || $$4 == ib.a.c && $$3.w() == $$5.w() || $$4 == ib.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bkv $$0) {
      return super.a($$0) && !$$0.af;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      bkv $$1 = $$0.a();
      bkv $$2 = this.w();
      bll $$3 = $$2 instanceof bll ? (bll)$$2 : null;
      boolean $$4 = $$1.a(this.dO().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bll $$5) {
            $$5.b(new bki(bkk.y, 200), (bkv)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ejv $$0) {
      super.a($$0);
      ((ami)this.dN()).a(jw.x, this.ds(), this.du(), this.dy(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(aqv.vw, 1.0F, 1.0F);
   }

   private void s() {
      this.am();
      this.dN().a(dlx.o, this.dl(), dlx.a.a(this));
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (!this.dN().B) {
         this.a(aqv.vx, 1.0F, 1.0F);
         ((ami)this.dN()).a(jw.g, this.ds(), this.du(), this.dy(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
