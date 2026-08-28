import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fcd extends fbb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fcd::new));

   private fcd(List<fcx> $$0) {
      super($$0);
   }

   @Override
   public fbd<fcd> b() {
      return fbe.l;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         deu $$2 = new deu($$0);
         Optional<deg<dev>> $$3 = $$1.d().t().a(dem.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            czk $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fbb.a<?> c() {
      return a(fcd::new);
   }
}
