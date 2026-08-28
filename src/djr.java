import com.mojang.serialization.MapCodec;

public class djr extends dey {
   public static final MapCodec<djr> a = b(djr::new);
   private static final int b = 20;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(dsa.d $$0) {
      super($$0);
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bst $$3) {
      if (!$$3.bW() && $$3 instanceof bto && !daa.j((bto)$$3)) {
         $$3.a($$0.aj().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
