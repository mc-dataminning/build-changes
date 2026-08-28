import com.mojang.serialization.MapCodec;

public abstract class dlm extends dlk implements dib {
   public static final dwd e = dvt.ax;
   public static final int f = 25;
   private final double c;

   protected dlm(dvc.d $$0, jl $$1, fab $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dlm> a();

   @Override
   public dvd a(dew $$0) {
      return this.m().b(e, Integer.valueOf($$0.E_().a(25)));
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jg $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dvd a(dvd $$0, azr $$1) {
      return $$0.a(e);
   }

   public dvd p(dvd $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dvd $$0) {
      return $$0.c(e) == 25;
   }

   protected dvd a(dvd $$0, dvd $$1) {
      return $$1;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      jg $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azr var1);

   protected abstract boolean h(dvd var1);

   @Override
   protected dlm c() {
      return this;
   }
}
