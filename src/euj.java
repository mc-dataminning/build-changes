import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class euj implements euf {
   private static final euj b = new euj();
   public static final MapCodec<euj> a = MapCodec.unit(b);

   private euj() {
   }

   @Override
   public eug b() {
      return euh.g;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.b);
   }

   public boolean a(equ $$0) {
      return $$0.a(etq.b);
   }

   public static euf.a c() {
      return () -> b;
   }
}
