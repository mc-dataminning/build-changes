import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class euq implements euu {
   private static final euq b = new euq();
   public static final Codec<euq> a = Codec.unit(b);

   private euq() {
   }

   @Override
   public euv b() {
      return euw.n;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.j);
   }

   public boolean a(erp $$0) {
      Float $$1 = $$0.c(eug.j);
      if ($$1 != null) {
         ayt $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static euu.a c() {
      return () -> b;
   }
}
