import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dvw extends dwc {
   private static final dvw c = new dvw();
   public static final Codec<dvw> a = Codec.unit(() -> c);

   public static dvw a() {
      return c;
   }

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ht($$3, $$2.v(), $$4));
   }

   @Override
   public dwd<?> b() {
      return dwd.m;
   }
}
