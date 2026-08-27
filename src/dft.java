import com.mojang.serialization.MapCodec;

public class dft extends dai {
   public static final MapCodec<dft> b = b(dft::new);
   private static final vq c = vq.c("container.upgrade");

   @Override
   public MapCodec<dft> a() {
      return b;
   }

   protected dft(dle.d $$0) {
      super($$0);
   }

   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new clx($$2x, $$3, ckm.a($$1, $$2)), c);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.aF);
         return blu.b;
      }
   }
}
