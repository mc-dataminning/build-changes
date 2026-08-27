import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class egt<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final egt<MinecraftServer> a = new egt<MinecraftServer>().a(new egq.a()).a(new egr.a());
   private final Map<aez, egs.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, egs.a<C, ?>> d = Maps.newHashMap();

   public egt<C> a(egs.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends egs<C>> egs.a<C, T> a(Class<?> $$0) {
      return (egs.a<C, T>)this.d.get($$0);
   }

   public <T extends egs<C>> qw a(T $$0) {
      egs.a<C, T> $$1 = this.a($$0.getClass());
      qw $$2 = new qw();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public egs<C> a(qw $$0) {
      aez $$1 = aez.a($$0.l("Type"));
      egs.a<C, ?> $$2 = this.c.get($$1);
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
