import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class egq extends efx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egq> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, egq::new));

   private egq(List<ehk> $$0) {
      super($$0);
   }

   @Override
   public efz b() {
      return ega.h;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<coh<cou>> $$2 = $$1.d().q().a(cok.b, new bix($$0), $$1.d());
         if ($$2.isPresent()) {
            clb $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static efx.a<?> c() {
      return a(egq::new);
   }
}
