import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class egm extends egs {
   private static final egm c = new egm();
   public static final MapCodec<egm> a = MapCodec.unit(() -> c);

   public static egm a() {
      return c;
   }

   @Override
   public Stream<io> a_(egq $$0, aym $$1, io $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new io($$3, $$2.v(), $$4));
   }

   @Override
   public egt<?> b() {
      return egt.m;
   }
}
