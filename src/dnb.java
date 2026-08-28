import com.mojang.serialization.MapCodec;

public abstract class dnb extends dmz implements djo {
   public static final dxv e = dxm.aA;
   public static final int f = 25;
   private final double c;

   protected dnb(dwv.d $$0, jn $$1, fbt $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.F.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dnb> a();

   @Override
   public dww b(azh $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dww $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         ji $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dww a(dww $$0, azh $$1) {
      return $$0.a(e);
   }

   public dww p(dww $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dww $$0) {
      return $$0.c(e) == 25;
   }

   protected dww a(dww $$0, dww $$1) {
      return $$1;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      ji $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azh var1);

   protected abstract boolean h(dww var1);

   @Override
   protected dnb c() {
      return this;
   }
}
