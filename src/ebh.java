import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ebh extends ebn {
   private static final ebh c = new ebh();
   public static final Codec<ebh> a = Codec.unit(() -> c);

   public static ebh a() {
      return c;
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ib($$3, $$2.v(), $$4));
   }

   @Override
   public ebo<?> b() {
      return ebo.m;
   }
}
