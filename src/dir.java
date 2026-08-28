import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends dhy {
   public static final MapCodec<dir> a = b(dir::new);
   private static final xh b = xh.c("container.cartography_table");

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aw);
      }

      return bry.a;
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      return new bsg(($$2x, $$3, $$4) -> new crr($$2x, $$3, crw.a($$1, $$2)), b);
   }
}
