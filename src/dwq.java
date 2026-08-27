import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwq extends duy {
   public static final Codec<dwq> d = a(dwq::new);

   public dwq(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      return a($$0, dki.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dvq $$0, duy.a $$1) {
      cos $$2 = $$1.h();
      dlh $$3 = $$1.f();
      gu $$4 = new gu($$2.d(), 90, $$2.e());
      cyx $$5 = cyx.a($$3);
      dwp.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dvh<?> e() {
      return dvh.e;
   }
}
