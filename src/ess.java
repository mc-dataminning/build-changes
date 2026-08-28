import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ess extends erp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ess::new));

   private ess(List<etn> $$0) {
      super($$0);
   }

   @Override
   public err<ess> b() {
      return ers.l;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cys<czf>> $$2 = $$1.d().r().a(cyv.b, new bqy($$0), $$1.d());
         if ($$2.isPresent()) {
            cuk $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static erp.a<?> c() {
      return a(ess::new);
   }
}
