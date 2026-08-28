import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eye extends exc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eye::new));

   private eye(List<eyy> $$0) {
      super($$0);
   }

   @Override
   public exe<eye> b() {
      return exf.l;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dbv $$2 = new dbv($$0);
         Optional<dbh<dbw>> $$3 = $$1.d().t().a(dbn.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cwn $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static exc.a<?> c() {
      return a(eye::new);
   }
}
