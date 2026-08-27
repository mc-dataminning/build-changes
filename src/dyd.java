import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyd extends dys {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dyd> a = Codec.unit(() -> dyd.b);
   public static final dyd b = new dyd();

   private dyd() {
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      dfd $$6 = $$4.b();
      if ($$6.a(cte.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dfd $$9;
            try {
               fi.a $$8 = fi.a($$0.a(jc.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cte.kN) ? null : new dyv.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dyu<?> a() {
      return dyu.h;
   }
}
