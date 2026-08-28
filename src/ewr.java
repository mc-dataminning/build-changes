import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ewr extends evp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewr::new));

   private ewr(List<exn> $$0) {
      super($$0);
   }

   @Override
   public evr<ewr> b() {
      return evs.l;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<dar<dbg>> $$2 = $$1.d().r().a(dav.b, new dbf($$0), $$1.d());
         if ($$2.isPresent()) {
            cwb $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.f()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static evp.a<?> c() {
      return a(ewr::new);
   }
}
