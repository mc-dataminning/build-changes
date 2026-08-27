import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eap extends ebe {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eap> a = Codec.unit(() -> eap.b);
   public static final eap b = new eap();

   private eap() {
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      dhi $$6 = $$4.b();
      if ($$6.a(cvc.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dhi $$9;
            try {
               fk.a $$8 = fk.a($$0.a(jz.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cvc.kN) ? null : new ebh.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ebg<?> a() {
      return ebg.h;
   }
}
