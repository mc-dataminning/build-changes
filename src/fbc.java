import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fbc extends faa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbc::new));

   private fbc(List<fbw> $$0) {
      super($$0);
   }

   @Override
   public fac<fbc> b() {
      return fad.l;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dec $$2 = new dec($$0);
         Optional<ddo<ded>> $$3 = $$1.d().t().a(ddu.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cys $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static faa.a<?> c() {
      return a(fbc::new);
   }
}
