import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emv extends enk {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<emv> a = MapCodec.unit(() -> emv.b);
   public static final emv b = new emv();

   private emv() {
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      dta $$6 = $$4.b();
      if ($$6.a(dfy.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dta $$9;
            try {
               gn.a $$8 = gn.a($$0.a(lu.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dfy.kN) ? null : new enn.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected enm<?> a() {
      return enm.h;
   }
}
