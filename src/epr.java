import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class epr extends eox {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epr> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, epr::new));

   private epr(List<eql> $$0) {
      super($$0);
   }

   @Override
   public eoz b() {
      return epa.i;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         Optional<cvu<cwh>> $$2 = $$1.d().r().a(cvx.b, new boo($$0), $$1.d());
         if ($$2.isPresent()) {
            crs $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.d()) {
               return $$3.c($$0.G());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eox.a<?> c() {
      return a(epr::new);
   }
}
