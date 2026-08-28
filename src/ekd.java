import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ekd extends ekj {
   private static final ekd c = new ekd();
   public static final MapCodec<ekd> a = MapCodec.unit(() -> c);

   public static ekd a() {
      return c;
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new je($$3, $$2.v(), $$4));
   }

   @Override
   public ekk<?> b() {
      return ekk.m;
   }
}
