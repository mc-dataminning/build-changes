import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egk extends egz {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<egk> a = Codec.unit(() -> egk.b);
   public static final egk b = new egk();

   private egk() {
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      dmz $$6 = $$4.b();
      if ($$6.a(dac.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dmz $$9;
            try {
               fm.a $$8 = fm.a($$0.a(kj.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dac.kN) ? null : new ehc.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ehb<?> a() {
      return ehb.h;
   }
}
