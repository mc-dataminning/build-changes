import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecn extends edc {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ecn> a = Codec.unit(() -> ecn.b);
   public static final ecn b = new ecn();

   private ecn() {
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      djg $$6 = $$4.b();
      if ($$6.a(cwr.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            djg $$9;
            try {
               fk.a $$8 = fk.a($$0.a(ke.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cwr.kN) ? null : new edf.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ede<?> a() {
      return ede.h;
   }
}
