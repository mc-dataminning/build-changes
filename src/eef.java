import com.mojang.serialization.Codec;
import java.util.Optional;

public class eef extends ebl {
   public static final Codec<eef> d = a(eef::new);

   public eef(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      return a($$0, dqv.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ecd $$0, ebl.a $$1) {
      $$0.a(new eee($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ebu<?> e() {
      return ebu.o;
   }
}
