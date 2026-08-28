import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exn implements exr {
   private static final exn b = new exn();
   public static final MapCodec<exn> a = MapCodec.unit(b);

   private exn() {
   }

   @Override
   public exs b() {
      return ext.l;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.j);
   }

   public boolean a(eug $$0) {
      Float $$1 = $$0.c(exc.j);
      if ($$1 != null) {
         azv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static exr.a c() {
      return () -> b;
   }
}
