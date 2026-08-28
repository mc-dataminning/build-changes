import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehj extends ehp {
   private static final ehj c = new ehj();
   public static final MapCodec<ehj> a = MapCodec.unit(() -> c);

   public static ehj a() {
      return c;
   }

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public ehq<?> b() {
      return ehq.m;
   }
}
