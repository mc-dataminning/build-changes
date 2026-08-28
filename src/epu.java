import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class epu extends eqa {
   private static final epu c = new epu();
   public static final MapCodec<epu> a = MapCodec.unit(() -> c);

   public static epu a() {
      return c;
   }

   @Override
   public Stream<iu> a_(epy $$0, azv $$1, iu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iu($$3, $$2.v(), $$4));
   }

   @Override
   public eqb<?> b() {
      return eqb.m;
   }
}
