import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends die {
   public static final MapCodec<dix> a = b(dix::new);
   private static final xi b = xi.c("container.cartography_table");

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   protected dix(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awv.aw);
      }

      return bsd.a;
   }

   @Nullable
   @Override
   protected bsf b(dvj $$0, dfb $$1, jh $$2) {
      return new bsl(($$2x, $$3, $$4) -> new crw($$2x, $$3, csb.a($$1, $$2)), b);
   }
}
