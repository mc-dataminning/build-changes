import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyg extends dym {
   private static final dyg c = new dyg();
   public static final Codec<dyg> a = Codec.unit(() -> c);

   public static dyg a() {
      return c;
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hx($$3, $$2.v(), $$4));
   }

   @Override
   public dyn<?> b() {
      return dyn.m;
   }
}
