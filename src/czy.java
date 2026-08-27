import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czy extends czf {
   public static final MapCodec<czy> a = b(czy::new);
   private static final vs b = vs.c("container.cartography_table");

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   protected czy(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.aw);
         return bml.b;
      }
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new cla($$2x, $$3, clf.a($$1, $$2)), b);
   }
}
