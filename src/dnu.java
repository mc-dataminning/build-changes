import com.mojang.serialization.MapCodec;

public class dnu extends did {
   public static final MapCodec<dnu> d = b(dnu::new);

   @Override
   public MapCodec<dnu> a() {
      return d;
   }

   public dnu(dwu.d $$0) {
      super($$0, ko.e);
   }

   @Override
   protected double b(dwv $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dwv $$0) {
      return true;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return 3;
   }
}
