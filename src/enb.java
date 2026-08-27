import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class enb extends emi {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<enb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, enb::new));

   private enb(List<env> $$0) {
      super($$0);
   }

   @Override
   public emk b() {
      return eml.h;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<ctr<cue>> $$2 = $$1.d().r().a(ctu.b, new bnm($$0), $$1.d());
         if ($$2.isPresent()) {
            cqm $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.b()) {
               return $$3.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static emi.a<?> c() {
      return a(enb::new);
   }
}
