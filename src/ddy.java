import com.mojang.serialization.MapCodec;

public abstract class ddy extends dff {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ews h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ews b = ewp.a(
      ewp.b(), ewp.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ewd.e
   );
   protected final kg.a c;

   @Override
   protected abstract MapCodec<? extends ddy> a();

   public ddy(dsg.d $$0, kg.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsh $$0) {
      return 0.0;
   }

   protected boolean a(dsh $$0, ja $$1, bsd $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      kg $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   public abstract boolean d(dsh var1);

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      ja $$4 = dkx.a((dcd)$$1, $$2);
      if ($$4 != null) {
         eoa $$5 = dkx.a($$1, $$4);
         if ($$5 != eoc.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eoa $$0) {
      return false;
   }

   protected void a(dsh $$0, dcd $$1, ja $$2, eoa $$3) {
   }
}
