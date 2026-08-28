import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class crv extends crs {
   private static final double a = 0.15;
   @Nullable
   private bwd b;
   @Nullable
   private ja c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public crv(bwm<? extends crv> $$0, div $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public crv(div $$0, bxc $$1, bwd $$2, ja.a $$3) {
      this(bwm.bd, $$0);
      this.c($$1);
      fei $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dL(), this.dN());
      this.b = $$2;
      this.c = ja.b;
      this.a($$3);
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", this.b.cG());
      }

      if (this.c != null) {
         $$0.a("Dir", this.c.d());
      }

      $$0.a("Steps", this.d);
      $$0.a("TXD", this.e);
      $$0.a("TYD", this.f);
      $$0.a("TZD", this.g);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.d = $$0.h("Steps");
      this.e = $$0.k("TXD");
      this.f = $$0.k("TYD");
      this.g = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.c = ja.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.h = $$0.a("Target");
      }
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Nullable
   private ja f() {
      return this.c;
   }

   private void a(@Nullable ja $$0) {
      this.c = $$0;
   }

   private void a(@Nullable ja.a $$0) {
      double $$1 = 0.5;
      iu $$2;
      if (this.b == null) {
         $$2 = this.dv().e();
      } else {
         $$1 = (double)this.b.dr() * 0.5;
         $$2 = iu.a(this.b.dA(), this.b.dC() + $$1, this.b.dG());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ja $$7 = null;
      if (!$$2.a(this.dt(), 2.0)) {
         iu $$8 = this.dv();
         List<ja> $$9 = Lists.newArrayList();
         if ($$0 != ja.a.a) {
            if ($$8.u() < $$2.u() && this.dV().v($$8.i())) {
               $$9.add(ja.f);
            } else if ($$8.u() > $$2.u() && this.dV().v($$8.h())) {
               $$9.add(ja.e);
            }
         }

         if ($$0 != ja.a.b) {
            if ($$8.v() < $$2.v() && this.dV().v($$8.d())) {
               $$9.add(ja.b);
            } else if ($$8.v() > $$2.v() && this.dV().v($$8.e())) {
               $$9.add(ja.a);
            }
         }

         if ($$0 != ja.a.c) {
            if ($$8.w() < $$2.w() && this.dV().v($$8.g())) {
               $$9.add(ja.d);
            } else if ($$8.w() > $$2.w() && this.dV().v($$8.f())) {
               $$9.add(ja.c);
            }
         }

         $$7 = ja.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dV().v($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ja.b(this.ae);
            }
         } else {
            $$7 = $$9.get(this.ae.a($$9.size()));
         }

         $$4 = this.dA() + (double)$$7.j();
         $$5 = this.dC() + (double)$$7.k();
         $$6 = this.dG() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dA();
      double $$12 = $$5 - this.dC();
      double $$13 = $$6 - this.dG();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.e = 0.0;
         this.f = 0.0;
         this.g = 0.0;
      } else {
         this.e = $$11 / $$14 * 0.15;
         this.f = $$12 / $$14 * 0.15;
         this.g = $$13 / $$14 * 0.15;
      }

      this.ar = true;
      this.d = 10 + this.ae.a(5) * 10;
   }

   @Override
   public void dH() {
      if (this.dV().an() == bty.a) {
         this.at();
      }
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      super.h();
      feg $$0 = null;
      if (!this.dV().C) {
         if (this.b == null && this.h != null) {
            this.b = ((arq)this.dV()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bK() || this.b instanceof cqy && this.b.U_()) {
            this.bf();
         } else {
            this.e = azm.a(this.e * 1.025, -1.0, 1.0);
            this.f = azm.a(this.f * 1.025, -1.0, 1.0);
            this.g = azm.a(this.g * 1.025, -1.0, 1.0);
            fei $$1 = this.dy();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = cru.a(this, this::b);
      }

      fei $$2 = this.dy();
      this.b(this.dt().e($$2));
      this.aK();
      if (this.as != null && this.as.e()) {
         this.bW();
      }

      if ($$0 != null && this.bK() && $$0.d() != feg.a.a) {
         this.b($$0);
      }

      cru.a(this, 0.5F);
      if (this.dV().C) {
         this.dV().a(lx.t, this.dA() - $$2.d, this.dC() - $$2.e + 0.15, this.dG() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dQ()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            iu $$3 = this.dv();
            ja.a $$4 = this.c.o();
            if (this.dV().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               iu $$5 = this.b.dv();
               if ($$4 == ja.a.a && $$3.u() == $$5.u() || $$4 == ja.a.c && $$3.w() == $$5.w() || $$4 == ja.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean aL() {
      return !this.dQ();
   }

   @Override
   protected boolean b(bwd $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      bwd $$1 = $$0.a();
      bwd $$2 = this.q();
      bxc $$3 = $$2 instanceof bxc ? (bxc)$$2 : null;
      bus $$4 = this.dW().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dV() instanceof arq $$6) {
            dfn.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bxc $$7) {
            $$7.b(new bvh(bvj.y, 200), (bwd)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fee $$0) {
      super.a($$0);
      ((arq)this.dV()).a(lx.w, this.dA(), this.dC(), this.dG(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awn.xB, 1.0F, 1.0F);
   }

   private void g() {
      this.at();
      this.dV().a(eez.o, this.dt(), eez.a.a(this));
   }

   @Override
   protected void a(feg $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public boolean b(bus $$0) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      this.a(awn.xC, 1.0F, 1.0F);
      $$0.a(lx.f, this.dA(), this.dC(), this.dG(), 15, 0.2, 0.2, 0.2, 0.0);
      this.g();
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
