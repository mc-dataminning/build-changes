import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etr extends euh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<etr> a = MapCodec.unit(() -> etr.b);
   public static final etr b = new etr();

   private etr() {
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      dzo $$6 = $$4.b();
      if ($$6.a(dlw.pD)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dzo $$9;
            try {
               gd.a $$8 = gd.a($$0.a(mg.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dlw.lp) ? null : new euk.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected euj<?> a() {
      return euj.h;
   }
}
