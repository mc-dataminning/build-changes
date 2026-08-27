import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enb extends enq {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<enb> a = Codec.unit(() -> enb.b);
   public static final enb b = new enb();

   private enb() {
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      dtc $$6 = $$4.b();
      if ($$6.a(dfe.qm)) {
         if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", $$1);
            return $$4;
         } else {
            String $$7 = $$4.c().l("final_state");

            dtc $$9;
            try {
               gb.a $$8 = gb.a($$0.a(li.f), $$7, true);
               $$9 = $$8.a();
            } catch (CommandSyntaxException var11) {
               throw new RuntimeException(var11);
            }

            return $$9.a(dfe.lL) ? null : new ent.c($$4.a(), $$9, null);
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
