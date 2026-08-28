import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class esw extends ert {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esw::new));

   private esw(List<etr> $$0) {
      super($$0);
   }

   @Override
   public erv<esw> b() {
      return erw.l;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyw<czj>> $$2 = $$1.d().r().a(cyz.b, new brc($$0), $$1.d());
         if ($$2.isPresent()) {
            cuo $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ert.a<?> c() {
      return a(esw::new);
   }
}
