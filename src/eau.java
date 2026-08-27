import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eau extends ebj {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eau> a = Codec.unit(() -> eau.b);
   public static final eau b = new eau();

   private eau() {
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      dhn $$6 = $$4.b();
      if ($$6.a(cvh.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dhn $$9;
            try {
               fk.a $$8 = fk.a($$0.a(kd.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cvh.kN) ? null : new ebm.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ebl<?> a() {
      return ebl.h;
   }
}
