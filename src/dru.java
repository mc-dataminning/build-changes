import com.mojang.serialization.MapCodec;

public class dru extends dmg {
   public static final MapCodec<dru> b = b(dru::new);
   private static final xv c = xv.c("container.upgrade");

   @Override
   public MapCodec<dru> a() {
      return b;
   }

   protected dru(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new cvb($$2x, $$3, cto.a($$1, $$2)), c);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aF);
      }

      return bti.a;
   }
}
