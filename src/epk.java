import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epk extends enk {
   public static final MapCodec<epk> d = a(epk::new);

   public epk(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return a($$0, ecq.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eoc $$0, enk.a $$1) {
      dfm $$2 = $$1.h();
      edp $$3 = $$1.f();
      ji $$4 = new ji($$2.d(), 90, $$2.e());
      dqc $$5 = dqc.a($$3);
      epj.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ent<?> e() {
      return ent.e;
   }
}
