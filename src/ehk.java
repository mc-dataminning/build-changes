import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehk extends ehq {
   private static final ehk c = new ehk();
   public static final MapCodec<ehk> a = MapCodec.unit(() -> c);

   public static ehk a() {
      return c;
   }

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iz($$3, $$2.v(), $$4));
   }

   @Override
   public ehr<?> b() {
      return ehr.m;
   }
}
