import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fbk<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fbk<MinecraftServer> a = new fbk<MinecraftServer>().a(new fbh.a()).a(new fbi.a());
   private final Map<alz, fbj.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fbj.a<C, ?>> d = Maps.newHashMap();

   public fbk<C> a(fbj.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fbj<C>> fbj.a<C, T> a(Class<?> $$0) {
      return (fbj.a<C, T>)this.d.get($$0);
   }

   public <T extends fbj<C>> ux a(T $$0) {
      fbj.a<C, T> $$1 = this.a($$0.getClass());
      ux $$2 = new ux();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fbj<C> a(ux $$0) {
      alz $$1 = alz.c($$0.l("Type"));
      fbj.a<C, ?> $$2 = this.c.get($$1);
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
