import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ein extends eit {
   private static final ein c = new ein();
   public static final MapCodec<ein> a = MapCodec.unit(() -> c);

   public static ein a() {
      return c;
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jd($$3, $$2.v(), $$4));
   }

   @Override
   public eiu<?> b() {
      return eiu.m;
   }
}
