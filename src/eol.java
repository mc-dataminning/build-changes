import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eol extends epb {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eol> a = MapCodec.unit(() -> eol.b);
   public static final eol b = new eol();

   private eol() {
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      duo $$6 = $$4.b();
      if ($$6.a(dhl.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            duo $$9;
            try {
               gn.a $$8 = gn.a($$0.a(lv.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dhl.kN) ? null : new epe.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected epd<?> a() {
      return epd.h;
   }
}
