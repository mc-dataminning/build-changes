import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eln extends emc {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eln> a = MapCodec.unit(() -> eln.b);
   public static final eln b = new eln();

   private eln() {
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      drx $$6 = $$4.b();
      if ($$6.a(dew.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            drx $$9;
            try {
               gj.a $$8 = gj.a($$0.a(lq.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dew.kN) ? null : new emf.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eme<?> a() {
      return eme.h;
   }
}
