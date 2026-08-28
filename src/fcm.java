import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fcm implements fci {
   private static final fcm b = new fcm();
   public static final MapCodec<fcm> a = MapCodec.unit(b);

   private fcm() {
   }

   @Override
   public fcj b() {
      return fck.g;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.b);
   }

   public boolean a(eyz $$0) {
      return $$0.a(fbt.b);
   }

   public static fci.a c() {
      return () -> b;
   }
}
