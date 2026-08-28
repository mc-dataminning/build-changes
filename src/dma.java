import com.mojang.serialization.MapCodec;

public class dma extends dgo {
   public static final MapCodec<dma> b = b(dma::new);
   private static final xl c = xl.c("container.upgrade");

   @Override
   public MapCodec<dma> a() {
      return b;
   }

   protected dma(drw.d $$0) {
      super($$0);
   }

   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new crn($$2x, $$3, cqa.a($$1, $$2)), c);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.aF);
         return bqp.c;
      }
   }
}
