import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class epf<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final epf<MinecraftServer> a = new epf<MinecraftServer>().a(new epc.a()).a(new epd.a());
   private final Map<ajh, epe.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, epe.a<C, ?>> d = Maps.newHashMap();

   public epf<C> a(epe.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends epe<C>> epe.a<C, T> a(Class<?> $$0) {
      return (epe.a<C, T>)this.d.get($$0);
   }

   public <T extends epe<C>> ta a(T $$0) {
      epe.a<C, T> $$1 = this.a($$0.getClass());
      ta $$2 = new ta();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public epe<C> a(ta $$0) {
      ajh $$1 = ajh.a($$0.l("Type"));
      epe.a<C, ?> $$2 = this.c.get($$1);
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
