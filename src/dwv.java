import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwv extends dvd {
   public static final Codec<dwv> d = a(dwv::new);

   public dwv(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return a($$0, dkn.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvv $$0, dvd.a $$1) {
      cox $$2 = $$1.h();
      dlm $$3 = $$1.f();
      gw $$4 = new gw($$2.d(), 90, $$2.e());
      czc $$5 = czc.a($$3);
      dwu.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvm<?> e() {
      return dvm.e;
   }
}
