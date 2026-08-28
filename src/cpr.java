import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpr extends cpo {
   private static final double a = 0.15;
   @Nullable
   private buj b;
   @Nullable
   private jn c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public cpr(buq<? extends cpr> $$0, dgg $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public cpr(dgg $$0, bvf $$1, buj $$2, jn.a $$3) {
      this(buq.bc, $$0);
      this.c($$1);
      fay $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dM(), this.dO());
      this.b = $$2;
      this.c = jn.b;
      this.a($$3);
   }

   @Override
   public awa dn() {
      return awa.f;
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
   protected void a(akb.a $$0) {
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
         $$2 = this.dw().e();
      } else {
         $$1 = (double)this.b.ds() * 0.5;
         $$2 = ji.a(this.b.dB(), this.b.dD() + $$1, this.b.dH());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jn $$7 = null;
      if (!$$2.a(this.du(), 2.0)) {
         ji $$8 = this.dw();
         List<jn> $$9 = Lists.newArrayList();
         if ($$0 != jn.a.a) {
            if ($$8.u() < $$2.u() && this.dW().u($$8.i())) {
               $$9.add(jn.f);
            } else if ($$8.u() > $$2.u() && this.dW().u($$8.h())) {
               $$9.add(jn.e);
            }
         }

         if ($$0 != jn.a.b) {
            if ($$8.v() < $$2.v() && this.dW().u($$8.d())) {
               $$9.add(jn.b);
            } else if ($$8.v() > $$2.v() && this.dW().u($$8.e())) {
               $$9.add(jn.a);
            }
         }

         if ($$0 != jn.a.c) {
            if ($$8.w() < $$2.w() && this.dW().u($$8.g())) {
               $$9.add(jn.d);
            } else if ($$8.w() > $$2.w() && this.dW().u($$8.f())) {
               $$9.add(jn.c);
            }
         }

         $$7 = jn.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dW().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jn.b(this.ae);
            }
         } else {
            $$7 = $$9.get(this.ae.a($$9.size()));
         }

         $$4 = this.dB() + (double)$$7.j();
         $$5 = this.dD() + (double)$$7.k();
         $$6 = this.dH() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dB();
      double $$12 = $$5 - this.dD();
      double $$13 = $$6 - this.dH();
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
   public void dI() {
      if (this.dW().am() == bsf.a) {
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
      faw $$0 = null;
      if (!this.dW().C) {
         if (this.b == null && this.h != null) {
            this.b = ((arc)this.dW()).a(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bL() || this.b instanceof cov && this.b.Z_()) {
            this.bf();
         } else {
            this.e = ayy.a(this.e * 1.025, -1.0, 1.0);
            this.f = ayy.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayy.a(this.g * 1.025, -1.0, 1.0);
            fay $$1 = this.dz();
            this.h($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = cpq.a(this, this::b);
      }

      fay $$2 = this.dz();
      this.b(this.du().e($$2));
      this.aK();
      if (this.as != null && this.as.e()) {
         this.bW();
      }

      if ($$0 != null && this.bL() && $$0.d() != faw.a.a) {
         this.b($$0);
      }

      cpq.a(this, 0.5F);
      if (this.dW().C) {
         this.dW().a(lt.t, this.dB() - $$2.d, this.dD() - $$2.e + 0.15, this.dH() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dR()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            ji $$3 = this.dw();
            jn.a $$4 = this.c.o();
            if (this.dW().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               ji $$5 = this.b.dw();
               if ($$4 == jn.a.a && $$3.u() == $$5.u() || $$4 == jn.a.c && $$3.w() == $$5.w() || $$4 == jn.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean b(buj $$0) {
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
   protected void a(fav $$0) {
      super.a($$0);
      buj $$1 = $$0.a();
      buj $$2 = this.p();
      bvf $$3 = $$2 instanceof bvf ? (bvf)$$2 : null;
      bsz $$4 = this.dX().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dW() instanceof arc $$6) {
            dcz.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bvf $$7) {
            $$7.b(new bto(btq.y, 200), (buj)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fau $$0) {
      super.a($$0);
      ((arc)this.dW()).a(lt.w, this.dB(), this.dD(), this.dH(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(avz.xo, 1.0F, 1.0F);
   }

   private void m() {
      this.at();
      this.dW().a(ebr.o, this.du(), ebr.a.a(this));
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      this.m();
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public boolean b(bsz $$0) {
      return true;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      this.a(avz.xp, 1.0F, 1.0F);
      $$0.a(lt.f, this.dB(), this.dD(), this.dH(), 15, 0.2, 0.2, 0.2, 0.0);
      this.m();
      return true;
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
