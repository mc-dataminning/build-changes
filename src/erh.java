import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erh extends erv {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erh::new));

   private erh(List<ett> $$0) {
      super($$0);
   }

   @Override
   public erx<erh> b() {
      return ery.z;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      Float $$2 = $$1.c(etf.j);
      if ($$2 != null) {
         azh $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.I();
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

   public static erv.a<?> c() {
      return a(erh::new);
   }
}
