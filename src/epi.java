import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class epi extends eoo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epi> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, epi::new));

   private epi(List<eqc> $$0) {
      super($$0);
   }

   @Override
   public eoq b() {
      return eor.i;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         Optional<cvl<cvy>> $$2 = $$1.d().r().a(cvo.b, new boj($$0), $$1.d());
         if ($$2.isPresent()) {
            crj $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.d()) {
               return $$3.c($$0.G());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eoo.a<?> c() {
      return a(epi::new);
   }
}
