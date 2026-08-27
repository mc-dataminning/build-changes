import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class edu<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final edu<MinecraftServer> a = new edu<MinecraftServer>().a(new edr.a()).a(new eds.a());
   private final Map<acq, edt.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, edt.a<C, ?>> d = Maps.newHashMap();

   public edu<C> a(edt.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends edt<C>> edt.a<C, T> a(Class<?> $$0) {
      return (edt.a<C, T>)this.d.get($$0);
   }

   public <T extends edt<C>> qr a(T $$0) {
      edt.a<C, T> $$1 = this.a($$0.getClass());
      qr $$2 = new qr();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public edt<C> a(qr $$0) {
      acq $$1 = acq.a($$0.l("Type"));
      edt.a<C, ?> $$2 = this.c.get($$1);
      if ($$2 == null) {
         b.error("Failed to deserialize timer callback: {}", $$0);
         return null;
      } else {
         try {
            return $$2.b($$0);
         } catch (Exception var5) {
            b.error("Failed to deserialize timer callback: {}", $$0, var5);
            return null;
         }
      }
   }
}
