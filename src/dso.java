import com.mojang.serialization.MapCodec;

public class dso extends dmm {
   public static final MapCodec<dso> a = b(dso::new);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(ean.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return 15;
   }
}
