import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fcm implements fcq {
   private static final fcm b = new fcm();
   public static final MapCodec<fcm> a = MapCodec.unit(b);

   private fcm() {
   }

   @Override
   public fcr b() {
      return fcs.l;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.j);
   }

   public boolean a(ezh $$0) {
      Float $$1 = $$0.c(fcb.j);
      if ($$1 != null) {
         azv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fcq.a c() {
      return () -> b;
   }
}
