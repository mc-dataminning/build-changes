import com.mojang.serialization.MapCodec;

public class dhl extends daa {
   public static final MapCodec<dhl> a = b(dhl::new);
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhl(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      return eqh.b();
   }

   @Override
   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.b();
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dag.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dac.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return 0.2F;
   }
}
