import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evw extends ewm {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<evw> a = MapCodec.unit(() -> evw.b);
   public static final evw b = new evw();

   private evw() {
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      ebq $$6 = $$4.b();
      if ($$6.a(dnq.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().b("final_state", "minecraft:air");

            ebq $$9;
            try {
               gf.a $$8 = gf.a($$0.a(mi.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dnq.lt) ? null : new ewp.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ewo<?> a() {
      return ewo.h;
   }
}
