import com.mojang.serialization.MapCodec;

public class dnz extends dod {
   public static final MapCodec<dnz> a = b(dnz::new);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return false;
   }

   @Override
   protected int f(dtc $$0, dbg $$1, ir $$2) {
      return $$1.Q();
   }
}
