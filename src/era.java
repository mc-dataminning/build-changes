import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class era extends epg {
   public static final MapCodec<era> d = a(era::new);

   public era(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return a($$0, eel.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(epy $$0, epg.a $$1) {
      jj $$2 = new jj($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eqz.a($$2));
   }

   @Override
   public epp<?> e() {
      return epp.a;
   }
}
