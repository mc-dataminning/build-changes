import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class elc extends eli {
   private static final elc c = new elc();
   public static final MapCodec<elc> a = MapCodec.unit(() -> c);

   public static elc a() {
      return c;
   }

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public elj<?> b() {
      return elj.m;
   }
}
