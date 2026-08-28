import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elq extends eiw {
   public static final MapCodec<elq> d = a(elq::new);

   public elq(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      return a($$0, dyf.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ejo $$0, eiw.a $$1) {
      $$0.a(new elp($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ejf<?> e() {
      return ejf.o;
   }
}
