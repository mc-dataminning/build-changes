import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elq extends emf {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<elq> a = MapCodec.unit(() -> elq.b);
   public static final elq b = new elq();

   private elq() {
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      dsa $$6 = $$4.b();
      if ($$6.a(dez.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dsa $$9;
            try {
               gj.a $$8 = gj.a($$0.a(lq.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dez.kN) ? null : new emi.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected emh<?> a() {
      return emh.h;
   }
}
