import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyj extends dyy {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dyj> a = Codec.unit(() -> dyj.b);
   public static final dyj b = new dyj();

   private dyj() {
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      dfj $$6 = $$4.b();
      if ($$6.a(csw.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dfj $$9;
            try {
               fi.a $$8 = fi.a($$0.a(jc.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csw.kN) ? null : new dzb.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dza<?> a() {
      return dza.h;
   }
}
