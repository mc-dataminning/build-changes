import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eiy extends ejn {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eiy> a = Codec.unit(() -> eiy.b);
   public static final eiy b = new eiy();

   private eiy() {
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      dpi $$6 = $$4.b();
      if ($$6.a(dcj.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dpi $$9;
            try {
               fo.a $$8 = fo.a($$0.a(ku.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dcj.kN) ? null : new ejq.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ejp<?> a() {
      return ejp.h;
   }
}
