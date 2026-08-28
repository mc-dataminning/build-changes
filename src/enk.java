import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class enk extends enq {
   private static final enk c = new enk();
   public static final MapCodec<enk> a = MapCodec.unit(() -> c);

   public static enk a() {
      return c;
   }

   @Override
   public Stream<jh> a_(eno $$0, bam $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public enr<?> b() {
      return enr.m;
   }
}
