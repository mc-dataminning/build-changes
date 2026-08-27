import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ehc extends egj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehc::new));

   private ehc(List<ehw> $$0) {
      super($$0);
   }

   @Override
   public egl b() {
      return egm.h;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<coq<cpc>> $$2 = $$1.d().q().a(cot.b, new bje($$0), $$1.d());
         if ($$2.isPresent()) {
            clj $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.b()) {
               return $$3.c($$0.L());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static egj.a<?> c() {
      return a(ehc::new);
   }
}
