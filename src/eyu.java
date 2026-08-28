import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eyu implements eyy {
   private static final eyu b = new eyu();
   public static final MapCodec<eyu> a = MapCodec.unit(b);

   private eyu() {
   }

   @Override
   public eyz b() {
      return eza.l;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.j);
   }

   public boolean a(evp $$0) {
      Float $$1 = $$0.c(eyj.j);
      if ($$1 != null) {
         azg $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eyy.a c() {
      return () -> b;
   }
}
