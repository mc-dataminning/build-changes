import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekx extends eix {
   public static final MapCodec<ekx> d = a(ekx::new);

   public ekx(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return a($$0, dyg.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejp $$0, eix.a $$1) {
      dbn $$2 = $$1.h();
      dzf $$3 = $$1.f();
      ja $$4 = new ja($$2.d(), 90, $$2.e());
      dlv $$5 = dlv.a($$3);
      ekw.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ejg<?> e() {
      return ejg.e;
   }
}
