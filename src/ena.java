import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ena extends enq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ena> a = MapCodec.unit(() -> ena.b);
   public static final ena b = new ena();

   private ena() {
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      dtc $$6 = $$4.b();
      if ($$6.a(dga.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dtc $$9;
            try {
               gn.a $$8 = gn.a($$0.a(lu.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dga.kN) ? null : new ent.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected ens<?> a() {
      return ens.h;
   }
}
