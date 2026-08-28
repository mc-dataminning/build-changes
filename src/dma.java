import com.mojang.serialization.MapCodec;

public class dma extends dov {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(i, jm.a.b));
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ai().l());
   }
}
