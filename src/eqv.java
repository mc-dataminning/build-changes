import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eqv extends epw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqv> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eqv::new));

   private eqv(List<erq> $$0) {
      super($$0);
   }

   @Override
   public epy b() {
      return epz.k;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         Optional<cxf<cxs>> $$2 = $$1.d().r().a(cxi.b, new bpv($$0), $$1.d());
         if ($$2.isPresent()) {
            csz $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.d()) {
               return $$3.c($$0.G());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static epw.a<?> c() {
      return a(eqv::new);
   }
}
