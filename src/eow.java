import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eow extends emb {
   public static final MapCodec<eow> d = a(eow::new);

   public eow(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return a($$0, ebj.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(emt $$0, emb.a $$1) {
      $$0.a(new eov($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public emk<?> e() {
      return emk.o;
   }
}
