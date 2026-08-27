import com.mojang.serialization.MapCodec;

public abstract class dar extends dby {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final est h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final est b = esq.a(
      esq.b(), esq.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ese.e
   );
   protected final ji.a c;

   @Override
   protected abstract MapCodec<? extends dar> a();

   public dar(doy.d $$0, ji.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(doz $$0) {
      return 0.0;
   }

   protected boolean a(doz $$0, ib $$1, bpv $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      ji $$7 = this.c.b().get($$0.f());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2) {
      return h;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   public abstract boolean d(doz var1);

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      ib $$4 = dhp.a((cyx)$$1, $$2);
      if ($$4 != null) {
         ekr $$5 = dhp.a($$1, $$4);
         if ($$5 != ekt.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ekr $$0) {
      return false;
   }

   protected void a(doz $$0, cyx $$1, ib $$2, ekr $$3) {
   }
}
