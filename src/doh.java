import com.mojang.serialization.MapCodec;

public class doh extends dmm {
   public static final MapCodec<doh> a = b(doh::new);
   private static final wy b = wy.c("container.crafting");

   @Override
   public MapCodec<? extends doh> a() {
      return a;
   }

   protected doh(ean.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.an);
      }

      return bug.a;
   }

   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvv($$2x, $$3, cvp.a($$1, $$2)), b);
   }
}
