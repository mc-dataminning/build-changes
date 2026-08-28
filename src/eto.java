import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eto implements ets {
   private static final eto b = new eto();
   public static final MapCodec<eto> a = MapCodec.unit(b);

   private eto() {
   }

   @Override
   public ett b() {
      return etu.n;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.j);
   }

   public boolean a(eqi $$0) {
      Float $$1 = $$0.c(ete.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ets.a c() {
      return () -> b;
   }
}
