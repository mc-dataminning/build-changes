import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class csv extends css {
   private static final double a = 0.15;
   @Nullable
   private bwt b;
   @Nullable
   private jb c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public csv(bxc<? extends csv> $$0, djx $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public csv(djx $$0, bxu $$1, bwt $$2, jb.a $$3) {
      this(bxc.be, $$0);
      this.c($$1);
      ffq $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dL(), this.dN());
      this.b = $$2;
      this.c = jb.b;
      this.a($$3);
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", jz.a, this.b.cG());
      }

      $$0.b("Dir", jb.k, this.c);
      $$0.a("Steps", this.d);
      $$0.a("TXD", this.e);
      $$0.a("TYD", this.f);
      $$0.a("TZD", this.g);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      this.d = $$0.b("Steps", 0);
      this.e = $$0.b("TXD", 0.0);
      this.f = $$0.b("TYD", 0.0);
      this.g = $$0.b("TZD", 0.0);
      this.c = $$0.<jb>a("Dir", jb.k).orElse(null);
      this.h = $$0.<UUID>a("Target", jz.a).orElse(null);
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Nullable
   private jb f() {
      return this.c;
   }

   private void a(@Nullable jb $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jb.a $$0) {
      double $$1 = 0.5;
      iv $$2;
      if (this.b == null) {
         $$2 = this.dv().e();
      } else {
         $$1 = (double)this.b.dr() * 0.5;
         $$2 = iv.a(this.b.dA(), this.b.dC() + $$1, this.b.dG());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jb $$7 = null;
      if (!$$2.a(this.dt(), 2.0)) {
         iv $$8 = this.dv();
         List<jb> $$9 = Lists.newArrayList();
         if ($$0 != jb.a.a) {
            if ($$8.u() < $$2.u() && this.dV().v($$8.i())) {
               $$9.add(jb.f);
            } else if ($$8.u() > $$2.u() && this.dV().v($$8.h())) {
               $$9.add(jb.e);
            }
         }

         if ($$0 != jb.a.b) {
            if ($$8.v() < $$2.v() && this.dV().v($$8.d())) {
               $$9.add(jb.b);
            } else if ($$8.v() > $$2.v() && this.dV().v($$8.e())) {
               $$9.add(jb.a);
            }
         }

         if ($$0 != jb.a.c) {
            if ($$8.w() < $$2.w() && this.dV().v($$8.g())) {
               $$9.add(jb.d);
            } else if ($$8.w() > $$2.w() && this.dV().v($$8.f())) {
               $$9.add(jb.c);
            }
         }

         $$7 = jb.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dV().v($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jb.b(this.ae);
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
      if (this.dV().an() == buo.a) {
         this.aq();
      }
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void h() {
      super.h();
      ffo $$0 = null;
      if (!this.dV().C) {
         if (this.b == null && this.h != null) {
            this.b = ((ars)this.dV()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bJ() || this.b instanceof crx && this.b.Z_()) {
            this.be();
         } else {
            this.e = azo.a(this.e * 1.025, -1.0, 1.0);
            this.f = azo.a(this.f * 1.025, -1.0, 1.0);
            this.g = azo.a(this.g * 1.025, -1.0, 1.0);
            ffq $$1 = this.dy();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = csu.a(this, this::b);
      }

      ffq $$2 = this.dy();
      this.b(this.dt().e($$2));
      this.aI();
      if (this.as != null && this.as.e()) {
         this.bV();
      }

      if ($$0 != null && this.bJ() && $$0.d() != ffo.a.a) {
         this.b($$0);
      }

      csu.a(this, 0.5F);
      if (this.dV().C) {
         this.dV().a(ly.t, this.dA() - $$2.d, this.dC() - $$2.e + 0.15, this.dG() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dQ()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            iv $$3 = this.dv();
            jb.a $$4 = this.c.o();
            if (this.dV().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               iv $$5 = this.b.dv();
               if ($$4 == jb.a.a && $$3.u() == $$5.u() || $$4 == jb.a.c && $$3.w() == $$5.w() || $$4 == jb.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean aK() {
      return !this.dQ();
   }

   @Override
   protected boolean b(bwt $$0) {
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
   protected void a(ffn $$0) {
      super.a($$0);
      bwt $$1 = $$0.a();
      bwt $$2 = this.q();
      bxu $$3 = $$2 instanceof bxu ? (bxu)$$2 : null;
      bvi $$4 = this.dW().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dV() instanceof ars $$6) {
            dgn.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bxu $$7) {
            $$7.b(new bvx(bvz.y, 200), (bwt)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ffm $$0) {
      super.a($$0);
      ((ars)this.dV()).a(ly.w, this.dA(), this.dC(), this.dG(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awp.xE, 1.0F, 1.0F);
   }

   private void g() {
      this.aq();
      this.dV().a(ege.o, this.dt(), ege.a.a(this));
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean b(bvi $$0) {
      return true;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      this.a(awp.xF, 1.0F, 1.0F);
      $$0.a(ly.f, this.dA(), this.dC(), this.dG(), 15, 0.2, 0.2, 0.2, 0.0);
      this.g();
      return true;
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
