import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eyv implements eyz {
   private static final eyv b = new eyv();
   public static final MapCodec<eyv> a = MapCodec.unit(b);

   private eyv() {
   }

   @Override
   public eza b() {
      return ezb.l;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.j);
   }

   public boolean a(evq $$0) {
      Float $$1 = $$0.c(eyk.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eyz.a c() {
      return () -> b;
   }
}
