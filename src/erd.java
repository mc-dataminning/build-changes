import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class erd implements erh {
   private static final erd b = new erd();
   public static final Codec<erd> a = Codec.unit(b);

   private erd() {
   }

   @Override
   public eri b() {
      return erj.m;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.j);
   }

   public boolean a(eoa $$0) {
      Float $$1 = $$0.c(eqt.j);
      if ($$1 != null) {
         ayd $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static erh.a c() {
      return () -> b;
   }
}
