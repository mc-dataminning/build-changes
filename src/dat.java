import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dat extends daa {
   public static final MapCodec<dat> a = b(dat::new);
   private static final vu b = vu.c("container.cartography_table");

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   protected dat(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.aw);
         return bnc.b;
      }
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new clu($$2x, $$3, clz.a($$1, $$2)), b);
   }
}
