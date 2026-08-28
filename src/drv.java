import com.mojang.serialization.MapCodec;

public class drv extends dmh {
   public static final MapCodec<drv> b = b(drv::new);
   private static final xv c = xv.c("container.upgrade");

   @Override
   public MapCodec<drv> a() {
      return b;
   }

   protected drv(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new cvc($$2x, $$3, ctp.a($$1, $$2)), c);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aF);
      }

      return btj.a;
   }
}
