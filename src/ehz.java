import com.mojang.serialization.Codec;
import java.util.Optional;

public class ehz extends egg {
   public static final Codec<ehz> d = a(ehz::new);

   public ehz(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      return a($$0, dvq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(egy $$0, egg.a $$1) {
      im $$2 = new im($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ehy.a($$2));
   }

   @Override
   public egp<?> e() {
      return egp.a;
   }
}
