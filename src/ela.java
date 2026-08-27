import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ela extends ekh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ela> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ela::new));

   private ela(List<elu> $$0) {
      super($$0);
   }

   @Override
   public ekj b() {
      return ekk.h;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<csd<csq>> $$2 = $$1.d().r().a(csg.b, new bmd($$0), $$1.d());
         if ($$2.isPresent()) {
            coz $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ekh.a<?> c() {
      return a(ela::new);
   }
}
