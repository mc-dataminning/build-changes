import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fbs implements fbw {
   private static final fbs b = new fbs();
   public static final MapCodec<fbs> a = MapCodec.unit(b);

   private fbs() {
   }

   @Override
   public fbx b() {
      return fby.l;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.j);
   }

   public boolean a(eyn $$0) {
      Float $$1 = $$0.c(fbh.j);
      if ($$1 != null) {
         azt $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fbw.a c() {
      return () -> b;
   }
}
