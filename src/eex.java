import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eex extends eee {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eex> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eex::new));

   private eex(List<efr> $$0) {
      super($$0);
   }

   @Override
   public eeg b() {
      return eeh.h;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cmm<cmy>> $$2 = $$1.d().q().a(cmp.b, new bhh($$0), $$1.d());
         if ($$2.isPresent()) {
            cjh $$3 = $$2.get().b().a($$1.d().G_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eee.a<?> c() {
      return a(eex::new);
   }
}
