import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eje extends ehl {
   public static final MapCodec<eje> d = a(eje::new);

   public eje(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return a($$0, dwv.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eid $$0, ehl.a $$1) {
      io $$2 = new io($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ejd.a($$2));
   }

   @Override
   public ehu<?> e() {
      return ehu.a;
   }
}
