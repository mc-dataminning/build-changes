import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends dij {
   public static final MapCodec<djc> a = b(djc::new);
   private static final xl b = xl.c("container.cartography_table");

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awy.aw);
      }

      return bsh.a;
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return new bsp(($$2x, $$3, $$4) -> new csa($$2x, $$3, csf.a($$1, $$2)), b);
   }
}
