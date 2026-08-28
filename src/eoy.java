import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eoy {
   Codec<eoy> c = lu.n.q().dispatch(eoy::a, eoz::codec);

   @Nullable
   uf a(azk var1, @Nullable uf var2);

   eoz<?> a();
}
