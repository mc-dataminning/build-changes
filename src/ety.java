import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ety<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ety<MinecraftServer> a = new ety<MinecraftServer>().a(new etv.a()).a(new etw.a());
   private final Map<akn, etx.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, etx.a<C, ?>> d = Maps.newHashMap();

   public ety<C> a(etx.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends etx<C>> etx.a<C, T> a(Class<?> $$0) {
      return (etx.a<C, T>)this.d.get($$0);
   }

   public <T extends etx<C>> ud a(T $$0) {
      etx.a<C, T> $$1 = this.a($$0.getClass());
      ud $$2 = new ud();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public etx<C> a(ud $$0) {
      akn $$1 = akn.a($$0.l("Type"));
      etx.a<C, ?> $$2 = this.c.get($$1);
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
