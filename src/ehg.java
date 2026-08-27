import com.mojang.serialization.Codec;
import java.util.Optional;

public class ehg extends efh {
   public static final Codec<ehg> d = a(ehg::new);

   public ehg(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      return a($$0, dur.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(efz $$0, efh.a $$1) {
      cye $$2 = $$1.h();
      dvq $$3 = $$1.f();
      ib $$4 = new ib($$2.d(), 90, $$2.e());
      dik $$5 = dik.a($$3);
      ehf.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public efq<?> e() {
      return efq.e;
   }
}
