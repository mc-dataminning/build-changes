import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eaf extends eal {
   private static final eaf c = new eaf();
   public static final Codec<eaf> a = Codec.unit(() -> c);

   public static eaf a() {
      return c;
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new hz($$3, $$2.v(), $$4));
   }

   @Override
   public eam<?> b() {
      return eam.m;
   }
}
