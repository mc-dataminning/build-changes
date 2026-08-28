import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eng extends elg {
   public static final MapCodec<eng> d = a(eng::new);

   public eng(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      return a($$0, eao.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ely $$0, elg.a $$1) {
      ddp $$2 = $$1.h();
      ebn $$3 = $$1.f();
      jf $$4 = new jf($$2.d(), 90, $$2.e());
      doa $$5 = doa.a($$3);
      enf.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public elp<?> e() {
      return elp.e;
   }
}
