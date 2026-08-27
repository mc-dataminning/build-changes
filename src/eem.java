import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eem extends efb {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eem> a = Codec.unit(() -> eem.b);
   public static final eem b = new eem();

   private eem() {
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      dlf $$6 = $$4.b();
      if ($$6.a(cyq.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dlf $$9;
            try {
               fm.a $$8 = fm.a($$0.a(kg.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cyq.kN) ? null : new efe.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected efd<?> a() {
      return efd.h;
   }
}
