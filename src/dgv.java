import com.mojang.serialization.MapCodec;

public class dgv extends dfb {
   public static final MapCodec<dgv> a = b(dgv::new);
   private static final xp b = xp.c("container.crafting");

   @Override
   public MapCodec<? extends dgv> a() {
      return a;
   }

   protected dgv(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.an);
         return bqw.c;
      }
   }

   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      return new brg(($$2x, $$3, $$4) -> new cqn($$2x, $$3, cqh.a($$1, $$2)), b);
   }
}
