import com.mojang.serialization.MapCodec;

public abstract class cyt extends daa {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eqk h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eqk b = eqh.a(
      eqh.b(), eqh.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), epv.e
   );
   protected final ji.a c;

   @Override
   protected abstract MapCodec<? extends cyt> a();

   public cyt(dmy.d $$0, ji.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dmz $$0) {
      return 0.0;
   }

   protected boolean a(dmz $$0, ib $$1, bow $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      ji $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2) {
      return h;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   public abstract boolean d(dmz var1);

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      ib $$4 = dfr.a((cwz)$$1, $$2);
      if ($$4 != null) {
         eim $$5 = dfr.a($$1, $$4);
         if ($$5 != eio.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eim $$0) {
      return false;
   }

   protected void a(dmz $$0, cwz $$1, ib $$2, eim $$3) {
   }
}
