import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejq implements eju {
   private static final ejq b = new ejq();
   public static final Codec<ejq> a = Codec.unit(b);

   private ejq() {
   }

   @Override
   public ejv b() {
      return ejw.m;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.j);
   }

   public boolean a(egv $$0) {
      Float $$1 = $$0.c(ejg.j);
      if ($$1 != null) {
         auu $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eju.a c() {
      return () -> b;
   }
}
