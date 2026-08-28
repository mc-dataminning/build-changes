import com.mojang.serialization.MapCodec;

public class dqc extends dsr {
   public static final MapCodec<dqc> a = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dyl.d $$0) {
      super($$0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lv.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
