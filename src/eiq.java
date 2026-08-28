import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eiq extends eiw {
   private static final eiq c = new eiq();
   public static final MapCodec<eiq> a = MapCodec.unit(() -> c);

   public static eiq a() {
      return c;
   }

   @Override
   public Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jd($$3, $$2.v(), $$4));
   }

   @Override
   public eix<?> b() {
      return eix.m;
   }
}
