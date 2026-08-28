import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ejv {
   public static final Codec<ejv> b = lu.S.q().dispatch(ejv::b, ejw::codec);

   public abstract Stream<je> a_(ejt var1, azk var2, je var3);

   public abstract ejw<?> b();
}
