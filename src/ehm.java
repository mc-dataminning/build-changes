import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehm extends ehs {
   private static final ehm c = new ehm();
   public static final MapCodec<ehm> a = MapCodec.unit(() -> c);

   public static ehm a() {
      return c;
   }

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public eht<?> b() {
      return eht.m;
   }
}
