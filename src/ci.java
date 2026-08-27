import com.mojang.serialization.Codec;
import java.util.Map;

public interface ci {
   Codec<Map<ci.a<?>, ci>> b = Codec.dispatchedMap(le.au.q(), ci.a::a);

   boolean a(ctq var1);

   public static record a<T extends ci>(Codec<T> a) {
   }
}
