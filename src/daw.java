import com.mojang.serialization.MapCodec;

public class daw extends cvi {
   public static final MapCodec<daw> d = b(daw::new);

   @Override
   public MapCodec<daw> a() {
      return d;
   }

   public daw(djf.d $$0) {
      super($$0, jd.e);
   }

   @Override
   protected double b(djg $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(djg $$0) {
      return true;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return 3;
   }
}
