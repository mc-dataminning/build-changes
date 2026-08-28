import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class elj extends elp {
   private static final elj c = new elj();
   public static final MapCodec<elj> a = MapCodec.unit(() -> c);

   public static elj a() {
      return c;
   }

   @Override
   public Stream<jh> a_(eln $$0, azu $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public elq<?> b() {
      return elq.m;
   }
}
