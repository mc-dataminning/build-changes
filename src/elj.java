import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elj extends ejp {
   public static final MapCodec<elj> d = a(elj::new);

   public elj(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      return a($$0, dyy.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ekh $$0, ejp.a $$1) {
      jd $$2 = new jd($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eli.a($$2));
   }

   @Override
   public ejy<?> e() {
      return ejy.a;
   }
}
