import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class emm extends ems {
   private static final emm c = new emm();
   public static final MapCodec<emm> a = MapCodec.unit(() -> c);

   public static emm a() {
      return c;
   }

   @Override
   public Stream<ji> a_(emq $$0, azh $$1, ji $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ji($$3, $$2.v(), $$4));
   }

   @Override
   public emt<?> b() {
      return emt.m;
   }
}
