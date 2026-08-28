import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eus implements euw {
   private static final eus b = new eus();
   public static final MapCodec<eus> a = MapCodec.unit(b);

   private eus() {
   }

   @Override
   public eux b() {
      return euy.l;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.j);
   }

   public boolean a(erl $$0) {
      Float $$1 = $$0.c(euh.j);
      if ($$1 != null) {
         ayv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static euw.a c() {
      return () -> b;
   }
}
