import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ctg extends ctd {
   private static final double a = 0.15;
   @Nullable
   private bxe b;
   @Nullable
   private jc c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public ctg(bxn<? extends ctg> $$0, dkj $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public ctg(dkj $$0, byf $$1, bxe $$2, jc.a $$3) {
      this(bxn.be, $$0);
      this.c($$1);
      fgc $$4 = $$1.cR().f();
      this.b($$4.d, $$4.e, $$4.f, this.dL(), this.dN());
      this.b = $$2;
      this.c = jc.b;
      this.a($$3);
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", ka.a, this.b.cG());
      }

      $$0.b("Dir", jc.k, this.c);
      $$0.a("Steps", this.d);
      $$0.a("TXD", this.e);
      $$0.a("TYD", this.f);
      $$0.a("TZD", this.g);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.d = $$0.b("Steps", 0);
      this.e = $$0.b("TXD", 0.0);
      this.f = $$0.b("TYD", 0.0);
      this.g = $$0.b("TZD", 0.0);
      this.c = $$0.<jc>a("Dir", jc.k).orElse(null);
      this.h = $$0.<UUID>a("Target", ka.a).orElse(null);
   }

   @Override
   protected void a(aky.a $$0) {
   }

   @Nullable
   private jc f() {
      return this.c;
   }

   private void a(@Nullable jc $$0) {
      this.c = $$0;
   }

   private void a(@Nullable jc.a $$0) {
      double $$1 = 0.5;
      iw $$2;
      if (this.b == null) {
         $$2 = this.dv().e();
      } else {
         $$1 = (double)this.b.dr() * 0.5;
         $$2 = iw.a(this.b.dA(), this.b.dC() + $$1, this.b.dG());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jc $$7 = null;
      if (!$$2.a(this.dt(), 2.0)) {
         iw $$8 = this.dv();
         List<jc> $$9 = Lists.newArrayList();
         if ($$0 != jc.a.a) {
            if ($$8.u() < $$2.u() && this.dV().v($$8.i())) {
               $$9.add(jc.f);
            } else if ($$8.u() > $$2.u() && this.dV().v($$8.h())) {
               $$9.add(jc.e);
            }
         }

         if ($$0 != jc.a.b) {
            if ($$8.v() < $$2.v() && this.dV().v($$8.d())) {
               $$9.add(jc.b);
            } else if ($$8.v() > $$2.v() && this.dV().v($$8.e())) {
               $$9.add(jc.a);
            }
         }

         if ($$0 != jc.a.c) {
            if ($$8.w() < $$2.w() && this.dV().v($$8.g())) {
               $$9.add(jc.d);
            } else if ($$8.w() > $$2.w() && this.dV().v($$8.f())) {
               $$9.add(jc.c);
            }
         }

         $$7 = jc.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dV().v($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jc.b(this.ae);
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
      if (this.dV().an() == buz.a) {
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
      fga $$0 = null;
      if (!this.dV().C) {
         if (this.b == null && this.h != null) {
            this.b = ((asb)this.dV()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bJ() || this.b instanceof csi && this.b.aa_()) {
            this.be();
         } else {
            this.e = azz.a(this.e * 1.025, -1.0, 1.0);
            this.f = azz.a(this.f * 1.025, -1.0, 1.0);
            this.g = azz.a(this.g * 1.025, -1.0, 1.0);
            fgc $$1 = this.dy();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = ctf.a(this, this::b);
      }

      fgc $$2 = this.dy();
      this.b(this.dt().e($$2));
      this.aI();
      if (this.as != null && this.as.e()) {
         this.bV();
      }

      if ($$0 != null && this.bJ() && $$0.d() != fga.a.a) {
         this.b($$0);
      }

      ctf.a(this, 0.5F);
      if (this.dV().C) {
         this.dV().a(lz.t, this.dA() - $$2.d, this.dC() - $$2.e + 0.15, this.dG() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dQ()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            iw $$3 = this.dv();
            jc.a $$4 = this.c.o();
            if (this.dV().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               iw $$5 = this.b.dv();
               if ($$4 == jc.a.a && $$3.u() == $$5.u() || $$4 == jc.a.c && $$3.w() == $$5.w() || $$4 == jc.a.b && $$3.v() == $$5.v()) {
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
   protected boolean b(bxe $$0) {
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
   protected void a(ffz $$0) {
      super.a($$0);
      bxe $$1 = $$0.a();
      bxe $$2 = this.q();
      byf $$3 = $$2 instanceof byf ? (byf)$$2 : null;
      bvt $$4 = this.dW().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dV() instanceof asb $$6) {
            dgz.a($$6, $$1, $$4);
         }

         if ($$1 instanceof byf $$7) {
            $$7.b(new bwi(bwk.y, 200), (bxe)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(ffy $$0) {
      super.a($$0);
      ((asb)this.dV()).a(lz.w, this.dA(), this.dC(), this.dG(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awy.xE, 1.0F, 1.0F);
   }

   private void g() {
      this.aq();
      this.dV().a(egq.o, this.dt(), egq.a.a(this));
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean b(bvt $$0) {
      return true;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      this.a(awy.xF, 1.0F, 1.0F);
      $$0.a(lz.f, this.dA(), this.dC(), this.dG(), 15, 0.2, 0.2, 0.2, 0.0);
      this.g();
      return true;
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();
      this.n($$1, $$2, $$3);
   }
}
