import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class egr<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final egr<MinecraftServer> a = new egr<MinecraftServer>().a(new ego.a()).a(new egp.a());
   private final Map<aep, egq.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, egq.a<C, ?>> d = Maps.newHashMap();

   public egr<C> a(egq.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends egq<C>> egq.a<C, T> a(Class<?> $$0) {
      return (egq.a<C, T>)this.d.get($$0);
   }

   public <T extends egq<C>> qs a(T $$0) {
      egq.a<C, T> $$1 = this.a($$0.getClass());
      qs $$2 = new qs();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public egq<C> a(qs $$0) {
      aep $$1 = aep.a($$0.l("Type"));
      egq.a<C, ?> $$2 = this.c.get($$1);
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
