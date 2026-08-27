import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxy extends dyn {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dxy> a = Codec.unit(() -> dxy.b);
   public static final dxy b = new dxy();

   private dxy() {
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      dey $$6 = $$4.b();
      if ($$6.a(csl.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dey $$9;
            try {
               fh.a $$8 = fh.a($$0.a(jd.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csl.kN) ? null : new dyq.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dyp<?> a() {
      return dyp.h;
   }
}
