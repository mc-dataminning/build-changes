import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class elo<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final elo<MinecraftServer> a = new elo<MinecraftServer>().a(new ell.a()).a(new elm.a());
   private final Map<ahh, eln.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eln.a<C, ?>> d = Maps.newHashMap();

   public elo<C> a(eln.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eln<C>> eln.a<C, T> a(Class<?> $$0) {
      return (eln.a<C, T>)this.d.get($$0);
   }

   public <T extends eln<C>> so a(T $$0) {
      eln.a<C, T> $$1 = this.a($$0.getClass());
      so $$2 = new so();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eln<C> a(so $$0) {
      ahh $$1 = ahh.a($$0.l("Type"));
      eln.a<C, ?> $$2 = this.c.get($$1);
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
