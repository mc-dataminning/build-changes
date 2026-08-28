import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eop extends epf {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eop> a = MapCodec.unit(() -> eop.b);
   public static final eop b = new eop();

   private eop() {
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      dus $$6 = $$4.b();
      if ($$6.a(dho.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dus $$9;
            try {
               go.a $$8 = go.a($$0.a(lw.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dho.kN) ? null : new epi.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eph<?> a() {
      return eph.h;
   }
}
