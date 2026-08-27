import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eio extends eja {
   public static final Codec<eio> a = Codec.unit(eio::new);

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      int $$3 = $$0.a(dyu.a.e, $$2.u(), $$2.w());
      return $$3 != $$0.c() ? Stream.empty() : Stream.of($$2.b($$1.a(105, 115)));
   }

   @Override
   public ejb<?> b() {
      return ejb.m;
   }
}
