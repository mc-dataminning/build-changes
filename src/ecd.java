import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ecd extends ecj {
   private static final ecd c = new ecd();
   public static final Codec<ecd> a = Codec.unit(() -> c);

   public static ecd a() {
      return c;
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ib($$3, $$2.v(), $$4));
   }

   @Override
   public eck<?> b() {
      return eck.m;
   }
}
