import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evm extends ewc {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<evm> a = MapCodec.unit(() -> evm.b);
   public static final evm b = new evm();

   private evm() {
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      ebg $$6 = $$4.b();
      if ($$6.a(dng.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().b("final_state", "minecraft:air");

            ebg $$9;
            try {
               gf.a $$8 = gf.a($$0.a(mi.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dng.lt) ? null : new ewf.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ewe<?> a() {
      return ewe.h;
   }
}
