import com.mojang.serialization.MapCodec;

public class djf extends ddq {
   public static final MapCodec<djf> d = b(djf::new);

   @Override
   public MapCodec<djf> a() {
      return d;
   }

   public djf(drz.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(dsa $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsa $$0) {
      return true;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return 3;
   }
}
