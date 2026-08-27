import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ebw extends ecl {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ebw> a = Codec.unit(() -> ebw.b);
   public static final ebw b = new ebw();

   private ebw() {
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      dip $$6 = $$4.b();
      if ($$6.a(cwb.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dip $$9;
            try {
               fi.a $$8 = fi.a($$0.a(kc.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cwb.kN) ? null : new eco.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ecn<?> a() {
      return ecn.h;
   }
}
