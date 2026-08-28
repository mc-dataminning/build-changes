import com.mojang.serialization.MapCodec;

public class dmg extends dkl {
   public static final MapCodec<dmg> a = b(dmg::new);
   private static final xv b = xv.c("container.crafting");

   @Override
   public MapCodec<? extends dmg> a() {
      return a;
   }

   protected dmg(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.an);
      }

      return bti.a;
   }

   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new ctu($$2x, $$3, cto.a($$1, $$2)), b);
   }
}
