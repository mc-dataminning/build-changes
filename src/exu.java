import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exu implements exy {
   private static final exu b = new exu();
   public static final MapCodec<exu> a = MapCodec.unit(b);

   private exu() {
   }

   @Override
   public exz b() {
      return eya.l;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.j);
   }

   public boolean a(eun $$0) {
      Float $$1 = $$0.c(exj.j);
      if ($$1 != null) {
         azu $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static exy.a c() {
      return () -> b;
   }
}
