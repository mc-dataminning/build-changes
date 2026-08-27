import com.mojang.serialization.Codec;
import java.util.Map;

public interface ch {
   Codec<Map<ch.a<?>, ch>> b = axe.c(lc.au.q(), ch.a::a);

   boolean a(csd var1);

   public static record a<T extends ch>(Codec<T> a) {
   }
}
