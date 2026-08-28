import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ewo implements ews {
   private static final ewo b = new ewo();
   public static final MapCodec<ewo> a = MapCodec.unit(b);

   private ewo() {
   }

   @Override
   public ewt b() {
      return ewu.l;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.j);
   }

   public boolean a(eth $$0) {
      Float $$1 = $$0.c(ewd.j);
      if ($$1 != null) {
         azl $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ews.a c() {
      return () -> b;
   }
}
