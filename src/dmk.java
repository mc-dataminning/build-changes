import com.mojang.serialization.MapCodec;

public class dmk extends dey {
   public static final MapCodec<dmk> a = b(dmk::new);
   protected static final ewj b = dey.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return ewg.b();
   }

   @Override
   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.b();
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      dfe.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && $$2.a(dfa.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return 0.2F;
   }
}
