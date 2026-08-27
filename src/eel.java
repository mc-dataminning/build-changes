import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eel extends eds {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eel> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eel::new));

   private eel(List<eff> $$0) {
      super($$0);
   }

   @Override
   public edu b() {
      return edv.h;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmm> $$2 = $$1.d().q().a(cmd.b, new bgx($$0), $$1.d());
         if ($$2.isPresent()) {
            cix $$3 = $$2.get().a($$1.d().B_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eds.a<?> c() {
      return a(eel::new);
   }
}
