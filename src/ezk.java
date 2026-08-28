import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ezk<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ezk<MinecraftServer> a = new ezk<MinecraftServer>().a(new ezh.a()).a(new ezi.a());
   private final Map<alj, ezj.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ezj.a<C, ?>> d = Maps.newHashMap();

   public ezk<C> a(ezj.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ezj<C>> ezj.a<C, T> a(Class<?> $$0) {
      return (ezj.a<C, T>)this.d.get($$0);
   }

   public <T extends ezj<C>> ul a(T $$0) {
      ezj.a<C, T> $$1 = this.a($$0.getClass());
      ul $$2 = new ul();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ezj<C> a(ul $$0) {
      alj $$1 = alj.c($$0.l("Type"));
      ezj.a<C, ?> $$2 = this.c.get($$1);
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
