import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eoi extends emi {
   public static final MapCodec<eoi> d = a(eoi::new);

   public eoi(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      return a($$0, ebq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ena $$0, emi.a $$1) {
      des $$2 = $$1.h();
      ecp $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      dpd $$5 = dpd.a($$3);
      eoh.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public emr<?> e() {
      return emr.e;
   }
}
