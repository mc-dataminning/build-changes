import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ewv extends evt {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewv::new));

   private ewv(List<exr> $$0) {
      super($$0);
   }

   @Override
   public evv<ewv> b() {
      return evw.l;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<dav<dbj>> $$2 = $$1.d().r().a(daz.b, new dbi($$0), $$1.d());
         if ($$2.isPresent()) {
            cwf $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.f()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static evt.a<?> c() {
      return a(ewv::new);
   }
}
