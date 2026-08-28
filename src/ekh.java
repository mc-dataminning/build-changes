import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekh extends eii {
   public static final MapCodec<ekh> d = a(ekh::new);

   public ekh(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      return a($$0, dxs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eja $$0, eii.a $$1) {
      dbd $$2 = $$1.h();
      dyr $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dlk $$5 = dlk.a($$3);
      ekg.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eir<?> e() {
      return eir.e;
   }
}
