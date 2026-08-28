import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class emn extends emt {
   private static final emn c = new emn();
   public static final MapCodec<emn> a = MapCodec.unit(() -> c);

   public static emn a() {
      return c;
   }

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new ji($$3, $$2.v(), $$4));
   }

   @Override
   public emu<?> b() {
      return emu.m;
   }
}
