import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eeq extends edx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eeq> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eeq::new));

   private eeq(List<efk> $$0) {
      super($$0);
   }

   @Override
   public edz b() {
      return eea.h;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmf<cmr>> $$2 = $$1.d().q().a(cmi.b, new bha($$0), $$1.d());
         if ($$2.isPresent()) {
            cja $$3 = $$2.get().b().a($$1.d().B_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static edx.a<?> c() {
      return a(eeq::new);
   }
}
