import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cmc extends clz {
   private static final double b = 0.15;
   @Nullable
   private brh c;
   @Nullable
   private is d;
   private int e;
   private double g;
   private double h;
   private double i;
   @Nullable
   private UUID j;

   public cmc(brn<? extends cmc> $$0, dad $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   public cmc(dad $$0, bsa $$1, brh $$2, is.a $$3) {
      this(brn.aK, $$0);
      this.c($$1);
      in $$4 = $$1.dn();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dD(), this.dF());
      this.c = $$2;
      this.d = is.b;
      this.a($$3);
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.cx());
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
   protected void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.g = $$0.k("TXD");
      this.h = $$0.k("TYD");
      this.i = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = is.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.j = $$0.a("Target");
      }
   }

   @Override
   protected void a(ajq.a $$0) {
   }

   @Nullable
   private is p() {
      return this.d;
   }

   private void a(@Nullable is $$0) {
      this.d = $$0;
   }

   private void a(@Nullable is.a $$0) {
      double $$1 = 0.5;
      in $$2;
      if (this.c == null) {
         $$2 = this.dn().d();
      } else {
         $$1 = (double)this.c.di() * 0.5;
         $$2 = in.a(this.c.ds(), this.c.du() + $$1, this.c.dy());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      is $$7 = null;
      if (!$$2.a(this.dl(), 2.0)) {
         in $$8 = this.dn();
         List<is> $$9 = Lists.newArrayList();
         if ($$0 != is.a.a) {
            if ($$8.u() < $$2.u() && this.dN().u($$8.h())) {
               $$9.add(is.f);
            } else if ($$8.u() > $$2.u() && this.dN().u($$8.g())) {
               $$9.add(is.e);
            }
         }

         if ($$0 != is.a.b) {
            if ($$8.v() < $$2.v() && this.dN().u($$8.c())) {
               $$9.add(is.b);
            } else if ($$8.v() > $$2.v() && this.dN().u($$8.d())) {
               $$9.add(is.a);
            }
         }

         if ($$0 != is.a.c) {
            if ($$8.w() < $$2.w() && this.dN().u($$8.f())) {
               $$9.add(is.d);
            } else if ($$8.w() > $$2.w() && this.dN().u($$8.e())) {
               $$9.add(is.c);
            }
         }

         $$7 = is.b(this.ah);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dN().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = is.b(this.ah);
            }
         } else {
            $$7 = $$9.get(this.ah.a($$9.size()));
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
         this.g = 0.0;
         this.h = 0.0;
         this.i = 0.0;
      } else {
         this.g = $$11 / $$14 * 0.15;
         this.h = $$12 / $$14 * 0.15;
         this.i = $$13 / $$14 * 0.15;
      }

      this.av = true;
      this.e = 10 + this.ah.a(5) * 10;
   }

   @Override
   public void dz() {
      if (this.dN().ak() == bpj.a) {
         this.am();
      }
   }

   @Override
   protected double aW() {
      return 0.04;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         if (this.c == null && this.j != null) {
            this.c = ((aqh)this.dN()).a(this.j);
            if (this.c == null) {
               this.j = null;
            }
         }

         if (this.c == null || !this.c.bB() || this.c instanceof clh && this.c.N_()) {
            this.aY();
         } else {
            this.g = axz.a(this.g * 1.025, -1.0, 1.0);
            this.h = axz.a(this.h * 1.025, -1.0, 1.0);
            this.i = axz.a(this.i * 1.025, -1.0, 1.0);
            etp $$0 = this.dq();
            this.g($$0.b((this.g - $$0.c) * 0.2, (this.h - $$0.d) * 0.2, (this.i - $$0.e) * 0.2));
         }

         etn $$1 = cmb.a(this, this::b);
         if ($$1.c() != etn.a.a) {
            this.a($$1);
         }
      }

      this.aQ();
      etp $$2 = this.dq();
      this.a_(this.ds() + $$2.c, this.du() + $$2.d, this.dy() + $$2.e);
      cmb.a(this, 0.5F);
      if (this.dN().B) {
         this.dN().a(kx.t, this.ds() - $$2.c, this.du() - $$2.d + 0.15, this.dy() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dI()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            in $$3 = this.dn();
            is.a $$4 = this.d.o();
            if (this.dN().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               in $$5 = this.c.dn();
               if ($$4 == is.a.a && $$3.u() == $$5.u() || $$4 == is.a.c && $$3.w() == $$5.w() || $$4 == is.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(brh $$0) {
      return super.b($$0) && !$$0.ag;
   }

   @Override
   public boolean bO() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      brh $$1 = $$0.a();
      brh $$2 = this.u();
      bsa $$3 = $$2 instanceof bsa ? (bsa)$$2 : null;
      boolean $$4 = $$1.a(this.dO().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bsa $$5) {
            $$5.b(new bqt(bqv.y, 200), (brh)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(etl $$0) {
      super.a($$0);
      ((aqh)this.dN()).a(kx.w, this.ds(), this.du(), this.dy(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avc.wA, 1.0F, 1.0F);
   }

   private void r() {
      this.am();
      this.dN().a(dva.o, this.dl(), dva.a.a(this));
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      this.r();
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (!this.dN().B) {
         this.a(avc.wB, 1.0F, 1.0F);
         ((aqh)this.dN()).a(kx.f, this.ds(), this.du(), this.dy(), 15, 0.2, 0.2, 0.2, 0.0);
         this.r();
      }

      return true;
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.o($$1, $$2, $$3);
   }
}
