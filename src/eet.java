import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eet extends efi {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eet> a = Codec.unit(() -> eet.b);
   public static final eet b = new eet();

   private eet() {
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      dlj $$6 = $$4.b();
      if ($$6.a(cyu.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dlj $$9;
            try {
               fm.a $$8 = fm.a($$0.a(kg.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(cyu.kN) ? null : new efl.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected efk<?> a() {
      return efk.h;
   }
}
