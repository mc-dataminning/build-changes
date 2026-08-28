import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etb extends erb {
   public static final MapCodec<etb> d = a(etb::new);

   public etb(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      return a($$0, egg.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ert $$0, erb.a $$1) {
      dih $$2 = $$1.h();
      ehf $$3 = $$1.f();
      iu $$4 = new iu($$2.d(), 90, $$2.e());
      dsz $$5 = dsz.a($$3);
      eta.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public erk<?> e() {
      return erk.e;
   }
}
