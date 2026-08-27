import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eja extends eih {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eja> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eja::new));

   private eja(List<eju> $$0) {
      super($$0);
   }

   @Override
   public eij b() {
      return eik.h;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cqd<cqq>> $$2 = $$1.d().r().a(cqg.b, new bki($$0), $$1.d());
         if ($$2.isPresent()) {
            cmx $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eih.a<?> c() {
      return a(eja::new);
   }
}
