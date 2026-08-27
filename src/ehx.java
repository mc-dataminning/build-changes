import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ehx implements eib {
   private static final ehx b = new ehx();
   public static final Codec<ehx> a = Codec.unit(b);

   private ehx() {
   }

   @Override
   public eic b() {
      return eid.m;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.j);
   }

   public boolean a(efc $$0) {
      Float $$1 = $$0.c(ehn.j);
      if ($$1 != null) {
         atw $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eib.a c() {
      return () -> b;
   }
}
