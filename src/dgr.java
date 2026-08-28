import com.mojang.serialization.MapCodec;

public class dgr extends dex {
   public static final MapCodec<dgr> a = b(dgr::new);
   private static final xo b = xo.c("container.crafting");

   @Override
   public MapCodec<? extends dgr> a() {
      return a;
   }

   protected dgr(drz.d $$0) {
      super($$0);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.an);
         return bqs.c;
      }
   }

   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return new brc(($$2x, $$3, $$4) -> new cqj($$2x, $$3, cqd.a($$1, $$2)), b);
   }
}
