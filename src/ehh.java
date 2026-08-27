import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ehh extends ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehh::new));

   private ehh(List<eib> $$0) {
      super($$0);
   }

   @Override
   public egq b() {
      return egr.h;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cov<cph>> $$2 = $$1.d().q().a(coy.b, new bjj($$0), $$1.d());
         if ($$2.isPresent()) {
            clo $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ego.a<?> c() {
      return a(ehh::new);
   }
}
