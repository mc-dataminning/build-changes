import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eks extends eky {
   private static final eks c = new eks();
   public static final MapCodec<eks> a = MapCodec.unit(() -> c);

   public static eks a() {
      return c;
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jg($$3, $$2.v(), $$4));
   }

   @Override
   public ekz<?> b() {
      return ekz.m;
   }
}
