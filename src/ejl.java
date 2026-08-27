import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ejl<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ejl<MinecraftServer> a = new ejl<MinecraftServer>().a(new eji.a()).a(new ejj.a());
   private final Map<agm, ejk.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ejk.a<C, ?>> d = Maps.newHashMap();

   public ejl<C> a(ejk.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ejk<C>> ejk.a<C, T> a(Class<?> $$0) {
      return (ejk.a<C, T>)this.d.get($$0);
   }

   public <T extends ejk<C>> sd a(T $$0) {
      ejk.a<C, T> $$1 = this.a($$0.getClass());
      sd $$2 = new sd();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ejk<C> a(sd $$0) {
      agm $$1 = agm.a($$0.l("Type"));
      ejk.a<C, ?> $$2 = this.c.get($$1);
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
