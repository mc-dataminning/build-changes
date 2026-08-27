import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecw extends edl {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ecw> a = Codec.unit(() -> ecw.b);
   public static final ecw b = new ecw();

   private ecw() {
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      djp $$6 = $$4.b();
      if ($$6.a(cxa.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            djp $$9;
            try {
               fk.a $$8 = fk.a($$0.a(ke.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cxa.kN) ? null : new edo.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected edn<?> a() {
      return edn.h;
   }
}
