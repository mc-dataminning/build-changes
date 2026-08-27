import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ceh extends cem implements cej {
   private static final afo<clj> b = afr.a(ceh.class, afq.h);
   private static final afo<OptionalInt> c = afr.a(ceh.class, afq.u);
   private static final afo<Boolean> d = afr.a(ceh.class, afq.k);
   private int e;
   private int f;
   @Nullable
   private blg g;

   public ceh(bku<? extends ceh> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ceh(csa $$0, double $$1, double $$2, double $$3, clj $$4) {
      super(bku.M, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.an.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public ceh(csa $$0, @Nullable bkq $$1, double $$2, double $$3, double $$4, clj $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public ceh(csa $$0, clj $$1, blg $$2) {
      this($$0, $$2, $$2.ds(), $$2.du(), $$2.dy(), $$1);
      this.an.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public ceh(csa $$0, clj $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public ceh(csa $$0, clj $$1, bkq $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void b_() {
      this.an.a(b, clj.b);
      this.an.a(c, OptionalInt.empty());
      this.an.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.z();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.z();
   }

   @Override
   public void l() {
      super.l();
      if (this.z()) {
         if (this.g == null) {
            this.an.b(c).ifPresent($$0x -> {
               bkq $$1x = this.dN().a($$0x);
               if ($$1x instanceof blg) {
                  this.g = (blg)$$1x;
               }
            });
         }

         if (this.g != null) {
            eju $$4;
            if (this.g.fx()) {
               eju $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eju $$3 = this.g.dq();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(clm.um);
            } else {
               $$4 = eju.b;
            }

            this.a_(this.g.ds() + $$4.c, this.g.du() + $$4.d, this.g.dy() + $$4.e);
            this.g(this.g.dq());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dq().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eju $$7 = this.dq();
         this.a(blm.a, $$7);
         this.g($$7);
      }

      ejs $$8 = cen.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.ic, aqs.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dN().B && this.e % 2 < 2) {
         this.dN().a(js.A, this.ds(), this.du(), this.dy(), this.ag.k() * 0.05, -this.dq().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dN().B && this.e > this.f) {
         this.u();
      }
   }

   private void u() {
      this.dN().a(this, (byte)17);
      this.a(dls.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.u();
      }
   }

   @Override
   protected void a(ejq $$0) {
      ht $$1 = new ht($$0.a());
      this.dN().a_($$1).a(this.dN(), $$1, this);
      if (!this.dN().x_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      clj $$0 = this.an.b(b);
      rz $$1 = $$0.b() ? null : $$0.b("Fireworks");
      sf $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      clj $$1 = this.an.b(b);
      rz $$2 = $$1.b() ? null : $$1.b("Fireworks");
      sf $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dO().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         eju $$5 = this.dl();

         for (blg $$7 : this.dN().a(blg.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  eju $$10 = new eju($$7.ds(), $$7.e(0.5 * (double)$$9), $$7.dy());
                  ejs $$11 = this.dN().a(new crj($$5, $$10, crj.a.a, crj.b.a, this));
                  if ($$11.c() == ejs.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dO().a(this, this.w()), $$12);
               }
            }
         }
      }
   }

   private boolean z() {
      return this.an.b(c).isPresent();
   }

   @Override
   public boolean s() {
      return this.an.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dN().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dN().a(js.W, this.ds(), this.du(), this.dy(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            clj $$2 = this.an.b(b);
            rz $$3 = $$2.b() ? null : $$2.b("Fireworks");
            eju $$4 = this.dq();
            this.dN().a(this.ds(), this.du(), this.dy(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      clj $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new rz()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      clj $$1 = clj.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public clj q() {
      clj $$0 = this.an.b(b);
      return $$0.b() ? new clj(clm.um) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
