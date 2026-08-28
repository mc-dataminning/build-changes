import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ers extends esi {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ers> a = MapCodec.unit(() -> ers.b);
   public static final ers b = new ers();

   private ers() {
   }

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      dxq $$6 = $$4.b();
      if ($$6.a(dkg.pD)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dxq $$9;
            try {
               gr.a $$8 = gr.a($$0.a(mc.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dkg.lp) ? null : new esl.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected esk<?> a() {
      return esk.h;
   }
}
