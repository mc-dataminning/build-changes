import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface bx {
   Codec<bx> a = lz.ap.q().dispatch(bx::a, Function.identity());

   MapCodec<? extends bx> a();

   boolean a(bui var1, arq var2, @Nullable ezr var3);
}
