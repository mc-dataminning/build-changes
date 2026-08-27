import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eco extends edd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eco> a = Codec.unit(() -> eco.b);
   public static final eco b = new eco();

   private eco() {
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      djh $$6 = $$4.b();
      if ($$6.a(cws.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            djh $$9;
            try {
               fk.a $$8 = fk.a($$0.a(ke.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cws.kN) ? null : new edg.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected edf<?> a() {
      return edf.h;
   }
}
