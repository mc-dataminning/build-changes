import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekj extends eik {
   public static final MapCodec<ekj> d = a(ekj::new);

   public ekj(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      return a($$0, dxu.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejc $$0, eik.a $$1) {
      dbf $$2 = $$1.h();
      dyt $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dlm $$5 = dlm.a($$3);
      eki.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eit<?> e() {
      return eit.e;
   }
}
