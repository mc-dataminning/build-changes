import com.mojang.serialization.MapCodec;

public class dpn extends djn {
   public static final MapCodec<dpn> a = b(dpn::new);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return 15;
   }
}
