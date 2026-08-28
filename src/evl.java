import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class evl<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final evl<MinecraftServer> a = new evl<MinecraftServer>().a(new evi.a()).a(new evj.a());
   private final Map<akk, evk.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, evk.a<C, ?>> d = Maps.newHashMap();

   public evl<C> a(evk.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends evk<C>> evk.a<C, T> a(Class<?> $$0) {
      return (evk.a<C, T>)this.d.get($$0);
   }

   public <T extends evk<C>> tx a(T $$0) {
      evk.a<C, T> $$1 = this.a($$0.getClass());
      tx $$2 = new tx();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public evk<C> a(tx $$0) {
      akk $$1 = akk.a($$0.l("Type"));
      evk.a<C, ?> $$2 = this.c.get($$1);
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
