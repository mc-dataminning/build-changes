import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezn implements ezr {
   private static final ezn b = new ezn();
   public static final MapCodec<ezn> a = MapCodec.unit(b);

   private ezn() {
   }

   @Override
   public ezs b() {
      return ezt.l;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.j);
   }

   public boolean a(ewi $$0) {
      Float $$1 = $$0.c(ezc.j);
      if ($$1 != null) {
         bac $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ezr.a c() {
      return () -> b;
   }
}
