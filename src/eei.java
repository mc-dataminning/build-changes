import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eei extends eeo {
   private static final eei c = new eei();
   public static final Codec<eei> a = Codec.unit(() -> c);

   public static eei a() {
      return c;
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ib($$3, $$2.v(), $$4));
   }

   @Override
   public eep<?> b() {
      return eep.m;
   }
}
