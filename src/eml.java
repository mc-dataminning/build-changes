import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eml extends emr {
   private static final eml c = new eml();
   public static final MapCodec<eml> a = MapCodec.unit(() -> c);

   public static eml a() {
      return c;
   }

   @Override
   public Stream<ji> a_(emp $$0, azg $$1, ji $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ji($$3, $$2.v(), $$4));
   }

   @Override
   public ems<?> b() {
      return ems.m;
   }
}
