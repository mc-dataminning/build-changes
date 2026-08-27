import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvb extends dvq {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dvb> a = Codec.unit(() -> dvb.b);
   public static final dvb b = new dvb();

   private dvb() {
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      dcb $$6 = $$4.b();
      if ($$6.a(cpo.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dcb $$9;
            try {
               fg.a $$8 = fg.a($$0.a(jc.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cpo.kN) ? null : new dvt.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dvs<?> a() {
      return dvs.h;
   }
}
