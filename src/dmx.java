import com.mojang.serialization.MapCodec;

public class dmx extends dhj {
   public static final MapCodec<dmx> d = b(dmx::new);

   @Override
   public MapCodec<dmx> a() {
      return d;
   }

   public dmx(dvu.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dvv $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dvv $$0) {
      return true;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return 3;
   }
}
