import javax.annotation.Nullable;

public class csl extends crk {
   private static final akj<Byte> e = akn.a(csl.class, akl.a);
   private static final akj<Boolean> f = akn.a(csl.class, akl.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public csl(bwo<? extends csl> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csl(dja $$0, bxe $$1, czd $$2) {
      super(bwo.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public csl(dja $$0, double $$1, double $$2, double $$3, czd $$4) {
      super(bwo.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bwf $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dV() instanceof arq $$2 && this.b == crk.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof crc) && this.dt().f($$0.bE()) < (double)$$0.dq() + 1.0) {
               this.at();
               return;
            }

            this.q(true);
            feq $$3 = $$0.bE().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awn.AG, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwf $$0 = this.q();
      return $$0 == null || !$$0.bK() ? false : !($$0 instanceof arr) || !$$0.V_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fen c(feq $$0, feq $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fen $$0) {
      bwf $$1 = $$0.a();
      float $$2 = 8.0F;
      bwf $$3 = this.q();
      buu $$4 = this.dW().a(this, (bwf)($$3 == null ? this : $$3));
      if (this.dV() instanceof arq $$5) {
         $$2 = dfs.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bwo.N) {
            return;
         }

         if (this.dV() instanceof arq $$6) {
            dfs.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bxe $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cry.b, $$1, this.q(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awn.AE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arq $$0, fem $$1, czd $$2) {
      feq $$3 = $$1.b().a($$1.g());
      dfs.a($$0, $$2, this.q() instanceof bxe $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public czd dZ() {
      return this.s();
   }

   @Override
   protected boolean a(crc $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gj().g(this.n());
   }

   @Override
   protected czd o() {
      return new czd(czh.xd);
   }

   @Override
   protected awm j() {
      return awn.AF;
   }

   @Override
   public void a_(crc $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(czd $$0) {
      return this.dV() instanceof arq $$1 ? (byte)azm.a(dfs.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != crk.a.b || $$0 <= 0) {
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
