import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmo extends dlu {
   public static final MapCodec<dmo> a = b(dmo::new);
   private static final ww b = ww.c("container.cartography_table");

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.aw);
      }

      return bty.a;
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cus($$2x, $$3, cux.a($$1, $$2)), b);
   }
}
