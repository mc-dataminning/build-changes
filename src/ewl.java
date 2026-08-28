import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ewl extends evj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewl::new));

   private ewl(List<exh> $$0) {
      super($$0);
   }

   @Override
   public evl<ewl> b() {
      return evm.l;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         Optional<dal<dba>> $$2 = $$1.d().r().a(dap.b, new daz($$0), $$1.d());
         if ($$2.isPresent()) {
            cvx $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.f()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static evj.a<?> c() {
      return a(ewl::new);
   }
}
