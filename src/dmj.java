import com.mojang.serialization.MapCodec;

public class dmj extends dex {
   public static final MapCodec<dmj> a = b(dmj::new);
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      return ewf.b();
   }

   @Override
   protected ewi c(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.b();
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

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected float d(dsa $$0, dbc $$1, iz $$2) {
      return 0.2F;
   }
}
