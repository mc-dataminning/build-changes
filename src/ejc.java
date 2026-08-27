import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ejc extends ehj {
   public static final MapCodec<ejc> d = a(ejc::new);

   public ejc(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      return a($$0, dwt.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eib $$0, ehj.a $$1) {
      io $$2 = new io($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ejb.a($$2));
   }

   @Override
   public ehs<?> e() {
      return ehs.a;
   }
}
