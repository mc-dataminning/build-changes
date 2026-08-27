import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dya extends dyp {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dya> a = Codec.unit(() -> dya.b);
   public static final dya b = new dya();

   private dya() {
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      dfa $$6 = $$4.b();
      if ($$6.a(csn.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dfa $$9;
            try {
               fg.a $$8 = fg.a($$0.a(jc.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csn.kN) ? null : new dys.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dyr<?> a() {
      return dyr.h;
   }
}
