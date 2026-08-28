import com.mojang.serialization.MapCodec;

public class dmd extends dgr {
   public static final MapCodec<dmd> b = b(dmd::new);
   private static final xo c = xo.c("container.upgrade");

   @Override
   public MapCodec<dmd> a() {
      return b;
   }

   protected dmd(drz.d $$0) {
      super($$0);
   }

   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      return new brc(($$2x, $$3, $$4) -> new crq($$2x, $$3, cqd.a($$1, $$2)), c);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.aF);
         return bqs.c;
      }
   }
}
