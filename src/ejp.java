import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ejp extends ejv {
   private static final ejp c = new ejp();
   public static final MapCodec<ejp> a = MapCodec.unit(() -> c);

   public static ejp a() {
      return c;
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new je($$3, $$2.v(), $$4));
   }

   @Override
   public ejw<?> b() {
      return ejw.m;
   }
}
