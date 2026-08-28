import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epg extends epw {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<epg> a = MapCodec.unit(() -> epg.b);
   public static final epg b = new epg();

   private epg() {
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      dvj $$6 = $$4.b();
      if ($$6.a(dig.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dvj $$9;
            try {
               gq.a $$8 = gq.a($$0.a(lz.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dig.kN) ? null : new epz.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected epy<?> a() {
      return epy.h;
   }
}
