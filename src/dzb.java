import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzb extends dzq {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dzb> a = Codec.unit(() -> dzb.b);
   public static final dzb b = new dzb();

   private dzb() {
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      dgb $$6 = $$4.b();
      if ($$6.a(cuc.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dgb $$9;
            try {
               fk.a $$8 = fk.a($$0.a(jz.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cuc.kN) ? null : new dzt.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dzs<?> a() {
      return dzs.h;
   }
}
