import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ehb<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ehb<MinecraftServer> a = new ehb<MinecraftServer>().a(new egy.a()).a(new egz.a());
   private final Map<aey, eha.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eha.a<C, ?>> d = Maps.newHashMap();

   public ehb<C> a(eha.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eha<C>> eha.a<C, T> a(Class<?> $$0) {
      return (eha.a<C, T>)this.d.get($$0);
   }

   public <T extends eha<C>> qy a(T $$0) {
      eha.a<C, T> $$1 = this.a($$0.getClass());
      qy $$2 = new qy();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eha<C> a(qy $$0) {
      aey $$1 = aey.a($$0.l("Type"));
      eha.a<C, ?> $$2 = this.c.get($$1);
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
