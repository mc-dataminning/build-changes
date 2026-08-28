import com.mojang.serialization.MapCodec;

public class dkg extends der {
   public static final MapCodec<dkg> d = b(dkg::new);

   @Override
   public MapCodec<dkg> a() {
      return d;
   }

   public dkg(dtb.d $$0) {
      super($$0, kj.e);
   }

   @Override
   protected double b(dtc $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
      }
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return 3;
   }
}
