import com.mojang.serialization.Codec;
import java.util.Optional;

public class efb extends edc {
   public static final Codec<efb> d = a(efb::new);

   public efb(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      return a($$0, dsm.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(edu $$0, edc.a $$1) {
      cwg $$2 = $$1.h();
      dtl $$3 = $$1.f();
      ib $$4 = new ib($$2.d(), 90, $$2.e());
      dgm $$5 = dgm.a($$3);
      efa.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public edl<?> e() {
      return edl.e;
   }
}
