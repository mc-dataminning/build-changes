import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekp extends eiq {
   public static final MapCodec<ekp> d = a(ekp::new);

   public ekp(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      return a($$0, dxz.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eji $$0, eiq.a $$1) {
      dbk $$2 = $$1.h();
      dyy $$3 = $$1.f();
      ja $$4 = new ja($$2.d(), 90, $$2.e());
      dls $$5 = dls.a($$3);
      eko.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eiz<?> e() {
      return eiz.e;
   }
}
