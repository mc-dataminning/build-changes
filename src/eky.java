import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eky<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final eky<MinecraftServer> a = new eky<MinecraftServer>().a(new ekv.a()).a(new ekw.a());
   private final Map<ahd, ekx.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ekx.a<C, ?>> d = Maps.newHashMap();

   public eky<C> a(ekx.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ekx<C>> ekx.a<C, T> a(Class<?> $$0) {
      return (ekx.a<C, T>)this.d.get($$0);
   }

   public <T extends ekx<C>> sl a(T $$0) {
      ekx.a<C, T> $$1 = this.a($$0.getClass());
      sl $$2 = new sl();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ekx<C> a(sl $$0) {
      ahd $$1 = ahd.a($$0.l("Type"));
      ekx.a<C, ?> $$2 = this.c.get($$1);
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
