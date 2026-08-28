import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class esy extends erv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esy::new));

   private esy(List<ett> $$0) {
      super($$0);
   }

   @Override
   public erx<esy> b() {
      return ery.l;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyy<czl>> $$2 = $$1.d().r().a(czb.b, new bre($$0), $$1.d());
         if ($$2.isPresent()) {
            cuq $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static erv.a<?> c() {
      return a(esy::new);
   }
}
