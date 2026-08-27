import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class enl<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final enl<MinecraftServer> a = new enl<MinecraftServer>().a(new eni.a()).a(new enj.a());
   private final Map<aiy, enk.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, enk.a<C, ?>> d = Maps.newHashMap();

   public enl<C> a(enk.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends enk<C>> enk.a<C, T> a(Class<?> $$0) {
      return (enk.a<C, T>)this.d.get($$0);
   }

   public <T extends enk<C>> sw a(T $$0) {
      enk.a<C, T> $$1 = this.a($$0.getClass());
      sw $$2 = new sw();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public enk<C> a(sw $$0) {
      aiy $$1 = aiy.a($$0.l("Type"));
      enk.a<C, ?> $$2 = this.c.get($$1);
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
