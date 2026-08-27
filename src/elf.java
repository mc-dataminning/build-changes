import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class elf<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final elf<MinecraftServer> a = new elf<MinecraftServer>().a(new elc.a()).a(new eld.a());
   private final Map<ahg, ele.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ele.a<C, ?>> d = Maps.newHashMap();

   public elf<C> a(ele.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ele<C>> ele.a<C, T> a(Class<?> $$0) {
      return (ele.a<C, T>)this.d.get($$0);
   }

   public <T extends ele<C>> sn a(T $$0) {
      ele.a<C, T> $$1 = this.a($$0.getClass());
      sn $$2 = new sn();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ele<C> a(sn $$0) {
      ahg $$1 = ahg.a($$0.l("Type"));
      ele.a<C, ?> $$2 = this.c.get($$1);
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
