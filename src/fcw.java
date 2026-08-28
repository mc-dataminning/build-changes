import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fcw extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fcw::new));

   private fcw(List<fdq> $$0) {
      super($$0);
   }

   @Override
   public fbw<fcw> b() {
      return fbx.l;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dfi $$2 = new dfi($$0);
         Optional<deu<dfj>> $$3 = $$1.d().t().a(dfa.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            czy $$4 = $$3.get().b().a($$2, $$1.d().J_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fbu.a<?> c() {
      return a(fcw::new);
   }
}
