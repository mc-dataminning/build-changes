import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ekn<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final ekn<MinecraftServer> a = new ekn<MinecraftServer>().a(new ekk.a()).a(new ekl.a());
   private final Map<agt, ekm.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, ekm.a<C, ?>> d = Maps.newHashMap();

   public ekn<C> a(ekm.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends ekm<C>> ekm.a<C, T> a(Class<?> $$0) {
      return (ekm.a<C, T>)this.d.get($$0);
   }

   public <T extends ekm<C>> sj a(T $$0) {
      ekm.a<C, T> $$1 = this.a($$0.getClass());
      sj $$2 = new sj();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public ekm<C> a(sj $$0) {
      agt $$1 = agt.a($$0.l("Type"));
      ekm.a<C, ?> $$2 = this.c.get($$1);
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
