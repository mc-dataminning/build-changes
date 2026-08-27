import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class elh extends eko {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, elh::new));

   private elh(List<emb> $$0) {
      super($$0);
   }

   @Override
   public ekq b() {
      return ekr.h;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         Optional<csh<csu>> $$2 = $$1.d().r().a(csk.b, new bmf($$0), $$1.d());
         if ($$2.isPresent()) {
            cpd $$3 = $$2.get().b().a($$1.d().I_());
            if (!$$3.b()) {
               return $$3.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static eko.a<?> c() {
      return a(elh::new);
   }
}
