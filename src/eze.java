import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eze extends eyc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eze::new));

   private eze(List<ezy> $$0) {
      super($$0);
   }

   @Override
   public eye<eze> b() {
      return eyf.l;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dcx $$2 = new dcx($$0);
         Optional<dcj<dcy>> $$3 = $$1.d().s().a(dcp.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cxp $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eyc.a<?> c() {
      return a(eze::new);
   }
}
