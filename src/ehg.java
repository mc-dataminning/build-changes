import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehg extends ehm {
   private static final ehg c = new ehg();
   public static final MapCodec<ehg> a = MapCodec.unit(() -> c);

   public static ehg a() {
      return c;
   }

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public ehn<?> b() {
      return ehn.m;
   }
}
