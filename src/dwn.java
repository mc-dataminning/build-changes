import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dwn extends dwt {
   private static final dwn c = new dwn();
   public static final Codec<dwn> a = Codec.unit(() -> c);

   public static dwn a() {
      return c;
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hx($$3, $$2.v(), $$4));
   }

   @Override
   public dwu<?> b() {
      return dwu.m;
   }
}
