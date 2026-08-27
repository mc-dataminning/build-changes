import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgk extends cgi {
   private static final double b = 0.15;
   @Nullable
   private blw c;
   @Nullable
   private ic d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public cgk(bmc<? extends cgk> $$0, ctx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public cgk(ctx $$0, bmo $$1, blw $$2, ic.a $$3) {
      this(bmc.aJ, $$0);
      this.c($$1);
      hx $$4 = $$1.dl();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dB(), this.dD());
      this.c = $$2;
      this.d = ic.b;
      this.a($$3);
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected void b(so $$0) {
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
   protected void a(so $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ic.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void c_() {
   }

   @Nullable
   private ic q() {
      return this.d;
   }

   private void a(@Nullable ic $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ic.a $$0) {
      double $$1 = 0.5;
      hx $$2;
      if (this.c == null) {
         $$2 = this.dl().d();
      } else {
         $$1 = (double)this.c.dh() * 0.5;
         $$2 = hx.a(this.c.dq(), this.c.ds() + $$1, this.c.dw());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ic $$7 = null;
      if (!$$2.a(this.dj(), 2.0)) {
         hx $$8 = this.dl();
         List<ic> $$9 = Lists.newArrayList();
         if ($$0 != ic.a.a) {
            if ($$8.u() < $$2.u() && this.dL().u($$8.h())) {
               $$9.add(ic.f);
            } else if ($$8.u() > $$2.u() && this.dL().u($$8.g())) {
               $$9.add(ic.e);
            }
         }

         if ($$0 != ic.a.b) {
            if ($$8.v() < $$2.v() && this.dL().u($$8.c())) {
               $$9.add(ic.b);
            } else if ($$8.v() > $$2.v() && this.dL().u($$8.d())) {
               $$9.add(ic.a);
            }
         }

         if ($$0 != ic.a.c) {
            if ($$8.w() < $$2.w() && this.dL().u($$8.f())) {
               $$9.add(ic.d);
            } else if ($$8.w() > $$2.w() && this.dL().u($$8.e())) {
               $$9.add(ic.c);
            }
         }

         $$7 = ic.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dL().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ic.b(this.ag);
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
      if (this.dL().ak() == bjz.a) {
         this.am();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         if (this.c == null && this.i != null) {
            this.c = ((ane)this.dL()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bx() || this.c instanceof cfq && this.c.P_()) {
            if (!this.aV()) {
               this.g(this.do().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = aup.a(this.f * 1.025, -1.0, 1.0);
            this.g = aup.a(this.g * 1.025, -1.0, 1.0);
            this.h = aup.a(this.h * 1.025, -1.0, 1.0);
            emc $$0 = this.do();
            this.g($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ema $$1 = cgj.a(this, this::b);
         if ($$1.c() != ema.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      emc $$2 = this.do();
      this.a_(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
      cgj.a(this, 0.5F);
      if (this.dL().B) {
         this.dL().a(jx.u, this.dq() - $$2.c, this.ds() - $$2.d + 0.15, this.dw() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dG()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            hx $$3 = this.dl();
            ic.a $$4 = this.d.o();
            if (this.dL().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               hx $$5 = this.c.dl();
               if ($$4 == ic.a.a && $$3.u() == $$5.u() || $$4 == ic.a.c && $$3.w() == $$5.w() || $$4 == ic.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(blw $$0) {
      return super.b($$0) && !$$0.af;
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
   protected void a(elz $$0) {
      super.a($$0);
      blw $$1 = $$0.a();
      blw $$2 = this.w();
      bmo $$3 = $$2 instanceof bmo ? (bmo)$$2 : null;
      boolean $$4 = $$1.a(this.dM().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bmo $$5) {
            $$5.b(new blj(bll.y, 200), (blw)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      ((ane)this.dL()).a(jx.x, this.dq(), this.ds(), this.dw(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(art.wg, 1.0F, 1.0F);
   }

   private void s() {
      this.am();
      this.dL().a(dnz.o, this.dj(), dnz.a.a(this));
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (!this.dL().B) {
         this.a(art.wh, 1.0F, 1.0F);
         ((ane)this.dL()).a(jx.g, this.dq(), this.ds(), this.dw(), 15, 0.2, 0.2, 0.2, 0.0);
         this.s();
      }

      return true;
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
