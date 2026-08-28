import com.mojang.serialization.MapCodec;

public class dls extends dfw {
   public static final MapCodec<dls> a = b(dls::new);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return 15;
   }
}
