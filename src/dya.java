import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dya extends dyg {
   private static final dya c = new dya();
   public static final Codec<dya> a = Codec.unit(() -> c);

   public static dya a() {
      return c;
   }

   @Override
   public Stream<hx> a_(dye $$0, aup $$1, hx $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hx($$3, $$2.v(), $$4));
   }

   @Override
   public dyh<?> b() {
      return dyh.m;
   }
}
