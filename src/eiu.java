import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eiu extends eja {
   private static final eiu c = new eiu();
   public static final Codec<eiu> a = Codec.unit(() -> c);

   public static eiu a() {
      return c;
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ir($$3, $$2.v(), $$4));
   }

   @Override
   public ejb<?> b() {
      return ejb.n;
   }
}
