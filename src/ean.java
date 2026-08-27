import com.mojang.serialization.Codec;
import java.util.Optional;

public class ean extends dyo {
   public static final Codec<ean> d = a(ean::new);

   public ean(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      return a($$0, dny.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dzg $$0, dyo.a $$1) {
      csf $$2 = $$1.h();
      dox $$3 = $$1.f();
      hv $$4 = new hv($$2.d(), 90, $$2.e());
      dcl $$5 = dcl.a($$3);
      eam.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dyx<?> e() {
      return dyx.e;
   }
}
