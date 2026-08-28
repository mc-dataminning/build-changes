import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class etj extends esh {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, etj::new));

   private etj(List<euf> $$0) {
      super($$0);
   }

   @Override
   public esj<etj> b() {
      return esk.l;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyk<cyz>> $$2 = $$1.d().r().a(cyo.b, new cyy($$0), $$1.d());
         if ($$2.isPresent()) {
            cuc $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.H());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static esh.a<?> c() {
      return a(etj::new);
   }
}
