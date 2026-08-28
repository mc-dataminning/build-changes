import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epx extends eod {
   public static final MapCodec<epx> d = a(epx::new);

   public epx(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      return a($$0, edj.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eov $$0, eod.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epw.a($$2));
   }

   @Override
   public eom<?> e() {
      return eom.a;
   }
}
