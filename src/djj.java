import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends diq {
   public static final MapCodec<djj> a = b(djj::new);
   private static final xj b = xj.c("container.cartography_table");

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awx.aw);
      }

      return bsk.a;
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      return new bss(($$2x, $$3, $$4) -> new csh($$2x, $$3, csm.a($$1, $$2)), b);
   }
}
