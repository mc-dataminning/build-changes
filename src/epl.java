import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class epl {
   private static final Map<String, epl.a> a = Maps.newHashMap();
   private static final Logger b = LogUtils.getLogger();
   private static final aew c = new aew("textures/gui/presets/isles.png");

   public static aew a(String $$0, @Nullable String $$1) {
      return $$1 == null ? c : b($$0, $$1);
   }

   private static aew b(String $$0, String $$1) {
      epl.a $$2 = a.get($$0);
      if ($$2 != null && $$2.a().equals($$1)) {
         return $$2.b;
      } else {
         ekq $$3 = a($$1);
         if ($$3 == null) {
            aew $$4 = fyu.b();
            a.put($$0, new epl.a($$1, $$4));
            return $$4;
         } else {
            aew $$5 = new aew("realms", "dynamic/" + $$0);
            eqv.O().Y().a($$5, new fyr($$3));
            a.put($$0, new epl.a($$1, $$5));
            return $$5;
         }
      }
   }

   @Nullable
   private static ekq a(String $$0) {
      byte[] $$1 = Base64.getDecoder().decode($$0);
      ByteBuffer $$2 = MemoryUtil.memAlloc($$1.length);

      try {
         return ekq.a($$2.put($$1).flip());
      } catch (IOException var7) {
         b.warn("Failed to load world image: {}", $$0, var7);
      } finally {
         MemoryUtil.memFree($$2);
      }

      return null;
   }

   public static record a(String a, aew b) {
   }
}
