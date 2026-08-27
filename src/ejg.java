import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ejg<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ejg<MinecraftServer> a = new ejg<MinecraftServer>().a(new ejd.a()).a(new eje.a());
   private final Map<agi, ejf.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ejf.a<C, ?>> d = Maps.newHashMap();

   public ejg<C> a(ejf.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ejf<C>> ejf.a<C, T> a(Class<?> $$0) {
      return (ejf.a<C, T>)this.d.get($$0);
   }

   public <T extends ejf<C>> rz a(T $$0) {
      ejf.a<C, T> $$1 = this.a($$0.getClass());
      rz $$2 = new rz();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ejf<C> a(rz $$0) {
      agi $$1 = agi.a($$0.l("Type"));
      ejf.a<C, ?> $$2 = this.c.get($$1);
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
