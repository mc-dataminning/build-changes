import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eer extends eex {
   private static final eer c = new eer();
   public static final Codec<eer> a = Codec.unit(() -> c);

   public static eer a() {
      return c;
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new id($$3, $$2.v(), $$4));
   }

   @Override
   public eey<?> b() {
      return eey.m;
   }
}
