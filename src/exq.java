import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class exq<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final exq<MinecraftServer> a = new exq<MinecraftServer>().a(new exn.a()).a(new exo.a());
   private final Map<alb, exp.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, exp.a<C, ?>> d = Maps.newHashMap();

   public exq<C> a(exp.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends exp<C>> exp.a<C, T> a(Class<?> $$0) {
      return (exp.a<C, T>)this.d.get($$0);
   }

   public <T extends exp<C>> uf a(T $$0) {
      exp.a<C, T> $$1 = this.a($$0.getClass());
      uf $$2 = new uf();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public exp<C> a(uf $$0) {
      alb $$1 = alb.c($$0.l("Type"));
      exp.a<C, ?> $$2 = this.c.get($$1);
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
