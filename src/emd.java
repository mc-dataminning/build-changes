import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class emd extends elk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, emd::new));

   private emd(List<emx> $$0) {
      super($$0);
   }

   @Override
   public elm b() {
      return eln.h;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<csu<cth>> $$2 = $$1.d().r().a(csx.b, new bmu($$0), $$1.d());
         if ($$2.isPresent()) {
            cpq $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static elk.a<?> c() {
      return a(emd::new);
   }
}
