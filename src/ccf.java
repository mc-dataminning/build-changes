import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccf extends ccd {
   private static final double b = 0.15;
   @Nullable
   private big c;
   @Nullable
   private hb d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public ccf(bik<? extends ccf> $$0, cpk $$1) {
      super($$0, $$1);
      this.af = true;
   }

   public ccf(cpk $$0, biw $$1, big $$2, hb.a $$3) {
      this(bik.aH, $$0);
      this.b($$1);
      gv $$4 = $$1.dk();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dA(), this.dC());
      this.c = $$2;
      this.d = hb.b;
      this.a($$3);
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   protected void b(qs $$0) {
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
   protected void a(qs $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = hb.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a_() {
   }

   @Nullable
   private hb j() {
      return this.d;
   }

   private void a(@Nullable hb $$0) {
      this.d = $$0;
   }

   private void a(@Nullable hb.a $$0) {
      double $$1 = 0.5;
      gv $$2;
      if (this.c == null) {
         $$2 = this.dk().d();
      } else {
         $$1 = (double)this.c.dg() * 0.5;
         $$2 = gv.a(this.c.dp(), this.c.dr() + $$1, this.c.dv());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      hb $$7 = null;
      if (!$$2.a(this.di(), 2.0)) {
         gv $$8 = this.dk();
         List<hb> $$9 = Lists.newArrayList();
         if ($$0 != hb.a.a) {
            if ($$8.u() < $$2.u() && this.dK().t($$8.h())) {
               $$9.add(hb.f);
            } else if ($$8.u() > $$2.u() && this.dK().t($$8.g())) {
               $$9.add(hb.e);
            }
         }

         if ($$0 != hb.a.b) {
            if ($$8.v() < $$2.v() && this.dK().t($$8.c())) {
               $$9.add(hb.b);
            } else if ($$8.v() > $$2.v() && this.dK().t($$8.d())) {
               $$9.add(hb.a);
            }
         }

         if ($$0 != hb.a.c) {
            if ($$8.w() < $$2.w() && this.dK().t($$8.f())) {
               $$9.add(hb.d);
            } else if ($$8.w() > $$2.w() && this.dK().t($$8.e())) {
               $$9.add(hb.c);
            }
         }

         $$7 = hb.b(this.ag);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dK().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = hb.b(this.ag);
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
      if (this.dK().ai() == bgl.a) {
         this.ak();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aki)this.dK()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bv() || this.c instanceof cbl && this.c.G_()) {
            if (!this.aT()) {
               this.f(this.dn().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = aro.a(this.f * 1.025, -1.0, 1.0);
            this.g = aro.a(this.g * 1.025, -1.0, 1.0);
            this.h = aro.a(this.h * 1.025, -1.0, 1.0);
            ehf $$0 = this.dn();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         ehd $$1 = cce.a(this, this::a);
         if ($$1.c() != ehd.a.a) {
            this.a($$1);
         }
      }

      this.aO();
      ehf $$2 = this.dn();
      this.e(this.dp() + $$2.c, this.dr() + $$2.d, this.dv() + $$2.e);
      cce.a(this, 0.5F);
      if (this.dK().B) {
         this.dK().a(iw.u, this.dp() - $$2.c, this.dr() - $$2.d + 0.15, this.dv() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dF()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gv $$3 = this.dk();
            hb.a $$4 = this.d.o();
            if (this.dK().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gv $$5 = this.c.dk();
               if ($$4 == hb.a.a && $$3.u() == $$5.u() || $$4 == hb.a.c && $$3.w() == $$5.w() || $$4 == hb.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(big $$0) {
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
   protected void a(ehc $$0) {
      super.a($$0);
      big $$1 = $$0.a();
      big $$2 = this.v();
      biw $$3 = $$2 instanceof biw ? (biw)$$2 : null;
      boolean $$4 = $$1.a(this.dL().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof biw $$5) {
            $$5.b(new bht(bhv.y, 200), (big)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      ((aki)this.dK()).a(iw.x, this.dp(), this.dr(), this.dv(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(aou.vb, 1.0F, 1.0F);
   }

   private void m() {
      this.ak();
      this.dK().a(dji.o, this.di(), dji.a.a(this));
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      this.m();
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (!this.dK().B) {
         this.a(aou.vc, 1.0F, 1.0F);
         ((aki)this.dK()).a(iw.g, this.dp(), this.dr(), this.dv(), 15, 0.2, 0.2, 0.2, 0.0);
         this.m();
      }

      return true;
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      this.o($$1, $$2, $$3);
   }
}
