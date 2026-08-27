import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyp extends dyv {
   private static final dyp c = new dyp();
   public static final Codec<dyp> a = Codec.unit(() -> c);

   public static dyp a() {
      return c;
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hx($$3, $$2.v(), $$4));
   }

   @Override
   public dyw<?> b() {
      return dyw.m;
   }
}
