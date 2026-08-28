import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emg extends emv {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<emg> a = MapCodec.unit(() -> emg.b);
   public static final emg b = new emg();

   private emg() {
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      dsl $$6 = $$4.b();
      if ($$6.a(dfk.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dsl $$9;
            try {
               gk.a $$8 = gk.a($$0.a(lr.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dfk.kN) ? null : new emy.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected emx<?> a() {
      return emx.h;
   }
}
