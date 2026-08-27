import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class egp<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final egp<MinecraftServer> a = new egp<MinecraftServer>().a(new egm.a()).a(new egn.a());
   private final Map<aer, ego.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ego.a<C, ?>> d = Maps.newHashMap();

   public egp<C> a(ego.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ego<C>> ego.a<C, T> a(Class<?> $$0) {
      return (ego.a<C, T>)this.d.get($$0);
   }

   public <T extends ego<C>> qr a(T $$0) {
      ego.a<C, T> $$1 = this.a($$0.getClass());
      qr $$2 = new qr();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ego<C> a(qr $$0) {
      aer $$1 = aer.a($$0.l("Type"));
      ego.a<C, ?> $$2 = this.c.get($$1);
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
