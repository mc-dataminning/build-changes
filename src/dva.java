import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dva extends dlr implements dpr {
   public static final MapCodec<dva> a = b(dva::new);

   public dva(eag.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dza($$0, $$1);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.c_($$2) instanceof dza $$6) {
         if (!$$3.gG()) {
            return bud.e;
         } else {
            if ($$3.cU().C) {
               $$3.a($$6);
            }

            return bud.a;
         }
      } else {
         return bud.e;
      }
   }

   @Override
   protected MapCodec<dva> a() {
      return a;
   }
}
