import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eka implements eke {
   private static final eka b = new eka();
   public static final Codec<eka> a = Codec.unit(b);

   private eka() {
   }

   @Override
   public ekf b() {
      return ekg.m;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.j);
   }

   public boolean a(ehf $$0) {
      Float $$1 = $$0.c(ejq.j);
      if ($$1 != null) {
         auw $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eke.a c() {
      return () -> b;
   }
}
