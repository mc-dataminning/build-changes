import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eti extends eri {
   public static final MapCodec<eti> d = a(eti::new);

   public eti(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      return a($$0, egn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(esa $$0, eri.a $$1) {
      dio $$2 = $$1.h();
      ehm $$3 = $$1.f();
      iv $$4 = new iv($$2.d(), 90, $$2.e());
      dtg $$5 = dtg.a($$3);
      eth.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public err<?> e() {
      return err.e;
   }
}
