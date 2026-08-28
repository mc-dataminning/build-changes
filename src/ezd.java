import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ezd extends eyb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ezd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ezd::new));

   private ezd(List<ezx> $$0) {
      super($$0);
   }

   @Override
   public eyd<ezd> b() {
      return eye.l;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dco $$2 = new dco($$0);
         Optional<dca<dcp>> $$3 = $$1.d().t().a(dcg.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            cxh $$4 = $$3.get().b().a($$2, $$1.d().F_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eyb.a<?> c() {
      return a(ezd::new);
   }
}
