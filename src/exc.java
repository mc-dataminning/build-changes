import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class exc extends ewa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, exc::new));

   private exc(List<exy> $$0) {
      super($$0);
   }

   @Override
   public ewc<exc> b() {
      return ewd.l;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<dbc<dbq>> $$2 = $$1.d().s().a(dbg.b, new dbp($$0), $$1.d());
         if ($$2.isPresent()) {
            cwm $$3 = $$2.get().b().a($$1.d().J_());
            if (!$$3.f()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ewa.a<?> c() {
      return a(exc::new);
   }
}
