import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erl extends esb {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<erl> a = MapCodec.unit(() -> erl.b);
   public static final erl b = new erl();

   private erl() {
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      dxn $$6 = $$4.b();
      if ($$6.a(dkg.pw)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dxn $$9;
            try {
               gq.a $$8 = gq.a($$0.a(mb.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dkg.li) ? null : new ese.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected esd<?> a() {
      return esd.h;
   }
}
