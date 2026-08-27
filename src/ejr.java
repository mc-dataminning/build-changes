import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejr implements ejv {
   private static final ejr b = new ejr();
   public static final Codec<ejr> a = Codec.unit(b);

   private ejr() {
   }

   @Override
   public ejw b() {
      return ejx.m;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.j);
   }

   public boolean a(egw $$0) {
      Float $$1 = $$0.c(ejh.j);
      if ($$1 != null) {
         auv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ejv.a c() {
      return () -> b;
   }
}
