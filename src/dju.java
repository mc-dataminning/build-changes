import com.mojang.serialization.MapCodec;

public class dju extends dfb {
   public static final MapCodec<dju> a = b(dju::new);
   private static final int b = 20;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(dsd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, bsw $$3) {
      if (!$$3.bW() && $$3 instanceof btr && !dad.j((btr)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dfh.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dfd.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
