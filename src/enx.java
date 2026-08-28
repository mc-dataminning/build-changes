import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enx extends eon {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<enx> a = MapCodec.unit(() -> enx.b);
   public static final enx b = new enx();

   private enx() {
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      dua $$6 = $$4.b();
      if ($$6.a(dgx.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dua $$9;
            try {
               gn.a $$8 = gn.a($$0.a(lv.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dgx.kN) ? null : new eoq.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eop<?> a() {
      return eop.h;
   }
}
