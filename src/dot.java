import com.mojang.serialization.MapCodec;

public class dot extends drj {
   public static final MapCodec<dot> a = b(dot::new);

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   public dot(dwx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lt.ab, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
