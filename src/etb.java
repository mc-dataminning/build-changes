import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class etb<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final etb<MinecraftServer> a = new etb<MinecraftServer>().a(new esy.a()).a(new esz.a());
   private final Map<akh, eta.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eta.a<C, ?>> d = Maps.newHashMap();

   public etb<C> a(eta.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eta<C>> eta.a<C, T> a(Class<?> $$0) {
      return (eta.a<C, T>)this.d.get($$0);
   }

   public <T extends eta<C>> ua a(T $$0) {
      eta.a<C, T> $$1 = this.a($$0.getClass());
      ua $$2 = new ua();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eta<C> a(ua $$0) {
      akh $$1 = akh.a($$0.l("Type"));
      eta.a<C, ?> $$2 = this.c.get($$1);
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
