import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ere extends erk {
   private static final ere c = new ere();
   public static final MapCodec<ere> a = MapCodec.unit(() -> c);

   public static ere a() {
      return c;
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iw($$3, $$2.v(), $$4));
   }

   @Override
   public erl<?> b() {
      return erl.m;
   }
}
