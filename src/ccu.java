import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccu extends ccs {
   private static final double b = 0.15;
   @Nullable
   private biw c;
   @Nullable
   private ha d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public ccu(bja<? extends ccu> $$0, cqb $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public ccu(cqb $$0, bjm $$1, biw $$2, ha.a $$3) {
      this(bja.aH, $$0);
      this.b($$1);
      gw $$4 = $$1.dl();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dB(), this.dD());
      this.c = $$2;
      this.d = ha.b;
      this.a($$3);
   }

   @Override
   public aph da() {
      return aph.f;
   }

   @Override
   protected void b(qw $$0) {
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
   protected void a(qw $$0) {
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
   private ha q() {
      return this.d;
   }

   private void a(@Nullable ha $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ha.a $$0) {
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
      ha $$7 = null;
      if (!$$2.a(this.dj(), 2.0)) {
         gw $$8 = this.dl();
         List<ha> $$9 = Lists.newArrayList();
         if ($$0 != ha.a.a) {
            if ($$8.u() < $$2.u() && this.dL().t($$8.h())) {
               $$9.add(ha.f);
            } else if ($$8.u() > $$2.u() && this.dL().t($$8.g())) {
               $$9.add(ha.e);
            }
         }

         if ($$0 != ha.a.b) {
            if ($$8.v() < $$2.v() && this.dL().t($$8.c())) {
               $$9.add(ha.b);
            } else if ($$8.v() > $$2.v() && this.dL().t($$8.d())) {
               $$9.add(ha.a);
            }
         }

         if ($$0 != ha.a.c) {
            if ($$8.w() < $$2.w() && this.dL().t($$8.f())) {
               $$9.add(ha.d);
            } else if ($$8.w() > $$2.w() && this.dL().t($$8.e())) {
               $$9.add(ha.c);
            }
         }

         $$7 = ha.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dL().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ha.b(this.ag);
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
      if (this.dL().ai() == bhb.a) {
         this.ak();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         if (this.c == null && this.i != null) {
            this.c = ((akt)this.dL()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bv() || this.c instanceof cca && this.c.M_()) {
            if (!this.aT()) {
               this.f(this.do().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = asb.a(this.f * 1.025, -1.0, 1.0);
            this.g = asb.a(this.g * 1.025, -1.0, 1.0);
            this.h = asb.a(this.h * 1.025, -1.0, 1.0);
            ehh $$0 = this.do();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ehf $$1 = cct.a(this, this::a);
         if ($$1.c() != ehf.a.a) {
            this.a($$1);
         }
      }

      this.aO();
      ehh $$2 = this.do();
      this.e(this.dq() + $$2.c, this.ds() + $$2.d, this.dw() + $$2.e);
      cct.a(this, 0.5F);
      if (this.dL().B) {
         this.dL().a(iv.u, this.dq() - $$2.c, this.ds() - $$2.d + 0.15, this.dw() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dG()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gw $$3 = this.dl();
            ha.a $$4 = this.d.o();
            if (this.dL().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gw $$5 = this.c.dl();
               if ($$4 == ha.a.a && $$3.u() == $$5.u() || $$4 == ha.a.c && $$3.w() == $$5.w() || $$4 == ha.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(biw $$0) {
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
   protected void a(ehe $$0) {
      super.a($$0);
      biw $$1 = $$0.a();
      biw $$2 = this.v();
      bjm $$3 = $$2 instanceof bjm ? (bjm)$$2 : null;
      boolean $$4 = $$1.a(this.dM().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bjm $$5) {
            $$5.b(new bij(bil.y, 200), (biw)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      ((akt)this.dL()).a(iv.x, this.dq(), this.ds(), this.dw(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(apg.vb, 1.0F, 1.0F);
   }

   private void s() {
      this.ak();
      this.dL().a(djn.o, this.dj(), djn.a.a(this));
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      this.s();
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (!this.dL().B) {
         this.a(apg.vc, 1.0F, 1.0F);
         ((akt)this.dL()).a(iv.g, this.dq(), this.ds(), this.dw(), 15, 0.2, 0.2, 0.2, 0.0);
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
