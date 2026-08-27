import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwl extends duz {
   public static final Codec<dwl> d = a(dwl::new);

   public dwl(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      return a($$0, dkj.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dvr $$0, duz.a $$1) {
      gu $$2 = new gu($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwk.a($$2));
   }

   @Override
   public dvi<?> e() {
      return dvi.a;
   }
}
