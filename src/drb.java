import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class drb extends drh {
   private static final drb c = new drb();
   public static final Codec<drb> a = Codec.unit(() -> c);

   public static drb a() {
      return c;
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new gu($$3, $$2.v(), $$4));
   }

   @Override
   public dri<?> b() {
      return dri.m;
   }
}
