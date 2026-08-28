import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdb implements fcx {
   private static final fdb b = new fdb();
   public static final MapCodec<fdb> a = MapCodec.unit(b);

   private fdb() {
   }

   @Override
   public fcy b() {
      return fcz.g;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.b);
   }

   public boolean a(ezo $$0) {
      return $$0.a(fci.b);
   }

   public static fcx.a c() {
      return () -> b;
   }
}
