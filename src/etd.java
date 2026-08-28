import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class etd extends esb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, etd::new));

   private etd(List<etz> $$0) {
      super($$0);
   }

   @Override
   public esd<etd> b() {
      return ese.l;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyi<cyx>> $$2 = $$1.d().r().a(cym.b, new cyw($$0), $$1.d());
         if ($$2.isPresent()) {
            cua $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.H());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static esb.a<?> c() {
      return a(etd::new);
   }
}
