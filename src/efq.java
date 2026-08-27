import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efq extends efw {
   private static final efq c = new efq();
   public static final Codec<efq> a = Codec.unit(() -> c);

   public static efq a() {
      return c;
   }

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new in($$3, $$2.v(), $$4));
   }

   @Override
   public efx<?> b() {
      return efx.m;
   }
}
