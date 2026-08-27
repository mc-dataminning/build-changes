import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egm extends ehb {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<egm> a = Codec.unit(() -> egm.b);
   public static final egm b = new egm();

   private egm() {
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      dnb $$6 = $$4.b();
      if ($$6.a(dae.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dnb $$9;
            try {
               fm.a $$8 = fm.a($$0.a(kj.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dae.kN) ? null : new ehe.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ehd<?> a() {
      return ehd.h;
   }
}
