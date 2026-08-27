import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekr extends elg {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ekr> a = MapCodec.unit(() -> ekr.b);
   public static final ekr b = new ekr();

   private ekr() {
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      drb $$6 = $$4.b();
      if ($$6.a(dea.pb)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            drb $$9;
            try {
               fy.a $$8 = fy.a($$0.a(lf.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dea.kN) ? null : new elj.c($$4.a(), $$9, null);
         }
      } else {
         return $$4;
      }
   }

   @Override
   protected eli<?> a() {
      return eli.h;
   }
}
