import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eyz<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final eyz<MinecraftServer> a = new eyz<MinecraftServer>().a(new eyw.a()).a(new eyx.a());
   private final Map<ali, eyy.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eyy.a<C, ?>> d = Maps.newHashMap();

   public eyz<C> a(eyy.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eyy<C>> eyy.a<C, T> a(Class<?> $$0) {
      return (eyy.a<C, T>)this.d.get($$0);
   }

   public <T extends eyy<C>> uk a(T $$0) {
      eyy.a<C, T> $$1 = this.a($$0.getClass());
      uk $$2 = new uk();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eyy<C> a(uk $$0) {
      ali $$1 = ali.c($$0.l("Type"));
      eyy.a<C, ?> $$2 = this.c.get($$1);
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
