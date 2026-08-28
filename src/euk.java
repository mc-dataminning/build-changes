import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euk extends eva {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<euk> a = MapCodec.unit(() -> euk.b);
   public static final euk b = new euk();

   private euk() {
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      eah $$6 = $$4.b();
      if ($$6.a(dmh.pH)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            eah $$9;
            try {
               gd.a $$8 = gd.a($$0.a(mg.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dmh.lt) ? null : new evd.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected evc<?> a() {
      return evc.h;
   }
}
