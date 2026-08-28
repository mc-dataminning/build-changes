import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehy extends eie {
   private static final ehy c = new ehy();
   public static final MapCodec<ehy> a = MapCodec.unit(() -> c);

   public static ehy a() {
      return c;
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ja($$3, $$2.v(), $$4));
   }

   @Override
   public eif<?> b() {
      return eif.m;
   }
}
