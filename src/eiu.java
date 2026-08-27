import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eiu extends eib {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eiu> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eiu::new));

   private eiu(List<ejo> $$0) {
      super($$0);
   }

   @Override
   public eid b() {
      return eie.h;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cpx<cqk>> $$2 = $$1.d().r().a(cqa.b, new bkd($$0), $$1.d());
         if ($$2.isPresent()) {
            cmr $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eib.a<?> c() {
      return a(eiu::new);
   }
}
