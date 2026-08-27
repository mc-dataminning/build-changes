import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ejk extends ehl {
   public static final MapCodec<ejk> d = a(ejk::new);

   public ejk(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return a($$0, dwv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eid $$0, ehl.a $$1) {
      dag $$2 = $$1.h();
      dxu $$3 = $$1.f();
      io $$4 = new io($$2.d(), 90, $$2.e());
      dkn $$5 = dkn.a($$3);
      ejj.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ehu<?> e() {
      return ehu.e;
   }
}
