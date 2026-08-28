import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekk extends eil {
   public static final MapCodec<ekk> d = a(ekk::new);

   public ekk(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      return a($$0, dxv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ejd $$0, eil.a $$1) {
      dbg $$2 = $$1.h();
      dyu $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dln $$5 = dln.a($$3);
      ekj.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eiu<?> e() {
      return eiu.e;
   }
}
