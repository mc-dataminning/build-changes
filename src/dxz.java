import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxz extends dyo {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<dxz> a = Codec.unit(() -> dxz.b);
   public static final dxz b = new dxz();

   private dxz() {
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      dez $$6 = $$4.b();
      if ($$6.a(csm.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dez $$9;
            try {
               fg.a $$8 = fg.a($$0.a(jc.e), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(csm.kN) ? null : new dyr.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected dyq<?> a() {
      return dyq.h;
   }
}
