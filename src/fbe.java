import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fbe<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fbe<MinecraftServer> a = new fbe<MinecraftServer>().a(new fbb.a()).a(new fbc.a());
   private final Map<alz, fbd.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fbd.a<C, ?>> d = Maps.newHashMap();

   public fbe<C> a(fbd.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fbd<C>> fbd.a<C, T> a(Class<?> $$0) {
      return (fbd.a<C, T>)this.d.get($$0);
   }

   public <T extends fbd<C>> ux a(T $$0) {
      fbd.a<C, T> $$1 = this.a($$0.getClass());
      ux $$2 = new ux();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fbd<C> a(ux $$0) {
      alz $$1 = alz.c($$0.l("Type"));
      fbd.a<C, ?> $$2 = this.c.get($$1);
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
