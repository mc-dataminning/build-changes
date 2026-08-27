import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efo extends egd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efo> a = Codec.unit(() -> efo.b);
   public static final efo b = new efo();

   private efo() {
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      dme $$6 = $$4.b();
      if ($$6.a(czh.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dme $$9;
            try {
               fm.a $$8 = fm.a($$0.a(ki.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(czh.kN) ? null : new egg.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected egf<?> a() {
      return egf.h;
   }
}
