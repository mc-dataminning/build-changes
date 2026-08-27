import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class erm<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final erm<MinecraftServer> a = new erm<MinecraftServer>().a(new erj.a()).a(new erk.a());
   private final Map<ajt, erl.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, erl.a<C, ?>> d = Maps.newHashMap();

   public erm<C> a(erl.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends erl<C>> erl.a<C, T> a(Class<?> $$0) {
      return (erl.a<C, T>)this.d.get($$0);
   }

   public <T extends erl<C>> tm a(T $$0) {
      erl.a<C, T> $$1 = this.a($$0.getClass());
      tm $$2 = new tm();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public erl<C> a(tm $$0) {
      ajt $$1 = ajt.a($$0.l("Type"));
      erl.a<C, ?> $$2 = this.c.get($$1);
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
