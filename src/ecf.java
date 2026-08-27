import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ecf extends ecl {
   private static final ecf c = new ecf();
   public static final Codec<ecf> a = Codec.unit(() -> c);

   public static ecf a() {
      return c;
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ib($$3, $$2.v(), $$4));
   }

   @Override
   public ecm<?> b() {
      return ecm.m;
   }
}
