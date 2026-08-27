import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyh extends dyn {
   private static final dyh c = new dyh();
   public static final Codec<dyh> a = Codec.unit(() -> c);

   public static dyh a() {
      return c;
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hx($$3, $$2.v(), $$4));
   }

   @Override
   public dyo<?> b() {
      return dyo.m;
   }
}
