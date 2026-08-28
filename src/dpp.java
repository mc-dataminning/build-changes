import com.mojang.serialization.MapCodec;

public class dpp extends dhr {
   public static final MapCodec<dpp> c = b(dpp::new);

   @Override
   public MapCodec<dpp> a() {
      return c;
   }

   public dpp(dvi.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return this.a($$0, $$3, $$4) ? this.m() : dig.a.m();
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dvj $$0) {
      return $$0.a(axa.aU);
   }

   @Override
   protected boolean g(dvj $$0) {
      return true;
   }
}
