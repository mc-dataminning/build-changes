import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efh extends efn {
   private static final efh c = new efh();
   public static final Codec<efh> a = Codec.unit(() -> c);

   public static efh a() {
      return c;
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new im($$3, $$2.v(), $$4));
   }

   @Override
   public efo<?> b() {
      return efo.m;
   }
}
