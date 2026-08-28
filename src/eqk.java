import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqk extends eok {
   public static final MapCodec<eqk> d = a(eqk::new);

   public eqk(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      return a($$0, edq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(epc $$0, eok.a $$1) {
      dgo $$2 = $$1.h();
      eep $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      drc $$5 = drc.a($$3);
      eqj.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eot<?> e() {
      return eot.e;
   }
}
