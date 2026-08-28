import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fdi<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fdi<MinecraftServer> a = new fdi<MinecraftServer>().a(new fdf.a()).a(new fdg.a());
   private final Map<ale, fdh.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fdh.a<C, ?>> d = Maps.newHashMap();

   public fdi<C> a(fdh.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fdh<C>> fdh.a<C, T> a(Class<?> $$0) {
      return (fdh.a<C, T>)this.d.get($$0);
   }

   public <T extends fdh<C>> tx a(T $$0) {
      fdh.a<C, T> $$1 = this.a($$0.getClass());
      tx $$2 = new tx();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fdh<C> a(tx $$0) {
      ale $$1 = ale.c($$0.l("Type"));
      fdh.a<C, ?> $$2 = this.c.get($$1);
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
