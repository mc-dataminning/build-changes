import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class emz extends emg {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, emz::new));

   private emz(List<ent> $$0) {
      super($$0);
   }

   @Override
   public emi b() {
      return emj.h;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<ctp<cuc>> $$2 = $$1.d().r().a(cts.b, new bnl($$0), $$1.d());
         if ($$2.isPresent()) {
            cqk $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.b()) {
               return $$3.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static emg.a<?> c() {
      return a(emz::new);
   }
}
