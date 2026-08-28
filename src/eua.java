import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eua extends esy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eua::new));

   private eua(List<euw> $$0) {
      super($$0);
   }

   @Override
   public eta<eua> b() {
      return etb.l;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         Optional<cyz<czo>> $$2 = $$1.d().r().a(czd.b, new czn($$0), $$1.d());
         if ($$2.isPresent()) {
            cuo $$3 = $$2.get().b().a($$1.d().H_());
            if (!$$3.e()) {
               return $$3.c($$0.H());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static esy.a<?> c() {
      return a(eua::new);
   }
}
