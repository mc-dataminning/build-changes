import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ehs implements ehw {
   private static final ehs b = new ehs();
   public static final Codec<ehs> a = Codec.unit(b);

   private ehs() {
   }

   @Override
   public ehx b() {
      return ehy.m;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.j);
   }

   public boolean a(eex $$0) {
      Float $$1 = $$0.c(ehi.j);
      if ($$1 != null) {
         ats $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ehw.a c() {
      return () -> b;
   }
}
