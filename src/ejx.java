import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejx extends ekm {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejx> a = Codec.unit(() -> ejx.b);
   public static final ejx b = new ejx();

   private ejx() {
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      dqh $$6 = $$4.b();
      if ($$6.a(ddg.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dqh $$9;
            try {
               fx.a $$8 = fx.a($$0.a(le.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(ddg.kN) ? null : new ekp.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eko<?> a() {
      return eko.h;
   }
}
