import com.mojang.serialization.MapCodec;

public class dai extends cyo {
   public static final MapCodec<dai> a = b(dai::new);
   private static final vq b = vq.c("container.crafting");

   @Override
   public MapCodec<? extends dai> a() {
      return a;
   }

   protected dai(dle.d $$0) {
      super($$0);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.an);
         return blu.b;
      }
   }

   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new cks($$2x, $$3, ckm.a($$1, $$2)), b);
   }
}
