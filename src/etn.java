import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etn extends ern {
   public static final MapCodec<etn> d = a(etn::new);

   public etn(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      return a($$0, egs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esf $$0, ern.a $$1) {
      dir $$2 = $$1.h();
      ehr $$3 = $$1.f();
      iv $$4 = new iv($$2.d(), 90, $$2.e());
      dtl $$5 = dtl.a($$3);
      etm.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public erw<?> e() {
      return erw.e;
   }
}
