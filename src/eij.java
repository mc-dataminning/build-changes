import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eij extends ehq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eij> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eij::new));

   private eij(List<ejd> $$0) {
      super($$0);
   }

   @Override
   public ehs b() {
      return eht.h;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cpn<cqa>> $$2 = $$1.d().q().a(cpq.b, new bjt($$0), $$1.d());
         if ($$2.isPresent()) {
            cmh $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static ehq.a<?> c() {
      return a(eij::new);
   }
}
