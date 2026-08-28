import com.mojang.serialization.Codec;
import java.util.Map;

public interface ct {
   Codec<Map<ct.a<?>, ct>> b = Codec.dispatchedMap(lu.ar.q(), ct.a::a);

   boolean a(cvl var1);

   public static record a<T extends ct>(Codec<T> a) {
   }
}
