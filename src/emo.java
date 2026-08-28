import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class emo extends emu {
   private static final emo c = new emo();
   public static final MapCodec<emo> a = MapCodec.unit(() -> c);

   public static emo a() {
      return c;
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ji($$3, $$2.v(), $$4));
   }

   @Override
   public emv<?> b() {
      return emv.m;
   }
}
