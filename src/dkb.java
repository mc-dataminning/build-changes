import com.mojang.serialization.MapCodec;

public class dkb extends dfi {
   public static final MapCodec<dkb> a = b(dkb::new);
   private static final int b = 20;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dsk.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, bsh $$3) {
      if (!$$3.bY() && $$3 instanceof btc) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dfo.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && $$2.a(dfk.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
