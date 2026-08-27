import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyl extends dza {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dyl> a = Codec.unit(() -> dyl.b);
   public static final dyl b = new dyl();

   private dyl() {
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      dfl $$6 = $$4.b();
      if ($$6.a(csy.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dfl $$9;
            try {
               fi.a $$8 = fi.a($$0.a(je.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csy.kN) ? null : new dzd.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dzc<?> a() {
      return dzc.h;
   }
}
