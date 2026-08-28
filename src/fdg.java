import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdg implements fdc {
   private static final fdg b = new fdg();
   public static final MapCodec<fdg> a = MapCodec.unit(b);

   private fdg() {
   }

   @Override
   public fdd b() {
      return fde.g;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.b);
   }

   public boolean a(ezt $$0) {
      return $$0.a(fcn.b);
   }

   public static fdc.a c() {
      return () -> b;
   }
}
