import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehx extends eid {
   private static final ehx c = new ehx();
   public static final MapCodec<ehx> a = MapCodec.unit(() -> c);

   public static ehx a() {
      return c;
   }

   @Override
   public Stream<ja> a_(eib $$0, ayo $$1, ja $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ja($$3, $$2.v(), $$4));
   }

   @Override
   public eie<?> b() {
      return eie.m;
   }
}
