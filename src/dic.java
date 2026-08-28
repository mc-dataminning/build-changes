import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dhj {
   public static final MapCodec<dic> a = b(dic::new);
   private static final xd b = xd.c("container.cartography_table");

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dun.d $$0) {
      super($$0);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.aw);
      }

      return brp.a;
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new cre($$2x, $$3, crj.a($$1, $$2)), b);
   }
}
