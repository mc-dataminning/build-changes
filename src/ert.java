import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ert extends esj {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ert> a = MapCodec.unit(() -> ert.b);
   public static final ert b = new ert();

   private ert() {
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      dxv $$6 = $$4.b();
      if ($$6.a(dko.pw)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dxv $$9;
            try {
               gq.a $$8 = gq.a($$0.a(mb.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dko.li) ? null : new esm.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected esl<?> a() {
      return esl.h;
   }
}
