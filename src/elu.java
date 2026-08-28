import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elu extends emj {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<elu> a = MapCodec.unit(() -> elu.b);
   public static final elu b = new elu();

   private elu() {
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      dse $$6 = $$4.b();
      if ($$6.a(dfd.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dse $$9;
            try {
               gj.a $$8 = gj.a($$0.a(lq.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dfd.kN) ? null : new emm.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eml<?> a() {
      return eml.h;
   }
}
