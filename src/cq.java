import com.mojang.serialization.Codec;
import java.util.Map;

public interface cq {
   Codec<Map<cq.a<?>, cq>> b = Codec.dispatchedMap(lp.au.q(), cq.a::a);

   boolean a(cup var1);

   public static record a<T extends cq>(Codec<T> a) {
   }
}
