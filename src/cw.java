import com.mojang.serialization.Codec;
import java.util.Map;

public interface cw {
   Codec<Map<cw.a<?>, cw>> b = Codec.dispatchedMap(mb.aq.q(), cw.a::a);

   boolean a(cwn var1);

   public static record a<T extends cw>(Codec<T> a) {
   }
}
