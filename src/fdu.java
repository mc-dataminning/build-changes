import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdu implements fdq {
   private static final fdu b = new fdu();
   public static final MapCodec<fdu> a = MapCodec.unit(b);

   private fdu() {
   }

   @Override
   public fdr b() {
      return fds.g;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.b);
   }

   public boolean a(fah $$0) {
      return $$0.a(fdb.b);
   }

   public static fdq.a c() {
      return () -> b;
   }
}
