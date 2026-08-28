import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ekj {
   public static final Codec<ekj> b = lu.S.q().dispatch(ekj::b, ekk::codec);

   public abstract Stream<je> a_(ekh var1, azl var2, je var3);

   public abstract ekk<?> b();
}
