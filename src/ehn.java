import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehn extends eht {
   private static final ehn c = new ehn();
   public static final MapCodec<ehn> a = MapCodec.unit(() -> c);

   public static ehn a() {
      return c;
   }

   @Override
   public Stream<iz> a_(ehr $$0, azh $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public ehu<?> b() {
      return ehu.m;
   }
}
