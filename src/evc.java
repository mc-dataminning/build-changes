import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class evc<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final evc<MinecraftServer> a = new evc<MinecraftServer>().a(new euz.a()).a(new eva.a());
   private final Map<ale, evb.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, evb.a<C, ?>> d = Maps.newHashMap();

   public evc<C> a(evb.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends evb<C>> evb.a<C, T> a(Class<?> $$0) {
      return (evb.a<C, T>)this.d.get($$0);
   }

   public <T extends evb<C>> ur a(T $$0) {
      evb.a<C, T> $$1 = this.a($$0.getClass());
      ur $$2 = new ur();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public evb<C> a(ur $$0) {
      ale $$1 = ale.a($$0.l("Type"));
      evb.a<C, ?> $$2 = this.c.get($$1);
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
