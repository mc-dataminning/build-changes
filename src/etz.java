import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class etz extends eta {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<etz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, etz::new));

   private etz(List<euu> $$0) {
      super($$0);
   }

   @Override
   public etc b() {
      return etd.k;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         Optional<czc<czp>> $$2 = $$1.d().r().a(czf.b, new bqj($$0), $$1.d());
         if ($$2.isPresent()) {
            cuh $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.d()) {
               return $$3.c($$0.G());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eta.a<?> c() {
      return a(etz::new);
   }
}
