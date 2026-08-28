import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekj extends eiq {
   public static final MapCodec<ekj> d = a(ekj::new);

   public ekj(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      return a($$0, dxz.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eji $$0, eiq.a $$1) {
      ja $$2 = new ja($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eki.a($$2));
   }

   @Override
   public eiz<?> e() {
      return eiz.a;
   }
}
