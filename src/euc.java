import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euc extends eus {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<euc> a = MapCodec.unit(() -> euc.b);
   public static final euc b = new euc();

   private euc() {
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      dzz $$6 = $$4.b();
      if ($$6.a(dmc.pE)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dzz $$9;
            try {
               gd.a $$8 = gd.a($$0.a(mg.i), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, var11.getMessage()});
               return null;
            }

            return $$9.a(dmc.lq) ? null : new euv.d($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected euu<?> a() {
      return euu.h;
   }
}
