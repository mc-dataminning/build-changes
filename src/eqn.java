import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eqn extends epo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqn> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eqn::new));

   private eqn(List<erh> $$0) {
      super($$0);
   }

   @Override
   public epq b() {
      return epr.i;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         Optional<cwi<cwv>> $$2 = $$1.d().r().a(cwl.b, new boz($$0), $$1.d());
         if ($$2.isPresent()) {
            csd $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.d()) {
               return $$3.c($$0.G());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static epo.a<?> c() {
      return a(eqn::new);
   }
}
