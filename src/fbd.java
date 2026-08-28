import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class fbd<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final fbd<MinecraftServer> a = new fbd<MinecraftServer>().a(new fba.a()).a(new fbb.a());
   private final Map<alp, fbc.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, fbc.a<C, ?>> d = Maps.newHashMap();

   public fbd<C> a(fbc.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends fbc<C>> fbc.a<C, T> a(Class<?> $$0) {
      return (fbc.a<C, T>)this.d.get($$0);
   }

   public <T extends fbc<C>> um a(T $$0) {
      fbc.a<C, T> $$1 = this.a($$0.getClass());
      um $$2 = new um();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public fbc<C> a(um $$0) {
      alp $$1 = alp.c($$0.l("Type"));
      fbc.a<C, ?> $$2 = this.c.get($$1);
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
