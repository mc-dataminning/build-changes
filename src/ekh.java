import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ekh extends ekn {
   private static final ekh c = new ekh();
   public static final MapCodec<ekh> a = MapCodec.unit(() -> c);

   public static ekh a() {
      return c;
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jf($$3, $$2.v(), $$4));
   }

   @Override
   public eko<?> b() {
      return eko.m;
   }
}
