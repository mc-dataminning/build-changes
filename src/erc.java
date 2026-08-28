import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class erc extends eri {
   private static final erc c = new erc();
   public static final MapCodec<erc> a = MapCodec.unit(() -> c);

   public static erc a() {
      return c;
   }

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iv($$3, $$2.v(), $$4));
   }

   @Override
   public erj<?> b() {
      return erj.m;
   }
}
