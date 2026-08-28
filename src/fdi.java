import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fdi extends fcg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fdi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fdi::new));

   private fdi(List<fec> $$0) {
      super($$0);
   }

   @Override
   public fci<fdi> b() {
      return fcj.l;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dfu $$2 = new dfu($$0);
         Optional<dfg<dfv>> $$3 = $$1.d().t().a(dfm.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            dak $$4 = $$3.get().b().a($$2, $$1.d().J_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fcg.a<?> c() {
      return a(fdi::new);
   }
}
