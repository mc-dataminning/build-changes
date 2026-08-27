import com.mojang.serialization.Codec;
import java.util.Optional;

public class ehp extends efq {
   public static final Codec<ehp> d = a(ehp::new);

   public ehp(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      return a($$0, dva.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(egi $$0, efq.a $$1) {
      cyn $$2 = $$1.h();
      dvz $$3 = $$1.f();
      id $$4 = new id($$2.d(), 90, $$2.e());
      dit $$5 = dit.a($$3);
      eho.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public efz<?> e() {
      return efz.e;
   }
}
