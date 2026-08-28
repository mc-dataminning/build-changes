import com.mojang.serialization.MapCodec;

public abstract class dps extends dpq implements dmd {
   public static final eaz e = eap.aA;
   public static final int f = 25;
   private final double c;

   protected dps(dzy.d $$0, ja $$1, ffc $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.B.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dps> a();

   @Override
   public dzz b(azv $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(dzz $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iu $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected dzz a(dzz $$0, azv $$1) {
      return $$0.a(e);
   }

   public dzz p(dzz $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dzz $$0) {
      return $$0.c(e) == 25;
   }

   protected dzz a(dzz $$0, dzz $$1) {
      return $$1;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == this.a.g() && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      iu $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azv var1);

   protected abstract boolean h(dzz var1);

   @Override
   protected dps c() {
      return this;
   }
}
