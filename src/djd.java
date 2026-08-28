import com.mojang.serialization.MapCodec;

public class djd extends dhj {
   public static final MapCodec<djd> a = b(djd::new);
   private static final xd b = xd.c("container.crafting");

   @Override
   public MapCodec<? extends djd> a() {
      return a;
   }

   protected djd(dun.d $$0) {
      super($$0);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.an);
      }

      return brp.a;
   }

   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new crp($$2x, $$3, crj.a($$1, $$2)), b);
   }
}
