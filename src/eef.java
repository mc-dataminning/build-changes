import com.mojang.serialization.Codec;
import java.util.Optional;

public class eef extends ecg {
   public static final Codec<eef> d = a(eef::new);

   public eef(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return a($$0, drq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ecy $$0, ecg.a $$1) {
      cvl $$2 = $$1.h();
      dsp $$3 = $$1.f();
      ib $$4 = new ib($$2.d(), 90, $$2.e());
      dfr $$5 = dfr.a($$3);
      eee.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ecp<?> e() {
      return ecp.e;
   }
}
