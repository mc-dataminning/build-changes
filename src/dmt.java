import com.mojang.serialization.MapCodec;

public class dmt extends dnw {
   public static final MapCodec<dmt> a = b(dmt::new);
   private static final ffc[] b = dma.a(7, $$0 -> dma.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected diu d() {
      return czc.vk;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return b[this.h($$0)];
   }
}
