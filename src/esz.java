import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class esz extends erw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esz::new));

   private esz(List<etu> $$0) {
      super($$0);
   }

   @Override
   public ery<esz> b() {
      return erz.l;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyz<czm>> $$2 = $$1.d().r().a(czc.b, new brf($$0), $$1.d());
         if ($$2.isPresent()) {
            cur $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static erw.a<?> c() {
      return a(esz::new);
   }
}
