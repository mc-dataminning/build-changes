import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class efn extends eeu {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efn> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, efn::new));

   private efn(List<egh> $$0) {
      super($$0);
   }

   @Override
   public eew b() {
      return eex.h;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cno<coa>> $$2 = $$1.d().q().a(cnr.b, new bii($$0), $$1.d());
         if ($$2.isPresent()) {
            ckj $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eeu.a<?> c() {
      return a(efn::new);
   }
}
