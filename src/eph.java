import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eph extends enn {
   public static final MapCodec<eph> d = a(eph::new);

   public eph(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      return a($$0, ect.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eof $$0, enn.a $$1) {
      ji $$2 = new ji($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epg.a($$2));
   }

   @Override
   public enw<?> e() {
      return enw.a;
   }
}
