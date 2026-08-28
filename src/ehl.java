import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehl extends ehr {
   private static final ehl c = new ehl();
   public static final MapCodec<ehl> a = MapCodec.unit(() -> c);

   public static ehl a() {
      return c;
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public ehs<?> b() {
      return ehs.m;
   }
}
