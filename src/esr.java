import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class esr<C> {
   private static final Logger b = LogUtils.getLogger();
   public static final esr<MinecraftServer> a = new esr<MinecraftServer>().a(new eso.a()).a(new esp.a());
   private final Map<akf, esq.a<C, ?>> c = Maps.newHashMap();
   private final Map<Class<?>, esq.a<C, ?>> d = Maps.newHashMap();

   public esr<C> a(esq.a<C, ?> $$0) {
      this.c.put($$0.a(), $$0);
      this.d.put($$0.b(), $$0);
      return this;
   }

   private <T extends esq<C>> esq.a<C, T> a(Class<?> $$0) {
      return (esq.a<C, T>)this.d.get($$0);
   }

   public <T extends esq<C>> ty a(T $$0) {
      esq.a<C, T> $$1 = this.a($$0.getClass());
      ty $$2 = new ty();
      $$1.a($$2, $$0);
      $$2.a("Type", $$1.a().toString());
      return $$2;
   }

   @Nullable
   public esq<C> a(ty $$0) {
      akf $$1 = akf.a($$0.l("Type"));
      esq.a<C, ?> $$2 = this.c.get($$1);
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
