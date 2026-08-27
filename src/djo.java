import com.mojang.serialization.MapCodec;

public class djo extends ddu {
   public static final MapCodec<djo> d = b(djo::new);

   @Override
   public MapCodec<djo> a() {
      return d;
   }

   public djo(dtb.d $$0) {
      super($$0, jx.e);
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
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return 3;
   }
}
