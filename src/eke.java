import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eke extends eif {
   public static final MapCodec<eke> d = a(eke::new);

   public eke(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      return a($$0, dxp.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eix $$0, eif.a $$1) {
      dba $$2 = $$1.h();
      dyo $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dlh $$5 = dlh.a($$3);
      ekd.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eio<?> e() {
      return eio.e;
   }
}
