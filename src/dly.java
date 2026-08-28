import com.mojang.serialization.MapCodec;

public class dly extends dke {
   public static final MapCodec<dly> a = b(dly::new);
   private static final wp b = wp.c("container.crafting");

   @Override
   public MapCodec<? extends dly> a() {
      return a;
   }

   protected dly(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.an);
      }

      return bsy.a;
   }

   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new ctp($$2x, $$3, ctj.a($$1, $$2)), b);
   }
}
