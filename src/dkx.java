import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends dkd {
   public static final MapCodec<dkx> a = b(dkx::new);
   private static final xk b = xk.c("container.cartography_table");

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.aw);
      }

      return bta.a;
   }

   @Nullable
   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new ctb($$2x, $$3, ctg.a($$1, $$2)), b);
   }
}
