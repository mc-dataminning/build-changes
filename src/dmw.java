import com.mojang.serialization.MapCodec;

public class dmw extends dmy {
   public static final MapCodec<dmw> a = b(dmw::new);
   private static final fgw c = dno.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dmw> a() {
      return a;
   }

   protected dmw(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }
}
