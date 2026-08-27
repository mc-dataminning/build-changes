import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxc extends dvk {
   public static final Codec<dxc> d = a(dxc::new);

   public dxc(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      return a($$0, dku.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dwc $$0, dvk.a $$1) {
      cpe $$2 = $$1.h();
      dlt $$3 = $$1.f();
      gw $$4 = new gw($$2.d(), 90, $$2.e());
      czj $$5 = czj.a($$3);
      dxb.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvt<?> e() {
      return dvt.e;
   }
}
