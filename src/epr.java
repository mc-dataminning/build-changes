import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epr extends eqh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<epr> a = MapCodec.unit(() -> epr.b);
   public static final epr b = new epr();

   private epr() {
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      dvv $$6 = $$4.b();
      if ($$6.a(dis.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dvv $$9;
            try {
               gq.a $$8 = gq.a($$0.a(ma.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dis.kN) ? null : new eqk.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eqj<?> a() {
      return eqj.h;
   }
}
