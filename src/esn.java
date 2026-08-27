import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends eta {
   public static final Codec<esn> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, esn::new));

   private esn(List<euu> $$0) {
      super($$0);
   }

   @Override
   public etc b() {
      return etd.w;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      Float $$2 = $$1.c(eug.j);
      if ($$2 != null) {
         ayt $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.G();
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

   public static eta.a<?> c() {
      return a(esn::new);
   }
}
