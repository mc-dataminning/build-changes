import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eyh extends exf {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eyh::new));

   private eyh(List<ezb> $$0) {
      super($$0);
   }

   @Override
   public exh<eyh> b() {
      return exi.l;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dby $$2 = new dby($$0);
         Optional<dbk<dbz>> $$3 = $$1.d().t().a(dbq.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cwq $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static exf.a<?> c() {
      return a(eyh::new);
   }
}
