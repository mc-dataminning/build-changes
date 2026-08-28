import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eqo extends equ {
   private static final eqo c = new eqo();
   public static final MapCodec<eqo> a = MapCodec.unit(() -> c);

   public static eqo a() {
      return c;
   }

   @Override
   public Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iv($$3, $$2.v(), $$4));
   }

   @Override
   public eqv<?> b() {
      return eqv.m;
   }
}
