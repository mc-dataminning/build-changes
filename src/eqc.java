import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eqc extends eqi {
   private static final eqc c = new eqc();
   public static final MapCodec<eqc> a = MapCodec.unit(() -> c);

   public static eqc a() {
      return c;
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new iu($$3, $$2.v(), $$4));
   }

   @Override
   public eqj<?> b() {
      return eqj.m;
   }
}
