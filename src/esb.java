import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class esb extends epg {
   public static final MapCodec<esb> d = a(esb::new);

   public esb(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return a($$0, eel.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(epy $$0, epg.a $$1) {
      $$0.a(new esa($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public epp<?> e() {
      return epp.o;
   }
}
