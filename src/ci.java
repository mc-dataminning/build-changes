import com.mojang.serialization.Codec;
import java.util.Map;

public interface ci {
   Codec<Map<ci.a<?>, ci>> b = axh.c(ld.au.q(), ci.a::a);

   boolean a(csz var1);

   public static record a<T extends ci>(Codec<T> a) {
   }
}
