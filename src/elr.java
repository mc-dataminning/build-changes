import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elr extends ejr {
   public static final MapCodec<elr> d = a(elr::new);

   public elr(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      return a($$0, dyy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ekj $$0, ejr.a $$1) {
      dcd $$2 = $$1.h();
      dzx $$3 = $$1.f();
      jd $$4 = new jd($$2.d(), 90, $$2.e());
      dmm $$5 = dmm.a($$3);
      elq.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eka<?> e() {
      return eka.e;
   }
}
