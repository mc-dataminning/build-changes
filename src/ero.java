import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ero extends eru {
   private static final ero c = new ero();
   public static final MapCodec<ero> a = MapCodec.unit(() -> c);

   public static ero a() {
      return c;
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iw($$3, $$2.v(), $$4));
   }

   @Override
   public erv<?> b() {
      return erv.m;
   }
}
