import com.mojang.serialization.MapCodec;

public class drz extends dnw {
   public static final MapCodec<drz> a = b(drz::new);
   private static final ffc[] b = dma.a(7, $$0 -> dma.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected diu d() {
      return czc.vl;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b[this.h($$0)];
   }
}
