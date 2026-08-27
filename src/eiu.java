import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eiu<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final eiu<MinecraftServer> a = new eiu<MinecraftServer>().a(new eir.a()).a(new eis.a());
   private final Map<agg, eit.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, eit.a<C, ?>> d = Maps.newHashMap();

   public eiu<C> a(eit.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends eit<C>> eit.a<C, T> a(Class<?> $$0) {
      return (eit.a<C, T>)this.d.get($$0);
   }

   public <T extends eit<C>> rz a(T $$0) {
      eit.a<C, T> $$1 = this.a($$0.getClass());
      rz $$2 = new rz();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public eit<C> a(rz $$0) {
      agg $$1 = agg.a($$0.l("Type"));
      eit.a<C, ?> $$2 = this.c.get($$1);
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
