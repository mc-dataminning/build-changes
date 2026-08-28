import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class ehx {
   public static final Codec<ehx> b = lq.S.r().dispatch(ehx::b, ehy::codec);

   public abstract Stream<ja> a_(ehv var1, aym var2, ja var3);

   public abstract ehy<?> b();
}
