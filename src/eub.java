import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eub extends esb {
   public static final MapCodec<eub> d = a(eub::new);

   public eub(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return a($$0, ehd.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(est $$0, esb.a $$1) {
      djc $$2 = $$1.h();
      eic $$3 = $$1.f();
      iv $$4 = new iv($$2.d(), 90, $$2.e());
      dtw $$5 = dtw.a($$3);
      eua.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public esk<?> e() {
      return esk.e;
   }
}
