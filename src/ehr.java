import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehr extends ehx {
   private static final ehr c = new ehr();
   public static final MapCodec<ehr> a = MapCodec.unit(() -> c);

   public static ehr a() {
      return c;
   }

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ja($$3, $$2.v(), $$4));
   }

   @Override
   public ehy<?> b() {
      return ehy.m;
   }
}
