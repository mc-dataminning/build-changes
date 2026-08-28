import com.mojang.serialization.MapCodec;

public class doq extends drg {
   public static final MapCodec<doq> a = b(doq::new);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(dwu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lt.ab, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
