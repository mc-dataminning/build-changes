import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fbw extends fau {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbw::new));

   private fbw(List<fcq> $$0) {
      super($$0);
   }

   @Override
   public faw<fbw> b() {
      return fax.l;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         den $$2 = new den($$0);
         Optional<ddz<deo>> $$3 = $$1.d().t().a(def.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            czd $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fau.a<?> c() {
      return a(fbw::new);
   }
}
