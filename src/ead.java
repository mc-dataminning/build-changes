import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ead extends eas {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ead> a = Codec.unit(() -> ead.b);
   public static final ead b = new ead();

   private ead() {
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      dgw $$6 = $$4.b();
      if ($$6.a(cuv.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dgw $$9;
            try {
               fk.a $$8 = fk.a($$0.a(jz.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cuv.kN) ? null : new eav.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eau<?> a() {
      return eau.h;
   }
}
