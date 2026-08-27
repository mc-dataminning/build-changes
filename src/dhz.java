import com.mojang.serialization.MapCodec;

public class dhz extends cyo {
   public static final MapCodec<dhz> a = b(dhz::new);

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      $$3.a($$0, new ens(0.25, 0.05F, 0.25));
   }
}
