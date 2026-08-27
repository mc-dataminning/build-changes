import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dul extends dur {
   private static final dul c = new dul();
   public static final Codec<dul> a = Codec.unit(() -> c);

   public static dul a() {
      return c;
   }

   @Override
   public Stream<gw> a_(dup $$0, ase $$1, gw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gw($$3, $$2.v(), $$4));
   }

   @Override
   public dus<?> b() {
      return dus.m;
   }
}
