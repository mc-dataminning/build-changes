import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dua extends dug {
   private static final dua c = new dua();
   public static final Codec<dua> a = Codec.unit(() -> c);

   public static dua a() {
      return c;
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gu($$3, $$2.v(), $$4));
   }

   @Override
   public duh<?> b() {
      return duh.m;
   }
}
