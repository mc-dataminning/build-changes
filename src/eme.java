import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eme extends emt {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eme> a = MapCodec.unit(() -> eme.b);
   public static final eme b = new eme();

   private eme() {
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      dsk $$6 = $$4.b();
      if ($$6.a(dfj.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dsk $$9;
            try {
               gk.a $$8 = gk.a($$0.a(lr.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dfj.kN) ? null : new emw.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected emv<?> a() {
      return emv.h;
   }
}
