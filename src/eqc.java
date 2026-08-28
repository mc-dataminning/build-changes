import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqc extends eoc {
   public static final MapCodec<eqc> d = a(eqc::new);

   public eqc(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      return a($$0, edi.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eou $$0, eoc.a $$1) {
      dgg $$2 = $$1.h();
      eeh $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      dqu $$5 = dqu.a($$3);
      eqb.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eol<?> e() {
      return eol.e;
   }
}
