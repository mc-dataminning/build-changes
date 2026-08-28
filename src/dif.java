import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends dhm {
   public static final MapCodec<dif> a = b(dif::new);
   private static final xe b = xe.c("container.cartography_table");

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   protected dif(dur.d $$0) {
      super($$0);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awq.aw);
      }

      return brs.a;
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return new bsa(($$2x, $$3, $$4) -> new crh($$2x, $$3, crm.a($$1, $$2)), b);
   }
}
