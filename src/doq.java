import com.mojang.serialization.MapCodec;

public class doq extends djd {
   public static final MapCodec<doq> b = b(doq::new);
   private static final xd c = xd.c("container.upgrade");

   @Override
   public MapCodec<doq> a() {
      return b;
   }

   protected doq(dun.d $$0) {
      super($$0);
   }

   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new csw($$2x, $$3, crj.a($$1, $$2)), c);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.aF);
      }

      return brp.a;
   }
}
