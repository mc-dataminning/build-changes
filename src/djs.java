import com.mojang.serialization.MapCodec;

public class djs extends dez {
   public static final MapCodec<djs> a = b(djs::new);
   private static final int b = 20;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dsb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, bsu $$3) {
      if (!$$3.bW() && $$3 instanceof btp && !dab.j((btp)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      dff.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dfb.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
