import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebe extends dzf {
   public static final Codec<ebe> d = a(ebe::new);

   public ebe(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      return a($$0, dop.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzx $$0, dzf.a $$1) {
      csv $$2 = $$1.h();
      dpo $$3 = $$1.f();
      hx $$4 = new hx($$2.d(), 90, $$2.e());
      ddb $$5 = ddb.a($$3);
      ebd.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dzo<?> e() {
      return dzo.e;
   }
}
