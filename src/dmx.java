import com.mojang.serialization.MapCodec;

public class dmx extends dmy {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final fgw c = dno.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   protected dmx(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }
}
