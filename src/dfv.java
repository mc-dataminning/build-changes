import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfv extends dfc {
   public static final MapCodec<dfv> a = b(dfv::new);
   private static final xe b = xe.c("container.cartography_table");

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   protected dfv(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.ax);
         return bqa.b;
      }
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new cpm($$2x, $$3, cpr.a($$1, $$2)), b);
   }
}
