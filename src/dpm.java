import com.mojang.serialization.MapCodec;

public class dpm extends djm {
   public static final MapCodec<dpm> a = b(dpm::new);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dww.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return 15;
   }
}
