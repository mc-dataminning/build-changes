import com.mojang.serialization.MapCodec;

public class djg extends ddr {
   public static final MapCodec<djg> d = b(djg::new);

   @Override
   public MapCodec<djg> a() {
      return d;
   }

   public djg(dsa.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(dsb $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsb $$0) {
      return true;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return 3;
   }
}
