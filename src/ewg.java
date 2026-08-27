import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ewg<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ewg<MinecraftServer> a = new ewg<MinecraftServer>().a(new ewd.a()).a(new ewe.a());
   private final Map<akt, ewf.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ewf.a<C, ?>> d = Maps.newHashMap();

   public ewg<C> a(ewf.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ewf<C>> ewf.a<C, T> a(Class<?> $$0) {
      return (ewf.a<C, T>)this.d.get($$0);
   }

   public <T extends ewf<C>> uk a(T $$0) {
      ewf.a<C, T> $$1 = this.a($$0.getClass());
      uk $$2 = new uk();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ewf<C> a(uk $$0) {
      akt $$1 = akt.a($$0.l("Type"));
      ewf.a<C, ?> $$2 = this.c.get($$1);
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
