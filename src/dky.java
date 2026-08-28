import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dke {
   public static final MapCodec<dky> a = b(dky::new);
   private static final xv b = xv.c("container.cartography_table");

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aw);
      }

      return bte.a;
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new ctf($$2x, $$3, ctk.a($$1, $$2)), b);
   }
}
