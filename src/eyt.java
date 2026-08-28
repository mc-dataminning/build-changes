import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eyt<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final eyt<MinecraftServer> a = new eyt<MinecraftServer>().a(new eyq.a()).a(new eyr.a());
   private final Map<alh, eys.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eys.a<C, ?>> d = Maps.newHashMap();

   public eyt<C> a(eys.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eys<C>> eys.a<C, T> a(Class<?> $$0) {
      return (eys.a<C, T>)this.d.get($$0);
   }

   public <T extends eys<C>> uj a(T $$0) {
      eys.a<C, T> $$1 = this.a($$0.getClass());
      uj $$2 = new uj();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eys<C> a(uj $$0) {
      alh $$1 = alh.c($$0.l("Type"));
      eys.a<C, ?> $$2 = this.c.get($$1);
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
