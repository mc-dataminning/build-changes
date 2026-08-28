import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ewi<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ewi<MinecraftServer> a = new ewi<MinecraftServer>().a(new ewf.a()).a(new ewg.a());
   private final Map<akq, ewh.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ewh.a<C, ?>> d = Maps.newHashMap();

   public ewi<C> a(ewh.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ewh<C>> ewh.a<C, T> a(Class<?> $$0) {
      return (ewh.a<C, T>)this.d.get($$0);
   }

   public <T extends ewh<C>> ua a(T $$0) {
      ewh.a<C, T> $$1 = this.a($$0.getClass());
      ua $$2 = new ua();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ewh<C> a(ua $$0) {
      akq $$1 = akq.c($$0.l("Type"));
      ewh.a<C, ?> $$2 = this.c.get($$1);
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
