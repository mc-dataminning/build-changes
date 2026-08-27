import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eem extends edt {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eem> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eem::new));

   private eem(List<efg> $$0) {
      super($$0);
   }

   @Override
   public edv b() {
      return edw.h;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmn> $$2 = $$1.d().q().a(cme.b, new bgx($$0), $$1.d());
         if ($$2.isPresent()) {
            ciy $$3 = $$2.get().a($$1.d().B_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static edt.a<?> c() {
      return a(eem::new);
   }
}
