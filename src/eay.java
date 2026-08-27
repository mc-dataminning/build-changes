import com.mojang.serialization.Codec;
import java.util.Optional;

public class eay extends dyz {
   public static final Codec<eay> d = a(eay::new);

   public eay(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      return a($$0, doj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzr $$0, dyz.a $$1) {
      csp $$2 = $$1.h();
      dpi $$3 = $$1.f();
      hx $$4 = new hx($$2.d(), 90, $$2.e());
      dcv $$5 = dcv.a($$3);
      eax.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dzi<?> e() {
      return dzi.e;
   }
}
