import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebn extends dzo {
   public static final Codec<ebn> d = a(ebn::new);

   public ebn(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return a($$0, doy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eag $$0, dzo.a $$1) {
      cte $$2 = $$1.h();
      dpx $$3 = $$1.f();
      hx $$4 = new hx($$2.d(), 90, $$2.e());
      ddk $$5 = ddk.a($$3);
      ebm.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dzx<?> e() {
      return dzx.e;
   }
}
