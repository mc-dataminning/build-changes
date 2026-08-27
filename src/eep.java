import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eep extends edw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eep> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eep::new));

   private eep(List<efj> $$0) {
      super($$0);
   }

   @Override
   public edy b() {
      return edz.h;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmq<cnc>> $$2 = $$1.d().q().a(cmt.b, new bhl($$0), $$1.d());
         if ($$2.isPresent()) {
            cjl $$3 = $$2.get().b().a($$1.d().G_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static edw.a<?> c() {
      return a(eep::new);
   }
}
