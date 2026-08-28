import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekr extends eix {
   public static final MapCodec<ekr> d = a(ekr::new);

   public ekr(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return a($$0, dyg.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ejp $$0, eix.a $$1) {
      ja $$2 = new ja($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ekq.a($$2));
   }

   @Override
   public ejg<?> e() {
      return ejg.a;
   }
}
