import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class egd implements egh {
   private static final egd b = new egd();
   public static final Codec<egd> a = Codec.unit(b);

   private egd() {
   }

   @Override
   public egi b() {
      return egj.m;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.j);
   }

   public boolean a(edi $$0) {
      Float $$1 = $$0.c(eft.j);
      if ($$1 != null) {
         ate $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static egh.a c() {
      return () -> b;
   }
}
