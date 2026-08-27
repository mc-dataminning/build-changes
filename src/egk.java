import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class egk extends egq {
   private static final egk c = new egk();
   public static final MapCodec<egk> a = MapCodec.unit(() -> c);

   public static egk a() {
      return c;
   }

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new io($$3, $$2.v(), $$4));
   }

   @Override
   public egr<?> b() {
      return egr.m;
   }
}
