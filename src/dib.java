import com.mojang.serialization.MapCodec;

public class dib extends dch {
   public static final MapCodec<dib> a = b(dib::new);

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return 15;
   }
}
