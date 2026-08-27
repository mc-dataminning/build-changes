import com.mojang.serialization.MapCodec;

public class dag extends cus {
   public static final MapCodec<dag> d = b(dag::new);

   @Override
   public MapCodec<dag> a() {
      return d;
   }

   public dag(dio.d $$0) {
      super($$0, jb.e);
   }

   @Override
   protected double b(dip $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dip $$0) {
      return true;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return 3;
   }
}
