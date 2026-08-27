import com.mojang.serialization.Codec;
import java.util.Optional;

public class edd extends ebe {
   public static final Codec<edd> d = a(edd::new);

   public edd(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      return a($$0, dqo.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ebw $$0, ebe.a $$1) {
      cuu $$2 = $$1.h();
      drn $$3 = $$1.f();
      hz $$4 = new hz($$2.d(), 90, $$2.e());
      dfa $$5 = dfa.a($$3);
      edc.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ebn<?> e() {
      return ebn.e;
   }
}
