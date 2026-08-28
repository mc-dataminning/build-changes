import com.mojang.serialization.MapCodec;

public class duc extends doh {
   public static final MapCodec<duc> b = b(duc::new);
   private static final wy c = wy.c("container.upgrade");

   @Override
   public MapCodec<duc> a() {
      return b;
   }

   protected duc(ean.d $$0) {
      super($$0);
   }

   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cxc($$2x, $$3, cvp.a($$1, $$2)), c);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aF);
      }

      return bug.a;
   }
}
