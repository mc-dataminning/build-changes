import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evk extends ewa {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<evk> a = MapCodec.unit(() -> evk.b);
   public static final evk b = new evk();

   private evk() {
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      ebe $$6 = $$4.b();
      if ($$6.a(dne.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().b("final_state", "minecraft:air");

            ebe $$9;
            try {
               ge.a $$8 = ge.a($$0.a(mh.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dne.lt) ? null : new ewd.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ewc<?> a() {
      return ewc.h;
   }
}
