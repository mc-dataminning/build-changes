import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface bx {
   Codec<bx> a = ly.ap.q().dispatch(bx::a, Function.identity());

   MapCodec<? extends bx> a();

   boolean a(bue var1, arn var2, @Nullable ezn var3);
}
