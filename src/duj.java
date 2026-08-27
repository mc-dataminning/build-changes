import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duj extends dup {
   private static final duj c = new duj();
   public static final Codec<duj> a = Codec.unit(() -> c);

   public static duj a() {
      return c;
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gw($$3, $$2.v(), $$4));
   }

   @Override
   public duq<?> b() {
      return duq.m;
   }
}
