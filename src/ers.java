import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ers extends eqs {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ers::new));

   private ers(List<esn> $$0) {
      super($$0);
   }

   @Override
   public equ b() {
      return eqv.k;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cxy<cyl>> $$2 = $$1.d().r().a(cyb.b, new bqf($$0), $$1.d());
         if ($$2.isPresent()) {
            ctq $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.I());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eqs.a<?> c() {
      return a(ers::new);
   }
}
