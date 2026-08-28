import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eud extends esd {
   public static final MapCodec<eud> d = a(eud::new);

   public eud(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      return a($$0, ehf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esv $$0, esd.a $$1) {
      dje $$2 = $$1.h();
      eie $$3 = $$1.f();
      iw $$4 = new iw($$2.d(), 90, $$2.e());
      dty $$5 = dty.a($$3);
      euc.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public esm<?> e() {
      return esm.e;
   }
}
