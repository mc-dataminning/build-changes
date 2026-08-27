import com.mojang.serialization.Codec;
import java.util.Optional;

public class emn extends ejt {
   public static final Codec<emn> d = a(emn::new);

   public emn(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return a($$0, dyu.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ekl $$0, ejt.b $$1) {
      $$0.a(new emm($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ekc<?> f() {
      return ekc.o;
   }
}
