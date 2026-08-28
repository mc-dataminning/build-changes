import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fps {
   private static final Map<String, fps.a> a = Maps.newHashMap();
   private static final Logger b = LogUtils.getLogger();
   private static final ali c = ali.b("textures/gui/presets/isles.png");

   public static ali a(String $$0, @Nullable String $$1) {
      return $$1 == null ? c : b($$0, $$1);
   }

   private static ali b(String $$0, String $$1) {
      fps.a $$2 = a.get($$0);
      if ($$2 != null && $$2.a().equals($$1)) {
         return $$2.b;
      } else {
         fkg $$3 = a($$1);
         if ($$3 == null) {
            ali $$4 = hkp.c();
            a.put($$0, new fps.a($$1, $$4));
            return $$4;
         } else {
            ali $$5 = ali.a("realms", "dynamic/" + $$0);
            frd.Q().aa().a($$5, new hkn($$5::toString, $$3));
            a.put($$0, new fps.a($$1, $$5));
            return $$5;
         }
      }
   }

   @Nullable
   private static fkg a(String $$0) {
      byte[] $$1 = Base64.getDecoder().decode($$0);
      ByteBuffer $$2 = MemoryUtil.memAlloc($$1.length);

      try {
         return fkg.a($$2.put($$1).flip());
      } catch (IOException var7) {
         b.warn("Failed to load world image: {}", $$0, var7);
      } finally {
         MemoryUtil.memFree($$2);
      }

      return null;
   }

   public static record a(String a, ali b) {
   }
}
