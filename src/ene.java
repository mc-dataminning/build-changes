import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ene extends enk {
   private static final ene c = new ene();
   public static final MapCodec<ene> a = MapCodec.unit(() -> c);

   public static ene a() {
      return c;
   }

   @Override
   public Stream<jh> a_(eni $$0, bac $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public enl<?> b() {
      return enl.m;
   }
}
