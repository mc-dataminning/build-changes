import com.mojang.serialization.MapCodec;

public class djq extends dex {
   public static final MapCodec<djq> a = b(djq::new);
   private static final int b = 20;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(drz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, bss $$3) {
      if (!$$3.bW() && $$3 instanceof btn && !czz.j((btn)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      dfd.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dez.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
