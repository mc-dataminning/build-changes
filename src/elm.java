import com.mojang.serialization.Codec;
import java.util.Optional;

public class elm extends ejt {
   public static final Codec<elm> d = a(elm::new);

   public elm(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return a($$0, dyu.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ekl $$0, ejt.b $$1) {
      ir $$2 = new ir($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ell.a($$2));
   }

   @Override
   public ekc<?> f() {
      return ekc.a;
   }
}
