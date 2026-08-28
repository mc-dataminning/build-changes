import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eqj extends eqp {
   private static final eqj c = new eqj();
   public static final MapCodec<eqj> a = MapCodec.unit(() -> c);

   public static eqj a() {
      return c;
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iv($$3, $$2.v(), $$4));
   }

   @Override
   public eqq<?> b() {
      return eqq.m;
   }
}
