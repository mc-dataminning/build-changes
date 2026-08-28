import com.mojang.serialization.MapCodec;

public class djp extends dea {
   public static final MapCodec<djp> d = b(djp::new);

   @Override
   public MapCodec<djp> a() {
      return d;
   }

   public djp(dsj.d $$0) {
      super($$0, kg.e);
   }

   @Override
   protected double b(dsk $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsk $$0) {
      return true;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
      }
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return 3;
   }
}
