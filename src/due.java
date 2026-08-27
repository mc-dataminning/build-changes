import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class due extends duk {
   private static final due c = new due();
   public static final Codec<due> a = Codec.unit(() -> c);

   public static due a() {
      return c;
   }

   @Override
   public Stream<gw> a_(dui $$0, arx $$1, gw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gw($$3, $$2.v(), $$4));
   }

   @Override
   public dul<?> b() {
      return dul.m;
   }
}
