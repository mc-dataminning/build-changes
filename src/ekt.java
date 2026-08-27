import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekt extends eli {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ekt> a = MapCodec.unit(() -> ekt.b);
   public static final ekt b = new ekt();

   private ekt() {
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      drd $$6 = $$4.b();
      if ($$6.a(dec.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            drd $$9;
            try {
               fy.a $$8 = fy.a($$0.a(lf.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dec.kN) ? null : new ell.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected elk<?> a() {
      return elk.h;
   }
}
