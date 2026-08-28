import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eur extends evh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eur> a = MapCodec.unit(() -> eur.b);
   public static final eur b = new eur();

   private eur() {
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      eao $$6 = $$4.b();
      if ($$6.a(dmo.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().j("final_state");

            eao $$9;
            try {
               ge.a $$8 = ge.a($$0.a(mh.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dmo.lt) ? null : new evk.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected evj<?> a() {
      return evj.h;
   }
}
