import com.mojang.serialization.MapCodec;

public class dlr extends dgc {
   public static final MapCodec<dlr> d = b(dlr::new);

   @Override
   public MapCodec<dlr> a() {
      return d;
   }

   public dlr(dun.d $$0) {
      super($$0, kk.e);
   }

   @Override
   protected double b(duo $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(duo $$0) {
      return true;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aD();
      }
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return 3;
   }
}
