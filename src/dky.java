import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dke {
   public static final MapCodec<dky> a = b(dky::new);
   private static final wp b = wp.c("container.cartography_table");

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aw);
      }

      return bsy.a;
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new cte($$2x, $$3, ctj.a($$1, $$2)), b);
   }
}
