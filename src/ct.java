import com.mojang.serialization.Codec;
import java.util.Map;

public interface ct {
   Codec<Map<ct.a<?>, ct>> b = Codec.dispatchedMap(lt.as.r(), ct.a::a);

   boolean a(cuq var1);

   public static record a<T extends ct>(Codec<T> a) {
   }
}
