import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dty extends due {
   private static final dty c = new dty();
   public static final Codec<dty> a = Codec.unit(() -> c);

   public static dty a() {
      return c;
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gv($$3, $$2.v(), $$4));
   }

   @Override
   public duf<?> b() {
      return duf.m;
   }
}
