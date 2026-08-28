import com.mojang.serialization.MapCodec;

public class dmh extends dgv {
   public static final MapCodec<dmh> b = b(dmh::new);
   private static final xp c = xp.c("container.upgrade");

   @Override
   public MapCodec<dmh> a() {
      return b;
   }

   protected dmh(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new cru($$2x, $$3, cqh.a($$1, $$2)), c);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aF);
         return bqw.c;
      }
   }
}
