import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejk implements ejo {
   private static final ejk b = new ejk();
   public static final Codec<ejk> a = Codec.unit(b);

   private ejk() {
   }

   @Override
   public ejp b() {
      return ejq.m;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.j);
   }

   public boolean a(egp $$0) {
      Float $$1 = $$0.c(eja.j);
      if ($$1 != null) {
         aup $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ejo.a c() {
      return () -> b;
   }
}
