import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epl extends enl {
   public static final MapCodec<epl> d = a(epl::new);

   public epl(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      return a($$0, ecr.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eod $$0, enl.a $$1) {
      dfn $$2 = $$1.h();
      edq $$3 = $$1.f();
      ji $$4 = new ji($$2.d(), 90, $$2.e());
      dqd $$5 = dqd.a($$3);
      epk.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public enu<?> e() {
      return enu.e;
   }
}
