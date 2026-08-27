import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ele<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ele<MinecraftServer> a = new ele<MinecraftServer>().a(new elb.a()).a(new elc.a());
   private final Map<ahg, eld.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eld.a<C, ?>> d = Maps.newHashMap();

   public ele<C> a(eld.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eld<C>> eld.a<C, T> a(Class<?> $$0) {
      return (eld.a<C, T>)this.d.get($$0);
   }

   public <T extends eld<C>> sn a(T $$0) {
      eld.a<C, T> $$1 = this.a($$0.getClass());
      sn $$2 = new sn();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eld<C> a(sn $$0) {
      ahg $$1 = ahg.a($$0.l("Type"));
      eld.a<C, ?> $$2 = this.c.get($$1);
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
