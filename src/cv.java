import com.mojang.serialization.Codec;
import java.util.Map;

public interface cv {
   Codec<Map<cv.a<?>, cv>> b = Codec.dispatchedMap(ma.aq.q(), cv.a::a);

   boolean a(cxk var1);

   public static record a<T extends cv>(Codec<T> a) {
   }
}
