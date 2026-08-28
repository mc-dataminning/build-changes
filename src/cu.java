import com.mojang.serialization.Codec;
import java.util.Map;

public interface cu {
   Codec<Map<cu.a<?>, cu>> b = Codec.dispatchedMap(lx.aq.q(), cu.a::a);

   boolean a(cvx var1);

   public static record a<T extends cu>(Codec<T> a) {
   }
}
