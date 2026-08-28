import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elg extends ejm {
   public static final MapCodec<elg> d = a(elg::new);

   public elg(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      return a($$0, dyv.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eke $$0, ejm.a $$1) {
      jd $$2 = new jd($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new elf.a($$2));
   }

   @Override
   public ejv<?> e() {
      return ejv.a;
   }
}
