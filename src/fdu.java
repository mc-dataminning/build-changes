import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fdu<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fdu<MinecraftServer> a = new fdu<MinecraftServer>().a(new fdr.a()).a(new fds.a());
   private final Map<alg, fdt.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fdt.a<C, ?>> d = Maps.newHashMap();

   public fdu<C> a(fdt.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fdt<C>> fdt.a<C, T> a(Class<?> $$0) {
      return (fdt.a<C, T>)this.d.get($$0);
   }

   public <T extends fdt<C>> tz a(T $$0) {
      fdt.a<C, T> $$1 = this.a($$0.getClass());
      tz $$2 = new tz();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fdt<C> a(tz $$0) {
      alg $$1 = alg.c($$0.l("Type"));
      fdt.a<C, ?> $$2 = this.c.get($$1);
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
