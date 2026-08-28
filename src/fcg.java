import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fcg<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fcg<MinecraftServer> a = new fcg<MinecraftServer>().a(new fcd.a()).a(new fce.a());
   private final Map<ald, fcf.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fcf.a<C, ?>> d = Maps.newHashMap();

   public fcg<C> a(fcf.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fcf<C>> fcf.a<C, T> a(Class<?> $$0) {
      return (fcf.a<C, T>)this.d.get($$0);
   }

   public <T extends fcf<C>> tw a(T $$0) {
      fcf.a<C, T> $$1 = this.a($$0.getClass());
      tw $$2 = new tw();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fcf<C> a(tw $$0) {
      ald $$1 = ald.c($$0.l("Type"));
      fcf.a<C, ?> $$2 = this.c.get($$1);
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
