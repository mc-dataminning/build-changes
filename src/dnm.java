import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends dmr {
   public static final MapCodec<dnm> a = b(dnm::new);
   private static final wy b = wy.c("container.cartography_table");

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(eas.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aw);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvn($$2x, $$3, cvs.a($$1, $$2)), b);
   }
}
