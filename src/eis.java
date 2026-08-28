import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eis extends eiy {
   private static final eis c = new eis();
   public static final MapCodec<eis> a = MapCodec.unit(() -> c);

   public static eis a() {
      return c;
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jd($$3, $$2.v(), $$4));
   }

   @Override
   public eiz<?> b() {
      return eiz.m;
   }
}
