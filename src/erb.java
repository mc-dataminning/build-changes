import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erb extends erp {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erb::new));

   private erb(List<etn> $$0) {
      super($$0);
   }

   @Override
   public err<erb> b() {
      return ers.z;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      Float $$2 = $$1.c(esz.j);
      if ($$2 != null) {
         azc $$3 = $$1.b();
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

   public static erp.a<?> c() {
      return a(erb::new);
   }
}
