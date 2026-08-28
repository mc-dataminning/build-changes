import com.mojang.serialization.MapCodec;

public class dlx extends dkd {
   public static final MapCodec<dlx> a = b(dlx::new);
   private static final xk b = xk.c("container.crafting");

   @Override
   public MapCodec<? extends dlx> a() {
      return a;
   }

   protected dlx(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.an);
      }

      return bta.a;
   }

   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new ctm($$2x, $$3, ctg.a($$1, $$2)), b);
   }
}
