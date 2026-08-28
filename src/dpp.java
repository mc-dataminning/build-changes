import com.mojang.serialization.MapCodec;

public class dpp extends dkd {
   public static final MapCodec<dpp> b = b(dpp::new);
   private static final xl c = xl.c("container.upgrade");

   @Override
   public MapCodec<dpp> a() {
      return b;
   }

   protected dpp(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new cts($$2x, $$3, csf.a($$1, $$2)), c);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.aF);
      }

      return bsh.a;
   }
}
