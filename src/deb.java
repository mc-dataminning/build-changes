import com.mojang.serialization.MapCodec;

public abstract class deb extends dfi {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final exa h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final exa b = ewx.a(
      ewx.b(), ewx.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ewl.e
   );
   protected final kg.a c;

   @Override
   protected abstract MapCodec<? extends deb> a();

   public deb(dsk.d $$0, kg.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsl $$0) {
      return 0.0;
   }

   protected boolean a(dsl $$0, ja $$1, bsh $$2) {
      return $$2.dy() < (double)$$1.v() + this.b($$0) && $$2.cM().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      kg $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   public abstract boolean d(dsl var1);

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      ja $$4 = dla.a((dcg)$$1, $$2);
      if ($$4 != null) {
         eoi $$5 = dla.a($$1, $$4);
         if ($$5 != eok.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eoi $$0) {
      return false;
   }

   protected void a(dsl $$0, dcg $$1, ja $$2, eoi $$3) {
   }
}
