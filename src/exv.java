import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class exv {
   private static final Map<String, exv.a> a = Maps.newHashMap();
   private static final Logger b = LogUtils.getLogger();
   private static final ajh c = new ajh("textures/gui/presets/isles.png");

   public static ajh a(String $$0, @Nullable String $$1) {
      return $$1 == null ? c : b($$0, $$1);
   }

   private static ajh b(String $$0, String $$1) {
      exv.a $$2 = a.get($$0);
      if ($$2 != null && $$2.a().equals($$1)) {
         return $$2.b;
      } else {
         eta $$3 = a($$1);
         if ($$3 == null) {
            ajh $$4 = gip.b();
            a.put($$0, new exv.a($$1, $$4));
            return $$4;
         } else {
            ajh $$5 = new ajh("realms", "dynamic/" + $$0);
            ezg.Q().aa().a($$5, new gim($$3));
            a.put($$0, new exv.a($$1, $$5));
            return $$5;
         }
      }
   }

   @Nullable
   private static eta a(String $$0) {
      byte[] $$1 = Base64.getDecoder().decode($$0);
      ByteBuffer $$2 = MemoryUtil.memAlloc($$1.length);

      try {
         return eta.a($$2.put($$1).flip());
      } catch (IOException var7) {
         b.warn("Failed to load world image: {}", $$0, var7);
      } finally {
         MemoryUtil.memFree($$2);
      }

      return null;
   }

   public static record a(String a, ajh b) {
   }
}
