import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erf extends ert {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erf::new));

   private erf(List<etr> $$0) {
      super($$0);
   }

   @Override
   public erv<erf> b() {
      return erw.z;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      Float $$2 = $$1.c(etd.j);
      if ($$2 != null) {
         azg $$3 = $$1.b();
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

   public static ert.a<?> c() {
      return a(erf::new);
   }
}
