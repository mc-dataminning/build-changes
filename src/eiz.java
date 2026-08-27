import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eiz implements ejd {
   private static final eiz b = new eiz();
   public static final Codec<eiz> a = Codec.unit(b);

   private eiz() {
   }

   @Override
   public eje b() {
      return ejf.m;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.j);
   }

   public boolean a(ege $$0) {
      Float $$1 = $$0.c(eip.j);
      if ($$1 != null) {
         auf $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ejd.a c() {
      return () -> b;
   }
}
