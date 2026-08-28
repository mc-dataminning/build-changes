import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class erg extends epg {
   public static final MapCodec<erg> d = a(erg::new);

   public erg(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      return a($$0, eel.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(epy $$0, epg.a $$1) {
      dgw $$2 = $$1.h();
      efk $$3 = $$1.f();
      jj $$4 = new jj($$2.d(), 90, $$2.e());
      drm $$5 = drm.a($$3);
      erf.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public epp<?> e() {
      return epp.e;
   }
}
