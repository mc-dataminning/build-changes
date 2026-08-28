import com.mojang.serialization.MapCodec;

public class dox extends dob {
   public static final MapCodec<dox> a = b(dox::new);
   private static final xk b = xk.c("container.loom");

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axf.ax);
      }

      return bta.a;
   }

   @Override
   protected btc b(dxo $$0, dgz $$1, jh $$2) {
      return new bti(($$2x, $$3, $$4) -> new cua($$2x, $$3, ctg.a($$1, $$2)), b);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF);
   }
}
