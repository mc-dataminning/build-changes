import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqw extends erm {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eqw> a = MapCodec.unit(() -> eqw.b);
   public static final eqw b = new eqw();

   private eqw() {
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      dwy $$6 = $$4.b();
      if ($$6.a(djp.pD)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dwy $$9;
            try {
               gr.a $$8 = gr.a($$0.a(mc.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(djp.lp) ? null : new erp.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ero<?> a() {
      return ero.h;
   }
}
