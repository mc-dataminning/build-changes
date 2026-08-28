import com.mojang.serialization.MapCodec;

public class dmf extends dgr {
   public static final MapCodec<dmf> d = b(dmf::new);

   @Override
   public MapCodec<dmf> a() {
      return d;
   }

   public dmf(dvc.d $$0) {
      super($$0, km.e);
   }

   @Override
   protected double b(dvd $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dvd $$0) {
      return true;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aF();
      }
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return 3;
   }
}
