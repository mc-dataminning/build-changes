import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpt extends cpq {
   private static final double a = 0.15;
   @Nullable
   private bul b;
   @Nullable
   private jn c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public cpt(bus<? extends cpt> $$0, dgi $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public cpt(dgi $$0, bvh $$1, bul $$2, jn.a $$3) {
      this(bus.bc, $$0);
      this.c($$1);
      fba $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dL(), this.dN());
      this.b = $$2;
      this.c = jn.b;
      this.a($$3);
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected void b(tq $$0) {
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
   protected void a(tq $$0) {
      super.a($$0);
      this.d = $$0.h("Steps");
      this.e = $$0.k("TXD");
      this.f = $$0.k("TYD");
      this.g = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.c = jn.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.h = $$0.a("Target");
      }
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Nullable
   private jn l() {
      return this.c;
   }

   private void a(@Nullable jn $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jn.a $$0) {
      double $$1 = 0.5;
      ji $$2;
      if (this.b == null) {
         $$2 = this.dv().e();
      } else {
         $$1 = (double)this.b.dr() * 0.5;
         $$2 = ji.a(this.b.dA(), this.b.dC() + $$1, this.b.dG());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jn $$7 = null;
      if (!$$2.a(this.dt(), 2.0)) {
         ji $$8 = this.dv();
         List<jn> $$9 = Lists.newArrayList();
         if ($$0 != jn.a.a) {
            if ($$8.u() < $$2.u() && this.dV().u($$8.i())) {
               $$9.add(jn.f);
            } else if ($$8.u() > $$2.u() && this.dV().u($$8.h())) {
               $$9.add(jn.e);
            }
         }

         if ($$0 != jn.a.b) {
            if ($$8.v() < $$2.v() && this.dV().u($$8.d())) {
               $$9.add(jn.b);
            } else if ($$8.v() > $$2.v() && this.dV().u($$8.e())) {
               $$9.add(jn.a);
            }
         }

         if ($$0 != jn.a.c) {
            if ($$8.w() < $$2.w() && this.dV().u($$8.g())) {
               $$9.add(jn.d);
            } else if ($$8.w() > $$2.w() && this.dV().u($$8.f())) {
               $$9.add(jn.c);
            }
         }

         $$7 = jn.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dV().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jn.b(this.ae);
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
      if (this.dV().am() == bsh.a) {
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
      fay $$0 = null;
      if (!this.dV().C) {
         if (this.b == null && this.h != null) {
            this.b = ((ard)this.dV()).a(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bL() || this.b instanceof cox && this.b.Z_()) {
            this.bf();
         } else {
            this.e = ayz.a(this.e * 1.025, -1.0, 1.0);
            this.f = ayz.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayz.a(this.g * 1.025, -1.0, 1.0);
            fba $$1 = this.dy();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = cps.a(this, this::b);
      }

      fba $$2 = this.dy();
      this.b(this.dt().e($$2));
      this.aK();
      if (this.as != null && this.as.e()) {
         this.bW();
      }

      if ($$0 != null && this.bL() && $$0.d() != fay.a.a) {
         this.b($$0);
      }

      cps.a(this, 0.5F);
      if (this.dV().C) {
         this.dV().a(lt.t, this.dA() - $$2.d, this.dC() - $$2.e + 0.15, this.dG() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dQ()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            ji $$3 = this.dv();
            jn.a $$4 = this.c.o();
            if (this.dV().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               ji $$5 = this.b.dv();
               if ($$4 == jn.a.a && $$3.u() == $$5.u() || $$4 == jn.a.c && $$3.w() == $$5.w() || $$4 == jn.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(bul $$0) {
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
   public float by() {
      return 1.0F;
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      bul $$1 = $$0.a();
      bul $$2 = this.p();
      bvh $$3 = $$2 instanceof bvh ? (bvh)$$2 : null;
      btb $$4 = this.dW().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dV() instanceof ard $$6) {
            ddb.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bvh $$7) {
            $$7.b(new btq(bts.y, 200), (bul)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      ((ard)this.dV()).a(lt.w, this.dA(), this.dC(), this.dG(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awa.xo, 1.0F, 1.0F);
   }

   private void m() {
      this.at();
      this.dV().a(ebt.o, this.dt(), ebt.a.a(this));
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      this.m();
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public boolean b(btb $$0) {
      return true;
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      this.a(awa.xp, 1.0F, 1.0F);
      $$0.a(lt.f, this.dA(), this.dC(), this.dG(), 15, 0.2, 0.2, 0.2, 0.0);
      this.m();
      return true;
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
