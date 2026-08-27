import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwp extends dvd {
   public static final Codec<dwp> d = a(dwp::new);

   public dwp(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return a($$0, dkn.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dvv $$0, dvd.a $$1) {
      gw $$2 = new gw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwo.a($$2));
   }

   @Override
   public dvm<?> e() {
      return dvm.a;
   }
}
