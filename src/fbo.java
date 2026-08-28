import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fbo extends fam {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbo::new));

   private fbo(List<fci> $$0) {
      super($$0);
   }

   @Override
   public fao<fbo> b() {
      return fap.l;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dei $$2 = new dei($$0);
         Optional<ddu<dej>> $$3 = $$1.d().t().a(dea.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cyy $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fam.a<?> c() {
      return a(fbo::new);
   }
}
