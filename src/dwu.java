import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwu extends dvi {
   public static final Codec<dwu> d = a(dwu::new);

   public dwu(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return a($$0, dks.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dwa $$0, dvi.a $$1) {
      gw $$2 = new gw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwt.a($$2));
   }

   @Override
   public dvr<?> e() {
      return dvr.a;
   }
}
