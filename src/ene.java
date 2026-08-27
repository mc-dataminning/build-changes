import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ene<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ene<MinecraftServer> a = new ene<MinecraftServer>().a(new enb.a()).a(new enc.a());
   private final Map<aiy, end.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, end.a<C, ?>> d = Maps.newHashMap();

   public ene<C> a(end.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends end<C>> end.a<C, T> a(Class<?> $$0) {
      return (end.a<C, T>)this.d.get($$0);
   }

   public <T extends end<C>> sw a(T $$0) {
      end.a<C, T> $$1 = this.a($$0.getClass());
      sw $$2 = new sw();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public end<C> a(sw $$0) {
      aiy $$1 = aiy.a($$0.l("Type"));
      end.a<C, ?> $$2 = this.c.get($$1);
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
