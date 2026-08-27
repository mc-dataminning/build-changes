import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efc implements efg {
   private static final efc b = new efc();
   public static final Codec<efc> a = Codec.unit(b);

   private efc() {
   }

   @Override
   public efh b() {
      return efi.m;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.j);
   }

   public boolean a(ech $$0) {
      Float $$1 = $$0.c(ees.j);
      if ($$1 != null) {
         aru $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efg.a c() {
      return () -> b;
   }
}
