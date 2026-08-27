import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class erv<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final erv<MinecraftServer> a = new erv<MinecraftServer>().a(new ers.a()).a(new ert.a());
   private final Map<ajv, eru.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eru.a<C, ?>> d = Maps.newHashMap();

   public erv<C> a(eru.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eru<C>> eru.a<C, T> a(Class<?> $$0) {
      return (eru.a<C, T>)this.d.get($$0);
   }

   public <T extends eru<C>> to a(T $$0) {
      eru.a<C, T> $$1 = this.a($$0.getClass());
      to $$2 = new to();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eru<C> a(to $$0) {
      ajv $$1 = ajv.a($$0.l("Type"));
      eru.a<C, ?> $$2 = this.c.get($$1);
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
