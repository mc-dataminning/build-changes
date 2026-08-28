import com.mojang.serialization.MapCodec;

public class dte extends dnc {
   public static final MapCodec<dte> a = b(dte::new);

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return 15;
   }
}
