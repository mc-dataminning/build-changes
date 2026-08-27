import com.mojang.serialization.Codec;
import java.util.Map;

public interface cj {
   Codec<Map<cj.a<?>, cj>> b = axu.c(lh.au.q(), cj.a::a);

   boolean a(cuh var1);

   public static record a<T extends cj>(Codec<T> a) {
   }
}
