import com.mojang.serialization.MapCodec;

public class dkd extends dij {
   public static final MapCodec<dkd> a = b(dkd::new);
   private static final xl b = xl.c("container.crafting");

   @Override
   public MapCodec<? extends dkd> a() {
      return a;
   }

   protected dkd(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.an);
      }

      return bsh.a;
   }

   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new csl($$2x, $$3, csf.a($$1, $$2)), b);
   }
}
