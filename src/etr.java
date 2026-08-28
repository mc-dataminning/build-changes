import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etr extends eug {
   public static final MapCodec<etr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, etr::new));

   private etr(List<ewe> $$0) {
      super($$0);
   }

   @Override
   public eui<etr> b() {
      return euj.z;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      Float $$2 = $$1.c(evp.j);
      if ($$2 != null) {
         azk $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.J();
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

   public static eug.a<?> c() {
      return a(etr::new);
   }
}
