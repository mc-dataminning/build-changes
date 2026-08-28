import com.mojang.serialization.MapCodec;

public class dka extends dfh {
   public static final MapCodec<dka> a = b(dka::new);
   private static final int b = 20;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dsj.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      if (!$$3.bX() && $$3 instanceof btb) {
         $$3.a($$0.aj().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dfn.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && $$2.a(dfj.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
