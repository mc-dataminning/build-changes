import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class evd<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final evd<MinecraftServer> a = new evd<MinecraftServer>().a(new eva.a()).a(new evb.a());
   private final Map<alf, evc.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, evc.a<C, ?>> d = Maps.newHashMap();

   public evd<C> a(evc.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends evc<C>> evc.a<C, T> a(Class<?> $$0) {
      return (evc.a<C, T>)this.d.get($$0);
   }

   public <T extends evc<C>> us a(T $$0) {
      evc.a<C, T> $$1 = this.a($$0.getClass());
      us $$2 = new us();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public evc<C> a(us $$0) {
      alf $$1 = alf.a($$0.l("Type"));
      evc.a<C, ?> $$2 = this.c.get($$1);
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
