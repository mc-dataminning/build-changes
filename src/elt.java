import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elt extends emi {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<elt> a = MapCodec.unit(() -> elt.b);
   public static final elt b = new elt();

   private elt() {
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      dsd $$6 = $$4.b();
      if ($$6.a(dfc.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dsd $$9;
            try {
               gj.a $$8 = gj.a($$0.a(lq.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dfc.kN) ? null : new eml.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected emk<?> a() {
      return emk.h;
   }
}
