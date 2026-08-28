import com.mojang.serialization.MapCodec;

public class dmh extends dkm {
   public static final MapCodec<dmh> a = b(dmh::new);
   private static final xv b = xv.c("container.crafting");

   @Override
   public MapCodec<? extends dmh> a() {
      return a;
   }

   protected dmh(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.an);
      }

      return btj.a;
   }

   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new ctv($$2x, $$3, ctp.a($$1, $$2)), b);
   }
}
