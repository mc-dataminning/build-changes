import com.mojang.serialization.MapCodec;

public class dsb extends dmh {
   public static final MapCodec<dsb> c = b(dsb::new);

   @Override
   public MapCodec<dsb> a() {
      return c;
   }

   public dsb(ebp.d $$0) {
      super($$0, kd.e);
   }

   @Override
   protected double b(ebq $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(ebq $$0) {
      return true;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
         $$3.aC();
      }
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return 3;
   }
}
