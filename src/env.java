import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface env {
   Codec<env> c = lt.n.r().dispatch(env::a, enw::codec);

   @Nullable
   ua a(ayv var1, @Nullable ua var2);

   enw<?> a();
}
