import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqd extends eod {
   public static final MapCodec<eqd> d = a(eqd::new);

   public eqd(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      return a($$0, edj.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eov $$0, eod.a $$1) {
      dgf $$2 = $$1.h();
      eei $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      dqv $$5 = dqv.a($$3);
      eqc.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eom<?> e() {
      return eom.e;
   }
}
