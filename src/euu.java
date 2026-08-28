import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euu extends evj {
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, euu::new));

   private euu(List<exh> $$0) {
      super($$0);
   }

   @Override
   public evl<euu> b() {
      return evm.z;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      Float $$2 = $$1.c(ews.j);
      if ($$2 != null) {
         azr $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static evj.a<?> c() {
      return a(euu::new);
   }
}
