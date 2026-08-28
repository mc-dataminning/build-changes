import com.mojang.serialization.Codec;
import java.util.Map;

public interface cq {
   Codec<Map<cq.a<?>, cq>> b = Codec.dispatchedMap(lq.as.r(), cq.a::a);

   boolean a(cuc var1);

   public static record a<T extends cq>(Codec<T> a) {
   }
}
