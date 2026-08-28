import com.mojang.serialization.MapCodec;

public class dqz extends dlf {
   public static final MapCodec<dqz> c = b(dqz::new);

   @Override
   public MapCodec<dqz> a() {
      return c;
   }

   public dqz(ean.d $$0) {
      super($$0, kc.e);
   }

   @Override
   protected double b(eao $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(eao $$0) {
      return true;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
         $$3.aC();
      }
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return 3;
   }
}
