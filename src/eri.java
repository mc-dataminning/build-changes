import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eri extends erw {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eri::new));

   private eri(List<etu> $$0) {
      super($$0);
   }

   @Override
   public ery<eri> b() {
      return erz.z;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      Float $$2 = $$1.c(etg.j);
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

   public static erw.a<?> c() {
      return a(eri::new);
   }
}
