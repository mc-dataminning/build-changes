import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eev extends eec {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eev> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eev::new));

   private eev(List<efp> $$0) {
      super($$0);
   }

   @Override
   public eee b() {
      return eef.h;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmk<cmw>> $$2 = $$1.d().q().a(cmn.b, new bhf($$0), $$1.d());
         if ($$2.isPresent()) {
            cjf $$3 = $$2.get().b().a($$1.d().G_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eec.a<?> c() {
      return a(eev::new);
   }
}
