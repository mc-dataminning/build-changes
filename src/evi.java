import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class evi extends eug {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, evi::new));

   private evi(List<ewe> $$0) {
      super($$0);
   }

   @Override
   public eui<evi> b() {
      return euj.l;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<czv<dak>> $$2 = $$1.d().r().a(czz.b, new daj($$0), $$1.d());
         if ($$2.isPresent()) {
            cvl $$3 = $$2.get().b().a($$1.d().F_());
            if (!$$3.f()) {
               return $$3.c($$0.J());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eug.a<?> c() {
      return a(evi::new);
   }
}
