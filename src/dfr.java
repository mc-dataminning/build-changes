import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfr extends dey {
   public static final MapCodec<dfr> a = b(dfr::new);
   private static final xo b = xo.c("container.cartography_table");

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.aw);
         return bqt.c;
      }
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new cpz($$2x, $$3, cqe.a($$1, $$2)), b);
   }
}
