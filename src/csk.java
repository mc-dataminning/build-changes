import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class csk extends csh {
   private static final double a = 0.15;
   @Nullable
   private bwi b;
   @Nullable
   private jb c;
   private int d;
   private double e;
   private double f;
   private double g;
   @Nullable
   private UUID h;

   public csk(bwr<? extends csk> $$0, djm $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   public csk(djm $$0, bxj $$1, bwi $$2, jb.a $$3) {
      this(bwr.bd, $$0);
      this.c($$1);
      ffc $$4 = $$1.cQ().f();
      this.b($$4.d, $$4.e, $$4.f, this.dK(), this.dM());
      this.b = $$2;
      this.c = jb.b;
      this.a($$3);
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("Target", jz.a, this.b.cF());
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
      this.d = $$0.f("Steps");
      this.e = $$0.i("TXD");
      this.f = $$0.i("TYD");
      this.g = $$0.i("TZD");
      this.c = $$0.<jb>a("Dir", jb.k).orElse(null);
      this.h = $$0.<UUID>a("Target", jz.a).orElse(null);
   }

   @Override
   protected void a(akn.a $$0) {
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
         $$2 = this.du().e();
      } else {
         $$1 = (double)this.b.dq() * 0.5;
         $$2 = iv.a(this.b.dz(), this.b.dB() + $$1, this.b.dF());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      jb $$7 = null;
      if (!$$2.a(this.ds(), 2.0)) {
         iv $$8 = this.du();
         List<jb> $$9 = Lists.newArrayList();
         if ($$0 != jb.a.a) {
            if ($$8.u() < $$2.u() && this.dU().v($$8.i())) {
               $$9.add(jb.f);
            } else if ($$8.u() > $$2.u() && this.dU().v($$8.h())) {
               $$9.add(jb.e);
            }
         }

         if ($$0 != jb.a.b) {
            if ($$8.v() < $$2.v() && this.dU().v($$8.d())) {
               $$9.add(jb.b);
            } else if ($$8.v() > $$2.v() && this.dU().v($$8.e())) {
               $$9.add(jb.a);
            }
         }

         if ($$0 != jb.a.c) {
            if ($$8.w() < $$2.w() && this.dU().v($$8.g())) {
               $$9.add(jb.d);
            } else if ($$8.w() > $$2.w() && this.dU().v($$8.f())) {
               $$9.add(jb.c);
            }
         }

         $$7 = jb.b(this.ae);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dU().v($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = jb.b(this.ae);
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
      if (this.dU().an() == bud.a) {
         this.aq();
      }
   }

   @Override
   protected double bb() {
      return 0.04;
   }

   @Override
   public void h() {
      super.h();
      ffa $$0 = null;
      if (!this.dU().C) {
         if (this.b == null && this.h != null) {
            this.b = ((arq)this.dU()).b(this.h);
            if (this.b == null) {
               this.h = null;
            }
         }

         if (this.b == null || !this.b.bI() || this.b instanceof crm && this.b.V_()) {
            this.bd();
         } else {
            this.e = azm.a(this.e * 1.025, -1.0, 1.0);
            this.f = azm.a(this.f * 1.025, -1.0, 1.0);
            this.g = azm.a(this.g * 1.025, -1.0, 1.0);
            ffc $$1 = this.dx();
            this.i($$1.b((this.e - $$1.d) * 0.2, (this.f - $$1.e) * 0.2, (this.g - $$1.f) * 0.2));
         }

         $$0 = csj.a(this, this::b);
      }

      ffc $$2 = this.dx();
      this.b(this.ds().e($$2));
      this.aI();
      if (this.as != null && this.as.e()) {
         this.bU();
      }

      if ($$0 != null && this.bI() && $$0.d() != ffa.a.a) {
         this.b($$0);
      }

      csj.a(this, 0.5F);
      if (this.dU().C) {
         this.dU().a(ly.t, this.dz() - $$2.d, this.dB() - $$2.e + 0.15, this.dF() - $$2.f, 0.0, 0.0, 0.0);
      } else if (this.b != null && !this.b.dP()) {
         if (this.d > 0) {
            this.d--;
            if (this.d == 0) {
               this.a(this.c == null ? null : this.c.o());
            }
         }

         if (this.c != null) {
            iv $$3 = this.du();
            jb.a $$4 = this.c.o();
            if (this.dU().a($$3.a(this.c), this)) {
               this.a($$4);
            } else {
               iv $$5 = this.b.du();
               if ($$4 == jb.a.a && $$3.u() == $$5.u() || $$4 == jb.a.c && $$3.w() == $$5.w() || $$4 == jb.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean aJ() {
      return !this.dP();
   }

   @Override
   protected boolean b(bwi $$0) {
      return super.b($$0) && !$$0.ad;
   }

   @Override
   public boolean bW() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      bwi $$1 = $$0.a();
      bwi $$2 = this.q();
      bxj $$3 = $$2 instanceof bxj ? (bxj)$$2 : null;
      bux $$4 = this.dV().a(this, $$3);
      boolean $$5 = $$1.b($$4, 4.0F);
      if ($$5) {
         if (this.dU() instanceof arq $$6) {
            dgc.a($$6, $$1, $$4);
         }

         if ($$1 instanceof bxj $$7) {
            $$7.b(new bvm(bvo.y, 200), (bwi)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(fey $$0) {
      super.a($$0);
      ((arq)this.dU()).a(ly.w, this.dz(), this.dB(), this.dF(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(awn.xE, 1.0F, 1.0F);
   }

   private void g() {
      this.aq();
      this.dU().a(eft.o, this.ds(), eft.a.a(this));
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      this.g();
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean b(bux $$0) {
      return true;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      this.a(awn.xF, 1.0F, 1.0F);
      $$0.a(ly.f, this.dz(), this.dB(), this.dF(), 15, 0.2, 0.2, 0.2, 0.0);
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
