import com.mojang.serialization.MapCodec;

public abstract class dob extends dnz implements dko {
   public static final dyt e = dyk.ay;
   public static final int f = 25;
   private final double c;

   protected dob(dxt.d $$0, jm $$1, fcr $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dob> a();

   @Override
   public dxu b(bam $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dxu $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jh $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dxu a(dxu $$0, bam $$1) {
      return $$0.a(e);
   }

   public dxu p(dxu $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dxu $$0) {
      return $$0.c(e) == 25;
   }

   protected dxu a(dxu $$0, dxu $$1) {
      return $$1;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      jh $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(bam var1);

   protected abstract boolean h(dxu var1);

   @Override
   protected dob c() {
      return this;
   }
}
