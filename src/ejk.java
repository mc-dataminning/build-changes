import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ejk extends eir {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejk> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ejk::new));

   private ejk(List<eke> $$0) {
      super($$0);
   }

   @Override
   public eit b() {
      return eiu.h;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<cqm<cqz>> $$2 = $$1.d().r().a(cqp.b, new bkl($$0), $$1.d());
         if ($$2.isPresent()) {
            cng $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eir.a<?> c() {
      return a(ejk::new);
   }
}
