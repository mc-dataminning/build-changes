import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eyw extends exu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eyw::new));

   private eyw(List<ezs> $$0) {
      super($$0);
   }

   @Override
   public exw<eyw> b() {
      return exx.l;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dcr $$2 = new dcr($$0);
         Optional<dcd<dcs>> $$3 = $$1.d().s().a(dcj.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cxk $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static exu.a<?> c() {
      return a(eyw::new);
   }
}
