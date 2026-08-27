import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class evw {
   private static final Map<String, evw.a> a = Maps.newHashMap();
   private static final Logger b = LogUtils.getLogger();
   private static final aiy c = new aiy("textures/gui/presets/isles.png");

   public static aiy a(String $$0, @Nullable String $$1) {
      return $$1 == null ? c : b($$0, $$1);
   }

   private static aiy b(String $$0, String $$1) {
      evw.a $$2 = a.get($$0);
      if ($$2 != null && $$2.a().equals($$1)) {
         return $$2.b;
      } else {
         erb $$3 = a($$1);
         if ($$3 == null) {
            aiy $$4 = ggk.b();
            a.put($$0, new evw.a($$1, $$4));
            return $$4;
         } else {
            aiy $$5 = new aiy("realms", "dynamic/" + $$0);
            exh.O().Y().a($$5, new ggh($$3));
            a.put($$0, new evw.a($$1, $$5));
            return $$5;
         }
      }
   }

   @Nullable
   private static erb a(String $$0) {
      byte[] $$1 = Base64.getDecoder().decode($$0);
      ByteBuffer $$2 = MemoryUtil.memAlloc($$1.length);

      try {
         return erb.a($$2.put($$1).flip());
      } catch (IOException var7) {
         b.warn("Failed to load world image: {}", $$0, var7);
      } finally {
         MemoryUtil.memFree($$2);
      }

      return null;
   }

   public static record a(String a, aiy b) {
   }
}
