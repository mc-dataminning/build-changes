import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class esi extends eqi {
   public static final MapCodec<esi> d = a(esi::new);

   public esi(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      return a($$0, efn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(era $$0, eqi.a $$1) {
      dhw $$2 = $$1.h();
      egm $$3 = $$1.f();
      iu $$4 = new iu($$2.d(), 90, $$2.e());
      dsm $$5 = dsm.a($$3);
      esh.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eqr<?> e() {
      return eqr.e;
   }
}
