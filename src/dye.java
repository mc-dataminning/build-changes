import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dye extends dyt {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dye> a = Codec.unit(() -> dye.b);
   public static final dye b = new dye();

   private dye() {
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      dfe $$6 = $$4.b();
      if ($$6.a(csr.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dfe $$9;
            try {
               fi.a $$8 = fi.a($$0.a(je.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csr.kN) ? null : new dyw.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dyv<?> a() {
      return dyv.h;
   }
}
