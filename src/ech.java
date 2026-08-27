import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ech extends ecw {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ech> a = Codec.unit(() -> ech.b);
   public static final ech b = new ech();

   private ech() {
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      dja $$6 = $$4.b();
      if ($$6.a(cwl.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dja $$9;
            try {
               fk.a $$8 = fk.a($$0.a(ke.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cwl.kN) ? null : new ecz.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ecy<?> a() {
      return ecy.h;
   }
}
