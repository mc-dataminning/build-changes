import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elp extends ejp {
   public static final MapCodec<elp> d = a(elp::new);

   public elp(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      return a($$0, dyy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ekh $$0, ejp.a $$1) {
      dcd $$2 = $$1.h();
      dzx $$3 = $$1.f();
      jd $$4 = new jd($$2.d(), 90, $$2.e());
      dmm $$5 = dmm.a($$3);
      elo.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ejy<?> e() {
      return ejy.e;
   }
}
