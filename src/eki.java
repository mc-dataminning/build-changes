import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eki extends eij {
   public static final MapCodec<eki> d = a(eki::new);

   public eki(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      return a($$0, dxt.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejb $$0, eij.a $$1) {
      dbe $$2 = $$1.h();
      dys $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dll $$5 = dll.a($$3);
      ekh.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eis<?> e() {
      return eis.e;
   }
}
