import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fcy extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fcy::new));

   private fcy(List<fds> $$0) {
      super($$0);
   }

   @Override
   public fby<fcy> b() {
      return fbz.l;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dfk $$2 = new dfk($$0);
         Optional<dew<dfl>> $$3 = $$1.d().t().a(dfc.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            daa $$4 = $$3.get().b().a($$2, $$1.d().J_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static fbw.a<?> c() {
      return a(fcy::new);
   }
}
