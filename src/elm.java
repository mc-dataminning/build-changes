import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elm extends ejm {
   public static final MapCodec<elm> d = a(elm::new);

   public elm(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      return a($$0, dyv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eke $$0, ejm.a $$1) {
      dcb $$2 = $$1.h();
      dzu $$3 = $$1.f();
      jd $$4 = new jd($$2.d(), 90, $$2.e());
      dmk $$5 = dmk.a($$3);
      ell.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ejv<?> e() {
      return ejv.e;
   }
}
