import com.mojang.serialization.Codec;
import java.util.Optional;

public interface dya {
   Codec<dya> c = lt.t.r().dispatch(dya::a, dyb::a);
   yw<wj, dya> d = yu.a(lu.ab).b(dya::a, dyb::b);

   Optional<eww> a(dcu var1);

   dyb<? extends dya> a();
}
