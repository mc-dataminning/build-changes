import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class end extends enj {
   private static final end c = new end();
   public static final MapCodec<end> a = MapCodec.unit(() -> c);

   public static end a() {
      return c;
   }

   @Override
   public Stream<jh> a_(enh $$0, bam $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public enk<?> b() {
      return enk.m;
   }
}
