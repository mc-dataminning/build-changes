import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ehr<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ehr<MinecraftServer> a = new ehr<MinecraftServer>().a(new eho.a()).a(new ehp.a());
   private final Map<afw, ehq.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ehq.a<C, ?>> d = Maps.newHashMap();

   public ehr<C> a(ehq.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ehq<C>> ehq.a<C, T> a(Class<?> $$0) {
      return (ehq.a<C, T>)this.d.get($$0);
   }

   public <T extends ehq<C>> rt a(T $$0) {
      ehq.a<C, T> $$1 = this.a($$0.getClass());
      rt $$2 = new rt();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ehq<C> a(rt $$0) {
      afw $$1 = afw.a($$0.l("Type"));
      ehq.a<C, ?> $$2 = this.c.get($$1);
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
