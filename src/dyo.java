import com.mojang.serialization.Codec;
import java.util.Optional;

public class dyo extends dwv {
   public static final Codec<dyo> d = a(dyo::new);

   public dyo(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return a($$0, dmf.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dxn $$0, dwv.a $$1) {
      ht $$2 = new ht($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dyn.a($$2));
   }

   @Override
   public dxe<?> e() {
      return dxe.a;
   }
}
