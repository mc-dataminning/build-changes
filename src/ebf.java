import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebf extends dzg {
   public static final Codec<ebf> d = a(ebf::new);

   public ebf(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      return a($$0, doq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzy $$0, dzg.a $$1) {
      csw $$2 = $$1.h();
      dpp $$3 = $$1.f();
      hx $$4 = new hx($$2.d(), 90, $$2.e());
      ddc $$5 = ddc.a($$3);
      ebe.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dzp<?> e() {
      return dzp.e;
   }
}
