import com.mojang.serialization.MapCodec;

public class djn extends ddy {
   public static final MapCodec<djn> d = b(djn::new);

   @Override
   public MapCodec<djn> a() {
      return d;
   }

   public djn(dsg.d $$0) {
      super($$0, kg.e);
   }

   @Override
   protected double b(dsh $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dsh $$0) {
      return true;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return 3;
   }
}
