import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezv implements ezr {
   private static final ezv b = new ezv();
   public static final MapCodec<ezv> a = MapCodec.unit(b);

   private ezv() {
   }

   @Override
   public ezs b() {
      return ezt.g;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.b);
   }

   public boolean a(ewi $$0) {
      return $$0.a(ezc.b);
   }

   public static ezr.a c() {
      return () -> b;
   }
}
