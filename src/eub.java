import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eub implements euf {
   private static final eub b = new eub();
   public static final MapCodec<eub> a = MapCodec.unit(b);

   private eub() {
   }

   @Override
   public eug b() {
      return euh.l;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.j);
   }

   public boolean a(equ $$0) {
      Float $$1 = $$0.c(etq.j);
      if ($$1 != null) {
         ayo $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static euf.a c() {
      return () -> b;
   }
}
