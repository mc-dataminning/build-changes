import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euw extends evm {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<euw> a = MapCodec.unit(() -> euw.b);
   public static final euw b = new euw();

   private euw() {
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      eat $$6 = $$4.b();
      if ($$6.a(dmt.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().j("final_state");

            eat $$9;
            try {
               ge.a $$8 = ge.a($$0.a(mh.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dmt.lt) ? null : new evp.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected evo<?> a() {
      return evo.h;
   }
}
