import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface bx {
   Codec<bx> a = lz.ap.q().dispatch(bx::a, Function.identity());

   MapCodec<? extends bx> a();

   boolean a(bul var1, arp var2, @Nullable ezy var3);
}
