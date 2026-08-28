import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dkl {
   public static final MapCodec<dlf> a = b(dlf::new);
   private static final xv b = xv.c("container.cartography_table");

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aw);
      }

      return bti.a;
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new ctj($$2x, $$3, cto.a($$1, $$2)), b);
   }
}
