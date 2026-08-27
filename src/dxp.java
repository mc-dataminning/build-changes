import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dxp extends dxv {
   private static final dxp c = new dxp();
   public static final Codec<dxp> a = Codec.unit(() -> c);

   public static dxp a() {
      return c;
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hv($$3, $$2.v(), $$4));
   }

   @Override
   public dxw<?> b() {
      return dxw.m;
   }
}
