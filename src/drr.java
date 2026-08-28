import com.mojang.serialization.MapCodec;

public class drr extends dlx {
   public static final MapCodec<drr> c = b(drr::new);

   @Override
   public MapCodec<drr> a() {
      return c;
   }

   public drr(ebf.d $$0) {
      super($$0, kd.e);
   }

   @Override
   protected double b(ebg $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(ebg $$0) {
      return true;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
         $$3.aC();
      }
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return 3;
   }
}
