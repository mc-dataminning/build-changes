import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epa extends epq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<epa> a = MapCodec.unit(() -> epa.b);
   public static final epa b = new epa();

   private epa() {
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      dvd $$6 = $$4.b();
      if ($$6.a(dia.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dvd $$9;
            try {
               gp.a $$8 = gp.a($$0.a(ly.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dia.kN) ? null : new ept.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eps<?> a() {
      return eps.h;
   }
}
