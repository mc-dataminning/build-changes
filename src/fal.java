import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fal<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fal<MinecraftServer> a = new fal<MinecraftServer>().a(new fai.a()).a(new faj.a());
   private final Map<akv, fak.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fak.a<C, ?>> d = Maps.newHashMap();

   public fal<C> a(fak.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fak<C>> fak.a<C, T> a(Class<?> $$0) {
      return (fak.a<C, T>)this.d.get($$0);
   }

   public <T extends fak<C>> tq a(T $$0) {
      fak.a<C, T> $$1 = this.a($$0.getClass());
      tq $$2 = new tq();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fak<C> a(tq $$0) {
      akv $$1 = akv.c($$0.l("Type"));
      fak.a<C, ?> $$2 = this.c.get($$1);
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
