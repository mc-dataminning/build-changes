import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class evw extends euu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, evw::new));

   private evw(List<ews> $$0) {
      super($$0);
   }

   @Override
   public euw<evw> b() {
      return eux.l;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<daj<day>> $$2 = $$1.d().r().a(dan.b, new dax($$0), $$1.d());
         if ($$2.isPresent()) {
            cvp $$3 = $$2.get().b().a($$1.d().F_());
            if (!$$3.f()) {
               return $$3.c($$0.J());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static euu.a<?> c() {
      return a(evw::new);
   }
}
