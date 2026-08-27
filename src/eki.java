import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eki implements eke {
   private static final eki b = new eki();
   public static final Codec<eki> a = Codec.unit(b);

   private eki() {
   }

   @Override
   public ekf b() {
      return ekg.h;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.b);
   }

   public boolean a(ehf $$0) {
      return $$0.a(ejq.b);
   }

   public static eke.a c() {
      return () -> b;
   }
}
