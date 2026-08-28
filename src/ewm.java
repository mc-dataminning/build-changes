import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ewm<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ewm<MinecraftServer> a = new ewm<MinecraftServer>().a(new ewj.a()).a(new ewk.a());
   private final Map<akr, ewl.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ewl.a<C, ?>> d = Maps.newHashMap();

   public ewm<C> a(ewl.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ewl<C>> ewl.a<C, T> a(Class<?> $$0) {
      return (ewl.a<C, T>)this.d.get($$0);
   }

   public <T extends ewl<C>> ub a(T $$0) {
      ewl.a<C, T> $$1 = this.a($$0.getClass());
      ub $$2 = new ub();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ewl<C> a(ub $$0) {
      akr $$1 = akr.c($$0.l("Type"));
      ewl.a<C, ?> $$2 = this.c.get($$1);
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
