import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class esv extends ers {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esv::new));

   private esv(List<etq> $$0) {
      super($$0);
   }

   @Override
   public eru<esv> b() {
      return erv.l;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyv<czi>> $$2 = $$1.d().r().a(cyy.b, new brb($$0), $$1.d());
         if ($$2.isPresent()) {
            cun $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ers.a<?> c() {
      return a(esv::new);
   }
}
