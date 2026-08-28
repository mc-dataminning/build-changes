import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eve<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final eve<MinecraftServer> a = new eve<MinecraftServer>().a(new evb.a()).a(new evc.a());
   private final Map<alf, evd.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, evd.a<C, ?>> d = Maps.newHashMap();

   public eve<C> a(evd.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends evd<C>> evd.a<C, T> a(Class<?> $$0) {
      return (evd.a<C, T>)this.d.get($$0);
   }

   public <T extends evd<C>> us a(T $$0) {
      evd.a<C, T> $$1 = this.a($$0.getClass());
      us $$2 = new us();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public evd<C> a(us $$0) {
      alf $$1 = alf.a($$0.l("Type"));
      evd.a<C, ?> $$2 = this.c.get($$1);
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
