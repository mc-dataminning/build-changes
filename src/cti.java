import javax.annotation.Nullable;

public class cti extends csh {
   private static final akn<Byte> e = akr.a(cti.class, akp.a);
   private static final akn<Boolean> f = akr.a(cti.class, akp.k);
   private static final float g = 0.99F;
   private static final boolean h = false;
   private boolean i = false;
   public int d;

   public cti(bxe<? extends cti> $$0, djz $$1) {
      super($$0, $$1);
   }

   public cti(djz $$0, bxw $$1, daa $$2) {
      super(bxe.bA, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public cti(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.bA, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.i = true;
      }

      bwv $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.i || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dV() instanceof aru $$2 && this.b == csh.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.aq();
         } else {
            if (!($$0 instanceof crz) && this.dt().f($$0.bD()) < (double)$$0.dq() + 1.0) {
               this.aq();
               return;
            }

            this.q(true);
            ffs $$3 = $$0.bD().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awr.AG, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwv $$0 = this.q();
      return $$0 == null || !$$0.bJ() ? false : !($$0 instanceof arv) || !$$0.Z_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected ffp b(ffs $$0, ffs $$1) {
      return this.i ? null : super.b($$0, $$1);
   }

   @Override
   protected void a(ffp $$0) {
      bwv $$1 = $$0.a();
      float $$2 = 8.0F;
      bwv $$3 = this.q();
      bvk $$4 = this.dW().a(this, (bwv)($$3 == null ? this : $$3));
      if (this.dV() instanceof aru $$5) {
         $$2 = dgp.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.an() == bxe.O) {
            return;
         }

         if (this.dV() instanceof aru $$6) {
            dgp.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bxw $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(csv.b, $$1, this.q(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awr.AE, 1.0F, 1.0F);
   }

   @Override
   protected void a(aru $$0, ffo $$1, daa $$2) {
      ffs $$3 = $$1.b().a($$1.g());
      dgp.a($$0, $$2, this.q() instanceof bxw $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public daa dZ() {
      return this.s();
   }

   @Override
   protected boolean a(crz $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gj().g(this.n());
   }

   @Override
   protected daa o() {
      return new daa(dae.xd);
   }

   @Override
   protected awq j() {
      return awr.AF;
   }

   @Override
   public void a_(crz $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.i = $$0.b("DealtDamage", false);
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte b(daa $$0) {
      return this.dV() instanceof aru $$1 ? (byte)azq.a(dgp.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != csh.a.b || $$0 <= 0) {
         super.g();
      }
   }

   @Override
   protected float v() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
