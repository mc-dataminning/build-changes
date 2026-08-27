import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class enr implements env {
   private static final enr b = new enr();
   public static final Codec<enr> a = Codec.unit(b);

   private enr() {
   }

   @Override
   public enw b() {
      return enx.m;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.j);
   }

   public boolean a(ekw $$0) {
      Float $$1 = $$0.c(enh.j);
      if ($$1 != null) {
         axd $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static env.a c() {
      return () -> b;
   }
}
