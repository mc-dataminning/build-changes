import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqi extends enn {
   public static final MapCodec<eqi> d = a(eqi::new);

   public eqi(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      return a($$0, ect.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eof $$0, enn.a $$1) {
      $$0.a(new eqh($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public enw<?> e() {
      return enw.o;
   }
}
