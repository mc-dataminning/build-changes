import com.mojang.serialization.Codec;
import java.util.Optional;

public class dts extends dsa {
   public static final Codec<dts> d = a(dts::new);

   public dts(dsa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      return a($$0, dhk.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dss $$0, dsa.a $$1) {
      clt $$2 = $$1.h();
      dij $$3 = $$1.f();
      gu $$4 = new gu($$2.d(), 90, $$2.e());
      cvz $$5 = cvz.a($$3);
      dtr.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dsj<?> e() {
      return dsj.e;
   }
}
