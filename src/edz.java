import com.mojang.serialization.Codec;
import java.util.Optional;

public class edz extends ecg {
   public static final Codec<edz> d = a(edz::new);

   public edz(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return a($$0, drq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ecy $$0, ecg.a $$1) {
      ib $$2 = new ib($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new edy.a($$2));
   }

   @Override
   public ecp<?> e() {
      return ecp.a;
   }
}
