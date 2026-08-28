import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epk extends eqa {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<epk> a = MapCodec.unit(() -> epk.b);
   public static final epk b = new epk();

   private epk() {
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      dvo $$6 = $$4.b();
      if ($$6.a(dil.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dvo $$9;
            try {
               gq.a $$8 = gq.a($$0.a(ma.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dil.kN) ? null : new eqd.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eqc<?> a() {
      return eqc.h;
   }
}
