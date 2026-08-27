import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eip extends eje {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eip> a = Codec.unit(() -> eip.b);
   public static final eip b = new eip();

   private eip() {
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      doz $$6 = $$4.b();
      if ($$6.a(dca.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            doz $$9;
            try {
               fm.a $$8 = fm.a($$0.a(ks.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dca.kN) ? null : new ejh.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ejg<?> a() {
      return ejg.h;
   }
}
