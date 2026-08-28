import com.mojang.serialization.MapCodec;

public class dxi extends dne {
   public static final MapCodec<dxi> a = b(dxi::new);

   @Override
   public MapCodec<dxi> a() {
      return a;
   }

   public dxi(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      ffs $$5 = new ffs(0.25, 0.05F, 0.25);
      if ($$3 instanceof bxw $$6 && $$6.b(bwb.K)) {
         $$5 = new ffs(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$5);
   }
}
