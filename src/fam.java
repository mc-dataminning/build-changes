import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fam<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fam<MinecraftServer> a = new fam<MinecraftServer>().a(new faj.a()).a(new fak.a());
   private final Map<akv, fal.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fal.a<C, ?>> d = Maps.newHashMap();

   public fam<C> a(fal.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fal<C>> fal.a<C, T> a(Class<?> $$0) {
      return (fal.a<C, T>)this.d.get($$0);
   }

   public <T extends fal<C>> tq a(T $$0) {
      fal.a<C, T> $$1 = this.a($$0.getClass());
      tq $$2 = new tq();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fal<C> a(tq $$0) {
      akv $$1 = akv.c($$0.l("Type"));
      fal.a<C, ?> $$2 = this.c.get($$1);
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
