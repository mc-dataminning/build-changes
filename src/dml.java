import com.mojang.serialization.MapCodec;

public class dml extends dgx {
   public static final MapCodec<dml> d = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return d;
   }

   public dml(dvi.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dvj $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dvj $$0) {
      return true;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aG();
      }
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return 3;
   }
}
