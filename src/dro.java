import com.mojang.serialization.MapCodec;

public class dro extends dlx {
   public static final MapCodec<dro> b = b(dro::new);
   private static final xk c = xk.c("container.upgrade");

   @Override
   public MapCodec<dro> a() {
      return b;
   }

   protected dro(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new cut($$2x, $$3, ctg.a($$1, $$2)), c);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.aF);
      }

      return bta.a;
   }
}
