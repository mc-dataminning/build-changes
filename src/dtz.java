import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtz extends duf {
   private static final dtz c = new dtz();
   public static final Codec<dtz> a = Codec.unit(() -> c);

   public static dtz a() {
      return c;
   }

   @Override
   public Stream<gu> a_(dud $$0, aru $$1, gu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gu($$3, $$2.v(), $$4));
   }

   @Override
   public dug<?> b() {
      return dug.m;
   }
}
