import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eyf extends exd {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eyf::new));

   private eyf(List<eyz> $$0) {
      super($$0);
   }

   @Override
   public exf<eyf> b() {
      return exg.l;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dbw $$2 = new dbw($$0);
         Optional<dbi<dbx>> $$3 = $$1.d().t().a(dbo.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cwo $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static exd.a<?> c() {
      return a(eyf::new);
   }
}
