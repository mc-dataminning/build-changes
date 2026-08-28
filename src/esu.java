import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface esu {
   Codec<esu> c = ma.n.q().dispatch(esu::a, esv::codec);

   @Nullable
   ux a(bam var1, @Nullable ux var2);

   esv<?> a();
}
