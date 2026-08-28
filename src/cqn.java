import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class cqn extends cqk {
   private static final double a = 0.15;
   @Nullable
   private bva b;
   @Nullable
   private jn c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public cqn(bvi<? extends cqn> $$0, dgz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public cqn(dgz $$0, bvy $$1, bva $$2, jn.a $$3) {
      this(bvi.bc, $$0);
      this.c($$1);
      fbx $$4 = $$1.cQ().f();
      this.b($$4.d, $$4.e, $$4.f, this.dK(), this.dM());
      this.b = $$2;
      this.c = jn.b;
      this.a($$3);
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", this.b.cF());
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
   private jn f() {
      return this.c;
   }

   private void a(@Nullable jn $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jn.a $$0) {
      double $$1 = 0.5;
      ji $$2;
      if (this.b == null) {
         $$2 = this.du().e();
      } else {
         $$1 = (double)this.b.dq() * 0.5;
         $$2 = ji.a(this.b.dz(), this.b.dB() + $$1, this.b.dF());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jn $$7 = null;
      if (!$$2.a(this.ds(), 2.0)) {
         ji $$8 = this.du();
         List<jn> $$9 = Lists.newArrayList();
         if ($$0 != jn.a.a) {
            if ($$8.u() < $$2.u() && this.dU().u($$8.i())) {
               $$9.add(jn.f);
            } else if ($$8.u() > $$2.u() && this.dU().u($$8.h())) {
               $$9.add(jn.e);
            }
         }

         if ($$0 != jn.a.b) {
            if ($$8.v() < $$2.v() && this.dU().u($$8.d())) {
               $$9.add(jn.b);
            } else if ($$8.v() > $$2.v() && this.dU().u($$8.e())) {
               $$9.add(jn.a);
            }
         }

         if ($$0 != jn.a.c) {
            if ($$8.w() < $$2.w() && this.dU().u($$8.g())) {
               $$9.add(jn.d);
            } else if ($$8.w() > $$2.w() && this.dU().u($$8.f())) {
               $$9.add(jn.c);
            }
         }

         $$7 = jn.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dU().u($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jn.b(this.ae);
            }
         } else {
            $$7 = $$9.get(this.ae.a($$9.size()));
         }

         $$4 = this.dz() + (double)$$7.j();
         $$5 = this.dB() + (double)$$7.k();
         $$6 = this.dF() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dz();
      double $$12 = $$5 - this.dB();
      double $$13 = $$6 - this.dF();
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
   public void dG() {
      if (this.dU().an() == bsv.a) {
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
      fbv $$0 = null;
      if (!this.dU().C) {
         if (this.b == null && this.h != null) {
            this.b = ((ard)this.dU()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bJ() || this.b instanceof cpr && this.b.U_()) {
            this.bf();
         } else {
            this.e = ayz.a(this.e * 1.025, -1.0, 1.0);
            this.f = ayz.a(this.f * 1.025, -1.0, 1.0);
            this.g = ayz.a(this.g * 1.025, -1.0, 1.0);
            fbx $$1 = this.dx();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = cqm.a(this, this::b);
      }

      fbx $$2 = this.dx();
      this.b(this.ds().e($$2));
      this.aK();
      if (this.as != null && this.as.e()) {
         this.bV();
      }

      if ($$0 != null && this.bJ() && $$0.d() != fbv.a.a) {
         this.b($$0);
      }

      cqm.a(this, 0.5F);
      if (this.dU().C) {
         this.dU().a(lt.t, this.dz() - $$2.d, this.dB() - $$2.e + 0.15, this.dF() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dP()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            ji $$3 = this.du();
            jn.a $$4 = this.c.o();
            if (this.dU().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               ji $$5 = this.b.du();
               if ($$4 == jn.a.a && $$3.u() == $$5.u() || $$4 == jn.a.c && $$3.w() == $$5.w() || $$4 == jn.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean aL() {
      return !this.dP();
   }

   @Override
   protected boolean b(bva $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      bva $$1 = $$0.a();
      bva $$2 = this.q();
      bvy $$3 = $$2 instanceof bvy ? (bvy)$$2 : null;
      btp $$4 = this.dV().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dU() instanceof ard $$6) {
            ddt.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bvy $$7) {
            $$7.b(new bue(bug.y, 200), (bva)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      super.a($$0);
      ((ard)this.dU()).a(lt.w, this.dz(), this.dB(), this.dF(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awa.xy, 1.0F, 1.0F);
   }

   private void g() {
      this.at();
      this.dU().a(ecp.o, this.ds(), ecp.a.a(this));
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean b(btp $$0) {
      return true;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      this.a(awa.xz, 1.0F, 1.0F);
      $$0.a(lt.f, this.dz(), this.dB(), this.dF(), 15, 0.2, 0.2, 0.2, 0.0);
      this.g();
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
