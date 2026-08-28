import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eoh extends eon {
   private static final eoh c = new eoh();
   public static final MapCodec<eoh> a = MapCodec.unit(() -> c);

   public static eoh a() {
      return c;
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jj($$3, $$2.v(), $$4));
   }

   @Override
   public eoo<?> b() {
      return eoo.m;
   }
}
