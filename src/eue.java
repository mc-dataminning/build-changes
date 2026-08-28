import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eue extends etc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eue::new));

   private eue(List<eva> $$0) {
      super($$0);
   }

   @Override
   public ete<eue> b() {
      return etf.l;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<czb<czq>> $$2 = $$1.d().r().a(czf.b, new czp($$0), $$1.d());
         if ($$2.isPresent()) {
            cuq $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.H());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static etc.a<?> c() {
      return a(eue::new);
   }
}
