import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eky extends ele {
   private static final eky c = new eky();
   public static final MapCodec<eky> a = MapCodec.unit(() -> c);

   public static eky a() {
      return c;
   }

   @Override
   public Stream<jh> a_(elc $$0, azs $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public elf<?> b() {
      return elf.m;
   }
}
