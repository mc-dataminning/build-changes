import com.mojang.serialization.MapCodec;

public class dml extends dez {
   public static final MapCodec<dml> a = b(dml::new);
   protected static final ewk b = dez.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return ewh.b();
   }

   @Override
   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.b();
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

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected float d(dsc $$0, dbe $$1, iz $$2) {
      return 0.2F;
   }
}
