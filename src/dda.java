import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dda extends dch {
   public static final MapCodec<dda> a = b(dda::new);
   private static final wi b = wi.c("container.cartography_table");

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   protected dda(dph.d $$0) {
      super($$0);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.aw);
         return bof.b;
      }
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new cnc($$2x, $$3, cnh.a($$1, $$2)), b);
   }
}
