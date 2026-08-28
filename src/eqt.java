import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqt extends erj {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eqt> a = MapCodec.unit(() -> eqt.b);
   public static final eqt b = new eqt();

   private eqt() {
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      dwv $$6 = $$4.b();
      if ($$6.a(djm.pD)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dwv $$9;
            try {
               gr.a $$8 = gr.a($$0.a(mc.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(djm.lp) ? null : new erm.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected erl<?> a() {
      return erl.h;
   }
}
