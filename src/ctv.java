import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctv extends ctc {
   public static final MapCodec<ctv> a = b(ctv::new);
   private static final tl b = tl.c("container.cartography_table");

   @Override
   public MapCodec<ctv> a() {
      return a;
   }

   protected ctv(dfc.d $$0) {
      super($$0);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.aw);
         return bhe.b;
      }
   }

   @Nullable
   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cex($$2x, $$3, cfc.a($$1, $$2)), b);
   }
}
