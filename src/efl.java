import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efl implements efp {
   private static final efl b = new efl();
   public static final Codec<efl> a = Codec.unit(b);

   private efl() {
   }

   @Override
   public efq b() {
      return efr.m;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.j);
   }

   public boolean a(ecq $$0) {
      Float $$1 = $$0.c(efb.j);
      if ($$1 != null) {
         asc $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efp.a c() {
      return () -> b;
   }
}
