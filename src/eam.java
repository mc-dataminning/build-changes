import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eam extends eas {
   private static final eam c = new eam();
   public static final Codec<eam> a = Codec.unit(() -> c);

   public static eam a() {
      return c;
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hz($$3, $$2.v(), $$4));
   }

   @Override
   public eat<?> b() {
      return eat.m;
   }
}
