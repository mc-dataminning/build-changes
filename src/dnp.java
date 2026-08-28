import com.mojang.serialization.MapCodec;

public class dnp extends dnt {
   public static final MapCodec<dnp> a = b(dnp::new);

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return false;
   }

   @Override
   protected int g(dsk $$0, dbl $$1, ja $$2) {
      return $$1.Q();
   }
}
