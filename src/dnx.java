import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends dnc {
   public static final MapCodec<dnx> a = b(dnx::new);
   private static final xa b = xa.c("container.cartography_table");

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.aw);
      }

      return bur.a;
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cvy($$2x, $$3, cwd.a($$1, $$2)), b);
   }
}
