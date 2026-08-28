import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekz extends eif {
   public static final MapCodec<ekz> d = a(ekz::new);

   public ekz(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      return a($$0, dxp.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eix $$0, eif.a $$1) {
      $$0.a(new eky($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eio<?> e() {
      return eio.o;
   }
}
