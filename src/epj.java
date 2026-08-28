import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class epj extends epp {
   private static final epj c = new epj();
   public static final MapCodec<epj> a = MapCodec.unit(() -> c);

   public static epj a() {
      return c;
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iu($$3, $$2.v(), $$4));
   }

   @Override
   public epq<?> b() {
      return epq.m;
   }
}
