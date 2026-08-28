import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class enk extends enq {
   private static final enk c = new enk();
   public static final MapCodec<enk> a = MapCodec.unit(() -> c);

   public static enk a() {
      return c;
   }

   @Override
   public Stream<ji> a_(eno $$0, azh $$1, ji $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ji($$3, $$2.v(), $$4));
   }

   @Override
   public enr<?> b() {
      return enr.m;
   }
}
