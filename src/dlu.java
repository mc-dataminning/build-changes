import com.mojang.serialization.MapCodec;

public class dlu extends dfy {
   public static final MapCodec<dlu> a = b(dlu::new);

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return 15;
   }
}
