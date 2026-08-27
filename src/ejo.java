import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejo extends ekd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejo> a = Codec.unit(() -> ejo.b);
   public static final ejo b = new ejo();

   private ejo() {
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      dpy $$6 = $$4.b();
      if ($$6.a(dcx.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dpy $$9;
            try {
               fv.a $$8 = fv.a($$0.a(ld.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dcx.kN) ? null : new ekg.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ekf<?> a() {
      return ekf.h;
   }
}
